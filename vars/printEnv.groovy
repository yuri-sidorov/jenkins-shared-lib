def call () {
    echo sh(script: 'env|sort', returnStdout: true)
}