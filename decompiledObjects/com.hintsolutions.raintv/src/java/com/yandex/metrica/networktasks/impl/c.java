/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 */
package com.yandex.metrica.networktasks.impl;

public class c
extends Thread {
    private volatile boolean a = true;

    public c() {
    }

    public c(Runnable runnable, String string) {
        super(runnable, string);
    }

    public c(String string) {
        super(string);
    }

    public boolean isRunning() {
        c c3 = this;
        synchronized (c3) {
            boolean bl = this.a;
            return bl;
        }
    }

    public void stopRunning() {
        c c3 = this;
        synchronized (c3) {
            this.a = false;
            this.interrupt();
            return;
        }
    }
}

