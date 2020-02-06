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
            steps {

                withCredentials([[$class          : 'UsernamePasswordMultiBinding',
                                  credentialsId   : '506f63ea-9d4b-4920-b9b4-c8c66f95967d',
                                  ]]) {

                    bat 'cf login -a http://api.run.pivotal.io -u rupchand.dewangan@gmail.com -p Anandi24$'
                    bat 'cf push'
                }
            }

        }  
        
    }
}