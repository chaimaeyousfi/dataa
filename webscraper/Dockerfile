# Use a base image with JDK 22 (adjust based on your Java version)
FROM openjdk:22-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the built JAR file into the container
COPY target/webscraper-1.0-SNAPSHOT.jar /app/webscraper.jar

# Expose the port the application runs on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/webscraper.jar"]
