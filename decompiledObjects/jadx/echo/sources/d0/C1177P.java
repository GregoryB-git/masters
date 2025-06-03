package d0;

/* renamed from: d0.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1177P {

    /* renamed from: e, reason: collision with root package name */
    public static final C1177P f12555e = new C1177P(0, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final String f12556f = g0.M.w0(0);

    /* renamed from: g, reason: collision with root package name */
    public static final String f12557g = g0.M.w0(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f12558h = g0.M.w0(2);

    /* renamed from: i, reason: collision with root package name */
    public static final String f12559i = g0.M.w0(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f12560a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12561b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12562c;

    /* renamed from: d, reason: collision with root package name */
    public final float f12563d;

    public C1177P(int i7, int i8) {
        this(i7, i8, 0, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1177P)) {
            return false;
        }
        C1177P c1177p = (C1177P) obj;
        return this.f12560a == c1177p.f12560a && this.f12561b == c1177p.f12561b && this.f12562c == c1177p.f12562c && this.f12563d == c1177p.f12563d;
    }

    public int hashCode() {
        return ((((((217 + this.f12560a) * 31) + this.f12561b) * 31) + this.f12562c) * 31) + Float.floatToRawIntBits(this.f12563d);
    }

    public C1177P(int i7, int i8, int i9, float f7) {
        this.f12560a = i7;
        this.f12561b = i8;
        this.f12562c = i9;
        this.f12563d = f7;
    }
}
