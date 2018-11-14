#include "com_xiamuyao_stujni_MathKit.h"
//注意方法名要和.h文件里的一样
JNIEXPORT jint JNICALL Java_com_xiamuyao_stujni_MathKit_square(JNIEnv *env, jclass cls, jint num) {
return num * num;
}