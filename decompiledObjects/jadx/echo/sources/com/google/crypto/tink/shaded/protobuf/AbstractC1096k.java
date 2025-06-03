package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.p0;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.shaded.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1096k extends AbstractC1092g {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f11378c = Logger.getLogger(AbstractC1096k.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f11379d = o0.E();

    /* renamed from: a, reason: collision with root package name */
    public C1097l f11380a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11381b;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.k$b */
    public static class b extends AbstractC1096k {

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f11382e;

        /* renamed from: f, reason: collision with root package name */
        public final int f11383f;

        /* renamed from: g, reason: collision with root package name */
        public final int f11384g;

        /* renamed from: h, reason: collision with root package name */
        public int f11385h;

        public b(byte[] bArr, int i7, int i8) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i9 = i7 + i8;
            if ((i7 | i8 | (bArr.length - i9)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i8)));
            }
            this.f11382e = bArr;
            this.f11383f = i7;
            this.f11385h = i7;
            this.f11384g = i9;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1096k
        public final void C0(int i7, String str) {
            D0(i7, 2);
            M0(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1096k
        public final void D0(int i7, int i8) {
            F0(q0.c(i7, i8));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1096k
        public final void E0(int i7, int i8) {
            D0(i7, 0);
            F0(i8);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1096k
        public final void F0(int i7) {
            while ((i7 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f11382e;
                    int i8 = this.f11385h;
                    this.f11385h = i8 + 1;
                    bArr[i8] = (byte) ((i7 & 127) | 128);
                    i7 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11385h), Integer.valueOf(this.f11384g), 1), e7);
                }
            }
            byte[] bArr2 = this.f11382e;
            int i9 = this.f11385h;
            this.f11385h = i9 + 1;
            bArr2[i9] = (byte) i7;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1096k
        public final void G0(int i7, long j7) {
            D0(i7, 0);
            H0(j7);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1096k
        public final void H0(long j7) {
            if (AbstractC1096k.f11379d && W() >= 10) {
                while ((j7 & (-128)) != 0) {
                    byte[] bArr = this.f11382e;
                    int i7 = this.f11385h;
                    this.f11385h = i7 + 1;
                    o0.K(bArr, i7, (byte) ((((int) j7) & 127) | 128));
                    j7 >>>= 7;
                }
                byte[] bArr2 = this.f11382e;
                int i8 = this.f11385h;
                this.f11385h = 1 + i8;
                o0.K(bArr2, i8, (byte) j7);
                return;
            }
            while ((j7 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f11382e;
                    int i9 = this.f11385h;
                    this.f11385h = i9 + 1;
                    bArr3[i9] = (byte) ((((int) j7) & 127) | 128);
                    j7 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11385h), Integer.valueOf(this.f11384g), 1), e7);
                }
            }
            byte[] bArr4 = this.f11382e;
            int i10 = this.f11385h;
            this.f11385h = i10 + 1;
            bArr4[i10] = (byte) j7;
        }

        public final void I0(byte[] bArr, int i7, int i8) {
            try {
                System.arraycopy(bArr, i7, this.f11382e, this.f11385h, i8);
                this.f11385h += i8;
            } catch (IndexOutOfBoundsException e7) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11385h), Integer.valueOf(this.f11384g), Integer.valueOf(i8)), e7);
            }
        }

        public final void J0(AbstractC1093h abstractC1093h) {
            F0(abstractC1093h.size());
            abstractC1093h.g0(this);
        }

        public final void K0(int i7, O o7) {
            D0(i7, 2);
            L0(o7);
        }

        public final void L0(O o7) {
            F0(o7.a());
            o7.g(this);
        }

        public final void M0(String str) {
            int f7;
            int i7 = this.f11385h;
            try {
                int N6 = AbstractC1096k.N(str.length() * 3);
                int N7 = AbstractC1096k.N(str.length());
                if (N7 == N6) {
                    int i8 = i7 + N7;
                    this.f11385h = i8;
                    f7 = p0.f(str, this.f11382e, i8, W());
                    this.f11385h = i7;
                    F0((f7 - i7) - N7);
                } else {
                    F0(p0.g(str));
                    f7 = p0.f(str, this.f11382e, this.f11385h, W());
                }
                this.f11385h = f7;
            } catch (p0.d e7) {
                this.f11385h = i7;
                S(str, e7);
            } catch (IndexOutOfBoundsException e8) {
                throw new c(e8);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1096k
        public final int W() {
            return this.f11384g - this.f11385h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1096k
        public final void X(byte b7) {
            try {
                byte[] bArr = this.f11382e;
                int i7 = this.f11385h;
                this.f11385h = i7 + 1;
                bArr[i7] = b7;
            } catch (IndexOutOfBoundsException e7) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11385h), Integer.valueOf(this.f11384g), 1), e7);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1096k
        public final void Y(int i7, boolean z7) {
            D0(i7, 0);
            X(z7 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1096k, com.google.crypto.tink.shaded.protobuf.AbstractC1092g
        public final void a(byte[] bArr, int i7, int i8) {
            I0(bArr, i7, i8);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1096k
        public final void a0(int i7, AbstractC1093h abstractC1093h) {
            D0(i7, 2);
            J0(abstractC1093h);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1096k
        public final void f0(int i7, int i8) {
            D0(i7, 5);
            g0(i8);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1096k
        public final void g0(int i7) {
            try {
                byte[] bArr = this.f11382e;
                int i8 = this.f11385h;
                bArr[i8] = (byte) (i7 & 255);
                bArr[i8 + 1] = (byte) ((i7 >> 8) & 255);
                bArr[i8 + 2] = (byte) ((i7 >> 16) & 255);
                this.f11385h = i8 + 4;
                bArr[i8 + 3] = (byte) ((i7 >> 24) & 255);
            } catch (IndexOutOfBoundsException e7) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11385h), Integer.valueOf(this.f11384g), 1), e7);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1096k
        public final void h0(int i7, long j7) {
            D0(i7, 1);
            i0(j7);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1096k
        public final void i0(long j7) {
            try {
                byte[] bArr = this.f11382e;
                int i7 = this.f11385h;
                bArr[i7] = (byte) (((int) j7) & 255);
                bArr[i7 + 1] = (byte) (((int) (j7 >> 8)) & 255);
                bArr[i7 + 2] = (byte) (((int) (j7 >> 16)) & 255);
                bArr[i7 + 3] = (byte) (((int) (j7 >> 24)) & 255);
                bArr[i7 + 4] = (byte) (((int) (j7 >> 32)) & 255);
                bArr[i7 + 5] = (byte) (((int) (j7 >> 40)) & 255);
                bArr[i7 + 6] = (byte) (((int) (j7 >> 48)) & 255);
                this.f11385h = i7 + 8;
                bArr[i7 + 7] = (byte) (((int) (j7 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e7) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11385h), Integer.valueOf(this.f11384g), 1), e7);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1096k
        public final void n0(int i7, int i8) {
            D0(i7, 0);
            o0(i8);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1096k
        public final void o0(int i7) {
            if (i7 >= 0) {
                F0(i7);
            } else {
                H0(i7);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1096k
        public final void r0(int i7, O o7, e0 e0Var) {
            D0(i7, 2);
            F0(((AbstractC1086a) o7).e(e0Var));
            e0Var.i(o7, this.f11380a);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1096k
        public final void s0(int i7, O o7) {
            D0(1, 3);
            E0(2, i7);
            K0(3, o7);
            D0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1096k
        public final void t0(int i7, AbstractC1093h abstractC1093h) {
            D0(1, 3);
            E0(2, i7);
            a0(3, abstractC1093h);
            D0(1, 4);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.k$c */
    public static class c extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public c(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        public c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    public AbstractC1096k() {
    }

    public static int A(int i7, AbstractC1093h abstractC1093h) {
        return (L(1) * 2) + M(2, i7) + f(3, abstractC1093h);
    }

    public static int B(int i7, int i8) {
        return L(i7) + C(i8);
    }

    public static int C(int i7) {
        return 4;
    }

    public static int D(int i7, long j7) {
        return L(i7) + E(j7);
    }

    public static int E(long j7) {
        return 8;
    }

    public static int F(int i7, int i8) {
        return L(i7) + G(i8);
    }

    public static int G(int i7) {
        return N(Q(i7));
    }

    public static int H(int i7, long j7) {
        return L(i7) + I(j7);
    }

    public static int I(long j7) {
        return P(R(j7));
    }

    public static int J(int i7, String str) {
        return L(i7) + K(str);
    }

    public static int K(String str) {
        int length;
        try {
            length = p0.g(str);
        } catch (p0.d unused) {
            length = str.getBytes(AbstractC1110z.f11553b).length;
        }
        return x(length);
    }

    public static int L(int i7) {
        return N(q0.c(i7, 0));
    }

    public static int M(int i7, int i8) {
        return L(i7) + N(i8);
    }

    public static int N(int i7) {
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

    public static int O(int i7, long j7) {
        return L(i7) + P(j7);
    }

    public static int P(long j7) {
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

    public static int Q(int i7) {
        return (i7 >> 31) ^ (i7 << 1);
    }

    public static long R(long j7) {
        return (j7 >> 63) ^ (j7 << 1);
    }

    public static AbstractC1096k U(byte[] bArr) {
        return V(bArr, 0, bArr.length);
    }

    public static AbstractC1096k V(byte[] bArr, int i7, int i8) {
        return new b(bArr, i7, i8);
    }

    public static int d(int i7, boolean z7) {
        return L(i7) + e(z7);
    }

    public static int e(boolean z7) {
        return 1;
    }

    public static int f(int i7, AbstractC1093h abstractC1093h) {
        return L(i7) + g(abstractC1093h);
    }

    public static int g(AbstractC1093h abstractC1093h) {
        return x(abstractC1093h.size());
    }

    public static int h(int i7, double d7) {
        return L(i7) + i(d7);
    }

    public static int i(double d7) {
        return 8;
    }

    public static int j(int i7, int i8) {
        return L(i7) + k(i8);
    }

    public static int k(int i7) {
        return u(i7);
    }

    public static int l(int i7, int i8) {
        return L(i7) + m(i8);
    }

    public static int m(int i7) {
        return 4;
    }

    public static int n(int i7, long j7) {
        return L(i7) + o(j7);
    }

    public static int o(long j7) {
        return 8;
    }

    public static int p(int i7, float f7) {
        return L(i7) + q(f7);
    }

    public static int q(float f7) {
        return 4;
    }

    public static int r(int i7, O o7, e0 e0Var) {
        return (L(i7) * 2) + s(o7, e0Var);
    }

    public static int s(O o7, e0 e0Var) {
        return ((AbstractC1086a) o7).e(e0Var);
    }

    public static int t(int i7, int i8) {
        return L(i7) + u(i8);
    }

    public static int u(int i7) {
        if (i7 >= 0) {
            return N(i7);
        }
        return 10;
    }

    public static int v(int i7, long j7) {
        return L(i7) + w(j7);
    }

    public static int w(long j7) {
        return P(j7);
    }

    public static int x(int i7) {
        return N(i7) + i7;
    }

    public static int y(int i7, O o7, e0 e0Var) {
        return L(i7) + z(o7, e0Var);
    }

    public static int z(O o7, e0 e0Var) {
        return x(((AbstractC1086a) o7).e(e0Var));
    }

    public final void A0(int i7, long j7) {
        G0(i7, R(j7));
    }

    public final void B0(long j7) {
        H0(R(j7));
    }

    public abstract void C0(int i7, String str);

    public abstract void D0(int i7, int i8);

    public abstract void E0(int i7, int i8);

    public abstract void F0(int i7);

    public abstract void G0(int i7, long j7);

    public abstract void H0(long j7);

    public final void S(String str, p0.d dVar) {
        f11378c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(AbstractC1110z.f11553b);
        try {
            F0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e7) {
            throw new c(e7);
        }
    }

    public boolean T() {
        return this.f11381b;
    }

    public abstract int W();

    public abstract void X(byte b7);

    public abstract void Y(int i7, boolean z7);

    public final void Z(boolean z7) {
        X(z7 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1092g
    public abstract void a(byte[] bArr, int i7, int i8);

    public abstract void a0(int i7, AbstractC1093h abstractC1093h);

    public final void b0(int i7, double d7) {
        h0(i7, Double.doubleToRawLongBits(d7));
    }

    public final void c() {
        if (W() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void c0(double d7) {
        i0(Double.doubleToRawLongBits(d7));
    }

    public final void d0(int i7, int i8) {
        n0(i7, i8);
    }

    public final void e0(int i7) {
        o0(i7);
    }

    public abstract void f0(int i7, int i8);

    public abstract void g0(int i7);

    public abstract void h0(int i7, long j7);

    public abstract void i0(long j7);

    public final void j0(int i7, float f7) {
        f0(i7, Float.floatToRawIntBits(f7));
    }

    public final void k0(float f7) {
        g0(Float.floatToRawIntBits(f7));
    }

    public final void l0(int i7, O o7, e0 e0Var) {
        D0(i7, 3);
        m0(o7, e0Var);
        D0(i7, 4);
    }

    public final void m0(O o7, e0 e0Var) {
        e0Var.i(o7, this.f11380a);
    }

    public abstract void n0(int i7, int i8);

    public abstract void o0(int i7);

    public final void p0(int i7, long j7) {
        G0(i7, j7);
    }

    public final void q0(long j7) {
        H0(j7);
    }

    public abstract void r0(int i7, O o7, e0 e0Var);

    public abstract void s0(int i7, O o7);

    public abstract void t0(int i7, AbstractC1093h abstractC1093h);

    public final void u0(int i7, int i8) {
        f0(i7, i8);
    }

    public final void v0(int i7) {
        g0(i7);
    }

    public final void w0(int i7, long j7) {
        h0(i7, j7);
    }

    public final void x0(long j7) {
        i0(j7);
    }

    public final void y0(int i7, int i8) {
        E0(i7, Q(i8));
    }

    public final void z0(int i7) {
        F0(Q(i7));
    }
}
