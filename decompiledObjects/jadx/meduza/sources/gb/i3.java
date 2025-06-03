package gb;

import gb.h3;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h3.b f6527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h3.c f6528b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6529c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h3 f6530d;

    public i3(h3 h3Var, h3.b bVar, h3.c cVar, Executor executor) {
        this.f6530d = h3Var;
        this.f6527a = bVar;
        this.f6528b = cVar;
        this.f6529c = executor;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f6530d) {
            if (this.f6527a.f6463b == 0) {
                try {
                    this.f6528b.b(this.f6529c);
                    this.f6530d.f6459a.remove(this.f6528b);
                    if (this.f6530d.f6459a.isEmpty()) {
                        this.f6530d.f6461c.shutdown();
                        this.f6530d.f6461c = null;
                    }
                } catch (Throwable th) {
                    this.f6530d.f6459a.remove(this.f6528b);
                    if (this.f6530d.f6459a.isEmpty()) {
                        this.f6530d.f6461c.shutdown();
                        this.f6530d.f6461c = null;
                    }
                    throw th;
                }
            }
        }
    }
}
