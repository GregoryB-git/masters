package eb;

/* loaded from: classes.dex */
public final class g1 extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final e1 f5110a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5111b;

    public g1(e1 e1Var) {
        super(e1.b(e1Var), e1Var.f5083c);
        this.f5110a = e1Var;
        this.f5111b = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.f5111b ? super.fillInStackTrace() : this;
    }
}
