# Multi-stage Dockerfile for Student Management System
# Stage 1: Build stage using Maven
FROM maven:3.9-eclipse-temurin-11 AS build

# Set working directory
WORKDIR /app

# Copy pom.xml and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy source code
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Stage 2: Runtime stage
FROM eclipse-temurin:11-jre-alpine

# Set working directory
WORKDIR /app

# Copy the built JAR from build stage
COPY --from=build /app/target/*.jar app.jar

# Add metadata labels
LABEL maintainer="Registration 12307"
LABEL description="Student Management System - CI/CD Project"
LABEL version="1.0.0"

# Create non-root user for security
RUN addgroup -S appgroup && adduser -S appuser -G appgroup
USER appuser

# Expose port (if needed for future web service)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
