#!/usr/bin/env groovy

import com.shared.docker

def call(String repo) {
    return new docker(this).dockerLogin( repo)
}
