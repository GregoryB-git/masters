package y2;

import x2.C2190d;

/* loaded from: classes.dex */
public final class g extends UnsupportedOperationException {

    /* renamed from: o, reason: collision with root package name */
    public final C2190d f21431o;

    public g(C2190d c2190d) {
        this.f21431o = c2190d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f21431o));
    }
}
