package z2;

/* loaded from: classes.dex */
public final class K implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ T2.l f21665o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ M f21666p;

    public K(M m7, T2.l lVar) {
        this.f21666p = m7;
        this.f21665o = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        M.b1(this.f21666p, this.f21665o);
    }
}
