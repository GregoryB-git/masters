package gb;

import gb.d;
import hb.h;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d.a f6204b;

    public c(d.a aVar, int i10) {
        this.f6204b = aVar;
        this.f6203a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            pb.b.c();
            try {
                pb.a aVar = pb.b.f13110a;
                aVar.getClass();
                this.f6204b.f6216a.f(this.f6203a);
                aVar.getClass();
            } catch (Throwable th) {
                try {
                    pb.b.f13110a.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            ((h.b) this.f6204b).e(th3);
        }
    }
}
