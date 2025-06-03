// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package G2;

import com.appsflyer.internal.t;
import E2.l;
import android.content.Context;

public abstract class a
{
    public static Context a;
    public static Boolean b;
    
    public static boolean a(final Context context) {
        // monitorenter(a.class)
        while (true) {
            Boolean b2 = null;
            Label_0070: {
                Context applicationContext = null;
                while (true) {
                    Label_0119: {
                        try {
                            applicationContext = context.getApplicationContext();
                            final Context a = G2.a.a;
                            if (a != null) {
                                final Boolean b = G2.a.b;
                                if (b != null) {
                                    if (a == applicationContext) {
                                        // monitorexit(a.class)
                                        return b;
                                    }
                                }
                            }
                        }
                        finally {
                            break Label_0119;
                        }
                        break Label_0119;
                        while (true) {
                            while (true) {
                                try {
                                    final Context context2;
                                    context2.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                                    G2.a.b = Boolean.TRUE;
                                    G2.a.a = applicationContext;
                                    // monitorexit(a.class)
                                    return G2.a.b;
                                    // monitorexit(a.class)
                                    throw context2;
                                    b2 = Boolean.FALSE;
                                    break Label_0070;
                                }
                                catch (ClassNotFoundException ex) {}
                                continue;
                            }
                        }
                    }
                    G2.a.b = null;
                    if (!l.h()) {
                        continue;
                    }
                    break;
                }
                b2 = t.a(applicationContext.getPackageManager());
            }
            G2.a.b = b2;
            continue;
        }
    }
}
