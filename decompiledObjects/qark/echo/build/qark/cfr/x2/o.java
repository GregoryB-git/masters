/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.Signature
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package x2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import x2.A;
import x2.B;
import x2.D;
import x2.E;
import x2.O;
import x2.n;

public class o {
    public static o c;
    public final Context a;
    public volatile String b;

    public o(Context context) {
        this.a = context.getApplicationContext();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static o a(Context context) {
        A2.n.i((Object)context);
        synchronized (o.class) {
            try {
                if (c == null) {
                    E.d(context);
                    c = new o(context);
                }
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static final /* varargs */ A d(PackageInfo object, A ... arra) {
        Signature[] arrsignature = object.signatures;
        if (arrsignature == null) {
            return null;
        }
        if (arrsignature.length != 1) {
            Log.w((String)"GoogleSignatureVerifier", (String)"Package has more than one signature.");
            return null;
        }
        object = object.signatures;
        object = new B(object[0].toByteArray());
        for (int i8 = 0; i8 < arra.length; ++i8) {
            if (!arra[i8].equals(object)) continue;
            return arra[i8];
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final boolean e(PackageInfo object, boolean bl) {
        boolean bl2;
        block5 : {
            ApplicationInfo applicationInfo;
            block6 : {
                bl2 = bl;
                if (!bl) break block5;
                bl2 = bl;
                if (object == null) break block5;
                if ("com.android.vending".equals((Object)object.packageName)) break block6;
                bl2 = bl;
                if (!"com.google.android.gms".equals((Object)object.packageName)) break block5;
            }
            bl2 = (applicationInfo = object.applicationInfo) != null && (applicationInfo.flags & 129) != 0;
        }
        if (object == null) return false;
        if (object.signatures != null) {
            object = bl2 ? o.d((PackageInfo)object, D.a) : o.d((PackageInfo)object, D.a[0]);
            if (object != null) {
                return true;
            }
        }
        return false;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (o.e(packageInfo, false)) {
            return true;
        }
        if (o.e(packageInfo, true)) {
            if (n.d(this.a)) {
                return true;
            }
            Log.w((String)"GoogleSignatureVerifier", (String)"Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int n8) {
        O o8;
        block4 : {
            int n9;
            String[] arrstring = this.a.getPackageManager().getPackagesForUid(n8);
            if (arrstring != null && (n9 = arrstring.length) != 0) {
                o8 = null;
                for (n8 = 0; n8 < n9; ++n8) {
                    o8 = this.f(arrstring[n8], false, false);
                    if (!o8.a) {
                        continue;
                    }
                    break block4;
                }
                A2.n.i(o8);
            } else {
                o8 = O.c("no pkgs");
            }
        }
        o8.e();
        return o8.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final O f(String string2, boolean bl, boolean bl2) {
        Signature[] arrsignature;
        block6 : {
            block7 : {
                block8 : {
                    PackageInfo packageInfo;
                    block5 : {
                        arrsignature = "null pkg";
                        if (string2 == null) {
                            return O.c("null pkg");
                        }
                        if (string2.equals((Object)this.b)) {
                            return O.b();
                        }
                        if (!E.e()) break block5;
                        arrsignature = E.b(string2, n.d(this.a), false, false);
                        break block6;
                    }
                    try {
                        packageInfo = this.a.getPackageManager().getPackageInfo(string2, 64);
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException) {
                        return O.d("no pkg ".concat(string2), (Throwable)nameNotFoundException);
                    }
                    bl = n.d(this.a);
                    if (packageInfo == null) break block7;
                    arrsignature = packageInfo.signatures;
                    if (arrsignature == null || arrsignature.length != 1) break block8;
                    B b8 = new B(packageInfo.signatures[0].toByteArray());
                    String string3 = packageInfo.packageName;
                    arrsignature = E.a(string3, b8, bl, false);
                    if (!arrsignature.a || (packageInfo = packageInfo.applicationInfo) == null || (packageInfo.flags & 2) == 0 || !E.a((String)string3, (A)b8, (boolean)false, (boolean)true).a) break block6;
                    arrsignature = "debuggable release cert app rejected";
                    break block7;
                }
                arrsignature = "single cert required";
            }
            arrsignature = O.c((String)arrsignature);
        }
        if (arrsignature.a) {
            this.b = string2;
        }
        return arrsignature;
    }
}

