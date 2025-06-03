package V2;

/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC0659j f6454o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ t f6455p;

    public s(t tVar, AbstractC0659j abstractC0659j) {
        this.f6455p = tVar;
        this.f6454o = abstractC0659j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K k7;
        K k8;
        K k9;
        InterfaceC0651b interfaceC0651b;
        K k10;
        K k11;
        if (this.f6454o.l()) {
            k11 = this.f6455p.f6458c;
            k11.s();
            return;
        }
        try {
            interfaceC0651b = this.f6455p.f6457b;
            Object a7 = interfaceC0651b.a(this.f6454o);
            k10 = this.f6455p.f6458c;
            k10.r(a7);
        } catch (C0657h e7) {
            if (e7.getCause() instanceof Exception) {
                k9 = this.f6455p.f6458c;
                k9.q((Exception) e7.getCause());
            } else {
                k8 = this.f6455p.f6458c;
                k8.q(e7);
            }
        } catch (Exception e8) {
            k7 = this.f6455p.f6458c;
            k7.q(e8);
        }
    }
}
