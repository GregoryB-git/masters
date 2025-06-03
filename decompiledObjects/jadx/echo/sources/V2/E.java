package V2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class E implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC0659j f6424o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ F f6425p;

    public E(F f7, AbstractC0659j abstractC0659j) {
        this.f6425p = f7;
        this.f6424o = abstractC0659j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0658i interfaceC0658i;
        try {
            interfaceC0658i = this.f6425p.f6427b;
            AbstractC0659j a7 = interfaceC0658i.a(this.f6424o.j());
            if (a7 == null) {
                this.f6425p.d(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = AbstractC0661l.f6443b;
            a7.e(executor, this.f6425p);
            a7.d(executor, this.f6425p);
            a7.a(executor, this.f6425p);
        } catch (C0657h e7) {
            if (e7.getCause() instanceof Exception) {
                this.f6425p.d((Exception) e7.getCause());
            } else {
                this.f6425p.d(e7);
            }
        } catch (CancellationException unused) {
            this.f6425p.b();
        } catch (Exception e8) {
            this.f6425p.d(e8);
        }
    }
}
