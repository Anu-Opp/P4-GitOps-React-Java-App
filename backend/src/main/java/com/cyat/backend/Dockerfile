FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy your Java files
COPY Main.java .

# Compile Java application
RUN javac Main.java

# Run the application
CMD ["java", "Main"]