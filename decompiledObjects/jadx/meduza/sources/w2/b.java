package w2;

import b.a0;
import p2.q0;
import p2.r;
import t2.h;
import x2.s;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f16189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.foreground.a f16190b;

    public b(androidx.work.impl.foreground.a aVar, String str) {
        this.f16190b = aVar;
        this.f16189a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar;
        r rVar = this.f16190b.f1530a.f;
        String str = this.f16189a;
        synchronized (rVar.f12953k) {
            q0 c10 = rVar.c(str);
            sVar = c10 != null ? c10.f12923c : null;
        }
        if (sVar == null || !sVar.b()) {
            return;
        }
        synchronized (this.f16190b.f1532c) {
            this.f16190b.f.put(a0.s(sVar), sVar);
            androidx.work.impl.foreground.a aVar = this.f16190b;
            this.f16190b.f1535o.put(a0.s(sVar), h.a(aVar.f1536p, sVar, aVar.f1531b.a(), this.f16190b));
        }
    }
}
