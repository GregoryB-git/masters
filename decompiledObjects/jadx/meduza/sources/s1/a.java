package s1;

import android.os.Bundle;
import b1.k;
import b1.m;
import b1.o;
import defpackage.f;
import defpackage.g;
import ec.i;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import s1.c;

/* loaded from: classes.dex */
public final class a implements m {

    /* renamed from: a, reason: collision with root package name */
    public final e f14138a;

    /* renamed from: s1.a$a, reason: collision with other inner class name */
    public static final class C0217a implements c.b {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashSet f14139a;

        public C0217a(c cVar) {
            i.e(cVar, "registry");
            this.f14139a = new LinkedHashSet();
            cVar.c("androidx.savedstate.Restarter", this);
        }

        @Override // s1.c.b
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f14139a));
            return bundle;
        }
    }

    public a(e eVar) {
        i.e(eVar, "owner");
        this.f14138a = eVar;
    }

    @Override // b1.m
    public final void a(o oVar, k.a aVar) {
        if (aVar != k.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        oVar.getLifecycle().c(this);
        Bundle a10 = this.f14138a.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (a10 == null) {
            return;
        }
        ArrayList<String> stringArrayList = a10.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> asSubclass = Class.forName(str, false, a.class.getClassLoader()).asSubclass(c.a.class);
                i.d(asSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object newInstance = declaredConstructor.newInstance(new Object[0]);
                        i.d(newInstance, "{\n                constr…wInstance()\n            }");
                        ((c.a) newInstance).a(this.f14138a);
                    } catch (Exception e10) {
                        throw new RuntimeException(g.d("Failed to instantiate ", str), e10);
                    }
                } catch (NoSuchMethodException e11) {
                    StringBuilder l10 = f.l("Class ");
                    l10.append(asSubclass.getSimpleName());
                    l10.append(" must have default constructor in order to be automatically recreated");
                    throw new IllegalStateException(l10.toString(), e11);
                }
            } catch (ClassNotFoundException e12) {
                throw new RuntimeException(g.e("Class ", str, " wasn't found"), e12);
            }
        }
    }
}
