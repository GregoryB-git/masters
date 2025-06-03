package androidx.lifecycle;

import androidx.lifecycle.d;
import androidx.savedstate.SavedStateRegistry;
import java.util.Iterator;

/* loaded from: classes.dex */
final class SavedStateHandleController implements f {

    /* renamed from: o, reason: collision with root package name */
    public boolean f9675o;

    public static final class a implements SavedStateRegistry.a {
        @Override // androidx.savedstate.SavedStateRegistry.a
        public void a(androidx.savedstate.c cVar) {
            if (!(cVar instanceof u)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
            }
            t d7 = ((u) cVar).d();
            SavedStateRegistry k7 = cVar.k();
            Iterator it = d7.c().iterator();
            while (it.hasNext()) {
                SavedStateHandleController.b(d7.b((String) it.next()), k7, cVar.g());
            }
            if (d7.c().isEmpty()) {
                return;
            }
            k7.e(a.class);
        }
    }

    public static void b(r rVar, SavedStateRegistry savedStateRegistry, d dVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) rVar.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.d()) {
            return;
        }
        savedStateHandleController.c(savedStateRegistry, dVar);
        e(savedStateRegistry, dVar);
    }

    public static void e(final SavedStateRegistry savedStateRegistry, final d dVar) {
        d.c b7 = dVar.b();
        if (b7 == d.c.INITIALIZED || b7.c(d.c.STARTED)) {
            savedStateRegistry.e(a.class);
        } else {
            dVar.a(new f() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // androidx.lifecycle.f
                public void a(h hVar, d.b bVar) {
                    if (bVar == d.b.ON_START) {
                        d.this.c(this);
                        savedStateRegistry.e(a.class);
                    }
                }
            });
        }
    }

    @Override // androidx.lifecycle.f
    public void a(h hVar, d.b bVar) {
        if (bVar == d.b.ON_DESTROY) {
            this.f9675o = false;
            hVar.g().c(this);
        }
    }

    public void c(SavedStateRegistry savedStateRegistry, d dVar) {
        if (this.f9675o) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f9675o = true;
        dVar.a(this);
        throw null;
    }

    public boolean d() {
        return this.f9675o;
    }
}
