package Y4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements Cloneable {

    /* renamed from: o, reason: collision with root package name */
    public int[] f7570o;

    /* renamed from: p, reason: collision with root package name */
    public int f7571p;

    public a() {
        this.f7571p = 0;
        this.f7570o = new int[1];
    }

    public static int[] o(int i7) {
        return new int[(i7 + 31) / 32];
    }

    public void a(boolean z7) {
        g(this.f7571p + 1);
        if (z7) {
            int[] iArr = this.f7570o;
            int i7 = this.f7571p;
            int i8 = i7 / 32;
            iArr[i8] = (1 << (i7 & 31)) | iArr[i8];
        }
        this.f7571p++;
    }

    public void b(a aVar) {
        int i7 = aVar.f7571p;
        g(this.f7571p + i7);
        for (int i8 = 0; i8 < i7; i8++) {
            a(aVar.j(i8));
        }
    }

    public void d(int i7, int i8) {
        if (i8 < 0 || i8 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        g(this.f7571p + i8);
        while (i8 > 0) {
            boolean z7 = true;
            if (((i7 >> (i8 - 1)) & 1) != 1) {
                z7 = false;
            }
            a(z7);
            i8--;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7571p == aVar.f7571p && Arrays.equals(this.f7570o, aVar.f7570o);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a clone() {
        return new a((int[]) this.f7570o.clone(), this.f7571p);
    }

    public final void g(int i7) {
        if (i7 > (this.f7570o.length << 5)) {
            int[] o7 = o(i7);
            int[] iArr = this.f7570o;
            System.arraycopy(iArr, 0, o7, 0, iArr.length);
            this.f7570o = o7;
        }
    }

    public int hashCode() {
        return (this.f7571p * 31) + Arrays.hashCode(this.f7570o);
    }

    public boolean j(int i7) {
        return ((1 << (i7 & 31)) & this.f7570o[i7 / 32]) != 0;
    }

    public int l() {
        return this.f7571p;
    }

    public int n() {
        return (this.f7571p + 7) / 8;
    }

    public void p(int i7, byte[] bArr, int i8, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = 0;
            for (int i12 = 0; i12 < 8; i12++) {
                if (j(i7)) {
                    i11 |= 1 << (7 - i12);
                }
                i7++;
            }
            bArr[i8 + i10] = (byte) i11;
        }
    }

    public void s(a aVar) {
        if (this.f7571p != aVar.f7571p) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i7 = 0;
        while (true) {
            int[] iArr = this.f7570o;
            if (i7 >= iArr.length) {
                return;
            }
            iArr[i7] = iArr[i7] ^ aVar.f7570o[i7];
            i7++;
        }
    }

    public String toString() {
        int i7 = this.f7571p;
        StringBuilder sb = new StringBuilder(i7 + (i7 / 8) + 1);
        for (int i8 = 0; i8 < this.f7571p; i8++) {
            if ((i8 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(j(i8) ? 'X' : '.');
        }
        return sb.toString();
    }

    public a(int[] iArr, int i7) {
        this.f7570o = iArr;
        this.f7571p = i7;
    }
}
