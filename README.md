Author: DiepTV

Date: 23/12/2021

Project: [IUSR] Android app: Input URL and send GET request to this URL

Version: IUSR v1

================================================

==Start task==
Feature:
	1. Input URL
	2. Press "SEND GET REQUEST" to send a simple GET request to URL that user input
	3. After press button, app will process to send GET request
	4. Waiting response from host and display responsed data to view - below button "SEND GET REQUEST"

Library:
	In this project, I use Volley library to setup request. Because it's very easy to setup a simpler GET/POST request.
	I tried to use Retrofit library for that work, but I encountered some difficulties during the setup and the command is quite long to send a simple GET request.
