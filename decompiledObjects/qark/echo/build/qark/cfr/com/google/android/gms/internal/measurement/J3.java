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
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D5;
import com.google.android.gms.internal.measurement.E5;
import com.google.android.gms.internal.measurement.H5;
import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.K3;
import com.google.android.gms.internal.measurement.L3;
import com.google.android.gms.internal.measurement.T5;
import com.google.android.gms.internal.measurement.Z4;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.j3;
import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.measurement.r3;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class J3
extends r3 {
    public static final Logger b = Logger.getLogger((String)J3.class.getName());
    public static final boolean c = D5.w();
    public L3 a;

    public J3() {
    }

    public /* synthetic */ J3(K3 k32) {
        this();
    }

    public static int A(q3 q32) {
        int n8 = q32.S();
        return J3.v0(n8) + n8;
    }

    public static int B(I4 i42) {
        return i42.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int C(String string2) {
        int n8;
        try {
            n8 = E5.a(string2);
            return J3.v0(n8) + n8;
        }
        catch (H5 h52) {}
        n8 = string2.getBytes(a4.b).length;
        return J3.v0(n8) + n8;
    }

    public static J3 D(byte[] arrby) {
        return new a(arrby, 0, arrby.length);
    }

    public static int P(int n8, long l8) {
        return J3.v0(n8 << 3) + 8;
    }

    public static int Q(int n8, q3 q32) {
        n8 = J3.v0(n8 << 3);
        int n9 = q32.S();
        return n8 + (J3.v0(n9) + n9);
    }

    public static int R(int n8, I4 i42, Z4 z42) {
        return J3.v0(n8 << 3) + J3.g(i42, z42);
    }

    public static int S(long l8) {
        return 8;
    }

    public static int T(I4 i42) {
        int n8 = i42.a();
        return J3.v0(n8) + n8;
    }

    public static int X(int n8) {
        return J3.g0(n8);
    }

    public static int Y(int n8, long l8) {
        return J3.v0(n8 << 3) + J3.n0(l8);
    }

    public static int Z(int n8, q3 q32) {
        return (J3.v0(8) << 1) + J3.w0(2, n8) + J3.Q(3, q32);
    }

    public static int a0(long l8) {
        return J3.n0(l8);
    }

    public static int c(double d8) {
        return 8;
    }

    public static int c0(int n8) {
        return 4;
    }

    public static int d(float f8) {
        return 4;
    }

    public static int d0(int n8, int n9) {
        return J3.v0(n8 << 3) + J3.g0(n9);
    }

    public static int e(int n8, double d8) {
        return J3.v0(n8 << 3) + 8;
    }

    public static int e0(int n8, long l8) {
        return J3.v0(n8 << 3) + 8;
    }

    public static int f(int n8, float f8) {
        return J3.v0(n8 << 3) + 4;
    }

    public static int f0(long l8) {
        return 8;
    }

    public static int g(I4 i42, Z4 z42) {
        int n8 = ((j3)i42).c(z42);
        return J3.v0(n8) + n8;
    }

    public static int g0(int n8) {
        if (n8 >= 0) {
            return J3.v0(n8);
        }
        return 10;
    }

    public static int h(boolean bl) {
        return 1;
    }

    public static int h0(int n8, int n9) {
        return J3.v0(n8 << 3) + 4;
    }

    public static int i(byte[] arrby) {
        int n8 = arrby.length;
        return J3.v0(n8) + n8;
    }

    public static int i0(int n8, long l8) {
        return J3.v0(n8 << 3) + J3.n0(J3.u0(l8));
    }

    public static int j0(long l8) {
        return J3.n0(J3.u0(l8));
    }

    public static int k0(int n8) {
        return 4;
    }

    public static int l0(int n8, int n9) {
        return J3.v0(n8 << 3) + J3.g0(n9);
    }

    public static int m0(int n8, long l8) {
        return J3.v0(n8 << 3) + J3.n0(l8);
    }

    public static int n0(long l8) {
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

    public static int o0(int n8) {
        return J3.v0(J3.z0(n8));
    }

    public static int p0(int n8, int n9) {
        return J3.v0(n8 << 3) + 4;
    }

    public static int s0(int n8) {
        return J3.v0(n8 << 3);
    }

    public static int t0(int n8, int n9) {
        return J3.v0(n8 << 3) + J3.v0(J3.z0(n9));
    }

    public static long u0(long l8) {
        return l8 >> 63 ^ l8 << 1;
    }

    public static int v0(int n8) {
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

    public static int w0(int n8, int n9) {
        return J3.v0(n8 << 3) + J3.v0(n9);
    }

    public static int x(int n8, I4 i42, Z4 z42) {
        return (J3.v0(n8 << 3) << 1) + ((j3)i42).c(z42);
    }

    public static int y(int n8, String string2) {
        return J3.v0(n8 << 3) + J3.C(string2);
    }

    public static int z(int n8, boolean bl) {
        return J3.v0(n8 << 3) + 1;
    }

    public static int z0(int n8) {
        return n8 >> 31 ^ n8 << 1;
    }

    public final void E() {
        if (this.b() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public final void F(double d8) {
        this.s(Double.doubleToRawLongBits((double)d8));
    }

    public final void G(float f8) {
        this.k(Float.floatToRawIntBits((float)f8));
    }

    public abstract void H(int var1);

    public final void I(int n8, double d8) {
        this.m(n8, Double.doubleToRawLongBits((double)d8));
    }

    public final void J(int n8, float f8) {
        this.l(n8, Float.floatToRawIntBits((float)f8));
    }

    public abstract void K(int var1, int var2);

    public abstract void L(int var1, long var2);

    public abstract void M(int var1, q3 var2);

    public abstract void N(long var1);

    public final void O(boolean bl) {
        this.j((byte)(bl ? 1 : 0));
    }

    public abstract void U(int var1);

    public abstract void V(int var1, int var2);

    public abstract int b();

    public abstract void b0(int var1, int var2);

    public abstract void j(byte var1);

    public abstract void k(int var1);

    public abstract void l(int var1, int var2);

    public abstract void m(int var1, long var2);

    public abstract void n(int var1, q3 var2);

    public abstract void o(int var1, I4 var2);

    public abstract void p(int var1, I4 var2, Z4 var3);

    public abstract void q(int var1, String var2);

    public final void q0(int n8, long l8) {
        this.L(n8, J3.u0(l8));
    }

    public abstract void r(int var1, boolean var2);

    public final void r0(long l8) {
        this.N(J3.u0(l8));
    }

    public abstract void s(long var1);

    public abstract void t(q3 var1);

    public abstract void u(I4 var1);

    public abstract void v(String var1);

    public final void w(String arrby, H5 h52) {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable)h52);
        arrby = arrby.getBytes(a4.b);
        try {
            this.U(arrby.length);
            this.a(arrby, 0, arrby.length);
            return;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new b((Throwable)indexOutOfBoundsException);
        }
    }

    public final void x0(int n8) {
        this.U(J3.z0(n8));
    }

    public final void y0(int n8, int n9) {
        this.b0(n8, J3.z0(n9));
    }

    public static final class a
    extends J3 {
        public final byte[] d;
        public final int e;
        public final int f;
        public int g;

        public a(byte[] arrby, int n8, int n9) {
            super(null);
            if (arrby != null) {
                if ((arrby.length - n9 | n9) >= 0) {
                    this.d = arrby;
                    this.e = 0;
                    this.g = 0;
                    this.f = n9;
                    return;
                }
                throw new IllegalArgumentException(String.format((String)"Array range is invalid. Buffer.length=%d, offset=%d, length=%d", (Object[])new Object[]{arrby.length, 0, n9}));
            }
            throw new NullPointerException("buffer");
        }

        public final void A0(byte[] arrby, int n8, int n9) {
            try {
                System.arraycopy((Object)arrby, (int)n8, (Object)this.d, (int)this.g, (int)n9);
                this.g += n9;
                return;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw new b(String.format((String)"Pos: %d, limit: %d, len: %d", (Object[])new Object[]{this.g, this.f, n9}), (Throwable)indexOutOfBoundsException);
            }
        }

        @Override
        public final void H(int n8) {
            if (n8 >= 0) {
                this.U(n8);
                return;
            }
            this.N(n8);
        }

        @Override
        public final void K(int n8, int n9) {
            this.V(n8, 0);
            this.H(n9);
        }

        @Override
        public final void L(int n8, long l8) {
            this.V(n8, 0);
            this.N(l8);
        }

        @Override
        public final void M(int n8, q3 q32) {
            this.V(1, 3);
            this.b0(2, n8);
            this.n(3, q32);
            this.V(1, 4);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        @Override
        public final void N(long var1_1) {
            var4_2 = var1_1;
            if (J3.W()) {
                var4_2 = var1_1;
                if (this.b() >= 10) {
                    do {
                        if ((var1_1 & -128L) == 0L) {
                            var6_5 = this.d;
                            var3_3 = this.g;
                            this.g = 1 + var3_3;
                            D5.m(var6_5, var3_3, (byte)var1_1);
                            return;
                        }
                        var6_5 = this.d;
                        var3_3 = this.g;
                        this.g = var3_3 + 1;
                        D5.m(var6_5, var3_3, (byte)((int)var1_1 & 127 | 128));
                        var1_1 >>>= 7;
                    } while (true);
                }
            }
            do lbl-1000: // 2 sources:
            {
                if ((var4_2 & -128L) == 0L) {
                    var6_6 = this.d;
                    var3_4 = this.g;
                    this.g = var3_4 + 1;
                    var6_6[var3_4] = (byte)var4_2;
                    return;
                }
                var6_6 = this.d;
                var3_4 = this.g;
                this.g = var3_4 + 1;
                break;
            } while (true);
            catch (IndexOutOfBoundsException var6_7) {}
            {
                var6_6[var3_4] = (byte)((int)var4_2 & 127 | 128);
                var4_2 >>>= 7;
                ** while (true)
            }
            throw new b(String.format((String)"Pos: %d, limit: %d, len: %d", (Object[])new Object[]{this.g, this.f, 1}), (Throwable)var6_7);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        @Override
        public final void U(int var1_1) {
            do lbl-1000: // 2 sources:
            {
                if ((var1_1 & -128) == 0) {
                    var3_3 = this.d;
                    var2_2 = this.g;
                    this.g = var2_2 + 1;
                    var3_3[var2_2] = (byte)var1_1;
                    return;
                }
                var3_3 = this.d;
                var2_2 = this.g;
                this.g = var2_2 + 1;
                break;
            } while (true);
            catch (IndexOutOfBoundsException var3_4) {}
            {
                var3_3[var2_2] = (byte)(var1_1 & 127 | 128);
                var1_1 >>>= 7;
                ** while (true)
            }
            throw new b(String.format((String)"Pos: %d, limit: %d, len: %d", (Object[])new Object[]{this.g, this.f, 1}), (Throwable)var3_4);
        }

        @Override
        public final void V(int n8, int n9) {
            this.U(n8 << 3 | n9);
        }

        @Override
        public final void a(byte[] arrby, int n8, int n9) {
            this.A0(arrby, n8, n9);
        }

        @Override
        public final int b() {
            return this.f - this.g;
        }

        @Override
        public final void b0(int n8, int n9) {
            this.V(n8, 0);
            this.U(n9);
        }

        @Override
        public final void j(byte by) {
            try {
                byte[] arrby = this.d;
                int n8 = this.g;
                this.g = n8 + 1;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw new b(String.format((String)"Pos: %d, limit: %d, len: %d", (Object[])new Object[]{this.g, this.f, 1}), (Throwable)indexOutOfBoundsException);
            }
            arrby[n8] = by;
        }

        @Override
        public final void k(int n8) {
            int n9;
            try {
                byte[] arrby = this.d;
                n9 = this.g;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw new b(String.format((String)"Pos: %d, limit: %d, len: %d", (Object[])new Object[]{this.g, this.f, 1}), (Throwable)indexOutOfBoundsException);
            }
            arrby[n9] = (byte)n8;
            arrby[n9 + 1] = (byte)(n8 >> 8);
            arrby[n9 + 2] = (byte)(n8 >> 16);
            this.g = n9 + 4;
            arrby[n9 + 3] = (byte)(n8 >>> 24);
        }

        @Override
        public final void l(int n8, int n9) {
            this.V(n8, 5);
            this.k(n9);
        }

        @Override
        public final void m(int n8, long l8) {
            this.V(n8, 1);
            this.s(l8);
        }

        @Override
        public final void n(int n8, q3 q32) {
            this.V(n8, 2);
            this.t(q32);
        }

        @Override
        public final void o(int n8, I4 i42) {
            this.V(1, 3);
            this.b0(2, n8);
            this.V(3, 2);
            this.u(i42);
            this.V(1, 4);
        }

        @Override
        public final void p(int n8, I4 i42, Z4 z42) {
            this.V(n8, 2);
            this.U(((j3)i42).c(z42));
            z42.i(i42, this.a);
        }

        @Override
        public final void q(int n8, String string2) {
            this.V(n8, 2);
            this.v(string2);
        }

        @Override
        public final void r(int n8, boolean bl) {
            this.V(n8, 0);
            this.j((byte)(bl ? 1 : 0));
        }

        @Override
        public final void s(long l8) {
            int n8;
            try {
                byte[] arrby = this.d;
                n8 = this.g;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw new b(String.format((String)"Pos: %d, limit: %d, len: %d", (Object[])new Object[]{this.g, this.f, 1}), (Throwable)indexOutOfBoundsException);
            }
            arrby[n8] = (byte)l8;
            arrby[n8 + 1] = (byte)(l8 >> 8);
            arrby[n8 + 2] = (byte)(l8 >> 16);
            arrby[n8 + 3] = (byte)(l8 >> 24);
            arrby[n8 + 4] = (byte)(l8 >> 32);
            arrby[n8 + 5] = (byte)(l8 >> 40);
            arrby[n8 + 6] = (byte)(l8 >> 48);
            this.g = n8 + 8;
            arrby[n8 + 7] = (byte)(l8 >> 56);
        }

        @Override
        public final void t(q3 q32) {
            this.U(q32.S());
            q32.D(this);
        }

        @Override
        public final void u(I4 i42) {
            this.U(i42.a());
            i42.f(this);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        @Override
        public final void v(String var1_1) {
            var2_3 = this.g;
            var4_4 = J3.v0(var1_1.length() * 3);
            var3_5 = J3.v0(var1_1.length());
            if (var3_5 != var4_4) ** GOTO lbl14
            var4_4 = var2_3 + var3_5;
            try {
                this.g = var4_4;
                var4_4 = E5.b(var1_1, this.d, var4_4, this.b());
                this.g = var2_3;
                this.U(var4_4 - var2_3 - var3_5);
                this.g = var4_4;
                return;
lbl14: // 1 sources:
                this.U(E5.a(var1_1));
                this.g = E5.b(var1_1, this.d, this.g, this.b());
                return;
            }
            catch (IndexOutOfBoundsException var1_2) {
                throw new b((Throwable)var1_2);
            }
            catch (H5 var5_6) {}
            this.g = var2_3;
            this.w(var1_1, var5_6);
        }
    }

    public static final class b
    extends IOException {
        public b(String string2, Throwable throwable) {
            StringBuilder stringBuilder = new StringBuilder("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            stringBuilder.append(string2);
            super(stringBuilder.toString(), throwable);
        }

        public b(Throwable throwable) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable);
        }
    }

}

