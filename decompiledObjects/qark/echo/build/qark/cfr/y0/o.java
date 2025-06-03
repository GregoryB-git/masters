/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 */
package y0;

import F0.T;
import F0.j;
import d0.i;
import d0.q;
import i0.g;
import i0.k;
import i0.x;
import y0.a;
import y0.c;
import y0.e;

public final class o
extends a {
    public final int o;
    public final q p;
    public long q;
    public boolean r;

    public o(g g8, k k8, q q8, int n8, Object object, long l8, long l9, long l10, int n9, q q9) {
        super(g8, k8, q8, n8, object, l8, l9, -9223372036854775807L, -9223372036854775807L, l10);
        this.o = n9;
        this.p = q9;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b() {
        Object object = this.j();
        object.c(0L);
        int n8 = this.o;
        int n9 = 0;
        object = object.a(0, n8);
        object.d(this.p);
        try {
            long l8;
            Object object2 = this.b.e(this.q);
            long l9 = l8 = this.i.e((k)object2);
            if (l8 != -1L) {
                l9 = l8 + this.q;
            }
            object2 = new j(this.i, this.q, l9);
            while (n9 != -1) {
                this.q += (long)n9;
                n9 = object.f((i)object2, Integer.MAX_VALUE, true);
            }
            n9 = (int)this.q;
            object.b(this.g, 1, n9, 0, null);
        }
        catch (Throwable throwable) {}
        i0.j.a(this.i);
        this.r = true;
        return;
        i0.j.a(this.i);
        throw throwable;
    }

    @Override
    public void c() {
    }

    @Override
    public boolean h() {
        return this.r;
    }
}

