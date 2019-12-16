pipeline {
	environment {
		registry = "https://jaycobb-registry:5000"
		imageName = "jaycobb-registry:5000/ping"
		registryCredential = "jaycobb-registry"
		image = ""
	}
	agent any
	tools {
        maven 'apache-maven-3.0.1'
    }
	stages {
		stage('Test') {
			steps {
				sh 'mvn clean test'
			}
		}
		stage('Package Jar') {
            steps {
                sh 'mvn package -DskipTests'
            }
        }
		stage('Build image') {
			steps {
				script {
					image = docker.build(imageName)
				}
			}
		}
		stage('Push image') {
			steps {
				script {
					docker.withRegistry(registry, registryCredential) {
						image.push()
					}
				}
			}
		}
	}
}