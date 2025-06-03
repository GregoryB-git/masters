/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Arrays
 */
package a1;

import F0.A;
import F0.B;
import F0.M;
import F0.s;
import F0.y;
import F0.z;
import a1.g;
import a1.i;
import d0.q;
import d0.x;
import java.util.Arrays;

public final class b
extends i {
    public B n;
    public a o;

    public static boolean o(byte[] arrby) {
        boolean bl = false;
        if (arrby[0] == -1) {
            bl = true;
        }
        return bl;
    }

    public static boolean p(g0.z z8) {
        if (z8.a() >= 5 && z8.G() == 127 && z8.I() == 1179402563L) {
            return true;
        }
        return false;
    }

    @Override
    public long f(g0.z z8) {
        if (!b.o(z8.e())) {
            return -1L;
        }
        return this.n(z8);
    }

    @Override
    public boolean i(g0.z object, long l8, i.b object2) {
        byte[] arrby = object.e();
        B b8 = this.n;
        if (b8 == null) {
            this.n = b8 = new B(arrby, 17);
            object2.a = b8.g(Arrays.copyOfRange((byte[])arrby, (int)9, (int)object.g()), null);
            return true;
        }
        if ((arrby[0] & 127) == 3) {
            object = z.g((g0.z)object);
            this.n = object2 = b8.b((B.a)object);
            this.o = new a((B)object2, (B.a)object);
            return true;
        }
        if (b.o(arrby)) {
            object = this.o;
            if (object != null) {
                object.d(l8);
                object2.b = this.o;
            }
            g0.a.e(object2.a);
            return false;
        }
        return true;
    }

    @Override
    public void l(boolean bl) {
        super.l(bl);
        if (bl) {
            this.n = null;
            this.o = null;
        }
    }

    public final int n(g0.z z8) {
        int n8 = (z8.e()[2] & 255) >> 4;
        if (n8 == 6 || n8 == 7) {
            z8.U(4);
            z8.N();
        }
        n8 = y.j(z8, n8);
        z8.T(0);
        return n8;
    }

    public static final class a
    implements g {
        public B a;
        public B.a b;
        public long c;
        public long d;

        public a(B b8, B.a a8) {
            this.a = b8;
            this.b = a8;
            this.c = -1L;
            this.d = -1L;
        }

        @Override
        public M a() {
            boolean bl = this.c != -1L;
            g0.a.f(bl);
            return new A(this.a, this.c);
        }

        @Override
        public void b(long l8) {
            long[] arrl = this.b.a;
            this.d = arrl[g0.M.h(arrl, l8, true, true)];
        }

        @Override
        public long c(s s8) {
            long l8 = this.d;
            if (l8 >= 0L) {
                l8 = - l8 + 2L;
                this.d = -1L;
                return l8;
            }
            return -1L;
        }

        public void d(long l8) {
            this.c = l8;
        }
    }

}

