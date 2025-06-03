package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.savedstate.SavedStateRegistry;

/* loaded from: classes.dex */
public class z implements androidx.savedstate.c {

    /* renamed from: o, reason: collision with root package name */
    public androidx.lifecycle.i f9648o = null;

    /* renamed from: p, reason: collision with root package name */
    public androidx.savedstate.b f9649p = null;

    public void a(d.b bVar) {
        this.f9648o.h(bVar);
    }

    public void b() {
        if (this.f9648o == null) {
            this.f9648o = new androidx.lifecycle.i(this);
            this.f9649p = androidx.savedstate.b.a(this);
        }
    }

    public boolean c() {
        return this.f9648o != null;
    }

    public void d(Bundle bundle) {
        this.f9649p.c(bundle);
    }

    public void e(Bundle bundle) {
        this.f9649p.d(bundle);
    }

    public void f(d.c cVar) {
        this.f9648o.o(cVar);
    }

    @Override // androidx.lifecycle.h
    public androidx.lifecycle.d g() {
        b();
        return this.f9648o;
    }

    @Override // androidx.savedstate.c
    public SavedStateRegistry k() {
        return this.f9649p.b();
    }
}
