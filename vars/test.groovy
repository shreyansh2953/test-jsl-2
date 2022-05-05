#!/usr/bin/groovy

import trackfone.devops.*

def call()
{
    node{
        stage("test")
        {
            def obj = new Build()
            obj.buildNow()
        }
    }
}