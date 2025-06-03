package s0;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import s0.g;
import s0.y;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public int f13989a;

    /* renamed from: b, reason: collision with root package name */
    public int f13990b = 100;

    /* renamed from: c, reason: collision with root package name */
    public int f13991c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public i f13992d;

    public static final class a extends h {

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f13993e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f13994g;

        /* renamed from: h, reason: collision with root package name */
        public int f13995h;

        /* renamed from: i, reason: collision with root package name */
        public int f13996i;

        /* renamed from: j, reason: collision with root package name */
        public int f13997j;

        /* renamed from: k, reason: collision with root package name */
        public int f13998k = Integer.MAX_VALUE;

        public a(byte[] bArr, int i10, int i11, boolean z10) {
            this.f13993e = bArr;
            this.f = i11 + i10;
            this.f13995h = i10;
            this.f13996i = i10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int A() {
            /*
                r5 = this;
                int r0 = r5.f13995h
                int r1 = r5.f
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f13993e
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f13995h = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.C()
                int r0 = (int) r0
                return r0
            L70:
                r5.f13995h = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: s0.h.a.A():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long B() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: s0.h.a.B():long");
        }

        public final long C() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                int i11 = this.f13995h;
                if (i11 == this.f) {
                    throw y.f();
                }
                byte[] bArr = this.f13993e;
                this.f13995h = i11 + 1;
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((bArr[i11] & 128) == 0) {
                    return j10;
                }
            }
            throw y.c();
        }

        public final void D(int i10) {
            if (i10 >= 0) {
                int i11 = this.f;
                int i12 = this.f13995h;
                if (i10 <= i11 - i12) {
                    this.f13995h = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw y.f();
            }
            throw y.d();
        }

        @Override // s0.h
        public final void a(int i10) {
            if (this.f13997j != i10) {
                throw new y("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // s0.h
        public final int b() {
            return this.f13995h - this.f13996i;
        }

        @Override // s0.h
        public final boolean c() {
            return this.f13995h == this.f;
        }

        @Override // s0.h
        public final void d(int i10) {
            this.f13998k = i10;
            int i11 = this.f + this.f13994g;
            this.f = i11;
            int i12 = i11 - this.f13996i;
            if (i12 <= i10) {
                this.f13994g = 0;
                return;
            }
            int i13 = i12 - i10;
            this.f13994g = i13;
            this.f = i11 - i13;
        }

        @Override // s0.h
        public final int e(int i10) {
            if (i10 < 0) {
                throw y.d();
            }
            int i11 = this.f13995h;
            int i12 = this.f13996i;
            int i13 = (i11 - i12) + i10;
            int i14 = this.f13998k;
            if (i13 > i14) {
                throw y.f();
            }
            this.f13998k = i13;
            int i15 = this.f + this.f13994g;
            this.f = i15;
            int i16 = i15 - i12;
            if (i16 > i13) {
                int i17 = i16 - i13;
                this.f13994g = i17;
                this.f = i15 - i17;
            } else {
                this.f13994g = 0;
            }
            return i14;
        }

        @Override // s0.h
        public final boolean f() {
            return B() != 0;
        }

        @Override // s0.h
        public final g.e g() {
            byte[] bArr;
            int A = A();
            if (A > 0) {
                int i10 = this.f;
                int i11 = this.f13995h;
                if (A <= i10 - i11) {
                    g.e i12 = g.i(this.f13993e, i11, A);
                    this.f13995h += A;
                    return i12;
                }
            }
            if (A == 0) {
                return g.f13982b;
            }
            if (A > 0) {
                int i13 = this.f;
                int i14 = this.f13995h;
                if (A <= i13 - i14) {
                    int i15 = A + i14;
                    this.f13995h = i15;
                    bArr = Arrays.copyOfRange(this.f13993e, i14, i15);
                    g.e eVar = g.f13982b;
                    return new g.e(bArr);
                }
            }
            if (A > 0) {
                throw y.f();
            }
            if (A != 0) {
                throw y.d();
            }
            bArr = x.f14120b;
            g.e eVar2 = g.f13982b;
            return new g.e(bArr);
        }

        @Override // s0.h
        public final double h() {
            return Double.longBitsToDouble(z());
        }

        @Override // s0.h
        public final int i() {
            return A();
        }

        @Override // s0.h
        public final int j() {
            return y();
        }

        @Override // s0.h
        public final long k() {
            return z();
        }

        @Override // s0.h
        public final float l() {
            return Float.intBitsToFloat(y());
        }

        @Override // s0.h
        public final int m() {
            return A();
        }

        @Override // s0.h
        public final long n() {
            return B();
        }

        @Override // s0.h
        public final int o() {
            return y();
        }

        @Override // s0.h
        public final long p() {
            return z();
        }

        @Override // s0.h
        public final int q() {
            int A = A();
            return (-(A & 1)) ^ (A >>> 1);
        }

        @Override // s0.h
        public final long r() {
            long B = B();
            return (-(B & 1)) ^ (B >>> 1);
        }

        @Override // s0.h
        public final String s() {
            int A = A();
            if (A > 0) {
                int i10 = this.f;
                int i11 = this.f13995h;
                if (A <= i10 - i11) {
                    String str = new String(this.f13993e, i11, A, x.f14119a);
                    this.f13995h += A;
                    return str;
                }
            }
            if (A == 0) {
                return "";
            }
            if (A < 0) {
                throw y.d();
            }
            throw y.f();
        }

        @Override // s0.h
        public final String t() {
            int A = A();
            if (A > 0) {
                int i10 = this.f;
                int i11 = this.f13995h;
                if (A <= i10 - i11) {
                    String a10 = m1.f14049a.a(this.f13993e, i11, A);
                    this.f13995h += A;
                    return a10;
                }
            }
            if (A == 0) {
                return "";
            }
            if (A <= 0) {
                throw y.d();
            }
            throw y.f();
        }

        @Override // s0.h
        public final int u() {
            if (c()) {
                this.f13997j = 0;
                return 0;
            }
            int A = A();
            this.f13997j = A;
            if ((A >>> 3) != 0) {
                return A;
            }
            throw new y("Protocol message contained an invalid tag (zero).");
        }

        @Override // s0.h
        public final int v() {
            return A();
        }

        @Override // s0.h
        public final long w() {
            return B();
        }

        @Override // s0.h
        public final boolean x(int i10) {
            int i11;
            int u10;
            int i12 = i10 & 7;
            int i13 = 0;
            if (i12 == 0) {
                if (this.f - this.f13995h >= 10) {
                    while (i13 < 10) {
                        byte[] bArr = this.f13993e;
                        int i14 = this.f13995h;
                        this.f13995h = i14 + 1;
                        if (bArr[i14] < 0) {
                            i13++;
                        }
                    }
                    throw y.c();
                }
                while (i13 < 10) {
                    int i15 = this.f13995h;
                    if (i15 == this.f) {
                        throw y.f();
                    }
                    byte[] bArr2 = this.f13993e;
                    this.f13995h = i15 + 1;
                    if (bArr2[i15] < 0) {
                        i13++;
                    }
                }
                throw y.c();
                return true;
            }
            if (i12 == 1) {
                i11 = 8;
            } else {
                if (i12 != 2) {
                    if (i12 == 3) {
                        do {
                            u10 = u();
                            if (u10 == 0) {
                                break;
                            }
                        } while (x(u10));
                        a(((i10 >>> 3) << 3) | 4);
                        return true;
                    }
                    if (i12 == 4) {
                        return false;
                    }
                    if (i12 == 5) {
                        D(4);
                        return true;
                    }
                    int i16 = y.f14121a;
                    throw new y.a();
                }
                i11 = A();
            }
            D(i11);
            return true;
        }

        public final int y() {
            int i10 = this.f13995h;
            if (this.f - i10 < 4) {
                throw y.f();
            }
            byte[] bArr = this.f13993e;
            this.f13995h = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public final long z() {
            int i10 = this.f13995h;
            if (this.f - i10 < 8) {
                throw y.f();
            }
            byte[] bArr = this.f13993e;
            this.f13995h = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }
    }

    public static final class b extends h {

        /* renamed from: e, reason: collision with root package name */
        public final InputStream f13999e;
        public final byte[] f;

        /* renamed from: g, reason: collision with root package name */
        public int f14000g;

        /* renamed from: h, reason: collision with root package name */
        public int f14001h;

        /* renamed from: i, reason: collision with root package name */
        public int f14002i;

        /* renamed from: j, reason: collision with root package name */
        public int f14003j;

        /* renamed from: k, reason: collision with root package name */
        public int f14004k;

        /* renamed from: l, reason: collision with root package name */
        public int f14005l = Integer.MAX_VALUE;

        public b(FileInputStream fileInputStream) {
            Charset charset = x.f14119a;
            this.f13999e = fileInputStream;
            this.f = new byte[4096];
            this.f14000g = 0;
            this.f14002i = 0;
            this.f14004k = 0;
        }

        public final ArrayList A(int i10) {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, 4096);
                byte[] bArr = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.f13999e.read(bArr, i11, min - i11);
                    if (read == -1) {
                        throw y.f();
                    }
                    this.f14004k += read;
                    i11 += read;
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int B() {
            int i10 = this.f14002i;
            if (this.f14000g - i10 < 4) {
                H(4);
                i10 = this.f14002i;
            }
            byte[] bArr = this.f;
            this.f14002i = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public final long C() {
            int i10 = this.f14002i;
            if (this.f14000g - i10 < 8) {
                H(8);
                i10 = this.f14002i;
            }
            byte[] bArr = this.f;
            this.f14002i = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int D() {
            /*
                r5 = this;
                int r0 = r5.f14002i
                int r1 = r5.f14000g
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f14002i = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.F()
                int r0 = (int) r0
                return r0
            L70:
                r5.f14002i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: s0.h.b.D():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long E() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: s0.h.b.E():long");
        }

        public final long F() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                if (this.f14002i == this.f14000g) {
                    H(1);
                }
                byte[] bArr = this.f;
                int i11 = this.f14002i;
                this.f14002i = i11 + 1;
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((bArr[i11] & 128) == 0) {
                    return j10;
                }
            }
            throw y.c();
        }

        public final void G() {
            int i10 = this.f14000g + this.f14001h;
            this.f14000g = i10;
            int i11 = this.f14004k + i10;
            int i12 = this.f14005l;
            if (i11 <= i12) {
                this.f14001h = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f14001h = i13;
            this.f14000g = i10 - i13;
        }

        public final void H(int i10) {
            if (J(i10)) {
                return;
            }
            if (i10 <= (this.f13991c - this.f14004k) - this.f14002i) {
                throw y.f();
            }
            throw new y("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        public final void I(int i10) {
            int i11 = this.f14000g;
            int i12 = this.f14002i;
            if (i10 <= i11 - i12 && i10 >= 0) {
                this.f14002i = i12 + i10;
                return;
            }
            if (i10 < 0) {
                throw y.d();
            }
            int i13 = this.f14004k;
            int i14 = i13 + i12;
            int i15 = i14 + i10;
            int i16 = this.f14005l;
            if (i15 > i16) {
                I((i16 - i13) - i12);
                throw y.f();
            }
            this.f14004k = i14;
            int i17 = i11 - i12;
            this.f14000g = 0;
            this.f14002i = 0;
            while (i17 < i10) {
                try {
                    long j10 = i10 - i17;
                    long skip = this.f13999e.skip(j10);
                    if (skip < 0 || skip > j10) {
                        throw new IllegalStateException(this.f13999e.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i17 += (int) skip;
                    }
                } finally {
                    this.f14004k += i17;
                    G();
                }
            }
            if (i17 >= i10) {
                return;
            }
            int i18 = this.f14000g;
            int i19 = i18 - this.f14002i;
            this.f14002i = i18;
            while (true) {
                H(1);
                int i20 = i10 - i19;
                int i21 = this.f14000g;
                if (i20 <= i21) {
                    this.f14002i = i20;
                    return;
                } else {
                    i19 += i21;
                    this.f14002i = i21;
                }
            }
        }

        public final boolean J(int i10) {
            int i11 = this.f14002i;
            int i12 = i11 + i10;
            int i13 = this.f14000g;
            if (i12 <= i13) {
                throw new IllegalStateException(a0.j.h("refillBuffer() called when ", i10, " bytes were already available in buffer"));
            }
            int i14 = this.f13991c;
            int i15 = this.f14004k;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f14005l) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f14004k += i11;
                this.f14000g -= i11;
                this.f14002i = 0;
            }
            InputStream inputStream = this.f13999e;
            byte[] bArr2 = this.f;
            int i16 = this.f14000g;
            int read = inputStream.read(bArr2, i16, Math.min(bArr2.length - i16, (this.f13991c - this.f14004k) - i16));
            if (read == 0 || read < -1 || read > this.f.length) {
                throw new IllegalStateException(this.f13999e.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.f14000g += read;
            G();
            if (this.f14000g >= i10) {
                return true;
            }
            return J(i10);
        }

        @Override // s0.h
        public final void a(int i10) {
            if (this.f14003j != i10) {
                throw new y("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // s0.h
        public final int b() {
            return this.f14004k + this.f14002i;
        }

        @Override // s0.h
        public final boolean c() {
            return this.f14002i == this.f14000g && !J(1);
        }

        @Override // s0.h
        public final void d(int i10) {
            this.f14005l = i10;
            G();
        }

        @Override // s0.h
        public final int e(int i10) {
            if (i10 < 0) {
                throw y.d();
            }
            int i11 = this.f14004k + this.f14002i + i10;
            int i12 = this.f14005l;
            if (i11 > i12) {
                throw y.f();
            }
            this.f14005l = i11;
            G();
            return i12;
        }

        @Override // s0.h
        public final boolean f() {
            return E() != 0;
        }

        @Override // s0.h
        public final g.e g() {
            int D = D();
            int i10 = this.f14000g;
            int i11 = this.f14002i;
            if (D <= i10 - i11 && D > 0) {
                g.e i12 = g.i(this.f, i11, D);
                this.f14002i += D;
                return i12;
            }
            if (D == 0) {
                return g.f13982b;
            }
            byte[] z10 = z(D);
            if (z10 != null) {
                return g.i(z10, 0, z10.length);
            }
            int i13 = this.f14002i;
            int i14 = this.f14000g;
            int i15 = i14 - i13;
            this.f14004k += i14;
            this.f14002i = 0;
            this.f14000g = 0;
            ArrayList A = A(D - i15);
            byte[] bArr = new byte[D];
            System.arraycopy(this.f, i13, bArr, 0, i15);
            Iterator it = A.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i15, bArr2.length);
                i15 += bArr2.length;
            }
            g.e eVar = g.f13982b;
            return new g.e(bArr);
        }

        @Override // s0.h
        public final double h() {
            return Double.longBitsToDouble(C());
        }

        @Override // s0.h
        public final int i() {
            return D();
        }

        @Override // s0.h
        public final int j() {
            return B();
        }

        @Override // s0.h
        public final long k() {
            return C();
        }

        @Override // s0.h
        public final float l() {
            return Float.intBitsToFloat(B());
        }

        @Override // s0.h
        public final int m() {
            return D();
        }

        @Override // s0.h
        public final long n() {
            return E();
        }

        @Override // s0.h
        public final int o() {
            return B();
        }

        @Override // s0.h
        public final long p() {
            return C();
        }

        @Override // s0.h
        public final int q() {
            int D = D();
            return (-(D & 1)) ^ (D >>> 1);
        }

        @Override // s0.h
        public final long r() {
            long E = E();
            return (-(E & 1)) ^ (E >>> 1);
        }

        @Override // s0.h
        public final String s() {
            int D = D();
            if (D > 0) {
                int i10 = this.f14000g;
                int i11 = this.f14002i;
                if (D <= i10 - i11) {
                    String str = new String(this.f, i11, D, x.f14119a);
                    this.f14002i += D;
                    return str;
                }
            }
            if (D == 0) {
                return "";
            }
            if (D > this.f14000g) {
                return new String(y(D), x.f14119a);
            }
            H(D);
            String str2 = new String(this.f, this.f14002i, D, x.f14119a);
            this.f14002i += D;
            return str2;
        }

        @Override // s0.h
        public final String t() {
            byte[] y10;
            byte[] bArr;
            int D = D();
            int i10 = this.f14002i;
            int i11 = this.f14000g;
            if (D <= i11 - i10 && D > 0) {
                bArr = this.f;
                this.f14002i = i10 + D;
            } else {
                if (D == 0) {
                    return "";
                }
                if (D <= i11) {
                    H(D);
                    y10 = this.f;
                    this.f14002i = D + 0;
                } else {
                    y10 = y(D);
                }
                bArr = y10;
                i10 = 0;
            }
            return m1.f14049a.a(bArr, i10, D);
        }

        @Override // s0.h
        public final int u() {
            if (c()) {
                this.f14003j = 0;
                return 0;
            }
            int D = D();
            this.f14003j = D;
            if ((D >>> 3) != 0) {
                return D;
            }
            throw new y("Protocol message contained an invalid tag (zero).");
        }

        @Override // s0.h
        public final int v() {
            return D();
        }

        @Override // s0.h
        public final long w() {
            return E();
        }

        @Override // s0.h
        public final boolean x(int i10) {
            int i11;
            int u10;
            int i12 = i10 & 7;
            int i13 = 0;
            if (i12 == 0) {
                if (this.f14000g - this.f14002i >= 10) {
                    while (i13 < 10) {
                        byte[] bArr = this.f;
                        int i14 = this.f14002i;
                        this.f14002i = i14 + 1;
                        if (bArr[i14] < 0) {
                            i13++;
                        }
                    }
                    throw y.c();
                }
                while (i13 < 10) {
                    if (this.f14002i == this.f14000g) {
                        H(1);
                    }
                    byte[] bArr2 = this.f;
                    int i15 = this.f14002i;
                    this.f14002i = i15 + 1;
                    if (bArr2[i15] < 0) {
                        i13++;
                    }
                }
                throw y.c();
                return true;
            }
            if (i12 == 1) {
                i11 = 8;
            } else {
                if (i12 != 2) {
                    if (i12 == 3) {
                        do {
                            u10 = u();
                            if (u10 == 0) {
                                break;
                            }
                        } while (x(u10));
                        a(((i10 >>> 3) << 3) | 4);
                        return true;
                    }
                    if (i12 == 4) {
                        return false;
                    }
                    if (i12 == 5) {
                        I(4);
                        return true;
                    }
                    int i16 = y.f14121a;
                    throw new y.a();
                }
                i11 = D();
            }
            I(i11);
            return true;
        }

        public final byte[] y(int i10) {
            byte[] z10 = z(i10);
            if (z10 != null) {
                return z10;
            }
            int i11 = this.f14002i;
            int i12 = this.f14000g;
            int i13 = i12 - i11;
            this.f14004k += i12;
            this.f14002i = 0;
            this.f14000g = 0;
            ArrayList A = A(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f, i11, bArr, 0, i13);
            Iterator it = A.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] z(int i10) {
            if (i10 == 0) {
                return x.f14120b;
            }
            if (i10 < 0) {
                throw y.d();
            }
            int i11 = this.f14004k;
            int i12 = this.f14002i;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f13991c > 0) {
                throw new y("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i14 = this.f14005l;
            if (i13 > i14) {
                I((i14 - i11) - i12);
                throw y.f();
            }
            int i15 = this.f14000g - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > this.f13999e.available()) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f, this.f14002i, bArr, 0, i15);
            this.f14004k += this.f14000g;
            this.f14002i = 0;
            this.f14000g = 0;
            while (i15 < i10) {
                int read = this.f13999e.read(bArr, i15, i10 - i15);
                if (read == -1) {
                    throw y.f();
                }
                this.f14004k += read;
                i15 += read;
            }
            return bArr;
        }
    }

    public abstract void a(int i10);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(int i10);

    public abstract int e(int i10);

    public abstract boolean f();

    public abstract g.e g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract String s();

    public abstract String t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract boolean x(int i10);
}
