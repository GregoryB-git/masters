// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x2;

import android.app.PendingIntent;
import android.content.pm.PackageManager$NameNotFoundException;
import G2.d;
import android.text.TextUtils;
import E2.i;
import A2.l0;
import android.content.Intent;
import android.content.Context;

public class k
{
    public static final int a;
    public static final k b;
    
    static {
        a = n.a;
        b = new k();
    }
    
    public static k f() {
        return k.b;
    }
    
    public int a(final Context context) {
        return n.a(context);
    }
    
    public Intent b(final Context context, final int n, final String str) {
        if (n != 1 && n != 2) {
            if (n != 3) {
                return null;
            }
            return l0.c("com.google.android.gms");
        }
        else {
            if (context != null && i.d(context)) {
                return l0.a();
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(k.a);
            sb.append("-");
            if (!TextUtils.isEmpty((CharSequence)str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            Label_0144: {
                if (context == null) {
                    break Label_0144;
                }
                try {
                    sb.append(d.a(context).e(context.getPackageName(), 0).versionCode);
                    return l0.b("com.google.android.gms", sb.toString());
                }
                catch (PackageManager$NameNotFoundException ex) {
                    return l0.b("com.google.android.gms", sb.toString());
                }
            }
        }
    }
    
    public PendingIntent c(final Context context, final int n, final int n2) {
        return this.d(context, n, n2, null);
    }
    
    public PendingIntent d(final Context context, final int n, final int n2, final String s) {
        final Intent b = this.b(context, n, s);
        if (b == null) {
            return null;
        }
        return PendingIntent.getActivity(context, n2, b, M2.d.a | 0x8000000);
    }
    
    public String e(final int n) {
        return n.b(n);
    }
    
    public int g(final Context context) {
        return this.h(context, k.a);
    }
    
    public int h(final Context context, int e) {
        e = n.e(context, e);
        if (n.f(context, e)) {
            return 18;
        }
        return e;
    }
    
    public boolean i(final Context context, final String s) {
        return n.j(context, s);
    }
    
    public boolean j(final int n) {
        return n.h(n);
    }
}
