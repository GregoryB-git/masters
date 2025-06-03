/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.metrica.impl.ob.xm
 *  com.yandex.metrica.impl.ob.ym
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.atomic.AtomicInteger
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.xm;
import com.yandex.metrica.impl.ob.ym;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class zm
implements ThreadFactory {
    private static final AtomicInteger b = new AtomicInteger(0);
    private final String a;

    public zm(String string) {
        this.a = string;
    }

    public static ym a(String string, Runnable runnable) {
        return new ym(runnable, new zm(string).a());
    }

    private String a() {
        StringBuilder stringBuilder = z2.u(this.a, "-");
        stringBuilder.append(b.incrementAndGet());
        return stringBuilder.toString();
    }

    public static int c() {
        return b.incrementAndGet();
    }

    public xm b() {
        return new xm(this.a());
    }

    public Thread newThread(Runnable runnable) {
        return new ym(runnable, this.a());
    }
}

