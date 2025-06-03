/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.WorkerThread
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.WorkerThread;
import com.yandex.metrica.impl.ob.cg;

public final class eg
implements cg.a {
    public final cg.c a;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public eg(cg.c c5) {
        this.a = c5;
    }

    @Override
    @WorkerThread
    public void a() {
        cg.a(this.a.a);
    }
}

