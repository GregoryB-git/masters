package wb;

/* loaded from: classes.dex */
public final class b implements ub.e<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f16480a = new b();

    @Override // ub.e
    public final ub.h getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // ub.e
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
