package i2;

import android.graphics.Rect;
import ec.t;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p2.m0;

/* loaded from: classes.dex */
public final class d extends ec.j implements dc.a<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f7370a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar) {
        super(0);
        this.f7370a = hVar;
    }

    @Override // dc.a
    public final Boolean invoke() {
        Class<?> loadClass = this.f7370a.f7374a.loadClass("androidx.window.extensions.layout.FoldingFeature");
        ec.i.d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
        boolean z10 = false;
        Method method = loadClass.getMethod("getBounds", new Class[0]);
        Method method2 = loadClass.getMethod("getType", new Class[0]);
        Method method3 = loadClass.getMethod("getState", new Class[0]);
        ec.i.d(method, "getBoundsMethod");
        if (m0.z(method, t.a(Rect.class)) && Modifier.isPublic(method.getModifiers())) {
            ec.i.d(method2, "getTypeMethod");
            Class cls = Integer.TYPE;
            if (m0.z(method2, t.a(cls)) && Modifier.isPublic(method2.getModifiers())) {
                ec.i.d(method3, "getStateMethod");
                if (m0.z(method3, t.a(cls)) && Modifier.isPublic(method3.getModifiers())) {
                    z10 = true;
                }
            }
        }
        return Boolean.valueOf(z10);
    }
}
