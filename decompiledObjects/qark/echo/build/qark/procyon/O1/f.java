// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import android.content.pm.ServiceInfo;
import java.util.Iterator;
import java.util.HashSet;
import java.util.List;
import android.content.pm.ResolveInfo;
import W5.g;
import kotlin.jvm.internal.Intrinsics;
import android.content.Intent;
import x1.B;
import T1.a;

public final class f
{
    public static final f a;
    public static final String[] b;
    
    static {
        a = new f();
        b = new String[] { "com.android.chrome", "com.chrome.beta", "com.chrome.dev" };
    }
    
    public static final String a() {
        if (T1.a.d(f.class)) {
            return null;
        }
        Label_0106: {
            try {
                final List queryIntentServices = B.l().getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                Intrinsics.checkNotNullExpressionValue(queryIntentServices, "context.packageManager.queryIntentServices(serviceIntent, 0)");
                final HashSet t = g.t(f.b);
                final Iterator<ResolveInfo> iterator = queryIntentServices.iterator();
                while (iterator.hasNext()) {
                    final ServiceInfo serviceInfo = iterator.next().serviceInfo;
                    if (serviceInfo != null && t.contains(serviceInfo.packageName)) {
                        return serviceInfo.packageName;
                    }
                }
                return null;
            }
            finally {
                break Label_0106;
            }
            return null;
        }
        final Throwable t2;
        T1.a.b(t2, f.class);
        return null;
    }
    
    public static final String b() {
        if (T1.a.d(f.class)) {
            return null;
        }
        try {
            return Intrinsics.i("fbconnect://cct.", B.l().getPackageName());
        }
        finally {
            final Throwable t;
            T1.a.b(t, f.class);
            return null;
        }
    }
    
    public static final String c(final String s) {
        if (T1.a.d(f.class)) {
            return null;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(s, "developerDefinedRedirectURI");
                final Q a = Q.a;
                if (Q.d(B.l(), s)) {
                    return s;
                }
                if (Q.d(B.l(), b())) {
                    return b();
                }
                return "";
                final Throwable t;
                T1.a.b(t, f.class);
                return null;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
