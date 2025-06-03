package s0;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import o0.q;
import s0.m1;

/* loaded from: classes.dex */
public abstract class j extends m.e {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f14024c = Logger.getLogger(j.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f14025d = l1.f;

    /* renamed from: b, reason: collision with root package name */
    public k f14026b;

    public static abstract class a extends j {

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f14027e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public int f14028g;

        public a(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f14027e = bArr;
            this.f = bArr.length;
        }

        public final void p0(int i10) {
            byte[] bArr = this.f14027e;
            int i11 = this.f14028g;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f14028g = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        }

        public final void q0(long j10) {
            byte[] bArr = this.f14027e;
            int i10 = this.f14028g;
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
            this.f14028g = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        }

        public final void r0(int i10, int i11) {
            s0((i10 << 3) | i11);
        }

        public final void s0(int i10) {
            if (j.f14025d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f14027e;
                    int i11 = this.f14028g;
                    this.f14028g = i11 + 1;
                    l1.p(bArr, i11, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f14027e;
                int i12 = this.f14028g;
                this.f14028g = i12 + 1;
                l1.p(bArr2, i12, (byte) i10);
                return;
            }
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f14027e;
                int i13 = this.f14028g;
                this.f14028g = i13 + 1;
                bArr3[i13] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f14027e;
            int i14 = this.f14028g;
            this.f14028g = i14 + 1;
            bArr4[i14] = (byte) i10;
        }

        public final void t0(long j10) {
            if (j.f14025d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f14027e;
                    int i10 = this.f14028g;
                    this.f14028g = i10 + 1;
                    l1.p(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f14027e;
                int i11 = this.f14028g;
                this.f14028g = i11 + 1;
                l1.p(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f14027e;
                int i12 = this.f14028g;
                this.f14028g = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f14027e;
            int i13 = this.f14028g;
            this.f14028g = i13 + 1;
            bArr4[i13] = (byte) j10;
        }
    }

    public static class b extends j {

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f14029e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public int f14030g;

        public b(byte[] bArr, int i10) {
            int i11 = 0 + i10;
            if ((0 | i10 | (bArr.length - i11)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)));
            }
            this.f14029e = bArr;
            this.f14030g = 0;
            this.f = i11;
        }

        @Override // s0.j
        public final void T(byte b10) {
            try {
                byte[] bArr = this.f14029e;
                int i10 = this.f14030g;
                this.f14030g = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14030g), Integer.valueOf(this.f), 1), e10);
            }
        }

        @Override // s0.j
        public final void U(int i10, boolean z10) {
            k0(i10, 0);
            T(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // s0.j
        public final void V(byte[] bArr, int i10) {
            m0(i10);
            p0(bArr, 0, i10);
        }

        @Override // s0.j
        public final void W(int i10, g gVar) {
            k0(i10, 2);
            X(gVar);
        }

        @Override // s0.j
        public final void X(g gVar) {
            m0(gVar.size());
            gVar.o(this);
        }

        @Override // s0.j
        public final void Y(int i10, int i11) {
            k0(i10, 5);
            Z(i11);
        }

        @Override // s0.j
        public final void Z(int i10) {
            try {
                byte[] bArr = this.f14029e;
                int i11 = this.f14030g;
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f14030g = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14030g), Integer.valueOf(this.f), 1), e10);
            }
        }

        @Override // s0.j
        public final void a0(int i10, long j10) {
            k0(i10, 1);
            b0(j10);
        }

        @Override // s0.j
        public final void b0(long j10) {
            try {
                byte[] bArr = this.f14029e;
                int i10 = this.f14030g;
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
                this.f14030g = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14030g), Integer.valueOf(this.f), 1), e10);
            }
        }

        @Override // s0.j
        public final void c0(int i10, int i11) {
            k0(i10, 0);
            d0(i11);
        }

        @Override // s0.j
        public final void d0(int i10) {
            if (i10 >= 0) {
                m0(i10);
            } else {
                o0(i10);
            }
        }

        @Override // s0.j
        public final void e0(int i10, o0 o0Var, c1 c1Var) {
            k0(i10, 2);
            m0(((s0.a) o0Var).i(c1Var));
            c1Var.h(o0Var, this.f14026b);
        }

        @Override // s0.j
        public final void f0(o0 o0Var) {
            m0(o0Var.d());
            o0Var.g(this);
        }

        @Override // s0.j
        public final void g0(int i10, o0 o0Var) {
            k0(1, 3);
            l0(2, i10);
            k0(3, 2);
            f0(o0Var);
            k0(1, 4);
        }

        @Override // s0.j
        public final void h0(int i10, g gVar) {
            k0(1, 3);
            l0(2, i10);
            W(3, gVar);
            k0(1, 4);
        }

        @Override // s0.j
        public final void i0(int i10, String str) {
            k0(i10, 2);
            j0(str);
        }

        @Override // s0.j
        public final void j0(String str) {
            int b10;
            int i10 = this.f14030g;
            try {
                int P = j.P(str.length() * 3);
                int P2 = j.P(str.length());
                if (P2 == P) {
                    int i11 = i10 + P2;
                    this.f14030g = i11;
                    b10 = m1.f14049a.b(str, this.f14029e, i11, this.f - i11);
                    this.f14030g = i10;
                    m0((b10 - i10) - P2);
                } else {
                    m0(m1.a(str));
                    byte[] bArr = this.f14029e;
                    int i12 = this.f14030g;
                    b10 = m1.f14049a.b(str, bArr, i12, this.f - i12);
                }
                this.f14030g = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(e10);
            } catch (m1.d e11) {
                this.f14030g = i10;
                S(str, e11);
            }
        }

        @Override // s0.j
        public final void k0(int i10, int i11) {
            m0((i10 << 3) | i11);
        }

        @Override // s0.j
        public final void l0(int i10, int i11) {
            k0(i10, 0);
            m0(i11);
        }

        @Override // s0.j
        public final void m0(int i10) {
            if (j.f14025d && !s0.d.a()) {
                int i11 = this.f;
                int i12 = this.f14030g;
                if (i11 - i12 >= 5) {
                    if ((i10 & (-128)) == 0) {
                        byte[] bArr = this.f14029e;
                        this.f14030g = i12 + 1;
                        l1.p(bArr, i12, (byte) i10);
                        return;
                    }
                    byte[] bArr2 = this.f14029e;
                    this.f14030g = i12 + 1;
                    l1.p(bArr2, i12, (byte) (i10 | 128));
                    int i13 = i10 >>> 7;
                    if ((i13 & (-128)) == 0) {
                        byte[] bArr3 = this.f14029e;
                        int i14 = this.f14030g;
                        this.f14030g = i14 + 1;
                        l1.p(bArr3, i14, (byte) i13);
                        return;
                    }
                    byte[] bArr4 = this.f14029e;
                    int i15 = this.f14030g;
                    this.f14030g = i15 + 1;
                    l1.p(bArr4, i15, (byte) (i13 | 128));
                    int i16 = i13 >>> 7;
                    if ((i16 & (-128)) == 0) {
                        byte[] bArr5 = this.f14029e;
                        int i17 = this.f14030g;
                        this.f14030g = i17 + 1;
                        l1.p(bArr5, i17, (byte) i16);
                        return;
                    }
                    byte[] bArr6 = this.f14029e;
                    int i18 = this.f14030g;
                    this.f14030g = i18 + 1;
                    l1.p(bArr6, i18, (byte) (i16 | 128));
                    int i19 = i16 >>> 7;
                    if ((i19 & (-128)) == 0) {
                        byte[] bArr7 = this.f14029e;
                        int i20 = this.f14030g;
                        this.f14030g = i20 + 1;
                        l1.p(bArr7, i20, (byte) i19);
                        return;
                    }
                    byte[] bArr8 = this.f14029e;
                    int i21 = this.f14030g;
                    this.f14030g = i21 + 1;
                    l1.p(bArr8, i21, (byte) (i19 | 128));
                    byte[] bArr9 = this.f14029e;
                    int i22 = this.f14030g;
                    this.f14030g = i22 + 1;
                    l1.p(bArr9, i22, (byte) (i19 >>> 7));
                    return;
                }
            }
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr10 = this.f14029e;
                    int i23 = this.f14030g;
                    this.f14030g = i23 + 1;
                    bArr10[i23] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14030g), Integer.valueOf(this.f), 1), e10);
                }
            }
            byte[] bArr11 = this.f14029e;
            int i24 = this.f14030g;
            this.f14030g = i24 + 1;
            bArr11[i24] = (byte) i10;
        }

        @Override // s0.j
        public final void n0(int i10, long j10) {
            k0(i10, 0);
            o0(j10);
        }

        @Override // s0.j
        public final void o0(long j10) {
            if (j.f14025d && this.f - this.f14030g >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f14029e;
                    int i10 = this.f14030g;
                    this.f14030g = i10 + 1;
                    l1.p(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f14029e;
                int i11 = this.f14030g;
                this.f14030g = i11 + 1;
                l1.p(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f14029e;
                    int i12 = this.f14030g;
                    this.f14030g = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14030g), Integer.valueOf(this.f), 1), e10);
                }
            }
            byte[] bArr4 = this.f14029e;
            int i13 = this.f14030g;
            this.f14030g = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        public final void p0(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f14029e, this.f14030g, i11);
                this.f14030g += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14030g), Integer.valueOf(this.f), Integer.valueOf(i11)), e10);
            }
        }

        @Override // m.e
        public final void s(byte[] bArr, int i10, int i11) {
            p0(bArr, i10, i11);
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
        public final OutputStream f14031h;

        public d(q.b bVar, int i10) {
            super(i10);
            this.f14031h = bVar;
        }

        @Override // s0.j
        public final void T(byte b10) {
            if (this.f14028g == this.f) {
                u0();
            }
            byte[] bArr = this.f14027e;
            int i10 = this.f14028g;
            this.f14028g = i10 + 1;
            bArr[i10] = b10;
        }

        @Override // s0.j
        public final void U(int i10, boolean z10) {
            v0(11);
            r0(i10, 0);
            byte b10 = z10 ? (byte) 1 : (byte) 0;
            byte[] bArr = this.f14027e;
            int i11 = this.f14028g;
            this.f14028g = i11 + 1;
            bArr[i11] = b10;
        }

        @Override // s0.j
        public final void V(byte[] bArr, int i10) {
            m0(i10);
            w0(bArr, 0, i10);
        }

        @Override // s0.j
        public final void W(int i10, g gVar) {
            k0(i10, 2);
            X(gVar);
        }

        @Override // s0.j
        public final void X(g gVar) {
            m0(gVar.size());
            gVar.o(this);
        }

        @Override // s0.j
        public final void Y(int i10, int i11) {
            v0(14);
            r0(i10, 5);
            p0(i11);
        }

        @Override // s0.j
        public final void Z(int i10) {
            v0(4);
            p0(i10);
        }

        @Override // s0.j
        public final void a0(int i10, long j10) {
            v0(18);
            r0(i10, 1);
            q0(j10);
        }

        @Override // s0.j
        public final void b0(long j10) {
            v0(8);
            q0(j10);
        }

        @Override // s0.j
        public final void c0(int i10, int i11) {
            v0(20);
            r0(i10, 0);
            if (i11 >= 0) {
                s0(i11);
            } else {
                t0(i11);
            }
        }

        @Override // s0.j
        public final void d0(int i10) {
            if (i10 >= 0) {
                m0(i10);
            } else {
                o0(i10);
            }
        }

        @Override // s0.j
        public final void e0(int i10, o0 o0Var, c1 c1Var) {
            k0(i10, 2);
            m0(((s0.a) o0Var).i(c1Var));
            c1Var.h(o0Var, this.f14026b);
        }

        @Override // s0.j
        public final void f0(o0 o0Var) {
            m0(o0Var.d());
            o0Var.g(this);
        }

        @Override // s0.j
        public final void g0(int i10, o0 o0Var) {
            k0(1, 3);
            l0(2, i10);
            k0(3, 2);
            f0(o0Var);
            k0(1, 4);
        }

        @Override // s0.j
        public final void h0(int i10, g gVar) {
            k0(1, 3);
            l0(2, i10);
            W(3, gVar);
            k0(1, 4);
        }

        @Override // s0.j
        public final void i0(int i10, String str) {
            k0(i10, 2);
            j0(str);
        }

        @Override // s0.j
        public final void j0(String str) {
            try {
                int length = str.length() * 3;
                int P = j.P(length);
                int i10 = P + length;
                int i11 = this.f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int b10 = m1.f14049a.b(str, bArr, 0, length);
                    m0(b10);
                    w0(bArr, 0, b10);
                    return;
                }
                if (i10 > i11 - this.f14028g) {
                    u0();
                }
                int P2 = j.P(str.length());
                int i12 = this.f14028g;
                try {
                    try {
                        if (P2 == P) {
                            int i13 = i12 + P2;
                            this.f14028g = i13;
                            int b11 = m1.f14049a.b(str, this.f14027e, i13, this.f - i13);
                            this.f14028g = i12;
                            s0((b11 - i12) - P2);
                            this.f14028g = b11;
                        } else {
                            int a10 = m1.a(str);
                            s0(a10);
                            this.f14028g = m1.f14049a.b(str, this.f14027e, this.f14028g, a10);
                        }
                    } catch (ArrayIndexOutOfBoundsException e10) {
                        throw new c(e10);
                    }
                } catch (m1.d e11) {
                    this.f14028g = i12;
                    throw e11;
                }
            } catch (m1.d e12) {
                S(str, e12);
            }
        }

        @Override // s0.j
        public final void k0(int i10, int i11) {
            m0((i10 << 3) | i11);
        }

        @Override // s0.j
        public final void l0(int i10, int i11) {
            v0(20);
            r0(i10, 0);
            s0(i11);
        }

        @Override // s0.j
        public final void m0(int i10) {
            v0(5);
            s0(i10);
        }

        @Override // s0.j
        public final void n0(int i10, long j10) {
            v0(20);
            r0(i10, 0);
            t0(j10);
        }

        @Override // s0.j
        public final void o0(long j10) {
            v0(10);
            t0(j10);
        }

        @Override // m.e
        public final void s(byte[] bArr, int i10, int i11) {
            w0(bArr, i10, i11);
        }

        public final void u0() {
            this.f14031h.write(this.f14027e, 0, this.f14028g);
            this.f14028g = 0;
        }

        public final void v0(int i10) {
            if (this.f - this.f14028g < i10) {
                u0();
            }
        }

        public final void w0(byte[] bArr, int i10, int i11) {
            int i12 = this.f;
            int i13 = this.f14028g;
            int i14 = i12 - i13;
            if (i14 >= i11) {
                System.arraycopy(bArr, i10, this.f14027e, i13, i11);
                this.f14028g += i11;
                return;
            }
            System.arraycopy(bArr, i10, this.f14027e, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f14028g = this.f;
            u0();
            if (i16 > this.f) {
                this.f14031h.write(bArr, i15, i16);
            } else {
                System.arraycopy(bArr, i15, this.f14027e, 0, i16);
                this.f14028g = i16;
            }
        }
    }

    public j() {
        super(1);
    }

    public static int A(int i10) {
        return N(i10) + 8;
    }

    public static int B(int i10) {
        return N(i10) + 4;
    }

    @Deprecated
    public static int C(int i10, o0 o0Var, c1 c1Var) {
        return ((s0.a) o0Var).i(c1Var) + (N(i10) * 2);
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

    public static int G(b0 b0Var) {
        int size = b0Var.f13947b != null ? b0Var.f13947b.size() : b0Var.f13946a != null ? b0Var.f13946a.d() : 0;
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
            length = m1.a(str);
        } catch (m1.d unused) {
            length = str.getBytes(x.f14119a).length;
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

    public static int w(int i10, g gVar) {
        int N = N(i10);
        int size = gVar.size();
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

    public final void S(String str, m1.d dVar) {
        f14024c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(x.f14119a);
        try {
            m0(bytes.length);
            s(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new c(e10);
        } catch (c e11) {
            throw e11;
        }
    }

    public abstract void T(byte b10);

    public abstract void U(int i10, boolean z10);

    public abstract void V(byte[] bArr, int i10);

    public abstract void W(int i10, g gVar);

    public abstract void X(g gVar);

    public abstract void Y(int i10, int i11);

    public abstract void Z(int i10);

    public abstract void a0(int i10, long j10);

    public abstract void b0(long j10);

    public abstract void c0(int i10, int i11);

    public abstract void d0(int i10);

    public abstract void e0(int i10, o0 o0Var, c1 c1Var);

    public abstract void f0(o0 o0Var);

    public abstract void g0(int i10, o0 o0Var);

    public abstract void h0(int i10, g gVar);

    public abstract void i0(int i10, String str);

    public abstract void j0(String str);

    public abstract void k0(int i10, int i11);

    public abstract void l0(int i10, int i11);

    public abstract void m0(int i10);

    public abstract void n0(int i10, long j10);

    public abstract void o0(long j10);
}
