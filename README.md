# Codename One Spring Template

This repository serves as a template for a Client-Server mobile application that uses Codename One for the client and Spring for the server.

## Features

* Spring REST MVC Web Service back end.
* Codename One Front End - Deployable to iOS, Android, Javascript, Windows Phone, Windows UWP, J2ME, BlackBerry, and Desktop.
* Shared subproject shared by both client and server projects.
* Pass POJOs back and forth from server to client seamlessly via webservice.
* Integrated Push via simple config file. (Requires Codename One Pro account)
* Automated builds for both Local (development) and Production environments.
* Integrated Social Media integration (requires some configuration).  E.g. Facebook and Google Login.

## Setup

Setup requires the following tools to be installed in your command line environment path:

1. Yeoman
2. Ant
3. Git
 
For the older (manual) setup instructions, see [manual setup](https://github.com/shannah/codenameone-spring-template/wiki/Manual-Setup-Instructions)

Instructions:

Open your command-prompt, and navigate to the directory where you want to create your project.  Then

~~~~
$ yo cn1-spring your-app-name
~~~~

This will create a project in a directory named "your-app-name".

You will be prompted to enter the base package for your app.  Will be used as the base package for mobile project, and will double as your app ID in the Google Play and iTunes stores.  It will also be used in various other parts of your projects for naming things.

~~~~
Steves-iMac:test1 shannah$ yo cn1-spring-app myapp
? Base app package (com.example.myapp) 
~~~~

Once you have entered the base app package, it will generate a ready-to-use project.

## Project Layout

This application consists of 3 projects:

* client - A NetBeans Codename One project with the client app.
* server - A maven Spring project used for the server.
* shared - A Netbeans project where you can store "shared" classes that can be used in both the client and server project.

## Common Tasks

### Working in the Local Development Environment

This project supports buidling and testing in both "local" and "production" environments.  When building for the "local" environment, you will be running the `server` project on a local java web server (like the GlassFish that is bundled with Netbeans), and the client app will communicate with that local server.  When building for the "production" environment, you would be deploying your server project as a .war and hosting on a publicly available server (usually) e.g. on AWS or a production Tomcat or Glassfish installation, and the client apps would be configured to communicate with this server.

#### Starting the Server

* Open the "server" project in Netbeans.
* Press "Run" in the IDE.  You may need to configure Netbeans to set up your development server, but it will walk you through this.  I generally use the GlassFish 4.1 that is bundled with Netbeans.

#### Running the Client in the Simulator

* Open the "client" project in Netbeans.
* Press "Run".  This will open the client in the Codename One simulator.  It should be configured to connect to your local server.

#### Building the Android App

In terminal in the root directory of the your project:

~~~~
$ ant build-local-android
~~~~

This android app will be configured to connect to your local server.

#### Building the iOS App

~~~~
$ant build-local-ios
~~~~

This iOS app will be configured to connect to your local server.





