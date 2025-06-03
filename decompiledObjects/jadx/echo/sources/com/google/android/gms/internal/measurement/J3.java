package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class J3 extends AbstractC1011r3 {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f10443b = Logger.getLogger(J3.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f10444c = D5.w();

    /* renamed from: a, reason: collision with root package name */
    public L3 f10445a;

    public static class a extends J3 {

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f10446d;

        /* renamed from: e, reason: collision with root package name */
        public final int f10447e;

        /* renamed from: f, reason: collision with root package name */
        public final int f10448f;

        /* renamed from: g, reason: collision with root package name */
        public int f10449g;

        public a(byte[] bArr, int i7, int i8) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i8) | i8) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i8)));
            }
            this.f10446d = bArr;
            this.f10447e = 0;
            this.f10449g = 0;
            this.f10448f = i8;
        }

        public final void A0(byte[] bArr, int i7, int i8) {
            try {
                System.arraycopy(bArr, i7, this.f10446d, this.f10449g, i8);
                this.f10449g += i8;
            } catch (IndexOutOfBoundsException e7) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10449g), Integer.valueOf(this.f10448f), Integer.valueOf(i8)), e7);
            }
        }

        @Override // com.google.android.gms.internal.measurement.J3
        public final void H(int i7) {
            if (i7 >= 0) {
                U(i7);
            } else {
                N(i7);
            }
        }

        @Override // com.google.android.gms.internal.measurement.J3
        public final void K(int i7, int i8) {
            V(i7, 0);
            H(i8);
        }

        @Override // com.google.android.gms.internal.measurement.J3
        public final void L(int i7, long j7) {
            V(i7, 0);
            N(j7);
        }

        @Override // com.google.android.gms.internal.measurement.J3
        public final void M(int i7, AbstractC1003q3 abstractC1003q3) {
            V(1, 3);
            b0(2, i7);
            n(3, abstractC1003q3);
            V(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.J3
        public final void N(long j7) {
            if (J3.f10444c && b() >= 10) {
                while ((j7 & (-128)) != 0) {
                    byte[] bArr = this.f10446d;
                    int i7 = this.f10449g;
                    this.f10449g = i7 + 1;
                    D5.m(bArr, i7, (byte) ((((int) j7) & 127) | 128));
                    j7 >>>= 7;
                }
                byte[] bArr2 = this.f10446d;
                int i8 = this.f10449g;
                this.f10449g = 1 + i8;
                D5.m(bArr2, i8, (byte) j7);
                return;
            }
            while ((j7 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f10446d;
                    int i9 = this.f10449g;
                    this.f10449g = i9 + 1;
                    bArr3[i9] = (byte) ((((int) j7) & 127) | 128);
                    j7 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10449g), Integer.valueOf(this.f10448f), 1), e7);
                }
            }
            byte[] bArr4 = this.f10446d;
            int i10 = this.f10449g;
            this.f10449g = i10 + 1;
            bArr4[i10] = (byte) j7;
        }

        @Override // com.google.android.gms.internal.measurement.J3
        public final void U(int i7) {
            while ((i7 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f10446d;
                    int i8 = this.f10449g;
                    this.f10449g = i8 + 1;
                    bArr[i8] = (byte) ((i7 & 127) | 128);
                    i7 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10449g), Integer.valueOf(this.f10448f), 1), e7);
                }
            }
            byte[] bArr2 = this.f10446d;
            int i9 = this.f10449g;
            this.f10449g = i9 + 1;
            bArr2[i9] = (byte) i7;
        }

        @Override // com.google.android.gms.internal.measurement.J3
        public final void V(int i7, int i8) {
            U((i7 << 3) | i8);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1011r3
        public final void a(byte[] bArr, int i7, int i8) {
            A0(bArr, i7, i8);
        }

        @Override // com.google.android.gms.internal.measurement.J3
        public final int b() {
            return this.f10448f - this.f10449g;
        }

        @Override // com.google.android.gms.internal.measurement.J3
        public final void b0(int i7, int i8) {
            V(i7, 0);
            U(i8);
        }

        @Override // com.google.android.gms.internal.measurement.J3
        public final void j(byte b7) {
            try {
                byte[] bArr = this.f10446d;
                int i7 = this.f10449g;
                this.f10449g = i7 + 1;
                bArr[i7] = b7;
            } catch (IndexOutOfBoundsException e7) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10449g), Integer.valueOf(this.f10448f), 1), e7);
            }
        }

        @Override // com.google.android.gms.internal.measurement.J3
        public final void k(int i7) {
            try {
                byte[] bArr = this.f10446d;
                int i8 = this.f10449g;
                bArr[i8] = (byte) i7;
                bArr[i8 + 1] = (byte) (i7 >> 8);
                bArr[i8 + 2] = (byte) (i7 >> 16);
                this.f10449g = i8 + 4;
                bArr[i8 + 3] = (byte) (i7 >>> 24);
            } catch (IndexOutOfBoundsException e7) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10449g), Integer.valueOf(this.f10448f), 1), e7);
            }
        }

        @Override // com.google.android.gms.internal.measurement.J3
        public final void l(int i7, int i8) {
            V(i7, 5);
            k(i8);
        }

        @Override // com.google.android.gms.internal.measurement.J3
        public final void m(int i7, long j7) {
            V(i7, 1);
            s(j7);
        }

        @Override // com.google.android.gms.internal.measurement.J3
        public final void n(int i7, AbstractC1003q3 abstractC1003q3) {
            V(i7, 2);
            t(abstractC1003q3);
        }

        @Override // com.google.android.gms.internal.measurement.J3
        public final void o(int i7, I4 i42) {
            V(1, 3);
            b0(2, i7);
            V(3, 2);
            u(i42);
            V(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.J3
        public final void p(int i7, I4 i42, Z4 z42) {
            V(i7, 2);
            U(((AbstractC0940j3) i42).c(z42));
            z42.i(i42, this.f10445a);
        }

        @Override // com.google.android.gms.internal.measurement.J3
        public final void q(int i7, String str) {
            V(i7, 2);
            v(str);
        }

        @Override // com.google.android.gms.internal.measurement.J3
        public final void r(int i7, boolean z7) {
            V(i7, 0);
            j(z7 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.J3
        public final void s(long j7) {
            try {
                byte[] bArr = this.f10446d;
                int i7 = this.f10449g;
                bArr[i7] = (byte) j7;
                bArr[i7 + 1] = (byte) (j7 >> 8);
                bArr[i7 + 2] = (byte) (j7 >> 16);
                bArr[i7 + 3] = (byte) (j7 >> 24);
                bArr[i7 + 4] = (byte) (j7 >> 32);
                bArr[i7 + 5] = (byte) (j7 >> 40);
                bArr[i7 + 6] = (byte) (j7 >> 48);
                this.f10449g = i7 + 8;
                bArr[i7 + 7] = (byte) (j7 >> 56);
            } catch (IndexOutOfBoundsException e7) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10449g), Integer.valueOf(this.f10448f), 1), e7);
            }
        }

        @Override // com.google.android.gms.internal.measurement.J3
        public final void t(AbstractC1003q3 abstractC1003q3) {
            U(abstractC1003q3.S());
            abstractC1003q3.D(this);
        }

        @Override // com.google.android.gms.internal.measurement.J3
        public final void u(I4 i42) {
            U(i42.a());
            i42.f(this);
        }

        @Override // com.google.android.gms.internal.measurement.J3
        public final void v(String str) {
            int i7 = this.f10449g;
            try {
                int v02 = J3.v0(str.length() * 3);
                int v03 = J3.v0(str.length());
                if (v03 != v02) {
                    U(E5.a(str));
                    this.f10449g = E5.b(str, this.f10446d, this.f10449g, b());
                    return;
                }
                int i8 = i7 + v03;
                this.f10449g = i8;
                int b7 = E5.b(str, this.f10446d, i8, b());
                this.f10449g = i7;
                U((b7 - i7) - v03);
                this.f10449g = b7;
            } catch (H5 e7) {
                this.f10449g = i7;
                w(str, e7);
            } catch (IndexOutOfBoundsException e8) {
                throw new b(e8);
            }
        }
    }

    public static class b extends IOException {
        public b(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        public b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    public J3() {
    }

    public static int A(AbstractC1003q3 abstractC1003q3) {
        int S6 = abstractC1003q3.S();
        return v0(S6) + S6;
    }

    public static int B(I4 i42) {
        return i42.a();
    }

    public static int C(String str) {
        int length;
        try {
            length = E5.a(str);
        } catch (H5 unused) {
            length = str.getBytes(AbstractC0860a4.f10823b).length;
        }
        return v0(length) + length;
    }

    public static J3 D(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int P(int i7, long j7) {
        return v0(i7 << 3) + 8;
    }

    public static int Q(int i7, AbstractC1003q3 abstractC1003q3) {
        int v02 = v0(i7 << 3);
        int S6 = abstractC1003q3.S();
        return v02 + v0(S6) + S6;
    }

    public static int R(int i7, I4 i42, Z4 z42) {
        return v0(i7 << 3) + g(i42, z42);
    }

    public static int S(long j7) {
        return 8;
    }

    public static int T(I4 i42) {
        int a7 = i42.a();
        return v0(a7) + a7;
    }

    public static int X(int i7) {
        return g0(i7);
    }

    public static int Y(int i7, long j7) {
        return v0(i7 << 3) + n0(j7);
    }

    public static int Z(int i7, AbstractC1003q3 abstractC1003q3) {
        return (v0(8) << 1) + w0(2, i7) + Q(3, abstractC1003q3);
    }

    public static int a0(long j7) {
        return n0(j7);
    }

    public static int c(double d7) {
        return 8;
    }

    public static int c0(int i7) {
        return 4;
    }

    public static int d(float f7) {
        return 4;
    }

    public static int d0(int i7, int i8) {
        return v0(i7 << 3) + g0(i8);
    }

    public static int e(int i7, double d7) {
        return v0(i7 << 3) + 8;
    }

    public static int e0(int i7, long j7) {
        return v0(i7 << 3) + 8;
    }

    public static int f(int i7, float f7) {
        return v0(i7 << 3) + 4;
    }

    public static int f0(long j7) {
        return 8;
    }

    public static int g(I4 i42, Z4 z42) {
        int c7 = ((AbstractC0940j3) i42).c(z42);
        return v0(c7) + c7;
    }

    public static int g0(int i7) {
        if (i7 >= 0) {
            return v0(i7);
        }
        return 10;
    }

    public static int h(boolean z7) {
        return 1;
    }

    public static int h0(int i7, int i8) {
        return v0(i7 << 3) + 4;
    }

    public static int i(byte[] bArr) {
        int length = bArr.length;
        return v0(length) + length;
    }

    public static int i0(int i7, long j7) {
        return v0(i7 << 3) + n0(u0(j7));
    }

    public static int j0(long j7) {
        return n0(u0(j7));
    }

    public static int k0(int i7) {
        return 4;
    }

    public static int l0(int i7, int i8) {
        return v0(i7 << 3) + g0(i8);
    }

    public static int m0(int i7, long j7) {
        return v0(i7 << 3) + n0(j7);
    }

    public static int n0(long j7) {
        int i7;
        if (((-128) & j7) == 0) {
            return 1;
        }
        if (j7 < 0) {
            return 10;
        }
        if (((-34359738368L) & j7) != 0) {
            j7 >>>= 28;
            i7 = 6;
        } else {
            i7 = 2;
        }
        if (((-2097152) & j7) != 0) {
            i7 += 2;
            j7 >>>= 14;
        }
        return (j7 & (-16384)) != 0 ? i7 + 1 : i7;
    }

    public static int o0(int i7) {
        return v0(z0(i7));
    }

    public static int p0(int i7, int i8) {
        return v0(i7 << 3) + 4;
    }

    public static int s0(int i7) {
        return v0(i7 << 3);
    }

    public static int t0(int i7, int i8) {
        return v0(i7 << 3) + v0(z0(i8));
    }

    public static long u0(long j7) {
        return (j7 >> 63) ^ (j7 << 1);
    }

    public static int v0(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        return (i7 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int w0(int i7, int i8) {
        return v0(i7 << 3) + v0(i8);
    }

    public static int x(int i7, I4 i42, Z4 z42) {
        return (v0(i7 << 3) << 1) + ((AbstractC0940j3) i42).c(z42);
    }

    public static int y(int i7, String str) {
        return v0(i7 << 3) + C(str);
    }

    public static int z(int i7, boolean z7) {
        return v0(i7 << 3) + 1;
    }

    public static int z0(int i7) {
        return (i7 >> 31) ^ (i7 << 1);
    }

    public final void E() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void F(double d7) {
        s(Double.doubleToRawLongBits(d7));
    }

    public final void G(float f7) {
        k(Float.floatToRawIntBits(f7));
    }

    public abstract void H(int i7);

    public final void I(int i7, double d7) {
        m(i7, Double.doubleToRawLongBits(d7));
    }

    public final void J(int i7, float f7) {
        l(i7, Float.floatToRawIntBits(f7));
    }

    public abstract void K(int i7, int i8);

    public abstract void L(int i7, long j7);

    public abstract void M(int i7, AbstractC1003q3 abstractC1003q3);

    public abstract void N(long j7);

    public final void O(boolean z7) {
        j(z7 ? (byte) 1 : (byte) 0);
    }

    public abstract void U(int i7);

    public abstract void V(int i7, int i8);

    public abstract int b();

    public abstract void b0(int i7, int i8);

    public abstract void j(byte b7);

    public abstract void k(int i7);

    public abstract void l(int i7, int i8);

    public abstract void m(int i7, long j7);

    public abstract void n(int i7, AbstractC1003q3 abstractC1003q3);

    public abstract void o(int i7, I4 i42);

    public abstract void p(int i7, I4 i42, Z4 z42);

    public abstract void q(int i7, String str);

    public final void q0(int i7, long j7) {
        L(i7, u0(j7));
    }

    public abstract void r(int i7, boolean z7);

    public final void r0(long j7) {
        N(u0(j7));
    }

    public abstract void s(long j7);

    public abstract void t(AbstractC1003q3 abstractC1003q3);

    public abstract void u(I4 i42);

    public abstract void v(String str);

    public final void w(String str, H5 h52) {
        f10443b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) h52);
        byte[] bytes = str.getBytes(AbstractC0860a4.f10823b);
        try {
            U(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e7) {
            throw new b(e7);
        }
    }

    public final void x0(int i7) {
        U(z0(i7));
    }

    public final void y0(int i7, int i8) {
        b0(i7, z0(i8));
    }
}
