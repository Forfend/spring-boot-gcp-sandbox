pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
                echo 'My first pipeline'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Run application') {
            steps {
                sh 'cd /var/lib/jenkins/workspace/FirstPipeline/target && java -jar spring-boot-gcp-sandbox-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}