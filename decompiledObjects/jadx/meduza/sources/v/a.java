package v;

import a0.h;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import u.u;
import w.f;

/* loaded from: classes.dex */
public class a {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sSync = new Object();

    /* renamed from: v.a$a, reason: collision with other inner class name */
    public static class C0244a {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i10) {
            return context.getDrawable(i10);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    public static class b {
        public static int a(Context context, int i10) {
            return context.getColor(i10);
        }

        public static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        public static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    public static class c {
        public static Context a(Context context) {
            Context createDeviceProtectedStorageContext;
            createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            return createDeviceProtectedStorageContext;
        }

        public static File b(Context context) {
            File dataDir;
            dataDir = context.getDataDir();
            return dataDir;
        }

        public static boolean c(Context context) {
            boolean isDeviceProtectedStorage;
            isDeviceProtectedStorage = context.isDeviceProtectedStorage();
            return isDeviceProtectedStorage;
        }
    }

    public static class d {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            Intent registerReceiver;
            if ((i10 & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, a.obtainAndCheckReceiverPermission(context), handler);
            }
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10 & 1);
            return registerReceiver;
        }

        public static ComponentName b(Context context, Intent intent) {
            ComponentName startForegroundService;
            startForegroundService = context.startForegroundService(intent);
            return startForegroundService;
        }
    }

    public static class e {
        public static Executor a(Context context) {
            Executor mainExecutor;
            mainExecutor = context.getMainExecutor();
            return mainExecutor;
        }
    }

    public static class f {
        public static Context a(Context context, String str) {
            Context createAttributionContext;
            createAttributionContext = context.createAttributionContext(str);
            return createAttributionContext;
        }

        public static String b(Context context) {
            String attributionTag;
            attributionTag = context.getAttributionTag();
            return attributionTag;
        }

        public static Display c(Context context) {
            Display display;
            try {
                display = context.getDisplay();
                return display;
            } catch (UnsupportedOperationException unused) {
                Log.w(a.TAG, "The context:" + context + " is not associated with any display. Return a fallback display instead.");
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }
    }

    public static class g {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            Intent registerReceiver;
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10);
            return registerReceiver;
        }
    }

    public static int checkSelfPermission(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new u(context).a() ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static Context createAttributionContext(Context context, String str) {
        return Build.VERSION.SDK_INT >= 30 ? f.a(context, str) : context;
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return c.a(context);
        }
        return null;
    }

    private static File createFilesDir(File file) {
        synchronized (sSync) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                Log.w(TAG, "Unable to create files subdir " + file.getPath());
            }
            return file;
        }
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return f.b(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return C0244a.a(context);
    }

    public static int getColor(Context context, int i10) {
        return b.a(context, i10);
    }

    public static ColorStateList getColorStateList(Context context, int i10) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        f.c cVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        f.d dVar = new f.d(resources, theme);
        synchronized (w.f.f16161c) {
            SparseArray<f.c> sparseArray = w.f.f16160b.get(dVar);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (cVar = sparseArray.get(i10)) != null) {
                if (!cVar.f16163b.equals(resources.getConfiguration()) || (!(theme == null && cVar.f16164c == 0) && (theme == null || cVar.f16164c != theme.hashCode()))) {
                    sparseArray.remove(i10);
                } else {
                    colorStateList2 = cVar.f16162a;
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal<TypedValue> threadLocal = w.f.f16159a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.type;
        if (!(i11 >= 28 && i11 <= 31)) {
            try {
                colorStateList = w.b.a(resources, resources.getXml(i10), theme);
            } catch (Exception e10) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            }
        }
        if (colorStateList == null) {
            return f.b.b(resources, i10, theme);
        }
        synchronized (w.f.f16161c) {
            WeakHashMap<f.d, SparseArray<f.c>> weakHashMap = w.f.f16160b;
            SparseArray<f.c> sparseArray2 = weakHashMap.get(dVar);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray<>();
                weakHashMap.put(dVar, sparseArray2);
            }
            sparseArray2.append(i10, new f.c(colorStateList, dVar.f16165a.getConfiguration(), theme));
        }
        return colorStateList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0063, code lost:
    
        if (r2 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0071, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005c, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x006f, code lost:
    
        if (r2 == null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.Context getContextForLanguage(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L22
            java.lang.String r0 = "locale"
            java.lang.Object r0 = r8.getSystemService(r0)
            if (r0 == 0) goto L1e
            android.os.LocaleList r0 = u.k.a(r0)
            a0.i r1 = new a0.i
            a0.m r2 = new a0.m
            r2.<init>(r0)
            r1.<init>(r2)
            goto L8c
        L1e:
            a0.i r1 = a0.i.f6b
            goto L8c
        L22:
            java.lang.Object r0 = u.g.f14805a
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.io.FileNotFoundException -> L87 java.lang.Throwable -> Lc0
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L68
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L68
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L68
        L3a:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L68
            r6 = 1
            if (r5 == r6) goto L63
            r6 = 3
            if (r5 != r6) goto L4a
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L68
            if (r7 <= r4) goto L63
        L4a:
            if (r5 == r6) goto L3a
            r6 = 4
            if (r5 != r6) goto L50
            goto L3a
        L50:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L68
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L68
            if (r5 == 0) goto L3a
            r4 = 0
            java.lang.String r5 = "application_locales"
            java.lang.String r1 = r3.getAttributeValue(r4, r5)     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L68
        L63:
            if (r2 == 0) goto L74
            goto L71
        L66:
            r8 = move-exception
            goto L81
        L68:
            java.lang.String r3 = "AppLocalesStorageHelper"
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L74
        L71:
            r2.close()     // Catch: java.io.IOException -> L74 java.lang.Throwable -> Lc0
        L74:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lc0
            if (r2 != 0) goto L7b
            goto L87
        L7b:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> Lc0
            goto L87
        L81:
            if (r2 == 0) goto L86
            r2.close()     // Catch: java.io.IOException -> L86 java.lang.Throwable -> Lc0
        L86:
            throw r8     // Catch: java.lang.Throwable -> Lc0
        L87:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc0
            a0.i r1 = a0.i.b(r1)
        L8c:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 32
            if (r0 > r2) goto Lbf
            boolean r2 = r1.d()
            if (r2 != 0) goto Lbf
            android.content.res.Configuration r2 = new android.content.res.Configuration
            android.content.res.Resources r3 = r8.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            r2.<init>(r3)
            r3 = 24
            if (r0 < r3) goto Lad
            a0.f.b(r2, r1)
            goto Lbb
        Lad:
            boolean r0 = r1.d()
            if (r0 != 0) goto Lbb
            r0 = 0
            java.util.Locale r0 = r1.c(r0)
            r2.setLocale(r0)
        Lbb:
            android.content.Context r8 = r8.createConfigurationContext(r2)
        Lbf:
            return r8
        Lc0:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: v.a.getContextForLanguage(android.content.Context):android.content.Context");
    }

    public static File getDataDir(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return c.b(context);
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    public static Display getDisplayOrDefault(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? f.c(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable getDrawable(Context context, int i10) {
        return C0244a.b(context, i10);
    }

    public static File[] getExternalCacheDirs(Context context) {
        return context.getExternalCacheDirs();
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static Executor getMainExecutor(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? e.a(context) : new h(new Handler(context.getMainLooper()));
    }

    public static File getNoBackupFilesDir(Context context) {
        return C0244a.c(context);
    }

    public static File[] getObbDirs(Context context) {
        return context.getObbDirs();
    }

    public static String getString(Context context, int i10) {
        return getContextForLanguage(context).getString(i10);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return (T) b.b(context, cls);
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        return b.c(context, cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return c.c(context);
        }
        return false;
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (x6.b.F(context, str) == 0) {
            return str;
        }
        throw new RuntimeException(defpackage.g.e("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i10) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i10);
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
        int i11 = i10 & 1;
        if (i11 != 0 && (i10 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i11 != 0) {
            i10 |= 2;
        }
        int i12 = i10;
        int i13 = i12 & 2;
        if (i13 == 0 && (i12 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i13 != 0 && (i12 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i14 = Build.VERSION.SDK_INT;
        return i14 >= 33 ? g.a(context, broadcastReceiver, intentFilter, str, handler, i12) : i14 >= 26 ? d.a(context, broadcastReceiver, intentFilter, str, handler, i12) : ((i12 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler) : context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            d.b(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
