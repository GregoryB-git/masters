package Z4;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final a f7860h = new a(4201, 4096, 1);

    /* renamed from: i, reason: collision with root package name */
    public static final a f7861i = new a(1033, 1024, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final a f7862j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f7863k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f7864l;

    /* renamed from: m, reason: collision with root package name */
    public static final a f7865m;

    /* renamed from: n, reason: collision with root package name */
    public static final a f7866n;

    /* renamed from: o, reason: collision with root package name */
    public static final a f7867o;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f7868a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f7869b;

    /* renamed from: c, reason: collision with root package name */
    public final b f7870c;

    /* renamed from: d, reason: collision with root package name */
    public final b f7871d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7872e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7873f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7874g;

    static {
        a aVar = new a(67, 64, 1);
        f7862j = aVar;
        f7863k = new a(19, 16, 1);
        f7864l = new a(285, 256, 0);
        a aVar2 = new a(301, 256, 1);
        f7865m = aVar2;
        f7866n = aVar2;
        f7867o = aVar;
    }

    public a(int i7, int i8, int i9) {
        this.f7873f = i7;
        this.f7872e = i8;
        this.f7874g = i9;
        this.f7868a = new int[i8];
        this.f7869b = new int[i8];
        int i10 = 1;
        for (int i11 = 0; i11 < i8; i11++) {
            this.f7868a[i11] = i10;
            i10 <<= 1;
            if (i10 >= i8) {
                i10 = (i10 ^ i7) & (i8 - 1);
            }
        }
        for (int i12 = 0; i12 < i8 - 1; i12++) {
            this.f7869b[this.f7868a[i12]] = i12;
        }
        this.f7870c = new b(this, new int[]{0});
        this.f7871d = new b(this, new int[]{1});
    }

    public static int a(int i7, int i8) {
        return i7 ^ i8;
    }

    public b b(int i7, int i8) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        if (i8 == 0) {
            return this.f7870c;
        }
        int[] iArr = new int[i7 + 1];
        iArr[0] = i8;
        return new b(this, iArr);
    }

    public int c(int i7) {
        return this.f7868a[i7];
    }

    public int d() {
        return this.f7874g;
    }

    public b e() {
        return this.f7870c;
    }

    public int f(int i7) {
        if (i7 != 0) {
            return this.f7868a[(this.f7872e - this.f7869b[i7]) - 1];
        }
        throw new ArithmeticException();
    }

    public int g(int i7) {
        if (i7 != 0) {
            return this.f7869b[i7];
        }
        throw new IllegalArgumentException();
    }

    public int h(int i7, int i8) {
        if (i7 == 0 || i8 == 0) {
            return 0;
        }
        int[] iArr = this.f7868a;
        int[] iArr2 = this.f7869b;
        return iArr[(iArr2[i7] + iArr2[i8]) % (this.f7872e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f7873f) + ',' + this.f7872e + ')';
    }
}
