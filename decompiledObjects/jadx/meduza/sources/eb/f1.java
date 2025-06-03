package eb;

/* loaded from: classes.dex */
public final class f1 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final e1 f5105a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5106b;

    public f1(e1 e1Var) {
        super(e1.b(e1Var), e1Var.f5083c);
        this.f5105a = e1Var;
        this.f5106b = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.f5106b ? super.fillInStackTrace() : this;
    }
}
