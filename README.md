# Codename One Spring Template

This repository serves as a template for a Client-Server mobile application that uses Codename One for the client and Spring for the server.

## Setup


1. Check out from GitHub

~~~~
$ git clone https://github.com/shannah/codenameone-spring-template.git
$ cd codenameone-spring-template
~~~~

2. Copy the `config.properties.sample` file to `config.properties`, then edit it with your application details:

At the start the file will look like:

~~~~
base.package.name=com.example
artifact.prefix=com-example-app
base.package.path=com/example
~~~~

Suppose you want your app's package namespace to be under `com.yourdomain` instead of `com.example`.  Then you would change it to:

~~~~
base.package.name=com.yourdomain
artifact.prefix=com-yourdomain-app
base.package.path=com/yourdomain
~~~~

3. Now run the `setup` task.


~~~~
$ ant setup
~~~~

This will change all of the default files in the template to use your custom base names.

4. Install the shared dependencies into the client and server projects.

~~~~
$ ant install-shared
~~~~

## Project Layout

This application consists of 3 projects:

* client - A NetBeans Codename One project with the client app.
* server - A maven Spring project used for the server.
* shared - A Netbeans project where you can store "shared" classes that can be used in both the client and server project.




