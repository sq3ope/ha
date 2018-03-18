#!/usr/bin/env bash

. ./common.sh

"$JBOSS_DIR/bin/standalone.sh" -c standalone-full-ha.xml -Djboss.server.base.dir=${JBOSS_INSTANCE2_DIR} -Djboss.node.name=node2 -Djboss.socket.binding.port-offset=100
