pipeline {
	    agent any
	
	    stages {
	
	        stage('Hello') {
	            steps {
	                echo 'Hello Buddy!'
	            }
	        }
	
	        stage('Git clone') {
	            steps {
	                git url: "https://github.com/Ashishwayachal12/Maven_Project2.git", branch: "master"
	                echo "Code cloning successful"
	            }
	        }
	
	        stage('Maven Build') {
	            steps {
	                sh 'mvn clean install'
					// sh  'mvn package -DskipTests'
	            }
	        }
	
	        stage('Run Jar') {
	            steps {
	                sh 'java -jar target/MavenProject-v4.1.jar'
	            }
	        }
	
	        stage('Deploy') {
	            steps {
	                echo 'Deployed the code...........'
	            }
	        }
	    }
	}
