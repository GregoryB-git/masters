package x2;

import A2.AbstractC0328n;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;

/* renamed from: x2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2201o {

    /* renamed from: c, reason: collision with root package name */
    public static C2201o f21191c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f21192a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f21193b;

    public C2201o(Context context) {
        this.f21192a = context.getApplicationContext();
    }

    public static C2201o a(Context context) {
        AbstractC0328n.i(context);
        synchronized (C2201o.class) {
            try {
                if (f21191c == null) {
                    AbstractC2175E.d(context);
                    f21191c = new C2201o(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f21191c;
    }

    public static final AbstractBinderC2171A d(PackageInfo packageInfo, AbstractBinderC2171A... abstractBinderC2171AArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        BinderC2172B binderC2172B = new BinderC2172B(packageInfo.signatures[0].toByteArray());
        for (int i7 = 0; i7 < abstractBinderC2171AArr.length; i7++) {
            if (abstractBinderC2171AArr[i7].equals(binderC2172B)) {
                return abstractBinderC2171AArr[i7];
            }
        }
        return null;
    }

    public static final boolean e(PackageInfo packageInfo, boolean z7) {
        if (z7 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z7 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z7 ? d(packageInfo, AbstractC2174D.f21138a) : d(packageInfo, AbstractC2174D.f21138a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (AbstractC2200n.d(this.f21192a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i7) {
        C2185O c7;
        int length;
        String[] packagesForUid = this.f21192a.getPackageManager().getPackagesForUid(i7);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            c7 = null;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    AbstractC0328n.i(c7);
                    break;
                }
                c7 = f(packagesForUid[i8], false, false);
                if (c7.f21161a) {
                    break;
                }
                i8++;
            }
        } else {
            c7 = C2185O.c("no pkgs");
        }
        c7.e();
        return c7.f21161a;
    }

    public final C2185O f(String str, boolean z7, boolean z8) {
        C2185O c2185o;
        ApplicationInfo applicationInfo;
        String str2 = "null pkg";
        if (str == null) {
            return C2185O.c("null pkg");
        }
        if (str.equals(this.f21193b)) {
            return C2185O.b();
        }
        if (AbstractC2175E.e()) {
            c2185o = AbstractC2175E.b(str, AbstractC2200n.d(this.f21192a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f21192a.getPackageManager().getPackageInfo(str, 64);
                boolean d7 = AbstractC2200n.d(this.f21192a);
                if (packageInfo != null) {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        str2 = "single cert required";
                    } else {
                        BinderC2172B binderC2172B = new BinderC2172B(packageInfo.signatures[0].toByteArray());
                        String str3 = packageInfo.packageName;
                        C2185O a7 = AbstractC2175E.a(str3, binderC2172B, d7, false);
                        if (!a7.f21161a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !AbstractC2175E.a(str3, binderC2172B, false, true).f21161a) {
                            c2185o = a7;
                        } else {
                            str2 = "debuggable release cert app rejected";
                        }
                    }
                }
                c2185o = C2185O.c(str2);
            } catch (PackageManager.NameNotFoundException e7) {
                return C2185O.d("no pkg ".concat(str), e7);
            }
        }
        if (c2185o.f21161a) {
            this.f21193b = str;
        }
        return c2185o;
    }
}
