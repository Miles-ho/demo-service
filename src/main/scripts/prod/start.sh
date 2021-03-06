#!/bin/sh
#变量设置
SERVICE_NAME=demo-service
PROJECT_DIR=$(cd "$(dirname "$0")"; pwd)
PROJECT_DIR=$PROJECT_DIR/..
CONFIG_DIR=$PROJECT_DIR/config
LIB_DIR=$PROJECT_DIR/lib
LIB_JARS=`ls $LIB_DIR | grep .jar | awk '{print "'$LIB_DIR'/"$0}' | tr "\n" ":"`
mkdir -p /logs/$SERVICE_NAME/
MAIN_CLASS="com.miles.demoservice.Application"
JAVE_HOME=/usr/local/java

# 设置classpath
nohup $JAVE_HOME/jre/bin/java -Xms128m -Xmx256m -classpath $CONFIG_DIR:$LIB_JARS $MAIN_CLASS  >> /data/app/build/$SERVICE_NAME/std_out.log 2>&1 &