package s1;

import android.os.Bundle;
import b1.k;
import b1.m;
import b1.o;
import defpackage.f;
import ec.i;
import java.util.Map;
import n.b;
import s1.c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final e f14146a;

    /* renamed from: b, reason: collision with root package name */
    public final c f14147b = new c();

    /* renamed from: c, reason: collision with root package name */
    public boolean f14148c;

    public d(e eVar) {
        this.f14146a = eVar;
    }

    public final void a() {
        k lifecycle = this.f14146a.getLifecycle();
        if (!(lifecycle.b() == k.b.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.a(new a(this.f14146a));
        final c cVar = this.f14147b;
        cVar.getClass();
        if (!(!cVar.f14142b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.a(new m() { // from class: s1.b
            @Override // b1.m
            public final void a(o oVar, k.a aVar) {
                boolean z10;
                c cVar2 = c.this;
                i.e(cVar2, "this$0");
                if (aVar == k.a.ON_START) {
                    z10 = true;
                } else if (aVar != k.a.ON_STOP) {
                    return;
                } else {
                    z10 = false;
                }
                cVar2.f = z10;
            }
        });
        cVar.f14142b = true;
        this.f14148c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f14148c) {
            a();
        }
        k lifecycle = this.f14146a.getLifecycle();
        if (!(!(lifecycle.b().compareTo(k.b.STARTED) >= 0))) {
            StringBuilder l10 = f.l("performRestore cannot be called when owner is ");
            l10.append(lifecycle.b());
            throw new IllegalStateException(l10.toString().toString());
        }
        c cVar = this.f14147b;
        if (!cVar.f14142b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!cVar.f14144d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        cVar.f14143c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        cVar.f14144d = true;
    }

    public final void c(Bundle bundle) {
        i.e(bundle, "outBundle");
        c cVar = this.f14147b;
        cVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = cVar.f14143c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        n.b<String, c.b> bVar = cVar.f14141a;
        bVar.getClass();
        b.d dVar = new b.d();
        bVar.f11166c.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((c.b) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
