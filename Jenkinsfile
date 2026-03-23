pipeline {
    agent any

    stages {

        stage('Clone Repos') {
            steps {
                dir('project1') {
                    git url: "https://github.com/Ashishwayachal12/Maven_Sample_Project1.git", branch: "master"
                }
                dir('project2') {
                    git url: "https://github.com/Ashishwayachal12/Maven_Project2.git", branch: "master"
                }
            }
        }

        stage('Build Projects') {
            steps {
                dir('project1') {
                    sh 'mvn clean install'
                }
                dir('project2') {
                    sh 'mvn clean install'
                }
            }
        }

        stage('Run Jars') {
            steps {
                dir('project1') {
                    sh '''
                        mv target/*.jar app1.jar
                        java -jar app1.jar &
                    '''
                }
                dir('project2') {
                    sh '''
                        mv target/*.jar app2.jar
                        java -jar app2.jar &
                    '''
                }
            }
        }

        stage('Deploy') {
            steps {
                echo 'Both apps deployed'
            }
        }
    }
}
