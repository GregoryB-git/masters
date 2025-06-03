package g0;

/* renamed from: g0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1295A {

    /* renamed from: c, reason: collision with root package name */
    public static final C1295A f14244c = new C1295A(-1, -1);

    /* renamed from: d, reason: collision with root package name */
    public static final C1295A f14245d = new C1295A(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f14246a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14247b;

    public C1295A(int i7, int i8) {
        AbstractC1297a.a((i7 == -1 || i7 >= 0) && (i8 == -1 || i8 >= 0));
        this.f14246a = i7;
        this.f14247b = i8;
    }

    public int a() {
        return this.f14247b;
    }

    public int b() {
        return this.f14246a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1295A)) {
            return false;
        }
        C1295A c1295a = (C1295A) obj;
        return this.f14246a == c1295a.f14246a && this.f14247b == c1295a.f14247b;
    }

    public int hashCode() {
        int i7 = this.f14247b;
        int i8 = this.f14246a;
        return i7 ^ ((i8 >>> 16) | (i8 << 16));
    }

    public String toString() {
        return this.f14246a + "x" + this.f14247b;
    }
}
