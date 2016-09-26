# cheztone-oauth [![Build Status](https://travis-ci.org/ChezTone/cheztone-oauth.svg?branch=master)](https://travis-ci.org/ChezTone/cheztone-oauth)

Simple OAuth server

This first version is a simple OAuth server configuration that using an inMemoryTokenStore and a fixed user repository.
As soon as possible, this project will be updated to use other data sources. As I have a good feeling with mongoDB, I think it will be the first implementation that I will allow to use.

## Stack

This project is build on java 8 with. it's build using [Maven®](https://maven.apache.org/).
It should run in a servlet 3 ready application server like [Tomcat 8](https://tomcat.apache.org/). 
Here were are using [Spring®](https://projects.spring.io/spring-framework/) Java Based configuration.

## How it works

This version of project use in memory token store, and a unique user.
You can use the user : user and it's password : paswword.

You can create a post request to get an access token using :
 POST @ localhost:8080/oauth/token?grant_type=password 
 Header -> Authorization: Basic dXNlcjpwYXNzd29yZA==
