package v5;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f15968a;

    /* renamed from: b, reason: collision with root package name */
    public int f15969b;

    /* renamed from: c, reason: collision with root package name */
    public int f15970c;

    /* renamed from: d, reason: collision with root package name */
    public int f15971d;

    public t() {
        this.f15968a = e0.f;
    }

    public t(byte[] bArr, int i10) {
        this.f15968a = bArr;
        this.f15971d = i10;
    }

    public final void a() {
        int i10;
        int i11 = this.f15969b;
        x6.b.H(i11 >= 0 && (i11 < (i10 = this.f15971d) || (i11 == i10 && this.f15970c == 0)));
    }

    public final int b() {
        return ((this.f15971d - this.f15969b) * 8) - this.f15970c;
    }

    public final void c() {
        if (this.f15970c == 0) {
            return;
        }
        this.f15970c = 0;
        this.f15969b++;
        a();
    }

    public final int d() {
        x6.b.H(this.f15970c == 0);
        return this.f15969b;
    }

    public final int e() {
        return (this.f15969b * 8) + this.f15970c;
    }

    public final boolean f() {
        boolean z10 = (this.f15968a[this.f15969b] & (128 >> this.f15970c)) != 0;
        l();
        return z10;
    }

    public final int g(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f15970c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f15970c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f15970c = i13;
            byte[] bArr = this.f15968a;
            int i14 = this.f15969b;
            this.f15969b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f15968a;
        int i15 = this.f15969b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f15970c = 0;
            this.f15969b = i15 + 1;
        }
        a();
        return i16;
    }

    public final void h(byte[] bArr, int i10) {
        int i11 = (i10 >> 3) + 0;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.f15968a;
            int i13 = this.f15969b;
            int i14 = i13 + 1;
            this.f15969b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f15970c;
            byte b11 = (byte) (b10 << i15);
            bArr[i12] = b11;
            bArr[i12] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i11] & (255 >> i16));
        bArr[i11] = b12;
        int i17 = this.f15970c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f15968a;
            int i18 = this.f15969b;
            this.f15969b = i18 + 1;
            bArr[i11] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.f15970c = i17 - 8;
        }
        int i19 = this.f15970c + i16;
        this.f15970c = i19;
        byte[] bArr4 = this.f15968a;
        int i20 = this.f15969b;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
        if (i19 == 8) {
            this.f15970c = 0;
            this.f15969b = i20 + 1;
        }
        a();
    }

    public final void i(byte[] bArr, int i10) {
        x6.b.H(this.f15970c == 0);
        System.arraycopy(this.f15968a, this.f15969b, bArr, 0, i10);
        this.f15969b += i10;
        a();
    }

    public final void j(byte[] bArr, int i10) {
        this.f15968a = bArr;
        this.f15969b = 0;
        this.f15970c = 0;
        this.f15971d = i10;
    }

    public final void k(int i10) {
        int i11 = i10 / 8;
        this.f15969b = i11;
        this.f15970c = i10 - (i11 * 8);
        a();
    }

    public final void l() {
        int i10 = this.f15970c + 1;
        this.f15970c = i10;
        if (i10 == 8) {
            this.f15970c = 0;
            this.f15969b++;
        }
        a();
    }

    public final void m(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f15969b + i11;
        this.f15969b = i12;
        int i13 = (i10 - (i11 * 8)) + this.f15970c;
        this.f15970c = i13;
        if (i13 > 7) {
            this.f15969b = i12 + 1;
            this.f15970c = i13 - 8;
        }
        a();
    }

    public final void n(int i10) {
        x6.b.H(this.f15970c == 0);
        this.f15969b += i10;
        a();
    }
}
