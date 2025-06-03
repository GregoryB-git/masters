/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.atomic.AtomicInteger
 */
package H3;

import java.util.concurrent.atomic.AtomicInteger;

public final class H {
    public final AtomicInteger a = new AtomicInteger();
    public final AtomicInteger b = new AtomicInteger();

    public int a() {
        return this.b.get();
    }

    public int b() {
        return this.a.get();
    }

    public void c() {
        this.b.getAndIncrement();
    }

    public void d() {
        this.a.getAndIncrement();
    }

    public void e() {
        this.b.set(0);
    }
}

