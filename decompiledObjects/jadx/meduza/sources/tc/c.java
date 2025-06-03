package tc;

/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: d, reason: collision with root package name */
    public static final c f14762d = new c();

    public c() {
        super(j.f14770c, j.f14771d, j.f14772e, j.f14768a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // nc.a0
    public final String toString() {
        return "Dispatchers.Default";
    }
}
