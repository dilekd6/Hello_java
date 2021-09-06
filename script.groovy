def buildApp{
    echo 'Building'
    git credentialsId: '4a643c50-6c85-4959-83ea-85577ed78a80', url: 'https://github.com/dilekd6/Hello_java.git'
    bat '''javac Hello.java
               java Hello'''
}
def testApp{
    echo 'testing'
}
def deployApp{
    echo 'doploying '
}
return this