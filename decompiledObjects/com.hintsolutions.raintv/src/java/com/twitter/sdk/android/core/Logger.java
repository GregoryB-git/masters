/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.twitter.sdk.android.core;

public interface Logger {
    public void d(String var1, String var2);

    public void d(String var1, String var2, Throwable var3);

    public void e(String var1, String var2);

    public void e(String var1, String var2, Throwable var3);

    public int getLogLevel();

    public void i(String var1, String var2);

    public void i(String var1, String var2, Throwable var3);

    public boolean isLoggable(String var1, int var2);

    public void log(int var1, String var2, String var3);

    public void log(int var1, String var2, String var3, boolean var4);

    public void setLogLevel(int var1);

    public void v(String var1, String var2);

    public void v(String var1, String var2, Throwable var3);

    public void w(String var1, String var2);

    public void w(String var1, String var2, Throwable var3);
}

