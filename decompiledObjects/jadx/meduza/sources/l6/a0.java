package l6;

/* loaded from: classes.dex */
public final class a0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9629a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f9630b;

    public a0(d0 d0Var, int i10) {
        this.f9630b = d0Var;
        this.f9629a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9630b.f(this.f9629a);
    }
}
