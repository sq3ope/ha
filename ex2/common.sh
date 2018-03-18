#!/usr/bin/env bash

JBOSS_VERSION=7.1.1.Final
JBOSS_DOWNLOAD_URL=http://download.jboss.org/jbossas/7.1/jboss-as-7.1.1.Final/jboss-as-7.1.1.Final.zip

TARGET_DIR=target
JBOSS_DIR=$TARGET_DIR/jboss-as-${JBOSS_VERSION}
JBOSS_INSTANCE1_DIR="$JBOSS_DIR/standalone-node1"
JBOSS_INSTANCE2_DIR="$JBOSS_DIR/standalone-node2"
