package V2;

/* loaded from: classes.dex */
public final class y implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC0659j f6468o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ z f6469p;

    public y(z zVar, AbstractC0659j abstractC0659j) {
        this.f6469p = zVar;
        this.f6468o = abstractC0659j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC0654e interfaceC0654e;
        InterfaceC0654e interfaceC0654e2;
        obj = this.f6469p.f6471b;
        synchronized (obj) {
            try {
                z zVar = this.f6469p;
                interfaceC0654e = zVar.f6472c;
                if (interfaceC0654e != null) {
                    interfaceC0654e2 = zVar.f6472c;
                    interfaceC0654e2.a(this.f6468o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
