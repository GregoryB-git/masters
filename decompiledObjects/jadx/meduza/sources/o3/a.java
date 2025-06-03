package o3;

import android.os.Build;
import android.util.Log;
import defpackage.g;

/* loaded from: classes.dex */
public final class a {
    public static void a(String str, String str2, Object obj) {
        String c10 = c(str);
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, String.format(str2, obj));
        }
    }

    public static void b(String str, String str2, Exception exc) {
        String c10 = c(str);
        if (Log.isLoggable(c10, 6)) {
            Log.e(c10, str2, exc);
        }
    }

    public static String c(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return g.d("TRuntime.", str);
        }
        String d10 = g.d("TRuntime.", str);
        return d10.length() > 23 ? d10.substring(0, 23) : d10;
    }
}
