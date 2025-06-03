// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E2;

import G2.d;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.Context;

public abstract class o
{
    public static boolean a(final Context context, final int n) {
        if (!b(context, n, "com.google.android.gms")) {
            return false;
        }
        final PackageManager packageManager = context.getPackageManager();
        while (true) {
            try {
                return x2.o.a(context).b(packageManager.getPackageInfo("com.google.android.gms", 64));
                Label_0052: {
                    return false;
                }
                // iftrue(Label_0052:, !Log.isLoggable("UidVerifier", 3))
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                return false;
            }
            catch (PackageManager$NameNotFoundException ex) {
                continue;
            }
            break;
        }
    }
    
    public static boolean b(final Context context, final int n, final String s) {
        return d.a(context).g(n, s);
    }
}
