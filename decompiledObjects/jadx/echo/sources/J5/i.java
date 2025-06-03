package J5;

import A5.a;
import J5.p;
import V2.AbstractC0659j;
import V2.C0660k;
import V2.InterfaceC0654e;
import android.content.Context;
import android.os.Looper;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s3.C1947e;
import s3.m;

/* loaded from: classes.dex */
public class i implements A5.a, p.b, p.a {

    /* renamed from: a, reason: collision with root package name */
    public Context f3069a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3070b = false;

    public static /* synthetic */ void q(String str, C0660k c0660k) {
        try {
            try {
                C1947e.p(str).j();
            } catch (IllegalStateException unused) {
            }
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public static /* synthetic */ void u(p.f fVar, AbstractC0659j abstractC0659j) {
        if (abstractC0659j.n()) {
            fVar.a(abstractC0659j.j());
        } else {
            fVar.b(abstractC0659j.i());
        }
    }

    public static /* synthetic */ void w(String str, Boolean bool, C0660k c0660k) {
        try {
            C1947e.p(str).F(bool);
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public static /* synthetic */ void x(String str, Boolean bool, C0660k c0660k) {
        try {
            C1947e.p(str).E(bool.booleanValue());
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    @Override // J5.p.b
    public void a(p.f fVar) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: J5.d
            @Override // java.lang.Runnable
            public final void run() {
                i.this.t(c0660k);
            }
        });
        y(c0660k, fVar);
    }

    @Override // J5.p.a
    public void b(final String str, final Boolean bool, p.f fVar) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: J5.e
            @Override // java.lang.Runnable
            public final void run() {
                i.x(str, bool, c0660k);
            }
        });
        y(c0660k, fVar);
    }

    @Override // J5.p.b
    public void c(p.f fVar) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: J5.b
            @Override // java.lang.Runnable
            public final void run() {
                i.this.v(c0660k);
            }
        });
        y(c0660k, fVar);
    }

    @Override // J5.p.a
    public void d(final String str, p.f fVar) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: J5.a
            @Override // java.lang.Runnable
            public final void run() {
                i.q(str, c0660k);
            }
        });
        y(c0660k, fVar);
    }

    @Override // J5.p.b
    public void e(final String str, final p.d dVar, p.f fVar) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: J5.f
            @Override // java.lang.Runnable
            public final void run() {
                i.this.s(dVar, str, c0660k);
            }
        });
        y(c0660k, fVar);
    }

    @Override // J5.p.a
    public void f(final String str, final Boolean bool, p.f fVar) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: J5.c
            @Override // java.lang.Runnable
            public final void run() {
                i.w(str, bool, c0660k);
            }
        });
        y(c0660k, fVar);
    }

    public final AbstractC0659j o(final C1947e c1947e) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: J5.h
            @Override // java.lang.Runnable
            public final void run() {
                i.this.r(c1947e, c0660k);
            }
        });
        return c0660k.a();
    }

    @Override // A5.a
    public void onAttachedToEngine(a.b bVar) {
        t.e(bVar.b(), this);
        o.e(bVar.b(), this);
        this.f3069a = bVar.a();
    }

    @Override // A5.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f3069a = null;
        t.e(bVar.b(), null);
        o.e(bVar.b(), null);
    }

    public final p.d p(s3.m mVar) {
        p.d.a aVar = new p.d.a();
        aVar.b(mVar.b());
        aVar.c(mVar.c());
        if (mVar.f() != null) {
            aVar.e(mVar.f());
        }
        if (mVar.g() != null) {
            aVar.f(mVar.g());
        }
        aVar.d(mVar.d());
        aVar.g(mVar.h());
        aVar.h(mVar.e());
        return aVar.a();
    }

    public final /* synthetic */ void r(C1947e c1947e, C0660k c0660k) {
        try {
            p.e.a aVar = new p.e.a();
            aVar.c(c1947e.q());
            aVar.d(p(c1947e.r()));
            aVar.b(Boolean.valueOf(c1947e.x()));
            aVar.e((Map) V2.m.a(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(c1947e)));
            c0660k.c(aVar.a());
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void s(p.d dVar, String str, C0660k c0660k) {
        try {
            s3.m a7 = new m.b().b(dVar.b()).c(dVar.c()).d(dVar.d()).f(dVar.e()).g(dVar.f()).h(dVar.g()).e(dVar.h()).a();
            try {
                Looper.prepare();
            } catch (Exception unused) {
            }
            c0660k.c((p.e) V2.m.a(o(C1947e.w(this.f3069a, a7, str))));
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void t(C0660k c0660k) {
        try {
            if (this.f3070b) {
                V2.m.a(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
            } else {
                this.f3070b = true;
            }
            List n7 = C1947e.n(this.f3069a);
            ArrayList arrayList = new ArrayList(n7.size());
            Iterator it = n7.iterator();
            while (it.hasNext()) {
                arrayList.add((p.e) V2.m.a(o((C1947e) it.next())));
            }
            c0660k.c(arrayList);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void v(C0660k c0660k) {
        try {
            s3.m a7 = s3.m.a(this.f3069a);
            if (a7 == null) {
                c0660k.c(null);
            } else {
                c0660k.c(p(a7));
            }
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final void y(C0660k c0660k, final p.f fVar) {
        c0660k.a().b(new InterfaceC0654e() { // from class: J5.g
            @Override // V2.InterfaceC0654e
            public final void a(AbstractC0659j abstractC0659j) {
                i.u(p.f.this, abstractC0659j);
            }
        });
    }
}
