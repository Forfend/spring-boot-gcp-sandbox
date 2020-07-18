pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
                echo 'My first pipeline'
            }
        }
    }
}