from datetime import datetime
from os import system,path
from platform import platform
import platform
from sys import argv
import configparser

from colorama import Fore, Back, Style

platform = platform.system()
if path.exists("config.mayacoreproj"):
    config = configparser.ConfigParser()
    config.read("config.mayacoreproj")
    PROJNAME = config['Maya-Core-Project']['PROJECT_NAME']
    MAIN_FILE = config['Maya-Core-Project']['MAIN_CLASS']
    ENGINE_DIR = config['Maya-Core-Project']['ENGINE_DIR']
    OUTPUT = f"{config['Maya-Core-Project']['PROJECT_NAME']}-{datetime.today().strftime('%Y%m%d')}"
    BIN_DIR = config['Maya-Core-Project']['BIN_DIR']
    ASSETS_DIR = config['Maya-Core-Project']['ASSETS_DIR']

    JAVA_PATH = config['Java-Settings']['JAVA_PATH']
    RUNTIME_ARGS = config['Java-Settings']['RUNTIME_ARGS']
    COMPILE_TIME_ARGS = config['Java-Settings']['COMPILE_TIME_ARGS']

def info():
    print(f"{Fore.CYAN}  ------[MayaCore Project Utility]------\n{Style.RESET_ALL}")
    print(f"{Fore.CYAN}\n  Version 2.0")
    print(f"{Fore.CYAN}\n  Made with {Fore.RED}<3{Fore.CYAN} by Sepano Darbandi *https://www.github.com/Sepandi*{Style.RESET_ALL}\n\n  use : \n  {Fore.CYAN}  mayacore run  ==> to debug run\n{Style.RESET_ALL}  or\n {Fore.CYAN}   mayacore publish  ==> to get a jar file \n{Style.RESET_ALL}  or\n {Fore.CYAN}   mayacore export  ==> to get platform specific extecutble \n")

def clean():
    system("rm -f *.class")
    system("rm -f Game/*.class")
    system(f"rm -f {ENGINE_DIR}/*.class")


def clear():
    system("cls")
    system("clear")

def run():
    print(f"{Fore.CYAN}  ------[MayaCore Project Debug Build]------{Style.RESET_ALL}")
    if system(f"{JAVA_PATH}c {COMPILE_TIME_ARGS} {MAIN_FILE}.java") == 0:
        system(f"{JAVA_PATH} {RUNTIME_ARGS} {MAIN_FILE}")
        print(f"\n\n  {Back.GREEN}  {Style.RESET_ALL}{Fore.GREEN} DONE")
    else:
        print(f"\n\n  {Back.RED}  {Style.RESET_ALL}{Fore.LIGHTRED_EX} ERROR")
    clean() 


def publish():
    if system(f"{JAVA_PATH}c {COMPILE_TIME_ARGS} {ENGINE_DIR}/*.java Game/*.java {MAIN_FILE}.java") == 0:
        if system(f"jar -cfe {BIN_DIR}/{OUTPUT}.jar {MAIN_FILE} {ENGINE_DIR}/*.class {ENGINE_DIR}/CoreAssets/* Game/*.class {MAIN_FILE}.class {ASSETS_DIR}") == 0:
            clear()
        else:
            print(f"\n\n  {Back.RED}  {Style.RESET_ALL}{Fore.LIGHTRED_EX} ERROR")
    else:
        print(f"\n\n  {Back.RED}  {Style.RESET_ALL}{Fore.LIGHTRED_EX} ERROR")
    clean()
    
    print(f"{Fore.CYAN}  ------[MayaCore Project Build]------\n{Style.RESET_ALL}")
    print(f"  {Back.GREEN}  {Style.RESET_ALL}{Fore.GREEN} Build Finished ==> {BIN_DIR}/{OUTPUT}.jar{Style.RESET_ALL}")
    system(f"{JAVA_PATH} -jar {BIN_DIR}/{OUTPUT}.jar")


if path.exists("config.mayacoreproj"):


    if len(argv) > 1:
        if argv[1] == "export":
            if system(f"{JAVA_PATH}c {COMPILE_TIME_ARGS} {ENGINE_DIR}/*.java Game/*.java {MAIN_FILE}.java") == 0:
                if system(f"jar -cfe {BIN_DIR}/{platform}/{MAIN_FILE}.jar {MAIN_FILE} {ENGINE_DIR}/*.class {ENGINE_DIR}/CoreAssets/* Game/*.class {MAIN_FILE}.class {ASSETS_DIR}") == 0:
                    clear()
                else:
                    print(f"\n\n  {Back.RED}  {Style.RESET_ALL}{Fore.LIGHTRED_EX} ERROR")
            else:
                print(f"\n\n  {Back.RED}  {Style.RESET_ALL}{Fore.LIGHTRED_EX} ERROR")
            clean()
            system(f"jpackage -d {BIN_DIR}/{platform} --name {MAIN_FILE} --input {BIN_DIR}/{platform} --main-jar {MAIN_FILE}.jar")
            print(f"{Fore.CYAN}  ------[MayaCore Project Platform Specific Exporter]------\n{Style.RESET_ALL}")
            print(f"  {Back.GREEN}  {Style.RESET_ALL}{Fore.GREEN} Build Finished ==> {BIN_DIR}/{platform}/{Style.RESET_ALL}")


        if argv[1] == "run":
            run()

        if argv[1] == "clean":
            clean()



        if argv[1] == "publish":
            publish()
    else:
        info()
else:
    if len(argv) == 1:
        info()
    print(f"{Fore.RED}  No MayaCore Project 'config.mayacoreproj' File Found")
