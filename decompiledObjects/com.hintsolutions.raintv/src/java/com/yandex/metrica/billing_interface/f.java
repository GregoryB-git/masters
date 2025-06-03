/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 */
package com.yandex.metrica.billing_interface;

public abstract class f
implements Runnable {
    public abstract void a() throws Throwable;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void run() {
        try {
            this.a();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

