package l;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static Method f9340a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f9341b;

    static {
        f9341b = Build.VERSION.SDK_INT >= 27;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f9340a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f9340a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static boolean a(View view) {
        WeakHashMap<View, e0.o0> weakHashMap = e0.d0.f3766a;
        return view.getLayoutDirection() == 1;
    }
}
