/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 */
package a1;

import F0.K;
import F0.W;
import X2.v;
import a1.i;
import d0.q;
import d0.x;
import g0.a;
import g0.z;
import java.util.Arrays;
import java.util.List;

public final class h
extends i {
    public static final byte[] o = new byte[]{79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = new byte[]{79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean n(z z8, byte[] arrby) {
        if (z8.a() < arrby.length) {
            return false;
        }
        int n8 = z8.f();
        byte[] arrby2 = new byte[arrby.length];
        z8.l(arrby2, 0, arrby.length);
        z8.T(n8);
        return Arrays.equals((byte[])arrby2, (byte[])arrby);
    }

    public static boolean o(z z8) {
        return h.n(z8, o);
    }

    @Override
    public long f(z z8) {
        return this.c(K.e(z8.e()));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean i(z object, long l8, i.b b8) {
        if (h.n((z)object, o)) {
            object = Arrays.copyOf((byte[])object.e(), (int)object.g());
            int n8 = K.c((byte[])object);
            object = K.a((byte[])object);
            if (b8.a != null) {
                return true;
            }
            object = new q.b().o0("audio/opus").N(n8).p0(48000).b0((List)object);
        } else {
            byte[] arrby = p;
            if (!h.n((z)object, arrby)) {
                a.h(b8.a);
                return false;
            }
            a.h(b8.a);
            if (this.n) {
                return true;
            }
            this.n = true;
            object.U(arrby.length);
            object = W.d(v.V(W.k((z)object, (boolean)false, (boolean)false).b));
            if (object == null) {
                return true;
            }
            object = b8.a.a().h0(object.b(b8.a.k));
        }
        b8.a = object.K();
        return true;
    }

    @Override
    public void l(boolean bl) {
        super.l(bl);
        if (bl) {
            this.n = false;
        }
    }
}

