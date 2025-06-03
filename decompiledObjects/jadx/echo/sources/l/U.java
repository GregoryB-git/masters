package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class U extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f16394c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static ArrayList f16395d;

    /* renamed from: a, reason: collision with root package name */
    public final Resources f16396a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f16397b;

    public U(Context context) {
        super(context);
        if (!c0.b()) {
            this.f16396a = new W(this, context.getResources());
            this.f16397b = null;
            return;
        }
        c0 c0Var = new c0(this, context.getResources());
        this.f16396a = c0Var;
        Resources.Theme newTheme = c0Var.newTheme();
        this.f16397b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    public static boolean a(Context context) {
        if ((context instanceof U) || (context.getResources() instanceof W) || (context.getResources() instanceof c0)) {
            return false;
        }
        return c0.b();
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f16394c) {
            try {
                ArrayList arrayList = f16395d;
                if (arrayList == null) {
                    f16395d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f16395d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f16395d.remove(size);
                        }
                    }
                    for (int size2 = f16395d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f16395d.get(size2);
                        U u7 = weakReference2 != null ? (U) weakReference2.get() : null;
                        if (u7 != null && u7.getBaseContext() == context) {
                            return u7;
                        }
                    }
                }
                U u8 = new U(context);
                f16395d.add(new WeakReference(u8));
                return u8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f16396a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f16396a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f16397b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i7) {
        Resources.Theme theme = this.f16397b;
        if (theme == null) {
            super.setTheme(i7);
        } else {
            theme.applyStyle(i7, true);
        }
    }
}
