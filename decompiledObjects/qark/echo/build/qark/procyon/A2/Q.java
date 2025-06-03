// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.os.BaseBundle;
import android.os.Bundle;
import G2.c;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import G2.d;
import android.content.Context;

public abstract class Q
{
    public static final Object a;
    public static boolean b;
    public static String c;
    public static int d;
    
    static {
        a = new Object();
    }
    
    public static int a(final Context context) {
        b(context);
        return Q.d;
    }
    
    public static void b(final Context context) {
        final Object a = Q.a;
        // monitorenter(a)
        while (true) {
            try {
                if (Q.b) {
                    // monitorexit(a)
                    return;
                }
                Q.b = true;
                final String packageName = context.getPackageName();
                final c a2 = G2.d.a(context);
                try {
                    final Bundle metaData = a2.c(packageName, 128).metaData;
                    if (metaData == null) {
                        // monitorexit(a)
                        return;
                    }
                    Q.c = ((BaseBundle)metaData).getString("com.google.app.id");
                    Q.d = ((BaseBundle)metaData).getInt("com.google.android.gms.version");
                }
                catch (PackageManager$NameNotFoundException ex) {
                    Log.wtf("MetadataValueReader", "This should never happen.", (Throwable)ex);
                }
                // monitorexit(a)
                return;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
