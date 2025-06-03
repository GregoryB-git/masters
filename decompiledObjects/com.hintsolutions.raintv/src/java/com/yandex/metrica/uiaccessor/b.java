/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Throwable
 */
package com.yandex.metrica.uiaccessor;

import android.app.Activity;
import androidx.annotation.NonNull;

public interface b {
    public void subscribe(@NonNull Activity var1) throws Throwable;

    public void unsubscribe(@NonNull Activity var1) throws Throwable;
}

