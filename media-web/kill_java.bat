@echo off
for /f "tokens=*" %%A in ( 'cd' ) do set pwd=%%A  

@echo Killing Java Process and Removing log files and locks :
taskkill /im java.exe /f >nul 2>&1
ping -n 2 localhost >nul 2>&1
 
:end