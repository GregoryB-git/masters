// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package M4;

import android.os.BaseBundle;
import B6.c;
import F4.a;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;

public abstract class o
{
    public static Boolean a;
    
    public static void a(final boolean b, final String s) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(s);
    }
    
    public static boolean b(Context ex) {
        final Boolean a = o.a;
        if (a != null) {
            return a;
        }
        try {
            ex = (NullPointerException)(o.a = ((BaseBundle)((Context)ex).getPackageManager().getApplicationInfo(((Context)ex).getPackageName(), 128).metaData).getBoolean("firebase_performance_logcat_enabled", false));
            return (boolean)ex;
        }
        catch (NullPointerException ex) {}
        catch (PackageManager$NameNotFoundException ex2) {}
        final a e = F4.a.e();
        final StringBuilder sb = new StringBuilder();
        sb.append("No perf logcat meta data found ");
        sb.append(ex.getMessage());
        e.a(sb.toString());
        return false;
    }
    
    public static int c(final long n) {
        if (n > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (n < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int)n;
    }
    
    public static String d(String string) {
        final c n = c.n(string);
        if (n != null) {
            string = n.m().r("").j("").n(null).e(null).toString();
        }
        return string;
    }
    
    public static String e(final String s, final int n) {
        if (s.length() <= n) {
            return s;
        }
        if (s.charAt(n) == '/') {
            return s.substring(0, n);
        }
        final c n2 = c.n(s);
        if (n2 == null) {
            return s.substring(0, n);
        }
        if (n2.g().lastIndexOf(47) >= 0) {
            final int lastIndex = s.lastIndexOf(47, n - 1);
            if (lastIndex >= 0) {
                return s.substring(0, lastIndex);
            }
        }
        return s.substring(0, n);
    }
}
