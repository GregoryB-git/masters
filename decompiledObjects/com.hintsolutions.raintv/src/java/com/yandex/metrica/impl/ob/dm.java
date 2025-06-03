/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.tm;

public class Dm
extends tm {
    @Override
    public void execute(Runnable runnable) {
        Dm dm2 = this;
        synchronized (dm2) {
            if (runnable != null) {
                runnable.run();
            }
            return;
        }
    }
}

