package V2;

import A2.AbstractC0328n;

/* loaded from: classes.dex */
public final class A implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC0659j f6414o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ B f6415p;

    public A(B b7, AbstractC0659j abstractC0659j) {
        this.f6415p = b7;
        this.f6414o = abstractC0659j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC0655f interfaceC0655f;
        InterfaceC0655f interfaceC0655f2;
        obj = this.f6415p.f6417b;
        synchronized (obj) {
            try {
                B b7 = this.f6415p;
                interfaceC0655f = b7.f6418c;
                if (interfaceC0655f != null) {
                    interfaceC0655f2 = b7.f6418c;
                    interfaceC0655f2.d((Exception) AbstractC0328n.i(this.f6414o.i()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
