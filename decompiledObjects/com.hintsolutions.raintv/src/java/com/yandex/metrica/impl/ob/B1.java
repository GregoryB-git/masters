/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.SystemClock
 *  com.yandex.metrica.impl.ob.c1
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import android.os.Handler;
import android.os.SystemClock;
import com.yandex.metrica.impl.ob.B;
import com.yandex.metrica.impl.ob.c1;

class b1 {
    private final Handler a;
    private final B b;
    private final c1 c;

    public b1(Handler handler, B b3) {
        this.a = handler;
        this.b = b3;
        this.c = new c1(handler, b3);
    }

    public static void a(Handler handler, B b3, Runnable runnable) {
        handler.removeCallbacks(runnable, (Object)b3.b.b().a());
        String string = b3.b.b().a();
        long l3 = SystemClock.uptimeMillis();
        Integer n2 = b3.b.b().l();
        b3 = n2;
        if (n2 == null) {
            b3 = Integer.valueOf((int)10);
        }
        handler.postAtTime(runnable, (Object)string, l3 + (long)(b3.intValue() * 500));
    }

    public void a() {
        Handler handler = this.a;
        B b3 = this.b;
        handler.removeCallbacks((Runnable)this.c, (Object)b3.b.b().a());
    }

    public void b() {
        b1.a(this.a, this.b, (Runnable)this.c);
    }
}

