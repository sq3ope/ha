#!/usr/bin/env bash

. ./common.sh

cp ejb-server/ear/target/ear-1.0-SNAPSHOT.ear ${JBOSS_INSTANCE2_DIR}/deployments
