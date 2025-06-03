package gb;

/* loaded from: classes.dex */
public final class c0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StringBuilder f6205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f6206b;

    public c0(d0 d0Var, StringBuilder sb2) {
        this.f6206b = d0Var;
        this.f6205a = sb2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6206b.g(eb.e1.f5072h.g(this.f6205a.toString()), true);
    }
}
