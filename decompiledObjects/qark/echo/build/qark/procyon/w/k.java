// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w;

import java.lang.reflect.Method;
import android.content.pm.ApplicationInfo;
import java.lang.reflect.InvocationTargetException;
import android.app.AppOpsManager;
import android.os.Build$VERSION;
import java.util.HashSet;
import android.app.NotificationManager;
import android.content.Context;
import java.util.Set;

public final class k
{
    public static final Object c;
    public static Set d;
    public static final Object e;
    public final Context a;
    public final NotificationManager b;
    
    static {
        c = new Object();
        k.d = new HashSet();
        e = new Object();
    }
    
    public k(final Context a) {
        this.a = a;
        this.b = (NotificationManager)a.getSystemService("notification");
    }
    
    public static k b(final Context context) {
        return new k(context);
    }
    
    public boolean a() {
        if (Build$VERSION.SDK_INT >= 24) {
            return k.a.a(this.b);
        }
        final AppOpsManager obj = (AppOpsManager)this.a.getSystemService("appops");
        final ApplicationInfo applicationInfo = this.a.getApplicationInfo();
        final String packageName = this.a.getApplicationContext().getPackageName();
        final int uid = applicationInfo.uid;
        try {
            final Class<?> forName = Class.forName(AppOpsManager.class.getName());
            final Class<Integer> type = Integer.TYPE;
            final Method method = forName.getMethod("checkOpNoThrow", type, type, String.class);
            final Integer n = (Integer)forName.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            n;
            return (int)method.invoke(obj, n, uid, packageName) == 0;
        }
        catch (ClassNotFoundException | NoSuchMethodException | NoSuchFieldException | InvocationTargetException | IllegalAccessException | RuntimeException ex) {
            return true;
        }
    }
    
    public abstract static class a
    {
        public static boolean a(final NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
        
        public static int b(final NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }
}
