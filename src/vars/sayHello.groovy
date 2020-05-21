def call(String name) {
    withEnv(["NAME=" + name]) {
        sh('echo hello $NAME')
    }
}
