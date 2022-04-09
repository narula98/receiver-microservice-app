# Transaction Object Decryption application
This is an sample application that receives an sample HTTP Post request and decrypts it. Once encryption is done the decrypted transaction object is added to h2 database.


## Heroku Deployment link:
https://sender-microservice-app.herokuapp.com/transactions/sender

## Basic Features
* Receive an transaction object as post request.
* Decrypts the transaction object using sha-1 algorithm
* Adds the decrypted object to database.

## To get the response from deployment:
*  Open post man or any other platform
*  In url add the deployment link(https://sender-microservice-app.herokuapp.com/transactions/sender) and add as a post request
*  Send any transaction object in request body 
    Ex: {
     "accountNumber": "12345687",
	 "type": "credit",
	 "amount": "1222",
	 "currency": "INR",
	 "accountFrom": "1234343"
    }


## Running the application on local
* You should have java 11 or jdk 1.8 installed on your machine along with spring tool suite or similar ide prior to cloning the repository.
* Clone the git repo in your local machine.
* Import the project from file system in your ide.
* Let the project build.
* After the build is completed right click on project and select run as spring boot application.
* **Follow the above steps for both the microservices(receiver and sender)**

## Proof of concept
Visit the given link to see the images: https://narula98.imgur.com/all/?third_party=1
