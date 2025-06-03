package t;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int[] f19373a;

    /* renamed from: b, reason: collision with root package name */
    public int f19374b;

    /* renamed from: c, reason: collision with root package name */
    public int f19375c;

    /* renamed from: d, reason: collision with root package name */
    public int f19376d;

    public c() {
        this(8);
    }

    public void a(int i7) {
        int[] iArr = this.f19373a;
        int i8 = this.f19375c;
        iArr[i8] = i7;
        int i9 = this.f19376d & (i8 + 1);
        this.f19375c = i9;
        if (i9 == this.f19374b) {
            c();
        }
    }

    public void b() {
        this.f19375c = this.f19374b;
    }

    public final void c() {
        int[] iArr = this.f19373a;
        int length = iArr.length;
        int i7 = this.f19374b;
        int i8 = length - i7;
        int i9 = length << 1;
        if (i9 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i9];
        System.arraycopy(iArr, i7, iArr2, 0, i8);
        System.arraycopy(this.f19373a, 0, iArr2, i8, this.f19374b);
        this.f19373a = iArr2;
        this.f19374b = 0;
        this.f19375c = length;
        this.f19376d = i9 - 1;
    }

    public boolean d() {
        return this.f19374b == this.f19375c;
    }

    public int e() {
        int i7 = this.f19374b;
        if (i7 == this.f19375c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i8 = this.f19373a[i7];
        this.f19374b = (i7 + 1) & this.f19376d;
        return i8;
    }

    public c(int i7) {
        if (i7 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i7 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i7 = Integer.bitCount(i7) != 1 ? Integer.highestOneBit(i7 - 1) << 1 : i7;
        this.f19376d = i7 - 1;
        this.f19373a = new int[i7];
    }
}
