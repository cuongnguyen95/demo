pipeline {
    agent {
        docker {
            image 'maven:3.9.9-eclipse-temurin-17'   // image có sẵn Maven + Java 17
            args '-v /root/.m2:/root/.m2'           // cache Maven local repo (tùy chọn)
        }
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/cuongnguyen95/demo.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying to server...'
            }
        }
    }
}
