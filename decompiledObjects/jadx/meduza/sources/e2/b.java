package e2;

import ec.i;
import ec.j;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
public final class b extends j implements dc.a<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f3875a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(0);
        this.f3875a = cVar;
    }

    @Override // dc.a
    public final Boolean invoke() {
        Class<?> loadClass = this.f3875a.f3876a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
        i.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
        boolean z10 = false;
        Method declaredMethod = loadClass.getDeclaredMethod("getWindowExtensions", new Class[0]);
        Class<?> loadClass2 = this.f3875a.f3876a.loadClass("androidx.window.extensions.WindowExtensions");
        i.d(loadClass2, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
        i.d(declaredMethod, "getWindowExtensionsMethod");
        if (declaredMethod.getReturnType().equals(loadClass2) && Modifier.isPublic(declaredMethod.getModifiers())) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
