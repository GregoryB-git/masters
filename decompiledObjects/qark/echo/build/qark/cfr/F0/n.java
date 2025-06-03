/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.EOFException
 *  java.lang.Math
 *  java.lang.Object
 */
package F0;

import F0.S;
import F0.T;
import d0.i;
import d0.q;
import g0.z;
import java.io.EOFException;

public final class n
implements T {
    public final byte[] a = new byte[4096];

    @Override
    public void a(z z8, int n8, int n9) {
        z8.U(n8);
    }

    @Override
    public void b(long l8, int n8, int n9, int n10, T.a a8) {
    }

    @Override
    public int c(i i8, int n8, boolean bl, int n9) {
        n8 = Math.min((int)this.a.length, (int)n8);
        if ((n8 = i8.read(this.a, 0, n8)) == -1) {
            if (bl) {
                return -1;
            }
            throw new EOFException();
        }
        return n8;
    }

    @Override
    public void d(q q8) {
    }

    @Override
    public /* synthetic */ void e(z z8, int n8) {
        S.b(this, z8, n8);
    }

    @Override
    public /* synthetic */ int f(i i8, int n8, boolean bl) {
        return S.a(this, i8, n8, bl);
    }
}

