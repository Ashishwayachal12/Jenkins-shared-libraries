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
	                git url: "https://github.com/Ashishwayachal12/Maven_Sample_Project1.git", branch: "master"
					// git url: "https://github.com/Ashishwayachal12/Maven_Project2.git", branch: "master"
					echo "Code cloning successful"
	            }
	        }
	
	        stage('Maven Build') {
	            steps {
	                sh 'mvn clean install'
					
	            }
	        }
	
	        stage('Run Jar') {
	            steps {
	               sh ''' 
                    mv target/*.jar app.jar
                     java -jar app.jar'''
	            }
	        }
	
	        stage('Deploy') {
	            steps {
	                echo 'Deployed the code...........'
	            }
	        }
	    }
	}
