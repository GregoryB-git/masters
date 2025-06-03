package G2;

import E2.l;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2079a;

    public c(Context context) {
        this.f2079a = context;
    }

    public int a(String str) {
        return this.f2079a.checkCallingOrSelfPermission(str);
    }

    public int b(String str, String str2) {
        return this.f2079a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo c(String str, int i7) {
        return this.f2079a.getPackageManager().getApplicationInfo(str, i7);
    }

    public CharSequence d(String str) {
        return this.f2079a.getPackageManager().getApplicationLabel(this.f2079a.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo e(String str, int i7) {
        return this.f2079a.getPackageManager().getPackageInfo(str, i7);
    }

    public boolean f() {
        String nameForUid;
        boolean isInstantApp;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.a(this.f2079a);
        }
        if (!l.h() || (nameForUid = this.f2079a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        isInstantApp = this.f2079a.getPackageManager().isInstantApp(nameForUid);
        return isInstantApp;
    }

    public final boolean g(int i7, String str) {
        if (l.d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f2079a.getSystemService("appops");
                if (appOpsManager == null) {
                    throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
                appOpsManager.checkPackage(i7, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f2079a.getPackageManager().getPackagesForUid(i7);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
