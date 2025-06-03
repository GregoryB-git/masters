package com.google.protobuf;

import com.google.protobuf.l0;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1143h extends AbstractC1140e {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f12069c = Logger.getLogger(AbstractC1143h.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f12070d = k0.E();

    /* renamed from: a, reason: collision with root package name */
    public C1144i f12071a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12072b;

    /* renamed from: com.google.protobuf.h$b */
    public static class b extends AbstractC1143h {

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f12073e;

        /* renamed from: f, reason: collision with root package name */
        public final int f12074f;

        /* renamed from: g, reason: collision with root package name */
        public final int f12075g;

        /* renamed from: h, reason: collision with root package name */
        public int f12076h;

        public b(byte[] bArr, int i7, int i8) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i9 = i7 + i8;
            if ((i7 | i8 | (bArr.length - i9)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i8)));
            }
            this.f12073e = bArr;
            this.f12074f = i7;
            this.f12076h = i7;
            this.f12075g = i9;
        }

        @Override // com.google.protobuf.AbstractC1143h
        public final void A0(K k7) {
            P0(k7.a());
            k7.j(this);
        }

        @Override // com.google.protobuf.AbstractC1143h
        public final void B0(int i7, K k7) {
            N0(1, 3);
            O0(2, i7);
            T0(3, k7);
            N0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC1143h
        public final void C0(int i7, AbstractC1141f abstractC1141f) {
            N0(1, 3);
            O0(2, i7);
            f0(3, abstractC1141f);
            N0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC1143h
        public final void L0(int i7, String str) {
            N0(i7, 2);
            M0(str);
        }

        @Override // com.google.protobuf.AbstractC1143h
        public final void M0(String str) {
            int e7;
            int i7 = this.f12076h;
            try {
                int Q6 = AbstractC1143h.Q(str.length() * 3);
                int Q7 = AbstractC1143h.Q(str.length());
                if (Q7 == Q6) {
                    int i8 = i7 + Q7;
                    this.f12076h = i8;
                    e7 = l0.e(str, this.f12073e, i8, Z());
                    this.f12076h = i7;
                    P0((e7 - i7) - Q7);
                } else {
                    P0(l0.f(str));
                    e7 = l0.e(str, this.f12073e, this.f12076h, Z());
                }
                this.f12076h = e7;
            } catch (l0.c e8) {
                this.f12076h = i7;
                V(str, e8);
            } catch (IndexOutOfBoundsException e9) {
                throw new c(e9);
            }
        }

        @Override // com.google.protobuf.AbstractC1143h
        public final void N0(int i7, int i8) {
            P0(m0.c(i7, i8));
        }

        @Override // com.google.protobuf.AbstractC1143h
        public final void O0(int i7, int i8) {
            N0(i7, 0);
            P0(i8);
        }

        @Override // com.google.protobuf.AbstractC1143h
        public final void P0(int i7) {
            while ((i7 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f12073e;
                    int i8 = this.f12076h;
                    this.f12076h = i8 + 1;
                    bArr[i8] = (byte) ((i7 & 127) | 128);
                    i7 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12076h), Integer.valueOf(this.f12075g), 1), e7);
                }
            }
            byte[] bArr2 = this.f12073e;
            int i9 = this.f12076h;
            this.f12076h = i9 + 1;
            bArr2[i9] = (byte) i7;
        }

        @Override // com.google.protobuf.AbstractC1143h
        public final void Q0(int i7, long j7) {
            N0(i7, 0);
            R0(j7);
        }

        @Override // com.google.protobuf.AbstractC1143h
        public final void R0(long j7) {
            if (AbstractC1143h.f12070d && Z() >= 10) {
                while ((j7 & (-128)) != 0) {
                    byte[] bArr = this.f12073e;
                    int i7 = this.f12076h;
                    this.f12076h = i7 + 1;
                    k0.K(bArr, i7, (byte) ((((int) j7) & 127) | 128));
                    j7 >>>= 7;
                }
                byte[] bArr2 = this.f12073e;
                int i8 = this.f12076h;
                this.f12076h = 1 + i8;
                k0.K(bArr2, i8, (byte) j7);
                return;
            }
            while ((j7 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f12073e;
                    int i9 = this.f12076h;
                    this.f12076h = i9 + 1;
                    bArr3[i9] = (byte) ((((int) j7) & 127) | 128);
                    j7 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12076h), Integer.valueOf(this.f12075g), 1), e7);
                }
            }
            byte[] bArr4 = this.f12073e;
            int i10 = this.f12076h;
            this.f12076h = i10 + 1;
            bArr4[i10] = (byte) j7;
        }

        public final void S0(byte[] bArr, int i7, int i8) {
            try {
                System.arraycopy(bArr, i7, this.f12073e, this.f12076h, i8);
                this.f12076h += i8;
            } catch (IndexOutOfBoundsException e7) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12076h), Integer.valueOf(this.f12075g), Integer.valueOf(i8)), e7);
            }
        }

        public final void T0(int i7, K k7) {
            N0(i7, 2);
            A0(k7);
        }

        @Override // com.google.protobuf.AbstractC1143h
        public final int Z() {
            return this.f12075g - this.f12076h;
        }

        @Override // com.google.protobuf.AbstractC1143h, com.google.protobuf.AbstractC1140e
        public final void a(byte[] bArr, int i7, int i8) {
            S0(bArr, i7, i8);
        }

        @Override // com.google.protobuf.AbstractC1143h
        public final void a0(byte b7) {
            try {
                byte[] bArr = this.f12073e;
                int i7 = this.f12076h;
                this.f12076h = i7 + 1;
                bArr[i7] = b7;
            } catch (IndexOutOfBoundsException e7) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12076h), Integer.valueOf(this.f12075g), 1), e7);
            }
        }

        @Override // com.google.protobuf.AbstractC1143h
        public final void b0(int i7, boolean z7) {
            N0(i7, 0);
            a0(z7 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.AbstractC1143h
        public final void e0(byte[] bArr, int i7, int i8) {
            P0(i8);
            S0(bArr, i7, i8);
        }

        @Override // com.google.protobuf.AbstractC1143h
        public final void f0(int i7, AbstractC1141f abstractC1141f) {
            N0(i7, 2);
            g0(abstractC1141f);
        }

        @Override // com.google.protobuf.AbstractC1143h
        public final void g0(AbstractC1141f abstractC1141f) {
            P0(abstractC1141f.size());
            abstractC1141f.b0(this);
        }

        @Override // com.google.protobuf.AbstractC1143h
        public final void l0(int i7, int i8) {
            N0(i7, 5);
            m0(i8);
        }

        @Override // com.google.protobuf.AbstractC1143h
        public final void m0(int i7) {
            try {
                byte[] bArr = this.f12073e;
                int i8 = this.f12076h;
                bArr[i8] = (byte) (i7 & 255);
                bArr[i8 + 1] = (byte) ((i7 >> 8) & 255);
                bArr[i8 + 2] = (byte) ((i7 >> 16) & 255);
                this.f12076h = i8 + 4;
                bArr[i8 + 3] = (byte) ((i7 >> 24) & 255);
            } catch (IndexOutOfBoundsException e7) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12076h), Integer.valueOf(this.f12075g), 1), e7);
            }
        }

        @Override // com.google.protobuf.AbstractC1143h
        public final void n0(int i7, long j7) {
            N0(i7, 1);
            o0(j7);
        }

        @Override // com.google.protobuf.AbstractC1143h
        public final void o0(long j7) {
            try {
                byte[] bArr = this.f12073e;
                int i7 = this.f12076h;
                bArr[i7] = (byte) (((int) j7) & 255);
                bArr[i7 + 1] = (byte) (((int) (j7 >> 8)) & 255);
                bArr[i7 + 2] = (byte) (((int) (j7 >> 16)) & 255);
                bArr[i7 + 3] = (byte) (((int) (j7 >> 24)) & 255);
                bArr[i7 + 4] = (byte) (((int) (j7 >> 32)) & 255);
                bArr[i7 + 5] = (byte) (((int) (j7 >> 40)) & 255);
                bArr[i7 + 6] = (byte) (((int) (j7 >> 48)) & 255);
                this.f12076h = i7 + 8;
                bArr[i7 + 7] = (byte) (((int) (j7 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e7) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12076h), Integer.valueOf(this.f12075g), 1), e7);
            }
        }

        @Override // com.google.protobuf.AbstractC1143h
        public final void v0(int i7, int i8) {
            N0(i7, 0);
            w0(i8);
        }

        @Override // com.google.protobuf.AbstractC1143h
        public final void w0(int i7) {
            if (i7 >= 0) {
                P0(i7);
            } else {
                R0(i7);
            }
        }

        @Override // com.google.protobuf.AbstractC1143h
        public final void z0(int i7, K k7, Z z7) {
            N0(i7, 2);
            P0(((AbstractC1136a) k7).h(z7));
            z7.h(k7, this.f12071a);
        }
    }

    /* renamed from: com.google.protobuf.h$c */
    public static class c extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public c(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        public c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    public AbstractC1143h() {
    }

    public static int A(int i7, K k7, Z z7) {
        return O(i7) + C(k7, z7);
    }

    public static int B(K k7) {
        return z(k7.a());
    }

    public static int C(K k7, Z z7) {
        return z(((AbstractC1136a) k7).h(z7));
    }

    public static int D(int i7, AbstractC1141f abstractC1141f) {
        return (O(1) * 2) + P(2, i7) + g(3, abstractC1141f);
    }

    public static int E(int i7, int i8) {
        return O(i7) + F(i8);
    }

    public static int F(int i7) {
        return 4;
    }

    public static int G(int i7, long j7) {
        return O(i7) + H(j7);
    }

    public static int H(long j7) {
        return 8;
    }

    public static int I(int i7, int i8) {
        return O(i7) + J(i8);
    }

    public static int J(int i7) {
        return Q(T(i7));
    }

    public static int K(int i7, long j7) {
        return O(i7) + L(j7);
    }

    public static int L(long j7) {
        return S(U(j7));
    }

    public static int M(int i7, String str) {
        return O(i7) + N(str);
    }

    public static int N(String str) {
        int length;
        try {
            length = l0.f(str);
        } catch (l0.c unused) {
            length = str.getBytes(AbstractC1154t.f12251b).length;
        }
        return z(length);
    }

    public static int O(int i7) {
        return Q(m0.c(i7, 0));
    }

    public static int P(int i7, int i8) {
        return O(i7) + Q(i8);
    }

    public static int Q(int i7) {
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

    public static int R(int i7, long j7) {
        return O(i7) + S(j7);
    }

    public static int S(long j7) {
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

    public static int T(int i7) {
        return (i7 >> 31) ^ (i7 << 1);
    }

    public static long U(long j7) {
        return (j7 >> 63) ^ (j7 << 1);
    }

    public static AbstractC1143h X(byte[] bArr) {
        return Y(bArr, 0, bArr.length);
    }

    public static AbstractC1143h Y(byte[] bArr, int i7, int i8) {
        return new b(bArr, i7, i8);
    }

    public static int d(int i7, boolean z7) {
        return O(i7) + e(z7);
    }

    public static int e(boolean z7) {
        return 1;
    }

    public static int f(byte[] bArr) {
        return z(bArr.length);
    }

    public static int g(int i7, AbstractC1141f abstractC1141f) {
        return O(i7) + h(abstractC1141f);
    }

    public static int h(AbstractC1141f abstractC1141f) {
        return z(abstractC1141f.size());
    }

    public static int i(int i7, double d7) {
        return O(i7) + j(d7);
    }

    public static int j(double d7) {
        return 8;
    }

    public static int k(int i7, int i8) {
        return O(i7) + l(i8);
    }

    public static int l(int i7) {
        return w(i7);
    }

    public static int m(int i7, int i8) {
        return O(i7) + n(i8);
    }

    public static int n(int i7) {
        return 4;
    }

    public static int o(int i7, long j7) {
        return O(i7) + p(j7);
    }

    public static int p(long j7) {
        return 8;
    }

    public static int q(int i7, float f7) {
        return O(i7) + r(f7);
    }

    public static int r(float f7) {
        return 4;
    }

    public static int s(int i7, K k7, Z z7) {
        return (O(i7) * 2) + u(k7, z7);
    }

    public static int t(K k7) {
        return k7.a();
    }

    public static int u(K k7, Z z7) {
        return ((AbstractC1136a) k7).h(z7);
    }

    public static int v(int i7, int i8) {
        return O(i7) + w(i8);
    }

    public static int w(int i7) {
        if (i7 >= 0) {
            return Q(i7);
        }
        return 10;
    }

    public static int x(int i7, long j7) {
        return O(i7) + y(j7);
    }

    public static int y(long j7) {
        return S(j7);
    }

    public static int z(int i7) {
        return Q(i7) + i7;
    }

    public abstract void A0(K k7);

    public abstract void B0(int i7, K k7);

    public abstract void C0(int i7, AbstractC1141f abstractC1141f);

    public final void D0(int i7, int i8) {
        l0(i7, i8);
    }

    public final void E0(int i7) {
        m0(i7);
    }

    public final void F0(int i7, long j7) {
        n0(i7, j7);
    }

    public final void G0(long j7) {
        o0(j7);
    }

    public final void H0(int i7, int i8) {
        O0(i7, T(i8));
    }

    public final void I0(int i7) {
        P0(T(i7));
    }

    public final void J0(int i7, long j7) {
        Q0(i7, U(j7));
    }

    public final void K0(long j7) {
        R0(U(j7));
    }

    public abstract void L0(int i7, String str);

    public abstract void M0(String str);

    public abstract void N0(int i7, int i8);

    public abstract void O0(int i7, int i8);

    public abstract void P0(int i7);

    public abstract void Q0(int i7, long j7);

    public abstract void R0(long j7);

    public final void V(String str, l0.c cVar) {
        f12069c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) cVar);
        byte[] bytes = str.getBytes(AbstractC1154t.f12251b);
        try {
            P0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e7) {
            throw new c(e7);
        }
    }

    public boolean W() {
        return this.f12072b;
    }

    public abstract int Z();

    @Override // com.google.protobuf.AbstractC1140e
    public abstract void a(byte[] bArr, int i7, int i8);

    public abstract void a0(byte b7);

    public abstract void b0(int i7, boolean z7);

    public final void c() {
        if (Z() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void c0(boolean z7) {
        a0(z7 ? (byte) 1 : (byte) 0);
    }

    public final void d0(byte[] bArr) {
        e0(bArr, 0, bArr.length);
    }

    public abstract void e0(byte[] bArr, int i7, int i8);

    public abstract void f0(int i7, AbstractC1141f abstractC1141f);

    public abstract void g0(AbstractC1141f abstractC1141f);

    public final void h0(int i7, double d7) {
        n0(i7, Double.doubleToRawLongBits(d7));
    }

    public final void i0(double d7) {
        o0(Double.doubleToRawLongBits(d7));
    }

    public final void j0(int i7, int i8) {
        v0(i7, i8);
    }

    public final void k0(int i7) {
        w0(i7);
    }

    public abstract void l0(int i7, int i8);

    public abstract void m0(int i7);

    public abstract void n0(int i7, long j7);

    public abstract void o0(long j7);

    public final void p0(int i7, float f7) {
        l0(i7, Float.floatToRawIntBits(f7));
    }

    public final void q0(float f7) {
        m0(Float.floatToRawIntBits(f7));
    }

    public final void r0(int i7, K k7) {
        N0(i7, 3);
        t0(k7);
        N0(i7, 4);
    }

    public final void s0(int i7, K k7, Z z7) {
        N0(i7, 3);
        u0(k7, z7);
        N0(i7, 4);
    }

    public final void t0(K k7) {
        k7.j(this);
    }

    public final void u0(K k7, Z z7) {
        z7.h(k7, this.f12071a);
    }

    public abstract void v0(int i7, int i8);

    public abstract void w0(int i7);

    public final void x0(int i7, long j7) {
        Q0(i7, j7);
    }

    public final void y0(long j7) {
        R0(j7);
    }

    public abstract void z0(int i7, K k7, Z z7);
}
