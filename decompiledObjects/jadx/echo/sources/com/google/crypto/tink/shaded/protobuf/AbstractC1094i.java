package com.google.crypto.tink.shaded.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.crypto.tink.shaded.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1094i {

    /* renamed from: f, reason: collision with root package name */
    public static volatile int f11349f = 100;

    /* renamed from: a, reason: collision with root package name */
    public int f11350a;

    /* renamed from: b, reason: collision with root package name */
    public int f11351b;

    /* renamed from: c, reason: collision with root package name */
    public int f11352c;

    /* renamed from: d, reason: collision with root package name */
    public C1095j f11353d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11354e;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$b */
    public static final class b extends AbstractC1094i {

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f11355g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f11356h;

        /* renamed from: i, reason: collision with root package name */
        public int f11357i;

        /* renamed from: j, reason: collision with root package name */
        public int f11358j;

        /* renamed from: k, reason: collision with root package name */
        public int f11359k;

        /* renamed from: l, reason: collision with root package name */
        public int f11360l;

        /* renamed from: m, reason: collision with root package name */
        public int f11361m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f11362n;

        /* renamed from: o, reason: collision with root package name */
        public int f11363o;

        public b(byte[] bArr, int i7, int i8, boolean z7) {
            super();
            this.f11363o = Integer.MAX_VALUE;
            this.f11355g = bArr;
            this.f11357i = i8 + i7;
            this.f11359k = i7;
            this.f11360l = i7;
            this.f11356h = z7;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public String A() {
            int J6 = J();
            if (J6 > 0) {
                int i7 = this.f11357i;
                int i8 = this.f11359k;
                if (J6 <= i7 - i8) {
                    String e7 = p0.e(this.f11355g, i8, J6);
                    this.f11359k += J6;
                    return e7;
                }
            }
            if (J6 == 0) {
                return "";
            }
            if (J6 <= 0) {
                throw A.g();
            }
            throw A.m();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public int B() {
            if (e()) {
                this.f11361m = 0;
                return 0;
            }
            int J6 = J();
            this.f11361m = J6;
            if (q0.a(J6) != 0) {
                return this.f11361m;
            }
            throw A.c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public int C() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public long D() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public boolean E(int i7) {
            int b7 = q0.b(i7);
            if (b7 == 0) {
                P();
                return true;
            }
            if (b7 == 1) {
                O(8);
                return true;
            }
            if (b7 == 2) {
                O(J());
                return true;
            }
            if (b7 == 3) {
                N();
                a(q0.c(q0.a(i7), 4));
                return true;
            }
            if (b7 == 4) {
                return false;
            }
            if (b7 != 5) {
                throw A.e();
            }
            O(4);
            return true;
        }

        public byte F() {
            int i7 = this.f11359k;
            if (i7 == this.f11357i) {
                throw A.m();
            }
            byte[] bArr = this.f11355g;
            this.f11359k = i7 + 1;
            return bArr[i7];
        }

        public byte[] G(int i7) {
            if (i7 > 0) {
                int i8 = this.f11357i;
                int i9 = this.f11359k;
                if (i7 <= i8 - i9) {
                    int i10 = i7 + i9;
                    this.f11359k = i10;
                    return Arrays.copyOfRange(this.f11355g, i9, i10);
                }
            }
            if (i7 > 0) {
                throw A.m();
            }
            if (i7 == 0) {
                return AbstractC1110z.f11555d;
            }
            throw A.g();
        }

        public int H() {
            int i7 = this.f11359k;
            if (this.f11357i - i7 < 4) {
                throw A.m();
            }
            byte[] bArr = this.f11355g;
            this.f11359k = i7 + 4;
            return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
        }

        public long I() {
            int i7 = this.f11359k;
            if (this.f11357i - i7 < 8) {
                throw A.m();
            }
            byte[] bArr = this.f11355g;
            this.f11359k = i7 + 8;
            return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
        }

        public int J() {
            int i7;
            int i8 = this.f11359k;
            int i9 = this.f11357i;
            if (i9 != i8) {
                byte[] bArr = this.f11355g;
                int i10 = i8 + 1;
                byte b7 = bArr[i8];
                if (b7 >= 0) {
                    this.f11359k = i10;
                    return b7;
                }
                if (i9 - i10 >= 9) {
                    int i11 = i8 + 2;
                    int i12 = (bArr[i10] << 7) ^ b7;
                    if (i12 < 0) {
                        i7 = i12 ^ (-128);
                    } else {
                        int i13 = i8 + 3;
                        int i14 = (bArr[i11] << 14) ^ i12;
                        if (i14 >= 0) {
                            i7 = i14 ^ 16256;
                        } else {
                            int i15 = i8 + 4;
                            int i16 = i14 ^ (bArr[i13] << 21);
                            if (i16 < 0) {
                                i7 = (-2080896) ^ i16;
                            } else {
                                i13 = i8 + 5;
                                byte b8 = bArr[i15];
                                int i17 = (i16 ^ (b8 << 28)) ^ 266354560;
                                if (b8 < 0) {
                                    i15 = i8 + 6;
                                    if (bArr[i13] < 0) {
                                        i13 = i8 + 7;
                                        if (bArr[i15] < 0) {
                                            i15 = i8 + 8;
                                            if (bArr[i13] < 0) {
                                                i13 = i8 + 9;
                                                if (bArr[i15] < 0) {
                                                    int i18 = i8 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i11 = i18;
                                                        i7 = i17;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i7 = i17;
                                }
                                i7 = i17;
                            }
                            i11 = i15;
                        }
                        i11 = i13;
                    }
                    this.f11359k = i11;
                    return i7;
                }
            }
            return (int) L();
        }

        public long K() {
            long j7;
            long j8;
            long j9;
            int i7 = this.f11359k;
            int i8 = this.f11357i;
            if (i8 != i7) {
                byte[] bArr = this.f11355g;
                int i9 = i7 + 1;
                byte b7 = bArr[i7];
                if (b7 >= 0) {
                    this.f11359k = i9;
                    return b7;
                }
                if (i8 - i9 >= 9) {
                    int i10 = i7 + 2;
                    int i11 = (bArr[i9] << 7) ^ b7;
                    if (i11 < 0) {
                        j7 = i11 ^ (-128);
                    } else {
                        int i12 = i7 + 3;
                        int i13 = (bArr[i10] << 14) ^ i11;
                        if (i13 >= 0) {
                            j7 = i13 ^ 16256;
                            i10 = i12;
                        } else {
                            int i14 = i7 + 4;
                            int i15 = i13 ^ (bArr[i12] << 21);
                            if (i15 < 0) {
                                long j10 = (-2080896) ^ i15;
                                i10 = i14;
                                j7 = j10;
                            } else {
                                long j11 = i15;
                                i10 = i7 + 5;
                                long j12 = j11 ^ (bArr[i14] << 28);
                                if (j12 >= 0) {
                                    j9 = 266354560;
                                } else {
                                    int i16 = i7 + 6;
                                    long j13 = j12 ^ (bArr[i10] << 35);
                                    if (j13 < 0) {
                                        j8 = -34093383808L;
                                    } else {
                                        i10 = i7 + 7;
                                        j12 = j13 ^ (bArr[i16] << 42);
                                        if (j12 >= 0) {
                                            j9 = 4363953127296L;
                                        } else {
                                            i16 = i7 + 8;
                                            j13 = j12 ^ (bArr[i10] << 49);
                                            if (j13 < 0) {
                                                j8 = -558586000294016L;
                                            } else {
                                                i10 = i7 + 9;
                                                long j14 = (j13 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                                if (j14 < 0) {
                                                    int i17 = i7 + 10;
                                                    if (bArr[i10] >= 0) {
                                                        i10 = i17;
                                                    }
                                                }
                                                j7 = j14;
                                            }
                                        }
                                    }
                                    j7 = j13 ^ j8;
                                    i10 = i16;
                                }
                                j7 = j12 ^ j9;
                            }
                        }
                    }
                    this.f11359k = i10;
                    return j7;
                }
            }
            return L();
        }

        public long L() {
            long j7 = 0;
            for (int i7 = 0; i7 < 64; i7 += 7) {
                j7 |= (r3 & Byte.MAX_VALUE) << i7;
                if ((F() & 128) == 0) {
                    return j7;
                }
            }
            throw A.f();
        }

        public final void M() {
            int i7 = this.f11357i + this.f11358j;
            this.f11357i = i7;
            int i8 = i7 - this.f11360l;
            int i9 = this.f11363o;
            if (i8 <= i9) {
                this.f11358j = 0;
                return;
            }
            int i10 = i8 - i9;
            this.f11358j = i10;
            this.f11357i = i7 - i10;
        }

        public void N() {
            int B7;
            do {
                B7 = B();
                if (B7 == 0) {
                    return;
                }
            } while (E(B7));
        }

        public void O(int i7) {
            if (i7 >= 0) {
                int i8 = this.f11357i;
                int i9 = this.f11359k;
                if (i7 <= i8 - i9) {
                    this.f11359k = i9 + i7;
                    return;
                }
            }
            if (i7 >= 0) {
                throw A.m();
            }
            throw A.g();
        }

        public final void P() {
            if (this.f11357i - this.f11359k >= 10) {
                Q();
            } else {
                R();
            }
        }

        public final void Q() {
            for (int i7 = 0; i7 < 10; i7++) {
                byte[] bArr = this.f11355g;
                int i8 = this.f11359k;
                this.f11359k = i8 + 1;
                if (bArr[i8] >= 0) {
                    return;
                }
            }
            throw A.f();
        }

        public final void R() {
            for (int i7 = 0; i7 < 10; i7++) {
                if (F() >= 0) {
                    return;
                }
            }
            throw A.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public void a(int i7) {
            if (this.f11361m != i7) {
                throw A.b();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public int d() {
            return this.f11359k - this.f11360l;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public boolean e() {
            return this.f11359k == this.f11357i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public void k(int i7) {
            this.f11363o = i7;
            M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public int l(int i7) {
            if (i7 < 0) {
                throw A.g();
            }
            int d7 = i7 + d();
            if (d7 < 0) {
                throw A.h();
            }
            int i8 = this.f11363o;
            if (d7 > i8) {
                throw A.m();
            }
            this.f11363o = d7;
            M();
            return i8;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public boolean m() {
            return K() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public AbstractC1093h n() {
            int J6 = J();
            if (J6 > 0) {
                int i7 = this.f11357i;
                int i8 = this.f11359k;
                if (J6 <= i7 - i8) {
                    AbstractC1093h f02 = (this.f11356h && this.f11362n) ? AbstractC1093h.f0(this.f11355g, i8, J6) : AbstractC1093h.k(this.f11355g, i8, J6);
                    this.f11359k += J6;
                    return f02;
                }
            }
            return J6 == 0 ? AbstractC1093h.f11337p : AbstractC1093h.e0(G(J6));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public double o() {
            return Double.longBitsToDouble(I());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public int p() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public int q() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public long r() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public float s() {
            return Float.intBitsToFloat(H());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public int t() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public long u() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public int v() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public long w() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public int x() {
            return AbstractC1094i.b(J());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public long y() {
            return AbstractC1094i.c(K());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public String z() {
            int J6 = J();
            if (J6 > 0) {
                int i7 = this.f11357i;
                int i8 = this.f11359k;
                if (J6 <= i7 - i8) {
                    String str = new String(this.f11355g, i8, J6, AbstractC1110z.f11553b);
                    this.f11359k += J6;
                    return str;
                }
            }
            if (J6 == 0) {
                return "";
            }
            if (J6 < 0) {
                throw A.g();
            }
            throw A.m();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$c */
    public static final class c extends AbstractC1094i {

        /* renamed from: g, reason: collision with root package name */
        public final InputStream f11364g;

        /* renamed from: h, reason: collision with root package name */
        public final byte[] f11365h;

        /* renamed from: i, reason: collision with root package name */
        public int f11366i;

        /* renamed from: j, reason: collision with root package name */
        public int f11367j;

        /* renamed from: k, reason: collision with root package name */
        public int f11368k;

        /* renamed from: l, reason: collision with root package name */
        public int f11369l;

        /* renamed from: m, reason: collision with root package name */
        public int f11370m;

        /* renamed from: n, reason: collision with root package name */
        public int f11371n;

        public c(InputStream inputStream, int i7) {
            super();
            this.f11371n = Integer.MAX_VALUE;
            AbstractC1110z.b(inputStream, "input");
            this.f11364g = inputStream;
            this.f11365h = new byte[i7];
            this.f11366i = 0;
            this.f11368k = 0;
            this.f11370m = 0;
        }

        public static int F(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (A e7) {
                e7.j();
                throw e7;
            }
        }

        public static int G(InputStream inputStream, byte[] bArr, int i7, int i8) {
            try {
                return inputStream.read(bArr, i7, i8);
            } catch (A e7) {
                e7.j();
                throw e7;
            }
        }

        private void R() {
            int i7 = this.f11366i + this.f11367j;
            this.f11366i = i7;
            int i8 = this.f11370m + i7;
            int i9 = this.f11371n;
            if (i8 <= i9) {
                this.f11367j = 0;
                return;
            }
            int i10 = i8 - i9;
            this.f11367j = i10;
            this.f11366i = i7 - i10;
        }

        public static long T(InputStream inputStream, long j7) {
            try {
                return inputStream.skip(j7);
            } catch (A e7) {
                e7.j();
                throw e7;
            }
        }

        private void X() {
            if (this.f11366i - this.f11368k >= 10) {
                Y();
            } else {
                Z();
            }
        }

        private void Y() {
            for (int i7 = 0; i7 < 10; i7++) {
                byte[] bArr = this.f11365h;
                int i8 = this.f11368k;
                this.f11368k = i8 + 1;
                if (bArr[i8] >= 0) {
                    return;
                }
            }
            throw A.f();
        }

        private void Z() {
            for (int i7 = 0; i7 < 10; i7++) {
                if (I() >= 0) {
                    return;
                }
            }
            throw A.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public String A() {
            byte[] J6;
            int O6 = O();
            int i7 = this.f11368k;
            int i8 = this.f11366i;
            if (O6 <= i8 - i7 && O6 > 0) {
                J6 = this.f11365h;
                this.f11368k = i7 + O6;
            } else {
                if (O6 == 0) {
                    return "";
                }
                i7 = 0;
                if (O6 <= i8) {
                    S(O6);
                    J6 = this.f11365h;
                    this.f11368k = O6;
                } else {
                    J6 = J(O6, false);
                }
            }
            return p0.e(J6, i7, O6);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public int B() {
            if (e()) {
                this.f11369l = 0;
                return 0;
            }
            int O6 = O();
            this.f11369l = O6;
            if (q0.a(O6) != 0) {
                return this.f11369l;
            }
            throw A.c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public int C() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public long D() {
            return P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public boolean E(int i7) {
            int b7 = q0.b(i7);
            if (b7 == 0) {
                X();
                return true;
            }
            if (b7 == 1) {
                V(8);
                return true;
            }
            if (b7 == 2) {
                V(O());
                return true;
            }
            if (b7 == 3) {
                U();
                a(q0.c(q0.a(i7), 4));
                return true;
            }
            if (b7 == 4) {
                return false;
            }
            if (b7 != 5) {
                throw A.e();
            }
            V(4);
            return true;
        }

        public final AbstractC1093h H(int i7) {
            byte[] K6 = K(i7);
            if (K6 != null) {
                return AbstractC1093h.i(K6);
            }
            int i8 = this.f11368k;
            int i9 = this.f11366i;
            int i10 = i9 - i8;
            this.f11370m += i9;
            this.f11368k = 0;
            this.f11366i = 0;
            List<byte[]> L6 = L(i7 - i10);
            byte[] bArr = new byte[i7];
            System.arraycopy(this.f11365h, i8, bArr, 0, i10);
            for (byte[] bArr2 : L6) {
                System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
                i10 += bArr2.length;
            }
            return AbstractC1093h.e0(bArr);
        }

        public byte I() {
            if (this.f11368k == this.f11366i) {
                S(1);
            }
            byte[] bArr = this.f11365h;
            int i7 = this.f11368k;
            this.f11368k = i7 + 1;
            return bArr[i7];
        }

        public final byte[] J(int i7, boolean z7) {
            byte[] K6 = K(i7);
            if (K6 != null) {
                return z7 ? (byte[]) K6.clone() : K6;
            }
            int i8 = this.f11368k;
            int i9 = this.f11366i;
            int i10 = i9 - i8;
            this.f11370m += i9;
            this.f11368k = 0;
            this.f11366i = 0;
            List<byte[]> L6 = L(i7 - i10);
            byte[] bArr = new byte[i7];
            System.arraycopy(this.f11365h, i8, bArr, 0, i10);
            for (byte[] bArr2 : L6) {
                System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
                i10 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] K(int i7) {
            if (i7 == 0) {
                return AbstractC1110z.f11555d;
            }
            if (i7 < 0) {
                throw A.g();
            }
            int i8 = this.f11370m;
            int i9 = this.f11368k;
            int i10 = i8 + i9 + i7;
            if (i10 - this.f11352c > 0) {
                throw A.l();
            }
            int i11 = this.f11371n;
            if (i10 > i11) {
                V((i11 - i8) - i9);
                throw A.m();
            }
            int i12 = this.f11366i - i9;
            int i13 = i7 - i12;
            if (i13 >= 4096 && i13 > F(this.f11364g)) {
                return null;
            }
            byte[] bArr = new byte[i7];
            System.arraycopy(this.f11365h, this.f11368k, bArr, 0, i12);
            this.f11370m += this.f11366i;
            this.f11368k = 0;
            this.f11366i = 0;
            while (i12 < i7) {
                int G6 = G(this.f11364g, bArr, i12, i7 - i12);
                if (G6 == -1) {
                    throw A.m();
                }
                this.f11370m += G6;
                i12 += G6;
            }
            return bArr;
        }

        public final List L(int i7) {
            ArrayList arrayList = new ArrayList();
            while (i7 > 0) {
                int min = Math.min(i7, 4096);
                byte[] bArr = new byte[min];
                int i8 = 0;
                while (i8 < min) {
                    int read = this.f11364g.read(bArr, i8, min - i8);
                    if (read == -1) {
                        throw A.m();
                    }
                    this.f11370m += read;
                    i8 += read;
                }
                i7 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public int M() {
            int i7 = this.f11368k;
            if (this.f11366i - i7 < 4) {
                S(4);
                i7 = this.f11368k;
            }
            byte[] bArr = this.f11365h;
            this.f11368k = i7 + 4;
            return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
        }

        public long N() {
            int i7 = this.f11368k;
            if (this.f11366i - i7 < 8) {
                S(8);
                i7 = this.f11368k;
            }
            byte[] bArr = this.f11365h;
            this.f11368k = i7 + 8;
            return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
        }

        public int O() {
            int i7;
            int i8 = this.f11368k;
            int i9 = this.f11366i;
            if (i9 != i8) {
                byte[] bArr = this.f11365h;
                int i10 = i8 + 1;
                byte b7 = bArr[i8];
                if (b7 >= 0) {
                    this.f11368k = i10;
                    return b7;
                }
                if (i9 - i10 >= 9) {
                    int i11 = i8 + 2;
                    int i12 = (bArr[i10] << 7) ^ b7;
                    if (i12 < 0) {
                        i7 = i12 ^ (-128);
                    } else {
                        int i13 = i8 + 3;
                        int i14 = (bArr[i11] << 14) ^ i12;
                        if (i14 >= 0) {
                            i7 = i14 ^ 16256;
                        } else {
                            int i15 = i8 + 4;
                            int i16 = i14 ^ (bArr[i13] << 21);
                            if (i16 < 0) {
                                i7 = (-2080896) ^ i16;
                            } else {
                                i13 = i8 + 5;
                                byte b8 = bArr[i15];
                                int i17 = (i16 ^ (b8 << 28)) ^ 266354560;
                                if (b8 < 0) {
                                    i15 = i8 + 6;
                                    if (bArr[i13] < 0) {
                                        i13 = i8 + 7;
                                        if (bArr[i15] < 0) {
                                            i15 = i8 + 8;
                                            if (bArr[i13] < 0) {
                                                i13 = i8 + 9;
                                                if (bArr[i15] < 0) {
                                                    int i18 = i8 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i11 = i18;
                                                        i7 = i17;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i7 = i17;
                                }
                                i7 = i17;
                            }
                            i11 = i15;
                        }
                        i11 = i13;
                    }
                    this.f11368k = i11;
                    return i7;
                }
            }
            return (int) Q();
        }

        public long P() {
            long j7;
            long j8;
            long j9;
            int i7 = this.f11368k;
            int i8 = this.f11366i;
            if (i8 != i7) {
                byte[] bArr = this.f11365h;
                int i9 = i7 + 1;
                byte b7 = bArr[i7];
                if (b7 >= 0) {
                    this.f11368k = i9;
                    return b7;
                }
                if (i8 - i9 >= 9) {
                    int i10 = i7 + 2;
                    int i11 = (bArr[i9] << 7) ^ b7;
                    if (i11 < 0) {
                        j7 = i11 ^ (-128);
                    } else {
                        int i12 = i7 + 3;
                        int i13 = (bArr[i10] << 14) ^ i11;
                        if (i13 >= 0) {
                            j7 = i13 ^ 16256;
                            i10 = i12;
                        } else {
                            int i14 = i7 + 4;
                            int i15 = i13 ^ (bArr[i12] << 21);
                            if (i15 < 0) {
                                long j10 = (-2080896) ^ i15;
                                i10 = i14;
                                j7 = j10;
                            } else {
                                long j11 = i15;
                                i10 = i7 + 5;
                                long j12 = j11 ^ (bArr[i14] << 28);
                                if (j12 >= 0) {
                                    j9 = 266354560;
                                } else {
                                    int i16 = i7 + 6;
                                    long j13 = j12 ^ (bArr[i10] << 35);
                                    if (j13 < 0) {
                                        j8 = -34093383808L;
                                    } else {
                                        i10 = i7 + 7;
                                        j12 = j13 ^ (bArr[i16] << 42);
                                        if (j12 >= 0) {
                                            j9 = 4363953127296L;
                                        } else {
                                            i16 = i7 + 8;
                                            j13 = j12 ^ (bArr[i10] << 49);
                                            if (j13 < 0) {
                                                j8 = -558586000294016L;
                                            } else {
                                                i10 = i7 + 9;
                                                long j14 = (j13 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                                if (j14 < 0) {
                                                    int i17 = i7 + 10;
                                                    if (bArr[i10] >= 0) {
                                                        i10 = i17;
                                                    }
                                                }
                                                j7 = j14;
                                            }
                                        }
                                    }
                                    j7 = j13 ^ j8;
                                    i10 = i16;
                                }
                                j7 = j12 ^ j9;
                            }
                        }
                    }
                    this.f11368k = i10;
                    return j7;
                }
            }
            return Q();
        }

        public long Q() {
            long j7 = 0;
            for (int i7 = 0; i7 < 64; i7 += 7) {
                j7 |= (r3 & Byte.MAX_VALUE) << i7;
                if ((I() & 128) == 0) {
                    return j7;
                }
            }
            throw A.f();
        }

        public final void S(int i7) {
            if (a0(i7)) {
                return;
            }
            if (i7 <= (this.f11352c - this.f11370m) - this.f11368k) {
                throw A.m();
            }
            throw A.l();
        }

        public void U() {
            int B7;
            do {
                B7 = B();
                if (B7 == 0) {
                    return;
                }
            } while (E(B7));
        }

        public void V(int i7) {
            int i8 = this.f11366i;
            int i9 = this.f11368k;
            if (i7 > i8 - i9 || i7 < 0) {
                W(i7);
            } else {
                this.f11368k = i9 + i7;
            }
        }

        public final void W(int i7) {
            if (i7 < 0) {
                throw A.g();
            }
            int i8 = this.f11370m;
            int i9 = this.f11368k;
            int i10 = i8 + i9 + i7;
            int i11 = this.f11371n;
            if (i10 > i11) {
                V((i11 - i8) - i9);
                throw A.m();
            }
            this.f11370m = i8 + i9;
            int i12 = this.f11366i - i9;
            this.f11366i = 0;
            this.f11368k = 0;
            while (i12 < i7) {
                try {
                    long j7 = i7 - i12;
                    long T6 = T(this.f11364g, j7);
                    if (T6 < 0 || T6 > j7) {
                        throw new IllegalStateException(this.f11364g.getClass() + "#skip returned invalid result: " + T6 + "\nThe InputStream implementation is buggy.");
                    }
                    if (T6 == 0) {
                        break;
                    } else {
                        i12 += (int) T6;
                    }
                } finally {
                    this.f11370m += i12;
                    R();
                }
            }
            if (i12 >= i7) {
                return;
            }
            int i13 = this.f11366i;
            int i14 = i13 - this.f11368k;
            this.f11368k = i13;
            while (true) {
                S(1);
                int i15 = i7 - i14;
                int i16 = this.f11366i;
                if (i15 <= i16) {
                    this.f11368k = i15;
                    return;
                } else {
                    i14 += i16;
                    this.f11368k = i16;
                }
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public void a(int i7) {
            if (this.f11369l != i7) {
                throw A.b();
            }
        }

        public final boolean a0(int i7) {
            int i8 = this.f11368k;
            int i9 = i8 + i7;
            int i10 = this.f11366i;
            if (i9 <= i10) {
                throw new IllegalStateException("refillBuffer() called when " + i7 + " bytes were already available in buffer");
            }
            int i11 = this.f11352c;
            int i12 = this.f11370m;
            if (i7 > (i11 - i12) - i8 || i12 + i8 + i7 > this.f11371n) {
                return false;
            }
            if (i8 > 0) {
                if (i10 > i8) {
                    byte[] bArr = this.f11365h;
                    System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
                }
                this.f11370m += i8;
                this.f11366i -= i8;
                this.f11368k = 0;
            }
            InputStream inputStream = this.f11364g;
            byte[] bArr2 = this.f11365h;
            int i13 = this.f11366i;
            int G6 = G(inputStream, bArr2, i13, Math.min(bArr2.length - i13, (this.f11352c - this.f11370m) - i13));
            if (G6 == 0 || G6 < -1 || G6 > this.f11365h.length) {
                throw new IllegalStateException(this.f11364g.getClass() + "#read(byte[]) returned invalid result: " + G6 + "\nThe InputStream implementation is buggy.");
            }
            if (G6 <= 0) {
                return false;
            }
            this.f11366i += G6;
            R();
            if (this.f11366i >= i7) {
                return true;
            }
            return a0(i7);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public int d() {
            return this.f11370m + this.f11368k;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public boolean e() {
            return this.f11368k == this.f11366i && !a0(1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public void k(int i7) {
            this.f11371n = i7;
            R();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public int l(int i7) {
            if (i7 < 0) {
                throw A.g();
            }
            int i8 = i7 + this.f11370m + this.f11368k;
            int i9 = this.f11371n;
            if (i8 > i9) {
                throw A.m();
            }
            this.f11371n = i8;
            R();
            return i9;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public boolean m() {
            return P() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public AbstractC1093h n() {
            int O6 = O();
            int i7 = this.f11366i;
            int i8 = this.f11368k;
            if (O6 > i7 - i8 || O6 <= 0) {
                return O6 == 0 ? AbstractC1093h.f11337p : H(O6);
            }
            AbstractC1093h k7 = AbstractC1093h.k(this.f11365h, i8, O6);
            this.f11368k += O6;
            return k7;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public double o() {
            return Double.longBitsToDouble(N());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public int p() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public int q() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public long r() {
            return N();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public float s() {
            return Float.intBitsToFloat(M());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public int t() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public long u() {
            return P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public int v() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public long w() {
            return N();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public int x() {
            return AbstractC1094i.b(O());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public long y() {
            return AbstractC1094i.c(P());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1094i
        public String z() {
            int O6 = O();
            if (O6 > 0) {
                int i7 = this.f11366i;
                int i8 = this.f11368k;
                if (O6 <= i7 - i8) {
                    String str = new String(this.f11365h, i8, O6, AbstractC1110z.f11553b);
                    this.f11368k += O6;
                    return str;
                }
            }
            if (O6 == 0) {
                return "";
            }
            if (O6 > this.f11366i) {
                return new String(J(O6, false), AbstractC1110z.f11553b);
            }
            S(O6);
            String str2 = new String(this.f11365h, this.f11368k, O6, AbstractC1110z.f11553b);
            this.f11368k += O6;
            return str2;
        }
    }

    public AbstractC1094i() {
        this.f11351b = f11349f;
        this.f11352c = Integer.MAX_VALUE;
        this.f11354e = false;
    }

    public static int b(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    public static long c(long j7) {
        return (-(j7 & 1)) ^ (j7 >>> 1);
    }

    public static AbstractC1094i f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static AbstractC1094i g(InputStream inputStream, int i7) {
        if (i7 > 0) {
            return inputStream == null ? h(AbstractC1110z.f11555d) : new c(inputStream, i7);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC1094i h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static AbstractC1094i i(byte[] bArr, int i7, int i8) {
        return j(bArr, i7, i8, false);
    }

    public static AbstractC1094i j(byte[] bArr, int i7, int i8, boolean z7) {
        b bVar = new b(bArr, i7, i8, z7);
        try {
            bVar.l(i8);
            return bVar;
        } catch (A e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E(int i7);

    public abstract void a(int i7);

    public abstract int d();

    public abstract boolean e();

    public abstract void k(int i7);

    public abstract int l(int i7);

    public abstract boolean m();

    public abstract AbstractC1093h n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();
}
