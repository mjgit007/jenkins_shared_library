#!/usr/bin/env groovy

import com.shared.docker

def call(String imageName) {
    return new docker(this).buildDockerImage(imageName)
}
