#!/bin/bash
echo "- Build KmpAndroidExistingProjectShared -"
./gradlew shared:createXCFramework
if [ $? -ne 0 ]; then
 echo "Km pAndroidExistingProjectShare building failed."
 exit 1
fi