# 1️⃣ Base image
FROM eclipse-temurin:17-jdk

# 2️⃣ Set working directory inside container
WORKDIR /app

# 3️⃣ Copy JAR file from target folder
COPY target/*.jar app.jar

# 4️⃣ Run the JAR file
ENTRYPOINT ["java","-jar","app.jar"]

# 5️⃣ Expose port
EXPOSE 8080
