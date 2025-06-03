package g1;

import android.os.IBinder;
import g1.c;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.l f5781a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c.k f5782b;

    public q(c.k kVar, c.m mVar) {
        this.f5782b = kVar;
        this.f5781a = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder a10 = ((c.m) this.f5781a).a();
        c.C0091c remove = c.this.f5717d.remove(a10);
        if (remove != null) {
            a10.unlinkToDeath(remove, 0);
        }
    }
}
