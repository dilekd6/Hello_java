pipeline {
    agent any
    parameters {
        booleanParams(name: 'executeTests', defaultVariable: true, description: '')

    }
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
            When {
                expression {
                    params.executeTests == true
                }
            }
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
