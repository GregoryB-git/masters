/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Object
 */
package com.yandex.metrica.core.api.executors;

import android.os.Handler;
import android.os.Looper;
import com.yandex.metrica.core.api.executors.ICommonExecutor;

public interface IHandlerExecutor
extends ICommonExecutor {
    public Handler getHandler();

    public Looper getLooper();
}

