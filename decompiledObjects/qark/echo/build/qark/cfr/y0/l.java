/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 */
package y0;

import F0.j;
import F0.s;
import d0.i;
import d0.q;
import i0.g;
import i0.k;
import i0.x;
import y0.e;
import y0.f;

public final class l
extends e {
    public final f j;
    public f.b k;
    public long l;
    public volatile boolean m;

    public l(g g8, k k8, q q8, int n8, Object object, f f8) {
        super(g8, k8, 2, q8, n8, object, -9223372036854775807L, -9223372036854775807L);
        this.j = f8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b() {
        Throwable throwable3;
        Object object;
        Throwable throwable22;
        block8 : {
            if (this.l == 0L) {
                this.j.b(this.k, -9223372036854775807L, -9223372036854775807L);
            }
            object = this.b.e(this.l);
            x x8 = this.i;
            object = new j(x8, object.g, x8.e((k)object));
            try {
                boolean bl;
                while (!this.m && (bl = this.j.c((s)object))) {
                }
            }
            catch (Throwable throwable22) {
                break block8;
            }
            try {
                this.l = object.p() - this.b.g;
            }
            catch (Throwable throwable3) {}
            i0.j.a(this.i);
            return;
        }
        this.l = object.p() - this.b.g;
        throw throwable22;
        i0.j.a(this.i);
        throw throwable3;
    }

    @Override
    public void c() {
        this.m = true;
    }

    public void g(f.b b8) {
        this.k = b8;
    }
}

