job('NodeJS example 1') {
    scm {
        git('https://github.com/Salman-Jawad91/test-repo.git') { node ->
            node / gitConfigName('salman-jawad91')
            node / gitConfigEmail('salman-jawad91@hotmail.com')
        }
    }

    triggers {
        scm('H\5 * * * *')
    }

    wrappers {
        nodejs('nodejs')
    }

    steps {
        shell('npm install')
    }

}    
