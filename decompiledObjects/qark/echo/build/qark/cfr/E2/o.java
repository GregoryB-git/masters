/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 */
package E2;

import G2.d;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

public abstract class o {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a(Context context, int n8) {
        if (!o.b(context, n8, "com.google.android.gms")) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            packageManager = packageManager.getPackageInfo("com.google.android.gms", 64);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        return x2.o.a(context).b((PackageInfo)packageManager);
        if (Log.isLoggable((String)"UidVerifier", (int)3)) {
            Log.d((String)"UidVerifier", (String)"Package manager can't find google play services package, defaulting to false");
        }
        return false;
    }

    public static boolean b(Context context, int n8, String string2) {
        return d.a(context).g(n8, string2);
    }
}

