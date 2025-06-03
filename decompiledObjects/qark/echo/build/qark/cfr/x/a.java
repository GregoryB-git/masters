/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Process
 *  android.text.TextUtils
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.Executor
 */
package x;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.Executor;
import w.k;

public abstract class a {
    public static final Object a = new Object();
    public static final Object b = new Object();

    public static int a(Context context, String string2) {
        H.c.d(string2, "permission must be non-null");
        if (!E.b.c() && TextUtils.equals((CharSequence)"android.permission.POST_NOTIFICATIONS", (CharSequence)string2)) {
            if (k.b(context).a()) {
                return 0;
            }
            return -1;
        }
        return context.checkPermission(string2, Process.myPid(), Process.myUid());
    }

    public static Context b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return d.a(context);
        }
        return null;
    }

    public static int c(Context context, int n8) {
        return c.a(context, n8);
    }

    public static Drawable d(Context context, int n8) {
        return b.b(context, n8);
    }

    public static Executor e(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return f.a(context);
        }
        return E.f.a(new Handler(context.getMainLooper()));
    }

    public static File f(Context context) {
        return b.c(context);
    }

    public static String g(Context context) {
        Object object = new StringBuilder();
        object.append(context.getPackageName());
        object.append(".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
        object = object.toString();
        if (x.b.b(context, (String)object) == 0) {
            return object;
        }
        context = new StringBuilder();
        context.append("Permission ");
        context.append((String)object);
        context.append(" is required by your application to receive broadcasts, please add it to your manifest");
        throw new RuntimeException(context.toString());
    }

    public static Intent h(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int n8) {
        return a.i(context, broadcastReceiver, intentFilter, null, null, n8);
    }

    public static Intent i(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String string2, Handler handler, int n8) {
        int n9 = n8 & 1;
        if (n9 != 0 && (n8 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        int n10 = n8;
        if (n9 != 0) {
            n10 = n8 | 2;
        }
        if ((n8 = n10 & 2) == 0 && (n10 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (n8 != 0 && (n10 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        if (E.b.c()) {
            return g.a(context, broadcastReceiver, intentFilter, string2, handler, n10);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return e.a(context, broadcastReceiver, intentFilter, string2, handler, n10);
        }
        if ((n10 & 4) != 0 && string2 == null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, a.g(context), handler);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, string2, handler);
    }

    public static void j(Context context, Intent intent, Bundle bundle) {
        a.b(context, intent, bundle);
    }

    public static void k(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            e.b(context, intent);
            return;
        }
        context.startService(intent);
    }

    public static abstract class a {
        public static void a(Context context, Intent[] arrintent, Bundle bundle) {
            context.startActivities(arrintent, bundle);
        }

        public static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    public static abstract class b {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int n8) {
            return context.getDrawable(n8);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    public static abstract class c {
        public static int a(Context context, int n8) {
            return context.getColor(n8);
        }

        public static <T> T b(Context context, Class<T> class_) {
            return (T)context.getSystemService(class_);
        }

        public static String c(Context context, Class<?> class_) {
            return context.getSystemServiceName(class_);
        }
    }

    public static abstract class d {
        public static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        public static File b(Context context) {
            return context.getDataDir();
        }

        public static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public static abstract class e {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String string2, Handler handler, int n8) {
            if ((n8 & 4) != 0 && string2 == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, a.g(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, string2, handler, n8 & 1);
        }

        public static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    public static abstract class f {
        public static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    public static abstract class g {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String string2, Handler handler, int n8) {
            return context.registerReceiver(broadcastReceiver, intentFilter, string2, handler, n8);
        }
    }

}

