package b;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import b1.k;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class o implements b1.m {

    /* renamed from: b, reason: collision with root package name */
    public static int f1625b;

    /* renamed from: c, reason: collision with root package name */
    public static Field f1626c;

    /* renamed from: d, reason: collision with root package name */
    public static Field f1627d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f1628e;

    /* renamed from: a, reason: collision with root package name */
    public Activity f1629a;

    public o(Activity activity) {
        this.f1629a = activity;
    }

    @Override // b1.m
    public final void a(b1.o oVar, k.a aVar) {
        if (aVar != k.a.ON_DESTROY) {
            return;
        }
        if (f1625b == 0) {
            try {
                f1625b = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f1627d = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f1628e = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f1626c = declaredField3;
                declaredField3.setAccessible(true);
                f1625b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f1625b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f1629a.getSystemService("input_method");
            try {
                Object obj = f1626c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f1627d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f1628e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        } catch (IllegalAccessException unused4) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
