#!/usr/bin/env groovy

import com.example.docker

def call() {
    return new dockert(this).dockerLogin()
}
