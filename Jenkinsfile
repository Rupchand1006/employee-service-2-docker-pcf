pipeline {
    agent any
    tools {
        maven 'apache-maven-3.6.3'
        java 'JAVA_HOME' 
    }
    stages {
        stage ('Compile Stage') {

            steps {
                 bat 'mvn clean compile'
            }
        }
        
        stage ('Install Stage') {
            steps {
             	bat 'mvn install'
            }
        }
    }
}