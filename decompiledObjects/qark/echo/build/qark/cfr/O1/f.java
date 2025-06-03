/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.content.pm.ServiceInfo
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.List
 */
package O1;

import O1.Q;
import T1.a;
import W5.g;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x1.B;

public final class f {
    public static final f a = new f();
    public static final String[] b = new String[]{"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String a() {
        if (a.d(f.class)) {
            return null;
        }
        try {
            ServiceInfo serviceInfo;
            Object object = B.l();
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            intent = object.getPackageManager().queryIntentServices(intent, 0);
            Intrinsics.checkNotNullExpressionValue((Object)intent, "context.packageManager.queryIntentServices(serviceIntent, 0)");
            object = g.t(b);
            intent = intent.iterator();
            do {
                if (!intent.hasNext()) return null;
            } while ((serviceInfo = ((ResolveInfo)intent.next()).serviceInfo) == null || !object.contains((Object)serviceInfo.packageName));
            return serviceInfo.packageName;
        }
        catch (Throwable throwable) {}
        a.b(throwable, f.class);
        return null;
    }

    public static final String b() {
        if (a.d(f.class)) {
            return null;
        }
        try {
            String string2 = Intrinsics.i("fbconnect://cct.", B.l().getPackageName());
            return string2;
        }
        catch (Throwable throwable) {
            a.b(throwable, f.class);
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String c(String string2) {
        if (a.d(f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(string2, "developerDefinedRedirectURI");
            Q q8 = Q.a;
            if (Q.d(B.l(), string2)) {
                return string2;
            }
            if (Q.d(B.l(), f.b())) {
                return f.b();
            }
            return "";
        }
        catch (Throwable throwable) {}
        a.b(throwable, f.class);
        return null;
    }
}

