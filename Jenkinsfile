pipeline {
    agent any

    stages {
        stage('Clean Code') {
            steps {
              //  sh "/usr/local/opt/maven/bin/mvn clean"
              sh "mvn clean"
            }
        }

        stage('Compile Code') {
            steps {
               // sh "/usr/local/opt/maven/bin/mvn compile"
                sh "mvn compile"
            }
        }

        stage('Test Code') {
            steps {
               // sh ''' /usr/local/opt/maven/bin/mvn test'''
                 sh "mvn test"
            }
        }
    }
}
