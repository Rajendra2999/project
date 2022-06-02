node {  
    stage('Pull') { 
        git branch: 'main', credentialsId: 'gitlab-cred', url: 'https://gitlab.com/shubham.kalsait/devops-b10.git' 
    }
    stage('Test') { 
        echo "Test Complete"
    }
}