package F0;

import g0.AbstractC1297a;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1816a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1817b;

    /* renamed from: c, reason: collision with root package name */
    public int f1818c;

    /* renamed from: d, reason: collision with root package name */
    public int f1819d;

    public V(byte[] bArr) {
        this.f1816a = bArr;
        this.f1817b = bArr.length;
    }

    public final void a() {
        int i7;
        int i8 = this.f1818c;
        AbstractC1297a.f(i8 >= 0 && (i8 < (i7 = this.f1817b) || (i8 == i7 && this.f1819d == 0)));
    }

    public int b() {
        return (this.f1818c * 8) + this.f1819d;
    }

    public boolean c() {
        boolean z7 = (((this.f1816a[this.f1818c] & 255) >> this.f1819d) & 1) == 1;
        e(1);
        return z7;
    }

    public int d(int i7) {
        int i8 = this.f1818c;
        int min = Math.min(i7, 8 - this.f1819d);
        int i9 = i8 + 1;
        int i10 = ((this.f1816a[i8] & 255) >> this.f1819d) & (255 >> (8 - min));
        while (min < i7) {
            i10 |= (this.f1816a[i9] & 255) << min;
            min += 8;
            i9++;
        }
        int i11 = i10 & ((-1) >>> (32 - i7));
        e(i7);
        return i11;
    }

    public void e(int i7) {
        int i8 = i7 / 8;
        int i9 = this.f1818c + i8;
        this.f1818c = i9;
        int i10 = this.f1819d + (i7 - (i8 * 8));
        this.f1819d = i10;
        if (i10 > 7) {
            this.f1818c = i9 + 1;
            this.f1819d = i10 - 8;
        }
        a();
    }
}
