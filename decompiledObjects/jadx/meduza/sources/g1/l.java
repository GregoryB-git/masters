package g1;

import g1.c;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.l f5761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c.k f5762b;

    public l(c.k kVar, c.m mVar) {
        this.f5762b = kVar;
        this.f5761a = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c.C0091c remove = c.this.f5717d.remove(((c.m) this.f5761a).a());
        if (remove != null) {
            ((c.m) remove.f5728d).a().unlinkToDeath(remove, 0);
        }
    }
}
