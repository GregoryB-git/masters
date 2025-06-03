package b1;

import b1.k;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import s1.c;

/* loaded from: classes.dex */
public final class i {

    public static final class a implements c.a {
        @Override // s1.c.a
        public final void a(s1.e eVar) {
            ec.i.e(eVar, "owner");
            if (!(eVar instanceof t0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
            }
            s0 viewModelStore = ((t0) eVar).getViewModelStore();
            s1.c savedStateRegistry = eVar.getSavedStateRegistry();
            viewModelStore.getClass();
            Iterator it = new HashSet(viewModelStore.f1790a.keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                ec.i.e(str, Constants.KEY);
                o0 o0Var = (o0) viewModelStore.f1790a.get(str);
                ec.i.b(o0Var);
                i.a(o0Var, savedStateRegistry, eVar.getLifecycle());
            }
            if (!new HashSet(viewModelStore.f1790a.keySet()).isEmpty()) {
                savedStateRegistry.d();
            }
        }
    }

    public static final void a(o0 o0Var, s1.c cVar, k kVar) {
        Object obj;
        ec.i.e(cVar, "registry");
        ec.i.e(kVar, "lifecycle");
        HashMap hashMap = o0Var.f1766a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = o0Var.f1766a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        g0 g0Var = (g0) obj;
        if (g0Var == null || g0Var.f1733c) {
            return;
        }
        g0Var.b(kVar, cVar);
        k.b b10 = kVar.b();
        if (b10 != k.b.INITIALIZED) {
            if (!(b10.compareTo(k.b.STARTED) >= 0)) {
                kVar.a(new j(kVar, cVar));
                return;
            }
        }
        cVar.d();
    }
}
