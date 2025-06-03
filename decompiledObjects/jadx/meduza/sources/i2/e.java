package i2;

import android.app.Activity;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
public final class e extends ec.j implements dc.a<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f7371a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar) {
        super(0);
        this.f7371a = hVar;
    }

    @Override // dc.a
    public final Boolean invoke() {
        Class<?> cls;
        f2.b bVar = this.f7371a.f7375b;
        bVar.getClass();
        try {
            cls = bVar.b();
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return Boolean.FALSE;
        }
        Class<?> loadClass = this.f7371a.f7374a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        ec.i.d(loadClass, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
        boolean z10 = false;
        Method method = loadClass.getMethod("addWindowLayoutInfoListener", Activity.class, cls);
        Method method2 = loadClass.getMethod("removeWindowLayoutInfoListener", cls);
        ec.i.d(method, "addListenerMethod");
        if (Modifier.isPublic(method.getModifiers())) {
            ec.i.d(method2, "removeListenerMethod");
            if (Modifier.isPublic(method2.getModifiers())) {
                z10 = true;
            }
        }
        return Boolean.valueOf(z10);
    }
}
