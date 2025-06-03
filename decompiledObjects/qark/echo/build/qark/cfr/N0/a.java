/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package N0;

import F0.L;
import F0.O;
import F0.q;
import F0.r;
import F0.s;
import F0.t;
import N0.b;
import java.util.List;

public final class a
implements r {
    public final r a;

    /*
     * Enabled aggressive block sorting
     */
    public a(int n8) {
        void var2_3;
        if ((n8 & 1) != 0) {
            O o8 = new O(65496, 2, "image/jpeg");
        } else {
            b b8 = new b();
        }
        this.a = var2_3;
    }

    @Override
    public void a(long l8, long l9) {
        this.a.a(l8, l9);
    }

    @Override
    public void b(t t8) {
        this.a.b(t8);
    }

    @Override
    public /* synthetic */ r d() {
        return q.b(this);
    }

    @Override
    public boolean e(s s8) {
        return this.a.e(s8);
    }

    @Override
    public /* synthetic */ List g() {
        return q.a(this);
    }

    @Override
    public int i(s s8, L l8) {
        return this.a.i(s8, l8);
    }

    @Override
    public void release() {
        this.a.release();
    }
}

