/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.os.Bundle
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.Locale
 */
package G1;

import G1.l;
import G1.m;
import G1.o;
import O1.C;
import X1.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import x1.N;
import y1.F;
import y1.p;

public final class n {
    public static final n a = new n();
    public static final String b = n.class.getCanonicalName();
    public static final long[] c = new long[]{300000L, 900000L, 1800000L, 3600000L, 21600000L, 43200000L, 86400000L, 172800000L, 259200000L, 604800000L, 1209600000L, 1814400000L, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final int b(long l8) {
        if (T1.a.d(n.class)) {
            return 0;
        }
        n8 = 0;
        do lbl-1000: // 2 sources:
        {
            arrl = n.c;
            if (n8 >= arrl.length) return n8;
            break;
        } while (true);
        catch (Throwable throwable222) {}
        {
            l9 = arrl[n8];
            if (l9 >= l8) return n8;
            ++n8;
            ** while (true)
        }
        T1.a.b(throwable222, n.class);
        return 0;
    }

    public static final void c(String object, o object2, String string2, Context context) {
        Throwable throwable2;
        block9 : {
            block8 : {
                String string3;
                block7 : {
                    block6 : {
                        if (T1.a.d(n.class)) {
                            return;
                        }
                        try {
                            Intrinsics.checkNotNullParameter(object, "activityName");
                            Intrinsics.checkNotNullParameter((Object)context, "context");
                            string3 = "Unclassified";
                            if (object2 != null) break block6;
                            object2 = string3;
                            break block7;
                        }
                        catch (Throwable throwable2) {}
                    }
                    object2 = object2.toString();
                    if (object2 != null) break block7;
                    object2 = string3;
                }
                string3 = new Bundle();
                string3.putString("fb_mobile_launch_source", (String)object2);
                string3.putString("fb_mobile_pckg_fp", a.a(context));
                string3.putString("fb_mobile_app_cert_hash", a.a(context));
                object2 = F.b;
                object = object2.a((String)object, string2, null);
                object.d("fb_mobile_activate_app", (Bundle)string3);
                if (object2.c() != p.b.p) {
                    object.a();
                    return;
                }
                break block8;
                break block9;
            }
            return;
        }
        T1.a.b(throwable2, n.class);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void e(String string2, m m8, String string3) {
        long l8;
        long l9;
        long l10;
        Object object;
        Bundle bundle;
        block9 : {
            Object object2;
            block8 : {
                if (T1.a.d(n.class)) {
                    return;
                }
                try {
                    long l11;
                    Intrinsics.checkNotNullParameter(string2, "activityName");
                    if (m8 == null) {
                        return;
                    }
                    object = m8.b();
                    l9 = 0L;
                    if (object != null) {
                        l8 = object.longValue();
                    } else {
                        object = m8.e();
                        l8 = object == null ? 0L : object.longValue();
                        l8 = 0L - l8;
                    }
                    l10 = l8;
                    if (l8 < 0L) {
                        a.d();
                        l10 = 0L;
                    }
                    l8 = l11 = m8.f();
                    if (l11 < 0L) {
                        a.d();
                        l8 = 0L;
                    }
                    bundle = new Bundle();
                    bundle.putInt("fb_mobile_app_interruptions", m8.c());
                    object = x.a;
                    object = String.format((Locale)Locale.ROOT, (String)"session_quanta_%d", (Object[])Arrays.copyOf((Object[])new Object[]{n.b(l10)}, (int)1));
                    Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(locale, format, *args)");
                    bundle.putString("fb_mobile_time_between_sessions", (String)object);
                    object2 = m8.g();
                    object = "Unclassified";
                    if (object2 != null && (object2 = object2.toString()) != null) break block8;
                    break block9;
                }
                catch (Throwable throwable) {}
                T1.a.b(throwable, n.class);
                return;
            }
            object = object2;
        }
        bundle.putString("fb_mobile_launch_source", (String)object);
        m8 = m8.e();
        l10 = m8 == null ? l9 : m8.longValue();
        bundle.putLong("_logTime", l10 / (long)1000);
        F.b.a(string2, string3, null).c("fb_mobile_deactivate_app", (double)l8 / (double)1000L, bundle);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String a(Context object) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = object.getPackageManager();
            String string2 = Intrinsics.i("PCKGCHKSUM;", packageManager.getPackageInfo((String)object.getPackageName(), (int)0).versionName);
            SharedPreferences sharedPreferences = object.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string3 = sharedPreferences.getString(string2, null);
            if (string3 != null && string3.length() == 32) {
                return string3;
            }
            string3 = l.c((Context)object, null);
            if (string3 != null) {
                object = string3;
            } else {
                object = packageManager.getApplicationInfo(object.getPackageName(), 0);
                Intrinsics.checkNotNullExpressionValue(object, "pm.getApplicationInfo(context.packageName, 0)");
                object = l.b(object.sourceDir);
            }
            sharedPreferences.edit().putString(string2, (String)object).apply();
            return object;
        }
        catch (Exception exception) {
            return null;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
        return null;
    }

    public final void d() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            C.a a8 = C.e;
            N n8 = N.s;
            String string2 = b;
            Intrinsics.b(string2);
            a8.b(n8, string2, "Clock skew detected");
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return;
        }
    }
}

