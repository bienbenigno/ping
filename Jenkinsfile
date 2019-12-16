ipeline {
	environment {
		registry = "https://jaycobb-registry:5000"
		imageName = "jaycobb-registry:5000/ping"
		registryCredential = "jaycobb-registry"
		image = ""
	}
	agent none
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