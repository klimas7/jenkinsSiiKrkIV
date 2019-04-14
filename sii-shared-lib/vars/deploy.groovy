#!/usr/bin/env groovy
import pl.sii.jenkins.Deployer

def call(body) {
    echo "Start Deploy"

    new Deployer(script:this).run()

    echo "Deployed"
    currentBuild.result = 'SUCCESS' //FAILURE to fail

    return this
}