#!/usr/bin/env bash

. ./common.sh

"$JBOSS_DIR/bin/standalone.sh" -c standalone-full-ha.xml -Djboss.server.base.dir=${JBOSS_INSTANCE1_DIR} -Djboss.node.name=node1
