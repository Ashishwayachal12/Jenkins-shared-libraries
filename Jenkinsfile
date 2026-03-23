pipeline {
    agent any

    stages {

        stage('Clone Repos project 1') {
            steps {
                    git url: "https://github.com/Ashishwayachal12/Maven_Sample_Project1.git", branch: "master"
            }
        }
         stage('Clone Repos project 2') {
            steps {
                    git url: "https://github.com/Ashishwayachal12/Maven_Project2.git", branch: "master"
            }
        }

        stage('Build Projects-1') {
            steps {
               
                    sh 'mvn clean install'               
            }
        }
          stage('Build Projects-2') {
            steps {
                    sh 'mvn clean install'               
            }
        }

       stage('Run Jars') {
            steps {
                sh '''
                    mv project1/target/*.jar app1.jar
                    mv project2/target/*.jar app2.jar

                    java -jar app1.jar &
                    java -jar app2.jar &
                '''
            }
        }

        stage('Deploy') {
            steps {
                echo 'Both apps deployed'
            }
        }
    }
}
