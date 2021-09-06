pipeline {
    agent any
    stages {
        stage('init')
        {
            steps{
                script{
                    gv=load "script.groovy"
                }
            }
        }
        stage('Build') {
            steps {      
                gv.buildApp()
            }
        }
        stage('Test'){
            steps{
                gv.testApp()
            }
        }
        stage('Deploy'){
            steps{
                gv.deployApp()
            }
        }
    }
}
