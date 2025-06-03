package v5;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f15972d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f15973e = {'\n'};
    public static final o7.x<Charset> f = o7.x.p(5, n7.d.f11282a, n7.d.f11284c, n7.d.f, n7.d.f11285d, n7.d.f11286e);

    /* renamed from: a, reason: collision with root package name */
    public byte[] f15974a;

    /* renamed from: b, reason: collision with root package name */
    public int f15975b;

    /* renamed from: c, reason: collision with root package name */
    public int f15976c;

    public u() {
        this.f15974a = e0.f;
    }

    public u(int i10) {
        this.f15974a = new byte[i10];
        this.f15976c = i10;
    }

    public u(byte[] bArr) {
        this.f15974a = bArr;
        this.f15976c = bArr.length;
    }

    public u(byte[] bArr, int i10) {
        this.f15974a = bArr;
        this.f15976c = i10;
    }

    public final int A() {
        byte[] bArr = this.f15974a;
        int i10 = this.f15975b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f15975b = i11 + 1;
        return (bArr[i11] & 255) | i12;
    }

    public final long B() {
        int i10;
        int i11;
        long j10 = this.f15974a[this.f15975b];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            if (((1 << i12) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= r6 - 1;
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 == 0) {
            throw new NumberFormatException(a0.j.i("Invalid UTF-8 sequence first byte: ", j10));
        }
        for (i10 = 1; i10 < i11; i10++) {
            if ((this.f15974a[this.f15975b + i10] & 192) != 128) {
                throw new NumberFormatException(a0.j.i("Invalid UTF-8 sequence continuation byte: ", j10));
            }
            j10 = (j10 << 6) | (r3 & 63);
        }
        this.f15975b += i11;
        return j10;
    }

    public final Charset C() {
        int i10 = this.f15976c;
        int i11 = this.f15975b;
        if (i10 - i11 >= 3) {
            byte[] bArr = this.f15974a;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f15975b = i11 + 3;
                return n7.d.f11284c;
            }
        }
        if (i10 - i11 < 2) {
            return null;
        }
        byte[] bArr2 = this.f15974a;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.f15975b = i11 + 2;
            return n7.d.f11285d;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f15975b = i11 + 2;
        return n7.d.f11286e;
    }

    public final void D(int i10) {
        byte[] bArr = this.f15974a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        E(bArr, i10);
    }

    public final void E(byte[] bArr, int i10) {
        this.f15974a = bArr;
        this.f15976c = i10;
        this.f15975b = 0;
    }

    public final void F(int i10) {
        x6.b.q(i10 >= 0 && i10 <= this.f15974a.length);
        this.f15976c = i10;
    }

    public final void G(int i10) {
        x6.b.q(i10 >= 0 && i10 <= this.f15976c);
        this.f15975b = i10;
    }

    public final void H(int i10) {
        G(this.f15975b + i10);
    }

    public final void a(int i10) {
        byte[] bArr = this.f15974a;
        if (i10 > bArr.length) {
            this.f15974a = Arrays.copyOf(bArr, i10);
        }
    }

    public final char b(Charset charset) {
        x6.b.o("Unsupported charset: " + charset, f.contains(charset));
        return (char) (c(charset) >> 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(java.nio.charset.Charset r10) {
        /*
            r9 = this;
            java.nio.charset.Charset r0 = n7.d.f11284c
            boolean r0 = r10.equals(r0)
            java.lang.String r1 = "Out of range: %s"
            r2 = 0
            r3 = 1
            r4 = 2
            if (r0 != 0) goto L15
            java.nio.charset.Charset r0 = n7.d.f11282a
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L33
        L15:
            int r0 = r9.f15976c
            int r5 = r9.f15975b
            int r0 = r0 - r5
            if (r0 < r3) goto L33
            byte[] r10 = r9.f15974a
            r10 = r10[r5]
            r10 = r10 & 255(0xff, float:3.57E-43)
            long r4 = (long) r10
            int r10 = (int) r4
            char r10 = (char) r10
            long r6 = (long) r10
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L2c
            r0 = r3
            goto L2d
        L2c:
            r0 = r2
        L2d:
            x6.b.m(r4, r1, r0)
            byte r10 = (byte) r10
            r4 = r3
            goto L73
        L33:
            java.nio.charset.Charset r0 = n7.d.f
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L43
            java.nio.charset.Charset r0 = n7.d.f11285d
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L58
        L43:
            int r0 = r9.f15976c
            int r5 = r9.f15975b
            int r0 = r0 - r5
            if (r0 < r4) goto L58
            byte[] r10 = r9.f15974a
            r0 = r10[r5]
            int r5 = r5 + r3
            r10 = r10[r5]
            int r0 = r0 << 8
        L53:
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r10 | r0
            char r10 = (char) r10
            goto L72
        L58:
            java.nio.charset.Charset r0 = n7.d.f11286e
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L83
            int r10 = r9.f15976c
            int r0 = r9.f15975b
            int r10 = r10 - r0
            if (r10 < r4) goto L83
            byte[] r10 = r9.f15974a
            int r5 = r0 + 1
            r5 = r10[r5]
            r10 = r10[r0]
            int r0 = r5 << 8
            goto L53
        L72:
            byte r10 = (byte) r10
        L73:
            long r5 = (long) r10
            int r10 = (int) r5
            char r10 = (char) r10
            long r7 = (long) r10
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L7c
            r2 = r3
        L7c:
            x6.b.m(r5, r1, r2)
            int r10 = r10 << 16
            int r10 = r10 + r4
            return r10
        L83:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.u.c(java.nio.charset.Charset):int");
    }

    public final void d(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f15974a, this.f15975b, bArr, i10, i11);
        this.f15975b += i11;
    }

    public final char e(Charset charset, char[] cArr) {
        boolean z10;
        int c10 = c(charset);
        if (c10 != 0) {
            char c11 = (char) (c10 >> 16);
            int length = cArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    break;
                }
                if (cArr[i10] == c11) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (z10) {
                this.f15975b += c10 & 65535;
                return c11;
            }
        }
        return (char) 0;
    }

    public final int f() {
        byte[] bArr = this.f15974a;
        int i10 = this.f15975b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.f15975b = i14 + 1;
        return (bArr[i14] & 255) | i15;
    }

    public final String g() {
        return h(n7.d.f11284c);
    }

    public final String h(Charset charset) {
        int i10;
        x6.b.o("Unsupported charset: " + charset, f.contains(charset));
        if (this.f15976c - this.f15975b == 0) {
            return null;
        }
        Charset charset2 = n7.d.f11282a;
        if (!charset.equals(charset2)) {
            C();
        }
        if (charset.equals(n7.d.f11284c) || charset.equals(charset2)) {
            i10 = 1;
        } else {
            if (!charset.equals(n7.d.f) && !charset.equals(n7.d.f11286e) && !charset.equals(n7.d.f11285d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        }
        int i11 = this.f15975b;
        while (true) {
            int i12 = this.f15976c;
            if (i11 >= i12 - (i10 - 1)) {
                i11 = i12;
                break;
            }
            if ((charset.equals(n7.d.f11284c) || charset.equals(n7.d.f11282a)) && e0.G(this.f15974a[i11])) {
                break;
            }
            if (charset.equals(n7.d.f) || charset.equals(n7.d.f11285d)) {
                byte[] bArr = this.f15974a;
                if (bArr[i11] == 0 && e0.G(bArr[i11 + 1])) {
                    break;
                }
            }
            if (charset.equals(n7.d.f11286e)) {
                byte[] bArr2 = this.f15974a;
                if (bArr2[i11 + 1] == 0 && e0.G(bArr2[i11])) {
                    break;
                }
            }
            i11 += i10;
        }
        String t = t(i11 - this.f15975b, charset);
        if (this.f15975b == this.f15976c) {
            return t;
        }
        if (e(charset, f15972d) == '\r') {
            e(charset, f15973e);
        }
        return t;
    }

    public final int i() {
        byte[] bArr = this.f15974a;
        int i10 = this.f15975b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.f15975b = i14 + 1;
        return ((bArr[i14] & 255) << 24) | i15;
    }

    public final long j() {
        byte[] bArr = this.f15974a;
        long j10 = bArr[r1] & 255;
        int i10 = this.f15975b + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        long j12 = j11 | ((bArr[i10] & 255) << 24);
        long j13 = j12 | ((bArr[r3] & 255) << 32);
        long j14 = j13 | ((bArr[r4] & 255) << 40);
        long j15 = j14 | ((bArr[r3] & 255) << 48);
        this.f15975b = i10 + 1 + 1 + 1 + 1 + 1;
        return j15 | ((bArr[r4] & 255) << 56);
    }

    public final short k() {
        byte[] bArr = this.f15974a;
        int i10 = this.f15975b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f15975b = i11 + 1;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public final long l() {
        byte[] bArr = this.f15974a;
        long j10 = bArr[r1] & 255;
        int i10 = this.f15975b + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        this.f15975b = i10 + 1;
        return j11 | ((bArr[i10] & 255) << 24);
    }

    public final int m() {
        int i10 = i();
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalStateException(defpackage.f.h("Top bit not zero: ", i10));
    }

    public final int n() {
        byte[] bArr = this.f15974a;
        int i10 = this.f15975b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f15975b = i11 + 1;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final long o() {
        byte[] bArr = this.f15974a;
        long j10 = (bArr[r1] & 255) << 56;
        int i10 = this.f15975b + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r2] & 255) << 48) | ((bArr[r1] & 255) << 40);
        long j12 = j11 | ((bArr[i10] & 255) << 32);
        long j13 = j12 | ((bArr[r3] & 255) << 24);
        long j14 = j13 | ((bArr[r4] & 255) << 16);
        long j15 = j14 | ((bArr[r3] & 255) << 8);
        this.f15975b = i10 + 1 + 1 + 1 + 1 + 1;
        return j15 | (bArr[r4] & 255);
    }

    public final String p() {
        int i10 = this.f15976c;
        int i11 = this.f15975b;
        if (i10 - i11 == 0) {
            return null;
        }
        while (i11 < this.f15976c && this.f15974a[i11] != 0) {
            i11++;
        }
        byte[] bArr = this.f15974a;
        int i12 = this.f15975b;
        int i13 = e0.f15881a;
        String str = new String(bArr, i12, i11 - i12, n7.d.f11284c);
        this.f15975b = i11;
        if (i11 < this.f15976c) {
            this.f15975b = i11 + 1;
        }
        return str;
    }

    public final String q(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f15975b;
        int i12 = (i11 + i10) - 1;
        int i13 = (i12 >= this.f15976c || this.f15974a[i12] != 0) ? i10 : i10 - 1;
        byte[] bArr = this.f15974a;
        int i14 = e0.f15881a;
        String str = new String(bArr, i11, i13, n7.d.f11284c);
        this.f15975b += i10;
        return str;
    }

    public final short r() {
        byte[] bArr = this.f15974a;
        int i10 = this.f15975b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f15975b = i11 + 1;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public final String s(int i10) {
        return t(i10, n7.d.f11284c);
    }

    public final String t(int i10, Charset charset) {
        String str = new String(this.f15974a, this.f15975b, i10, charset);
        this.f15975b += i10;
        return str;
    }

    public final int u() {
        return (v() << 21) | (v() << 14) | (v() << 7) | v();
    }

    public final int v() {
        byte[] bArr = this.f15974a;
        int i10 = this.f15975b;
        this.f15975b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final long w() {
        byte[] bArr = this.f15974a;
        long j10 = (bArr[r1] & 255) << 24;
        int i10 = this.f15975b + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r2] & 255) << 16) | ((bArr[r1] & 255) << 8);
        this.f15975b = i10 + 1;
        return j11 | (bArr[i10] & 255);
    }

    public final int x() {
        byte[] bArr = this.f15974a;
        int i10 = this.f15975b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8);
        this.f15975b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    public final int y() {
        int f10 = f();
        if (f10 >= 0) {
            return f10;
        }
        throw new IllegalStateException(defpackage.f.h("Top bit not zero: ", f10));
    }

    public final long z() {
        long o10 = o();
        if (o10 >= 0) {
            return o10;
        }
        throw new IllegalStateException(a0.j.i("Top bit not zero: ", o10));
    }
}
