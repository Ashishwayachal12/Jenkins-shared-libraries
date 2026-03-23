pipeline {
    agent any

    stages {

        stage('Clone Project 1') {
            steps {
                dir('project1') {
                    git url: "https://github.com/Ashishwayachal12/Maven_Sample_Project1.git", branch: "master"
                }
            }
        }

        stage('Clone Project 2') {
            steps {
                dir('project2') {
                    git url: "https://github.com/Ashishwayachal12/Maven_Project2.git", branch: "master"
                }
            }
        }

        stage('Build Project 1') {
            steps {
                dir('project1') {
                    sh 'mvn clean install'
                }
            }
        }

        stage('Build Project 2') {
            steps {
                dir('project2') {
                    sh 'mvn clean install'
                }
            }
        }

        stage('Run Jars') {
            steps {
                sh '''
                    cp project1/target/*.jar app1.jar
                    cp project2/target/*.jar app2.jar

                    java -jar app1.jar 
                    java -jar app2.jar 
                '''
            }
        }

        stage('Deploy') {
            steps {
                echo 'Both apps deployed successfully'
            }
        }
    }
}
