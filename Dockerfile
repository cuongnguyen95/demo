# Sử dụng base image có sẵn Java
FROM eclipse-temurin:17-jdk

# Copy file jar từ target vào container
COPY target/demo-0.0.2.jar app.jar

# Expose cổng ứng dụng
EXPOSE 8084

# Lệnh chạy Spring Boot
ENTRYPOINT ["java", "-jar", "/app.jar"]
