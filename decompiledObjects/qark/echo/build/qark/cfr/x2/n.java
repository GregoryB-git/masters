/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageInstaller
 *  android.content.pm.PackageInstaller$SessionInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.Signature
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.os.UserManager
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package x2;

import A2.Q;
import E2.i;
import E2.l;
import E2.q;
import G2.d;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import x2.b;
import x2.o;
import x2.p;

public abstract class n {
    public static final int a = 12451000;
    public static final AtomicBoolean b = new AtomicBoolean();
    public static boolean c = false;
    public static boolean d = false;
    public static final AtomicBoolean e = new AtomicBoolean();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int a(Context context) {
        try {
            context = context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return context.versionCode;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        Log.w((String)"GooglePlayServicesUtil", (String)"Google Play services is missing.");
        return 0;
    }

    public static String b(int n8) {
        return b.k(n8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Resources c(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return null;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static boolean d(Context var0) {
        if (n.d) ** GOTO lbl8
        try {
            var1_3 = d.a(var0).e("com.google.android.gms", 64);
            o.a(var0);
            n.c = var1_3 != null && o.e(var1_3, false) == false && o.e(var1_3, true) != false;
        }
        catch (PackageManager.NameNotFoundException var0_1) {
            ** continue;
        }
lbl6: // 2 sources:
        do {
            n.d = true;
lbl8: // 2 sources:
            if (n.c != false) return true;
            if (i.b() != false) return false;
            return true;
            break;
        } while (true);
lbl11: // 1 sources:
        do {
            try {
                Log.w((String)"GooglePlayServicesUtil", (String)"Cannot find Google Play services package name.", (Throwable)var0_1);
                ** continue;
            }
            catch (Throwable var0_2) {}
            n.d = true;
            throw var0_2;
            break;
        } while (true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static int e(Context var0, int var1_4) {
        block19 : {
            block18 : {
                block17 : {
                    try {
                        var0.getResources().getString(p.a);
                        break block17;
                    }
                    catch (Throwable var4_5) {}
                    Log.e((String)"GooglePlayServicesUtil", (String)"The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
                }
                if (!"com.google.android.gms".equals((Object)var0.getPackageName()) && !n.e.get()) {
                    var2_7 = Q.a((Context)var0);
                    if (var2_7 == 0) throw new GooglePlayServicesMissingManifestValueException();
                    if (var2_7 != n.a) throw new GooglePlayServicesIncorrectManifestValueException(var2_7);
                }
                var2_7 = i.d((Context)var0) == false && i.f((Context)var0) == false ? 1 : 0;
                var3_8 = var1_4 >= 0;
                A2.n.a(var3_8);
                var5_9 = var0.getPackageName();
                var6_10 = var0.getPackageManager();
                if (var2_7 != 0) {
                    var4_6 = var6_10.getPackageInfo("com.android.vending", 8256);
                } else {
                    var4_6 = null;
                }
                try {
                    var7_11 = var6_10.getPackageInfo("com.google.android.gms", 64);
                }
                catch (PackageManager.NameNotFoundException var0_3) {}
                o.a((Context)var0);
                if (o.e(var7_11, true)) break block18;
                var0 = String.valueOf((Object)var5_9);
                var4_6 = " requires Google Play services, but their signature is invalid.";
                break block19;
            }
            if (var2_7 == 0) ** GOTO lbl-1000
            A2.n.i(var4_6);
            if (!o.e((PackageInfo)var4_6, true)) {
                var0 = String.valueOf((Object)var5_9);
                var4_6 = " requires Google Play Store, but its signature is invalid.";
            } else if (var2_7 != 0 && var4_6 != null && !var4_6.signatures[0].equals((Object)var7_11.signatures[0])) {
                var0 = String.valueOf((Object)var5_9);
                var4_6 = " requires Google Play Store, but its signature doesn't match that of Google Play services.";
            } else {
                if (q.a(var7_11.versionCode) < q.a(var1_4)) {
                    var2_7 = var7_11.versionCode;
                    var0 = new StringBuilder();
                    var0.append("Google Play services out of date for ");
                    var0.append(var5_9);
                    var0.append(".  Requires ");
                    var0.append(var1_4);
                    var0.append(" but found ");
                    var0.append(var2_7);
                    Log.w((String)"GooglePlayServicesUtil", (String)var0.toString());
                    return 2;
                }
                var0 = var4_6 = var7_11.applicationInfo;
                if (var4_6 == null) {
                    try {
                        var0 = var6_10.getApplicationInfo("com.google.android.gms", 0);
                    }
                    catch (PackageManager.NameNotFoundException var0_2) {
                        Log.wtf((String)"GooglePlayServicesUtil", (String)String.valueOf((Object)var5_9).concat(" requires Google Play services, but they're missing when getting application info."), (Throwable)var0_2);
                        return 1;
                    }
                }
                if (var0.enabled != false) return 0;
                return 3;
                catch (PackageManager.NameNotFoundException var0_1) {}
                var0 = String.valueOf((Object)var5_9);
                var4_6 = " requires the Google Play Store, but it is missing.";
            }
        }
        Log.w((String)"GooglePlayServicesUtil", (String)var0.concat((String)var4_6));
        return 9;
        Log.w((String)"GooglePlayServicesUtil", (String)String.valueOf((Object)var5_9).concat(" requires Google Play services, but they are missing."));
        return 1;
    }

    public static boolean f(Context context, int n8) {
        if (n8 == 18) {
            return true;
        }
        if (n8 == 1) {
            return n.j(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean g(Context context) {
        if (l.c()) {
            Object object = context.getSystemService("user");
            A2.n.i(object);
            context = ((UserManager)object).getApplicationRestrictions(context.getPackageName());
            if (context != null && "true".equals((Object)context.getString("restricted_profile"))) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(int n8) {
        if (n8 != 1 && n8 != 2 && n8 != 3 && n8 != 9) {
            return false;
        }
        return true;
    }

    public static boolean i(Context context, int n8, String string2) {
        return E2.o.b(context, n8, string2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static boolean j(Context context, String string2) {
        PackageManager packageManager;
        boolean bl = string2.equals((Object)"com.google.android.gms");
        if (l.f()) {
            packageManager = context.getPackageManager().getPackageInstaller().getAllSessions();
            packageManager = packageManager.iterator();
            while (packageManager.hasNext()) {
                if (!string2.equals((Object)((PackageInstaller.SessionInfo)packageManager.next()).getAppPackageName())) continue;
                return true;
            }
        }
        packageManager = context.getPackageManager();
        try {
            string2 = packageManager.getApplicationInfo(string2, 8192);
            if (bl) {
                return string2.enabled;
            }
            if (!string2.enabled) return false;
            bl = n.g(context);
            if (bl) return false;
            return true;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return false;
        }
        catch (Exception exception) {
            return false;
        }
    }
}

