def call (String repoUrl){
    pipeline{
        agent any
        tools{
            maven 'maven'
        }
        stages{
            stage("1-Tools initialization"){
                steps{
                    sh 'mvn --version'
                    sh 'java --version'
                }

            }
            stage("2-Checkout code"){
                steps{
                    git branch: 'main',
                    url: "${repoUrl}"
                }

            }
            stage("3-team5-test-shared"){
                steps{
                    echo "let us tesu this module"
                }

            }
            stage("4-to test maven"){
                steps{
                    sh 'mvn -v'
                }
            }
        }
    }
}
