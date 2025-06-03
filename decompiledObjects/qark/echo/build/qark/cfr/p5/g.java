/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package p5;

import p5.e;

public class g {
    public final e a;
    public final Runnable b;

    public g(e e8, Runnable runnable) {
        this.a = e8;
        this.b = runnable;
    }

    public void a() {
        this.b.run();
    }
}

