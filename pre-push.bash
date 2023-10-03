#!/bin/bash
echo "- Build KmpAndroidExistingProjectShared -"
./gradlew shared:createXCFramework
if [ $? -ne 0 ]; then
 echo "KmpAndroidExistingProjectShare building failed."
 exit 1
fi