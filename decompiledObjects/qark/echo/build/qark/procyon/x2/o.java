// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x2;

import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.ApplicationInfo;
import android.content.pm.Signature;
import android.util.Log;
import android.content.pm.PackageInfo;
import A2.n;
import android.content.Context;

public class o
{
    public static o c;
    public final Context a;
    public volatile String b;
    
    public o(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    public static o a(final Context context) {
        n.i(context);
        // monitorenter(o.class)
        while (true) {
            try {
                if (o.c == null) {
                    E.d(context);
                    o.c = new o(context);
                }
                // monitorexit(o.class)
                return o.c;
                // monitorexit(o.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final A d(final PackageInfo packageInfo, final A... array) {
        final Signature[] signatures = packageInfo.signatures;
        if (signatures == null) {
            return null;
        }
        if (signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        final Signature[] signatures2 = packageInfo.signatures;
        int i = 0;
        final B b = new B(signatures2[0].toByteArray());
        while (i < array.length) {
            if (array[i].equals(b)) {
                return array[i];
            }
            ++i;
        }
        return null;
    }
    
    public static final boolean e(final PackageInfo packageInfo, final boolean b) {
        boolean b2 = b;
        Label_0065: {
            if (b) {
                b2 = b;
                if (packageInfo != null) {
                    if (!"com.android.vending".equals(packageInfo.packageName)) {
                        b2 = b;
                        if (!"com.google.android.gms".equals(packageInfo.packageName)) {
                            break Label_0065;
                        }
                    }
                    final ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    b2 = (applicationInfo != null && (applicationInfo.flags & 0x81) != 0x0);
                }
            }
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            A a;
            if (b2) {
                a = d(packageInfo, D.a);
            }
            else {
                a = d(packageInfo, D.a[0]);
            }
            if (a != null) {
                return true;
            }
        }
        return false;
    }
    
    public boolean b(final PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (x2.n.d(this.a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }
    
    public boolean c(int i) {
        final String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        O o = null;
        Label_0080: {
            if (packagesForUid != null) {
                final int length = packagesForUid.length;
                if (length != 0) {
                    o = null;
                    for (i = 0; i < length; ++i) {
                        o = this.f(packagesForUid[i], false, false);
                        if (o.a) {
                            break Label_0080;
                        }
                    }
                    n.i(o);
                    break Label_0080;
                }
            }
            o = O.c("no pkgs");
        }
        o.e();
        return o.a;
    }
    
    public final O f(final String s, final boolean b, final boolean b2) {
        String s2 = "null pkg";
        if (s == null) {
            return O.c("null pkg");
        }
        if (!s.equals(this.b)) {
            Label_0208: {
                if (E.e()) {
                    final O o = E.b(s, x2.n.d(this.a), false, false);
                    break Label_0208;
                }
                try {
                    final PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(s, 64);
                    final boolean d = x2.n.d(this.a);
                    Label_0077: {
                        if (packageInfo != null) {
                            final Signature[] signatures = packageInfo.signatures;
                            if (signatures != null && signatures.length == 1) {
                                final B b3 = new B(packageInfo.signatures[0].toByteArray());
                                final String packageName = packageInfo.packageName;
                                final O o = E.a(packageName, b3, d, false);
                                if (o.a) {
                                    final ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                                    if (applicationInfo != null && (applicationInfo.flags & 0x2) != 0x0 && E.a(packageName, b3, false, true).a) {
                                        s2 = "debuggable release cert app rejected";
                                        break Label_0077;
                                    }
                                }
                                break Label_0208;
                            }
                            s2 = "single cert required";
                        }
                    }
                    final O o = O.c(s2);
                    if (o.a) {
                        this.b = s;
                    }
                    return o;
                }
                catch (PackageManager$NameNotFoundException ex) {
                    return O.d("no pkg ".concat(s), (Throwable)ex);
                }
            }
        }
        return O.b();
    }
}
