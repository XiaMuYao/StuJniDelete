package com.xiamuyao.stujni;

/**
 * ================================================
 * 作    者：夏沐尧  Github地址：https://github.com/XiaMuYaoDQX
 * 版    本：1.0
 * 创建日期： 2018/11/15
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class MathKit {
    public static native int square(int num);

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
}