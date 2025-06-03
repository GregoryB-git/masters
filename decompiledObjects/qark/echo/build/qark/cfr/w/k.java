/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.AppOpsManager
 *  android.app.NotificationManager
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.Integer
 *  java.lang.NoSuchFieldException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.reflect.Field
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.HashSet
 *  java.util.Set
 */
package w;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public final class k {
    public static final Object c = new Object();
    public static Set d = new HashSet();
    public static final Object e = new Object();
    public final Context a;
    public final NotificationManager b;

    public k(Context context) {
        this.a = context;
        this.b = (NotificationManager)context.getSystemService("notification");
    }

    public static k b(Context context) {
        return new k(context);
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(this.b);
        }
        AppOpsManager appOpsManager = (AppOpsManager)this.a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.a.getApplicationInfo();
        String string2 = this.a.getApplicationContext().getPackageName();
        int n8 = applicationInfo.uid;
        try {
            applicationInfo = Class.forName((String)AppOpsManager.class.getName());
            Class class_ = Integer.TYPE;
            class_ = applicationInfo.getMethod("checkOpNoThrow", new Class[]{class_, class_, String.class});
            applicationInfo = (Integer)applicationInfo.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            applicationInfo.intValue();
            n8 = (Integer)class_.invoke((Object)appOpsManager, new Object[]{applicationInfo, n8, string2});
            if (n8 == 0) {
                return true;
            }
            return false;
        }
        catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException classNotFoundException) {
            return true;
        }
    }

    public static abstract class a {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

}

