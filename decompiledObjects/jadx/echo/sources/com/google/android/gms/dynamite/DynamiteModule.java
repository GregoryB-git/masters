package com.google.android.gms.dynamite;

import A2.AbstractC0327m;
import A2.AbstractC0328n;
import I2.j;
import I2.k;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import x2.C2197k;

/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f10271h = null;

    /* renamed from: i, reason: collision with root package name */
    public static String f10272i = null;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f10273j = false;

    /* renamed from: k, reason: collision with root package name */
    public static int f10274k = -1;

    /* renamed from: l, reason: collision with root package name */
    public static Boolean f10275l;

    /* renamed from: q, reason: collision with root package name */
    public static j f10280q;

    /* renamed from: r, reason: collision with root package name */
    public static k f10281r;

    /* renamed from: a, reason: collision with root package name */
    public final Context f10282a;

    /* renamed from: m, reason: collision with root package name */
    public static final ThreadLocal f10276m = new ThreadLocal();

    /* renamed from: n, reason: collision with root package name */
    public static final ThreadLocal f10277n = new I2.f();

    /* renamed from: o, reason: collision with root package name */
    public static final b.a f10278o = new com.google.android.gms.dynamite.a();

    /* renamed from: b, reason: collision with root package name */
    public static final b f10265b = new com.google.android.gms.dynamite.b();

    /* renamed from: c, reason: collision with root package name */
    public static final b f10266c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final b f10267d = new d();

    /* renamed from: e, reason: collision with root package name */
    public static final b f10268e = new e();

    /* renamed from: f, reason: collision with root package name */
    public static final b f10269f = new f();

    /* renamed from: g, reason: collision with root package name */
    public static final b f10270g = new g();

    /* renamed from: p, reason: collision with root package name */
    public static final b f10279p = new h();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        public /* synthetic */ a(String str, I2.i iVar) {
            super(str);
        }

        public /* synthetic */ a(String str, Throwable th, I2.i iVar) {
            super(str, th);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str);

            int b(Context context, String str, boolean z7);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0171b {

            /* renamed from: a, reason: collision with root package name */
            public int f10283a = 0;

            /* renamed from: b, reason: collision with root package name */
            public int f10284b = 0;

            /* renamed from: c, reason: collision with root package name */
            public int f10285c = 0;
        }

        C0171b a(Context context, String str, a aVar);
    }

    public DynamiteModule(Context context) {
        AbstractC0328n.i(context);
        this.f10282a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC0327m.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e7) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e7.getMessage())));
            return 0;
        }
    }

    public static int b(Context context, String str) {
        return e(context, str, false);
    }

    public static DynamiteModule d(Context context, b bVar, String str) {
        Boolean bool;
        H2.a b12;
        DynamiteModule dynamiteModule;
        k kVar;
        boolean z7;
        H2.a v7;
        ThreadLocal threadLocal = f10276m;
        I2.h hVar = (I2.h) threadLocal.get();
        I2.h hVar2 = new I2.h(null);
        threadLocal.set(hVar2);
        ThreadLocal threadLocal2 = f10277n;
        Long l7 = (Long) threadLocal2.get();
        long longValue = l7.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            b.C0171b a7 = bVar.a(context, str, f10278o);
            Log.i("DynamiteModule", "Considering local module " + str + ":" + a7.f10283a + " and remote module " + str + ":" + a7.f10284b);
            int i7 = a7.f10285c;
            if (i7 != 0) {
                if (i7 == -1) {
                    if (a7.f10283a != 0) {
                        i7 = -1;
                    }
                }
                if (i7 != 1 || a7.f10284b != 0) {
                    if (i7 == -1) {
                        DynamiteModule g7 = g(context, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(l7);
                        }
                        Cursor cursor = hVar2.f2512a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(hVar);
                        return g7;
                    }
                    if (i7 != 1) {
                        throw new a("VersionPolicy returned invalid code:" + i7, null);
                    }
                    try {
                        int i8 = a7.f10284b;
                        try {
                            synchronized (DynamiteModule.class) {
                                if (!j(context)) {
                                    throw new a("Remote loading disabled", null);
                                }
                                bool = f10271h;
                            }
                            if (bool == null) {
                                throw new a("Failed to determine which loading route to use.", null);
                            }
                            if (bool.booleanValue()) {
                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i8);
                                synchronized (DynamiteModule.class) {
                                    kVar = f10281r;
                                }
                                if (kVar == null) {
                                    throw new a("DynamiteLoaderV2 was not cached.", null);
                                }
                                I2.h hVar3 = (I2.h) threadLocal.get();
                                if (hVar3 == null || hVar3.f2512a == null) {
                                    throw new a("No result cursor", null);
                                }
                                Context applicationContext = context.getApplicationContext();
                                Cursor cursor2 = hVar3.f2512a;
                                H2.b.Z0(null);
                                synchronized (DynamiteModule.class) {
                                    z7 = f10274k >= 2;
                                }
                                if (z7) {
                                    Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                    v7 = kVar.Z0(H2.b.Z0(applicationContext), str, i8, H2.b.Z0(cursor2));
                                } else {
                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                    v7 = kVar.v(H2.b.Z0(applicationContext), str, i8, H2.b.Z0(cursor2));
                                }
                                Context context2 = (Context) H2.b.v(v7);
                                if (context2 == null) {
                                    throw new a("Failed to get module context", null);
                                }
                                dynamiteModule = new DynamiteModule(context2);
                            } else {
                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i8);
                                j k7 = k(context);
                                if (k7 == null) {
                                    throw new a("Failed to create IDynamiteLoader.", null);
                                }
                                int v8 = k7.v();
                                if (v8 >= 3) {
                                    I2.h hVar4 = (I2.h) threadLocal.get();
                                    if (hVar4 == null) {
                                        throw new a("No cached result cursor holder", null);
                                    }
                                    b12 = k7.c1(H2.b.Z0(context), str, i8, H2.b.Z0(hVar4.f2512a));
                                } else if (v8 == 2) {
                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                    b12 = k7.d1(H2.b.Z0(context), str, i8);
                                } else {
                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                    b12 = k7.b1(H2.b.Z0(context), str, i8);
                                }
                                Object v9 = H2.b.v(b12);
                                if (v9 == null) {
                                    throw new a("Failed to load remote module.", null);
                                }
                                dynamiteModule = new DynamiteModule((Context) v9);
                            }
                            if (longValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(l7);
                            }
                            Cursor cursor3 = hVar2.f2512a;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            threadLocal.set(hVar);
                            return dynamiteModule;
                        } catch (RemoteException e7) {
                            throw new a("Failed to load remote module.", e7, null);
                        } catch (a e8) {
                            throw e8;
                        } catch (Throwable th) {
                            E2.g.a(context, th);
                            throw new a("Failed to load remote module.", th, null);
                        }
                    } catch (a e9) {
                        Log.w("DynamiteModule", "Failed to load remote module: " + e9.getMessage());
                        int i9 = a7.f10283a;
                        if (i9 == 0 || bVar.a(context, str, new i(i9, 0)).f10285c != -1) {
                            throw new a("Remote load failed. No local fallback found.", e9, null);
                        }
                        DynamiteModule g8 = g(context, str);
                        if (longValue == 0) {
                            f10277n.remove();
                        } else {
                            f10277n.set(l7);
                        }
                        Cursor cursor4 = hVar2.f2512a;
                        if (cursor4 != null) {
                            cursor4.close();
                        }
                        f10276m.set(hVar);
                        return g8;
                    }
                }
            }
            throw new a("No acceptable module " + str + " found. Local version is " + a7.f10283a + " and remote version is " + a7.f10284b + ".", null);
        } catch (Throwable th2) {
            if (longValue == 0) {
                f10277n.remove();
            } else {
                f10277n.set(l7);
            }
            Cursor cursor5 = hVar2.f2512a;
            if (cursor5 != null) {
                cursor5.close();
            }
            f10276m.set(hVar);
            throw th2;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01bd -> B:24:0x01c2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01bf -> B:24:0x01c2). Please report as a decompilation issue!!! */
    public static int e(Context context, String str, boolean z7) {
        Field declaredField;
        Throwable th;
        RemoteException e7;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f10271h;
                int i7 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e8) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e8.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != ClassLoader.getSystemClassLoader()) {
                            if (classLoader != null) {
                                try {
                                    h(classLoader);
                                } catch (a unused) {
                                }
                                bool = Boolean.TRUE;
                                f10271h = bool;
                            } else {
                                if (!j(context)) {
                                    return 0;
                                }
                                if (!f10273j) {
                                    Boolean bool2 = Boolean.TRUE;
                                    if (!bool2.equals(null)) {
                                        try {
                                            int f7 = f(context, str, z7, true);
                                            String str2 = f10272i;
                                            if (str2 != null && !str2.isEmpty()) {
                                                ClassLoader a7 = I2.d.a();
                                                if (a7 == null) {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        I2.b.a();
                                                        String str3 = f10272i;
                                                        AbstractC0328n.i(str3);
                                                        a7 = I2.a.a(str3, ClassLoader.getSystemClassLoader());
                                                    } else {
                                                        String str4 = f10272i;
                                                        AbstractC0328n.i(str4);
                                                        a7 = new I2.e(str4, ClassLoader.getSystemClassLoader());
                                                    }
                                                }
                                                h(a7);
                                                declaredField.set(null, a7);
                                                f10271h = bool2;
                                                return f7;
                                            }
                                            return f7;
                                        } catch (a unused2) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        }
                                    }
                                }
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                            }
                        }
                        bool = Boolean.FALSE;
                        f10271h = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, str, z7, false);
                    } catch (a e9) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e9.getMessage());
                        return 0;
                    }
                }
                j k7 = k(context);
                try {
                    if (k7 != null) {
                        try {
                            int v7 = k7.v();
                            if (v7 >= 3) {
                                I2.h hVar = (I2.h) f10276m.get();
                                if (hVar == null || (cursor = hVar.f2512a) == null) {
                                    Cursor cursor2 = (Cursor) H2.b.v(k7.e1(H2.b.Z0(context), str, z7, ((Long) f10277n.get()).longValue()));
                                    if (cursor2 != null) {
                                        try {
                                            if (cursor2.moveToFirst()) {
                                                int i8 = cursor2.getInt(0);
                                                r2 = (i8 <= 0 || !i(cursor2)) ? cursor2 : null;
                                                if (r2 != null) {
                                                    r2.close();
                                                }
                                                i7 = i8;
                                            }
                                        } catch (RemoteException e10) {
                                            e7 = e10;
                                            r2 = cursor2;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e7.getMessage());
                                            if (r2 != null) {
                                                r2.close();
                                            }
                                            return i7;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r2 = cursor2;
                                            if (r2 != null) {
                                                r2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                } else {
                                    i7 = cursor.getInt(0);
                                }
                            } else if (v7 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i7 = k7.a1(H2.b.Z0(context), str, z7);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i7 = k7.Z0(H2.b.Z0(context), str, z7);
                            }
                        } catch (RemoteException e11) {
                            e7 = e11;
                        }
                    }
                    return i7;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            E2.g.a(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a5, code lost:
    
        r10.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int f(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static DynamiteModule g(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context.getApplicationContext());
    }

    public static void h(ClassLoader classLoader) {
        k kVar;
        I2.i iVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                kVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                kVar = queryLocalInterface instanceof k ? (k) queryLocalInterface : new k(iBinder);
            }
            f10281r = kVar;
        } catch (ClassNotFoundException e7) {
            e = e7;
            throw new a("Failed to instantiate dynamite loader", e, iVar);
        } catch (IllegalAccessException e8) {
            e = e8;
            throw new a("Failed to instantiate dynamite loader", e, iVar);
        } catch (InstantiationException e9) {
            e = e9;
            throw new a("Failed to instantiate dynamite loader", e, iVar);
        } catch (NoSuchMethodException e10) {
            e = e10;
            throw new a("Failed to instantiate dynamite loader", e, iVar);
        } catch (InvocationTargetException e11) {
            e = e11;
            throw new a("Failed to instantiate dynamite loader", e, iVar);
        }
    }

    public static boolean i(Cursor cursor) {
        I2.h hVar = (I2.h) f10276m.get();
        if (hVar == null || hVar.f2512a != null) {
            return false;
        }
        hVar.f2512a = cursor;
        return true;
    }

    public static boolean j(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f10275l)) {
            return true;
        }
        boolean z7 = false;
        if (f10275l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C2197k.f().h(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z7 = true;
            }
            f10275l = Boolean.valueOf(z7);
            if (z7 && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f10273j = true;
            }
        }
        if (!z7) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z7;
    }

    public static j k(Context context) {
        j jVar;
        synchronized (DynamiteModule.class) {
            j jVar2 = f10280q;
            if (jVar2 != null) {
                return jVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    jVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    jVar = queryLocalInterface instanceof j ? (j) queryLocalInterface : new j(iBinder);
                }
                if (jVar != null) {
                    f10280q = jVar;
                    return jVar;
                }
            } catch (Exception e7) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e7.getMessage());
            }
            return null;
        }
    }

    public IBinder c(String str) {
        try {
            return (IBinder) this.f10282a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e7) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e7, null);
        }
    }
}
