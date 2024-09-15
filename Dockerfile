# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jdk-slim
 
# Set the working directory in the container
WORKDIR /app
 
# Copy the JAR file from the target directory into the container
COPY target/spring-boot-docker.jar app.jar
 
# Expose port 5055
EXPOSE 5055
 
# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
