// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x;

import android.content.ComponentName;
import android.os.Bundle;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import java.io.File;
import E.f;
import android.os.Handler;
import java.util.concurrent.Executor;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import w.k;
import android.os.Process;
import android.text.TextUtils;
import E.b;
import H.c;
import android.content.Context;

public abstract class a
{
    public static final Object a;
    public static final Object b;
    
    static {
        a = new Object();
        b = new Object();
    }
    
    public static int a(final Context context, final String s) {
        H.c.d(s, "permission must be non-null");
        if (E.b.c() || !TextUtils.equals((CharSequence)"android.permission.POST_NOTIFICATIONS", (CharSequence)s)) {
            return context.checkPermission(s, Process.myPid(), Process.myUid());
        }
        if (k.b(context).a()) {
            return 0;
        }
        return -1;
    }
    
    public static Context b(final Context context) {
        if (Build$VERSION.SDK_INT >= 24) {
            return d.a(context);
        }
        return null;
    }
    
    public static int c(final Context context, final int n) {
        return c.a(context, n);
    }
    
    public static Drawable d(final Context context, final int n) {
        return x.a.b.b(context, n);
    }
    
    public static Executor e(final Context context) {
        if (Build$VERSION.SDK_INT >= 28) {
            return f.a(context);
        }
        return E.f.a(new Handler(context.getMainLooper()));
    }
    
    public static File f(final Context context) {
        return x.a.b.c(context);
    }
    
    public static String g(final Context context) {
        final StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
        final String string = sb.toString();
        if (x.b.b(context, string) == 0) {
            return string;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Permission ");
        sb2.append(string);
        sb2.append(" is required by your application to receive broadcasts, please add it to your manifest");
        throw new RuntimeException(sb2.toString());
    }
    
    public static Intent h(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter, final int n) {
        return i(context, broadcastReceiver, intentFilter, null, null, n);
    }
    
    public static Intent i(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter, final String s, final Handler handler, int n) {
        final int n2 = n & 0x1;
        if (n2 != 0 && (n & 0x4) != 0x0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        int n3 = n;
        if (n2 != 0) {
            n3 = (n | 0x2);
        }
        n = (n3 & 0x2);
        if (n == 0 && (n3 & 0x4) == 0x0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (n != 0 && (n3 & 0x4) != 0x0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        if (E.b.c()) {
            return g.a(context, broadcastReceiver, intentFilter, s, handler, n3);
        }
        if (Build$VERSION.SDK_INT >= 26) {
            return e.a(context, broadcastReceiver, intentFilter, s, handler, n3);
        }
        if ((n3 & 0x4) != 0x0 && s == null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, g(context), handler);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, s, handler);
    }
    
    public static void j(final Context context, final Intent intent, final Bundle bundle) {
        x.a.a.b(context, intent, bundle);
    }
    
    public static void k(final Context context, final Intent intent) {
        if (Build$VERSION.SDK_INT >= 26) {
            e.b(context, intent);
            return;
        }
        context.startService(intent);
    }
    
    public abstract static class a
    {
        public static void a(final Context context, final Intent[] array, final Bundle bundle) {
            context.startActivities(array, bundle);
        }
        
        public static void b(final Context context, final Intent intent, final Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }
    
    public abstract static class b
    {
        public static File a(final Context context) {
            return context.getCodeCacheDir();
        }
        
        public static Drawable b(final Context context, final int n) {
            return context.getDrawable(n);
        }
        
        public static File c(final Context context) {
            return context.getNoBackupFilesDir();
        }
    }
    
    public abstract static class c
    {
        public static int a(final Context context, final int n) {
            return context.getColor(n);
        }
        
        public static <T> T b(final Context context, final Class<T> clazz) {
            return (T)context.getSystemService((Class)clazz);
        }
        
        public static String c(final Context context, final Class<?> clazz) {
            return context.getSystemServiceName((Class)clazz);
        }
    }
    
    public abstract static class d
    {
        public static Context a(final Context context) {
            return context.createDeviceProtectedStorageContext();
        }
        
        public static File b(final Context context) {
            return context.getDataDir();
        }
        
        public static boolean c(final Context context) {
            return context.isDeviceProtectedStorage();
        }
    }
    
    public abstract static class e
    {
        public static Intent a(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter, final String s, final Handler handler, final int n) {
            if ((n & 0x4) != 0x0 && s == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, x.a.g(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, s, handler, n & 0x1);
        }
        
        public static ComponentName b(final Context context, final Intent intent) {
            return context.startForegroundService(intent);
        }
    }
    
    public abstract static class f
    {
        public static Executor a(final Context context) {
            return context.getMainExecutor();
        }
    }
    
    public abstract static class g
    {
        public static Intent a(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter, final String s, final Handler handler, final int n) {
            return context.registerReceiver(broadcastReceiver, intentFilter, s, handler, n);
        }
    }
}
