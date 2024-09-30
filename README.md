# Spring Boot Image Uploader Application 

This is a simple Spring Boot application that allows users to upload images to a server. The application uses a RESTful API to handle image uploads, and it stores the images in a file system.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)

## Prerequisites

- Java 11 or later
- Maven 3.6.3 or later
- Spring Boot CLI

## Installation

1. Clone the repository:
    ```
    git clone https://github.com/your-username/image-uploader.git
    ```
2. Navigate to the project directory:
    ```
    cd image-uploader
    ```                         
3. Build the application:
    ```
    mvn clean install

4. Need to  update the AWS credentials in the Kubernetes secret file:
    ```
    nano spring-boot-app-chart/templates/secret.yaml
    ```
   Replace the placeholders for AWS_ACCESS_KEY_ID and AWS_SECRET_ACCESS_KEY with your actual AWS credentials.
   
    ```
5. Run the application:

    ```
    java -jar target/demo-0.0.1-SNAPSHOT.jar

6. Port forward the application to access it locally:
    ```
    kubectl port-forward deployment/my-app 8080:8080
    ```

7. Access the application:
   Open your web browser and navigate to `http://localhost:8080/upload` to access the image upload page.






    
