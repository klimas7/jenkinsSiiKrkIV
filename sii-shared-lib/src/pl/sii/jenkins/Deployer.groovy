package pl.sii.jenkins

@Grab(group = 'org.apache.commons', module = 'commons-lang3', version = '3.6')
import org.apache.commons.lang3.StringUtils

class Deployer {
    int counts = 0
    Script script

    def run() {
        while (counts < 10) {
            Thread.sleep(1000)
            counts++
            script.echo("counts is numeric: " + StringUtils.isAlphanumeric("" + counts) + " : " + counts)
        }
    }
}