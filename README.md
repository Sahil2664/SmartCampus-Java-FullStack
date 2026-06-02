# Student Management System - CI/CD Project

**Project Title:** Automated CI/CD Pipeline for Student Management System  
**Registration Number:** 12307  
**Section:** 20M61 – INT332  
**Institution:** Lovely Professional University

## 📋 Overview

This project demonstrates a complete CI/CD pipeline implementation using **Docker + Maven + GitHub Actions** for a Java-based Student Management System. The project showcases automated build, test, containerization, and deployment processes.

## 🛠️ Technologies Used

- **Java 11** - Programming Language
- **Maven 3.9** - Build Automation & Dependency Management
- **Docker** - Containerization Platform
- **GitHub Actions** - CI/CD Automation
- **JUnit 5** - Unit Testing Framework

## 🏗️ Project Structure

```
student-management-system/
├── src/
│   ├── main/
│   │   └── java/com/lpu/devops/
│   │       ├── StudentManagementApp.java
│   │       ├── Student.java
│   │       └── StudentService.java
│   └── test/
│       └── java/com/lpu/devops/
│           └── StudentServiceTest.java
├── .github/
│   └── workflows/
│       └── cicd-pipeline.yml
├── Dockerfile
├── pom.xml
└── README.md
```

## 🚀 Features

### Application Features
- Student registration management
- CGPA calculation
- Section-wise student filtering
- Student search functionality
- Comprehensive unit tests

### CI/CD Features
- Automated build on code push
- Unit test execution
- Docker image creation
- Multi-stage Docker builds
- Artifact storage
- Pipeline status reporting

## 📦 Local Setup

### Prerequisites
- Java 11 or higher
- Maven 3.6+
- Docker Desktop
- Git

### Build and Run Locally

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd student-management-system
   ```

2. **Build with Maven**
   ```bash
   mvn clean package
   ```

3. **Run the application**
   ```bash
   java -jar target/student-management-system-1.0.0.jar
   ```

4. **Run tests**
   ```bash
   mvn test
   ```

## 🐳 Docker Setup

### Build Docker Image
```bash
docker build -t student-management-system:latest .
```

### Run Docker Container
```bash
docker run --name sms-app student-management-system:latest
```

### View Container Logs
```bash
docker logs sms-app
```

## 🔄 CI/CD Pipeline

### Workflow Stages

1. **Build and Test**
   - Checkout code
   - Setup JDK 11
   - Compile source code
   - Run unit tests
   - Package JAR file

2. **Docker Build**
   - Build Docker image
   - Test container execution
   - Save and upload image artifact

3. **Code Quality**
   - Code style verification
   - Maven verify checks

4. **Deployment Summary**
   - Display pipeline status
   - Report build results

### Trigger Points
- Push to main/master branch
- Pull request creation
- Manual workflow dispatch

## 📊 Expected Results

- ✅ Successful Maven build
- ✅ All unit tests passing (6/6 tests)
- ✅ Docker image created successfully
- ✅ Container runs without errors
- ✅ CI/CD pipeline completes successfully

## 🎯 Learning Outcomes

1. Understanding of CI/CD concepts
2. Maven project structure and lifecycle
3. Docker containerization practices
4. GitHub Actions workflow configuration
5. Automated testing integration
6. DevOps best practices

## 👨‍💻 Author

**Registration Number:** 12307  
**Section:** 20M61 - INT332  
**Course:** DevOps and Cloud Computing  
**Institution:** Lovely Professional University

## 📄 License

This project is created for academic purposes as part of CA-2 assessment.

---

**Note:** This project demonstrates automated CI/CD pipeline implementation using industry-standard tools and practices.
