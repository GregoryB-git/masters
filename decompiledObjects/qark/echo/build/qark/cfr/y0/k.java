/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.Arrays
 */
package y0;

import d0.q;
import g0.M;
import i0.g;
import i0.j;
import i0.x;
import java.util.Arrays;
import y0.e;

public abstract class k
extends e {
    public byte[] j;
    public volatile boolean k;

    public k(g g8, i0.k k8, int n8, q q8, int n9, Object object, byte[] arrby) {
        super(g8, k8, n8, q8, n9, object, -9223372036854775807L, -9223372036854775807L);
        if (arrby == null) {
            arrby = M.f;
        }
        this.j = arrby;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b() {
        Throwable throwable2;
        block4 : {
            try {
                this.i.e(this.b);
                int n8 = 0;
                int n9 = 0;
                while (n8 != -1 && !this.k) {
                    int n10;
                    this.i(n9);
                    n8 = n10 = this.i.read(this.j, n9, 16384);
                    if (n10 == -1) continue;
                    n9 += n10;
                    n8 = n10;
                }
                if (this.k) break block4;
                this.g(this.j, n9);
            }
            catch (Throwable throwable2) {}
        }
        j.a(this.i);
        return;
        j.a(this.i);
        throw throwable2;
    }

    @Override
    public final void c() {
        this.k = true;
    }

    public abstract void g(byte[] var1, int var2);

    public byte[] h() {
        return this.j;
    }

    public final void i(int n8) {
        byte[] arrby = this.j;
        if (arrby.length < n8 + 16384) {
            this.j = Arrays.copyOf((byte[])arrby, (int)(arrby.length + 16384));
        }
    }
}

