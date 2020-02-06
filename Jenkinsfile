pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                withMaven(maven: 3.6.3) {
                  sh 'mvn clean install'
                }
                
            }
        }
        stage('Deploy') {
            steps {
                
            }
        }
    }
}