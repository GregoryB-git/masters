package o4;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f11793a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f11794b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f11795c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int[] f11796d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    public int f11797e;

    public i() {
        this.f11797e = r0.length - 1;
    }

    public final void a(int i10) {
        int i11 = this.f11795c;
        int[] iArr = this.f11796d;
        if (i11 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i12 = this.f11793a;
            int i13 = length2 - i12;
            System.arraycopy(iArr, i12, iArr2, 0, i13);
            System.arraycopy(this.f11796d, 0, iArr2, i13, i12);
            this.f11793a = 0;
            this.f11794b = this.f11795c - 1;
            this.f11796d = iArr2;
            this.f11797e = length - 1;
        }
        int i14 = (this.f11794b + 1) & this.f11797e;
        this.f11794b = i14;
        this.f11796d[i14] = i10;
        this.f11795c++;
    }
}
