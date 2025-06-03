package f7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.common.zzl;
import j6.f;
import j6.g;
import j6.j;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f5470a = f.f8490b;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f5471b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static Method f5472c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f5473d = false;

    /* renamed from: f7.a$a, reason: collision with other inner class name */
    public interface InterfaceC0083a {
        void a();

        void b();
    }

    public static void a(Context context) {
        Context context2;
        Context context3;
        if (context == null) {
            throw new NullPointerException("Context must not be null");
        }
        f5470a.getClass();
        j.a(context, 11925000);
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (f5471b) {
            Context context4 = null;
            if (!f5473d) {
                try {
                    context2 = DynamiteModule.c(context, DynamiteModule.f2862c, "com.google.android.gms.providerinstaller.dynamite").f2872a;
                } catch (DynamiteModule.a e10) {
                    Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e10.getMessage())));
                    context2 = null;
                }
                if (context2 != null) {
                    b(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                    return;
                }
            }
            boolean z10 = !f5473d;
            try {
                context3 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context3 = null;
            }
            if (context3 != null) {
                f5473d = true;
                if (z10) {
                    try {
                        zzl.zzb("com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats2", context3.getClassLoader(), zzj.zzb(Context.class, context), zzi.zza(uptimeMillis), zzi.zza(SystemClock.uptimeMillis()));
                    } catch (Exception e11) {
                        Log.w("ProviderInstaller", "Failed to report request stats: ".concat(e11.toString()));
                    }
                }
                context4 = context3;
            }
            if (context4 != null) {
                b(context4, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new g(8);
            }
        }
    }

    public static void b(Context context, String str) {
        try {
            if (f5472c == null) {
                f5472c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f5472c.invoke(null, context);
        } catch (Exception e10) {
            Throwable cause = e10.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e10.toString() : cause.toString())));
            }
            throw new g(8);
        }
    }
}
