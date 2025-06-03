package k6;

/* loaded from: classes.dex */
public final class n extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    public final j6.d f9101a;

    public n(j6.d dVar) {
        this.f9101a = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f9101a));
    }
}
