package w;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f20291c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static Set f20292d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public static final Object f20293e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f20294a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f20295b;

    public static class a {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    public k(Context context) {
        this.f20294a = context;
        this.f20295b = (NotificationManager) context.getSystemService("notification");
    }

    public static k b(Context context) {
        return new k(context);
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(this.f20295b);
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f20294a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f20294a.getApplicationInfo();
        String packageName = this.f20294a.getApplicationContext().getPackageName();
        int i7 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i7), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
