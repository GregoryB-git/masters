/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.os.Process
 *  java.lang.Object
 *  java.lang.String
 */
package x;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import w.c;

public abstract class b {
    public static int a(Context context, String arrstring, int n8, int n9, String string2) {
        if (context.checkPermission((String)arrstring, n8, n9) == -1) {
            return -1;
        }
        String string3 = c.c((String)arrstring);
        if (string3 == null) {
            return 0;
        }
        arrstring = string2;
        if (string2 == null) {
            arrstring = context.getPackageManager().getPackagesForUid(n9);
            if (arrstring != null) {
                if (arrstring.length <= 0) {
                    return -1;
                }
                arrstring = arrstring[0];
            } else {
                return -1;
            }
        }
        n8 = Process.myUid();
        string2 = context.getPackageName();
        n8 = n8 == n9 && H.c.a(string2, arrstring) ? c.a(context, n9, string3, (String)arrstring) : c.b(context, string3, (String)arrstring);
        if (n8 == 0) {
            return 0;
        }
        return -2;
    }

    public static int b(Context context, String string2) {
        return b.a(context, string2, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}

