/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.hintsolutions.raintv.services.audio;

import android.util.Log;

public class LogHelper {
    private static final String LOG_PREFIX = "sample_";
    private static final int LOG_PREFIX_LENGTH = 7;
    private static final int MAX_LOG_TAG_LENGTH = 23;

    public static void d(String string2, Object ... objectArray) {
    }

    public static void e(String string2, Throwable throwable, Object ... objectArray) {
        LogHelper.log(string2, 6, throwable, objectArray);
    }

    public static void e(String string2, Object ... objectArray) {
        LogHelper.log(string2, 6, null, objectArray);
    }

    public static void i(String string2, Object ... objectArray) {
        LogHelper.log(string2, 4, null, objectArray);
    }

    public static void log(String string2, int n, Throwable object, Object ... objectArray) {
        if (Log.isLoggable((String)string2, (int)n)) {
            if (object == null && objectArray != null && objectArray.length == 1) {
                object = objectArray[0].toString();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                if (objectArray != null) {
                    int n2 = objectArray.length;
                    for (int j = 0; j < n2; ++j) {
                        stringBuilder.append(objectArray[j]);
                    }
                }
                if (object != null) {
                    stringBuilder.append("\n");
                    stringBuilder.append(Log.getStackTraceString((Throwable)object));
                }
                object = stringBuilder.toString();
            }
            Log.println((int)n, (String)string2, (String)object);
        }
    }

    public static String makeLogTag(Class clazz) {
        return LogHelper.makeLogTag(clazz.getSimpleName());
    }

    public static String makeLogTag(String string2) {
        int n;
        int n2 = string2.length();
        if (n2 > 23 - (n = LOG_PREFIX_LENGTH)) {
            StringBuilder stringBuilder = z2.t(LOG_PREFIX);
            stringBuilder.append(string2.substring(0, 23 - n - 1));
            return stringBuilder.toString();
        }
        return z2.o(LOG_PREFIX, string2);
    }

    public static void v(String string2, Object ... objectArray) {
    }

    public static void w(String string2, Throwable throwable, Object ... objectArray) {
        LogHelper.log(string2, 5, throwable, objectArray);
    }

    public static void w(String string2, Object ... objectArray) {
        LogHelper.log(string2, 5, null, objectArray);
    }
}

