package u;

import u.f;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f.a f14788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14789b;

    public c(f.a aVar, Object obj) {
        this.f14788a = aVar;
        this.f14789b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14788a.f14800a = this.f14789b;
    }
}
