/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package l1;

import F0.T;
import F0.t;
import d0.q;
import g0.a;
import g0.o;
import g0.z;
import l1.K;
import l1.m;

public final class r
implements m {
    public final z a = new z(10);
    public T b;
    public boolean c;
    public long d = -9223372036854775807L;
    public int e;
    public int f;

    @Override
    public void a(z z8) {
        a.h(this.b);
        if (!this.c) {
            return;
        }
        int n8 = z8.a();
        int n9 = this.f;
        if (n9 < 10) {
            n9 = Math.min((int)n8, (int)(10 - n9));
            System.arraycopy((Object)z8.e(), (int)z8.f(), (Object)this.a.e(), (int)this.f, (int)n9);
            if (this.f + n9 == 10) {
                this.a.T(0);
                if (73 == this.a.G() && 68 == this.a.G() && 51 == this.a.G()) {
                    this.a.U(3);
                    this.e = this.a.F() + 10;
                } else {
                    o.h("Id3Reader", "Discarding invalid ID3 tag");
                    this.c = false;
                    return;
                }
            }
        }
        n8 = Math.min((int)n8, (int)(this.e - this.f));
        this.b.e(z8, n8);
        this.f += n8;
    }

    @Override
    public void b() {
        this.c = false;
        this.d = -9223372036854775807L;
    }

    @Override
    public void c(boolean bl) {
        int n8;
        a.h(this.b);
        if (this.c && (n8 = this.e) != 0) {
            if (this.f != n8) {
                return;
            }
            bl = this.d != -9223372036854775807L;
            a.f(bl);
            this.b.b(this.d, 1, this.e, 0, null);
            this.c = false;
        }
    }

    @Override
    public void d(long l8, int n8) {
        if ((n8 & 4) == 0) {
            return;
        }
        this.c = true;
        this.d = l8;
        this.e = 0;
        this.f = 0;
    }

    @Override
    public void e(t object, K.d d8) {
        d8.a();
        this.b = object = object.a(d8.c(), 5);
        object.d(new q.b().a0(d8.b()).o0("application/id3").K());
    }
}

