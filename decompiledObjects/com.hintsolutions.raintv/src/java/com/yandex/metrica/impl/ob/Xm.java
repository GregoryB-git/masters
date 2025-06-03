/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.HandlerThread
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import android.os.HandlerThread;
import androidx.annotation.NonNull;
import com.yandex.metrica.core.api.executors.IInterruptionSafeThread;

public class xm
extends HandlerThread
implements IInterruptionSafeThread {
    private volatile boolean a = true;

    public xm(@NonNull String string) {
        super(string);
    }

    @Override
    public boolean isRunning() {
        xm xm2 = this;
        synchronized (xm2) {
            boolean bl2 = this.a;
            return bl2;
        }
    }

    @Override
    public void stopRunning() {
        xm xm2 = this;
        synchronized (xm2) {
            this.a = false;
            this.interrupt();
            return;
        }
    }
}

