/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.AppOpsManager
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.os.Binder
 *  android.os.Process
 *  java.lang.CharSequence
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 */
package G2;

import E2.l;
import G2.a;
import G2.b;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;

public class c {
    public final Context a;

    public c(Context context) {
        this.a = context;
    }

    public int a(String string2) {
        return this.a.checkCallingOrSelfPermission(string2);
    }

    public int b(String string2, String string3) {
        return this.a.getPackageManager().checkPermission(string2, string3);
    }

    public ApplicationInfo c(String string2, int n8) {
        return this.a.getPackageManager().getApplicationInfo(string2, n8);
    }

    public CharSequence d(String string2) {
        return this.a.getPackageManager().getApplicationLabel(this.a.getPackageManager().getApplicationInfo(string2, 0));
    }

    public PackageInfo e(String string2, int n8) {
        return this.a.getPackageManager().getPackageInfo(string2, n8);
    }

    public boolean f() {
        String string2;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.a(this.a);
        }
        if (l.h() && (string2 = this.a.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            return b.a(this.a.getPackageManager(), string2);
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final boolean g(int n8, String string2) {
        if (l.d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager)this.a.getSystemService("appops");
                if (appOpsManager == null) throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                appOpsManager.checkPackage(n8, string2);
                return true;
            }
            catch (SecurityException securityException) {
                return false;
            }
        }
        String[] arrstring = this.a.getPackageManager().getPackagesForUid(n8);
        if (string2 == null) return false;
        if (arrstring == null) return false;
        n8 = 0;
        while (n8 < arrstring.length) {
            if (string2.equals((Object)arrstring[n8])) {
                return true;
            }
            ++n8;
        }
        return false;
    }
}

