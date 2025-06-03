package e8;

import e8.g;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import m8.g0;
import t9.a;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements g.c, a.InterfaceC0234a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f4814a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4815b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4816c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4817d;

    public /* synthetic */ b(Object obj, Object obj2, long j10, Object obj3) {
        this.f4815b = obj;
        this.f4816c = obj2;
        this.f4814a = j10;
        this.f4817d = obj3;
    }

    @Override // e8.g.c
    public final ScheduledFuture b(g.a aVar) {
        f fVar = (f) this.f4815b;
        Runnable runnable = (Runnable) this.f4816c;
        return fVar.f4832b.schedule(new x0.d(fVar, runnable, aVar, 4), this.f4814a, (TimeUnit) this.f4817d);
    }

    @Override // t9.a.InterfaceC0234a
    public final void h(t9.b bVar) {
        ((g8.a) bVar.get()).c((String) this.f4815b, (String) this.f4816c, this.f4814a, (g0) this.f4817d);
    }
}
