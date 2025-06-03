/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.yandex.metrica.coreutils.logger;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

public abstract class BaseLogger {
    private volatile boolean mIsEnabled = false;

    public BaseLogger(boolean bl) {
        this.mIsEnabled = bl;
    }

    private String getFormattedMessage(String string2, Object[] objectArray) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getPrefix());
            stringBuilder.append(this.formatMessage(BaseLogger.wrapMsg(string2), objectArray));
            string2 = stringBuilder.toString();
            return string2;
        }
        catch (Throwable throwable) {
            return this.onFormatException();
        }
    }

    private String getMessage(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getPrefix());
        stringBuilder.append(BaseLogger.wrapMsg(string2));
        return stringBuilder.toString();
    }

    private static String wrapMsg(String string2) {
        String string3 = string2;
        if (string2 == null) {
            string3 = "";
        }
        return string3;
    }

    public void d(String string2) {
        this.log(3, BaseLogger.wrapMsg(string2));
    }

    public void e(String string2) {
        this.log(6, string2);
    }

    public void e(Throwable throwable, String string2) {
        this.log(6, throwable, string2);
    }

    public void fd(String string2, Object ... objectArray) {
        this.log(3, BaseLogger.wrapMsg(string2), objectArray);
    }

    public void fe(String string2, Object ... objectArray) {
        this.log(6, string2, objectArray);
    }

    public void fe(Throwable throwable, String string2, Object ... objectArray) {
        this.log(6, throwable, string2, objectArray);
    }

    public void fi(String string2, Object ... objectArray) {
        this.log(4, string2, objectArray);
    }

    public void forceE(Throwable throwable, String string2, Object ... objectArray) {
        String string3 = this.getTag();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getFormattedMessage(string2, objectArray));
        stringBuilder.append("\n");
        stringBuilder.append(Log.getStackTraceString((Throwable)throwable));
        Log.println((int)6, (String)string3, (String)stringBuilder.toString());
    }

    public void forceI(String string2, Object ... objectArray) {
        Log.println((int)4, (String)this.getTag(), (String)this.getFormattedMessage(string2, objectArray));
    }

    public void forceW(String string2, Object ... objectArray) {
        Log.println((int)5, (String)this.getTag(), (String)this.getFormattedMessage(string2, objectArray));
    }

    public abstract String formatMessage(String var1, Object[] var2);

    public void fw(String string2, Object ... objectArray) {
        this.log(5, string2, objectArray);
    }

    public abstract String getPrefix();

    public abstract String getTag();

    public void i(String string2) {
        this.log(4, string2);
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public void log(int n, String string2) {
        if (this.shouldLog()) {
            Log.println((int)n, (String)this.getTag(), (String)this.getMessage(string2));
        }
    }

    public void log(int n, String string2, Object ... objectArray) {
        if (this.shouldLog()) {
            Log.println((int)n, (String)this.getTag(), (String)this.getFormattedMessage(string2, objectArray));
        }
    }

    public void log(int n, @Nullable Throwable throwable, String string2) {
        if (this.shouldLog()) {
            String string3 = this.getTag();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getMessage(string2));
            stringBuilder.append("\n");
            stringBuilder.append(Log.getStackTraceString((Throwable)throwable));
            Log.println((int)n, (String)string3, (String)stringBuilder.toString());
        }
    }

    public void log(int n, @Nullable Throwable throwable, String string2, Object ... objectArray) {
        if (this.shouldLog()) {
            String string3 = this.getTag();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getFormattedMessage(string2, objectArray));
            stringBuilder.append("\n");
            stringBuilder.append(Log.getStackTraceString((Throwable)throwable));
            Log.println((int)n, (String)string3, (String)stringBuilder.toString());
        }
    }

    @VisibleForTesting
    public String onFormatException() {
        return this.getPrefix();
    }

    public void setDisabled() {
        this.mIsEnabled = false;
    }

    public void setEnabled() {
        this.mIsEnabled = true;
    }

    public boolean shouldLog() {
        return this.mIsEnabled;
    }

    public void w(String string2) {
        this.log(5, string2);
    }
}

