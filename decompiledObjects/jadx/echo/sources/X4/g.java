package X4;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f7278b = new e(null, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final g f7279a;

    public g(g gVar) {
        this.f7279a = gVar;
    }

    public final g a(int i7, int i8) {
        return new e(this, i7, i8);
    }

    public final g b(int i7, int i8) {
        return new b(this, i7, i8);
    }

    public abstract void c(Y4.a aVar, byte[] bArr);

    public final g d() {
        return this.f7279a;
    }
}
