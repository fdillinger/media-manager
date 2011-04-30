@echo off
for /f "tokens=*" %%A in ( 'cd' ) do set pwd=%%A  

@echo Killing Java Process and Removing log files and locks :
taskkill /im java.exe /f >nul 2>&1
ping -n 2 localhost >nul 2>&1
 
if exist C:\dev\java\workspace\default-3.3sts\media\media-web goto changeDir
rem else check if the current folder is called 'media-web'
goto checkForWebapp
goto done

:changeDir
echo going to the default project webapp directory
cd C:\dev\java\workspace\default-3.3sts\media\media-web
goto deleteFiles

:checkForWebapp
echo checking if the current folder is called 'media-web' :
@echo %pwd% | find "media-web" >nul 2>&1
if errorlevel 1 goto :not-found

	:found
	echo the current folder is the 'media-web' folder
	goto deleteFiles
	goto done
	
	:not-found
	echo !!! not a webapp folder, nothing will be deleted !!!
	goto end

:deleteFiles
echo deleting lock and log files
del /F/Q *.log* *.lck* *.out tm.out* *.epoch media-web.webapp.log.* >nul 2>&1
goto done

:done
echo Done.
goto end

:end