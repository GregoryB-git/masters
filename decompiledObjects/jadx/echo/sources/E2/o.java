package E2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import x2.C2201o;

/* loaded from: classes.dex */
public abstract class o {
    public static boolean a(Context context, int i7) {
        if (!b(context, i7, "com.google.android.gms")) {
            return false;
        }
        try {
            return C2201o.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    public static boolean b(Context context, int i7, String str) {
        return G2.d.a(context).g(i7, str);
    }
}
