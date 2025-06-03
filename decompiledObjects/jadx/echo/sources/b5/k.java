package b5;

/* loaded from: classes.dex */
public class k {

    /* renamed from: i, reason: collision with root package name */
    public static final k[] f9995i;

    /* renamed from: j, reason: collision with root package name */
    public static k[] f9996j;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9997a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9998b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9999c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10000d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10001e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10002f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10003g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10004h;

    static {
        k[] kVarArr = {new k(false, 3, 5, 8, 8, 1), new k(false, 5, 7, 10, 10, 1), new k(true, 5, 7, 16, 6, 1), new k(false, 8, 10, 12, 12, 1), new k(true, 10, 11, 14, 6, 2), new k(false, 12, 12, 14, 14, 1), new k(true, 16, 14, 24, 10, 1), new k(false, 18, 14, 16, 16, 1), new k(false, 22, 18, 18, 18, 1), new k(true, 22, 18, 16, 10, 2), new k(false, 30, 20, 20, 20, 1), new k(true, 32, 24, 16, 14, 2), new k(false, 36, 24, 22, 22, 1), new k(false, 44, 28, 24, 24, 1), new k(true, 49, 28, 22, 14, 2), new k(false, 62, 36, 14, 14, 4), new k(false, 86, 42, 16, 16, 4), new k(false, 114, 48, 18, 18, 4), new k(false, 144, 56, 20, 20, 4), new k(false, 174, 68, 22, 22, 4), new k(false, 204, 84, 24, 24, 4, 102, 42), new k(false, 280, 112, 14, 14, 16, 140, 56), new k(false, 368, 144, 16, 16, 16, 92, 36), new k(false, 456, 192, 18, 18, 16, 114, 48), new k(false, 576, 224, 20, 20, 16, 144, 56), new k(false, 696, 272, 22, 22, 16, 174, 68), new k(false, 816, 336, 24, 24, 16, 136, 56), new k(false, 1050, 408, 18, 18, 36, 175, 68), new k(false, 1304, 496, 20, 20, 36, 163, 62), new d()};
        f9995i = kVarArr;
        f9996j = kVarArr;
    }

    public k(boolean z7, int i7, int i8, int i9, int i10, int i11) {
        this(z7, i7, i8, i9, i10, i11, i7, i8);
    }

    public static k l(int i7, l lVar, V4.b bVar, V4.b bVar2, boolean z7) {
        for (k kVar : f9996j) {
            if (!(lVar == l.FORCE_SQUARE && kVar.f9997a) && ((lVar != l.FORCE_RECTANGLE || kVar.f9997a) && i7 <= kVar.f9998b)) {
                return kVar;
            }
        }
        if (z7) {
            throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i7)));
        }
        return null;
    }

    public final int a() {
        return this.f9998b;
    }

    public int b(int i7) {
        return this.f10003g;
    }

    public final int c() {
        return this.f9999c;
    }

    public final int d(int i7) {
        return this.f10004h;
    }

    public final int e() {
        int i7 = this.f10002f;
        int i8 = 1;
        if (i7 != 1) {
            i8 = 2;
            if (i7 != 2 && i7 != 4) {
                if (i7 == 16) {
                    return 4;
                }
                if (i7 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i8;
    }

    public int f() {
        return this.f9998b / this.f10003g;
    }

    public final int g() {
        return k() * this.f10001e;
    }

    public final int h() {
        return e() * this.f10000d;
    }

    public final int i() {
        return g() + (k() << 1);
    }

    public final int j() {
        return h() + (e() << 1);
    }

    public final int k() {
        int i7 = this.f10002f;
        if (i7 == 1 || i7 == 2) {
            return 1;
        }
        if (i7 == 4) {
            return 2;
        }
        if (i7 == 16) {
            return 4;
        }
        if (i7 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9997a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.f10000d);
        sb.append('x');
        sb.append(this.f10001e);
        sb.append(", symbol size ");
        sb.append(j());
        sb.append('x');
        sb.append(i());
        sb.append(", symbol data size ");
        sb.append(h());
        sb.append('x');
        sb.append(g());
        sb.append(", codewords ");
        sb.append(this.f9998b);
        sb.append('+');
        sb.append(this.f9999c);
        return sb.toString();
    }

    public k(boolean z7, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f9997a = z7;
        this.f9998b = i7;
        this.f9999c = i8;
        this.f10000d = i9;
        this.f10001e = i10;
        this.f10002f = i11;
        this.f10003g = i12;
        this.f10004h = i13;
    }
}
