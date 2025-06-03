// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package G2;

import android.app.AppOpsManager;
import E2.l;
import android.os.Process;
import android.os.Binder;
import android.content.pm.PackageInfo;
import android.content.pm.ApplicationInfo;
import android.content.Context;

public class c
{
    public final Context a;
    
    public c(final Context a) {
        this.a = a;
    }
    
    public int a(final String s) {
        return this.a.checkCallingOrSelfPermission(s);
    }
    
    public int b(final String s, final String s2) {
        return this.a.getPackageManager().checkPermission(s, s2);
    }
    
    public ApplicationInfo c(final String s, final int n) {
        return this.a.getPackageManager().getApplicationInfo(s, n);
    }
    
    public CharSequence d(final String s) {
        return this.a.getPackageManager().getApplicationLabel(this.a.getPackageManager().getApplicationInfo(s, 0));
    }
    
    public PackageInfo e(final String s, final int n) {
        return this.a.getPackageManager().getPackageInfo(s, n);
    }
    
    public boolean f() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return G2.a.a(this.a);
        }
        if (l.h()) {
            final String nameForUid = this.a.getPackageManager().getNameForUid(Binder.getCallingUid());
            if (nameForUid != null) {
                return b.a(this.a.getPackageManager(), nameForUid);
            }
        }
        return false;
    }
    
    public final boolean g(int n, final String s) {
        Label_0041: {
            if (!l.d()) {
                break Label_0041;
            }
            try {
                final AppOpsManager appOpsManager = (AppOpsManager)this.a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(n, s);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                // iftrue(Label_0081:, !s.equals((Object)packagesForUid[n]))
                // iftrue(Label_0088:, s == null || packagesForUid == null)
                while (true) {
                Label_0063:
                    while (true) {
                        n = 0;
                        break Label_0063;
                        Label_0081: {
                            ++n;
                        }
                        break Label_0063;
                        return true;
                        Label_0088:
                        return false;
                        final String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(n);
                        continue;
                    }
                    continue;
                }
            }
            // iftrue(Label_0088:, n >= packagesForUid.length)
            catch (SecurityException ex) {
                return false;
            }
        }
    }
}
