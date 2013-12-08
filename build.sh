#!/bin/bash

lein compile
pushd ~/opt/robocode/robots
rm *bot*.class
ln -s $OLDPWD/target/classes/*.class .
popd
