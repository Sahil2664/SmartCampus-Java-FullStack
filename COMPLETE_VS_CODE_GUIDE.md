# 🚀 COMPLETE VS CODE SETUP AND RUNNING GUIDE
## Student Management System - CI/CD Project
### Registration: 12306548 | Section: 20M61 - INT332

---

## ✅ STEP-BY-STEP SETUP INSTRUCTIONS

### STEP 1: Prerequisites Installation (Do This First!)

#### Windows में:
```
1. Java 11 Download करो:
   - https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html
   - Download करो: jdk-11.0.x_windows-x64_bin.exe
   - Install करो (Next -> Next -> Finish)
   - Path भी add करना (usually automatic होता है)

2. Maven Download करो:
   - https://maven.apache.org/download.cgi
   - Download करो: apache-maven-3.9.x-bin.zip
   - किसी folder में extract करो (C:\Program Files\apache-maven-3.9.x)
   - System Environment Variables में M2_HOME add करो
   - PATH में %M2_HOME%\bin add करो

3. VS Code Download करो:
   - https://code.visualstudio.com/download
   - Install करो

4. Docker Desktop Download करो (Optional - Docker से run करने के लिए):
   - https://www.docker.com/products/docker-desktop
   - Install करो
```

#### Mac में:
```
1. Homebrew से install करो:
   /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"

2. Java 11 install करो:
   brew install openjdk@11
   
   फिर symlink create करो:
   sudo ln -sfn /usr/local/opt/openjdk@11/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-11.jdk

3. Maven install करो:
   brew install maven

4. VS Code install करो:
   brew install --cask visual-studio-code

5. Docker install करो:
   brew install --cask docker
```

#### Linux (Ubuntu) में:
```
1. Terminal खोलो और यह commands चलाओ:

   # Java 11 install करो
   sudo apt update
   sudo apt install openjdk-11-jdk

   # Maven install करो
   sudo apt install maven

   # VS Code install करो
   sudo snap install code --classic

   # Docker install करो
   sudo apt install docker.io
   sudo usermod -aG docker $USER
```

---

### STEP 2: Installation Verify करो

Terminal/Command Prompt खोलो और यह commands चलाओ:

```bash
# Check Java version
java -version
# Output: openjdk version "11.0.x"

# Check Maven version
mvn -version
# Output: Apache Maven 3.9.x

# Check VS Code
code --version
```

अगर सब कुछ installed है तो आगे बढ़ो!

---

### STEP 3: Project को VS Code में Open करो

#### Option A: VS Code से खोलो
```
1. VS Code खोलो
2. File -> Open Folder
3. StudentManagementSystem_Complete folder select करो
4. Trust करो जब पूछे
```

#### Option B: Command Line से खोलो
```bash
cd /path/to/StudentManagementSystem_Complete
code .
```

---

### STEP 4: VS Code Extensions Install करो

```
VS Code खोलो -> Extensions (Ctrl+Shift+X या Cmd+Shift+X)

यह extensions install करो:
1. Extension Pack for Java (Microsoft)
   - Java भाषा support
   
2. Maven for Java (Microsoft)
   - Maven commands run करने के लिए
   
3. Spring Boot Extension Pack (Pivotal)
   - Useful utilities (optional)
   
4. Gradle for Java (Microsoft)
   - Build support (optional)

Install करने के बाद: Restart करो VS Code को
```

---

## 🏃 RUNNING THE PROJECT - 4 DIFFERENT WAYS

### METHOD 1: VS Code Terminal से Maven के साथ (RECOMMENDED)

```bash
# Step 1: Terminal खोलो (Ctrl+` या View -> Terminal)

# Step 2: Project directory में जाओ (automatically हो जाता है usually)

# Step 3: Clean build करो
mvn clean

# Step 4: Compile करो
mvn compile

# Step 5: Tests चलाओ
mvn test

# Output देखो:
# [INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
# [INFO] BUILD SUCCESS

# Step 6: Package बनाओ (JAR बनेगा)
mvn package

# Step 7: Application चलाओ
java -jar target/student-management-system-1.0.0.jar

# Expected Output:
# =================================================
#   Student Management System - CI/CD Project
#   Registration No: 12307 | Section: 20M61
# =================================================
# 
# Adding students to the system...
# 
# Total Students: 5
# Average CGPA: 8.68
# ...
```

---

### METHOD 2: Single Command से Everything (FASTEST)

```bash
# Terminal में यह command चलाओ:
mvn clean package && java -jar target/student-management-system-1.0.0.jar

# यह करेगा:
# 1. Project clean करेगा
# 2. Compile करेगा  
# 3. Tests चलाएगा
# 4. JAR बनाएगा
# 5. Direct चलाएगा
```

---

### METHOD 3: VS Code Run Button से (EASIEST)

```
1. VS Code खोलो
2. StudentManagementApp.java को खोलो
3. File के top-right में "Run" button दिखेगा (Play icon)
4. उस पर click करो
5. Output terminal में दिखेगा
```

---

### METHOD 4: Docker से चलाओ (PROFESSIONAL WAY)

```bash
# Step 1: Terminal खोलो

# Step 2: Docker image बनाओ
docker build -t student-management:latest .

# Step 3: Docker container चलाओ
docker run student-management:latest

# Output आएगा:
# =================================================
#   Student Management System - CI/CD Project
# ...
# =================================================

# अगर container देखना हो:
docker ps -a

# Container logs देखने के लिए:
docker logs container_id
```

---

## 📋 COMMON COMMANDS CHEAT SHEET

### Maven Commands

```bash
# Full build with tests
mvn clean package

# Build without running tests
mvn clean package -DskipTests

# Run only tests
mvn test

# Compile only
mvn compile

# Clean build folder
mvn clean

# Check dependencies
mvn dependency:tree

# Run specific test
mvn test -Dtest=StudentServiceTest

# Run application
java -jar target/student-management-system-1.0.0.jar
```

### Docker Commands

```bash
# Build image
docker build -t student-management:latest .

# Run container
docker run student-management:latest

# List containers
docker ps -a

# Stop container
docker stop container_id

# Remove container
docker rm container_id

# View logs
docker logs container_id

# Remove image
docker rmi student-management:latest
```

### VS Code Shortcuts

```
Ctrl+` or Cmd+`     → Terminal खोलो
Ctrl+Shift+X        → Extensions
Ctrl+P              → File search
Ctrl+F              → Find in file
Ctrl+H              → Find and replace
F5                  → Debug mode
Ctrl+Shift+D        → Debug view
```

---

## 🧪 TESTING GUIDE

### सभी Tests चलाओ:
```bash
mvn test
```

### Output देखो:
```
[INFO] Tests run: 6, Failures: 0, Errors: 0
[INFO] 
[INFO] BUILD SUCCESS
```

### Tests क्या check करती हैं:
```
1. testAddStudent       - Student add होता है या नहीं
2. testFindStudentByRegNo - Search काम करता है या नहीं
3. testCalculateAverageCGPA - Average CGPA सही calculate होता है
4. testGetStudentsBySection - Section filter काम करता है
5. testRemoveStudent    - Student delete होता है या नहीं
6. testEmptyServiceAverageCGPA - Empty list handle होता है
```

---

## 🐛 TROUBLESHOOTING

### Problem 1: "Java not recognized"
```
Solution:
1. Java properly install नहीं हुआ
2. System restart करो
3. फिर से check करो: java -version
4. अगर नहीं चलता तो Java reinstall करो
```

### Problem 2: "Maven not found"
```
Solution:
1. Maven PATH में नहीं है
2. System environment variables check करो
3. M2_HOME और PATH properly set करो
4. System restart करो
```

### Problem 3: "Port already in use" (Docker के लिए)
```
Solution:
docker ps -a (सभी containers देखो)
docker stop container_id (running container बंद करो)
docker rm container_id (container delete करो)
फिर से try करो
```

### Problem 4: Tests fail हो रही हैं
```
Solution:
1. Clean build करो: mvn clean
2. फिर से compile करो: mvn compile
3. Tests run करो: mvn test -X (verbose output)
4. Error message देखो
```

### Problem 5: Build fail हो रहा है
```
Solution:
1. Dependency check करो: mvn dependency:tree
2. Maven update करो: mvn clean install -U
3. pom.xml check करो (syntax गलत तो नहीं)
4. Project clean करो
```

---

## 📊 EXPECTED OUTPUT

अगर सब कुछ सही है तो आपको यह output मिलना चाहिए:

```
=================================================
  Student Management System - CI/CD Project
  Registration No: 12307 | Section: 20M61
=================================================

Adding students to the system...

Student added successfully: Student[Reg: 12307, Name: Arjun Kumar, Section: 20M61, CGPA: 8.50]
Student added successfully: Student[Reg: 12308, Name: Priya Sharma, Section: 20M61, CGPA: 9.20]
Student added successfully: Student[Reg: 12309, Name: Rahul Singh, Section: 20M61, CGPA: 7.80]
Student added successfully: Student[Reg: 12310, Name: Anjali Verma, Section: 20M62, CGPA: 8.90]
Student added successfully: Student[Reg: 12311, Name: Vikram Patel, Section: 20M62, CGPA: 9.00]

-------------------------------------------------
Total Students: 5
Average CGPA: 8.68
-------------------------------------------------

All Students in the System:
  Student[Reg: 12307, Name: Arjun Kumar, Section: 20M61, CGPA: 8.50]
  Student[Reg: 12308, Name: Priya Sharma, Section: 20M61, CGPA: 9.20]
  Student[Reg: 12309, Name: Rahul Singh, Section: 20M61, CGPA: 7.80]
  Student[Reg: 12310, Name: Anjali Verma, Section: 20M62, CGPA: 8.90]
  Student[Reg: 12311, Name: Vikram Patel, Section: 20M62, CGPA: 9.00]

-------------------------------------------------
Searching for student with Reg No: 12307
Found: Student[Reg: 12307, Name: Arjun Kumar, Section: 20M61, CGPA: 8.50]

-------------------------------------------------
Students in Section 20M61:
  Student[Reg: 12307, Name: Arjun Kumar, Section: 20M61, CGPA: 8.50]
  Student[Reg: 12308, Name: Priya Sharma, Section: 20M61, CGPA: 9.20]
  Student[Reg: 12309, Name: Rahul Singh, Section: 20M61, CGPA: 7.80]

=================================================
  Application executed successfully!
  CI/CD Pipeline: Docker + Maven + GitHub Actions
=================================================
```

---

## 📁 PROJECT STRUCTURE

```
StudentManagementSystem_Complete/
│
├── src/
│   ├── main/
│   │   └── java/com/lpu/devops/
│   │       ├── Student.java                 ← Data Model
│   │       ├── StudentService.java          ← Business Logic
│   │       └── StudentManagementApp.java    ← Main Application
│   │
│   └── test/
│       └── java/com/lpu/devops/
│           └── StudentServiceTest.java      ← Unit Tests (6 tests)
│
├── .github/
│   └── workflows/
│       └── cicd-pipeline.yml                ← GitHub Actions Workflow
│
├── pom.xml                                  ← Maven Configuration
├── Dockerfile                               ← Docker Configuration
├── .gitignore                               ← Git Ignore File
├── README.md                                ← Project Documentation
└── target/                                  ← Build Output (after mvn package)
    └── student-management-system-1.0.0.jar ← Executable JAR
```

---

## 🎓 QUICK START (5 MINUTES)

```bash
# 1. Project folder में जाओ
cd StudentManagementSystem_Complete

# 2. Everything एक command से चलाओ
mvn clean package && java -jar target/student-management-system-1.0.0.jar

# Done! Output देखो terminal में
```

---

## ✅ VERIFICATION CHECKLIST

```
☐ Java 11 installed? (java -version)
☐ Maven installed? (mvn -version)
☐ Project folder खुला है VS Code में?
☐ Extensions installed हैं?
☐ Terminal VS Code में खुल सकता है?
☐ Build successful है? (No red errors)
☐ All 6 tests pass हो रहे हैं?
☐ Application output दिख रहा है?
```

अगर सब चेक हो गया तो आप ready हो! 🚀

---

## 📞 NEED HELP?

अगर कुछ काम नहीं कर रहा:
1. Error message properly पढ़ो
2. Google में search करो
3. pom.xml check करो
4. Maven clean करो
5. System restart करो
6. Reinstall करो

**Happy Coding!** 💻
