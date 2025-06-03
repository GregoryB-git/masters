/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.core.api.executors.IInterruptionSafeThread;

public class ym
extends Thread
implements IInterruptionSafeThread {
    private volatile boolean a = true;

    public ym() {
    }

    public ym(@NonNull Runnable runnable, @NonNull String string) {
        super(runnable, string);
    }

    public ym(@NonNull String string) {
        super(string);
    }

    @Override
    public boolean isRunning() {
        ym ym2 = this;
        synchronized (ym2) {
            boolean bl2 = this.a;
            return bl2;
        }
    }

    @Override
    public void stopRunning() {
        ym ym2 = this;
        synchronized (ym2) {
            this.a = false;
            this.interrupt();
            return;
        }
    }
}

