package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0761h {

    /* renamed from: a, reason: collision with root package name */
    public int f8964a;

    /* renamed from: b, reason: collision with root package name */
    public int f8965b;

    /* renamed from: c, reason: collision with root package name */
    public int f8966c;

    /* renamed from: d, reason: collision with root package name */
    public C0762i f8967d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8968e;

    /* renamed from: androidx.datastore.preferences.protobuf.h$b */
    public static final class b extends AbstractC0761h {

        /* renamed from: f, reason: collision with root package name */
        public final byte[] f8969f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f8970g;

        /* renamed from: h, reason: collision with root package name */
        public int f8971h;

        /* renamed from: i, reason: collision with root package name */
        public int f8972i;

        /* renamed from: j, reason: collision with root package name */
        public int f8973j;

        /* renamed from: k, reason: collision with root package name */
        public int f8974k;

        /* renamed from: l, reason: collision with root package name */
        public int f8975l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f8976m;

        /* renamed from: n, reason: collision with root package name */
        public int f8977n;

        public b(byte[] bArr, int i7, int i8, boolean z7) {
            super();
            this.f8977n = Integer.MAX_VALUE;
            this.f8969f = bArr;
            this.f8971h = i8 + i7;
            this.f8973j = i7;
            this.f8974k = i7;
            this.f8970g = z7;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public String A() {
            int J6 = J();
            if (J6 > 0) {
                int i7 = this.f8971h;
                int i8 = this.f8973j;
                if (J6 <= i7 - i8) {
                    String e7 = q0.e(this.f8969f, i8, J6);
                    this.f8973j += J6;
                    return e7;
                }
            }
            if (J6 == 0) {
                return "";
            }
            if (J6 <= 0) {
                throw C0778z.f();
            }
            throw C0778z.k();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public int B() {
            if (e()) {
                this.f8975l = 0;
                return 0;
            }
            int J6 = J();
            this.f8975l = J6;
            if (r0.a(J6) != 0) {
                return this.f8975l;
            }
            throw C0778z.b();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public int C() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public long D() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public boolean E(int i7) {
            int b7 = r0.b(i7);
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
                a(r0.c(r0.a(i7), 4));
                return true;
            }
            if (b7 == 4) {
                return false;
            }
            if (b7 != 5) {
                throw C0778z.d();
            }
            O(4);
            return true;
        }

        public byte F() {
            int i7 = this.f8973j;
            if (i7 == this.f8971h) {
                throw C0778z.k();
            }
            byte[] bArr = this.f8969f;
            this.f8973j = i7 + 1;
            return bArr[i7];
        }

        public byte[] G(int i7) {
            if (i7 > 0) {
                int i8 = this.f8971h;
                int i9 = this.f8973j;
                if (i7 <= i8 - i9) {
                    int i10 = i7 + i9;
                    this.f8973j = i10;
                    return Arrays.copyOfRange(this.f8969f, i9, i10);
                }
            }
            if (i7 > 0) {
                throw C0778z.k();
            }
            if (i7 == 0) {
                return AbstractC0777y.f9200c;
            }
            throw C0778z.f();
        }

        public int H() {
            int i7 = this.f8973j;
            if (this.f8971h - i7 < 4) {
                throw C0778z.k();
            }
            byte[] bArr = this.f8969f;
            this.f8973j = i7 + 4;
            return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
        }

        public long I() {
            int i7 = this.f8973j;
            if (this.f8971h - i7 < 8) {
                throw C0778z.k();
            }
            byte[] bArr = this.f8969f;
            this.f8973j = i7 + 8;
            return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
        }

        public int J() {
            int i7;
            int i8 = this.f8973j;
            int i9 = this.f8971h;
            if (i9 != i8) {
                byte[] bArr = this.f8969f;
                int i10 = i8 + 1;
                byte b7 = bArr[i8];
                if (b7 >= 0) {
                    this.f8973j = i10;
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
                    this.f8973j = i11;
                    return i7;
                }
            }
            return (int) L();
        }

        public long K() {
            long j7;
            long j8;
            long j9;
            int i7 = this.f8973j;
            int i8 = this.f8971h;
            if (i8 != i7) {
                byte[] bArr = this.f8969f;
                int i9 = i7 + 1;
                byte b7 = bArr[i7];
                if (b7 >= 0) {
                    this.f8973j = i9;
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
                    this.f8973j = i10;
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
            throw C0778z.e();
        }

        public final void M() {
            int i7 = this.f8971h + this.f8972i;
            this.f8971h = i7;
            int i8 = i7 - this.f8974k;
            int i9 = this.f8977n;
            if (i8 <= i9) {
                this.f8972i = 0;
                return;
            }
            int i10 = i8 - i9;
            this.f8972i = i10;
            this.f8971h = i7 - i10;
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
                int i8 = this.f8971h;
                int i9 = this.f8973j;
                if (i7 <= i8 - i9) {
                    this.f8973j = i9 + i7;
                    return;
                }
            }
            if (i7 >= 0) {
                throw C0778z.k();
            }
            throw C0778z.f();
        }

        public final void P() {
            if (this.f8971h - this.f8973j >= 10) {
                Q();
            } else {
                R();
            }
        }

        public final void Q() {
            for (int i7 = 0; i7 < 10; i7++) {
                byte[] bArr = this.f8969f;
                int i8 = this.f8973j;
                this.f8973j = i8 + 1;
                if (bArr[i8] >= 0) {
                    return;
                }
            }
            throw C0778z.e();
        }

        public final void R() {
            for (int i7 = 0; i7 < 10; i7++) {
                if (F() >= 0) {
                    return;
                }
            }
            throw C0778z.e();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public void a(int i7) {
            if (this.f8975l != i7) {
                throw C0778z.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public int d() {
            return this.f8973j - this.f8974k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public boolean e() {
            return this.f8973j == this.f8971h;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public void k(int i7) {
            this.f8977n = i7;
            M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public int l(int i7) {
            if (i7 < 0) {
                throw C0778z.f();
            }
            int d7 = i7 + d();
            int i8 = this.f8977n;
            if (d7 > i8) {
                throw C0778z.k();
            }
            this.f8977n = d7;
            M();
            return i8;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public boolean m() {
            return K() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public AbstractC0760g n() {
            int J6 = J();
            if (J6 > 0) {
                int i7 = this.f8971h;
                int i8 = this.f8973j;
                if (J6 <= i7 - i8) {
                    AbstractC0760g c02 = (this.f8970g && this.f8976m) ? AbstractC0760g.c0(this.f8969f, i8, J6) : AbstractC0760g.k(this.f8969f, i8, J6);
                    this.f8973j += J6;
                    return c02;
                }
            }
            return J6 == 0 ? AbstractC0760g.f8950p : AbstractC0760g.b0(G(J6));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public double o() {
            return Double.longBitsToDouble(I());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public int p() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public int q() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public long r() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public float s() {
            return Float.intBitsToFloat(H());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public int t() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public long u() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public int v() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public long w() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public int x() {
            return AbstractC0761h.b(J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public long y() {
            return AbstractC0761h.c(K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public String z() {
            int J6 = J();
            if (J6 > 0) {
                int i7 = this.f8971h;
                int i8 = this.f8973j;
                if (J6 <= i7 - i8) {
                    String str = new String(this.f8969f, i8, J6, AbstractC0777y.f9198a);
                    this.f8973j += J6;
                    return str;
                }
            }
            if (J6 == 0) {
                return "";
            }
            if (J6 < 0) {
                throw C0778z.f();
            }
            throw C0778z.k();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h$c */
    public static final class c extends AbstractC0761h {

        /* renamed from: f, reason: collision with root package name */
        public final InputStream f8978f;

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f8979g;

        /* renamed from: h, reason: collision with root package name */
        public int f8980h;

        /* renamed from: i, reason: collision with root package name */
        public int f8981i;

        /* renamed from: j, reason: collision with root package name */
        public int f8982j;

        /* renamed from: k, reason: collision with root package name */
        public int f8983k;

        /* renamed from: l, reason: collision with root package name */
        public int f8984l;

        /* renamed from: m, reason: collision with root package name */
        public int f8985m;

        public c(InputStream inputStream, int i7) {
            super();
            this.f8985m = Integer.MAX_VALUE;
            AbstractC0777y.b(inputStream, "input");
            this.f8978f = inputStream;
            this.f8979g = new byte[i7];
            this.f8980h = 0;
            this.f8982j = 0;
            this.f8984l = 0;
        }

        private void P() {
            int i7 = this.f8980h + this.f8981i;
            this.f8980h = i7;
            int i8 = this.f8984l + i7;
            int i9 = this.f8985m;
            if (i8 <= i9) {
                this.f8981i = 0;
                return;
            }
            int i10 = i8 - i9;
            this.f8981i = i10;
            this.f8980h = i7 - i10;
        }

        private void U() {
            if (this.f8980h - this.f8982j >= 10) {
                V();
            } else {
                W();
            }
        }

        private void V() {
            for (int i7 = 0; i7 < 10; i7++) {
                byte[] bArr = this.f8979g;
                int i8 = this.f8982j;
                this.f8982j = i8 + 1;
                if (bArr[i8] >= 0) {
                    return;
                }
            }
            throw C0778z.e();
        }

        private void W() {
            for (int i7 = 0; i7 < 10; i7++) {
                if (G() >= 0) {
                    return;
                }
            }
            throw C0778z.e();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public String A() {
            byte[] H6;
            int M6 = M();
            int i7 = this.f8982j;
            int i8 = this.f8980h;
            if (M6 <= i8 - i7 && M6 > 0) {
                H6 = this.f8979g;
                this.f8982j = i7 + M6;
            } else {
                if (M6 == 0) {
                    return "";
                }
                i7 = 0;
                if (M6 <= i8) {
                    Q(M6);
                    H6 = this.f8979g;
                    this.f8982j = M6;
                } else {
                    H6 = H(M6, false);
                }
            }
            return q0.e(H6, i7, M6);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public int B() {
            if (e()) {
                this.f8983k = 0;
                return 0;
            }
            int M6 = M();
            this.f8983k = M6;
            if (r0.a(M6) != 0) {
                return this.f8983k;
            }
            throw C0778z.b();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public int C() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public long D() {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public boolean E(int i7) {
            int b7 = r0.b(i7);
            if (b7 == 0) {
                U();
                return true;
            }
            if (b7 == 1) {
                S(8);
                return true;
            }
            if (b7 == 2) {
                S(M());
                return true;
            }
            if (b7 == 3) {
                R();
                a(r0.c(r0.a(i7), 4));
                return true;
            }
            if (b7 == 4) {
                return false;
            }
            if (b7 != 5) {
                throw C0778z.d();
            }
            S(4);
            return true;
        }

        public final AbstractC0760g F(int i7) {
            byte[] I6 = I(i7);
            if (I6 != null) {
                return AbstractC0760g.i(I6);
            }
            int i8 = this.f8982j;
            int i9 = this.f8980h;
            int i10 = i9 - i8;
            this.f8984l += i9;
            this.f8982j = 0;
            this.f8980h = 0;
            List<byte[]> J6 = J(i7 - i10);
            byte[] bArr = new byte[i7];
            System.arraycopy(this.f8979g, i8, bArr, 0, i10);
            for (byte[] bArr2 : J6) {
                System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
                i10 += bArr2.length;
            }
            return AbstractC0760g.b0(bArr);
        }

        public byte G() {
            if (this.f8982j == this.f8980h) {
                Q(1);
            }
            byte[] bArr = this.f8979g;
            int i7 = this.f8982j;
            this.f8982j = i7 + 1;
            return bArr[i7];
        }

        public final byte[] H(int i7, boolean z7) {
            byte[] I6 = I(i7);
            if (I6 != null) {
                return z7 ? (byte[]) I6.clone() : I6;
            }
            int i8 = this.f8982j;
            int i9 = this.f8980h;
            int i10 = i9 - i8;
            this.f8984l += i9;
            this.f8982j = 0;
            this.f8980h = 0;
            List<byte[]> J6 = J(i7 - i10);
            byte[] bArr = new byte[i7];
            System.arraycopy(this.f8979g, i8, bArr, 0, i10);
            for (byte[] bArr2 : J6) {
                System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
                i10 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] I(int i7) {
            if (i7 == 0) {
                return AbstractC0777y.f9200c;
            }
            if (i7 < 0) {
                throw C0778z.f();
            }
            int i8 = this.f8984l;
            int i9 = this.f8982j;
            int i10 = i8 + i9 + i7;
            if (i10 - this.f8966c > 0) {
                throw C0778z.j();
            }
            int i11 = this.f8985m;
            if (i10 > i11) {
                S((i11 - i8) - i9);
                throw C0778z.k();
            }
            int i12 = this.f8980h - i9;
            int i13 = i7 - i12;
            if (i13 >= 4096 && i13 > this.f8978f.available()) {
                return null;
            }
            byte[] bArr = new byte[i7];
            System.arraycopy(this.f8979g, this.f8982j, bArr, 0, i12);
            this.f8984l += this.f8980h;
            this.f8982j = 0;
            this.f8980h = 0;
            while (i12 < i7) {
                int read = this.f8978f.read(bArr, i12, i7 - i12);
                if (read == -1) {
                    throw C0778z.k();
                }
                this.f8984l += read;
                i12 += read;
            }
            return bArr;
        }

        public final List J(int i7) {
            ArrayList arrayList = new ArrayList();
            while (i7 > 0) {
                int min = Math.min(i7, 4096);
                byte[] bArr = new byte[min];
                int i8 = 0;
                while (i8 < min) {
                    int read = this.f8978f.read(bArr, i8, min - i8);
                    if (read == -1) {
                        throw C0778z.k();
                    }
                    this.f8984l += read;
                    i8 += read;
                }
                i7 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public int K() {
            int i7 = this.f8982j;
            if (this.f8980h - i7 < 4) {
                Q(4);
                i7 = this.f8982j;
            }
            byte[] bArr = this.f8979g;
            this.f8982j = i7 + 4;
            return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
        }

        public long L() {
            int i7 = this.f8982j;
            if (this.f8980h - i7 < 8) {
                Q(8);
                i7 = this.f8982j;
            }
            byte[] bArr = this.f8979g;
            this.f8982j = i7 + 8;
            return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
        }

        public int M() {
            int i7;
            int i8 = this.f8982j;
            int i9 = this.f8980h;
            if (i9 != i8) {
                byte[] bArr = this.f8979g;
                int i10 = i8 + 1;
                byte b7 = bArr[i8];
                if (b7 >= 0) {
                    this.f8982j = i10;
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
                    this.f8982j = i11;
                    return i7;
                }
            }
            return (int) O();
        }

        public long N() {
            long j7;
            long j8;
            long j9;
            int i7 = this.f8982j;
            int i8 = this.f8980h;
            if (i8 != i7) {
                byte[] bArr = this.f8979g;
                int i9 = i7 + 1;
                byte b7 = bArr[i7];
                if (b7 >= 0) {
                    this.f8982j = i9;
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
                    this.f8982j = i10;
                    return j7;
                }
            }
            return O();
        }

        public long O() {
            long j7 = 0;
            for (int i7 = 0; i7 < 64; i7 += 7) {
                j7 |= (r3 & Byte.MAX_VALUE) << i7;
                if ((G() & 128) == 0) {
                    return j7;
                }
            }
            throw C0778z.e();
        }

        public final void Q(int i7) {
            if (X(i7)) {
                return;
            }
            if (i7 <= (this.f8966c - this.f8984l) - this.f8982j) {
                throw C0778z.k();
            }
            throw C0778z.j();
        }

        public void R() {
            int B7;
            do {
                B7 = B();
                if (B7 == 0) {
                    return;
                }
            } while (E(B7));
        }

        public void S(int i7) {
            int i8 = this.f8980h;
            int i9 = this.f8982j;
            if (i7 > i8 - i9 || i7 < 0) {
                T(i7);
            } else {
                this.f8982j = i9 + i7;
            }
        }

        public final void T(int i7) {
            if (i7 < 0) {
                throw C0778z.f();
            }
            int i8 = this.f8984l;
            int i9 = this.f8982j;
            int i10 = i8 + i9 + i7;
            int i11 = this.f8985m;
            if (i10 > i11) {
                S((i11 - i8) - i9);
                throw C0778z.k();
            }
            this.f8984l = i8 + i9;
            int i12 = this.f8980h - i9;
            this.f8980h = 0;
            this.f8982j = 0;
            while (i12 < i7) {
                try {
                    long j7 = i7 - i12;
                    long skip = this.f8978f.skip(j7);
                    if (skip < 0 || skip > j7) {
                        throw new IllegalStateException(this.f8978f.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i12 += (int) skip;
                    }
                } finally {
                    this.f8984l += i12;
                    P();
                }
            }
            if (i12 >= i7) {
                return;
            }
            int i13 = this.f8980h;
            int i14 = i13 - this.f8982j;
            this.f8982j = i13;
            while (true) {
                Q(1);
                int i15 = i7 - i14;
                int i16 = this.f8980h;
                if (i15 <= i16) {
                    this.f8982j = i15;
                    return;
                } else {
                    i14 += i16;
                    this.f8982j = i16;
                }
            }
        }

        public final boolean X(int i7) {
            int i8 = this.f8982j;
            int i9 = i8 + i7;
            int i10 = this.f8980h;
            if (i9 <= i10) {
                throw new IllegalStateException("refillBuffer() called when " + i7 + " bytes were already available in buffer");
            }
            int i11 = this.f8966c;
            int i12 = this.f8984l;
            if (i7 > (i11 - i12) - i8 || i12 + i8 + i7 > this.f8985m) {
                return false;
            }
            if (i8 > 0) {
                if (i10 > i8) {
                    byte[] bArr = this.f8979g;
                    System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
                }
                this.f8984l += i8;
                this.f8980h -= i8;
                this.f8982j = 0;
            }
            InputStream inputStream = this.f8978f;
            byte[] bArr2 = this.f8979g;
            int i13 = this.f8980h;
            int read = inputStream.read(bArr2, i13, Math.min(bArr2.length - i13, (this.f8966c - this.f8984l) - i13));
            if (read == 0 || read < -1 || read > this.f8979g.length) {
                throw new IllegalStateException(this.f8978f.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.f8980h += read;
            P();
            if (this.f8980h >= i7) {
                return true;
            }
            return X(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public void a(int i7) {
            if (this.f8983k != i7) {
                throw C0778z.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public int d() {
            return this.f8984l + this.f8982j;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public boolean e() {
            return this.f8982j == this.f8980h && !X(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public void k(int i7) {
            this.f8985m = i7;
            P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public int l(int i7) {
            if (i7 < 0) {
                throw C0778z.f();
            }
            int i8 = i7 + this.f8984l + this.f8982j;
            int i9 = this.f8985m;
            if (i8 > i9) {
                throw C0778z.k();
            }
            this.f8985m = i8;
            P();
            return i9;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public boolean m() {
            return N() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public AbstractC0760g n() {
            int M6 = M();
            int i7 = this.f8980h;
            int i8 = this.f8982j;
            if (M6 > i7 - i8 || M6 <= 0) {
                return M6 == 0 ? AbstractC0760g.f8950p : F(M6);
            }
            AbstractC0760g k7 = AbstractC0760g.k(this.f8979g, i8, M6);
            this.f8982j += M6;
            return k7;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public double o() {
            return Double.longBitsToDouble(L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public int p() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public int q() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public long r() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public float s() {
            return Float.intBitsToFloat(K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public int t() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public long u() {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public int v() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public long w() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public int x() {
            return AbstractC0761h.b(M());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public long y() {
            return AbstractC0761h.c(N());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0761h
        public String z() {
            int M6 = M();
            if (M6 > 0) {
                int i7 = this.f8980h;
                int i8 = this.f8982j;
                if (M6 <= i7 - i8) {
                    String str = new String(this.f8979g, i8, M6, AbstractC0777y.f9198a);
                    this.f8982j += M6;
                    return str;
                }
            }
            if (M6 == 0) {
                return "";
            }
            if (M6 > this.f8980h) {
                return new String(H(M6, false), AbstractC0777y.f9198a);
            }
            Q(M6);
            String str2 = new String(this.f8979g, this.f8982j, M6, AbstractC0777y.f9198a);
            this.f8982j += M6;
            return str2;
        }
    }

    public AbstractC0761h() {
        this.f8965b = 100;
        this.f8966c = Integer.MAX_VALUE;
        this.f8968e = false;
    }

    public static int b(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    public static long c(long j7) {
        return (-(j7 & 1)) ^ (j7 >>> 1);
    }

    public static AbstractC0761h f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static AbstractC0761h g(InputStream inputStream, int i7) {
        if (i7 > 0) {
            return inputStream == null ? h(AbstractC0777y.f9200c) : new c(inputStream, i7);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC0761h h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static AbstractC0761h i(byte[] bArr, int i7, int i8) {
        return j(bArr, i7, i8, false);
    }

    public static AbstractC0761h j(byte[] bArr, int i7, int i8, boolean z7) {
        b bVar = new b(bArr, i7, i8, z7);
        try {
            bVar.l(i8);
            return bVar;
        } catch (C0778z e7) {
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

    public abstract AbstractC0760g n();

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
