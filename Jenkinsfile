pipeline {
    agent any
    tools {
        maven 'maven'
        jdk 'JDK17'
    }
    environment {
        DOCKERHUB_CREDENTIALS = credentials('emmanuelcruz-docker-registry')
        DOCKER_IMAGE = 'emmanuelcruz/facturas-service:v3.1'
    }
    stages {
        stage('Initialize') {
            steps {
                sh '''
                echo "PATH = ${PATH}"
                echo "JAVA_HOME = ${JAVA_HOME}"
                echo "M2_HOME = ${M2_HOME}"
                java -version
                echo "** starting notificaciones compilation"
                mvn clean package
                echo "** end notificaciones compilation"
                '''
            }
        }
        stage('Build') {
            steps {
                sh 'sudo docker build -t ${DOCKER_IMAGE} .'
            }
        }
        stage('Login & Push') {
            steps {
                sh '''
                echo $DOCKERHUB_CREDENTIALS_PSW | sudo docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin docker.io
                sudo docker push ${DOCKER_IMAGE}
            '''
            }
        }
    }
}
