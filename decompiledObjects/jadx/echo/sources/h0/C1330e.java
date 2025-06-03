package h0;

import g0.AbstractC1297a;

/* renamed from: h0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1330e {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f14568a;

    /* renamed from: b, reason: collision with root package name */
    public int f14569b;

    /* renamed from: c, reason: collision with root package name */
    public int f14570c;

    /* renamed from: d, reason: collision with root package name */
    public int f14571d;

    public C1330e(byte[] bArr, int i7, int i8) {
        i(bArr, i7, i8);
    }

    public final void a() {
        int i7;
        int i8 = this.f14570c;
        AbstractC1297a.f(i8 >= 0 && (i8 < (i7 = this.f14569b) || (i8 == i7 && this.f14571d == 0)));
    }

    public boolean b(int i7) {
        int i8 = this.f14570c;
        int i9 = i7 / 8;
        int i10 = i8 + i9;
        int i11 = (this.f14571d + i7) - (i9 * 8);
        if (i11 > 7) {
            i10++;
            i11 -= 8;
        }
        while (true) {
            i8++;
            if (i8 > i10 || i10 >= this.f14569b) {
                break;
            }
            if (j(i8)) {
                i10++;
                i8 += 2;
            }
        }
        int i12 = this.f14569b;
        if (i10 >= i12) {
            return i10 == i12 && i11 == 0;
        }
        return true;
    }

    public boolean c() {
        int i7 = this.f14570c;
        int i8 = this.f14571d;
        int i9 = 0;
        while (this.f14570c < this.f14569b && !d()) {
            i9++;
        }
        boolean z7 = this.f14570c == this.f14569b;
        this.f14570c = i7;
        this.f14571d = i8;
        return !z7 && b((i9 * 2) + 1);
    }

    public boolean d() {
        boolean z7 = (this.f14568a[this.f14570c] & (128 >> this.f14571d)) != 0;
        k();
        return z7;
    }

    public int e(int i7) {
        int i8;
        this.f14571d += i7;
        int i9 = 0;
        while (true) {
            i8 = this.f14571d;
            if (i8 <= 8) {
                break;
            }
            int i10 = i8 - 8;
            this.f14571d = i10;
            byte[] bArr = this.f14568a;
            int i11 = this.f14570c;
            i9 |= (bArr[i11] & 255) << i10;
            if (!j(i11 + 1)) {
                r3 = 1;
            }
            this.f14570c = i11 + r3;
        }
        byte[] bArr2 = this.f14568a;
        int i12 = this.f14570c;
        int i13 = ((-1) >>> (32 - i7)) & (i9 | ((bArr2[i12] & 255) >> (8 - i8)));
        if (i8 == 8) {
            this.f14571d = 0;
            this.f14570c = i12 + (j(i12 + 1) ? 2 : 1);
        }
        a();
        return i13;
    }

    public final int f() {
        int i7 = 0;
        while (!d()) {
            i7++;
        }
        return ((1 << i7) - 1) + (i7 > 0 ? e(i7) : 0);
    }

    public int g() {
        int f7 = f();
        return (f7 % 2 == 0 ? -1 : 1) * ((f7 + 1) / 2);
    }

    public int h() {
        return f();
    }

    public void i(byte[] bArr, int i7, int i8) {
        this.f14568a = bArr;
        this.f14570c = i7;
        this.f14569b = i8;
        this.f14571d = 0;
        a();
    }

    public final boolean j(int i7) {
        if (2 <= i7 && i7 < this.f14569b) {
            byte[] bArr = this.f14568a;
            if (bArr[i7] == 3 && bArr[i7 - 2] == 0 && bArr[i7 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void k() {
        int i7 = this.f14571d + 1;
        this.f14571d = i7;
        if (i7 == 8) {
            this.f14571d = 0;
            int i8 = this.f14570c;
            this.f14570c = i8 + (j(i8 + 1) ? 2 : 1);
        }
        a();
    }

    public void l(int i7) {
        int i8 = this.f14570c;
        int i9 = i7 / 8;
        int i10 = i8 + i9;
        this.f14570c = i10;
        int i11 = this.f14571d + (i7 - (i9 * 8));
        this.f14571d = i11;
        if (i11 > 7) {
            this.f14570c = i10 + 1;
            this.f14571d = i11 - 8;
        }
        while (true) {
            i8++;
            if (i8 > this.f14570c) {
                a();
                return;
            } else if (j(i8)) {
                this.f14570c++;
                i8 += 2;
            }
        }
    }
}
