pipeline{
    agent any
    stages {
        stage('Build') {
            steps{
                sh "echo hello world"
                sh "pwd"

            }
        }
        stage("Test") {
            steps{
                sh "ls -l"
            }
        }
        stage("Deploy"){
            steps{
             sh "echo hello world"
            }
        }
    }
}