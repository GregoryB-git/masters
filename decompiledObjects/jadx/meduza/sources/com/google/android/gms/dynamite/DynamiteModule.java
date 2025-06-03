package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import l6.f1;
import m6.h;
import y6.e;
import y6.f;

/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f2863d = null;

    /* renamed from: e, reason: collision with root package name */
    public static String f2864e = null;
    public static boolean f = false;

    /* renamed from: g, reason: collision with root package name */
    public static int f2865g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f2866h;

    /* renamed from: l, reason: collision with root package name */
    public static e f2870l;

    /* renamed from: m, reason: collision with root package name */
    public static f f2871m;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2872a;

    /* renamed from: i, reason: collision with root package name */
    public static final ThreadLocal f2867i = new ThreadLocal();

    /* renamed from: j, reason: collision with root package name */
    public static final f1 f2868j = new f1(1);

    /* renamed from: k, reason: collision with root package name */
    public static final com.google.android.gms.dynamite.a f2869k = new com.google.android.gms.dynamite.a();

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.dynamite.b f2861b = new com.google.android.gms.dynamite.b();

    /* renamed from: c, reason: collision with root package name */
    public static final c f2862c = new c();

    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        public /* synthetic */ a(String str) {
            super(str);
        }

        public /* synthetic */ a(String str, Throwable th) {
            super(str, th);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str, boolean z10);

            int b(Context context, String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0042b {

            /* renamed from: a, reason: collision with root package name */
            public int f2873a = 0;

            /* renamed from: b, reason: collision with root package name */
            public int f2874b = 0;

            /* renamed from: c, reason: collision with root package name */
            public int f2875c = 0;
        }

        C0042b a(Context context, String str, a aVar);
    }

    public DynamiteModule(Context context) {
        this.f2872a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (h.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0233 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0246 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0239 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.dynamite.DynamiteModule c(android.content.Context r17, com.google.android.gms.dynamite.DynamiteModule.b r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.c(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0167, code lost:
    
        if (r3 != false) goto L97;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.d(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x012d, code lost:
    
        if (r5 != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int e(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static DynamiteModule f(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(str));
        return new DynamiteModule(context);
    }

    public static void g(ClassLoader classLoader) {
        f fVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                fVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                fVar = queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
            }
            f2871m = fVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new a("Failed to instantiate dynamite loader", e10);
        }
    }

    public static boolean h(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f2866h)) {
            return true;
        }
        boolean z10 = false;
        if (f2866h == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != (Build.VERSION.SDK_INT >= 29) ? 0 : 268435456);
            if (j6.f.f8490b.c(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f2866h = valueOf;
            z10 = valueOf.booleanValue();
            if (z10 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    public static e i(Context context) {
        e eVar;
        synchronized (DynamiteModule.class) {
            e eVar2 = f2870l;
            if (eVar2 != null) {
                return eVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    eVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    eVar = queryLocalInterface instanceof e ? (e) queryLocalInterface : new e(iBinder);
                }
                if (eVar != null) {
                    f2870l = eVar;
                    return eVar;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f2872a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new a("Failed to instantiate module class: ".concat(str), e10);
        }
    }
}
