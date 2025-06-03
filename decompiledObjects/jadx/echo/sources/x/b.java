package x;

import android.content.Context;
import android.os.Process;
import w.c;

/* loaded from: classes.dex */
public abstract class b {
    public static int a(Context context, String str, int i7, int i8, String str2) {
        if (context.checkPermission(str, i7, i8) == -1) {
            return -1;
        }
        String c7 = c.c(str);
        if (c7 == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i8);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return ((Process.myUid() != i8 || !H.c.a(context.getPackageName(), str2)) ? c.b(context, c7, str2) : c.a(context, i8, c7, str2)) == 0 ? 0 : -2;
    }

    public static int b(Context context, String str) {
        return a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
