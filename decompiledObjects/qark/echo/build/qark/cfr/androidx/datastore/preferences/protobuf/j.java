/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.logging.Level
 *  java.util.logging.Logger
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.O;
import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.f;
import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.k;
import androidx.datastore.preferences.protobuf.p0;
import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.y;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class j
extends f {
    public static final Logger c = Logger.getLogger((String)j.class.getName());
    public static final boolean d = p0.C();
    public k a;
    public boolean b;

    public j() {
    }

    public /* synthetic */ j( a8) {
        this();
    }

    public static int A(O o8) {
        return j.y(o8.a());
    }

    public static int B(O o8, e0 e02) {
        return j.y(((a)o8).j(e02));
    }

    public static int C(int n8) {
        if (n8 > 4096) {
            return 4096;
        }
        return n8;
    }

    public static int D(int n8, g g8) {
        return j.P(1) * 2 + j.Q(2, n8) + j.f(3, g8);
    }

    public static int E(int n8) {
        return j.R(n8);
    }

    public static int F(int n8, int n9) {
        return j.P(n8) + j.G(n9);
    }

    public static int G(int n8) {
        return 4;
    }

    public static int H(int n8, long l8) {
        return j.P(n8) + j.I(l8);
    }

    public static int I(long l8) {
        return 8;
    }

    public static int J(int n8, int n9) {
        return j.P(n8) + j.K(n9);
    }

    public static int K(int n8) {
        return j.R(j.U(n8));
    }

    public static int L(int n8, long l8) {
        return j.P(n8) + j.M(l8);
    }

    public static int M(long l8) {
        return j.T(j.V(l8));
    }

    public static int N(int n8, String string2) {
        return j.P(n8) + j.O(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int O(String string2) {
        int n8;
        try {
            n8 = q0.g(string2);
            return j.y(n8);
        }
        catch (q0.d d8) {}
        n8 = string2.getBytes(y.a).length;
        return j.y(n8);
    }

    public static int P(int n8) {
        return j.R(r0.c(n8, 0));
    }

    public static int Q(int n8, int n9) {
        return j.P(n8) + j.R(n9);
    }

    public static int R(int n8) {
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

    public static int S(int n8, long l8) {
        return j.P(n8) + j.T(l8);
    }

    public static int T(long l8) {
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

    public static int U(int n8) {
        return n8 >> 31 ^ n8 << 1;
    }

    public static long V(long l8) {
        return l8 >> 63 ^ l8 << 1;
    }

    public static j Z(OutputStream outputStream, int n8) {
        return new d(outputStream, n8);
    }

    public static int c(int n8, boolean bl) {
        return j.P(n8) + j.d(bl);
    }

    public static int d(boolean bl) {
        return 1;
    }

    public static int e(byte[] arrby) {
        return j.y(arrby.length);
    }

    public static int f(int n8, g g8) {
        return j.P(n8) + j.g(g8);
    }

    public static int g(g g8) {
        return j.y(g8.size());
    }

    public static int h(int n8, double d8) {
        return j.P(n8) + j.i(d8);
    }

    public static int i(double d8) {
        return 8;
    }

    public static int j(int n8, int n9) {
        return j.P(n8) + j.k(n9);
    }

    public static int k(int n8) {
        return j.v(n8);
    }

    public static int l(int n8, int n9) {
        return j.P(n8) + j.m(n9);
    }

    public static int m(int n8) {
        return 4;
    }

    public static int n(int n8, long l8) {
        return j.P(n8) + j.o(l8);
    }

    public static int o(long l8) {
        return 8;
    }

    public static int p(int n8, float f8) {
        return j.P(n8) + j.q(f8);
    }

    public static int q(float f8) {
        return 4;
    }

    public static int r(int n8, O o8, e0 e02) {
        return j.P(n8) * 2 + j.t(o8, e02);
    }

    public static int s(O o8) {
        return o8.a();
    }

    public static int t(O o8, e0 e02) {
        return ((a)o8).j(e02);
    }

    public static int u(int n8, int n9) {
        return j.P(n8) + j.v(n9);
    }

    public static int v(int n8) {
        if (n8 >= 0) {
            return j.R(n8);
        }
        return 10;
    }

    public static int w(int n8, long l8) {
        return j.P(n8) + j.x(l8);
    }

    public static int x(long l8) {
        return j.T(l8);
    }

    public static int y(int n8) {
        return j.R(n8) + n8;
    }

    public static int z(int n8, O o8, e0 e02) {
        return j.P(n8) + j.B(o8, e02);
    }

    public abstract void A0(O var1);

    public abstract void B0(int var1, O var2);

    public abstract void C0(int var1, g var2);

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
        this.O0(n8, j.U(n9));
    }

    public final void I0(int n8) {
        this.P0(j.U(n8));
    }

    public final void J0(int n8, long l8) {
        this.Q0(n8, j.V(l8));
    }

    public final void K0(long l8) {
        this.R0(j.V(l8));
    }

    public abstract void L0(int var1, String var2);

    public abstract void M0(String var1);

    public abstract void N0(int var1, int var2);

    public abstract void O0(int var1, int var2);

    public abstract void P0(int var1);

    public abstract void Q0(int var1, long var2);

    public abstract void R0(long var1);

    public abstract void W();

    public final void X(String arrby, q0.d d8) {
        IndexOutOfBoundsException indexOutOfBoundsException2;
        block3 : {
            c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable)d8);
            arrby = arrby.getBytes(y.a);
            try {
                this.P0(arrby.length);
                this.a(arrby, 0, arrby.length);
                return;
            }
            catch (c c8) {
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                break block3;
            }
            throw c8;
        }
        throw new c((Throwable)indexOutOfBoundsException2);
    }

    public boolean Y() {
        return this.b;
    }

    @Override
    public abstract void a(byte[] var1, int var2, int var3);

    public abstract void a0(byte var1);

    public abstract void b0(int var1, boolean var2);

    public final void c0(boolean bl) {
        this.a0((byte)(bl ? 1 : 0));
    }

    public final void d0(byte[] arrby) {
        this.e0(arrby, 0, arrby.length);
    }

    public abstract void e0(byte[] var1, int var2, int var3);

    public abstract void f0(int var1, g var2);

    public abstract void g0(g var1);

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

    public final void r0(int n8, O o8) {
        this.N0(n8, 3);
        this.t0(o8);
        this.N0(n8, 4);
    }

    public final void s0(int n8, O o8, e0 e02) {
        this.N0(n8, 3);
        this.u0(o8, e02);
        this.N0(n8, 4);
    }

    public final void t0(O o8) {
        o8.g(this);
    }

    public final void u0(O o8, e0 e02) {
        e02.i(o8, this.a);
    }

    public abstract void v0(int var1, int var2);

    public abstract void w0(int var1);

    public final void x0(int n8, long l8) {
        this.Q0(n8, l8);
    }

    public final void y0(long l8) {
        this.R0(l8);
    }

    public abstract void z0(int var1, O var2, e0 var3);

    public static abstract class b
    extends j {
        public final byte[] e;
        public final int f;
        public int g;
        public int h;

        public b(int n8) {
            super(null);
            if (n8 >= 0) {
                byte[] arrby = new byte[Math.max((int)n8, (int)20)];
                this.e = arrby;
                this.f = arrby.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        public final void S0(byte by) {
            byte[] arrby = this.e;
            int n8 = this.g;
            this.g = n8 + 1;
            arrby[n8] = by;
            ++this.h;
        }

        public final void T0(int n8) {
            byte[] arrby = this.e;
            int n9 = this.g;
            arrby[n9] = (byte)(n8 & 255);
            arrby[n9 + 1] = (byte)(n8 >> 8 & 255);
            arrby[n9 + 2] = (byte)(n8 >> 16 & 255);
            this.g = n9 + 4;
            arrby[n9 + 3] = (byte)(n8 >> 24 & 255);
            this.h += 4;
        }

        public final void U0(long l8) {
            byte[] arrby = this.e;
            int n8 = this.g;
            arrby[n8] = (byte)(l8 & 255L);
            arrby[n8 + 1] = (byte)(l8 >> 8 & 255L);
            arrby[n8 + 2] = (byte)(l8 >> 16 & 255L);
            arrby[n8 + 3] = (byte)(255L & l8 >> 24);
            arrby[n8 + 4] = (byte)((int)(l8 >> 32) & 255);
            arrby[n8 + 5] = (byte)((int)(l8 >> 40) & 255);
            arrby[n8 + 6] = (byte)((int)(l8 >> 48) & 255);
            this.g = n8 + 8;
            arrby[n8 + 7] = (byte)((int)(l8 >> 56) & 255);
            this.h += 8;
        }

        public final void V0(int n8) {
            if (n8 >= 0) {
                this.X0(n8);
                return;
            }
            this.Y0(n8);
        }

        public final void W0(int n8, int n9) {
            this.X0(r0.c(n8, n9));
        }

        public final void X0(int n8) {
            int n9 = n8;
            if (d) {
                long l8 = this.g;
                do {
                    byte[] arrby;
                    if ((n8 & -128) == 0) {
                        arrby = this.e;
                        n9 = this.g;
                        this.g = n9 + 1;
                        p0.H(arrby, n9, (byte)n8);
                        n8 = (int)((long)this.g - l8);
                        this.h += n8;
                        return;
                    }
                    arrby = this.e;
                    n9 = this.g;
                    this.g = n9 + 1;
                    p0.H(arrby, n9, (byte)(n8 & 127 | 128));
                    n8 >>>= 7;
                } while (true);
            }
            do {
                byte[] arrby;
                if ((n9 & -128) == 0) {
                    arrby = this.e;
                    n8 = this.g;
                    this.g = n8 + 1;
                    arrby[n8] = (byte)n9;
                    ++this.h;
                    return;
                }
                arrby = this.e;
                n8 = this.g;
                this.g = n8 + 1;
                arrby[n8] = (byte)(n9 & 127 | 128);
                ++this.h;
                n9 >>>= 7;
            } while (true);
        }

        public final void Y0(long l8) {
            long l9 = l8;
            if (d) {
                l9 = this.g;
                do {
                    int n8;
                    byte[] arrby;
                    if ((l8 & -128L) == 0L) {
                        arrby = this.e;
                        n8 = this.g;
                        this.g = n8 + 1;
                        p0.H(arrby, n8, (byte)l8);
                        n8 = (int)((long)this.g - l9);
                        this.h += n8;
                        return;
                    }
                    arrby = this.e;
                    n8 = this.g;
                    this.g = n8 + 1;
                    p0.H(arrby, n8, (byte)((int)l8 & 127 | 128));
                    l8 >>>= 7;
                } while (true);
            }
            do {
                int n9;
                byte[] arrby;
                if ((l9 & -128L) == 0L) {
                    arrby = this.e;
                    n9 = this.g;
                    this.g = n9 + 1;
                    arrby[n9] = (byte)l9;
                    ++this.h;
                    return;
                }
                arrby = this.e;
                n9 = this.g;
                this.g = n9 + 1;
                arrby[n9] = (byte)((int)l9 & 127 | 128);
                ++this.h;
                l9 >>>= 7;
            } while (true);
        }
    }

    public static class c
    extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public c(Throwable throwable) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable);
        }
    }

    public static final class d
    extends b {
        public final OutputStream i;

        public d(OutputStream outputStream, int n8) {
            super(n8);
            if (outputStream != null) {
                this.i = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        @Override
        public void A0(O o8) {
            this.P0(o8.a());
            o8.g(this);
        }

        @Override
        public void B0(int n8, O o8) {
            this.N0(1, 3);
            this.O0(2, n8);
            this.c1(3, o8);
            this.N0(1, 4);
        }

        @Override
        public void C0(int n8, g g8) {
            this.N0(1, 3);
            this.O0(2, n8);
            this.f0(3, g8);
            this.N0(1, 4);
        }

        @Override
        public void L0(int n8, String string2) {
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
        public void M0(String var1_1) {
            try {
                var3_2 = var1_1.length() * 3;
                var2_3 = j.R(var3_2);
            }
            catch (q0.d var6_9) {}
            var4_4 = var2_3 + var3_2;
            var5_5 = this.f;
            if (var4_4 > var5_5) {
                var6_6 = new byte[var3_2];
                var2_3 = q0.f(var1_1, var6_6, 0, var3_2);
                this.P0(var2_3);
                this.a(var6_6, 0, var2_3);
                return;
            }
            if (var4_4 > var5_5 - this.g) {
                this.Z0();
            }
            var4_4 = j.R(var1_1.length());
            var3_2 = this.g;
            if (var4_4 != var2_3) ** GOTO lbl29
            var2_3 = var3_2 + var4_4;
            this.g = var2_3;
            var5_5 = q0.f(var1_1, this.e, var2_3, this.f - var2_3);
            this.g = var3_2;
            var2_3 = var5_5 - var3_2 - var4_4;
            try {
                block10 : {
                    this.X0(var2_3);
                    this.g = var5_5;
                    break block10;
lbl29: // 1 sources:
                    var2_3 = q0.g(var1_1);
                    this.X0(var2_3);
                    this.g = q0.f(var1_1, this.e, this.g, var2_3);
                }
                this.h += var2_3;
                return;
            }
            catch (ArrayIndexOutOfBoundsException var6_7) {}
            throw new c((Throwable)var6_7);
            this.X(var1_1, var6_9);
            return;
            catch (q0.d var6_8) {}
            this.h -= this.g - var3_2;
            this.g = var3_2;
            throw var6_8;
        }

        @Override
        public void N0(int n8, int n9) {
            this.P0(r0.c(n8, n9));
        }

        @Override
        public void O0(int n8, int n9) {
            this.a1(20);
            this.W0(n8, 0);
            this.X0(n9);
        }

        @Override
        public void P0(int n8) {
            this.a1(5);
            this.X0(n8);
        }

        @Override
        public void Q0(int n8, long l8) {
            this.a1(20);
            this.W0(n8, 0);
            this.Y0(l8);
        }

        @Override
        public void R0(long l8) {
            this.a1(10);
            this.Y0(l8);
        }

        @Override
        public void W() {
            if (this.g > 0) {
                this.Z0();
            }
        }

        public final void Z0() {
            this.i.write(this.e, 0, this.g);
            this.g = 0;
        }

        @Override
        public void a(byte[] arrby, int n8, int n9) {
            this.b1(arrby, n8, n9);
        }

        @Override
        public void a0(byte by) {
            if (this.g == this.f) {
                this.Z0();
            }
            this.S0(by);
        }

        public final void a1(int n8) {
            if (this.f - this.g < n8) {
                this.Z0();
            }
        }

        @Override
        public void b0(int n8, boolean bl) {
            this.a1(11);
            this.W0(n8, 0);
            this.S0((byte)(bl ? 1 : 0));
        }

        /*
         * Enabled aggressive block sorting
         */
        public void b1(byte[] arrby, int n8, int n9) {
            int n10 = this.f;
            int n11 = this.g;
            if (n10 - n11 >= n9) {
                System.arraycopy((Object)arrby, (int)n8, (Object)this.e, (int)n11, (int)n9);
                this.g += n9;
            } else {
                System.arraycopy((Object)arrby, (int)n8, (Object)this.e, (int)n11, (int)(n10 -= n11));
                n8 += n10;
                this.g = this.f;
                this.h += n10;
                this.Z0();
                if ((n9 -= n10) <= this.f) {
                    System.arraycopy((Object)arrby, (int)n8, (Object)this.e, (int)0, (int)n9);
                    this.g = n9;
                } else {
                    this.i.write(arrby, n8, n9);
                }
            }
            this.h += n9;
        }

        public void c1(int n8, O o8) {
            this.N0(n8, 2);
            this.A0(o8);
        }

        public void d1(O o8, e0 e02) {
            this.P0(((a)o8).j(e02));
            e02.i(o8, this.a);
        }

        @Override
        public void e0(byte[] arrby, int n8, int n9) {
            this.P0(n9);
            this.b1(arrby, n8, n9);
        }

        @Override
        public void f0(int n8, g g8) {
            this.N0(n8, 2);
            this.g0(g8);
        }

        @Override
        public void g0(g g8) {
            this.P0(g8.size());
            g8.d0(this);
        }

        @Override
        public void l0(int n8, int n9) {
            this.a1(14);
            this.W0(n8, 5);
            this.T0(n9);
        }

        @Override
        public void m0(int n8) {
            this.a1(4);
            this.T0(n8);
        }

        @Override
        public void n0(int n8, long l8) {
            this.a1(18);
            this.W0(n8, 1);
            this.U0(l8);
        }

        @Override
        public void o0(long l8) {
            this.a1(8);
            this.U0(l8);
        }

        @Override
        public void v0(int n8, int n9) {
            this.a1(20);
            this.W0(n8, 0);
            this.V0(n9);
        }

        @Override
        public void w0(int n8) {
            if (n8 >= 0) {
                this.P0(n8);
                return;
            }
            this.R0(n8);
        }

        @Override
        public void z0(int n8, O o8, e0 e02) {
            this.N0(n8, 2);
            this.d1(o8, e02);
        }
    }

}

