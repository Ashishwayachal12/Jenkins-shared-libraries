pipeline {
    agent any

    stages {

        stage('Clone Repos') {
            steps {
                sh '''
                    rm -rf project1 project2
                    git clone https://github.com/Ashishwayachal12/Maven_Sample_Project1.git project1
                    git clone https://github.com/Ashishwayachal12/Maven_Project2.git project2
                '''
            }
        }

        stage('Build Project 1') {
            steps {
                sh '''
                    cd project1
                    mvn clean install
                '''
            }
        }

        stage('Build Project 2') {
            steps {
                sh '''
                    cd project2
                    mvn clean install
                '''
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
