/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.Object
 *  java.lang.String
 */
package G2;

import E2.l;
import android.content.Context;
import android.content.pm.PackageManager;
import com.appsflyer.internal.t;

public abstract class a {
    public static Context a;
    public static Boolean b;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static boolean a(Context var0) {
        block10 : {
            block9 : {
                block8 : {
                    // MONITORENTER : G2.a.class
                    var2_3 = var0.getApplicationContext();
                    var3_4 = a.a;
                    if (var3_4 == null || (var4_5 = a.b) == null || var3_4 != var2_3) break block8;
                    var1_6 = var4_5;
                    return var1_6;
                }
                a.b = null;
                if (!l.h()) break block9;
                var0 = Boolean.valueOf((boolean)t.a(var2_3.getPackageManager()));
lbl17: // 2 sources:
                a.b = var0;
                break block10;
            }
            var0.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
            a.b = Boolean.TRUE;
            catch (ClassNotFoundException var0_2) {}
        }
        a.a = var2_3;
        var1_7 = a.b;
        // MONITOREXIT : G2.a.class
        return var1_7;
        var0 = Boolean.FALSE;
        ** GOTO lbl17
    }
}

