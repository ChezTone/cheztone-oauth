# cheztone-oauth [![Build Status](https://travis-ci.org/ChezTone/cheztone-oauth.svg?branch=master)](https://travis-ci.org/ChezTone/cheztone-oauth)

Cheztone OAuth server

# Tooling

this project is build on java and spring 4.
it's build using with maven.
It should run in a servlet 3 ready application server like tomcat 8. 

## Usage

This version of project use in memory token store, and a unique user.
You can use the user : user and it's password : paswword.

You can create a post request to get an access token using :
 POST @ localhost:8080/oauth/token?grant_type=password 
 Header -> Authorization: Basic dXNlcjpwYXNzd29yZA==
