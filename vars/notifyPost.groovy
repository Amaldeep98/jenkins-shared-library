def call() {
    post {
        success {
            echo "✅ Pipeline Success"
            echo "Job: ${env.JOB_NAME}"
            echo "Build Number: ${env.BUILD_NUMBER}"
            echo "URL: ${env.BUILD_URL}"
        }
        failure {
            echo "❌ Pipeline Failed"
            echo "Job: ${env.JOB_NAME}"
            echo "URL: ${env.BUILD_URL}"
        }
        aborted {
            echo "🚫 Pipeline Aborted"
            echo "Job: ${env.JOB_NAME}"
            echo "URL: ${env.BUILD_URL}"
        }
    }
}
