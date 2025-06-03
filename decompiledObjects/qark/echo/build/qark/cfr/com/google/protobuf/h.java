/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.logging.Level
 *  java.util.logging.Logger
 */
package com.google.protobuf;

import com.google.protobuf.K;
import com.google.protobuf.Z;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.f;
import com.google.protobuf.i;
import com.google.protobuf.k0;
import com.google.protobuf.l0;
import com.google.protobuf.m0;
import com.google.protobuf.n0;
import com.google.protobuf.t;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class h
extends e {
    public static final Logger c = Logger.getLogger((String)h.class.getName());
    public static final boolean d = k0.E();
    public i a;
    public boolean b;

    public h() {
    }

    public /* synthetic */ h( a8) {
        this();
    }

    public static int A(int n8, K k8, Z z8) {
        return h.O(n8) + h.C(k8, z8);
    }

    public static int B(K k8) {
        return h.z(k8.a());
    }

    public static int C(K k8, Z z8) {
        return h.z(((a)k8).h(z8));
    }

    public static int D(int n8, f f8) {
        return h.O(1) * 2 + h.P(2, n8) + h.g(3, f8);
    }

    public static int E(int n8, int n9) {
        return h.O(n8) + h.F(n9);
    }

    public static int F(int n8) {
        return 4;
    }

    public static int G(int n8, long l8) {
        return h.O(n8) + h.H(l8);
    }

    public static int H(long l8) {
        return 8;
    }

    public static int I(int n8, int n9) {
        return h.O(n8) + h.J(n9);
    }

    public static int J(int n8) {
        return h.Q(h.T(n8));
    }

    public static int K(int n8, long l8) {
        return h.O(n8) + h.L(l8);
    }

    public static int L(long l8) {
        return h.S(h.U(l8));
    }

    public static int M(int n8, String string2) {
        return h.O(n8) + h.N(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int N(String string2) {
        int n8;
        try {
            n8 = l0.f(string2);
            return h.z(n8);
        }
        catch (l0.c c8) {}
        n8 = string2.getBytes(t.b).length;
        return h.z(n8);
    }

    public static int O(int n8) {
        return h.Q(m0.c(n8, 0));
    }

    public static int P(int n8, int n9) {
        return h.O(n8) + h.Q(n9);
    }

    public static int Q(int n8) {
        if ((n8 & -128) == 0) {
            return 1;
        }
        if ((n8 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & n8) == 0) {
            return 3;
        }
        if ((n8 & -268435456) == 0) {
            return 4;
        }
        return 5;
    }

    public static int R(int n8, long l8) {
        return h.O(n8) + h.S(l8);
    }

    public static int S(long l8) {
        int n8;
        if ((-128L & l8) == 0L) {
            return 1;
        }
        if (l8 < 0L) {
            return 10;
        }
        if ((-34359738368L & l8) != 0L) {
            l8 >>>= 28;
            n8 = 6;
        } else {
            n8 = 2;
        }
        int n9 = n8;
        long l9 = l8;
        if ((-2097152L & l8) != 0L) {
            n9 = n8 + 2;
            l9 = l8 >>> 14;
        }
        n8 = n9;
        if ((l9 & -16384L) != 0L) {
            n8 = n9 + 1;
        }
        return n8;
    }

    public static int T(int n8) {
        return n8 >> 31 ^ n8 << 1;
    }

    public static long U(long l8) {
        return l8 >> 63 ^ l8 << 1;
    }

    public static h X(byte[] arrby) {
        return h.Y(arrby, 0, arrby.length);
    }

    public static h Y(byte[] arrby, int n8, int n9) {
        return new b(arrby, n8, n9);
    }

    public static /* synthetic */ boolean b() {
        return d;
    }

    public static int d(int n8, boolean bl) {
        return h.O(n8) + h.e(bl);
    }

    public static int e(boolean bl) {
        return 1;
    }

    public static int f(byte[] arrby) {
        return h.z(arrby.length);
    }

    public static int g(int n8, f f8) {
        return h.O(n8) + h.h(f8);
    }

    public static int h(f f8) {
        return h.z(f8.size());
    }

    public static int i(int n8, double d8) {
        return h.O(n8) + h.j(d8);
    }

    public static int j(double d8) {
        return 8;
    }

    public static int k(int n8, int n9) {
        return h.O(n8) + h.l(n9);
    }

    public static int l(int n8) {
        return h.w(n8);
    }

    public static int m(int n8, int n9) {
        return h.O(n8) + h.n(n9);
    }

    public static int n(int n8) {
        return 4;
    }

    public static int o(int n8, long l8) {
        return h.O(n8) + h.p(l8);
    }

    public static int p(long l8) {
        return 8;
    }

    public static int q(int n8, float f8) {
        return h.O(n8) + h.r(f8);
    }

    public static int r(float f8) {
        return 4;
    }

    public static int s(int n8, K k8, Z z8) {
        return h.O(n8) * 2 + h.u(k8, z8);
    }

    public static int t(K k8) {
        return k8.a();
    }

    public static int u(K k8, Z z8) {
        return ((a)k8).h(z8);
    }

    public static int v(int n8, int n9) {
        return h.O(n8) + h.w(n9);
    }

    public static int w(int n8) {
        if (n8 >= 0) {
            return h.Q(n8);
        }
        return 10;
    }

    public static int x(int n8, long l8) {
        return h.O(n8) + h.y(l8);
    }

    public static int y(long l8) {
        return h.S(l8);
    }

    public static int z(int n8) {
        return h.Q(n8) + n8;
    }

    public abstract void A0(K var1);

    public abstract void B0(int var1, K var2);

    public abstract void C0(int var1, f var2);

    public final void D0(int n8, int n9) {
        this.l0(n8, n9);
    }

    public final void E0(int n8) {
        this.m0(n8);
    }

    public final void F0(int n8, long l8) {
        this.n0(n8, l8);
    }

    public final void G0(long l8) {
        this.o0(l8);
    }

    public final void H0(int n8, int n9) {
        this.O0(n8, h.T(n9));
    }

    public final void I0(int n8) {
        this.P0(h.T(n8));
    }

    public final void J0(int n8, long l8) {
        this.Q0(n8, h.U(l8));
    }

    public final void K0(long l8) {
        this.R0(h.U(l8));
    }

    public abstract void L0(int var1, String var2);

    public abstract void M0(String var1);

    public abstract void N0(int var1, int var2);

    public abstract void O0(int var1, int var2);

    public abstract void P0(int var1);

    public abstract void Q0(int var1, long var2);

    public abstract void R0(long var1);

    public final void V(String arrby, l0.c c8) {
        c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable)c8);
        arrby = arrby.getBytes(t.b);
        try {
            this.P0(arrby.length);
            this.a(arrby, 0, arrby.length);
            return;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new c((Throwable)indexOutOfBoundsException);
        }
    }

    public boolean W() {
        return this.b;
    }

    public abstract int Z();

    @Override
    public abstract void a(byte[] var1, int var2, int var3);

    public abstract void a0(byte var1);

    public abstract void b0(int var1, boolean var2);

    public final void c() {
        if (this.Z() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public final void c0(boolean bl) {
        this.a0((byte)(bl ? 1 : 0));
    }

    public final void d0(byte[] arrby) {
        this.e0(arrby, 0, arrby.length);
    }

    public abstract void e0(byte[] var1, int var2, int var3);

    public abstract void f0(int var1, f var2);

    public abstract void g0(f var1);

    public final void h0(int n8, double d8) {
        this.n0(n8, Double.doubleToRawLongBits((double)d8));
    }

    public final void i0(double d8) {
        this.o0(Double.doubleToRawLongBits((double)d8));
    }

    public final void j0(int n8, int n9) {
        this.v0(n8, n9);
    }

    public final void k0(int n8) {
        this.w0(n8);
    }

    public abstract void l0(int var1, int var2);

    public abstract void m0(int var1);

    public abstract void n0(int var1, long var2);

    public abstract void o0(long var1);

    public final void p0(int n8, float f8) {
        this.l0(n8, Float.floatToRawIntBits((float)f8));
    }

    public final void q0(float f8) {
        this.m0(Float.floatToRawIntBits((float)f8));
    }

    public final void r0(int n8, K k8) {
        this.N0(n8, 3);
        this.t0(k8);
        this.N0(n8, 4);
    }

    public final void s0(int n8, K k8, Z z8) {
        this.N0(n8, 3);
        this.u0(k8, z8);
        this.N0(n8, 4);
    }

    public final void t0(K k8) {
        k8.j(this);
    }

    public final void u0(K k8, Z z8) {
        z8.h(k8, this.a);
    }

    public abstract void v0(int var1, int var2);

    public abstract void w0(int var1);

    public final void x0(int n8, long l8) {
        this.Q0(n8, l8);
    }

    public final void y0(long l8) {
        this.R0(l8);
    }

    public abstract void z0(int var1, K var2, Z var3);

    public static class b
    extends h {
        public final byte[] e;
        public final int f;
        public final int g;
        public int h;

        public b(byte[] arrby, int n8, int n9) {
            super(null);
            if (arrby != null) {
                int n10 = arrby.length;
                int n11 = n8 + n9;
                if ((n8 | n9 | n10 - n11) >= 0) {
                    this.e = arrby;
                    this.f = n8;
                    this.h = n8;
                    this.g = n11;
                    return;
                }
                throw new IllegalArgumentException(String.format((String)"Array range is invalid. Buffer.length=%d, offset=%d, length=%d", (Object[])new Object[]{arrby.length, n8, n9}));
            }
            throw new NullPointerException("buffer");
        }

        @Override
        public final void A0(K k8) {
            this.P0(k8.a());
            k8.j(this);
        }

        @Override
        public final void B0(int n8, K k8) {
            this.N0(1, 3);
            this.O0(2, n8);
            this.T0(3, k8);
            this.N0(1, 4);
        }

        @Override
        public final void C0(int n8, f f8) {
            this.N0(1, 3);
            this.O0(2, n8);
            this.f0(3, f8);
            this.N0(1, 4);
        }

        @Override
        public final void L0(int n8, String string2) {
            this.N0(n8, 2);
            this.M0(string2);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        @Override
        public final void M0(String var1_1) {
            var3_3 = this.h;
            var2_4 = h.Q(var1_1.length() * 3);
            var4_5 = h.Q(var1_1.length());
            if (var4_5 != var2_4) ** GOTO lbl13
            var2_4 = var3_3 + var4_5;
            try {
                block4 : {
                    this.h = var2_4;
                    var2_4 = l0.e(var1_1, this.e, var2_4, this.Z());
                    this.h = var3_3;
                    this.P0(var2_4 - var3_3 - var4_5);
                    break block4;
lbl13: // 1 sources:
                    this.P0(l0.f(var1_1));
                    var2_4 = l0.e(var1_1, this.e, this.h, this.Z());
                }
                this.h = var2_4;
                return;
            }
            catch (IndexOutOfBoundsException var1_2) {
                throw new c((Throwable)var1_2);
            }
            catch (l0.c var5_6) {}
            this.h = var3_3;
            this.V(var1_1, var5_6);
        }

        @Override
        public final void N0(int n8, int n9) {
            this.P0(m0.c(n8, n9));
        }

        @Override
        public final void O0(int n8, int n9) {
            this.N0(n8, 0);
            this.P0(n9);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        @Override
        public final void P0(int var1_1) {
            do lbl-1000: // 2 sources:
            {
                if ((var1_1 & -128) == 0) {
                    var3_3 = this.e;
                    var2_2 = this.h;
                    this.h = var2_2 + 1;
                    var3_3[var2_2] = (byte)var1_1;
                    return;
                }
                var3_3 = this.e;
                var2_2 = this.h;
                this.h = var2_2 + 1;
                break;
            } while (true);
            catch (IndexOutOfBoundsException var3_4) {}
            {
                var3_3[var2_2] = (byte)(var1_1 & 127 | 128);
                var1_1 >>>= 7;
                ** while (true)
            }
            throw new c(String.format((String)"Pos: %d, limit: %d, len: %d", (Object[])new Object[]{this.h, this.g, 1}), (Throwable)var3_4);
        }

        @Override
        public final void Q0(int n8, long l8) {
            this.N0(n8, 0);
            this.R0(l8);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        @Override
        public final void R0(long var1_1) {
            var4_2 = var1_1;
            if (h.b()) {
                var4_2 = var1_1;
                if (this.Z() >= 10) {
                    do {
                        if ((var1_1 & -128L) == 0L) {
                            var6_5 = this.e;
                            var3_3 = this.h;
                            this.h = 1 + var3_3;
                            k0.K(var6_5, var3_3, (byte)var1_1);
                            return;
                        }
                        var6_5 = this.e;
                        var3_3 = this.h;
                        this.h = var3_3 + 1;
                        k0.K(var6_5, var3_3, (byte)((int)var1_1 & 127 | 128));
                        var1_1 >>>= 7;
                    } while (true);
                }
            }
            do lbl-1000: // 2 sources:
            {
                if ((var4_2 & -128L) == 0L) {
                    var6_6 = this.e;
                    var3_4 = this.h;
                    this.h = var3_4 + 1;
                    var6_6[var3_4] = (byte)var4_2;
                    return;
                }
                var6_6 = this.e;
                var3_4 = this.h;
                this.h = var3_4 + 1;
                break;
            } while (true);
            catch (IndexOutOfBoundsException var6_7) {}
            {
                var6_6[var3_4] = (byte)((int)var4_2 & 127 | 128);
                var4_2 >>>= 7;
                ** while (true)
            }
            throw new c(String.format((String)"Pos: %d, limit: %d, len: %d", (Object[])new Object[]{this.h, this.g, 1}), (Throwable)var6_7);
        }

        public final void S0(byte[] arrby, int n8, int n9) {
            try {
                System.arraycopy((Object)arrby, (int)n8, (Object)this.e, (int)this.h, (int)n9);
                this.h += n9;
                return;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw new c(String.format((String)"Pos: %d, limit: %d, len: %d", (Object[])new Object[]{this.h, this.g, n9}), (Throwable)indexOutOfBoundsException);
            }
        }

        public final void T0(int n8, K k8) {
            this.N0(n8, 2);
            this.A0(k8);
        }

        @Override
        public final int Z() {
            return this.g - this.h;
        }

        @Override
        public final void a(byte[] arrby, int n8, int n9) {
            this.S0(arrby, n8, n9);
        }

        @Override
        public final void a0(byte by) {
            try {
                byte[] arrby = this.e;
                int n8 = this.h;
                this.h = n8 + 1;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw new c(String.format((String)"Pos: %d, limit: %d, len: %d", (Object[])new Object[]{this.h, this.g, 1}), (Throwable)indexOutOfBoundsException);
            }
            arrby[n8] = by;
        }

        @Override
        public final void b0(int n8, boolean bl) {
            this.N0(n8, 0);
            this.a0((byte)(bl ? 1 : 0));
        }

        @Override
        public final void e0(byte[] arrby, int n8, int n9) {
            this.P0(n9);
            this.S0(arrby, n8, n9);
        }

        @Override
        public final void f0(int n8, f f8) {
            this.N0(n8, 2);
            this.g0(f8);
        }

        @Override
        public final void g0(f f8) {
            this.P0(f8.size());
            f8.b0(this);
        }

        @Override
        public final void l0(int n8, int n9) {
            this.N0(n8, 5);
            this.m0(n9);
        }

        @Override
        public final void m0(int n8) {
            int n9;
            try {
                byte[] arrby = this.e;
                n9 = this.h;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw new c(String.format((String)"Pos: %d, limit: %d, len: %d", (Object[])new Object[]{this.h, this.g, 1}), (Throwable)indexOutOfBoundsException);
            }
            arrby[n9] = (byte)(n8 & 255);
            arrby[n9 + 1] = (byte)(n8 >> 8 & 255);
            arrby[n9 + 2] = (byte)(n8 >> 16 & 255);
            this.h = n9 + 4;
            arrby[n9 + 3] = (byte)(n8 >> 24 & 255);
        }

        @Override
        public final void n0(int n8, long l8) {
            this.N0(n8, 1);
            this.o0(l8);
        }

        @Override
        public final void o0(long l8) {
            int n8;
            try {
                byte[] arrby = this.e;
                n8 = this.h;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw new c(String.format((String)"Pos: %d, limit: %d, len: %d", (Object[])new Object[]{this.h, this.g, 1}), (Throwable)indexOutOfBoundsException);
            }
            arrby[n8] = (byte)((int)l8 & 255);
            arrby[n8 + 1] = (byte)((int)(l8 >> 8) & 255);
            arrby[n8 + 2] = (byte)((int)(l8 >> 16) & 255);
            arrby[n8 + 3] = (byte)((int)(l8 >> 24) & 255);
            arrby[n8 + 4] = (byte)((int)(l8 >> 32) & 255);
            arrby[n8 + 5] = (byte)((int)(l8 >> 40) & 255);
            arrby[n8 + 6] = (byte)((int)(l8 >> 48) & 255);
            this.h = n8 + 8;
            arrby[n8 + 7] = (byte)((int)(l8 >> 56) & 255);
        }

        @Override
        public final void v0(int n8, int n9) {
            this.N0(n8, 0);
            this.w0(n9);
        }

        @Override
        public final void w0(int n8) {
            if (n8 >= 0) {
                this.P0(n8);
                return;
            }
            this.R0(n8);
        }

        @Override
        public final void z0(int n8, K k8, Z z8) {
            this.N0(n8, 2);
            this.P0(((a)k8).h(z8));
            z8.h(k8, this.a);
        }
    }

    public static class c
    extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public c(String string2, Throwable throwable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            stringBuilder.append(string2);
            super(stringBuilder.toString(), throwable);
        }

        public c(Throwable throwable) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable);
        }
    }

}

