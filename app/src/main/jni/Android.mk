LOCAL_PATH:=$(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE := native-lib
LOCAL_SRC_FILES := com_xiamuyao_stujni_MathKit.c
include $(BUILD_SHARED_LIBRARY)