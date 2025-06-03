package tc;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import nc.b1;

/* loaded from: classes.dex */
public class f extends b1 {

    /* renamed from: c, reason: collision with root package name */
    public a f14764c;

    public f(int i10, int i11, long j10, String str) {
        this.f14764c = new a(i10, i11, j10, str);
    }

    @Override // nc.a0
    public final void A0(ub.h hVar, Runnable runnable) {
        a aVar = this.f14764c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.f14742p;
        aVar.g(runnable, j.f14773g, true);
    }

    @Override // nc.a0
    public final void z0(ub.h hVar, Runnable runnable) {
        a aVar = this.f14764c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.f14742p;
        aVar.g(runnable, j.f14773g, false);
    }
}
