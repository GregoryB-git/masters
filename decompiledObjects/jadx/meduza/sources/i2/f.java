package i2;

import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
public final class f extends ec.j implements dc.a<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f7372a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar) {
        super(0);
        this.f7372a = hVar;
    }

    @Override // dc.a
    public final Boolean invoke() {
        Class<?> loadClass = this.f7372a.f7374a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        ec.i.d(loadClass, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
        boolean z10 = false;
        Method method = loadClass.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
        Method method2 = loadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
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
