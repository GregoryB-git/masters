package e0;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f3806a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<o> f3807b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3808c = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final b1.k f3809a;

        /* renamed from: b, reason: collision with root package name */
        public b1.m f3810b;

        public a(b1.k kVar, b1.m mVar) {
            this.f3809a = kVar;
            this.f3810b = mVar;
            kVar.a(mVar);
        }
    }

    public m(Runnable runnable) {
        this.f3806a = runnable;
    }

    public final void a(o oVar) {
        this.f3807b.remove(oVar);
        a aVar = (a) this.f3808c.remove(oVar);
        if (aVar != null) {
            aVar.f3809a.c(aVar.f3810b);
            aVar.f3810b = null;
        }
        this.f3806a.run();
    }
}
