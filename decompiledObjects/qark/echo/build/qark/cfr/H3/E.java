/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package H3;

import android.content.Context;
import android.content.pm.PackageManager;

public class E {
    public String a;

    public static String b(Context object) {
        String string2 = object.getPackageManager().getInstallerPackageName(object.getPackageName());
        object = string2;
        if (string2 == null) {
            object = "";
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String a(Context object) {
        synchronized (this) {
            try {
                if (this.a == null) {
                    this.a = E.b((Context)object);
                }
                if (!"".equals((Object)this.a)) return this.a;
                return null;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

