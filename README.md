# MyGarden
This project covers the Smoke and Regression test cases of My Garden android app. Page Factory model is used while developing the automation framework.

## Pre-requisites
Below softwares needs to be installed before importing the project from Git: 
- Download Java from [here](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) and set Java_Home in environmental variables. If you are new to java then refer [this](https://www.youtube.com/watch?v=FqpmH8MVO6A&t=5s) link to set the java environment variables
- Download Android STUDIO from [here](https://developer.android.com/studio/index.html) and check Android installation path in Machine
- Set Android_Home Environmental variables path to SDK location and include bin folder paths in PATH variable. Or refer [here](https://www.programsbuzz.com/article/how-set-android-environment-variable-path-windows-10)
- Download Node.js from [here](https://nodejs.org/en/download/)
- Set Node_Home and npm Environmental variables path. Refer [here](https://www.youtube.com/watch?v=hiVKXJ2hAdo)
- Download Appium Server from [here](http://appium.io/downloads.html)
- Download Appium and Selenium Java client library from [here](http://appium.io/downloads.html)
- Install Eclipse using [this](https://www.eclipse.org/downloads/packages/release/helios/sr1/eclipse-ide-java-developers) link.

## Steps to import the project
There are two methods from which a project can be addded to the local machine: 
1. Download the zip file from the git: 
- Download the zip file of a project from the git.
- Open Eclipse and select 'Open projects from file system' option from the File menu.
- Select the project from the downloads folder and click on finish button.

2. Provide url and import the project from the git:
- Click on Clone or Download button from the git and copy the project url.
- Open Eclipse and click on Import option from the File menu.
- Select the Git-> Projects From Git from the popup window and click on Next button.
- Select Clone URI and click on Next button.
- Enter all the mandatory data and Click on Finish button.

## How to run the project?
To run the project successfully follow the steps mentioned below: 
- Connect the actual device to the laptop.
- Make sure that Appium server is up and running.
- Make sure that the capabilities defined in the constant.properties file and the connected device is same. If not add the capabilities based on the connected device.
- Double click on Testng2.xml to run the 'Regression Test Suite' then click on Run button displayed on the menu bar or right click on white space and select 'Run as' option, then select TestNG project.
- Double click on Testng.xml to run the 'Smoke Test Suite' then click on Run button displayed on the menu bar or right click on white space and select 'Run as' option, then select TestNG project.
