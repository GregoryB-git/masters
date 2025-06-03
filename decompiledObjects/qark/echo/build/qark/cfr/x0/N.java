/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.EOFException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.System
 *  java.nio.ByteBuffer
 *  java.util.Arrays
 */
package x0;

import B0.b;
import F0.T;
import d0.i;
import g0.M;
import g0.z;
import j0.c;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import x0.P;

public class N {
    public final b a;
    public final int b;
    public final z c;
    public a d;
    public a e;
    public a f;
    public long g;

    public N(b object) {
        int n8;
        this.a = object;
        this.b = n8 = object.e();
        this.c = new z(32);
        this.d = object = new a(0L, n8);
        this.e = object;
        this.f = object;
    }

    public static a d(a a8, long l8) {
        while (l8 >= a8.b) {
            a8 = a8.d;
        }
        return a8;
    }

    public static a i(a a8, long l8, ByteBuffer byteBuffer, int n8) {
        a8 = N.d(a8, l8);
        while (n8 > 0) {
            long l9;
            int n9 = Math.min((int)n8, (int)((int)(a8.b - l8)));
            byteBuffer.put(a8.c.a, a8.e(l8), n9);
            int n10 = n8 - n9;
            l8 = l9 = l8 + (long)n9;
            n8 = n10;
            if (l9 != a8.b) continue;
            a8 = a8.d;
            l8 = l9;
            n8 = n10;
        }
        return a8;
    }

    public static a j(a a8, long l8, byte[] arrby, int n8) {
        a8 = N.d(a8, l8);
        int n9 = n8;
        while (n9 > 0) {
            int n10 = Math.min((int)n9, (int)((int)(a8.b - l8)));
            System.arraycopy((Object)a8.c.a, (int)a8.e(l8), (Object)arrby, (int)(n8 - n9), (int)n10);
            int n11 = n9 - n10;
            long l9 = l8 + (long)n10;
            n9 = n11;
            l8 = l9;
            if (l9 != a8.b) continue;
            a8 = a8.d;
            n9 = n11;
            l8 = l9;
        }
        return a8;
    }

    public static a k(a object, j0.i arrby, P.b b8, z object2) {
        int n8;
        byte[] arrby2;
        long l8;
        int n9;
        int n10;
        Object object3;
        c c8;
        long l9;
        block18 : {
            block17 : {
                block16 : {
                    block15 : {
                        l9 = b8.b;
                        n8 = 1;
                        object2.P(1);
                        object = N.j((a)object, l9, object2.e(), 1);
                        ++l9;
                        arrby2 = object2.e();
                        n10 = 0;
                        int n11 = arrby2[0];
                        n9 = (n11 & 128) != 0 ? 1 : 0;
                        n11 &= 127;
                        c8 = arrby.q;
                        arrby = c8.a;
                        if (arrby == null) {
                            c8.a = new byte[16];
                        } else {
                            Arrays.fill((byte[])arrby, (byte)0);
                        }
                        arrby = N.j((a)object, l9, c8.a, n11);
                        l9 = l8 = l9 + (long)n11;
                        object = arrby;
                        if (n9 != 0) {
                            object2.P(2);
                            object = N.j((a)arrby, l8, object2.e(), 2);
                            l9 = l8 + 2L;
                            n8 = object2.M();
                        }
                        if ((arrby2 = c8.d) == null) break block15;
                        arrby = arrby2;
                        if (arrby2.length >= n8) break block16;
                    }
                    arrby = new int[n8];
                }
                object3 = c8.e;
                if (object3 == null) break block17;
                arrby2 = object3;
                if (object3.length >= n8) break block18;
            }
            arrby2 = new int[n8];
        }
        if (n9 != 0) {
            n9 = n8 * 6;
            object2.P(n9);
            object3 = N.j((a)object, l9, object2.e(), n9);
            l8 = l9 + (long)n9;
            object2.T(0);
            n9 = n10;
            do {
                l9 = l8;
                object = object3;
                if (n9 < n8) {
                    arrby[n9] = object2.M();
                    arrby2[n9] = object2.K();
                    ++n9;
                    continue;
                }
                break;
            } while (true);
        } else {
            arrby[0] = 0;
            arrby2[0] = b8.a - (int)(l9 - b8.b);
        }
        object2 = (T.a)M.i(b8.c);
        c8.c(n8, arrby, arrby2, object2.b, c8.a, object2.a, object2.c, object2.d);
        l8 = b8.b;
        n9 = (int)(l9 - l8);
        b8.b = l8 + (long)n9;
        b8.a -= n9;
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static a l(a a8, j0.i i8, P.b b8, z z8) {
        long l8;
        a a9 = a8;
        if (i8.D()) {
            a9 = N.k(a8, i8, b8, z8);
        }
        if (i8.o()) {
            z8.P(4);
            a8 = N.j(a9, b8.b, z8.e(), 4);
            int n8 = z8.K();
            b8.b += 4L;
            b8.a -= 4;
            i8.z(n8);
            a9 = N.i(a8, b8.b, i8.r, n8);
            b8.b += (long)n8;
            b8.a = n8 = b8.a - n8;
            i8.G(n8);
            l8 = b8.b;
            a8 = i8.u;
            do {
                return N.i(a9, l8, (ByteBuffer)a8, b8.a);
                break;
            } while (true);
        }
        i8.z(b8.a);
        l8 = b8.b;
        a8 = i8.r;
        return N.i(a9, l8, (ByteBuffer)a8, b8.a);
    }

    public final void a(a a8) {
        if (a8.c == null) {
            return;
        }
        this.a.b(a8);
        a8.b();
    }

    public void b(long l8) {
        a a8;
        if (l8 == -1L) {
            return;
        }
        do {
            a8 = this.d;
            if (l8 < a8.b) break;
            this.a.c(a8.c);
            this.d = this.d.b();
        } while (true);
        if (this.e.a < a8.a) {
            this.e = a8;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void c(long l8) {
        a a8;
        boolean bl = l8 <= this.g;
        g0.a.a(bl);
        this.g = l8;
        if (l8 != 0L) {
            a a9;
            a8 = a9 = this.d;
            if (l8 != a9.a) {
                a a10;
                while (this.g > a8.b) {
                    a8 = a8.d;
                }
                a a11 = (a)g0.a.e(a8.d);
                this.a(a11);
                a8.d = a10 = new a(a8.b, this.b);
                a9 = a8;
                if (this.g == a8.b) {
                    a9 = a10;
                }
                this.f = a9;
                if (this.e != a11) return;
                this.e = a10;
                return;
            }
        }
        this.a(this.d);
        this.d = a8 = new a(this.g, this.b);
        this.e = a8;
        this.f = a8;
    }

    public long e() {
        return this.g;
    }

    public void f(j0.i i8, P.b b8) {
        N.l(this.e, i8, b8, this.c);
    }

    public final void g(int n8) {
        long l8;
        this.g = l8 = this.g + (long)n8;
        a a8 = this.f;
        if (l8 == a8.b) {
            this.f = a8.d;
        }
    }

    public final int h(int n8) {
        a a8 = this.f;
        if (a8.c == null) {
            a8.c(this.a.d(), new a(this.f.b, this.b));
        }
        return Math.min((int)n8, (int)((int)(this.f.b - this.g)));
    }

    public void m(j0.i i8, P.b b8) {
        this.e = N.l(this.e, i8, b8, this.c);
    }

    public void n() {
        a a8;
        this.a(this.d);
        this.d.d(0L, this.b);
        this.e = a8 = this.d;
        this.f = a8;
        this.g = 0L;
        this.a.a();
    }

    public void o() {
        this.e = this.d;
    }

    public int p(i i8, int n8, boolean bl) {
        n8 = this.h(n8);
        a a8 = this.f;
        n8 = i8.read(a8.c.a, a8.e(this.g), n8);
        if (n8 == -1) {
            if (bl) {
                return -1;
            }
            throw new EOFException();
        }
        this.g(n8);
        return n8;
    }

    public void q(z z8, int n8) {
        while (n8 > 0) {
            int n9 = this.h(n8);
            a a8 = this.f;
            z8.l(a8.c.a, a8.e(this.g), n9);
            n8 -= n9;
            this.g(n9);
        }
    }

    public static final class a
    implements b.a {
        public long a;
        public long b;
        public B0.a c;
        public a d;

        public a(long l8, int n8) {
            this.d(l8, n8);
        }

        @Override
        public B0.a a() {
            return (B0.a)g0.a.e(this.c);
        }

        public a b() {
            this.c = null;
            a a8 = this.d;
            this.d = null;
            return a8;
        }

        public void c(B0.a a8, a a9) {
            this.c = a8;
            this.d = a9;
        }

        public void d(long l8, int n8) {
            boolean bl = this.c == null;
            g0.a.f(bl);
            this.a = l8;
            this.b = l8 + (long)n8;
        }

        public int e(long l8) {
            return (int)(l8 - this.a) + this.c.b;
        }

        @Override
        public b.a next() {
            a a8 = this.d;
            if (a8 != null && a8.c != null) {
                return a8;
            }
            return null;
        }
    }

}

