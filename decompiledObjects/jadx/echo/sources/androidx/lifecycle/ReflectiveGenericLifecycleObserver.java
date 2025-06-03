package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.d;

/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements f {

    /* renamed from: o, reason: collision with root package name */
    public final Object f9673o;

    /* renamed from: p, reason: collision with root package name */
    public final a.C0161a f9674p;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f9673o = obj;
        this.f9674p = a.f9678c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.f
    public void a(h hVar, d.b bVar) {
        this.f9674p.a(hVar, bVar, this.f9673o);
    }
}
