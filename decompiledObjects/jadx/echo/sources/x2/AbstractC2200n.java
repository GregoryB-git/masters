package x2;

import A2.AbstractC0328n;
import A2.Q;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: x2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2200n {

    /* renamed from: a, reason: collision with root package name */
    public static final int f21186a = 12451000;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f21188c = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f21189d = false;

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f21187b = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f21190e = new AtomicBoolean();

    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public static String b(int i7) {
        return C2188b.k(i7);
    }

    public static Resources c(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean d(Context context) {
        if (!f21189d) {
            try {
                try {
                    PackageInfo e7 = G2.d.a(context).e("com.google.android.gms", 64);
                    C2201o.a(context);
                    if (e7 == null || C2201o.e(e7, false) || !C2201o.e(e7, true)) {
                        f21188c = false;
                    } else {
                        f21188c = true;
                    }
                } catch (PackageManager.NameNotFoundException e8) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e8);
                }
                f21189d = true;
            } catch (Throwable th) {
                f21189d = true;
                throw th;
            }
        }
        return f21188c || !E2.i.b();
    }

    public static int e(Context context, int i7) {
        String valueOf;
        String str;
        PackageInfo packageInfo;
        try {
            context.getResources().getString(AbstractC2202p.f21194a);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f21190e.get()) {
            int a7 = Q.a(context);
            if (a7 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (a7 != f21186a) {
                throw new GooglePlayServicesIncorrectManifestValueException(a7);
            }
        }
        boolean z7 = (E2.i.d(context) || E2.i.f(context)) ? false : true;
        AbstractC0328n.a(i7 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z7) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                valueOf = String.valueOf(packageName);
                str = " requires the Google Play Store, but it is missing.";
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C2201o.a(context);
            if (C2201o.e(packageInfo2, true)) {
                if (z7) {
                    AbstractC0328n.i(packageInfo);
                    if (!C2201o.e(packageInfo, true)) {
                        valueOf = String.valueOf(packageName);
                        str = " requires Google Play Store, but its signature is invalid.";
                    }
                }
                if (!z7 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    if (E2.q.a(packageInfo2.versionCode) >= E2.q.a(i7)) {
                        ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e7) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e7);
                                return 1;
                            }
                        }
                        return !applicationInfo.enabled ? 3 : 0;
                    }
                    Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i7 + " but found " + packageInfo2.versionCode);
                    return 2;
                }
                valueOf = String.valueOf(packageName);
                str = " requires Google Play Store, but its signature doesn't match that of Google Play services.";
            } else {
                valueOf = String.valueOf(packageName);
                str = " requires Google Play services, but their signature is invalid.";
            }
            Log.w("GooglePlayServicesUtil", valueOf.concat(str));
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    public static boolean f(Context context, int i7) {
        if (i7 == 18) {
            return true;
        }
        if (i7 == 1) {
            return j(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean g(Context context) {
        if (!E2.l.c()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        AbstractC0328n.i(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    public static boolean h(int i7) {
        return i7 == 1 || i7 == 2 || i7 == 3 || i7 == 9;
    }

    public static boolean i(Context context, int i7, String str) {
        return E2.o.b(context, i7, str);
    }

    public static boolean j(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (E2.l.f()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return equals ? applicationInfo.enabled : applicationInfo.enabled && !g(context);
    }
}
