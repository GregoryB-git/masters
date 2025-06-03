package g9;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import g9.f;
import i9.e;
import i9.k1;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import n9.a;
import v3.x0;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final h f6087a;

    /* renamed from: b, reason: collision with root package name */
    public final e9.a f6088b;

    /* renamed from: c, reason: collision with root package name */
    public final e9.a f6089c;

    /* renamed from: d, reason: collision with root package name */
    public final n9.a f6090d;

    /* renamed from: e, reason: collision with root package name */
    public final f9.g f6091e;
    public e9.a f;

    /* renamed from: g, reason: collision with root package name */
    public i9.n f6092g;

    /* renamed from: h, reason: collision with root package name */
    public m9.h0 f6093h;

    /* renamed from: i, reason: collision with root package name */
    public j0 f6094i;

    /* renamed from: j, reason: collision with root package name */
    public k f6095j;

    /* renamed from: k, reason: collision with root package name */
    public e.a f6096k;

    /* renamed from: l, reason: collision with root package name */
    public k1 f6097l;

    public u(Context context, h hVar, e9.a aVar, e9.a aVar2, n9.a aVar3, m9.z zVar, f fVar) {
        this.f6087a = hVar;
        this.f6088b = aVar;
        this.f6089c = aVar2;
        this.f6090d = aVar3;
        this.f6091e = new f9.g(new m9.e0(hVar.f5964a));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        aVar3.a(new p(this, taskCompletionSource, context, fVar, zVar));
        aVar.z(new q(this, atomicBoolean, taskCompletionSource, aVar3));
        aVar2.z(new e0.d(26));
    }

    public final void a(Context context, e9.e eVar, f fVar, m9.z zVar) {
        p2.m0.y(1, "FirestoreClient", "Initializing. user=%s", eVar.f4854a);
        n9.a aVar = this.f6090d;
        h hVar = this.f6087a;
        e9.a aVar2 = this.f6088b;
        e9.a aVar3 = this.f6089c;
        f.a aVar4 = new f.a(context, aVar, hVar, eVar, aVar2, aVar3, zVar);
        m9.c0 c0Var = fVar.f5932b;
        c0Var.getClass();
        c0Var.f10757b = new m9.e0(hVar.f5964a);
        c0Var.f10756a = new m9.y(aVar, context, hVar, new m9.n(aVar2, aVar3));
        j9.f fVar2 = hVar.f5964a;
        m9.y yVar = c0Var.f10756a;
        x6.b.a0(yVar, "grpcCallProvider not initialized yet", new Object[0]);
        c0Var.f10758c = new m9.v(aVar, aVar2, aVar3, fVar2, zVar, yVar);
        m9.e0 e0Var = c0Var.f10757b;
        x6.b.a0(e0Var, "remoteSerializer not initialized yet", new Object[0]);
        m9.v vVar = c0Var.f10758c;
        x6.b.a0(vVar, "firestoreChannel not initialized yet", new Object[0]);
        c0Var.f10759d = new m9.j(aVar, e0Var, vVar);
        c0Var.f10760e = new m9.d(context);
        e9.a e10 = fVar.e(aVar4);
        fVar.f5933c = e10;
        e10.B();
        fVar.f5934d = fVar.d(aVar4);
        fVar.f = fVar.f(aVar4);
        fVar.f5935e = fVar.g(aVar4);
        fVar.f5936g = fVar.a();
        i9.n nVar = fVar.f5934d;
        nVar.f7743a.o().run();
        nVar.f7743a.y("Start IndexManager", new b.d(nVar, 16));
        nVar.f7743a.y("Start MutationQueue", new b.m(nVar, 15));
        fVar.f.b();
        fVar.f5938i = fVar.b(aVar4);
        fVar.f5937h = fVar.c(aVar4);
        e9.a aVar5 = fVar.f5933c;
        x6.b.a0(aVar5, "persistence not initialized yet", new Object[0]);
        this.f = aVar5;
        this.f6097l = fVar.f5938i;
        this.f6092g = fVar.h();
        m9.h0 h0Var = fVar.f;
        x6.b.a0(h0Var, "remoteStore not initialized yet", new Object[0]);
        this.f6093h = h0Var;
        this.f6094i = fVar.i();
        k kVar = fVar.f5936g;
        x6.b.a0(kVar, "eventManager not initialized yet", new Object[0]);
        this.f6095j = kVar;
        i9.e eVar2 = fVar.f5937h;
        k1 k1Var = this.f6097l;
        if (k1Var != null) {
            k1Var.start();
        }
        if (eVar2 != null) {
            e.a aVar6 = eVar2.f7665a;
            this.f6096k = aVar6;
            aVar6.start();
        }
    }

    public final void b(final boolean z10) {
        d();
        this.f6090d.a(new Runnable() { // from class: g9.o
            @Override // java.lang.Runnable
            public final void run() {
                u.this.f6092g.f7748g.f7661d = z10;
            }
        });
    }

    public final Task<Void> c() {
        boolean z10;
        Task<Void> a10;
        this.f6088b.w();
        this.f6089c.w();
        n9.a aVar = this.f6090d;
        b.k kVar = new b.k(this, 12);
        a.b bVar = aVar.f11322a;
        synchronized (bVar) {
            synchronized (bVar) {
                z10 = bVar.f11329b;
            }
            return a10;
        }
        if (z10) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setResult(null);
            a10 = taskCompletionSource.getTask();
        } else {
            a10 = bVar.a(new m9.w(kVar, 1));
            bVar.f11329b = true;
        }
        return a10;
    }

    public final void d() {
        boolean z10;
        a.b bVar = this.f6090d.f11322a;
        synchronized (bVar) {
            z10 = bVar.f11329b;
        }
        if (z10) {
            throw new IllegalStateException("The client has already been terminated");
        }
    }

    public final Task<Void> e(List<k9.f> list) {
        d();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f6090d.a(new x0(this, list, taskCompletionSource, 6));
        return taskCompletionSource.getTask();
    }
}
