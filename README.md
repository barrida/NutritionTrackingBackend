# Nutrition Tracking Application  - Backend
This repository is created for a simple nutrition tracking application to practice Angular2, Docker, AWS, and Java 8.

# Run

1.	mvn package && java -jar target/demo-0.0.1-SNAPSHOT.jar

# Docker

1.	Open Docker Quickstart Terminal
2.	Go to project root directory (e.g.: cd /c/_Continious Development/Personal Projects/NutirionTrackingApp/NutritionTrackingBackend)
3.	mvn package docker:build - do not use port 8080 otherwise you will get errors like [ERROR] No plugin found for prefix 'docker' in the current project and in the plugin groups [org.apache.maven.plugins, org.codehaus.mojo]...

# Docker commands

**Stop all docker containers**
	docker stop $(docker ps -a -q)

**Remove all docker containers**
	docker rm $(docker ps -a -q)

**Remove all docker images**
	docker rmi $(docker images -q)

**Port bindings of a specific container**
	docker inspect [container-id]

# Notes for trouble shooting

### Set environment properties for Docker ###

	set USERPROFILE = C:\Users\xxx
	
	set DOCKER_CERT_PATH=%USERPROFILE%\.docker\machine\machines\default
	
	set DOCKER_HOST=tcp://192.168.99.100
	
	set DOCKER_MACHINE_NAME=default
	
	set DOCKER_TLS_VERIFY=1
 	
# TODO
How to write efficient docker file, using Docker layers... : http://bitjudo.com/blog/2014/03/13/building-efficient-dockerfiles-node-dot-js/

# Git Commands
Switch to a new branch 'master'
	git checkout -b origin 
Switched to an existing branch 'master'
	git checkout master
Add missing remote 
	git remote add master https://github.com/barrida/Angular2Webpack.git
