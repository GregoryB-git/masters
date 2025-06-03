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
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.g;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.l;
import com.google.crypto.tink.shaded.protobuf.o0;
import com.google.crypto.tink.shaded.protobuf.p0;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.z;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class k
extends g {
    public static final Logger c = Logger.getLogger((String)k.class.getName());
    public static final boolean d = o0.E();
    public l a;
    public boolean b;

    public k() {
    }

    public /* synthetic */ k( a8) {
        this();
    }

    public static int A(int n8, h h8) {
        return k.L(1) * 2 + k.M(2, n8) + k.f(3, h8);
    }

    public static int B(int n8, int n9) {
        return k.L(n8) + k.C(n9);
    }

    public static int C(int n8) {
        return 4;
    }

    public static int D(int n8, long l8) {
        return k.L(n8) + k.E(l8);
    }

    public static int E(long l8) {
        return 8;
    }

    public static int F(int n8, int n9) {
        return k.L(n8) + k.G(n9);
    }

    public static int G(int n8) {
        return k.N(k.Q(n8));
    }

    public static int H(int n8, long l8) {
        return k.L(n8) + k.I(l8);
    }

    public static int I(long l8) {
        return k.P(k.R(l8));
    }

    public static int J(int n8, String string2) {
        return k.L(n8) + k.K(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int K(String string2) {
        int n8;
        try {
            n8 = p0.g(string2);
            return k.x(n8);
        }
        catch (p0.d d8) {}
        n8 = string2.getBytes(z.b).length;
        return k.x(n8);
    }

    public static int L(int n8) {
        return k.N(q0.c(n8, 0));
    }

    public static int M(int n8, int n9) {
        return k.L(n8) + k.N(n9);
    }

    public static int N(int n8) {
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

    public static int O(int n8, long l8) {
        return k.L(n8) + k.P(l8);
    }

    public static int P(long l8) {
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

    public static int Q(int n8) {
        return n8 >> 31 ^ n8 << 1;
    }

    public static long R(long l8) {
        return l8 >> 63 ^ l8 << 1;
    }

    public static k U(byte[] arrby) {
        return k.V(arrby, 0, arrby.length);
    }

    public static k V(byte[] arrby, int n8, int n9) {
        return new b(arrby, n8, n9);
    }

    public static /* synthetic */ boolean b() {
        return d;
    }

    public static int d(int n8, boolean bl) {
        return k.L(n8) + k.e(bl);
    }

    public static int e(boolean bl) {
        return 1;
    }

    public static int f(int n8, h h8) {
        return k.L(n8) + k.g(h8);
    }

    public static int g(h h8) {
        return k.x(h8.size());
    }

    public static int h(int n8, double d8) {
        return k.L(n8) + k.i(d8);
    }

    public static int i(double d8) {
        return 8;
    }

    public static int j(int n8, int n9) {
        return k.L(n8) + k.k(n9);
    }

    public static int k(int n8) {
        return k.u(n8);
    }

    public static int l(int n8, int n9) {
        return k.L(n8) + k.m(n9);
    }

    public static int m(int n8) {
        return 4;
    }

    public static int n(int n8, long l8) {
        return k.L(n8) + k.o(l8);
    }

    public static int o(long l8) {
        return 8;
    }

    public static int p(int n8, float f8) {
        return k.L(n8) + k.q(f8);
    }

    public static int q(float f8) {
        return 4;
    }

    public static int r(int n8, O o8, e0 e02) {
        return k.L(n8) * 2 + k.s(o8, e02);
    }

    public static int s(O o8, e0 e02) {
        return ((a)o8).e(e02);
    }

    public static int t(int n8, int n9) {
        return k.L(n8) + k.u(n9);
    }

    public static int u(int n8) {
        if (n8 >= 0) {
            return k.N(n8);
        }
        return 10;
    }

    public static int v(int n8, long l8) {
        return k.L(n8) + k.w(l8);
    }

    public static int w(long l8) {
        return k.P(l8);
    }

    public static int x(int n8) {
        return k.N(n8) + n8;
    }

    public static int y(int n8, O o8, e0 e02) {
        return k.L(n8) + k.z(o8, e02);
    }

    public static int z(O o8, e0 e02) {
        return k.x(((a)o8).e(e02));
    }

    public final void A0(int n8, long l8) {
        this.G0(n8, k.R(l8));
    }

    public final void B0(long l8) {
        this.H0(k.R(l8));
    }

    public abstract void C0(int var1, String var2);

    public abstract void D0(int var1, int var2);

    public abstract void E0(int var1, int var2);

    public abstract void F0(int var1);

    public abstract void G0(int var1, long var2);

    public abstract void H0(long var1);

    public final void S(String arrby, p0.d d8) {
        c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable)d8);
        arrby = arrby.getBytes(z.b);
        try {
            this.F0(arrby.length);
            this.a(arrby, 0, arrby.length);
            return;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new c((Throwable)indexOutOfBoundsException);
        }
    }

    public boolean T() {
        return this.b;
    }

    public abstract int W();

    public abstract void X(byte var1);

    public abstract void Y(int var1, boolean var2);

    public final void Z(boolean bl) {
        this.X((byte)(bl ? 1 : 0));
    }

    @Override
    public abstract void a(byte[] var1, int var2, int var3);

    public abstract void a0(int var1, h var2);

    public final void b0(int n8, double d8) {
        this.h0(n8, Double.doubleToRawLongBits((double)d8));
    }

    public final void c() {
        if (this.W() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public final void c0(double d8) {
        this.i0(Double.doubleToRawLongBits((double)d8));
    }

    public final void d0(int n8, int n9) {
        this.n0(n8, n9);
    }

    public final void e0(int n8) {
        this.o0(n8);
    }

    public abstract void f0(int var1, int var2);

    public abstract void g0(int var1);

    public abstract void h0(int var1, long var2);

    public abstract void i0(long var1);

    public final void j0(int n8, float f8) {
        this.f0(n8, Float.floatToRawIntBits((float)f8));
    }

    public final void k0(float f8) {
        this.g0(Float.floatToRawIntBits((float)f8));
    }

    public final void l0(int n8, O o8, e0 e02) {
        this.D0(n8, 3);
        this.m0(o8, e02);
        this.D0(n8, 4);
    }

    public final void m0(O o8, e0 e02) {
        e02.i(o8, this.a);
    }

    public abstract void n0(int var1, int var2);

    public abstract void o0(int var1);

    public final void p0(int n8, long l8) {
        this.G0(n8, l8);
    }

    public final void q0(long l8) {
        this.H0(l8);
    }

    public abstract void r0(int var1, O var2, e0 var3);

    public abstract void s0(int var1, O var2);

    public abstract void t0(int var1, h var2);

    public final void u0(int n8, int n9) {
        this.f0(n8, n9);
    }

    public final void v0(int n8) {
        this.g0(n8);
    }

    public final void w0(int n8, long l8) {
        this.h0(n8, l8);
    }

    public final void x0(long l8) {
        this.i0(l8);
    }

    public final void y0(int n8, int n9) {
        this.E0(n8, k.Q(n9));
    }

    public final void z0(int n8) {
        this.F0(k.Q(n8));
    }

    public static class b
    extends k {
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
        public final void C0(int n8, String string2) {
            this.D0(n8, 2);
            this.M0(string2);
        }

        @Override
        public final void D0(int n8, int n9) {
            this.F0(q0.c(n8, n9));
        }

        @Override
        public final void E0(int n8, int n9) {
            this.D0(n8, 0);
            this.F0(n9);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        @Override
        public final void F0(int var1_1) {
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
        public final void G0(int n8, long l8) {
            this.D0(n8, 0);
            this.H0(l8);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        @Override
        public final void H0(long var1_1) {
            var4_2 = var1_1;
            if (k.b()) {
                var4_2 = var1_1;
                if (this.W() >= 10) {
                    do {
                        if ((var1_1 & -128L) == 0L) {
                            var6_5 = this.e;
                            var3_3 = this.h;
                            this.h = 1 + var3_3;
                            o0.K(var6_5, var3_3, (byte)var1_1);
                            return;
                        }
                        var6_5 = this.e;
                        var3_3 = this.h;
                        this.h = var3_3 + 1;
                        o0.K(var6_5, var3_3, (byte)((int)var1_1 & 127 | 128));
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

        public final void I0(byte[] arrby, int n8, int n9) {
            try {
                System.arraycopy((Object)arrby, (int)n8, (Object)this.e, (int)this.h, (int)n9);
                this.h += n9;
                return;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw new c(String.format((String)"Pos: %d, limit: %d, len: %d", (Object[])new Object[]{this.h, this.g, n9}), (Throwable)indexOutOfBoundsException);
            }
        }

        public final void J0(h h8) {
            this.F0(h8.size());
            h8.g0(this);
        }

        public final void K0(int n8, O o8) {
            this.D0(n8, 2);
            this.L0(o8);
        }

        public final void L0(O o8) {
            this.F0(o8.a());
            o8.g(this);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public final void M0(String var1_1) {
            var3_3 = this.h;
            var2_4 = k.N(var1_1.length() * 3);
            var4_5 = k.N(var1_1.length());
            if (var4_5 != var2_4) ** GOTO lbl13
            var2_4 = var3_3 + var4_5;
            try {
                block4 : {
                    this.h = var2_4;
                    var2_4 = p0.f(var1_1, this.e, var2_4, this.W());
                    this.h = var3_3;
                    this.F0(var2_4 - var3_3 - var4_5);
                    break block4;
lbl13: // 1 sources:
                    this.F0(p0.g(var1_1));
                    var2_4 = p0.f(var1_1, this.e, this.h, this.W());
                }
                this.h = var2_4;
                return;
            }
            catch (IndexOutOfBoundsException var1_2) {
                throw new c((Throwable)var1_2);
            }
            catch (p0.d var5_6) {}
            this.h = var3_3;
            this.S(var1_1, var5_6);
        }

        @Override
        public final int W() {
            return this.g - this.h;
        }

        @Override
        public final void X(byte by) {
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
        public final void Y(int n8, boolean bl) {
            this.D0(n8, 0);
            this.X((byte)(bl ? 1 : 0));
        }

        @Override
        public final void a(byte[] arrby, int n8, int n9) {
            this.I0(arrby, n8, n9);
        }

        @Override
        public final void a0(int n8, h h8) {
            this.D0(n8, 2);
            this.J0(h8);
        }

        @Override
        public final void f0(int n8, int n9) {
            this.D0(n8, 5);
            this.g0(n9);
        }

        @Override
        public final void g0(int n8) {
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
        public final void h0(int n8, long l8) {
            this.D0(n8, 1);
            this.i0(l8);
        }

        @Override
        public final void i0(long l8) {
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
        public final void n0(int n8, int n9) {
            this.D0(n8, 0);
            this.o0(n9);
        }

        @Override
        public final void o0(int n8) {
            if (n8 >= 0) {
                this.F0(n8);
                return;
            }
            this.H0(n8);
        }

        @Override
        public final void r0(int n8, O o8, e0 e02) {
            this.D0(n8, 2);
            this.F0(((a)o8).e(e02));
            e02.i(o8, this.a);
        }

        @Override
        public final void s0(int n8, O o8) {
            this.D0(1, 3);
            this.E0(2, n8);
            this.K0(3, o8);
            this.D0(1, 4);
        }

        @Override
        public final void t0(int n8, h h8) {
            this.D0(1, 3);
            this.E0(2, n8);
            this.a0(3, h8);
            this.D0(1, 4);
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

