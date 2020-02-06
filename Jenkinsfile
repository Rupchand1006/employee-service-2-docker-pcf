pipeline {
    agent any
    tools {
        maven 'apache-maven-3.6.3'
        jdk 'JAVA_HOME' 
    }
    
    environment {
        CF_API_ENDPOINT = 'https://api.run.pivotal.io'
        CF_CREDENTIALS_USER='rupchand.dewangan@gmail.com'
        CF_CREDENTIALS_PASSWORD='Anandi24$'
        CF_ORG='Empower'
        CF_SPACE='Production'
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
        bat 'cf login -u $CF_CREDENTIALS_USER -p $CF_CREDENTIALS_PASSWORD -a https://api.run.pivotal.io -o $CF_ORG -s $CF_SPACE'
        bat 'cf push'
    	}
	}
        
    }
}