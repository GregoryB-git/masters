package i2;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
public final class g extends ec.j implements dc.a<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f7373a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(0);
        this.f7373a = hVar;
    }

    @Override // dc.a
    public final Boolean invoke() {
        Class<?> loadClass = this.f7373a.f7376c.f3876a.loadClass("androidx.window.extensions.WindowExtensions");
        ec.i.d(loadClass, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
        boolean z10 = false;
        Method method = loadClass.getMethod("getWindowLayoutComponent", new Class[0]);
        Class<?> loadClass2 = this.f7373a.f7374a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        ec.i.d(loadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
        ec.i.d(method, "getWindowLayoutComponentMethod");
        if (Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(loadClass2)) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
