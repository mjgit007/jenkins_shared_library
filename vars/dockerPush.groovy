#!/usr/bin/env groovy

import com.example.docker

def call(String imageName) {
    return new docker(this).dockerPush(imageName)
}
