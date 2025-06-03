package v5;

import A5.a;
import E5.m;
import E5.n;
import E5.o;
import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import t5.AbstractC1995b;
import u5.InterfaceC2017d;

/* renamed from: v5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2063b implements A5.b, B5.b {

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.embedding.engine.a f20176b;

    /* renamed from: c, reason: collision with root package name */
    public final a.b f20177c;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC2017d f20179e;

    /* renamed from: f, reason: collision with root package name */
    public c f20180f;

    /* renamed from: i, reason: collision with root package name */
    public Service f20183i;

    /* renamed from: k, reason: collision with root package name */
    public BroadcastReceiver f20185k;

    /* renamed from: m, reason: collision with root package name */
    public ContentProvider f20187m;

    /* renamed from: a, reason: collision with root package name */
    public final Map f20175a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Map f20178d = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public boolean f20181g = false;

    /* renamed from: h, reason: collision with root package name */
    public final Map f20182h = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final Map f20184j = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final Map f20186l = new HashMap();

    /* renamed from: v5.b$b, reason: collision with other inner class name */
    public static class C0282b implements a.InterfaceC0005a {

        /* renamed from: a, reason: collision with root package name */
        public final y5.f f20188a;

        public C0282b(y5.f fVar) {
            this.f20188a = fVar;
        }
    }

    /* renamed from: v5.b$c */
    public static class c implements B5.c {

        /* renamed from: a, reason: collision with root package name */
        public final Activity f20189a;

        /* renamed from: b, reason: collision with root package name */
        public final HiddenLifecycleReference f20190b;

        /* renamed from: c, reason: collision with root package name */
        public final Set f20191c = new HashSet();

        /* renamed from: d, reason: collision with root package name */
        public final Set f20192d = new HashSet();

        /* renamed from: e, reason: collision with root package name */
        public final Set f20193e = new HashSet();

        /* renamed from: f, reason: collision with root package name */
        public final Set f20194f = new HashSet();

        /* renamed from: g, reason: collision with root package name */
        public final Set f20195g = new HashSet();

        /* renamed from: h, reason: collision with root package name */
        public final Set f20196h = new HashSet();

        public c(Activity activity, androidx.lifecycle.d dVar) {
            this.f20189a = activity;
            this.f20190b = new HiddenLifecycleReference(dVar);
        }

        public boolean a(int i7, int i8, Intent intent) {
            Iterator it = new HashSet(this.f20192d).iterator();
            while (true) {
                boolean z7 = false;
                while (it.hasNext()) {
                    if (((m) it.next()).a(i7, i8, intent) || z7) {
                        z7 = true;
                    }
                }
                return z7;
            }
        }

        public void b(Intent intent) {
            Iterator it = this.f20193e.iterator();
            while (it.hasNext()) {
                ((n) it.next()).onNewIntent(intent);
            }
        }

        @Override // B5.c
        public Activity c() {
            return this.f20189a;
        }

        @Override // B5.c
        public void d(m mVar) {
            this.f20192d.remove(mVar);
        }

        @Override // B5.c
        public void e(o oVar) {
            this.f20191c.add(oVar);
        }

        @Override // B5.c
        public void f(o oVar) {
            this.f20191c.remove(oVar);
        }

        @Override // B5.c
        public void g(n nVar) {
            this.f20193e.add(nVar);
        }

        @Override // B5.c
        public void h(m mVar) {
            this.f20192d.add(mVar);
        }

        @Override // B5.c
        public void i(n nVar) {
            this.f20193e.remove(nVar);
        }

        public boolean j(int i7, String[] strArr, int[] iArr) {
            Iterator it = this.f20191c.iterator();
            while (true) {
                boolean z7 = false;
                while (it.hasNext()) {
                    if (((o) it.next()).b(i7, strArr, iArr) || z7) {
                        z7 = true;
                    }
                }
                return z7;
            }
        }

        public void k(Bundle bundle) {
            Iterator it = this.f20196h.iterator();
            if (it.hasNext()) {
                android.support.v4.media.a.a(it.next());
                throw null;
            }
        }

        public void l(Bundle bundle) {
            Iterator it = this.f20196h.iterator();
            if (it.hasNext()) {
                android.support.v4.media.a.a(it.next());
                throw null;
            }
        }

        public void m() {
            Iterator it = this.f20194f.iterator();
            if (it.hasNext()) {
                android.support.v4.media.a.a(it.next());
                throw null;
            }
        }
    }

    public C2063b(Context context, io.flutter.embedding.engine.a aVar, y5.f fVar, io.flutter.embedding.engine.b bVar) {
        this.f20176b = aVar;
        this.f20177c = new a.b(context, aVar, aVar.k(), aVar.t(), aVar.q().M(), new C0282b(fVar), bVar);
    }

    @Override // B5.b
    public boolean a(int i7, int i8, Intent intent) {
        if (!r()) {
            AbstractC1995b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
        T5.f i9 = T5.f.i("FlutterEngineConnectionRegistry#onActivityResult");
        try {
            boolean a7 = this.f20180f.a(i7, i8, intent);
            if (i9 != null) {
                i9.close();
            }
            return a7;
        } catch (Throwable th) {
            if (i9 != null) {
                try {
                    i9.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // B5.b
    public boolean b(int i7, String[] strArr, int[] iArr) {
        if (!r()) {
            AbstractC1995b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
        T5.f i8 = T5.f.i("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
        try {
            boolean j7 = this.f20180f.j(i7, strArr, iArr);
            if (i8 != null) {
                i8.close();
            }
            return j7;
        } catch (Throwable th) {
            if (i8 != null) {
                try {
                    i8.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // A5.b
    public void c(A5.a aVar) {
        T5.f i7 = T5.f.i("FlutterEngineConnectionRegistry#add " + aVar.getClass().getSimpleName());
        try {
            if (q(aVar.getClass())) {
                AbstractC1995b.g("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + this.f20176b + ").");
                if (i7 != null) {
                    i7.close();
                    return;
                }
                return;
            }
            AbstractC1995b.f("FlutterEngineCxnRegstry", "Adding plugin: " + aVar);
            this.f20175a.put(aVar.getClass(), aVar);
            aVar.onAttachedToEngine(this.f20177c);
            if (aVar instanceof B5.a) {
                B5.a aVar2 = (B5.a) aVar;
                this.f20178d.put(aVar.getClass(), aVar2);
                if (r()) {
                    aVar2.onAttachedToActivity(this.f20180f);
                }
            }
            if (i7 != null) {
                i7.close();
            }
        } catch (Throwable th) {
            if (i7 != null) {
                try {
                    i7.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // B5.b
    public void d() {
        if (!r()) {
            AbstractC1995b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        T5.f i7 = T5.f.i("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
        try {
            this.f20181g = true;
            Iterator it = this.f20178d.values().iterator();
            while (it.hasNext()) {
                ((B5.a) it.next()).onDetachedFromActivityForConfigChanges();
            }
            l();
            if (i7 != null) {
                i7.close();
            }
        } catch (Throwable th) {
            if (i7 != null) {
                try {
                    i7.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // B5.b
    public void e(Bundle bundle) {
        if (!r()) {
            AbstractC1995b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            return;
        }
        T5.f i7 = T5.f.i("FlutterEngineConnectionRegistry#onRestoreInstanceState");
        try {
            this.f20180f.k(bundle);
            if (i7 != null) {
                i7.close();
            }
        } catch (Throwable th) {
            if (i7 != null) {
                try {
                    i7.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // B5.b
    public void f() {
        if (!r()) {
            AbstractC1995b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        T5.f i7 = T5.f.i("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = this.f20178d.values().iterator();
            while (it.hasNext()) {
                ((B5.a) it.next()).onDetachedFromActivity();
            }
            l();
            if (i7 != null) {
                i7.close();
            }
        } catch (Throwable th) {
            if (i7 != null) {
                try {
                    i7.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // B5.b
    public void g(Bundle bundle) {
        if (!r()) {
            AbstractC1995b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            return;
        }
        T5.f i7 = T5.f.i("FlutterEngineConnectionRegistry#onSaveInstanceState");
        try {
            this.f20180f.l(bundle);
            if (i7 != null) {
                i7.close();
            }
        } catch (Throwable th) {
            if (i7 != null) {
                try {
                    i7.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // B5.b
    public void h() {
        if (!r()) {
            AbstractC1995b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
            return;
        }
        T5.f i7 = T5.f.i("FlutterEngineConnectionRegistry#onUserLeaveHint");
        try {
            this.f20180f.m();
            if (i7 != null) {
                i7.close();
            }
        } catch (Throwable th) {
            if (i7 != null) {
                try {
                    i7.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // B5.b
    public void i(InterfaceC2017d interfaceC2017d, androidx.lifecycle.d dVar) {
        T5.f i7 = T5.f.i("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            InterfaceC2017d interfaceC2017d2 = this.f20179e;
            if (interfaceC2017d2 != null) {
                interfaceC2017d2.d();
            }
            m();
            this.f20179e = interfaceC2017d;
            j((Activity) interfaceC2017d.e(), dVar);
            if (i7 != null) {
                i7.close();
            }
        } catch (Throwable th) {
            if (i7 != null) {
                try {
                    i7.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final void j(Activity activity, androidx.lifecycle.d dVar) {
        this.f20180f = new c(activity, dVar);
        this.f20176b.q().f0(activity.getIntent() != null ? activity.getIntent().getBooleanExtra("enable-software-rendering", false) : false);
        this.f20176b.q().u(activity, this.f20176b.t(), this.f20176b.k());
        for (B5.a aVar : this.f20178d.values()) {
            if (this.f20181g) {
                aVar.onReattachedToActivityForConfigChanges(this.f20180f);
            } else {
                aVar.onAttachedToActivity(this.f20180f);
            }
        }
        this.f20181g = false;
    }

    public void k() {
        AbstractC1995b.f("FlutterEngineCxnRegstry", "Destroying.");
        m();
        x();
    }

    public final void l() {
        this.f20176b.q().E();
        this.f20179e = null;
        this.f20180f = null;
    }

    public final void m() {
        if (r()) {
            f();
            return;
        }
        if (u()) {
            p();
        } else if (s()) {
            n();
        } else if (t()) {
            o();
        }
    }

    public void n() {
        if (!s()) {
            AbstractC1995b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
            return;
        }
        T5.f i7 = T5.f.i("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
        try {
            Iterator it = this.f20184j.values().iterator();
            if (it.hasNext()) {
                android.support.v4.media.a.a(it.next());
                throw null;
            }
            if (i7 != null) {
                i7.close();
            }
        } catch (Throwable th) {
            if (i7 != null) {
                try {
                    i7.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void o() {
        if (!t()) {
            AbstractC1995b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
            return;
        }
        T5.f i7 = T5.f.i("FlutterEngineConnectionRegistry#detachFromContentProvider");
        try {
            Iterator it = this.f20186l.values().iterator();
            if (it.hasNext()) {
                android.support.v4.media.a.a(it.next());
                throw null;
            }
            if (i7 != null) {
                i7.close();
            }
        } catch (Throwable th) {
            if (i7 != null) {
                try {
                    i7.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // B5.b
    public void onNewIntent(Intent intent) {
        if (!r()) {
            AbstractC1995b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            return;
        }
        T5.f i7 = T5.f.i("FlutterEngineConnectionRegistry#onNewIntent");
        try {
            this.f20180f.b(intent);
            if (i7 != null) {
                i7.close();
            }
        } catch (Throwable th) {
            if (i7 != null) {
                try {
                    i7.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void p() {
        if (!u()) {
            AbstractC1995b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
            return;
        }
        T5.f i7 = T5.f.i("FlutterEngineConnectionRegistry#detachFromService");
        try {
            Iterator it = this.f20182h.values().iterator();
            if (it.hasNext()) {
                android.support.v4.media.a.a(it.next());
                throw null;
            }
            this.f20183i = null;
            if (i7 != null) {
                i7.close();
            }
        } catch (Throwable th) {
            if (i7 != null) {
                try {
                    i7.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean q(Class cls) {
        return this.f20175a.containsKey(cls);
    }

    public final boolean r() {
        return this.f20179e != null;
    }

    public final boolean s() {
        return this.f20185k != null;
    }

    public final boolean t() {
        return this.f20187m != null;
    }

    public final boolean u() {
        return this.f20183i != null;
    }

    public void v(Class cls) {
        A5.a aVar = (A5.a) this.f20175a.get(cls);
        if (aVar == null) {
            return;
        }
        T5.f i7 = T5.f.i("FlutterEngineConnectionRegistry#remove " + cls.getSimpleName());
        try {
            if (aVar instanceof B5.a) {
                if (r()) {
                    ((B5.a) aVar).onDetachedFromActivity();
                }
                this.f20178d.remove(cls);
            }
            aVar.onDetachedFromEngine(this.f20177c);
            this.f20175a.remove(cls);
            if (i7 != null) {
                i7.close();
            }
        } catch (Throwable th) {
            if (i7 != null) {
                try {
                    i7.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void w(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            v((Class) it.next());
        }
    }

    public void x() {
        w(new HashSet(this.f20175a.keySet()));
        this.f20175a.clear();
    }
}
