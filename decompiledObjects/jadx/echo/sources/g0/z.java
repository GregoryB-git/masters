package g0;

import X2.AbstractC0706y;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f14345d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f14346e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0706y f14347f = AbstractC0706y.b0(W2.e.f6819a, W2.e.f6821c, W2.e.f6824f, W2.e.f6822d, W2.e.f6823e);

    /* renamed from: a, reason: collision with root package name */
    public byte[] f14348a;

    /* renamed from: b, reason: collision with root package name */
    public int f14349b;

    /* renamed from: c, reason: collision with root package name */
    public int f14350c;

    public z() {
        this.f14348a = M.f14266f;
    }

    public String A() {
        return n((char) 0);
    }

    public String B(int i7) {
        if (i7 == 0) {
            return "";
        }
        int i8 = this.f14349b;
        int i9 = (i8 + i7) - 1;
        String I6 = M.I(this.f14348a, i8, (i9 >= this.f14350c || this.f14348a[i9] != 0) ? i7 : i7 - 1);
        this.f14349b += i7;
        return I6;
    }

    public short C() {
        byte[] bArr = this.f14348a;
        int i7 = this.f14349b;
        int i8 = i7 + 1;
        int i9 = (bArr[i7] & 255) << 8;
        this.f14349b = i7 + 2;
        return (short) ((bArr[i8] & 255) | i9);
    }

    public String D(int i7) {
        return E(i7, W2.e.f6821c);
    }

    public String E(int i7, Charset charset) {
        String str = new String(this.f14348a, this.f14349b, i7, charset);
        this.f14349b += i7;
        return str;
    }

    public int F() {
        return (G() << 21) | (G() << 14) | (G() << 7) | G();
    }

    public int G() {
        byte[] bArr = this.f14348a;
        int i7 = this.f14349b;
        this.f14349b = i7 + 1;
        return bArr[i7] & 255;
    }

    public int H() {
        byte[] bArr = this.f14348a;
        int i7 = this.f14349b;
        int i8 = (bArr[i7 + 1] & 255) | ((bArr[i7] & 255) << 8);
        this.f14349b = i7 + 4;
        return i8;
    }

    public long I() {
        byte[] bArr = this.f14348a;
        int i7 = this.f14349b;
        int i8 = i7 + 3;
        long j7 = ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
        this.f14349b = i7 + 4;
        return (bArr[i8] & 255) | j7;
    }

    public int J() {
        byte[] bArr = this.f14348a;
        int i7 = this.f14349b;
        int i8 = i7 + 2;
        int i9 = ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7] & 255) << 16);
        this.f14349b = i7 + 3;
        return (bArr[i8] & 255) | i9;
    }

    public int K() {
        int p7 = p();
        if (p7 >= 0) {
            return p7;
        }
        throw new IllegalStateException("Top bit not zero: " + p7);
    }

    public long L() {
        long z7 = z();
        if (z7 >= 0) {
            return z7;
        }
        throw new IllegalStateException("Top bit not zero: " + z7);
    }

    public int M() {
        byte[] bArr = this.f14348a;
        int i7 = this.f14349b;
        int i8 = i7 + 1;
        int i9 = (bArr[i7] & 255) << 8;
        this.f14349b = i7 + 2;
        return (bArr[i8] & 255) | i9;
    }

    public long N() {
        int i7;
        int i8;
        long j7 = this.f14348a[this.f14349b];
        int i9 = 7;
        while (true) {
            if (i9 < 0) {
                break;
            }
            if (((1 << i9) & j7) != 0) {
                i9--;
            } else if (i9 < 6) {
                j7 &= r6 - 1;
                i8 = 7 - i9;
            } else if (i9 == 7) {
                i8 = 1;
            }
        }
        i8 = 0;
        if (i8 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j7);
        }
        for (i7 = 1; i7 < i8; i7++) {
            if ((this.f14348a[this.f14349b + i7] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j7);
            }
            j7 = (j7 << 6) | (r3 & 63);
        }
        this.f14349b += i8;
        return j7;
    }

    public Charset O() {
        if (a() >= 3) {
            byte[] bArr = this.f14348a;
            int i7 = this.f14349b;
            if (bArr[i7] == -17 && bArr[i7 + 1] == -69 && bArr[i7 + 2] == -65) {
                this.f14349b = i7 + 3;
                return W2.e.f6821c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f14348a;
        int i8 = this.f14349b;
        byte b7 = bArr2[i8];
        if (b7 == -2 && bArr2[i8 + 1] == -1) {
            this.f14349b = i8 + 2;
            return W2.e.f6822d;
        }
        if (b7 != -1 || bArr2[i8 + 1] != -2) {
            return null;
        }
        this.f14349b = i8 + 2;
        return W2.e.f6823e;
    }

    public void P(int i7) {
        R(b() < i7 ? new byte[i7] : this.f14348a, i7);
    }

    public void Q(byte[] bArr) {
        R(bArr, bArr.length);
    }

    public void R(byte[] bArr, int i7) {
        this.f14348a = bArr;
        this.f14350c = i7;
        this.f14349b = 0;
    }

    public void S(int i7) {
        AbstractC1297a.a(i7 >= 0 && i7 <= this.f14348a.length);
        this.f14350c = i7;
    }

    public void T(int i7) {
        AbstractC1297a.a(i7 >= 0 && i7 <= this.f14350c);
        this.f14349b = i7;
    }

    public void U(int i7) {
        T(this.f14349b + i7);
    }

    public final void V(Charset charset) {
        if (m(charset, f14345d) == '\r') {
            m(charset, f14346e);
        }
    }

    public int a() {
        return this.f14350c - this.f14349b;
    }

    public int b() {
        return this.f14348a.length;
    }

    public void c(int i7) {
        if (i7 > b()) {
            this.f14348a = Arrays.copyOf(this.f14348a, i7);
        }
    }

    public final int d(Charset charset) {
        int i7;
        if (charset.equals(W2.e.f6821c) || charset.equals(W2.e.f6819a)) {
            i7 = 1;
        } else {
            if (!charset.equals(W2.e.f6824f) && !charset.equals(W2.e.f6823e) && !charset.equals(W2.e.f6822d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i7 = 2;
        }
        int i8 = this.f14349b;
        while (true) {
            int i9 = this.f14350c;
            if (i8 >= i9 - (i7 - 1)) {
                return i9;
            }
            if ((charset.equals(W2.e.f6821c) || charset.equals(W2.e.f6819a)) && M.C0(this.f14348a[i8])) {
                return i8;
            }
            if (charset.equals(W2.e.f6824f) || charset.equals(W2.e.f6822d)) {
                byte[] bArr = this.f14348a;
                if (bArr[i8] == 0 && M.C0(bArr[i8 + 1])) {
                    return i8;
                }
            }
            if (charset.equals(W2.e.f6823e)) {
                byte[] bArr2 = this.f14348a;
                if (bArr2[i8 + 1] == 0 && M.C0(bArr2[i8])) {
                    return i8;
                }
            }
            i8 += i7;
        }
    }

    public byte[] e() {
        return this.f14348a;
    }

    public int f() {
        return this.f14349b;
    }

    public int g() {
        return this.f14350c;
    }

    public char h(Charset charset) {
        AbstractC1297a.b(f14347f.contains(charset), "Unsupported charset: " + charset);
        return (char) (i(charset) >> 16);
    }

    public final int i(Charset charset) {
        byte a7;
        char c7;
        int i7 = 1;
        if ((charset.equals(W2.e.f6821c) || charset.equals(W2.e.f6819a)) && a() >= 1) {
            a7 = (byte) a3.b.a(a3.i.b(this.f14348a[this.f14349b]));
        } else {
            if ((charset.equals(W2.e.f6824f) || charset.equals(W2.e.f6822d)) && a() >= 2) {
                byte[] bArr = this.f14348a;
                int i8 = this.f14349b;
                c7 = a3.b.c(bArr[i8], bArr[i8 + 1]);
            } else {
                if (!charset.equals(W2.e.f6823e) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f14348a;
                int i9 = this.f14349b;
                c7 = a3.b.c(bArr2[i9 + 1], bArr2[i9]);
            }
            a7 = (byte) c7;
            i7 = 2;
        }
        return (a3.b.a(a7) << 16) + i7;
    }

    public int j() {
        return this.f14348a[this.f14349b] & 255;
    }

    public void k(y yVar, int i7) {
        l(yVar.f14341a, 0, i7);
        yVar.p(0);
    }

    public void l(byte[] bArr, int i7, int i8) {
        System.arraycopy(this.f14348a, this.f14349b, bArr, i7, i8);
        this.f14349b += i8;
    }

    public final char m(Charset charset, char[] cArr) {
        int i7 = i(charset);
        if (i7 == 0) {
            return (char) 0;
        }
        char c7 = (char) (i7 >> 16);
        if (!a3.b.b(cArr, c7)) {
            return (char) 0;
        }
        this.f14349b += i7 & 65535;
        return c7;
    }

    public String n(char c7) {
        if (a() == 0) {
            return null;
        }
        int i7 = this.f14349b;
        while (i7 < this.f14350c && this.f14348a[i7] != c7) {
            i7++;
        }
        byte[] bArr = this.f14348a;
        int i8 = this.f14349b;
        String I6 = M.I(bArr, i8, i7 - i8);
        this.f14349b = i7;
        if (i7 < this.f14350c) {
            this.f14349b = i7 + 1;
        }
        return I6;
    }

    public double o() {
        return Double.longBitsToDouble(z());
    }

    public int p() {
        byte[] bArr = this.f14348a;
        int i7 = this.f14349b;
        int i8 = ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7] & 255) << 24);
        int i9 = i7 + 3;
        int i10 = i8 | ((bArr[i7 + 2] & 255) << 8);
        this.f14349b = i7 + 4;
        return (bArr[i9] & 255) | i10;
    }

    public int q() {
        byte[] bArr = this.f14348a;
        int i7 = this.f14349b;
        int i8 = i7 + 2;
        int i9 = ((bArr[i7 + 1] & 255) << 8) | (((bArr[i7] & 255) << 24) >> 8);
        this.f14349b = i7 + 3;
        return (bArr[i8] & 255) | i9;
    }

    public String r() {
        return s(W2.e.f6821c);
    }

    public String s(Charset charset) {
        AbstractC1297a.b(f14347f.contains(charset), "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(W2.e.f6819a)) {
            O();
        }
        String E6 = E(d(charset) - this.f14349b, charset);
        if (this.f14349b == this.f14350c) {
            return E6;
        }
        V(charset);
        return E6;
    }

    public int t() {
        byte[] bArr = this.f14348a;
        int i7 = this.f14349b;
        int i8 = ((bArr[i7 + 1] & 255) << 8) | (bArr[i7] & 255);
        int i9 = i7 + 3;
        int i10 = i8 | ((bArr[i7 + 2] & 255) << 16);
        this.f14349b = i7 + 4;
        return ((bArr[i9] & 255) << 24) | i10;
    }

    public long u() {
        byte[] bArr = this.f14348a;
        int i7 = this.f14349b;
        int i8 = i7 + 7;
        long j7 = (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
        this.f14349b = i7 + 8;
        return ((bArr[i8] & 255) << 56) | j7;
    }

    public short v() {
        byte[] bArr = this.f14348a;
        int i7 = this.f14349b;
        int i8 = i7 + 1;
        int i9 = bArr[i7] & 255;
        this.f14349b = i7 + 2;
        return (short) (((bArr[i8] & 255) << 8) | i9);
    }

    public long w() {
        byte[] bArr = this.f14348a;
        int i7 = this.f14349b;
        int i8 = i7 + 3;
        long j7 = (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
        this.f14349b = i7 + 4;
        return ((bArr[i8] & 255) << 24) | j7;
    }

    public int x() {
        int t7 = t();
        if (t7 >= 0) {
            return t7;
        }
        throw new IllegalStateException("Top bit not zero: " + t7);
    }

    public int y() {
        byte[] bArr = this.f14348a;
        int i7 = this.f14349b;
        int i8 = i7 + 1;
        int i9 = bArr[i7] & 255;
        this.f14349b = i7 + 2;
        return ((bArr[i8] & 255) << 8) | i9;
    }

    public long z() {
        byte[] bArr = this.f14348a;
        int i7 = this.f14349b;
        int i8 = i7 + 7;
        long j7 = ((bArr[i7] & 255) << 56) | ((bArr[i7 + 1] & 255) << 48) | ((bArr[i7 + 2] & 255) << 40) | ((bArr[i7 + 3] & 255) << 32) | ((bArr[i7 + 4] & 255) << 24) | ((bArr[i7 + 5] & 255) << 16) | ((bArr[i7 + 6] & 255) << 8);
        this.f14349b = i7 + 8;
        return (bArr[i8] & 255) | j7;
    }

    public z(int i7) {
        this.f14348a = new byte[i7];
        this.f14350c = i7;
    }

    public z(byte[] bArr) {
        this.f14348a = bArr;
        this.f14350c = bArr.length;
    }

    public z(byte[] bArr, int i7) {
        this.f14348a = bArr;
        this.f14350c = i7;
    }
}
