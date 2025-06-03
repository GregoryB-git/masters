/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package A2;

import G2.d;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

public abstract class Q {
    public static final Object a = new Object();
    public static boolean b;
    public static String c;
    public static int d;

    public static int a(Context context) {
        Q.b(context);
        return d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(Context object) {
        Object object2 = a;
        synchronized (object2) {
            try {
                block7 : {
                    if (b) {
                        return;
                    }
                    b = true;
                    String string2 = object.getPackageName();
                    object = d.a((Context)object);
                    object = object.c((String)string2, (int)128).metaData;
                    if (object != null) break block7;
                    return;
                }
                try {
                    c = object.getString("com.google.app.id");
                    d = object.getInt("com.google.android.gms.version");
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    Log.wtf((String)"MetadataValueReader", (String)"This should never happen.", (Throwable)nameNotFoundException);
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

