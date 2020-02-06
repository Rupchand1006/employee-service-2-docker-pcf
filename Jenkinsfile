pipeline {
    agent any
    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'apache-maven-3.6.3') {
                    bat 'mvn clean compile'
                }
            }
        }
        
        stage ('Install Stage') {
            steps {
                withMaven(maven : 'apache-maven-3.6.3') {
                    bat 'mvn install'
                }
            }
        }
    }
}