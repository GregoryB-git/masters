/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.ref.WeakReference
 */
package com.yandex.metrica.impl.ob;

import android.os.Handler;
import com.yandex.metrica.impl.ob.B;
import com.yandex.metrica.impl.ob.b1;
import java.lang.ref.WeakReference;

class c1
implements Runnable {
    private final WeakReference<Handler> a;
    private final WeakReference<B> b;

    public c1(Handler handler, B b2) {
        this.a = new WeakReference((Object)handler);
        this.b = new WeakReference((Object)b2);
    }

    public void run() {
        Handler handler = (Handler)this.a.get();
        B b2 = (B)this.b.get();
        if (handler != null && b2 != null && b2.e()) {
            b1.a(handler, b2, this);
        }
    }
}

