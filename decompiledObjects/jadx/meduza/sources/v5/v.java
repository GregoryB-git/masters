package v5;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f15977a;

    /* renamed from: b, reason: collision with root package name */
    public int f15978b;

    /* renamed from: c, reason: collision with root package name */
    public int f15979c;

    /* renamed from: d, reason: collision with root package name */
    public int f15980d = 0;

    public v(byte[] bArr, int i10, int i11) {
        this.f15977a = bArr;
        this.f15979c = i10;
        this.f15978b = i11;
        a();
    }

    public final void a() {
        int i10;
        int i11 = this.f15979c;
        x6.b.H(i11 >= 0 && (i11 < (i10 = this.f15978b) || (i11 == i10 && this.f15980d == 0)));
    }

    public final boolean b(int i10) {
        int i11 = this.f15979c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f15980d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f15978b) {
                break;
            }
            if (h(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f15978b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public final boolean c() {
        int i10 = this.f15979c;
        int i11 = this.f15980d;
        int i12 = 0;
        while (this.f15979c < this.f15978b && !d()) {
            i12++;
        }
        boolean z10 = this.f15979c == this.f15978b;
        this.f15979c = i10;
        this.f15980d = i11;
        return !z10 && b((i12 * 2) + 1);
    }

    public final boolean d() {
        boolean z10 = (this.f15977a[this.f15979c] & (128 >> this.f15980d)) != 0;
        i();
        return z10;
    }

    public final int e(int i10) {
        int i11;
        this.f15980d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f15980d;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f15980d = i13;
            byte[] bArr = this.f15977a;
            int i14 = this.f15979c;
            i12 |= (bArr[i14] & 255) << i13;
            if (!h(i14 + 1)) {
                r3 = 1;
            }
            this.f15979c = i14 + r3;
        }
        byte[] bArr2 = this.f15977a;
        int i15 = this.f15979c;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f15980d = 0;
            this.f15979c = i15 + (h(i15 + 1) ? 2 : 1);
        }
        a();
        return i16;
    }

    public final int f() {
        int i10 = 0;
        while (!d()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? e(i10) : 0);
    }

    public final int g() {
        int f = f();
        return ((f + 1) / 2) * (f % 2 == 0 ? -1 : 1);
    }

    public final boolean h(int i10) {
        if (2 <= i10 && i10 < this.f15978b) {
            byte[] bArr = this.f15977a;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        int i10 = this.f15980d + 1;
        this.f15980d = i10;
        if (i10 == 8) {
            this.f15980d = 0;
            int i11 = this.f15979c;
            this.f15979c = i11 + (h(i11 + 1) ? 2 : 1);
        }
        a();
    }

    public final void j(int i10) {
        int i11 = this.f15979c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f15979c = i13;
        int i14 = (i10 - (i12 * 8)) + this.f15980d;
        this.f15980d = i14;
        if (i14 > 7) {
            this.f15979c = i13 + 1;
            this.f15980d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f15979c) {
                a();
                return;
            } else if (h(i11)) {
                this.f15979c++;
                i11 += 2;
            }
        }
    }
}
