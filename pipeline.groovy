pipeline {
    agent any

    stages {
        stage('Addition') {
            steps {
                script {
                    int a = 5
                    int b = 7
                    int sum = a + b
                    echo "The sum of ${a} and ${b} is ${sum}"
                }
            }
        }
    }
}
