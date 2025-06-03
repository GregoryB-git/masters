/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.AppOpsManager
 *  android.content.Context
 *  android.os.Binder
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package w;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import androidx.annotation.NonNull;

public abstract class c {
    public static int a(Context context, int n8, String string2, String string3) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager appOpsManager = b.c(context);
            int n9 = b.a(appOpsManager, string2, Binder.getCallingUid(), string3);
            if (n9 != 0) {
                return n9;
            }
            return b.a(appOpsManager, string2, n8, b.b(context));
        }
        return c.b(context, string2, string3);
    }

    public static int b(Context context, String string2, String string3) {
        return a.c(a.a(context, AppOpsManager.class), string2, string3);
    }

    public static String c(String string2) {
        return a.d(string2);
    }

    public static abstract class a {
        public static <T> T a(Context context, Class<T> class_) {
            return (T)context.getSystemService(class_);
        }

        public static int b(AppOpsManager appOpsManager, String string2, String string3) {
            return appOpsManager.noteProxyOp(string2, string3);
        }

        public static int c(AppOpsManager appOpsManager, String string2, String string3) {
            return appOpsManager.noteProxyOpNoThrow(string2, string3);
        }

        public static String d(String string2) {
            return AppOpsManager.permissionToOp((String)string2);
        }
    }

    public static abstract class b {
        public static int a(AppOpsManager appOpsManager, @NonNull String string2, int n8, @NonNull String string3) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(string2, n8, string3);
        }

        @NonNull
        public static String b(@NonNull Context context) {
            return context.getOpPackageName();
        }

        public static AppOpsManager c(@NonNull Context context) {
            return (AppOpsManager)context.getSystemService(AppOpsManager.class);
        }
    }

}

