// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package G1;

import android.os.BaseBundle;
import x1.N;
import O1.C;
import android.content.pm.ApplicationInfo;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.x;
import y1.p;
import y1.F;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import android.content.Context;
import T1.a;

public final class n
{
    public static final n a;
    public static final String b;
    public static final long[] c;
    
    static {
        a = new n();
        b = n.class.getCanonicalName();
        c = new long[] { 300000L, 900000L, 1800000L, 3600000L, 21600000L, 43200000L, 86400000L, 172800000L, 259200000L, 604800000L, 1209600000L, 1814400000L, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L };
    }
    
    public static final int b(final long n) {
        if (T1.a.d(n.class)) {
            return 0;
        }
        int n2 = 0;
        Label_0049: {
            try {
                while (true) {
                    final long[] c = n.c;
                    if (n2 >= c.length || c[n2] >= n) {
                        break;
                    }
                    ++n2;
                }
            }
            finally {
                break Label_0049;
            }
            return n2;
        }
        final Throwable t;
        T1.a.b(t, n.class);
        return 0;
    }
    
    public static final void c(final String s, o o, final String s2, final Context context) {
        if (T1.a.d(n.class)) {
            return;
        }
        while (true) {
        Label_0132:
            while (true) {
                Label_0139: {
                    try {
                        Intrinsics.checkNotNullParameter(s, "activityName");
                        Intrinsics.checkNotNullParameter(context, "context");
                        final Object o2 = "Unclassified";
                        if (o == null) {
                            o = (o)o2;
                        }
                        else {
                            o = (o)o.toString();
                            if (o != null) {
                                break Label_0139;
                            }
                            o = (o)o2;
                        }
                        final Bundle bundle = new Bundle();
                        ((BaseBundle)bundle).putString("fb_mobile_launch_source", (String)o);
                        ((BaseBundle)bundle).putString("fb_mobile_pckg_fp", n.a.a(context));
                        ((BaseBundle)bundle).putString("fb_mobile_app_cert_hash", X1.a.a(context));
                        o = (o)F.b;
                        final F a = ((F.a)o).a(s, s2, null);
                        a.d("fb_mobile_activate_app", bundle);
                        if (((F.a)o).c() != p.b.p) {
                            a.a();
                            return;
                        }
                    }
                    finally {
                        break Label_0132;
                    }
                    return;
                }
                continue;
            }
            T1.a.b((Throwable)s, n.class);
        }
    }
    
    public static final void e(String s, m e, final String s2) {
        if (T1.a.d(n.class)) {
            return;
        }
        while (true) {
            while (true) {
                Object o = null;
                Label_0297: {
                    while (true) {
                        try {
                            Intrinsics.checkNotNullParameter(s, "activityName");
                            if (e == null) {
                                return;
                            }
                            final Long b = e.b();
                            final long n = 0L;
                            long n2;
                            if (b == null) {
                                final Long e2 = e.e();
                                if (e2 == null) {
                                    n2 = 0L;
                                }
                                else {
                                    n2 = e2;
                                }
                                n2 = 0L - n2;
                            }
                            else {
                                n2 = b;
                            }
                            long n3 = n2;
                            if (n2 < 0L) {
                                G1.n.a.d();
                                n3 = 0L;
                            }
                            if ((n2 = e.f()) < 0L) {
                                G1.n.a.d();
                                n2 = 0L;
                            }
                            final Bundle bundle = new Bundle();
                            ((BaseBundle)bundle).putInt("fb_mobile_app_interruptions", e.c());
                            final x a = x.a;
                            final String format = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[] { b(n3) }, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                            ((BaseBundle)bundle).putString("fb_mobile_time_between_sessions", format);
                            o = e.g();
                            final Object o2 = "Unclassified";
                            if (o != null) {
                                o = ((o)o).toString();
                                if (o != null) {
                                    break Label_0297;
                                }
                            }
                            ((BaseBundle)bundle).putString("fb_mobile_launch_source", (String)o2);
                            e = (m)e.e();
                            long longValue;
                            if (e == null) {
                                longValue = n;
                            }
                            else {
                                longValue = (long)e;
                            }
                            ((BaseBundle)bundle).putLong("_logTime", longValue / 1000);
                            F.b.a(s, s2, null).c("fb_mobile_deactivate_app", n2 / (double)1000L, bundle);
                            return;
                            T1.a.b((Throwable)s, n.class);
                            return;
                        }
                        finally {}
                        final String s3;
                        s = s3;
                        continue;
                    }
                }
                final Object o2 = o;
                continue;
            }
        }
    }
    
    public final String a(final Context context) {
        if (T1.a.d(this)) {
            return null;
        }
        while (true) {
            try {
                final PackageManager packageManager = context.getPackageManager();
                final String i = Intrinsics.i("PCKGCHKSUM;", packageManager.getPackageInfo(context.getPackageName(), 0).versionName);
                final SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                final String string = sharedPreferences.getString(i, (String)null);
                if (string != null && string.length() == 32) {
                    return string;
                }
                final String c = l.c(context, null);
                String b;
                if (c != null) {
                    b = c;
                }
                else {
                    final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                    Intrinsics.checkNotNullExpressionValue(applicationInfo, "pm.getApplicationInfo(context.packageName, 0)");
                    b = l.b(applicationInfo.sourceDir);
                }
                sharedPreferences.edit().putString(i, b).apply();
                return b;
                final Throwable t;
                T1.a.b(t, this);
                return null;
            }
            catch (Exception ex) {
                return null;
            }
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public final void d() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            final C.a e = C.e;
            final N s = N.s;
            final String b = n.b;
            Intrinsics.b(b);
            e.b(s, b, "Clock skew detected");
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
}
