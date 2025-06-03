package b5;

import java.util.Arrays;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f9980a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9981b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9982c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f9983d;

    public e(CharSequence charSequence, int i7, int i8) {
        this.f9980a = charSequence;
        this.f9982c = i7;
        this.f9981b = i8;
        byte[] bArr = new byte[i7 * i8];
        this.f9983d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public final void a(int i7) {
        g(this.f9981b - 1, 0, i7, 1);
        g(this.f9981b - 1, 1, i7, 2);
        g(this.f9981b - 1, 2, i7, 3);
        g(0, this.f9982c - 2, i7, 4);
        g(0, this.f9982c - 1, i7, 5);
        g(1, this.f9982c - 1, i7, 6);
        g(2, this.f9982c - 1, i7, 7);
        g(3, this.f9982c - 1, i7, 8);
    }

    public final void b(int i7) {
        g(this.f9981b - 3, 0, i7, 1);
        g(this.f9981b - 2, 0, i7, 2);
        g(this.f9981b - 1, 0, i7, 3);
        g(0, this.f9982c - 4, i7, 4);
        g(0, this.f9982c - 3, i7, 5);
        g(0, this.f9982c - 2, i7, 6);
        g(0, this.f9982c - 1, i7, 7);
        g(1, this.f9982c - 1, i7, 8);
    }

    public final void c(int i7) {
        g(this.f9981b - 3, 0, i7, 1);
        g(this.f9981b - 2, 0, i7, 2);
        g(this.f9981b - 1, 0, i7, 3);
        g(0, this.f9982c - 2, i7, 4);
        g(0, this.f9982c - 1, i7, 5);
        g(1, this.f9982c - 1, i7, 6);
        g(2, this.f9982c - 1, i7, 7);
        g(3, this.f9982c - 1, i7, 8);
    }

    public final void d(int i7) {
        g(this.f9981b - 1, 0, i7, 1);
        g(this.f9981b - 1, this.f9982c - 1, i7, 2);
        g(0, this.f9982c - 3, i7, 3);
        g(0, this.f9982c - 2, i7, 4);
        g(0, this.f9982c - 1, i7, 5);
        g(1, this.f9982c - 3, i7, 6);
        g(1, this.f9982c - 2, i7, 7);
        g(1, this.f9982c - 1, i7, 8);
    }

    public final boolean e(int i7, int i8) {
        return this.f9983d[(i8 * this.f9982c) + i7] == 1;
    }

    public final boolean f(int i7, int i8) {
        return this.f9983d[(i8 * this.f9982c) + i7] >= 0;
    }

    public final void g(int i7, int i8, int i9, int i10) {
        if (i7 < 0) {
            int i11 = this.f9981b;
            i7 += i11;
            i8 += 4 - ((i11 + 4) % 8);
        }
        if (i8 < 0) {
            int i12 = this.f9982c;
            i8 += i12;
            i7 += 4 - ((i12 + 4) % 8);
        }
        i(i8, i7, (this.f9980a.charAt(i9) & (1 << (8 - i10))) != 0);
    }

    public final void h() {
        int i7;
        int i8;
        int i9 = 0;
        int i10 = 0;
        int i11 = 4;
        while (true) {
            if (i11 == this.f9981b && i9 == 0) {
                a(i10);
                i10++;
            }
            if (i11 == this.f9981b - 2 && i9 == 0 && this.f9982c % 4 != 0) {
                b(i10);
                i10++;
            }
            if (i11 == this.f9981b - 2 && i9 == 0 && this.f9982c % 8 == 4) {
                c(i10);
                i10++;
            }
            if (i11 == this.f9981b + 4 && i9 == 2 && this.f9982c % 8 == 0) {
                d(i10);
                i10++;
            }
            while (true) {
                if (i11 < this.f9981b && i9 >= 0 && !f(i9, i11)) {
                    j(i11, i9, i10);
                    i10++;
                }
                int i12 = i11 - 2;
                int i13 = i9 + 2;
                if (i12 < 0 || i13 >= this.f9982c) {
                    break;
                }
                i11 = i12;
                i9 = i13;
            }
            int i14 = i11 - 1;
            int i15 = i9 + 5;
            while (true) {
                if (i14 >= 0 && i15 < this.f9982c && !f(i15, i14)) {
                    j(i14, i15, i10);
                    i10++;
                }
                int i16 = i14 + 2;
                int i17 = i15 - 2;
                i7 = this.f9981b;
                if (i16 >= i7 || i17 < 0) {
                    break;
                }
                i14 = i16;
                i15 = i17;
            }
            i11 = i14 + 5;
            i9 = i15 - 1;
            if (i11 >= i7 && i9 >= (i8 = this.f9982c)) {
                break;
            }
        }
        if (f(i8 - 1, i7 - 1)) {
            return;
        }
        i(this.f9982c - 1, this.f9981b - 1, true);
        i(this.f9982c - 2, this.f9981b - 2, true);
    }

    public final void i(int i7, int i8, boolean z7) {
        this.f9983d[(i8 * this.f9982c) + i7] = z7 ? (byte) 1 : (byte) 0;
    }

    public final void j(int i7, int i8, int i9) {
        int i10 = i7 - 2;
        int i11 = i8 - 2;
        g(i10, i11, i9, 1);
        int i12 = i8 - 1;
        g(i10, i12, i9, 2);
        int i13 = i7 - 1;
        g(i13, i11, i9, 3);
        g(i13, i12, i9, 4);
        g(i13, i8, i9, 5);
        g(i7, i11, i9, 6);
        g(i7, i12, i9, 7);
        g(i7, i8, i9, 8);
    }
}
