# Sii Shared Library Sample

Setup

1. Manage Jenkins → Configure System. Under Global Pipeline Libraries, add a library with the following settings:
  * Library name: sii-shared-lib
  * Default version: master
  * Retrieval method: Modern SCM
  * Select the Git type
  * Project repository: ssh://git@repository_host/sii-shared-lib.git
  * Credentials: (leave blank)


2. Then create a Jenkins job with the following pipeline (note that the underscore _ is not a typo):

```
@Library('sii-shared-lib')_

stage('Print Build Info') {
    printBuildinfo {
        name = "Sample Name"
    }
} stage('Disable throttling') {
    disableThrottling()
} stage('Deploy') {
    deploy()
} stage('Enable throtling') {
    enableThrottling()
} stage('Check Status') {
    checkStatus()
}
```

Run job!