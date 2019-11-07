@echo off
"c:\j2sdk1.4.0_01\bin\javac" %1.java
if %errorlevel% equ 0 "c:\j2sdk1.4.0_01\bin\java" %1
