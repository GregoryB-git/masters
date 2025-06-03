package G2;

import E2.l;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f2077a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f2078b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        boolean isInstantApp;
        Boolean bool2;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f2077a;
            if (context2 != null && (bool2 = f2078b) != null && context2 == applicationContext) {
                return bool2.booleanValue();
            }
            f2078b = null;
            if (!l.h()) {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f2078b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    bool = Boolean.FALSE;
                }
                f2077a = applicationContext;
                return f2078b.booleanValue();
            }
            isInstantApp = applicationContext.getPackageManager().isInstantApp();
            bool = Boolean.valueOf(isInstantApp);
            f2078b = bool;
            f2077a = applicationContext;
            return f2078b.booleanValue();
        }
    }
}
