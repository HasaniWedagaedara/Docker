pipeline {
  agent any

  stages {
    stage('stage 1') {
      steps{
        echo 'stage-1-completed'
      }
    }

    stage('stage 2') {
      steps{
        echo 'stage-2-completed'
      }
    }

    stage('stage 2') {
      steps{
        echo 'stage-2-completed'
      }
    }
    
  }

  
}
