#!/usr/bin/env groovy
import pl.sii.jenkins.Rectangle

def call(body) {
    echo "Disable throttling"

    script:this.echo(new Rectangle(1, 3).toString())

    return this
}