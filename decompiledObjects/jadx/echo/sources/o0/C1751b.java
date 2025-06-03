package o0;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1751b {

    /* renamed from: a, reason: collision with root package name */
    public final String f18078a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18079b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18080c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18081d;

    public C1751b(String str, String str2, int i7, int i8) {
        this.f18078a = str;
        this.f18079b = str2;
        this.f18080c = i7;
        this.f18081d = i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1751b)) {
            return false;
        }
        C1751b c1751b = (C1751b) obj;
        return this.f18080c == c1751b.f18080c && this.f18081d == c1751b.f18081d && W2.k.a(this.f18078a, c1751b.f18078a) && W2.k.a(this.f18079b, c1751b.f18079b);
    }

    public int hashCode() {
        return W2.k.b(this.f18078a, this.f18079b, Integer.valueOf(this.f18080c), Integer.valueOf(this.f18081d));
    }
}
