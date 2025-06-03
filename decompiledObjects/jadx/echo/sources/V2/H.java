package V2;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6429a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public Queue f6430b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6431c;

    public final void a(G g7) {
        synchronized (this.f6429a) {
            try {
                if (this.f6430b == null) {
                    this.f6430b = new ArrayDeque();
                }
                this.f6430b.add(g7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(AbstractC0659j abstractC0659j) {
        G g7;
        synchronized (this.f6429a) {
            if (this.f6430b != null && !this.f6431c) {
                this.f6431c = true;
                while (true) {
                    synchronized (this.f6429a) {
                        try {
                            g7 = (G) this.f6430b.poll();
                            if (g7 == null) {
                                this.f6431c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    g7.c(abstractC0659j);
                }
            }
        }
    }
}
