# Use an official OpenJDK runtime for Java 17 as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file from target folder into the container
COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo.jar

# Expose the application's port
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/demo.jar"]
