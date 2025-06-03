package B3;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final F f794a;

    /* renamed from: b, reason: collision with root package name */
    public final int f795b;

    /* renamed from: c, reason: collision with root package name */
    public final int f796c;

    public r(F f7, int i7, int i8) {
        this.f794a = (F) E.c(f7, "Null dependency anInterface.");
        this.f795b = i7;
        this.f796c = i8;
    }

    public static r a(Class cls) {
        return new r(cls, 0, 2);
    }

    public static String b(int i7) {
        if (i7 == 0) {
            return "direct";
        }
        if (i7 == 1) {
            return "provider";
        }
        if (i7 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i7);
    }

    public static r h(Class cls) {
        return new r(cls, 0, 0);
    }

    public static r i(Class cls) {
        return new r(cls, 0, 1);
    }

    public static r j(F f7) {
        return new r(f7, 1, 0);
    }

    public static r k(Class cls) {
        return new r(cls, 1, 0);
    }

    public static r l(F f7) {
        return new r(f7, 1, 1);
    }

    public static r m(Class cls) {
        return new r(cls, 1, 1);
    }

    public static r n(Class cls) {
        return new r(cls, 2, 0);
    }

    public F c() {
        return this.f794a;
    }

    public boolean d() {
        return this.f796c == 2;
    }

    public boolean e() {
        return this.f796c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f794a.equals(rVar.f794a) && this.f795b == rVar.f795b && this.f796c == rVar.f796c;
    }

    public boolean f() {
        return this.f795b == 1;
    }

    public boolean g() {
        return this.f795b == 2;
    }

    public int hashCode() {
        return ((((this.f794a.hashCode() ^ 1000003) * 1000003) ^ this.f795b) * 1000003) ^ this.f796c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f794a);
        sb.append(", type=");
        int i7 = this.f795b;
        sb.append(i7 == 1 ? "required" : i7 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(b(this.f796c));
        sb.append("}");
        return sb.toString();
    }

    public r(Class cls, int i7, int i8) {
        this(F.b(cls), i7, i8);
    }
}
