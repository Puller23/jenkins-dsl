pipelineJob('demo-git03') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('Puller23/jenkins-dsl.git')
                    }
                }
            }
            scriptPath('pipelines/pipeline01.groovy')
        }
    }
}
