/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package Y3;

import Y3.a;

public class f
implements a {
    public final a a;
    public long b;

    public f(a a8, long l8) {
        this.a = a8;
        this.b = l8;
    }

    @Override
    public long a() {
        return this.a.a() + this.b;
    }

    public void b(long l8) {
        this.b = l8;
    }
}

