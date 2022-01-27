#!/usr/bin/env groovy

import com.shared.docker

def call() {
    return new docker(this).dockerLogin()
}
