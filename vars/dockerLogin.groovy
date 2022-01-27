#!/usr/bin/env groovy

import com.shared.docker

def call() {
    return new dockert(this).dockerLogin()
}
