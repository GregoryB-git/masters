package gb;

import gb.d0;

/* loaded from: classes.dex */
public final class e0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eb.e1 f6298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eb.s0 f6299b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0.i f6300c;

    public e0(d0.i iVar, eb.e1 e1Var, eb.s0 s0Var) {
        this.f6300c = iVar;
        this.f6298a = e1Var;
        this.f6299b = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6300c.f6244a.a(this.f6299b, this.f6298a);
    }
}
