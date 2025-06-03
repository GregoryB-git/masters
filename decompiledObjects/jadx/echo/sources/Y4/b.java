package Y4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements Cloneable {

    /* renamed from: o, reason: collision with root package name */
    public final int f7572o;

    /* renamed from: p, reason: collision with root package name */
    public final int f7573p;

    /* renamed from: q, reason: collision with root package name */
    public final int f7574q;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f7575r;

    public b(int i7) {
        this(i7, i7);
    }

    public final String a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f7573p * (this.f7572o + 1));
        for (int i7 = 0; i7 < this.f7573p; i7++) {
            for (int i8 = 0; i8 < this.f7572o; i8++) {
                sb.append(f(i8, i7) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    public void b() {
        int length = this.f7575r.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f7575r[i7] = 0;
        }
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public b clone() {
        return new b(this.f7572o, this.f7573p, this.f7574q, (int[]) this.f7575r.clone());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7572o == bVar.f7572o && this.f7573p == bVar.f7573p && this.f7574q == bVar.f7574q && Arrays.equals(this.f7575r, bVar.f7575r);
    }

    public boolean f(int i7, int i8) {
        return ((this.f7575r[(i8 * this.f7574q) + (i7 / 32)] >>> (i7 & 31)) & 1) != 0;
    }

    public int g() {
        return this.f7573p;
    }

    public int hashCode() {
        int i7 = this.f7572o;
        return (((((((i7 * 31) + i7) * 31) + this.f7573p) * 31) + this.f7574q) * 31) + Arrays.hashCode(this.f7575r);
    }

    public int j() {
        return this.f7572o;
    }

    public void l(int i7, int i8) {
        int i9 = (i8 * this.f7574q) + (i7 / 32);
        int[] iArr = this.f7575r;
        iArr[i9] = (1 << (i7 & 31)) | iArr[i9];
    }

    public void n(int i7, int i8, int i9, int i10) {
        if (i8 < 0 || i7 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i10 <= 0 || i9 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i11 = i9 + i7;
        int i12 = i10 + i8;
        if (i12 > this.f7573p || i11 > this.f7572o) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i8 < i12) {
            int i13 = this.f7574q * i8;
            for (int i14 = i7; i14 < i11; i14++) {
                int[] iArr = this.f7575r;
                int i15 = (i14 / 32) + i13;
                iArr[i15] = iArr[i15] | (1 << (i14 & 31));
            }
            i8++;
        }
    }

    public String o(String str, String str2) {
        return a(str, str2, "\n");
    }

    public String toString() {
        return o("X ", "  ");
    }

    public b(int i7, int i8) {
        if (i7 <= 0 || i8 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f7572o = i7;
        this.f7573p = i8;
        int i9 = (i7 + 31) / 32;
        this.f7574q = i9;
        this.f7575r = new int[i9 * i8];
    }

    public b(int i7, int i8, int i9, int[] iArr) {
        this.f7572o = i7;
        this.f7573p = i8;
        this.f7574q = i9;
        this.f7575r = iArr;
    }
}
