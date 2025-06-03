package Z4;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f7875a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f7876b;

    public b(a aVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f7875a = aVar;
        int length = iArr.length;
        int i7 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f7876b = iArr;
            return;
        }
        while (i7 < length && iArr[i7] == 0) {
            i7++;
        }
        if (i7 == length) {
            this.f7876b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i7];
        this.f7876b = iArr2;
        System.arraycopy(iArr, i7, iArr2, 0, iArr2.length);
    }

    public b a(b bVar) {
        if (!this.f7875a.equals(bVar.f7875a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (f()) {
            return bVar;
        }
        if (bVar.f()) {
            return this;
        }
        int[] iArr = this.f7876b;
        int[] iArr2 = bVar.f7876b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i7 = length; i7 < iArr.length; i7++) {
            iArr3[i7] = a.a(iArr2[i7 - length], iArr[i7]);
        }
        return new b(this.f7875a, iArr3);
    }

    public b[] b(b bVar) {
        if (!this.f7875a.equals(bVar.f7875a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (bVar.f()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        b e7 = this.f7875a.e();
        int f7 = this.f7875a.f(bVar.c(bVar.e()));
        b bVar2 = this;
        while (bVar2.e() >= bVar.e() && !bVar2.f()) {
            int e8 = bVar2.e() - bVar.e();
            int h7 = this.f7875a.h(bVar2.c(bVar2.e()), f7);
            b h8 = bVar.h(e8, h7);
            e7 = e7.a(this.f7875a.b(e8, h7));
            bVar2 = bVar2.a(h8);
        }
        return new b[]{e7, bVar2};
    }

    public int c(int i7) {
        return this.f7876b[(r0.length - 1) - i7];
    }

    public int[] d() {
        return this.f7876b;
    }

    public int e() {
        return this.f7876b.length - 1;
    }

    public boolean f() {
        return this.f7876b[0] == 0;
    }

    public b g(b bVar) {
        if (!this.f7875a.equals(bVar.f7875a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (f() || bVar.f()) {
            return this.f7875a.e();
        }
        int[] iArr = this.f7876b;
        int length = iArr.length;
        int[] iArr2 = bVar.f7876b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = iArr[i7];
            for (int i9 = 0; i9 < length2; i9++) {
                int i10 = i7 + i9;
                iArr3[i10] = a.a(iArr3[i10], this.f7875a.h(i8, iArr2[i9]));
            }
        }
        return new b(this.f7875a, iArr3);
    }

    public b h(int i7, int i8) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        if (i8 == 0) {
            return this.f7875a.e();
        }
        int length = this.f7876b.length;
        int[] iArr = new int[i7 + length];
        for (int i9 = 0; i9 < length; i9++) {
            iArr[i9] = this.f7875a.h(this.f7876b[i9], i8);
        }
        return new b(this.f7875a, iArr);
    }

    public String toString() {
        char c7;
        StringBuilder sb = new StringBuilder(e() * 8);
        for (int e7 = e(); e7 >= 0; e7--) {
            int c8 = c(e7);
            if (c8 != 0) {
                if (c8 < 0) {
                    sb.append(" - ");
                    c8 = -c8;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (e7 == 0 || c8 != 1) {
                    int g7 = this.f7875a.g(c8);
                    if (g7 == 0) {
                        c7 = '1';
                    } else if (g7 == 1) {
                        c7 = 'a';
                    } else {
                        sb.append("a^");
                        sb.append(g7);
                    }
                    sb.append(c7);
                }
                if (e7 != 0) {
                    if (e7 == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(e7);
                    }
                }
            }
        }
        return sb.toString();
    }
}
