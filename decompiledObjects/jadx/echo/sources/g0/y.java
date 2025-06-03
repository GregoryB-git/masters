package g0;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f14341a;

    /* renamed from: b, reason: collision with root package name */
    public int f14342b;

    /* renamed from: c, reason: collision with root package name */
    public int f14343c;

    /* renamed from: d, reason: collision with root package name */
    public int f14344d;

    public y() {
        this.f14341a = M.f14266f;
    }

    public final void a() {
        int i7;
        int i8 = this.f14342b;
        AbstractC1297a.f(i8 >= 0 && (i8 < (i7 = this.f14344d) || (i8 == i7 && this.f14343c == 0)));
    }

    public int b() {
        return ((this.f14344d - this.f14342b) * 8) - this.f14343c;
    }

    public void c() {
        if (this.f14343c == 0) {
            return;
        }
        this.f14343c = 0;
        this.f14342b++;
        a();
    }

    public int d() {
        AbstractC1297a.f(this.f14343c == 0);
        return this.f14342b;
    }

    public int e() {
        return (this.f14342b * 8) + this.f14343c;
    }

    public void f(int i7, int i8) {
        if (i8 < 32) {
            i7 &= (1 << i8) - 1;
        }
        int min = Math.min(8 - this.f14343c, i8);
        int i9 = this.f14343c;
        int i10 = (8 - i9) - min;
        byte[] bArr = this.f14341a;
        int i11 = this.f14342b;
        byte b7 = (byte) (((65280 >> i9) | ((1 << i10) - 1)) & bArr[i11]);
        bArr[i11] = b7;
        int i12 = i8 - min;
        bArr[i11] = (byte) (b7 | ((i7 >>> i12) << i10));
        int i13 = i11 + 1;
        while (i12 > 8) {
            this.f14341a[i13] = (byte) (i7 >>> (i12 - 8));
            i12 -= 8;
            i13++;
        }
        int i14 = 8 - i12;
        byte[] bArr2 = this.f14341a;
        byte b8 = (byte) (bArr2[i13] & ((1 << i14) - 1));
        bArr2[i13] = b8;
        bArr2[i13] = (byte) (((i7 & ((1 << i12) - 1)) << i14) | b8);
        r(i8);
        a();
    }

    public boolean g() {
        boolean z7 = (this.f14341a[this.f14342b] & (128 >> this.f14343c)) != 0;
        q();
        return z7;
    }

    public int h(int i7) {
        int i8;
        if (i7 == 0) {
            return 0;
        }
        this.f14343c += i7;
        int i9 = 0;
        while (true) {
            i8 = this.f14343c;
            if (i8 <= 8) {
                break;
            }
            int i10 = i8 - 8;
            this.f14343c = i10;
            byte[] bArr = this.f14341a;
            int i11 = this.f14342b;
            this.f14342b = i11 + 1;
            i9 |= (bArr[i11] & 255) << i10;
        }
        byte[] bArr2 = this.f14341a;
        int i12 = this.f14342b;
        int i13 = ((-1) >>> (32 - i7)) & (i9 | ((bArr2[i12] & 255) >> (8 - i8)));
        if (i8 == 8) {
            this.f14343c = 0;
            this.f14342b = i12 + 1;
        }
        a();
        return i13;
    }

    public void i(byte[] bArr, int i7, int i8) {
        int i9 = (i8 >> 3) + i7;
        while (i7 < i9) {
            byte[] bArr2 = this.f14341a;
            int i10 = this.f14342b;
            int i11 = i10 + 1;
            this.f14342b = i11;
            byte b7 = bArr2[i10];
            int i12 = this.f14343c;
            byte b8 = (byte) (b7 << i12);
            bArr[i7] = b8;
            bArr[i7] = (byte) (((255 & bArr2[i11]) >> (8 - i12)) | b8);
            i7++;
        }
        int i13 = i8 & 7;
        if (i13 == 0) {
            return;
        }
        byte b9 = (byte) (bArr[i9] & (255 >> i13));
        bArr[i9] = b9;
        int i14 = this.f14343c;
        if (i14 + i13 > 8) {
            byte[] bArr3 = this.f14341a;
            int i15 = this.f14342b;
            this.f14342b = i15 + 1;
            bArr[i9] = (byte) (b9 | ((bArr3[i15] & 255) << i14));
            this.f14343c = i14 - 8;
        }
        int i16 = this.f14343c + i13;
        this.f14343c = i16;
        byte[] bArr4 = this.f14341a;
        int i17 = this.f14342b;
        bArr[i9] = (byte) (((byte) (((255 & bArr4[i17]) >> (8 - i16)) << (8 - i13))) | bArr[i9]);
        if (i16 == 8) {
            this.f14343c = 0;
            this.f14342b = i17 + 1;
        }
        a();
    }

    public long j(int i7) {
        return i7 <= 32 ? M.h1(h(i7)) : M.g1(h(i7 - 32), h(32));
    }

    public void k(byte[] bArr, int i7, int i8) {
        AbstractC1297a.f(this.f14343c == 0);
        System.arraycopy(this.f14341a, this.f14342b, bArr, i7, i8);
        this.f14342b += i8;
        a();
    }

    public String l(int i7, Charset charset) {
        byte[] bArr = new byte[i7];
        k(bArr, 0, i7);
        return new String(bArr, charset);
    }

    public void m(z zVar) {
        o(zVar.e(), zVar.g());
        p(zVar.f() * 8);
    }

    public void n(byte[] bArr) {
        o(bArr, bArr.length);
    }

    public void o(byte[] bArr, int i7) {
        this.f14341a = bArr;
        this.f14342b = 0;
        this.f14343c = 0;
        this.f14344d = i7;
    }

    public void p(int i7) {
        int i8 = i7 / 8;
        this.f14342b = i8;
        this.f14343c = i7 - (i8 * 8);
        a();
    }

    public void q() {
        int i7 = this.f14343c + 1;
        this.f14343c = i7;
        if (i7 == 8) {
            this.f14343c = 0;
            this.f14342b++;
        }
        a();
    }

    public void r(int i7) {
        int i8 = i7 / 8;
        int i9 = this.f14342b + i8;
        this.f14342b = i9;
        int i10 = this.f14343c + (i7 - (i8 * 8));
        this.f14343c = i10;
        if (i10 > 7) {
            this.f14342b = i9 + 1;
            this.f14343c = i10 - 8;
        }
        a();
    }

    public void s(int i7) {
        AbstractC1297a.f(this.f14343c == 0);
        this.f14342b += i7;
        a();
    }

    public y(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public y(byte[] bArr, int i7) {
        this.f14341a = bArr;
        this.f14344d = i7;
    }
}
