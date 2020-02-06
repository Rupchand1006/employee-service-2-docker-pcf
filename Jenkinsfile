pipeline {
    agent any
    tools {
        maven 'apache-maven-3.6.3'
        jdk 'JAVA_HOME' 
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
        
        stage ('Deploy') {
    	steps{
        bat 'cf login -a https://login.run.pivotal.io/login -u rupchand.dewangan@gmail.com -p Anandi24$'
        bat 'cf t -o Empower -s production'
        bat 'cf push'
    	}
	}
        
    }
}