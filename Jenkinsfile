pipeline{
  agent any
  stages{
     stage('Test API'){
          steps{
            git credentialsId: 'github_login', url: 'https://github.com/hildo18/AutomacaoAPI'
            bat 'mvn test'
          }
     }
  }
}