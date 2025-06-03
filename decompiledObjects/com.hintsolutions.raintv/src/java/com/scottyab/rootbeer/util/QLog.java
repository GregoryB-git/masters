/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.io.PrintWriter
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.scottyab.rootbeer.util;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public final class QLog {
    public static final int ALL = 5;
    public static final int ERRORS_ONLY = 1;
    public static final int ERRORS_WARNINGS = 2;
    public static final int ERRORS_WARNINGS_INFO = 3;
    public static final int ERRORS_WARNINGS_INFO_DEBUG = 4;
    public static int LOGGING_LEVEL = 5;
    public static final int NONE = 0;
    private static final String TAG = "RootBeer";
    private static final String TAG_GENERAL_OUTPUT = "QLog";

    private QLog() {
    }

    public static void d(Object object) {
        if (QLog.isDLoggable()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(QLog.getTrace());
            stringBuilder.append(String.valueOf((Object)object));
            Log.d((String)TAG, (String)stringBuilder.toString());
        }
    }

    public static void e(Exception exception) {
        if (QLog.isELoggable()) {
            exception.printStackTrace();
        }
    }

    public static void e(Object object) {
        if (QLog.isELoggable()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(QLog.getTrace());
            stringBuilder.append(String.valueOf((Object)object));
            Log.e((String)TAG, (String)stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append(QLog.getTrace());
            stringBuilder.append(String.valueOf((Object)object));
            Log.e((String)TAG_GENERAL_OUTPUT, (String)stringBuilder.toString());
        }
    }

    public static void e(Object object, Throwable throwable) {
        if (QLog.isELoggable()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(QLog.getTrace());
            stringBuilder.append(String.valueOf((Object)object));
            Log.e((String)TAG, (String)stringBuilder.toString());
            Log.e((String)TAG, (String)QLog.getThrowableTrace(throwable));
            stringBuilder = new StringBuilder();
            stringBuilder.append(QLog.getTrace());
            stringBuilder.append(String.valueOf((Object)object));
            Log.e((String)TAG_GENERAL_OUTPUT, (String)stringBuilder.toString());
            Log.e((String)TAG_GENERAL_OUTPUT, (String)QLog.getThrowableTrace(throwable));
        }
    }

    private static String getThrowableTrace(Throwable throwable) {
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter((Writer)stringWriter));
        return stringWriter.toString();
    }

    private static String getTrace() {
        StringBuilder stringBuilder = new Throwable().getStackTrace();
        String string2 = stringBuilder[2].getMethodName();
        String string3 = stringBuilder[2].getClassName();
        int n = stringBuilder[2].getLineNumber();
        string3 = string3.substring(string3.lastIndexOf(46) + 1);
        stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append(": ");
        stringBuilder.append(string2);
        stringBuilder.append("() [");
        stringBuilder.append(n);
        stringBuilder.append("] - ");
        return stringBuilder.toString();
    }

    public static void i(Object object) {
        if (QLog.isILoggable()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(QLog.getTrace());
            stringBuilder.append(String.valueOf((Object)object));
            Log.i((String)TAG, (String)stringBuilder.toString());
        }
    }

    public static boolean isDLoggable() {
        boolean bl = LOGGING_LEVEL > 3;
        return bl;
    }

    public static boolean isELoggable() {
        boolean bl = LOGGING_LEVEL > 0;
        return bl;
    }

    public static boolean isILoggable() {
        boolean bl = LOGGING_LEVEL > 2;
        return bl;
    }

    public static boolean isVLoggable() {
        boolean bl = LOGGING_LEVEL > 4;
        return bl;
    }

    public static boolean isWLoggable() {
        int n = LOGGING_LEVEL;
        boolean bl = true;
        if (n <= 1) {
            bl = false;
        }
        return bl;
    }

    public static void v(Object object) {
        if (QLog.isVLoggable()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(QLog.getTrace());
            stringBuilder.append(String.valueOf((Object)object));
            Log.v((String)TAG, (String)stringBuilder.toString());
        }
    }

    public static void w(Object object) {
        if (QLog.isWLoggable()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(QLog.getTrace());
            stringBuilder.append(String.valueOf((Object)object));
            Log.w((String)TAG, (String)stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append(QLog.getTrace());
            stringBuilder.append(String.valueOf((Object)object));
            Log.w((String)TAG_GENERAL_OUTPUT, (String)stringBuilder.toString());
        }
    }

    public static void w(Object object, Throwable throwable) {
        if (QLog.isWLoggable()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(QLog.getTrace());
            stringBuilder.append(String.valueOf((Object)object));
            Log.w((String)TAG, (String)stringBuilder.toString());
            Log.w((String)TAG, (String)QLog.getThrowableTrace(throwable));
            stringBuilder = new StringBuilder();
            stringBuilder.append(QLog.getTrace());
            stringBuilder.append(String.valueOf((Object)object));
            Log.w((String)TAG_GENERAL_OUTPUT, (String)stringBuilder.toString());
            Log.w((String)TAG_GENERAL_OUTPUT, (String)QLog.getThrowableTrace(throwable));
        }
    }
}

