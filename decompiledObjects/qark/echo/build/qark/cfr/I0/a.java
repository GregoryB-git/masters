/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package I0;

import F0.L;
import F0.O;
import F0.q;
import F0.r;
import F0.s;
import F0.t;
import g0.z;
import java.util.List;

public final class a
implements r {
    public final z a = new z(4);
    public final O b = new O(-1, -1, "image/avif");

    @Override
    public void a(long l8, long l9) {
        this.b.a(l8, l9);
    }

    @Override
    public void b(t t8) {
        this.b.b(t8);
    }

    public final boolean c(s s8, int n8) {
        this.a.P(4);
        byte[] arrby = this.a.e();
        boolean bl = false;
        s8.n(arrby, 0, 4);
        if (this.a.I() == (long)n8) {
            bl = true;
        }
        return bl;
    }

    @Override
    public /* synthetic */ r d() {
        return q.b(this);
    }

    @Override
    public boolean e(s s8) {
        s8.o(4);
        if (this.c(s8, 1718909296) && this.c(s8, 1635150182)) {
            return true;
        }
        return false;
    }

    @Override
    public /* synthetic */ List g() {
        return q.a(this);
    }

    @Override
    public int i(s s8, L l8) {
        return this.b.i(s8, l8);
    }

    @Override
    public void release() {
    }
}

