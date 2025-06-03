// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x;

import android.os.Process;
import w.c;
import android.content.Context;

public abstract class b
{
    public static int a(final Context context, String s, int n, final int n2, String packageName) {
        if (context.checkPermission(s, n, n2) == -1) {
            return -1;
        }
        final String c = w.c.c(s);
        if (c == null) {
            return 0;
        }
        if ((s = packageName) == null) {
            final String[] packagesForUid = context.getPackageManager().getPackagesForUid(n2);
            if (packagesForUid == null) {
                return -1;
            }
            if (packagesForUid.length <= 0) {
                return -1;
            }
            s = packagesForUid[0];
        }
        n = Process.myUid();
        packageName = context.getPackageName();
        if (n == n2 && H.c.a(packageName, s)) {
            n = w.c.a(context, n2, c, s);
        }
        else {
            n = w.c.b(context, c, s);
        }
        if (n == 0) {
            return 0;
        }
        return -2;
    }
    
    public static int b(final Context context, final String s) {
        return a(context, s, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
