package v6;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import j6.k;

/* loaded from: classes.dex */
public final class h {
    public static boolean a(Context context, int i10) {
        if (b(context, "com.google.android.gms", i10)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                k a10 = k.a(context);
                a10.getClass();
                if (packageInfo == null) {
                    return false;
                }
                if (!k.d(packageInfo, false)) {
                    if (!k.d(packageInfo, true)) {
                        return false;
                    }
                    if (!j6.j.b(a10.f8505a)) {
                        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        return false;
                    }
                }
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean b(Context context, String str, int i10) {
        x6.c a10 = x6.d.a(context);
        a10.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a10.f17198a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i10, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
