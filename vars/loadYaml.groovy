def call() {
    def yaml = libraryResource 'deploy.yaml'
    withEnv(["RESOURCE=" + yaml]) {
        sh('echo loaded: $RESOURCE')
    }
}
