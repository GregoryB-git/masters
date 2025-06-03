package e2;

import ec.i;
import ec.j;

/* loaded from: classes.dex */
public final class a extends j implements dc.a<Class<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f3874a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(0);
        this.f3874a = cVar;
    }

    @Override // dc.a
    public final Class<?> invoke() {
        Class<?> loadClass = this.f3874a.f3876a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
        i.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
        return loadClass;
    }
}
