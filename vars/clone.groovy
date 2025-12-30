def call(String url, String branch){
  echo "Cloning the code..."
  git url:"${url}", branch:"${branch}"
  sh "ls -l ${COMPOSE_FILE} || echo '⚠ Compose file missing!'"
}
