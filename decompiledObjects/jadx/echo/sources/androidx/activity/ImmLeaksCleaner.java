package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements f {

    /* renamed from: p, reason: collision with root package name */
    public static int f8308p;

    /* renamed from: q, reason: collision with root package name */
    public static Field f8309q;

    /* renamed from: r, reason: collision with root package name */
    public static Field f8310r;

    /* renamed from: s, reason: collision with root package name */
    public static Field f8311s;

    /* renamed from: o, reason: collision with root package name */
    public Activity f8312o;

    public ImmLeaksCleaner(Activity activity) {
        this.f8312o = activity;
    }

    public static void b() {
        try {
            f8308p = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f8310r = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f8311s = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f8309q = declaredField3;
            declaredField3.setAccessible(true);
            f8308p = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.f
    public void a(h hVar, d.b bVar) {
        if (bVar != d.b.ON_DESTROY) {
            return;
        }
        if (f8308p == 0) {
            b();
        }
        if (f8308p == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f8312o.getSystemService("input_method");
            try {
                Object obj = f8309q.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            try {
                                View view = (View) f8310r.get(inputMethodManager);
                                if (view == null) {
                                    return;
                                }
                                if (view.isAttachedToWindow()) {
                                    return;
                                }
                                try {
                                    f8311s.set(inputMethodManager, null);
                                    inputMethodManager.isActive();
                                } catch (IllegalAccessException unused) {
                                }
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
