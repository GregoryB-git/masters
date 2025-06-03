package V2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC0659j f6459o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f6460p;

    public u(v vVar, AbstractC0659j abstractC0659j) {
        this.f6460p = vVar;
        this.f6459o = abstractC0659j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K k7;
        K k8;
        K k9;
        InterfaceC0651b interfaceC0651b;
        try {
            interfaceC0651b = this.f6460p.f6462b;
            AbstractC0659j abstractC0659j = (AbstractC0659j) interfaceC0651b.a(this.f6459o);
            if (abstractC0659j == null) {
                this.f6460p.d(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = AbstractC0661l.f6443b;
            abstractC0659j.e(executor, this.f6460p);
            abstractC0659j.d(executor, this.f6460p);
            abstractC0659j.a(executor, this.f6460p);
        } catch (C0657h e7) {
            if (e7.getCause() instanceof Exception) {
                k9 = this.f6460p.f6463c;
                k9.q((Exception) e7.getCause());
            } else {
                k8 = this.f6460p.f6463c;
                k8.q(e7);
            }
        } catch (Exception e8) {
            k7 = this.f6460p.f6463c;
            k7.q(e8);
        }
    }
}
