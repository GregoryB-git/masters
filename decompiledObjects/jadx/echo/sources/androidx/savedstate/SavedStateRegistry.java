package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import androidx.savedstate.Recreator;
import java.util.Map;
import n.b;

/* loaded from: classes.dex */
public final class SavedStateRegistry {

    /* renamed from: b, reason: collision with root package name */
    public Bundle f9926b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9927c;

    /* renamed from: d, reason: collision with root package name */
    public Recreator.a f9928d;

    /* renamed from: a, reason: collision with root package name */
    public n.b f9925a = new n.b();

    /* renamed from: e, reason: collision with root package name */
    public boolean f9929e = true;

    public interface a {
        void a(c cVar);
    }

    public interface b {
        Bundle a();
    }

    public Bundle a(String str) {
        if (!this.f9927c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f9926b;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        this.f9926b.remove(str);
        if (this.f9926b.isEmpty()) {
            this.f9926b = null;
        }
        return bundle2;
    }

    public void b(androidx.lifecycle.d dVar, Bundle bundle) {
        if (this.f9927c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            this.f9926b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        dVar.a(new f() { // from class: androidx.savedstate.SavedStateRegistry.1
            @Override // androidx.lifecycle.f
            public void a(h hVar, d.b bVar) {
                SavedStateRegistry savedStateRegistry;
                boolean z7;
                if (bVar == d.b.ON_START) {
                    savedStateRegistry = SavedStateRegistry.this;
                    z7 = true;
                } else {
                    if (bVar != d.b.ON_STOP) {
                        return;
                    }
                    savedStateRegistry = SavedStateRegistry.this;
                    z7 = false;
                }
                savedStateRegistry.f9929e = z7;
            }
        });
        this.f9927c = true;
    }

    public void c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f9926b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        b.d f7 = this.f9925a.f();
        while (f7.hasNext()) {
            Map.Entry entry = (Map.Entry) f7.next();
            bundle2.putBundle((String) entry.getKey(), ((b) entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void d(String str, b bVar) {
        if (((b) this.f9925a.k(str, bVar)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void e(Class cls) {
        if (!this.f9929e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f9928d == null) {
            this.f9928d = new Recreator.a(this);
        }
        try {
            cls.getDeclaredConstructor(new Class[0]);
            this.f9928d.b(cls.getName());
        } catch (NoSuchMethodException e7) {
            throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
        }
    }
}
