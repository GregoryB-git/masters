/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package R2;

import A2.n;
import E2.e;

public final class w5 {
    public final e a;
    public long b;

    public w5(e e8) {
        n.i(e8);
        this.a = e8;
    }

    public final void a() {
        this.b = 0L;
    }

    public final boolean b(long l8) {
        if (this.b == 0L) {
            return true;
        }
        if (this.a.b() - this.b >= 3600000L) {
            return true;
        }
        return false;
    }

    public final void c() {
        this.b = this.a.b();
    }
}

