package w6;

/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: w, reason: collision with root package name */
    public static final c f20478w = new c();

    public c() {
        super(l.f20491c, l.f20492d, l.f20493e, l.f20489a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p6.F
    public String toString() {
        return "Dispatchers.Default";
    }
}
