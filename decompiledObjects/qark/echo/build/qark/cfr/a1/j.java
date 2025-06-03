/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.List
 */
package a1;

import F0.W;
import X2.v;
import a1.i;
import d0.A;
import d0.q;
import d0.x;
import g0.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class j
extends i {
    public a n;
    public int o;
    public boolean p;
    public W.c q;
    public W.a r;

    public static void n(z z8, long l8) {
        if (z8.b() < z8.g() + 4) {
            z8.Q(Arrays.copyOf((byte[])z8.e(), (int)(z8.g() + 4)));
        } else {
            z8.S(z8.g() + 4);
        }
        byte[] arrby = z8.e();
        arrby[z8.g() - 4] = (byte)(l8 & 255L);
        arrby[z8.g() - 3] = (byte)(l8 >>> 8 & 255L);
        arrby[z8.g() - 2] = (byte)(l8 >>> 16 & 255L);
        arrby[z8.g() - 1] = (byte)(l8 >>> 24 & 255L);
    }

    public static int o(byte by, a a8) {
        int n8 = j.p(by, a8.e, 1);
        if (!a8.d[n8].a) {
            return a8.a.g;
        }
        return a8.a.h;
    }

    public static int p(byte by, int n8, int n9) {
        return by >> n9 & 255 >>> 8 - n8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean r(z z8) {
        try {
            return W.o(1, z8, true);
        }
        catch (A a8) {
            return false;
        }
    }

    @Override
    public void e(long l8) {
        super.e(l8);
        int n8 = 0;
        boolean bl = l8 != 0L;
        this.p = bl;
        W.c c8 = this.q;
        if (c8 != null) {
            n8 = c8.g;
        }
        this.o = n8;
    }

    @Override
    public long f(z z8) {
        byte[] arrby = z8.e();
        int n8 = 0;
        if ((arrby[0] & 1) == 1) {
            return -1L;
        }
        int n9 = j.o(z8.e()[0], (a)g0.a.h(this.n));
        if (this.p) {
            n8 = (this.o + n9) / 4;
        }
        long l8 = n8;
        j.n(z8, l8);
        this.p = true;
        this.o = n9;
        return l8;
    }

    @Override
    public boolean i(z object, long l8, i.b b8) {
        if (this.n != null) {
            g0.a.e(b8.a);
            return false;
        }
        Object object2 = this.q((z)object);
        this.n = object2;
        if (object2 == null) {
            return true;
        }
        object = object2.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)object.j);
        arrayList.add((Object)object2.c);
        object2 = W.d(v.V(object2.b.b));
        b8.a = new q.b().o0("audio/vorbis").M(object.e).j0(object.d).N(object.b).p0(object.c).b0((List)arrayList).h0((x)object2).K();
        return true;
    }

    @Override
    public void l(boolean bl) {
        super.l(bl);
        if (bl) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    public a q(z arrb) {
        W.c c8 = this.q;
        if (c8 == null) {
            this.q = W.l((z)arrb);
            return null;
        }
        W.a a8 = this.r;
        if (a8 == null) {
            this.r = W.j((z)arrb);
            return null;
        }
        byte[] arrby = new byte[arrb.g()];
        System.arraycopy((Object)arrb.e(), (int)0, (Object)arrby, (int)0, (int)arrb.g());
        arrb = W.m((z)arrb, c8.b);
        return new a(c8, a8, arrby, arrb, W.b(arrb.length - 1));
    }

    public static final class a {
        public final W.c a;
        public final W.a b;
        public final byte[] c;
        public final W.b[] d;
        public final int e;

        public a(W.c c8, W.a a8, byte[] arrby, W.b[] arrb, int n8) {
            this.a = c8;
            this.b = a8;
            this.c = arrby;
            this.d = arrb;
            this.e = n8;
        }
    }

}

