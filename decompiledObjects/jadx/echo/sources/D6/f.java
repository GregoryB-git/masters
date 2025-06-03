package D6;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: t, reason: collision with root package name */
    public final transient byte[][] f1506t;

    /* renamed from: u, reason: collision with root package name */
    public final transient int[] f1507u;

    public f(a aVar, int i7) {
        super(null);
        g.b(aVar.f1491p, 0L, i7);
        d dVar = aVar.f1490o;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            int i11 = dVar.f1499c;
            int i12 = dVar.f1498b;
            if (i11 == i12) {
                throw new AssertionError("s.limit == s.pos");
            }
            i9 += i11 - i12;
            i10++;
            dVar = dVar.f1502f;
        }
        this.f1506t = new byte[i10][];
        this.f1507u = new int[i10 * 2];
        d dVar2 = aVar.f1490o;
        int i13 = 0;
        while (i8 < i7) {
            byte[][] bArr = this.f1506t;
            bArr[i13] = dVar2.f1497a;
            int i14 = dVar2.f1499c;
            int i15 = dVar2.f1498b;
            i8 += i14 - i15;
            if (i8 > i7) {
                i8 = i7;
            }
            int[] iArr = this.f1507u;
            iArr[i13] = i8;
            iArr[bArr.length + i13] = i15;
            dVar2.f1500d = true;
            i13++;
            dVar2 = dVar2.f1502f;
        }
    }

    private Object writeReplace() {
        return C();
    }

    public final c C() {
        return new c(z());
    }

    @Override // D6.c
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.r() == r() && w(0, cVar, 0, r())) {
                return true;
            }
        }
        return false;
    }

    @Override // D6.c
    public int hashCode() {
        int i7 = this.f1495p;
        if (i7 != 0) {
            return i7;
        }
        int length = this.f1506t.length;
        int i8 = 0;
        int i9 = 1;
        int i10 = 0;
        while (i8 < length) {
            byte[] bArr = this.f1506t[i8];
            int[] iArr = this.f1507u;
            int i11 = iArr[length + i8];
            int i12 = iArr[i8];
            int i13 = (i12 - i10) + i11;
            while (i11 < i13) {
                i9 = (i9 * 31) + bArr[i11];
                i11++;
            }
            i8++;
            i10 = i12;
        }
        this.f1495p = i9;
        return i9;
    }

    @Override // D6.c
    public byte l(int i7) {
        g.b(this.f1507u[this.f1506t.length - 1], i7, 1L);
        int x7 = x(i7);
        int i8 = x7 == 0 ? 0 : this.f1507u[x7 - 1];
        int[] iArr = this.f1507u;
        byte[][] bArr = this.f1506t;
        return bArr[x7][(i7 - i8) + iArr[bArr.length + x7]];
    }

    @Override // D6.c
    public String m() {
        return C().m();
    }

    @Override // D6.c
    public boolean o(int i7, byte[] bArr, int i8, int i9) {
        if (i7 < 0 || i7 > r() - i9 || i8 < 0 || i8 > bArr.length - i9) {
            return false;
        }
        int x7 = x(i7);
        while (i9 > 0) {
            int i10 = x7 == 0 ? 0 : this.f1507u[x7 - 1];
            int min = Math.min(i9, ((this.f1507u[x7] - i10) + i10) - i7);
            int[] iArr = this.f1507u;
            byte[][] bArr2 = this.f1506t;
            if (!g.a(bArr2[x7], (i7 - i10) + iArr[bArr2.length + x7], bArr, i8, min)) {
                return false;
            }
            i7 += min;
            i8 += min;
            i9 -= min;
            x7++;
        }
        return true;
    }

    @Override // D6.c
    public int r() {
        return this.f1507u[this.f1506t.length - 1];
    }

    @Override // D6.c
    public c s(int i7, int i8) {
        return C().s(i7, i8);
    }

    @Override // D6.c
    public String toString() {
        return C().toString();
    }

    @Override // D6.c
    public String u() {
        return C().u();
    }

    public boolean w(int i7, c cVar, int i8, int i9) {
        if (i7 < 0 || i7 > r() - i9) {
            return false;
        }
        int x7 = x(i7);
        while (i9 > 0) {
            int i10 = x7 == 0 ? 0 : this.f1507u[x7 - 1];
            int min = Math.min(i9, ((this.f1507u[x7] - i10) + i10) - i7);
            int[] iArr = this.f1507u;
            byte[][] bArr = this.f1506t;
            if (!cVar.o(i8, bArr[x7], (i7 - i10) + iArr[bArr.length + x7], min)) {
                return false;
            }
            i7 += min;
            i8 += min;
            i9 -= min;
            x7++;
        }
        return true;
    }

    public final int x(int i7) {
        int binarySearch = Arrays.binarySearch(this.f1507u, 0, this.f1506t.length, i7 + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    public byte[] z() {
        int[] iArr = this.f1507u;
        byte[][] bArr = this.f1506t;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int[] iArr2 = this.f1507u;
            int i9 = iArr2[length + i7];
            int i10 = iArr2[i7];
            System.arraycopy(this.f1506t[i7], i9, bArr2, i8, i10 - i8);
            i7++;
            i8 = i10;
        }
        return bArr2;
    }
}
