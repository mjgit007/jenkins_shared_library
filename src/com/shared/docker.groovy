#!/usr/bin/env groovy
package com.shared

class docker implements Serializable {

    def script;

    docker(script){
        this.script=script;
    }

    def buildDockerImage(String imageName) {
        script.echo "building the docker image..."
        script.sh "docker build -t $imageName ."
    }

    def dockerLogin(String repo) {
        script.withCredentials([script.usernamePassword(credentialsId: 'dockerrepo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
            script.sh "echo $script.PASS | docker login -u $script.USER --password-stdin $repo"
            script.sh "Image Repository login is successfull ."
        }
    }

    def dockerPush(String imageName) {
        script.sh "docker push $imageName"
    }




}

