package V2;

/* loaded from: classes.dex */
public final class w implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ x f6464o;

    public w(x xVar) {
        this.f6464o = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC0653d interfaceC0653d;
        InterfaceC0653d interfaceC0653d2;
        obj = this.f6464o.f6466b;
        synchronized (obj) {
            try {
                x xVar = this.f6464o;
                interfaceC0653d = xVar.f6467c;
                if (interfaceC0653d != null) {
                    interfaceC0653d2 = xVar.f6467c;
                    interfaceC0653d2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
