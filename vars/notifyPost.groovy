// jenkins-shared-library/vars/notifyPost.groovy
def call() {
    if (currentBuild.currentResult == 'SUCCESS') {
        echo "✅ Pipeline Success"
        echo "Job: ${env.JOB_NAME}"
        echo "Build Number: ${env.BUILD_NUMBER}"
        echo "URL: ${env.BUILD_URL}"
    } else if (currentBuild.currentResult == 'FAILURE') {
        echo "❌ Pipeline Failed"
        echo "Job: ${env.JOB_NAME}"
        echo "URL: ${env.BUILD_URL}"
    } else if (currentBuild.currentResult == 'ABORTED') {
        echo "🚫 Pipeline Aborted"
        echo "Job: ${env.JOB_NAME}"
        echo "URL: ${env.BUILD_URL}"
    } else {
        echo "ℹ️ Pipeline finished with status: ${currentBuild.currentResult}"
    }
}
