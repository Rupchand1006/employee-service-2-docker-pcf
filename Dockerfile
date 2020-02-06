# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="rup.dewangan1006@gmail.com"

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
ARG JAR_FILE=target/employee-service-1.0.0-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} employee-service.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","/employee-service.jar"]