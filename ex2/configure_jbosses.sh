#!/usr/bin/env bash

. ./common.sh

if [ ! -d "$TARGET_DIR" ]; then
    echo "Creating $TARGET_DIR"
    mkdir "$TARGET_DIR"
fi

if [ ! -d "$TARGET_DIR/jboss-as-${JBOSS_VERSION}" ]; then
    wget -P "$TARGET_DIR" -c "$JBOSS_DOWNLOAD_URL"
    unzip -d "$TARGET_DIR" "$TARGET_DIR/jboss-as-${JBOSS_VERSION}.zip"
fi

if [ ! -d "$JBOSS_INSTANCE1_DIR" ]; then
    echo "Creating $JBOSS_INSTANCE1_DIR"
    cp -r "$JBOSS_DIR/standalone" "$JBOSS_INSTANCE1_DIR"
fi

if [ ! -d "$JBOSS_INSTANCE2_DIR" ]; then
    echo "Creating $JBOSS_INSTANCE2_DIR"
    cp -r "$JBOSS_DIR/standalone" "$JBOSS_INSTANCE2_DIR"
fi

JBOSS_INSTANCE1_CONFIG_FILE="$JBOSS_INSTANCE1_DIR/configuration/standalone-full-ha.xml"

if ! grep -q "<cluster-password>" "$JBOSS_INSTANCE1_CONFIG_FILE"; then
    echo "Adding cluster-password to $JBOSS_INSTANCE1_CONFIG_FILE"
    sed -i '/<persistence-enabled>/a <cluster-password>password</cluster-password>' "$JBOSS_INSTANCE1_CONFIG_FILE"
fi

JBOSS_INSTANCE2_CONFIG_FILE="$JBOSS_INSTANCE2_DIR/configuration/standalone-full-ha.xml"

if ! grep -q "<cluster-password>" "$JBOSS_INSTANCE2_CONFIG_FILE"; then
    echo "Adding cluster-password to $JBOSS_INSTANCE2_CONFIG_FILE"
    sed -i '/<persistence-enabled>/a <cluster-password>password</cluster-password>' "$JBOSS_INSTANCE2_CONFIG_FILE"
fi

./deploy_node1.sh
./deploy_node2.sh
