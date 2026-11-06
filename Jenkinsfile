pipeline {
    agent any

    tools {
        jdk 'JDK21'
        maven 'MavenSystem'
    }

    triggers {
        pollSCM('H/2 * * * *')
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn -B clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn -B test'
            }
            post {
                always {
                    junit 'target/surefire-reports/TEST-*.xml'
                }
            }
        }

        stage('Run') {
            steps {
                sh 'java -cp target/classes vn.cmc.App'
            }
        }
    }
}
