package ma;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.u1;

/* loaded from: classes.dex */
public abstract class k extends m.e {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f11018c = Logger.getLogger(k.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f11019d = t1.f11088e;

    /* renamed from: b, reason: collision with root package name */
    public l f11020b;

    public static abstract class a extends k {

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f11021e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public int f11022g;

        public a(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f11021e = bArr;
            this.f = bArr.length;
        }

        public final void p0(int i10) {
            byte[] bArr = this.f11021e;
            int i11 = this.f11022g;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f11022g = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        }

        public final void q0(long j10) {
            byte[] bArr = this.f11021e;
            int i10 = this.f11022g;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f11022g = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        }

        public final void r0(int i10, int i11) {
            s0((i10 << 3) | i11);
        }

        public final void s0(int i10) {
            if (k.f11019d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f11021e;
                    int i11 = this.f11022g;
                    this.f11022g = i11 + 1;
                    t1.s(bArr, i11, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f11021e;
                int i12 = this.f11022g;
                this.f11022g = i12 + 1;
                t1.s(bArr2, i12, (byte) i10);
                return;
            }
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f11021e;
                int i13 = this.f11022g;
                this.f11022g = i13 + 1;
                bArr3[i13] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f11021e;
            int i14 = this.f11022g;
            this.f11022g = i14 + 1;
            bArr4[i14] = (byte) i10;
        }

        public final void t0(long j10) {
            if (k.f11019d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f11021e;
                    int i10 = this.f11022g;
                    this.f11022g = i10 + 1;
                    t1.s(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f11021e;
                int i11 = this.f11022g;
                this.f11022g = i11 + 1;
                t1.s(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f11021e;
                int i12 = this.f11022g;
                this.f11022g = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f11021e;
            int i13 = this.f11022g;
            this.f11022g = i13 + 1;
            bArr4[i13] = (byte) j10;
        }
    }

    public static class b extends k {

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f11023e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public int f11024g;

        public b(byte[] bArr, int i10, int i11) {
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f11023e = bArr;
            this.f11024g = i10;
            this.f = i12;
        }

        @Override // ma.k
        public final void T(byte b10) {
            try {
                byte[] bArr = this.f11023e;
                int i10 = this.f11024g;
                this.f11024g = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11024g), Integer.valueOf(this.f), 1), e10);
            }
        }

        @Override // ma.k
        public final void U(int i10, boolean z10) {
            k0(i10, 0);
            T(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // ma.k
        public final void V(byte[] bArr, int i10) {
            m0(i10);
            q0(bArr, 0, i10);
        }

        @Override // ma.k
        public final void W(int i10, h hVar) {
            k0(i10, 2);
            X(hVar);
        }

        @Override // ma.k
        public final void X(h hVar) {
            m0(hVar.size());
            hVar.B(this);
        }

        @Override // ma.k
        public final void Y(int i10, int i11) {
            k0(i10, 5);
            Z(i11);
        }

        @Override // ma.k
        public final void Z(int i10) {
            try {
                byte[] bArr = this.f11023e;
                int i11 = this.f11024g;
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f11024g = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11024g), Integer.valueOf(this.f), 1), e10);
            }
        }

        @Override // ma.k
        public final void a0(int i10, long j10) {
            k0(i10, 1);
            b0(j10);
        }

        @Override // ma.k
        public final void b0(long j10) {
            try {
                byte[] bArr = this.f11023e;
                int i10 = this.f11024g;
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i14 + 1;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f11024g = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11024g), Integer.valueOf(this.f), 1), e10);
            }
        }

        @Override // ma.k
        public final void c0(int i10, int i11) {
            k0(i10, 0);
            d0(i11);
        }

        @Override // ma.k
        public final void d0(int i10) {
            if (i10 >= 0) {
                m0(i10);
            } else {
                o0(i10);
            }
        }

        @Override // ma.k
        public final void e0(int i10, s0 s0Var, i1 i1Var) {
            k0(i10, 2);
            m0(((ma.a) s0Var).m(i1Var));
            i1Var.h(s0Var, this.f11020b);
        }

        @Override // ma.k
        public final void f0(s0 s0Var) {
            m0(s0Var.d());
            s0Var.i(this);
        }

        @Override // ma.k
        public final void g0(int i10, s0 s0Var) {
            k0(1, 3);
            l0(2, i10);
            k0(3, 2);
            f0(s0Var);
            k0(1, 4);
        }

        @Override // ma.k
        public final void h0(int i10, h hVar) {
            k0(1, 3);
            l0(2, i10);
            W(3, hVar);
            k0(1, 4);
        }

        @Override // ma.k
        public final void i0(int i10, String str) {
            k0(i10, 2);
            j0(str);
        }

        @Override // ma.k
        public final void j0(String str) {
            int d10;
            int i10 = this.f11024g;
            try {
                int P = k.P(str.length() * 3);
                int P2 = k.P(str.length());
                if (P2 == P) {
                    int i11 = i10 + P2;
                    this.f11024g = i11;
                    d10 = u1.f11095a.d(str, this.f11023e, i11, this.f - i11);
                    this.f11024g = i10;
                    m0((d10 - i10) - P2);
                } else {
                    m0(u1.b(str));
                    byte[] bArr = this.f11023e;
                    int i12 = this.f11024g;
                    d10 = u1.f11095a.d(str, bArr, i12, this.f - i12);
                }
                this.f11024g = d10;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(e10);
            } catch (u1.d e11) {
                this.f11024g = i10;
                S(str, e11);
            }
        }

        @Override // ma.k
        public final void k0(int i10, int i11) {
            m0((i10 << 3) | i11);
        }

        @Override // ma.k
        public final void l0(int i10, int i11) {
            k0(i10, 0);
            m0(i11);
        }

        @Override // ma.k
        public final void m0(int i10) {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f11023e;
                    int i11 = this.f11024g;
                    this.f11024g = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11024g), Integer.valueOf(this.f), 1), e10);
                }
            }
            byte[] bArr2 = this.f11023e;
            int i12 = this.f11024g;
            this.f11024g = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override // ma.k
        public final void n0(int i10, long j10) {
            k0(i10, 0);
            o0(j10);
        }

        @Override // ma.k
        public final void o0(long j10) {
            if (k.f11019d && this.f - this.f11024g >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f11023e;
                    int i10 = this.f11024g;
                    this.f11024g = i10 + 1;
                    t1.s(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f11023e;
                int i11 = this.f11024g;
                this.f11024g = i11 + 1;
                t1.s(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f11023e;
                    int i12 = this.f11024g;
                    this.f11024g = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11024g), Integer.valueOf(this.f), 1), e10);
                }
            }
            byte[] bArr4 = this.f11023e;
            int i13 = this.f11024g;
            this.f11024g = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        public final int p0() {
            return this.f - this.f11024g;
        }

        public final void q0(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f11023e, this.f11024g, i11);
                this.f11024g += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11024g), Integer.valueOf(this.f), Integer.valueOf(i11)), e10);
            }
        }

        @Override // m.e
        public final void s(byte[] bArr, int i10, int i11) {
            q0(bArr, i10, i11);
        }
    }

    public static class c extends IOException {
        public c(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        public c(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super(defpackage.g.d("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), indexOutOfBoundsException);
        }
    }

    public static final class d extends a {

        /* renamed from: h, reason: collision with root package name */
        public final OutputStream f11025h;

        public d(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f11025h = outputStream;
        }

        @Override // ma.k
        public final void T(byte b10) {
            if (this.f11022g == this.f) {
                u0();
            }
            byte[] bArr = this.f11021e;
            int i10 = this.f11022g;
            this.f11022g = i10 + 1;
            bArr[i10] = b10;
        }

        @Override // ma.k
        public final void U(int i10, boolean z10) {
            v0(11);
            r0(i10, 0);
            byte b10 = z10 ? (byte) 1 : (byte) 0;
            byte[] bArr = this.f11021e;
            int i11 = this.f11022g;
            this.f11022g = i11 + 1;
            bArr[i11] = b10;
        }

        @Override // ma.k
        public final void V(byte[] bArr, int i10) {
            m0(i10);
            w0(bArr, 0, i10);
        }

        @Override // ma.k
        public final void W(int i10, h hVar) {
            k0(i10, 2);
            X(hVar);
        }

        @Override // ma.k
        public final void X(h hVar) {
            m0(hVar.size());
            hVar.B(this);
        }

        @Override // ma.k
        public final void Y(int i10, int i11) {
            v0(14);
            r0(i10, 5);
            p0(i11);
        }

        @Override // ma.k
        public final void Z(int i10) {
            v0(4);
            p0(i10);
        }

        @Override // ma.k
        public final void a0(int i10, long j10) {
            v0(18);
            r0(i10, 1);
            q0(j10);
        }

        @Override // ma.k
        public final void b0(long j10) {
            v0(8);
            q0(j10);
        }

        @Override // ma.k
        public final void c0(int i10, int i11) {
            v0(20);
            r0(i10, 0);
            if (i11 >= 0) {
                s0(i11);
            } else {
                t0(i11);
            }
        }

        @Override // ma.k
        public final void d0(int i10) {
            if (i10 >= 0) {
                m0(i10);
            } else {
                o0(i10);
            }
        }

        @Override // ma.k
        public final void e0(int i10, s0 s0Var, i1 i1Var) {
            k0(i10, 2);
            m0(((ma.a) s0Var).m(i1Var));
            i1Var.h(s0Var, this.f11020b);
        }

        @Override // ma.k
        public final void f0(s0 s0Var) {
            m0(s0Var.d());
            s0Var.i(this);
        }

        @Override // ma.k
        public final void g0(int i10, s0 s0Var) {
            k0(1, 3);
            l0(2, i10);
            k0(3, 2);
            f0(s0Var);
            k0(1, 4);
        }

        @Override // ma.k
        public final void h0(int i10, h hVar) {
            k0(1, 3);
            l0(2, i10);
            W(3, hVar);
            k0(1, 4);
        }

        @Override // ma.k
        public final void i0(int i10, String str) {
            k0(i10, 2);
            j0(str);
        }

        @Override // ma.k
        public final void j0(String str) {
            try {
                int length = str.length() * 3;
                int P = k.P(length);
                int i10 = P + length;
                int i11 = this.f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int d10 = u1.f11095a.d(str, bArr, 0, length);
                    m0(d10);
                    w0(bArr, 0, d10);
                    return;
                }
                if (i10 > i11 - this.f11022g) {
                    u0();
                }
                int P2 = k.P(str.length());
                int i12 = this.f11022g;
                try {
                    try {
                        if (P2 == P) {
                            int i13 = i12 + P2;
                            this.f11022g = i13;
                            int d11 = u1.f11095a.d(str, this.f11021e, i13, this.f - i13);
                            this.f11022g = i12;
                            s0((d11 - i12) - P2);
                            this.f11022g = d11;
                        } else {
                            int b10 = u1.b(str);
                            s0(b10);
                            this.f11022g = u1.f11095a.d(str, this.f11021e, this.f11022g, b10);
                        }
                    } catch (ArrayIndexOutOfBoundsException e10) {
                        throw new c(e10);
                    }
                } catch (u1.d e11) {
                    this.f11022g = i12;
                    throw e11;
                }
            } catch (u1.d e12) {
                S(str, e12);
            }
        }

        @Override // ma.k
        public final void k0(int i10, int i11) {
            m0((i10 << 3) | i11);
        }

        @Override // ma.k
        public final void l0(int i10, int i11) {
            v0(20);
            r0(i10, 0);
            s0(i11);
        }

        @Override // ma.k
        public final void m0(int i10) {
            v0(5);
            s0(i10);
        }

        @Override // ma.k
        public final void n0(int i10, long j10) {
            v0(20);
            r0(i10, 0);
            t0(j10);
        }

        @Override // ma.k
        public final void o0(long j10) {
            v0(10);
            t0(j10);
        }

        @Override // m.e
        public final void s(byte[] bArr, int i10, int i11) {
            w0(bArr, i10, i11);
        }

        public final void u0() {
            this.f11025h.write(this.f11021e, 0, this.f11022g);
            this.f11022g = 0;
        }

        public final void v0(int i10) {
            if (this.f - this.f11022g < i10) {
                u0();
            }
        }

        public final void w0(byte[] bArr, int i10, int i11) {
            int i12 = this.f;
            int i13 = this.f11022g;
            int i14 = i12 - i13;
            if (i14 >= i11) {
                System.arraycopy(bArr, i10, this.f11021e, i13, i11);
                this.f11022g += i11;
                return;
            }
            System.arraycopy(bArr, i10, this.f11021e, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f11022g = this.f;
            u0();
            if (i16 > this.f) {
                this.f11025h.write(bArr, i15, i16);
            } else {
                System.arraycopy(bArr, i15, this.f11021e, 0, i16);
                this.f11022g = i16;
            }
        }
    }

    public k() {
        super(7);
    }

    public static int A(int i10) {
        return N(i10) + 8;
    }

    public static int B(int i10) {
        return N(i10) + 4;
    }

    @Deprecated
    public static int C(int i10, s0 s0Var, i1 i1Var) {
        return ((ma.a) s0Var).m(i1Var) + (N(i10) * 2);
    }

    public static int D(int i10, int i11) {
        return E(i11) + N(i10);
    }

    public static int E(int i10) {
        if (i10 >= 0) {
            return P(i10);
        }
        return 10;
    }

    public static int F(int i10, long j10) {
        return R(j10) + N(i10);
    }

    public static int G(f0 f0Var) {
        int size = f0Var.f10953b != null ? f0Var.f10953b.size() : f0Var.f10952a != null ? f0Var.f10952a.d() : 0;
        return P(size) + size;
    }

    public static int H(int i10) {
        return N(i10) + 4;
    }

    public static int I(int i10) {
        return N(i10) + 8;
    }

    public static int J(int i10, int i11) {
        return P((i11 >> 31) ^ (i11 << 1)) + N(i10);
    }

    public static int K(int i10, long j10) {
        return R((j10 >> 63) ^ (j10 << 1)) + N(i10);
    }

    public static int L(int i10, String str) {
        return M(str) + N(i10);
    }

    public static int M(String str) {
        int length;
        try {
            length = u1.b(str);
        } catch (u1.d unused) {
            length = str.getBytes(a0.f10909a).length;
        }
        return P(length) + length;
    }

    public static int N(int i10) {
        return P((i10 << 3) | 0);
    }

    public static int O(int i10, int i11) {
        return P(i11) + N(i10);
    }

    public static int P(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int Q(int i10, long j10) {
        return R(j10) + N(i10);
    }

    public static int R(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            i10 = 6;
            j10 >>>= 28;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int v(int i10) {
        return N(i10) + 1;
    }

    public static int w(int i10, h hVar) {
        int N = N(i10);
        int size = hVar.size();
        return P(size) + size + N;
    }

    public static int x(int i10) {
        return N(i10) + 8;
    }

    public static int y(int i10, int i11) {
        return E(i11) + N(i10);
    }

    public static int z(int i10) {
        return N(i10) + 4;
    }

    public final void S(String str, u1.d dVar) {
        f11018c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(a0.f10909a);
        try {
            m0(bytes.length);
            s(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new c(e10);
        }
    }

    public abstract void T(byte b10);

    public abstract void U(int i10, boolean z10);

    public abstract void V(byte[] bArr, int i10);

    public abstract void W(int i10, h hVar);

    public abstract void X(h hVar);

    public abstract void Y(int i10, int i11);

    public abstract void Z(int i10);

    public abstract void a0(int i10, long j10);

    public abstract void b0(long j10);

    public abstract void c0(int i10, int i11);

    public abstract void d0(int i10);

    public abstract void e0(int i10, s0 s0Var, i1 i1Var);

    public abstract void f0(s0 s0Var);

    public abstract void g0(int i10, s0 s0Var);

    public abstract void h0(int i10, h hVar);

    public abstract void i0(int i10, String str);

    public abstract void j0(String str);

    public abstract void k0(int i10, int i11);

    public abstract void l0(int i10, int i11);

    public abstract void m0(int i10);

    public abstract void n0(int i10, long j10);

    public abstract void o0(long j10);
}
