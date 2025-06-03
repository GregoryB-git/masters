package b1;

import android.os.Bundle;
import b1.e0;
import b1.k;
import b1.q0;
import c1.a;
import s1.c;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1734a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final c f1735b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final a f1736c = new a();

    public static final class a {
    }

    public static final class b {
    }

    public static final class c {
    }

    public static final class d implements q0.b {
        @Override // b1.q0.b
        public final o0 a(Class cls) {
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        @Override // b1.q0.b
        public final o0 b(Class cls, c1.b bVar) {
            return new j0();
        }
    }

    public static final e0 a(c1.b bVar) {
        s1.e eVar = (s1.e) bVar.f2211a.get(f1734a);
        if (eVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        t0 t0Var = (t0) bVar.f2211a.get(f1735b);
        if (t0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) bVar.f2211a.get(f1736c);
        String str = (String) bVar.f2211a.get(r0.f1787a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        c.b b10 = eVar.getSavedStateRegistry().b();
        i0 i0Var = b10 instanceof i0 ? (i0) b10 : null;
        if (i0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        j0 c10 = c(t0Var);
        e0 e0Var = (e0) c10.f1744d.get(str);
        if (e0Var != null) {
            return e0Var;
        }
        Class<? extends Object>[] clsArr = e0.f;
        i0Var.b();
        Bundle bundle2 = i0Var.f1739c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = i0Var.f1739c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = i0Var.f1739c;
        if (bundle5 != null && bundle5.isEmpty()) {
            i0Var.f1739c = null;
        }
        e0 a10 = e0.a.a(bundle3, bundle);
        c10.f1744d.put(str, a10);
        return a10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends s1.e & t0> void b(T t) {
        ec.i.e(t, "<this>");
        k.b b10 = t.getLifecycle().b();
        if (!(b10 == k.b.INITIALIZED || b10 == k.b.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t.getSavedStateRegistry().b() == null) {
            i0 i0Var = new i0(t.getSavedStateRegistry(), t);
            t.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", i0Var);
            t.getLifecycle().a(new f0(i0Var));
        }
    }

    public static final j0 c(t0 t0Var) {
        ec.i.e(t0Var, "<this>");
        return (j0) new q0(t0Var.getViewModelStore(), new d(), t0Var instanceof h ? ((h) t0Var).getDefaultViewModelCreationExtras() : a.C0033a.f2212b).b(j0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
