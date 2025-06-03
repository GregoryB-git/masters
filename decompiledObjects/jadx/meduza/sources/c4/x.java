package c4;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public int f2331a;

    /* renamed from: b, reason: collision with root package name */
    public int f2332b;

    /* renamed from: c, reason: collision with root package name */
    public int f2333c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2334d;

    public /* synthetic */ x(byte[] bArr) {
        this.f2334d = bArr;
        this.f2331a = bArr.length;
    }

    public final boolean a(int i10) {
        return ((1 << i10) & this.f2331a) != 0;
    }

    public final boolean b() {
        boolean z10 = (((((byte[]) this.f2334d)[this.f2332b] & 255) >> this.f2333c) & 1) == 1;
        e(1);
        return z10;
    }

    public final int c(int i10) {
        int i11 = this.f2332b;
        int min = Math.min(i10, 8 - this.f2333c);
        int i12 = i11 + 1;
        int i13 = ((((byte[]) this.f2334d)[i11] & 255) >> this.f2333c) & (255 >> (8 - min));
        while (min < i10) {
            i13 |= (((byte[]) this.f2334d)[i12] & 255) << min;
            min += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        e(i10);
        return i14;
    }

    public final void d(int i10, int i11) {
        int[] iArr = (int[]) this.f2334d;
        if (i10 >= iArr.length) {
            return;
        }
        int i12 = 1 << i10;
        this.f2331a |= i12;
        this.f2332b &= ~i12;
        this.f2333c = (~i12) & this.f2333c;
        iArr[i10] = i11;
    }

    public final void e(int i10) {
        int i11;
        int i12 = i10 / 8;
        int i13 = this.f2332b + i12;
        this.f2332b = i13;
        int i14 = (i10 - (i12 * 8)) + this.f2333c;
        this.f2333c = i14;
        boolean z10 = true;
        if (i14 > 7) {
            this.f2332b = i13 + 1;
            this.f2333c = i14 - 8;
        }
        int i15 = this.f2332b;
        if (i15 < 0 || (i15 >= (i11 = this.f2331a) && (i15 != i11 || this.f2333c != 0))) {
            z10 = false;
        }
        x6.b.H(z10);
    }
}
