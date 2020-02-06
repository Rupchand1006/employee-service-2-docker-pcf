pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                
                  sh "${mvnHome}/bin mvn clean install -f employee-service/pom.xml"
                
                
            }
        }
        stage('Deploy') {
            steps {
                
            }
        }
    }
}