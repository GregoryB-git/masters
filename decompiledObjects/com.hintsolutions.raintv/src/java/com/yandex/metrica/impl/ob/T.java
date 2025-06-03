/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.metrica.impl.ob.u
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.E1;
import com.yandex.metrica.impl.ob.j0;
import com.yandex.metrica.impl.ob.u;

class t
implements Runnable {
    public final E1 a;
    public final j0 b;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public t(u u3, E1 e12, j0 j02) {
        this.a = e12;
        this.b = j02;
    }

    public void run() {
        this.a.b(this.b);
    }
}

