package Q4;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import s3.C1947e;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final Set f4450a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.e f4451b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.c f4452c;

    /* renamed from: d, reason: collision with root package name */
    public final C1947e f4453d;

    /* renamed from: e, reason: collision with root package name */
    public final s4.i f4454e;

    /* renamed from: f, reason: collision with root package name */
    public final e f4455f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f4456g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4457h;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.d f4458i;

    /* renamed from: j, reason: collision with root package name */
    public final ScheduledExecutorService f4459j;

    public class a implements P4.d {

        /* renamed from: a, reason: collision with root package name */
        public final P4.c f4460a;

        public a(P4.c cVar) {
            this.f4460a = cVar;
        }

        @Override // P4.d
        public void remove() {
            m.this.d(this.f4460a);
        }
    }

    public m(C1947e c1947e, s4.i iVar, com.google.firebase.remoteconfig.internal.c cVar, e eVar, Context context, String str, com.google.firebase.remoteconfig.internal.d dVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f4450a = linkedHashSet;
        this.f4451b = new com.google.firebase.remoteconfig.internal.e(c1947e, iVar, cVar, eVar, context, str, linkedHashSet, dVar, scheduledExecutorService);
        this.f4453d = c1947e;
        this.f4452c = cVar;
        this.f4454e = iVar;
        this.f4455f = eVar;
        this.f4456g = context;
        this.f4457h = str;
        this.f4458i = dVar;
        this.f4459j = scheduledExecutorService;
    }

    public synchronized P4.d b(P4.c cVar) {
        this.f4450a.add(cVar);
        c();
        return new a(cVar);
    }

    public final synchronized void c() {
        if (!this.f4450a.isEmpty()) {
            this.f4451b.C();
        }
    }

    public final synchronized void d(P4.c cVar) {
        this.f4450a.remove(cVar);
    }

    public synchronized void e(boolean z7) {
        this.f4451b.z(z7);
        if (!z7) {
            c();
        }
    }
}
