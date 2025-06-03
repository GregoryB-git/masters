package hb;

import gb.h;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.a f7263a;

    public f(h.a aVar) {
        this.f7263a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h.a aVar = this.f7263a;
        long j10 = aVar.f6453a;
        long max = Math.max(2 * j10, j10);
        if (gb.h.this.f6452b.compareAndSet(aVar.f6453a, max)) {
            gb.h.f6450c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{gb.h.this.f6451a, Long.valueOf(max)});
        }
    }
}
