package xc;

import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public t f17251a;

    /* renamed from: b, reason: collision with root package name */
    public long f17252b;

    public static final class a implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        public f f17253a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f17254b;

        /* renamed from: c, reason: collision with root package name */
        public t f17255c;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f17257e;

        /* renamed from: d, reason: collision with root package name */
        public long f17256d = -1;
        public int f = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f17258o = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!(this.f17253a != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.f17253a = null;
            this.f17255c = null;
            this.f17256d = -1L;
            this.f17257e = null;
            this.f = -1;
            this.f17258o = -1;
        }

        public final int f(long j10) {
            f fVar = this.f17253a;
            if (fVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j10 >= -1) {
                long j11 = fVar.f17252b;
                if (j10 <= j11) {
                    if (j10 == -1 || j10 == j11) {
                        this.f17255c = null;
                        this.f17256d = j10;
                        this.f17257e = null;
                        this.f = -1;
                        this.f17258o = -1;
                        return -1;
                    }
                    long j12 = 0;
                    t tVar = fVar.f17251a;
                    t tVar2 = this.f17255c;
                    if (tVar2 != null) {
                        long j13 = this.f17256d - (this.f - tVar2.f17287b);
                        if (j13 > j10) {
                            j11 = j13;
                        } else {
                            j12 = j13;
                            tVar2 = tVar;
                            tVar = tVar2;
                        }
                    } else {
                        tVar2 = tVar;
                    }
                    if (j11 - j10 > j10 - j12) {
                        while (true) {
                            ec.i.b(tVar);
                            long j14 = (tVar.f17288c - tVar.f17287b) + j12;
                            if (j10 < j14) {
                                break;
                            }
                            tVar = tVar.f;
                            j12 = j14;
                        }
                    } else {
                        while (j11 > j10) {
                            ec.i.b(tVar2);
                            tVar2 = tVar2.f17291g;
                            ec.i.b(tVar2);
                            j11 -= tVar2.f17288c - tVar2.f17287b;
                        }
                        j12 = j11;
                        tVar = tVar2;
                    }
                    if (this.f17254b) {
                        ec.i.b(tVar);
                        if (tVar.f17289d) {
                            byte[] bArr = tVar.f17286a;
                            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                            ec.i.d(copyOf, "copyOf(this, size)");
                            t tVar3 = new t(copyOf, tVar.f17287b, tVar.f17288c, false, true);
                            if (fVar.f17251a == tVar) {
                                fVar.f17251a = tVar3;
                            }
                            tVar.b(tVar3);
                            t tVar4 = tVar3.f17291g;
                            ec.i.b(tVar4);
                            tVar4.a();
                            tVar = tVar3;
                        }
                    }
                    this.f17255c = tVar;
                    this.f17256d = j10;
                    ec.i.b(tVar);
                    this.f17257e = tVar.f17286a;
                    int i10 = tVar.f17287b + ((int) (j10 - j12));
                    this.f = i10;
                    int i11 = tVar.f17288c;
                    this.f17258o = i11;
                    return i11 - i10;
                }
            }
            throw new ArrayIndexOutOfBoundsException("offset=" + j10 + " > size=" + fVar.f17252b);
        }
    }

    public final long A0(y yVar) {
        ec.i.e(yVar, "source");
        long j10 = 0;
        while (true) {
            long e02 = yVar.e0(this, 8192L);
            if (e02 == -1) {
                return j10;
            }
            j10 += e02;
        }
    }

    public final void B0(int i10) {
        t r02 = r0(1);
        byte[] bArr = r02.f17286a;
        int i11 = r02.f17288c;
        r02.f17288c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f17252b++;
    }

    public final f C0(long j10) {
        if (j10 == 0) {
            B0(48);
        } else {
            long j11 = (j10 >>> 1) | j10;
            long j12 = j11 | (j11 >>> 2);
            long j13 = j12 | (j12 >>> 4);
            long j14 = j13 | (j13 >>> 8);
            long j15 = j14 | (j14 >>> 16);
            long j16 = j15 | (j15 >>> 32);
            long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
            long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
            long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
            long j20 = j19 + (j19 >>> 8);
            long j21 = j20 + (j20 >>> 16);
            int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + 3) / 4);
            t r02 = r0(i10);
            byte[] bArr = r02.f17286a;
            int i11 = r02.f17288c;
            for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
                bArr[i12] = yc.a.f17467a[(int) (15 & j10)];
                j10 >>>= 4;
            }
            r02.f17288c += i10;
            this.f17252b += i10;
        }
        return this;
    }

    @Override // xc.g
    public final g D() {
        return this;
    }

    public final void D0(int i10) {
        t r02 = r0(4);
        byte[] bArr = r02.f17286a;
        int i11 = r02.f17288c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        r02.f17288c = i14 + 1;
        this.f17252b += 4;
    }

    @Override // xc.h
    public final String E(long j10) {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(a0.j.i("limit < 0: ", j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long M = M((byte) 10, 0L, j11);
        if (M != -1) {
            return yc.a.a(this, M);
        }
        if (j11 < this.f17252b && I(j11 - 1) == 13 && I(j11) == 10) {
            return yc.a.a(this, j11);
        }
        f fVar = new f();
        H(0L, Math.min(32, this.f17252b), fVar);
        StringBuilder l10 = defpackage.f.l("\\n not found: limit=");
        l10.append(Math.min(this.f17252b, j10));
        l10.append(" content=");
        l10.append(fVar.c0().l());
        l10.append((char) 8230);
        throw new EOFException(l10.toString());
    }

    public final void E0(long j10) {
        t r02 = r0(8);
        byte[] bArr = r02.f17286a;
        int i10 = r02.f17288c;
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((j10 >>> 48) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((j10 >>> 40) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((j10 >>> 32) & 255);
        int i15 = i14 + 1;
        bArr[i14] = (byte) ((j10 >>> 24) & 255);
        int i16 = i15 + 1;
        bArr[i15] = (byte) ((j10 >>> 16) & 255);
        int i17 = i16 + 1;
        bArr[i16] = (byte) ((j10 >>> 8) & 255);
        bArr[i17] = (byte) (j10 & 255);
        r02.f17288c = i17 + 1;
        this.f17252b += 8;
    }

    public final void F0(int i10) {
        t r02 = r0(2);
        byte[] bArr = r02.f17286a;
        int i11 = r02.f17288c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        r02.f17288c = i12 + 1;
        this.f17252b += 2;
    }

    public final void G0(int i10, int i11, String str) {
        char charAt;
        long j10;
        long j11;
        ec.i.e(str, "string");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(defpackage.f.h("beginIndex < 0: ", i10).toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(defpackage.f.i("endIndex < beginIndex: ", i11, " < ", i10).toString());
        }
        if (!(i11 <= str.length())) {
            StringBuilder n2 = a0.j.n("endIndex > string.length: ", i11, " > ");
            n2.append(str.length());
            throw new IllegalArgumentException(n2.toString().toString());
        }
        while (i10 < i11) {
            char charAt2 = str.charAt(i10);
            if (charAt2 < 128) {
                t r02 = r0(1);
                byte[] bArr = r02.f17286a;
                int i12 = r02.f17288c - i10;
                int min = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) charAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= min || (charAt = str.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) charAt;
                }
                int i14 = r02.f17288c;
                int i15 = (i12 + i10) - i14;
                r02.f17288c = i14 + i15;
                this.f17252b += i15;
            } else {
                if (charAt2 < 2048) {
                    t r03 = r0(2);
                    byte[] bArr2 = r03.f17286a;
                    int i16 = r03.f17288c;
                    bArr2[i16] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((charAt2 & '?') | 128);
                    r03.f17288c = i16 + 2;
                    j10 = this.f17252b;
                    j11 = 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    t r04 = r0(3);
                    byte[] bArr3 = r04.f17286a;
                    int i17 = r04.f17288c;
                    bArr3[i17] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((charAt2 & '?') | 128);
                    r04.f17288c = i17 + 3;
                    j10 = this.f17252b;
                    j11 = 3;
                } else {
                    int i18 = i10 + 1;
                    char charAt3 = i18 < i11 ? str.charAt(i18) : (char) 0;
                    if (charAt2 <= 56319) {
                        if (56320 <= charAt3 && charAt3 < 57344) {
                            int i19 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                            t r05 = r0(4);
                            byte[] bArr4 = r05.f17286a;
                            int i20 = r05.f17288c;
                            bArr4[i20] = (byte) ((i19 >> 18) | 240);
                            bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                            bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                            bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                            r05.f17288c = i20 + 4;
                            this.f17252b += 4;
                            i10 += 2;
                        }
                    }
                    B0(63);
                    i10 = i18;
                }
                this.f17252b = j10 + j11;
                i10++;
            }
        }
    }

    public final void H(long j10, long j11, f fVar) {
        ec.i.e(fVar, "out");
        b.b(this.f17252b, j10, j11);
        if (j11 == 0) {
            return;
        }
        fVar.f17252b += j11;
        t tVar = this.f17251a;
        while (true) {
            ec.i.b(tVar);
            long j12 = tVar.f17288c - tVar.f17287b;
            if (j10 < j12) {
                break;
            }
            j10 -= j12;
            tVar = tVar.f;
        }
        while (j11 > 0) {
            ec.i.b(tVar);
            t c10 = tVar.c();
            int i10 = c10.f17287b + ((int) j10);
            c10.f17287b = i10;
            c10.f17288c = Math.min(i10 + ((int) j11), c10.f17288c);
            t tVar2 = fVar.f17251a;
            if (tVar2 == null) {
                c10.f17291g = c10;
                c10.f = c10;
                fVar.f17251a = c10;
            } else {
                t tVar3 = tVar2.f17291g;
                ec.i.b(tVar3);
                tVar3.b(c10);
            }
            j11 -= c10.f17288c - c10.f17287b;
            tVar = tVar.f;
            j10 = 0;
        }
    }

    public final void H0(String str) {
        ec.i.e(str, "string");
        G0(0, str.length(), str);
    }

    public final byte I(long j10) {
        b.b(this.f17252b, j10, 1L);
        t tVar = this.f17251a;
        if (tVar == null) {
            ec.i.b(null);
            throw null;
        }
        long j11 = this.f17252b;
        if (j11 - j10 < j10) {
            while (j11 > j10) {
                tVar = tVar.f17291g;
                ec.i.b(tVar);
                j11 -= tVar.f17288c - tVar.f17287b;
            }
            return tVar.f17286a[(int) ((tVar.f17287b + j10) - j11)];
        }
        long j12 = 0;
        while (true) {
            int i10 = tVar.f17288c;
            int i11 = tVar.f17287b;
            long j13 = (i10 - i11) + j12;
            if (j13 > j10) {
                return tVar.f17286a[(int) ((i11 + j10) - j12)];
            }
            tVar = tVar.f;
            ec.i.b(tVar);
            j12 = j13;
        }
    }

    public final void I0(int i10) {
        String str;
        long j10;
        long j11;
        if (i10 < 128) {
            B0(i10);
            return;
        }
        if (i10 < 2048) {
            t r02 = r0(2);
            byte[] bArr = r02.f17286a;
            int i11 = r02.f17288c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            r02.f17288c = i11 + 2;
            j10 = this.f17252b;
            j11 = 2;
        } else {
            int i12 = 0;
            if (55296 <= i10 && i10 < 57344) {
                B0(63);
                return;
            }
            if (i10 < 65536) {
                t r03 = r0(3);
                byte[] bArr2 = r03.f17286a;
                int i13 = r03.f17288c;
                bArr2[i13] = (byte) ((i10 >> 12) | 224);
                bArr2[i13 + 1] = (byte) (((i10 >> 6) & 63) | 128);
                bArr2[i13 + 2] = (byte) ((i10 & 63) | 128);
                r03.f17288c = i13 + 3;
                j10 = this.f17252b;
                j11 = 3;
            } else {
                if (i10 > 1114111) {
                    StringBuilder l10 = defpackage.f.l("Unexpected code point: 0x");
                    if (i10 != 0) {
                        char[] cArr = yc.b.f17468a;
                        char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
                        while (i12 < 8 && cArr2[i12] == '0') {
                            i12++;
                        }
                        if (i12 < 0) {
                            throw new IndexOutOfBoundsException("startIndex: " + i12 + ", endIndex: 8, size: 8");
                        }
                        if (i12 > 8) {
                            throw new IllegalArgumentException(defpackage.f.i("startIndex: ", i12, " > endIndex: ", 8));
                        }
                        str = new String(cArr2, i12, 8 - i12);
                    } else {
                        str = "0";
                    }
                    l10.append(str);
                    throw new IllegalArgumentException(l10.toString());
                }
                t r04 = r0(4);
                byte[] bArr3 = r04.f17286a;
                int i14 = r04.f17288c;
                bArr3[i14] = (byte) ((i10 >> 18) | 240);
                bArr3[i14 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                bArr3[i14 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                bArr3[i14 + 3] = (byte) ((i10 & 63) | 128);
                r04.f17288c = i14 + 4;
                j10 = this.f17252b;
                j11 = 4;
            }
        }
        this.f17252b = j10 + j11;
    }

    @Override // xc.h
    public final boolean K(i iVar) {
        ec.i.e(iVar, "bytes");
        byte[] bArr = iVar.f17260a;
        int length = bArr.length;
        if (length < 0 || this.f17252b - 0 < length || bArr.length - 0 < length) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (I(i10 + 0) != iVar.f17260a[0 + i10]) {
                return false;
            }
        }
        return true;
    }

    public final long M(byte b10, long j10, long j11) {
        t tVar;
        long j12 = 0;
        boolean z10 = false;
        if (0 <= j10 && j10 <= j11) {
            z10 = true;
        }
        if (!z10) {
            StringBuilder l10 = defpackage.f.l("size=");
            l10.append(this.f17252b);
            l10.append(" fromIndex=");
            l10.append(j10);
            l10.append(" toIndex=");
            l10.append(j11);
            throw new IllegalArgumentException(l10.toString().toString());
        }
        long j13 = this.f17252b;
        if (j11 > j13) {
            j11 = j13;
        }
        if (j10 != j11 && (tVar = this.f17251a) != null) {
            if (j13 - j10 < j10) {
                while (j13 > j10) {
                    tVar = tVar.f17291g;
                    ec.i.b(tVar);
                    j13 -= tVar.f17288c - tVar.f17287b;
                }
                while (j13 < j11) {
                    byte[] bArr = tVar.f17286a;
                    int min = (int) Math.min(tVar.f17288c, (tVar.f17287b + j11) - j13);
                    for (int i10 = (int) ((tVar.f17287b + j10) - j13); i10 < min; i10++) {
                        if (bArr[i10] == b10) {
                            return (i10 - tVar.f17287b) + j13;
                        }
                    }
                    j13 += tVar.f17288c - tVar.f17287b;
                    tVar = tVar.f;
                    ec.i.b(tVar);
                    j10 = j13;
                }
            } else {
                while (true) {
                    long j14 = (tVar.f17288c - tVar.f17287b) + j12;
                    if (j14 > j10) {
                        break;
                    }
                    tVar = tVar.f;
                    ec.i.b(tVar);
                    j12 = j14;
                }
                while (j12 < j11) {
                    byte[] bArr2 = tVar.f17286a;
                    int min2 = (int) Math.min(tVar.f17288c, (tVar.f17287b + j11) - j12);
                    for (int i11 = (int) ((tVar.f17287b + j10) - j12); i11 < min2; i11++) {
                        if (bArr2[i11] == b10) {
                            return (i11 - tVar.f17287b) + j12;
                        }
                    }
                    j12 += tVar.f17288c - tVar.f17287b;
                    tVar = tVar.f;
                    ec.i.b(tVar);
                    j10 = j12;
                }
            }
        }
        return -1L;
    }

    @Override // xc.g
    public final /* bridge */ /* synthetic */ g O(String str) {
        H0(str);
        return this;
    }

    public final void Q(a aVar) {
        ec.i.e(aVar, "unsafeCursor");
        byte[] bArr = yc.a.f17467a;
        if (aVar == b.f17239a) {
            aVar = new a();
        }
        if (!(aVar.f17253a == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        aVar.f17253a = this;
        aVar.f17254b = true;
    }

    @Override // xc.h
    public final String S(Charset charset) {
        ec.i.e(charset, "charset");
        return i0(this.f17252b, charset);
    }

    @Override // xc.g
    public final /* bridge */ /* synthetic */ g Y(long j10) {
        C0(j10);
        return this;
    }

    public final byte[] b0(long j10) {
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(a0.j.i("byteCount: ", j10).toString());
        }
        if (this.f17252b < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        h0(bArr);
        return bArr;
    }

    @Override // xc.y
    public final z c() {
        return z.f17297d;
    }

    public final i c0() {
        return l(this.f17252b);
    }

    public final Object clone() {
        f fVar = new f();
        if (this.f17252b != 0) {
            t tVar = this.f17251a;
            ec.i.b(tVar);
            t c10 = tVar.c();
            fVar.f17251a = c10;
            c10.f17291g = c10;
            c10.f = c10;
            for (t tVar2 = tVar.f; tVar2 != tVar; tVar2 = tVar2.f) {
                t tVar3 = c10.f17291g;
                ec.i.b(tVar3);
                ec.i.b(tVar2);
                tVar3.b(tVar2.c());
            }
            fVar.f17252b = this.f17252b;
        }
        return fVar;
    }

    @Override // xc.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // xc.y
    public final long e0(f fVar, long j10) {
        ec.i.e(fVar, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(a0.j.i("byteCount < 0: ", j10).toString());
        }
        long j11 = this.f17252b;
        if (j11 == 0) {
            return -1L;
        }
        if (j10 > j11) {
            j10 = j11;
        }
        fVar.g0(this, j10);
        return j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            long j10 = this.f17252b;
            f fVar = (f) obj;
            if (j10 != fVar.f17252b) {
                return false;
            }
            if (j10 != 0) {
                t tVar = this.f17251a;
                ec.i.b(tVar);
                t tVar2 = fVar.f17251a;
                ec.i.b(tVar2);
                int i10 = tVar.f17287b;
                int i11 = tVar2.f17287b;
                long j11 = 0;
                while (j11 < this.f17252b) {
                    long min = Math.min(tVar.f17288c - i10, tVar2.f17288c - i11);
                    long j12 = 0;
                    while (j12 < min) {
                        int i12 = i10 + 1;
                        int i13 = i11 + 1;
                        if (tVar.f17286a[i10] != tVar2.f17286a[i11]) {
                            return false;
                        }
                        j12++;
                        i10 = i12;
                        i11 = i13;
                    }
                    if (i10 == tVar.f17288c) {
                        tVar = tVar.f;
                        ec.i.b(tVar);
                        i10 = tVar.f17287b;
                    }
                    if (i11 == tVar2.f17288c) {
                        tVar2 = tVar2.f;
                        ec.i.b(tVar2);
                        i11 = tVar2.f17287b;
                    }
                    j11 += min;
                }
            }
        }
        return true;
    }

    public final void f() {
        skip(this.f17252b);
    }

    @Override // xc.h
    public final String f0() {
        return E(Long.MAX_VALUE);
    }

    @Override // xc.g, xc.w, java.io.Flushable
    public final void flush() {
    }

    public final long g() {
        long j10 = this.f17252b;
        if (j10 == 0) {
            return 0L;
        }
        t tVar = this.f17251a;
        ec.i.b(tVar);
        t tVar2 = tVar.f17291g;
        ec.i.b(tVar2);
        if (tVar2.f17288c < 8192 && tVar2.f17290e) {
            j10 -= r3 - tVar2.f17287b;
        }
        return j10;
    }

    @Override // xc.w
    public final void g0(f fVar, long j10) {
        int i10;
        t b10;
        ec.i.e(fVar, "source");
        if (!(fVar != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        b.b(fVar.f17252b, 0L, j10);
        while (j10 > 0) {
            t tVar = fVar.f17251a;
            ec.i.b(tVar);
            int i11 = tVar.f17288c;
            ec.i.b(fVar.f17251a);
            if (j10 < i11 - r3.f17287b) {
                t tVar2 = this.f17251a;
                t tVar3 = tVar2 != null ? tVar2.f17291g : null;
                if (tVar3 != null && tVar3.f17290e) {
                    if ((tVar3.f17288c + j10) - (tVar3.f17289d ? 0 : tVar3.f17287b) <= 8192) {
                        t tVar4 = fVar.f17251a;
                        ec.i.b(tVar4);
                        tVar4.d(tVar3, (int) j10);
                        fVar.f17252b -= j10;
                        this.f17252b += j10;
                        return;
                    }
                }
                t tVar5 = fVar.f17251a;
                ec.i.b(tVar5);
                int i12 = (int) j10;
                if (!(i12 > 0 && i12 <= tVar5.f17288c - tVar5.f17287b)) {
                    throw new IllegalArgumentException("byteCount out of range".toString());
                }
                if (i12 >= 1024) {
                    b10 = tVar5.c();
                } else {
                    b10 = u.b();
                    byte[] bArr = tVar5.f17286a;
                    byte[] bArr2 = b10.f17286a;
                    int i13 = tVar5.f17287b;
                    sb.j.k(bArr, 0, bArr2, i13, i13 + i12);
                }
                b10.f17288c = b10.f17287b + i12;
                tVar5.f17287b += i12;
                t tVar6 = tVar5.f17291g;
                ec.i.b(tVar6);
                tVar6.b(b10);
                fVar.f17251a = b10;
            }
            t tVar7 = fVar.f17251a;
            ec.i.b(tVar7);
            long j11 = tVar7.f17288c - tVar7.f17287b;
            fVar.f17251a = tVar7.a();
            t tVar8 = this.f17251a;
            if (tVar8 == null) {
                this.f17251a = tVar7;
                tVar7.f17291g = tVar7;
                tVar7.f = tVar7;
            } else {
                t tVar9 = tVar8.f17291g;
                ec.i.b(tVar9);
                tVar9.b(tVar7);
                t tVar10 = tVar7.f17291g;
                if (!(tVar10 != tVar7)) {
                    throw new IllegalStateException("cannot compact".toString());
                }
                ec.i.b(tVar10);
                if (tVar10.f17290e) {
                    int i14 = tVar7.f17288c - tVar7.f17287b;
                    t tVar11 = tVar7.f17291g;
                    ec.i.b(tVar11);
                    int i15 = 8192 - tVar11.f17288c;
                    t tVar12 = tVar7.f17291g;
                    ec.i.b(tVar12);
                    if (tVar12.f17289d) {
                        i10 = 0;
                    } else {
                        t tVar13 = tVar7.f17291g;
                        ec.i.b(tVar13);
                        i10 = tVar13.f17287b;
                    }
                    if (i14 <= i15 + i10) {
                        t tVar14 = tVar7.f17291g;
                        ec.i.b(tVar14);
                        tVar7.d(tVar14, i14);
                        tVar7.a();
                        u.a(tVar7);
                    }
                }
            }
            fVar.f17252b -= j11;
            this.f17252b += j11;
            j10 -= j11;
        }
    }

    public final void h0(byte[] bArr) {
        ec.i.e(bArr, "sink");
        int i10 = 0;
        while (i10 < bArr.length) {
            int read = read(bArr, i10, bArr.length - i10);
            if (read == -1) {
                throw new EOFException();
            }
            i10 += read;
        }
    }

    public final int hashCode() {
        t tVar = this.f17251a;
        if (tVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = tVar.f17288c;
            for (int i12 = tVar.f17287b; i12 < i11; i12++) {
                i10 = (i10 * 31) + tVar.f17286a[i12];
            }
            tVar = tVar.f;
            ec.i.b(tVar);
        } while (tVar != this.f17251a);
        return i10;
    }

    public final String i0(long j10, Charset charset) {
        ec.i.e(charset, "charset");
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(a0.j.i("byteCount: ", j10).toString());
        }
        if (this.f17252b < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        t tVar = this.f17251a;
        ec.i.b(tVar);
        int i10 = tVar.f17287b;
        if (i10 + j10 > tVar.f17288c) {
            return new String(b0(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(tVar.f17286a, i10, i11, charset);
        int i12 = tVar.f17287b + i11;
        tVar.f17287b = i12;
        this.f17252b -= j10;
        if (i12 == tVar.f17288c) {
            this.f17251a = tVar.a();
            u.a(tVar);
        }
        return str;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // xc.g
    public final f k() {
        return this;
    }

    public final String k0() {
        return i0(this.f17252b, lc.a.f9829a);
    }

    @Override // xc.h
    public final i l(long j10) {
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(a0.j.i("byteCount: ", j10).toString());
        }
        if (this.f17252b < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new i(b0(j10));
        }
        i q02 = q0((int) j10);
        skip(j10);
        return q02;
    }

    public final i l0() {
        long j10 = this.f17252b;
        if (j10 <= 2147483647L) {
            return q0((int) j10);
        }
        StringBuilder l10 = defpackage.f.l("size > Int.MAX_VALUE: ");
        l10.append(this.f17252b);
        throw new IllegalStateException(l10.toString().toString());
    }

    @Override // xc.g
    public final g o() {
        return this;
    }

    public final i q0(int i10) {
        if (i10 == 0) {
            return i.f17259d;
        }
        b.b(this.f17252b, 0L, i10);
        t tVar = this.f17251a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            ec.i.b(tVar);
            int i14 = tVar.f17288c;
            int i15 = tVar.f17287b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            tVar = tVar.f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        t tVar2 = this.f17251a;
        int i16 = 0;
        while (i11 < i10) {
            ec.i.b(tVar2);
            bArr[i16] = tVar2.f17286a;
            i11 += tVar2.f17288c - tVar2.f17287b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = tVar2.f17287b;
            tVar2.f17289d = true;
            i16++;
            tVar2 = tVar2.f;
        }
        return new v(bArr, iArr);
    }

    public final t r0(int i10) {
        if (!(i10 >= 1 && i10 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        t tVar = this.f17251a;
        if (tVar == null) {
            t b10 = u.b();
            this.f17251a = b10;
            b10.f17291g = b10;
            b10.f = b10;
            return b10;
        }
        t tVar2 = tVar.f17291g;
        ec.i.b(tVar2);
        if (tVar2.f17288c + i10 <= 8192 && tVar2.f17290e) {
            return tVar2;
        }
        t b11 = u.b();
        tVar2.b(b11);
        return b11;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        ec.i.e(byteBuffer, "sink");
        t tVar = this.f17251a;
        if (tVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), tVar.f17288c - tVar.f17287b);
        byteBuffer.put(tVar.f17286a, tVar.f17287b, min);
        int i10 = tVar.f17287b + min;
        tVar.f17287b = i10;
        this.f17252b -= min;
        if (i10 == tVar.f17288c) {
            this.f17251a = tVar.a();
            u.a(tVar);
        }
        return min;
    }

    public final int read(byte[] bArr, int i10, int i11) {
        ec.i.e(bArr, "sink");
        b.b(bArr.length, i10, i11);
        t tVar = this.f17251a;
        if (tVar == null) {
            return -1;
        }
        int min = Math.min(i11, tVar.f17288c - tVar.f17287b);
        byte[] bArr2 = tVar.f17286a;
        int i12 = tVar.f17287b;
        sb.j.k(bArr2, i10, bArr, i12, i12 + min);
        int i13 = tVar.f17287b + min;
        tVar.f17287b = i13;
        this.f17252b -= min;
        if (i13 == tVar.f17288c) {
            this.f17251a = tVar.a();
            u.a(tVar);
        }
        return min;
    }

    @Override // xc.h
    public final byte readByte() {
        if (this.f17252b == 0) {
            throw new EOFException();
        }
        t tVar = this.f17251a;
        ec.i.b(tVar);
        int i10 = tVar.f17287b;
        int i11 = tVar.f17288c;
        int i12 = i10 + 1;
        byte b10 = tVar.f17286a[i10];
        this.f17252b--;
        if (i12 == i11) {
            this.f17251a = tVar.a();
            u.a(tVar);
        } else {
            tVar.f17287b = i12;
        }
        return b10;
    }

    @Override // xc.h
    public final int readInt() {
        if (this.f17252b < 4) {
            throw new EOFException();
        }
        t tVar = this.f17251a;
        ec.i.b(tVar);
        int i10 = tVar.f17287b;
        int i11 = tVar.f17288c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = tVar.f17286a;
        int i12 = i10 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
        int i15 = i13 + 1;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        int i17 = i15 + 1;
        int i18 = i16 | (bArr[i15] & 255);
        this.f17252b -= 4;
        if (i17 == i11) {
            this.f17251a = tVar.a();
            u.a(tVar);
        } else {
            tVar.f17287b = i17;
        }
        return i18;
    }

    @Override // xc.h
    public final short readShort() {
        if (this.f17252b < 2) {
            throw new EOFException();
        }
        t tVar = this.f17251a;
        ec.i.b(tVar);
        int i10 = tVar.f17287b;
        int i11 = tVar.f17288c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = tVar.f17286a;
        int i12 = i10 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
        this.f17252b -= 2;
        if (i13 == i11) {
            this.f17251a = tVar.a();
            u.a(tVar);
        } else {
            tVar.f17287b = i13;
        }
        return (short) i14;
    }

    @Override // xc.h
    public final void skip(long j10) {
        while (j10 > 0) {
            t tVar = this.f17251a;
            if (tVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j10, tVar.f17288c - tVar.f17287b);
            long j11 = min;
            this.f17252b -= j11;
            j10 -= j11;
            int i10 = tVar.f17287b + min;
            tVar.f17287b = i10;
            if (i10 == tVar.f17288c) {
                this.f17251a = tVar.a();
                u.a(tVar);
            }
        }
    }

    @Override // xc.h
    public final f t() {
        return this;
    }

    public final String toString() {
        return l0().toString();
    }

    @Override // xc.h
    public final void u0(long j10) {
        if (this.f17252b < j10) {
            throw new EOFException();
        }
    }

    @Override // xc.h
    public final boolean v() {
        return this.f17252b == 0;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        ec.i.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            t r02 = r0(1);
            int min = Math.min(i10, 8192 - r02.f17288c);
            byteBuffer.get(r02.f17286a, r02.f17288c, min);
            i10 -= min;
            r02.f17288c += min;
        }
        this.f17252b += remaining;
        return remaining;
    }

    @Override // xc.g
    public final /* bridge */ /* synthetic */ g write(byte[] bArr) {
        m5write(bArr);
        return this;
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m5write(byte[] bArr) {
        ec.i.e(bArr, "source");
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i10, int i11) {
        ec.i.e(bArr, "source");
        long j10 = i11;
        b.b(bArr.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            t r02 = r0(1);
            int min = Math.min(i12 - i10, 8192 - r02.f17288c);
            int i13 = i10 + min;
            sb.j.k(bArr, r02.f17288c, r02.f17286a, i10, i13);
            r02.f17288c += min;
            i10 = i13;
        }
        this.f17252b += j10;
    }

    @Override // xc.g
    public final /* bridge */ /* synthetic */ g writeByte(int i10) {
        B0(i10);
        return this;
    }

    @Override // xc.g
    public final /* bridge */ /* synthetic */ g writeInt(int i10) {
        D0(i10);
        return this;
    }

    @Override // xc.g
    public final /* bridge */ /* synthetic */ g writeShort(int i10) {
        F0(i10);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3 A[EDGE_INSN: B:42:0x00b3->B:39:0x00b3 BREAK  A[LOOP:0: B:4:0x000c->B:41:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    @Override // xc.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long x0() {
        /*
            r15 = this;
            long r0 = r15.f17252b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lba
            r0 = 0
            r1 = r0
            r4 = r1
            r5 = r2
        Lc:
            xc.t r7 = r15.f17251a
            ec.i.b(r7)
            byte[] r8 = r7.f17286a
            int r9 = r7.f17287b
            int r10 = r7.f17288c
        L17:
            r11 = 1
            if (r9 >= r10) goto L9f
            r12 = r8[r9]
            r13 = 48
            if (r12 < r13) goto L27
            r13 = 57
            if (r12 > r13) goto L27
            int r11 = r12 + (-48)
            goto L3e
        L27:
            r13 = 97
            if (r12 < r13) goto L32
            r13 = 102(0x66, float:1.43E-43)
            if (r12 > r13) goto L32
            int r11 = r12 + (-97)
            goto L3c
        L32:
            r13 = 65
            if (r12 < r13) goto L70
            r13 = 70
            if (r12 > r13) goto L70
            int r11 = r12 + (-65)
        L3c:
            int r11 = r11 + 10
        L3e:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r5
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L4e
            r12 = 4
            long r5 = r5 << r12
            long r11 = (long) r11
            long r5 = r5 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L17
        L4e:
            xc.f r0 = new xc.f
            r0.<init>()
            r0.C0(r5)
            r0.B0(r12)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = defpackage.f.l(r2)
            java.lang.String r0 = r0.k0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L70:
            if (r1 == 0) goto L74
            r4 = r11
            goto L9f
        L74:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r2 = defpackage.f.l(r2)
            r3 = 2
            char[] r3 = new char[r3]
            char[] r4 = yc.b.f17468a
            int r5 = r12 >> 4
            r5 = r5 & 15
            char r5 = r4[r5]
            r3[r0] = r5
            r0 = r12 & 15
            char r0 = r4[r0]
            r3[r11] = r0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L9f:
            if (r9 != r10) goto Lab
            xc.t r8 = r7.a()
            r15.f17251a = r8
            xc.u.a(r7)
            goto Lad
        Lab:
            r7.f17287b = r9
        Lad:
            if (r4 != 0) goto Lb3
            xc.t r7 = r15.f17251a
            if (r7 != 0) goto Lc
        Lb3:
            long r2 = r15.f17252b
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f17252b = r2
            return r5
        Lba:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xc.f.x0():long");
    }

    public final void z0(i iVar) {
        ec.i.e(iVar, "byteString");
        iVar.u(this, iVar.i());
    }
}
