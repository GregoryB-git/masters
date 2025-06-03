package ma;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import ma.b0;
import ma.h;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public int f10979a;

    /* renamed from: b, reason: collision with root package name */
    public int f10980b = 100;

    /* renamed from: c, reason: collision with root package name */
    public int f10981c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public j f10982d;

    public static final class a extends i {

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f10983e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f10984g;

        /* renamed from: h, reason: collision with root package name */
        public int f10985h;

        /* renamed from: i, reason: collision with root package name */
        public int f10986i;

        /* renamed from: j, reason: collision with root package name */
        public int f10987j;

        /* renamed from: k, reason: collision with root package name */
        public int f10988k = Integer.MAX_VALUE;

        public a(byte[] bArr, int i10, int i11, boolean z10) {
            this.f10983e = bArr;
            this.f = i11 + i10;
            this.f10985h = i10;
            this.f10986i = i10;
        }

        @Override // ma.i
        public final boolean A(int i10) {
            int i11;
            int x10;
            int i12 = i10 & 7;
            int i13 = 0;
            if (i12 == 0) {
                if (this.f - this.f10985h >= 10) {
                    while (i13 < 10) {
                        byte[] bArr = this.f10983e;
                        int i14 = this.f10985h;
                        this.f10985h = i14 + 1;
                        if (bArr[i14] < 0) {
                            i13++;
                        }
                    }
                    throw b0.e();
                }
                while (i13 < 10) {
                    int i15 = this.f10985h;
                    if (i15 == this.f) {
                        throw b0.h();
                    }
                    byte[] bArr2 = this.f10983e;
                    this.f10985h = i15 + 1;
                    if (bArr2[i15] < 0) {
                        i13++;
                    }
                }
                throw b0.e();
                return true;
            }
            if (i12 == 1) {
                i11 = 8;
            } else {
                if (i12 != 2) {
                    if (i12 == 3) {
                        do {
                            x10 = x();
                            if (x10 == 0) {
                                break;
                            }
                        } while (A(x10));
                        a(((i10 >>> 3) << 3) | 4);
                        return true;
                    }
                    if (i12 == 4) {
                        return false;
                    }
                    if (i12 == 5) {
                        G(4);
                        return true;
                    }
                    int i16 = b0.f10916c;
                    throw new b0.a();
                }
                i11 = D();
            }
            G(i11);
            return true;
        }

        public final int B() {
            int i10 = this.f10985h;
            if (this.f - i10 < 4) {
                throw b0.h();
            }
            byte[] bArr = this.f10983e;
            this.f10985h = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public final long C() {
            int i10 = this.f10985h;
            if (this.f - i10 < 8) {
                throw b0.h();
            }
            byte[] bArr = this.f10983e;
            this.f10985h = i10 + 8;
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
                int r0 = r5.f10985h
                int r1 = r5.f
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f10983e
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f10985h = r3
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
                r5.f10985h = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ma.i.a.D():int");
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
            throw new UnsupportedOperationException("Method not decompiled: ma.i.a.E():long");
        }

        public final long F() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                int i11 = this.f10985h;
                if (i11 == this.f) {
                    throw b0.h();
                }
                byte[] bArr = this.f10983e;
                this.f10985h = i11 + 1;
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((bArr[i11] & 128) == 0) {
                    return j10;
                }
            }
            throw b0.e();
        }

        public final void G(int i10) {
            if (i10 >= 0) {
                int i11 = this.f;
                int i12 = this.f10985h;
                if (i10 <= i11 - i12) {
                    this.f10985h = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw b0.h();
            }
            throw b0.f();
        }

        @Override // ma.i
        public final void a(int i10) {
            if (this.f10987j != i10) {
                throw b0.a();
            }
        }

        @Override // ma.i
        public final int d() {
            return this.f10985h - this.f10986i;
        }

        @Override // ma.i
        public final boolean e() {
            return this.f10985h == this.f;
        }

        @Override // ma.i
        public final void g(int i10) {
            this.f10988k = i10;
            int i11 = this.f + this.f10984g;
            this.f = i11;
            int i12 = i11 - this.f10986i;
            if (i12 <= i10) {
                this.f10984g = 0;
                return;
            }
            int i13 = i12 - i10;
            this.f10984g = i13;
            this.f = i11 - i13;
        }

        @Override // ma.i
        public final int h(int i10) {
            if (i10 < 0) {
                throw b0.f();
            }
            int i11 = this.f10985h;
            int i12 = this.f10986i;
            int i13 = (i11 - i12) + i10;
            if (i13 < 0) {
                throw b0.g();
            }
            int i14 = this.f10988k;
            if (i13 > i14) {
                throw b0.h();
            }
            this.f10988k = i13;
            int i15 = this.f + this.f10984g;
            this.f = i15;
            int i16 = i15 - i12;
            if (i16 > i13) {
                int i17 = i16 - i13;
                this.f10984g = i17;
                this.f = i15 - i17;
            } else {
                this.f10984g = 0;
            }
            return i14;
        }

        @Override // ma.i
        public final boolean i() {
            return E() != 0;
        }

        @Override // ma.i
        public final h.C0164h j() {
            byte[] bArr;
            int D = D();
            if (D > 0) {
                int i10 = this.f;
                int i11 = this.f10985h;
                if (D <= i10 - i11) {
                    h.C0164h m10 = h.m(this.f10983e, i11, D);
                    this.f10985h += D;
                    return m10;
                }
            }
            if (D == 0) {
                return h.f10961b;
            }
            if (D > 0) {
                int i12 = this.f;
                int i13 = this.f10985h;
                if (D <= i12 - i13) {
                    int i14 = D + i13;
                    this.f10985h = i14;
                    bArr = Arrays.copyOfRange(this.f10983e, i13, i14);
                    h.C0164h c0164h = h.f10961b;
                    return new h.C0164h(bArr);
                }
            }
            if (D > 0) {
                throw b0.h();
            }
            if (D != 0) {
                throw b0.f();
            }
            bArr = a0.f10910b;
            h.C0164h c0164h2 = h.f10961b;
            return new h.C0164h(bArr);
        }

        @Override // ma.i
        public final double k() {
            return Double.longBitsToDouble(C());
        }

        @Override // ma.i
        public final int l() {
            return D();
        }

        @Override // ma.i
        public final int m() {
            return B();
        }

        @Override // ma.i
        public final long n() {
            return C();
        }

        @Override // ma.i
        public final float o() {
            return Float.intBitsToFloat(B());
        }

        @Override // ma.i
        public final int p() {
            return D();
        }

        @Override // ma.i
        public final long q() {
            return E();
        }

        @Override // ma.i
        public final int r() {
            return B();
        }

        @Override // ma.i
        public final long s() {
            return C();
        }

        @Override // ma.i
        public final int t() {
            return i.b(D());
        }

        @Override // ma.i
        public final long u() {
            return i.c(E());
        }

        @Override // ma.i
        public final String v() {
            int D = D();
            if (D > 0) {
                int i10 = this.f;
                int i11 = this.f10985h;
                if (D <= i10 - i11) {
                    String str = new String(this.f10983e, i11, D, a0.f10909a);
                    this.f10985h += D;
                    return str;
                }
            }
            if (D == 0) {
                return "";
            }
            if (D < 0) {
                throw b0.f();
            }
            throw b0.h();
        }

        @Override // ma.i
        public final String w() {
            int D = D();
            if (D > 0) {
                int i10 = this.f;
                int i11 = this.f10985h;
                if (D <= i10 - i11) {
                    String a10 = u1.f11095a.a(this.f10983e, i11, D);
                    this.f10985h += D;
                    return a10;
                }
            }
            if (D == 0) {
                return "";
            }
            if (D <= 0) {
                throw b0.f();
            }
            throw b0.h();
        }

        @Override // ma.i
        public final int x() {
            if (e()) {
                this.f10987j = 0;
                return 0;
            }
            int D = D();
            this.f10987j = D;
            if ((D >>> 3) != 0) {
                return D;
            }
            throw b0.b();
        }

        @Override // ma.i
        public final int y() {
            return D();
        }

        @Override // ma.i
        public final long z() {
            return E();
        }
    }

    public static final class b extends i {

        /* renamed from: e, reason: collision with root package name */
        public final Iterable<ByteBuffer> f10989e;
        public final Iterator<ByteBuffer> f;

        /* renamed from: g, reason: collision with root package name */
        public ByteBuffer f10990g;

        /* renamed from: h, reason: collision with root package name */
        public int f10991h;

        /* renamed from: i, reason: collision with root package name */
        public int f10992i;

        /* renamed from: k, reason: collision with root package name */
        public int f10994k;

        /* renamed from: m, reason: collision with root package name */
        public long f10996m;

        /* renamed from: n, reason: collision with root package name */
        public long f10997n;

        /* renamed from: o, reason: collision with root package name */
        public long f10998o;

        /* renamed from: j, reason: collision with root package name */
        public int f10993j = Integer.MAX_VALUE;

        /* renamed from: l, reason: collision with root package name */
        public int f10995l = 0;

        public b(ArrayList arrayList, int i10) {
            this.f10991h = i10;
            this.f10989e = arrayList;
            this.f = arrayList.iterator();
            if (i10 != 0) {
                L();
                return;
            }
            this.f10990g = a0.f10911c;
            this.f10996m = 0L;
            this.f10997n = 0L;
            this.f10998o = 0L;
        }

        @Override // ma.i
        public final boolean A(int i10) {
            int i11;
            int x10;
            int i12 = i10 & 7;
            if (i12 == 0) {
                for (int i13 = 0; i13 < 10; i13++) {
                    if (C() >= 0) {
                        return true;
                    }
                }
                throw b0.e();
            }
            if (i12 == 1) {
                i11 = 8;
            } else {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            return false;
                        }
                        if (i12 != 5) {
                            throw b0.d();
                        }
                        K(4);
                        return true;
                    }
                    do {
                        x10 = x();
                        if (x10 == 0) {
                            break;
                        }
                    } while (A(x10));
                    a(((i10 >>> 3) << 3) | 4);
                    return true;
                }
                i11 = G();
            }
            K(i11);
            return true;
        }

        public final void B() {
            if (!this.f.hasNext()) {
                throw b0.h();
            }
            L();
        }

        public final byte C() {
            if (this.f10998o - this.f10996m == 0) {
                B();
            }
            long j10 = this.f10996m;
            this.f10996m = 1 + j10;
            return t1.h(j10);
        }

        public final void D(byte[] bArr, int i10) {
            if (i10 < 0 || i10 > J()) {
                if (i10 > 0) {
                    throw b0.h();
                }
                if (i10 != 0) {
                    throw b0.f();
                }
                return;
            }
            int i11 = i10;
            while (i11 > 0) {
                if (this.f10998o - this.f10996m == 0) {
                    B();
                }
                int min = Math.min(i11, (int) (this.f10998o - this.f10996m));
                long j10 = min;
                t1.f11086c.c(this.f10996m, bArr, (i10 - i11) + 0, j10);
                i11 -= min;
                this.f10996m += j10;
            }
        }

        public final int E() {
            int C;
            byte C2;
            long j10 = this.f10998o;
            long j11 = this.f10996m;
            if (j10 - j11 >= 4) {
                this.f10996m = 4 + j11;
                C = (t1.h(j11) & 255) | ((t1.h(1 + j11) & 255) << 8) | ((t1.h(2 + j11) & 255) << 16);
                C2 = t1.h(j11 + 3);
            } else {
                C = (C() & 255) | ((C() & 255) << 8) | ((C() & 255) << 16);
                C2 = C();
            }
            return C | ((C2 & 255) << 24);
        }

        public final long F() {
            long j10 = this.f10998o;
            long j11 = this.f10996m;
            if (j10 - j11 < 8) {
                return ((C() & 255) << 56) | (C() & 255) | ((C() & 255) << 8) | ((C() & 255) << 16) | ((C() & 255) << 24) | ((C() & 255) << 32) | ((C() & 255) << 40) | ((C() & 255) << 48);
            }
            this.f10996m = 8 + j11;
            return ((t1.h(j11 + 7) & 255) << 56) | (t1.h(j11) & 255) | ((t1.h(1 + j11) & 255) << 8) | ((t1.h(2 + j11) & 255) << 16) | ((t1.h(3 + j11) & 255) << 24) | ((t1.h(4 + j11) & 255) << 32) | ((t1.h(5 + j11) & 255) << 40) | ((t1.h(6 + j11) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
        
            if (ma.t1.h(r4) < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int G() {
            /*
                r10 = this;
                long r0 = r10.f10996m
                long r2 = r10.f10998o
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8a
            La:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = ma.t1.h(r0)
                if (r0 < 0) goto L1a
                long r4 = r10.f10996m
                long r4 = r4 + r2
                r10.f10996m = r4
                return r0
            L1a:
                long r6 = r10.f10998o
                long r8 = r10.f10996m
                long r6 = r6 - r8
                r8 = 10
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L26
                goto L8a
            L26:
                long r6 = r4 + r2
                byte r1 = ma.t1.h(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L34
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L90
            L34:
                long r4 = r6 + r2
                byte r1 = ma.t1.h(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L43
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L41:
                r6 = r4
                goto L90
            L43:
                long r6 = r4 + r2
                byte r1 = ma.t1.h(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L53
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L90
            L53:
                long r4 = r6 + r2
                byte r1 = ma.t1.h(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L41
                long r6 = r4 + r2
                byte r1 = ma.t1.h(r4)
                if (r1 >= 0) goto L90
                long r4 = r6 + r2
                byte r1 = ma.t1.h(r6)
                if (r1 >= 0) goto L41
                long r6 = r4 + r2
                byte r1 = ma.t1.h(r4)
                if (r1 >= 0) goto L90
                long r4 = r6 + r2
                byte r1 = ma.t1.h(r6)
                if (r1 >= 0) goto L41
                long r6 = r4 + r2
                byte r1 = ma.t1.h(r4)
                if (r1 >= 0) goto L90
            L8a:
                long r0 = r10.I()
                int r0 = (int) r0
                return r0
            L90:
                r10.f10996m = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ma.i.b.G():int");
        }

        public final long H() {
            long h10;
            long j10;
            long j11;
            int i10;
            long j12 = this.f10996m;
            if (this.f10998o != j12) {
                long j13 = j12 + 1;
                byte h11 = t1.h(j12);
                if (h11 >= 0) {
                    this.f10996m++;
                    return h11;
                }
                if (this.f10998o - this.f10996m >= 10) {
                    long j14 = j13 + 1;
                    int h12 = h11 ^ (t1.h(j13) << 7);
                    if (h12 >= 0) {
                        long j15 = j14 + 1;
                        int h13 = h12 ^ (t1.h(j14) << 14);
                        if (h13 >= 0) {
                            h10 = h13 ^ 16256;
                        } else {
                            j14 = j15 + 1;
                            int h14 = h13 ^ (t1.h(j15) << 21);
                            if (h14 < 0) {
                                i10 = h14 ^ (-2080896);
                            } else {
                                j15 = j14 + 1;
                                long h15 = h14 ^ (t1.h(j14) << 28);
                                if (h15 < 0) {
                                    long j16 = j15 + 1;
                                    long h16 = h15 ^ (t1.h(j15) << 35);
                                    if (h16 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        j15 = j16 + 1;
                                        h15 = h16 ^ (t1.h(j16) << 42);
                                        if (h15 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            j16 = j15 + 1;
                                            h16 = h15 ^ (t1.h(j15) << 49);
                                            if (h16 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                j15 = j16 + 1;
                                                h10 = (h16 ^ (t1.h(j16) << 56)) ^ 71499008037633920L;
                                                if (h10 < 0) {
                                                    long j17 = 1 + j15;
                                                    if (t1.h(j15) >= 0) {
                                                        j14 = j17;
                                                        this.f10996m = j14;
                                                        return h10;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    h10 = h16 ^ j10;
                                    j14 = j16;
                                    this.f10996m = j14;
                                    return h10;
                                }
                                j11 = 266354560;
                                h10 = h15 ^ j11;
                            }
                        }
                        j14 = j15;
                        this.f10996m = j14;
                        return h10;
                    }
                    i10 = h12 ^ (-128);
                    h10 = i10;
                    this.f10996m = j14;
                    return h10;
                }
            }
            return I();
        }

        public final long I() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((C() & 128) == 0) {
                    return j10;
                }
            }
            throw b0.e();
        }

        public final int J() {
            return (int) (((this.f10991h - this.f10995l) - this.f10996m) + this.f10997n);
        }

        public final void K(int i10) {
            if (i10 < 0 || i10 > ((this.f10991h - this.f10995l) - this.f10996m) + this.f10997n) {
                if (i10 >= 0) {
                    throw b0.h();
                }
                throw b0.f();
            }
            while (i10 > 0) {
                if (this.f10998o - this.f10996m == 0) {
                    B();
                }
                int min = Math.min(i10, (int) (this.f10998o - this.f10996m));
                i10 -= min;
                this.f10996m += min;
            }
        }

        public final void L() {
            ByteBuffer next = this.f.next();
            this.f10990g = next;
            this.f10995l += (int) (this.f10996m - this.f10997n);
            long position = next.position();
            this.f10996m = position;
            this.f10997n = position;
            this.f10998o = this.f10990g.limit();
            long j10 = t1.f11086c.j(this.f10990g, t1.f11089g);
            this.f10996m += j10;
            this.f10997n += j10;
            this.f10998o += j10;
        }

        @Override // ma.i
        public final void a(int i10) {
            if (this.f10994k != i10) {
                throw b0.a();
            }
        }

        @Override // ma.i
        public final int d() {
            return (int) (((this.f10995l + 0) + this.f10996m) - this.f10997n);
        }

        @Override // ma.i
        public final boolean e() {
            return (((long) this.f10995l) + this.f10996m) - this.f10997n == ((long) this.f10991h);
        }

        @Override // ma.i
        public final void g(int i10) {
            this.f10993j = i10;
            int i11 = this.f10991h + this.f10992i;
            this.f10991h = i11;
            int i12 = i11 + 0;
            if (i12 <= i10) {
                this.f10992i = 0;
                return;
            }
            int i13 = i12 - i10;
            this.f10992i = i13;
            this.f10991h = i11 - i13;
        }

        @Override // ma.i
        public final int h(int i10) {
            if (i10 < 0) {
                throw b0.f();
            }
            int d10 = d() + i10;
            int i11 = this.f10993j;
            if (d10 > i11) {
                throw b0.h();
            }
            this.f10993j = d10;
            int i12 = this.f10991h + this.f10992i;
            this.f10991h = i12;
            int i13 = i12 + 0;
            if (i13 > d10) {
                int i14 = i13 - d10;
                this.f10992i = i14;
                this.f10991h = i12 - i14;
            } else {
                this.f10992i = 0;
            }
            return i11;
        }

        @Override // ma.i
        public final boolean i() {
            return H() != 0;
        }

        @Override // ma.i
        public final h.C0164h j() {
            int G = G();
            if (G > 0) {
                long j10 = G;
                long j11 = this.f10998o;
                long j12 = this.f10996m;
                if (j10 <= j11 - j12) {
                    byte[] bArr = new byte[G];
                    t1.f11086c.c(j12, bArr, 0L, j10);
                    this.f10996m += j10;
                    h.C0164h c0164h = h.f10961b;
                    return new h.C0164h(bArr);
                }
            }
            if (G > 0 && G <= J()) {
                byte[] bArr2 = new byte[G];
                D(bArr2, G);
                h.C0164h c0164h2 = h.f10961b;
                return new h.C0164h(bArr2);
            }
            if (G == 0) {
                return h.f10961b;
            }
            if (G < 0) {
                throw b0.f();
            }
            throw b0.h();
        }

        @Override // ma.i
        public final double k() {
            return Double.longBitsToDouble(F());
        }

        @Override // ma.i
        public final int l() {
            return G();
        }

        @Override // ma.i
        public final int m() {
            return E();
        }

        @Override // ma.i
        public final long n() {
            return F();
        }

        @Override // ma.i
        public final float o() {
            return Float.intBitsToFloat(E());
        }

        @Override // ma.i
        public final int p() {
            return G();
        }

        @Override // ma.i
        public final long q() {
            return H();
        }

        @Override // ma.i
        public final int r() {
            return E();
        }

        @Override // ma.i
        public final long s() {
            return F();
        }

        @Override // ma.i
        public final int t() {
            return i.b(G());
        }

        @Override // ma.i
        public final long u() {
            return i.c(H());
        }

        @Override // ma.i
        public final String v() {
            int G = G();
            if (G > 0) {
                long j10 = G;
                long j11 = this.f10998o;
                long j12 = this.f10996m;
                if (j10 <= j11 - j12) {
                    byte[] bArr = new byte[G];
                    t1.f11086c.c(j12, bArr, 0L, j10);
                    String str = new String(bArr, a0.f10909a);
                    this.f10996m += j10;
                    return str;
                }
            }
            if (G > 0 && G <= J()) {
                byte[] bArr2 = new byte[G];
                D(bArr2, G);
                return new String(bArr2, a0.f10909a);
            }
            if (G == 0) {
                return "";
            }
            if (G < 0) {
                throw b0.f();
            }
            throw b0.h();
        }

        @Override // ma.i
        public final String w() {
            int G = G();
            if (G > 0) {
                long j10 = G;
                long j11 = this.f10998o;
                long j12 = this.f10996m;
                if (j10 <= j11 - j12) {
                    String a10 = u1.a((int) (j12 - this.f10997n), this.f10990g, G);
                    this.f10996m += j10;
                    return a10;
                }
            }
            if (G >= 0 && G <= J()) {
                byte[] bArr = new byte[G];
                D(bArr, G);
                return u1.f11095a.a(bArr, 0, G);
            }
            if (G == 0) {
                return "";
            }
            if (G <= 0) {
                throw b0.f();
            }
            throw b0.h();
        }

        @Override // ma.i
        public final int x() {
            if (e()) {
                this.f10994k = 0;
                return 0;
            }
            int G = G();
            this.f10994k = G;
            if ((G >>> 3) != 0) {
                return G;
            }
            throw b0.b();
        }

        @Override // ma.i
        public final int y() {
            return G();
        }

        @Override // ma.i
        public final long z() {
            return H();
        }
    }

    public static final class c extends i {

        /* renamed from: e, reason: collision with root package name */
        public final InputStream f10999e;
        public final byte[] f;

        /* renamed from: g, reason: collision with root package name */
        public int f11000g;

        /* renamed from: h, reason: collision with root package name */
        public int f11001h;

        /* renamed from: i, reason: collision with root package name */
        public int f11002i;

        /* renamed from: j, reason: collision with root package name */
        public int f11003j;

        /* renamed from: k, reason: collision with root package name */
        public int f11004k;

        /* renamed from: l, reason: collision with root package name */
        public int f11005l = Integer.MAX_VALUE;

        public c(InputStream inputStream) {
            Charset charset = a0.f10909a;
            this.f10999e = inputStream;
            this.f = new byte[4096];
            this.f11000g = 0;
            this.f11002i = 0;
            this.f11004k = 0;
        }

        @Override // ma.i
        public final boolean A(int i10) {
            int i11;
            int x10;
            int i12 = i10 & 7;
            int i13 = 0;
            if (i12 == 0) {
                if (this.f11000g - this.f11002i >= 10) {
                    while (i13 < 10) {
                        byte[] bArr = this.f;
                        int i14 = this.f11002i;
                        this.f11002i = i14 + 1;
                        if (bArr[i14] < 0) {
                            i13++;
                        }
                    }
                    throw b0.e();
                }
                while (i13 < 10) {
                    if (this.f11002i == this.f11000g) {
                        K(1);
                    }
                    byte[] bArr2 = this.f;
                    int i15 = this.f11002i;
                    this.f11002i = i15 + 1;
                    if (bArr2[i15] < 0) {
                        i13++;
                    }
                }
                throw b0.e();
                return true;
            }
            if (i12 == 1) {
                i11 = 8;
            } else {
                if (i12 != 2) {
                    if (i12 == 3) {
                        do {
                            x10 = x();
                            if (x10 == 0) {
                                break;
                            }
                        } while (A(x10));
                        a(((i10 >>> 3) << 3) | 4);
                        return true;
                    }
                    if (i12 == 4) {
                        return false;
                    }
                    if (i12 == 5) {
                        L(4);
                        return true;
                    }
                    int i16 = b0.f10916c;
                    throw new b0.a();
                }
                i11 = G();
            }
            L(i11);
            return true;
        }

        public final byte[] B(int i10) {
            byte[] C = C(i10);
            if (C != null) {
                return C;
            }
            int i11 = this.f11002i;
            int i12 = this.f11000g;
            int i13 = i12 - i11;
            this.f11004k += i12;
            this.f11002i = 0;
            this.f11000g = 0;
            ArrayList D = D(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f, i11, bArr, 0, i13);
            Iterator it = D.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] C(int i10) {
            if (i10 == 0) {
                return a0.f10910b;
            }
            if (i10 < 0) {
                throw b0.f();
            }
            int i11 = this.f11004k;
            int i12 = this.f11002i;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f10981c > 0) {
                throw new b0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i14 = this.f11005l;
            if (i13 > i14) {
                L((i14 - i11) - i12);
                throw b0.h();
            }
            int i15 = this.f11000g - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096) {
                try {
                    if (i16 > this.f10999e.available()) {
                        return null;
                    }
                } catch (b0 e10) {
                    e10.f10918b = true;
                    throw e10;
                }
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f, this.f11002i, bArr, 0, i15);
            this.f11004k += this.f11000g;
            this.f11002i = 0;
            this.f11000g = 0;
            while (i15 < i10) {
                try {
                    int read = this.f10999e.read(bArr, i15, i10 - i15);
                    if (read == -1) {
                        throw b0.h();
                    }
                    this.f11004k += read;
                    i15 += read;
                } catch (b0 e11) {
                    e11.f10918b = true;
                    throw e11;
                }
            }
            return bArr;
        }

        public final ArrayList D(int i10) {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, 4096);
                byte[] bArr = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.f10999e.read(bArr, i11, min - i11);
                    if (read == -1) {
                        throw b0.h();
                    }
                    this.f11004k += read;
                    i11 += read;
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int E() {
            int i10 = this.f11002i;
            if (this.f11000g - i10 < 4) {
                K(4);
                i10 = this.f11002i;
            }
            byte[] bArr = this.f;
            this.f11002i = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public final long F() {
            int i10 = this.f11002i;
            if (this.f11000g - i10 < 8) {
                K(8);
                i10 = this.f11002i;
            }
            byte[] bArr = this.f;
            this.f11002i = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int G() {
            /*
                r5 = this;
                int r0 = r5.f11002i
                int r1 = r5.f11000g
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f11002i = r3
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
                long r0 = r5.I()
                int r0 = (int) r0
                return r0
            L70:
                r5.f11002i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ma.i.c.G():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long H() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ma.i.c.H():long");
        }

        public final long I() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                if (this.f11002i == this.f11000g) {
                    K(1);
                }
                byte[] bArr = this.f;
                int i11 = this.f11002i;
                this.f11002i = i11 + 1;
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((bArr[i11] & 128) == 0) {
                    return j10;
                }
            }
            throw b0.e();
        }

        public final void J() {
            int i10 = this.f11000g + this.f11001h;
            this.f11000g = i10;
            int i11 = this.f11004k + i10;
            int i12 = this.f11005l;
            if (i11 <= i12) {
                this.f11001h = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f11001h = i13;
            this.f11000g = i10 - i13;
        }

        public final void K(int i10) {
            if (M(i10)) {
                return;
            }
            if (i10 <= (this.f10981c - this.f11004k) - this.f11002i) {
                throw b0.h();
            }
            throw new b0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        public final void L(int i10) {
            int i11 = this.f11000g;
            int i12 = this.f11002i;
            if (i10 <= i11 - i12 && i10 >= 0) {
                this.f11002i = i12 + i10;
                return;
            }
            if (i10 < 0) {
                throw b0.f();
            }
            int i13 = this.f11004k;
            int i14 = i13 + i12;
            int i15 = i14 + i10;
            int i16 = this.f11005l;
            if (i15 > i16) {
                L((i16 - i13) - i12);
                throw b0.h();
            }
            this.f11004k = i14;
            int i17 = i11 - i12;
            this.f11000g = 0;
            this.f11002i = 0;
            while (i17 < i10) {
                try {
                    long j10 = i10 - i17;
                    try {
                        long skip = this.f10999e.skip(j10);
                        if (skip < 0 || skip > j10) {
                            throw new IllegalStateException(this.f10999e.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        }
                        if (skip == 0) {
                            break;
                        } else {
                            i17 += (int) skip;
                        }
                    } catch (b0 e10) {
                        e10.f10918b = true;
                        throw e10;
                    }
                } finally {
                    this.f11004k += i17;
                    J();
                }
            }
            if (i17 >= i10) {
                return;
            }
            int i18 = this.f11000g;
            int i19 = i18 - this.f11002i;
            this.f11002i = i18;
            while (true) {
                K(1);
                int i20 = i10 - i19;
                int i21 = this.f11000g;
                if (i20 <= i21) {
                    this.f11002i = i20;
                    return;
                } else {
                    i19 += i21;
                    this.f11002i = i21;
                }
            }
        }

        public final boolean M(int i10) {
            int i11 = this.f11002i;
            int i12 = i11 + i10;
            int i13 = this.f11000g;
            if (i12 <= i13) {
                throw new IllegalStateException(a0.j.h("refillBuffer() called when ", i10, " bytes were already available in buffer"));
            }
            int i14 = this.f10981c;
            int i15 = this.f11004k;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f11005l) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f11004k += i11;
                this.f11000g -= i11;
                this.f11002i = 0;
            }
            InputStream inputStream = this.f10999e;
            byte[] bArr2 = this.f;
            int i16 = this.f11000g;
            try {
                int read = inputStream.read(bArr2, i16, Math.min(bArr2.length - i16, (this.f10981c - this.f11004k) - i16));
                if (read == 0 || read < -1 || read > this.f.length) {
                    throw new IllegalStateException(this.f10999e.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                }
                if (read <= 0) {
                    return false;
                }
                this.f11000g += read;
                J();
                if (this.f11000g >= i10) {
                    return true;
                }
                return M(i10);
            } catch (b0 e10) {
                e10.f10918b = true;
                throw e10;
            }
        }

        @Override // ma.i
        public final void a(int i10) {
            if (this.f11003j != i10) {
                throw b0.a();
            }
        }

        @Override // ma.i
        public final int d() {
            return this.f11004k + this.f11002i;
        }

        @Override // ma.i
        public final boolean e() {
            return this.f11002i == this.f11000g && !M(1);
        }

        @Override // ma.i
        public final void g(int i10) {
            this.f11005l = i10;
            J();
        }

        @Override // ma.i
        public final int h(int i10) {
            if (i10 < 0) {
                throw b0.f();
            }
            int i11 = this.f11004k + this.f11002i + i10;
            int i12 = this.f11005l;
            if (i11 > i12) {
                throw b0.h();
            }
            this.f11005l = i11;
            J();
            return i12;
        }

        @Override // ma.i
        public final boolean i() {
            return H() != 0;
        }

        @Override // ma.i
        public final h.C0164h j() {
            int G = G();
            int i10 = this.f11000g;
            int i11 = this.f11002i;
            if (G <= i10 - i11 && G > 0) {
                h.C0164h m10 = h.m(this.f, i11, G);
                this.f11002i += G;
                return m10;
            }
            if (G == 0) {
                return h.f10961b;
            }
            byte[] C = C(G);
            if (C != null) {
                return h.m(C, 0, C.length);
            }
            int i12 = this.f11002i;
            int i13 = this.f11000g;
            int i14 = i13 - i12;
            this.f11004k += i13;
            this.f11002i = 0;
            this.f11000g = 0;
            ArrayList D = D(G - i14);
            byte[] bArr = new byte[G];
            System.arraycopy(this.f, i12, bArr, 0, i14);
            Iterator it = D.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i14, bArr2.length);
                i14 += bArr2.length;
            }
            h.C0164h c0164h = h.f10961b;
            return new h.C0164h(bArr);
        }

        @Override // ma.i
        public final double k() {
            return Double.longBitsToDouble(F());
        }

        @Override // ma.i
        public final int l() {
            return G();
        }

        @Override // ma.i
        public final int m() {
            return E();
        }

        @Override // ma.i
        public final long n() {
            return F();
        }

        @Override // ma.i
        public final float o() {
            return Float.intBitsToFloat(E());
        }

        @Override // ma.i
        public final int p() {
            return G();
        }

        @Override // ma.i
        public final long q() {
            return H();
        }

        @Override // ma.i
        public final int r() {
            return E();
        }

        @Override // ma.i
        public final long s() {
            return F();
        }

        @Override // ma.i
        public final int t() {
            return i.b(G());
        }

        @Override // ma.i
        public final long u() {
            return i.c(H());
        }

        @Override // ma.i
        public final String v() {
            int G = G();
            if (G > 0) {
                int i10 = this.f11000g;
                int i11 = this.f11002i;
                if (G <= i10 - i11) {
                    String str = new String(this.f, i11, G, a0.f10909a);
                    this.f11002i += G;
                    return str;
                }
            }
            if (G == 0) {
                return "";
            }
            if (G > this.f11000g) {
                return new String(B(G), a0.f10909a);
            }
            K(G);
            String str2 = new String(this.f, this.f11002i, G, a0.f10909a);
            this.f11002i += G;
            return str2;
        }

        @Override // ma.i
        public final String w() {
            byte[] B;
            byte[] bArr;
            int G = G();
            int i10 = this.f11002i;
            int i11 = this.f11000g;
            if (G <= i11 - i10 && G > 0) {
                bArr = this.f;
                this.f11002i = i10 + G;
            } else {
                if (G == 0) {
                    return "";
                }
                if (G <= i11) {
                    K(G);
                    B = this.f;
                    this.f11002i = G + 0;
                } else {
                    B = B(G);
                }
                bArr = B;
                i10 = 0;
            }
            return u1.f11095a.a(bArr, i10, G);
        }

        @Override // ma.i
        public final int x() {
            if (e()) {
                this.f11003j = 0;
                return 0;
            }
            int G = G();
            this.f11003j = G;
            if ((G >>> 3) != 0) {
                return G;
            }
            throw b0.b();
        }

        @Override // ma.i
        public final int y() {
            return G();
        }

        @Override // ma.i
        public final long z() {
            return H();
        }
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static a f(byte[] bArr, int i10, int i11, boolean z10) {
        a aVar = new a(bArr, i10, i11, z10);
        try {
            aVar.h(i11);
            return aVar;
        } catch (b0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract boolean A(int i10);

    public abstract void a(int i10);

    public abstract int d();

    public abstract boolean e();

    public abstract void g(int i10);

    public abstract int h(int i10);

    public abstract boolean i();

    public abstract h.C0164h j();

    public abstract double k();

    public abstract int l();

    public abstract int m();

    public abstract long n();

    public abstract float o();

    public abstract int p();

    public abstract long q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract String v();

    public abstract String w();

    public abstract int x();

    public abstract int y();

    public abstract long z();
}
