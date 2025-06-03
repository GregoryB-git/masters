package x0;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import b1.k;

/* loaded from: classes.dex */
public final class o0 implements b1.h, s1.e, b1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final i f16721a;

    /* renamed from: b, reason: collision with root package name */
    public final b1.s0 f16722b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f16723c;

    /* renamed from: d, reason: collision with root package name */
    public b1.p f16724d = null;

    /* renamed from: e, reason: collision with root package name */
    public s1.d f16725e = null;

    public o0(i iVar, b1.s0 s0Var, u.a aVar) {
        this.f16721a = iVar;
        this.f16722b = s0Var;
        this.f16723c = aVar;
    }

    public final void a(k.a aVar) {
        this.f16724d.f(aVar);
    }

    public final void b() {
        if (this.f16724d == null) {
            this.f16724d = new b1.p(this);
            s1.d dVar = new s1.d(this);
            this.f16725e = dVar;
            dVar.a();
            this.f16723c.run();
        }
    }

    @Override // b1.h
    public final c1.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f16721a.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        c1.b bVar = new c1.b();
        if (application != null) {
            bVar.f2211a.put(b1.p0.f1779a, application);
        }
        bVar.f2211a.put(b1.h0.f1734a, this.f16721a);
        bVar.f2211a.put(b1.h0.f1735b, this);
        if (this.f16721a.getArguments() != null) {
            bVar.f2211a.put(b1.h0.f1736c, this.f16721a.getArguments());
        }
        return bVar;
    }

    @Override // b1.o
    public final b1.k getLifecycle() {
        b();
        return this.f16724d;
    }

    @Override // s1.e
    public final s1.c getSavedStateRegistry() {
        b();
        return this.f16725e.f14147b;
    }

    @Override // b1.t0
    public final b1.s0 getViewModelStore() {
        b();
        return this.f16722b;
    }
}
