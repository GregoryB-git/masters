/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.twitter.sdk.android.core;

import android.util.Log;
import com.twitter.sdk.android.core.Logger;

public class DefaultLogger
implements Logger {
    private int logLevel;

    public DefaultLogger() {
        this.logLevel = 4;
    }

    public DefaultLogger(int n) {
        this.logLevel = n;
    }

    @Override
    public void d(String string2, String string3) {
        this.d(string2, string3, null);
    }

    @Override
    public void d(String string2, String string3, Throwable throwable) {
        if (this.isLoggable(string2, 3)) {
            Log.d((String)string2, (String)string3, (Throwable)throwable);
        }
    }

    @Override
    public void e(String string2, String string3) {
        this.e(string2, string3, null);
    }

    @Override
    public void e(String string2, String string3, Throwable throwable) {
        if (this.isLoggable(string2, 6)) {
            Log.e((String)string2, (String)string3, (Throwable)throwable);
        }
    }

    @Override
    public int getLogLevel() {
        return this.logLevel;
    }

    @Override
    public void i(String string2, String string3) {
        this.i(string2, string3, null);
    }

    @Override
    public void i(String string2, String string3, Throwable throwable) {
        if (this.isLoggable(string2, 4)) {
            Log.i((String)string2, (String)string3, (Throwable)throwable);
        }
    }

    @Override
    public boolean isLoggable(String string2, int n) {
        boolean bl = this.logLevel <= n;
        return bl;
    }

    @Override
    public void log(int n, String string2, String string3) {
        this.log(n, string2, string3, false);
    }

    @Override
    public void log(int n, String string2, String string3, boolean bl) {
        if (bl || this.isLoggable(string2, n)) {
            Log.println((int)n, (String)string2, (String)string3);
        }
    }

    @Override
    public void setLogLevel(int n) {
        this.logLevel = n;
    }

    @Override
    public void v(String string2, String string3) {
        this.v(string2, string3, null);
    }

    @Override
    public void v(String string2, String string3, Throwable throwable) {
        if (this.isLoggable(string2, 2)) {
            Log.v((String)string2, (String)string3, (Throwable)throwable);
        }
    }

    @Override
    public void w(String string2, String string3) {
        this.w(string2, string3, null);
    }

    @Override
    public void w(String string2, String string3, Throwable throwable) {
        if (this.isLoggable(string2, 5)) {
            Log.w((String)string2, (String)string3, (Throwable)throwable);
        }
    }
}

