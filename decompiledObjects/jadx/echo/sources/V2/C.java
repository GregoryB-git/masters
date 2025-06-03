package V2;

/* loaded from: classes.dex */
public final class C implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC0659j f6419o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D f6420p;

    public C(D d7, AbstractC0659j abstractC0659j) {
        this.f6420p = d7;
        this.f6419o = abstractC0659j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC0656g interfaceC0656g;
        InterfaceC0656g interfaceC0656g2;
        obj = this.f6420p.f6422b;
        synchronized (obj) {
            try {
                D d7 = this.f6420p;
                interfaceC0656g = d7.f6423c;
                if (interfaceC0656g != null) {
                    interfaceC0656g2 = d7.f6423c;
                    interfaceC0656g2.a(this.f6419o.j());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
