def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'dockerHubcred', passwordVariable: 'DOCKER_PASS', usernameVariable: 'DOCKER_USER')]) {
      sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
