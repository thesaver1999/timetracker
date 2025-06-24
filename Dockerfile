# Use a base image with Java 17
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built jar file (update the jar name if needed)
COPY target/timetracker-1.0-SNAPSHOT.jar app.jar

# Expose the port the app runs on
EXPOSE 8080

# Command to run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
