package u6;

/* renamed from: u6.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2039i extends RuntimeException {

    /* renamed from: o, reason: collision with root package name */
    public final transient X5.g f19980o;

    public C2039i(X5.g gVar) {
        this.f19980o = gVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f19980o.toString();
    }
}
