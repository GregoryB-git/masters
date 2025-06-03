package G1;

import O1.C;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import x1.N;
import y1.C2237F;
import y1.C2259p;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f2071a = new n();

    /* renamed from: b, reason: collision with root package name */
    public static final String f2072b = n.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    public static final long[] f2073c = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    public static final int b(long j7) {
        if (T1.a.d(n.class)) {
            return 0;
        }
        int i7 = 0;
        while (true) {
            try {
                long[] jArr = f2073c;
                if (i7 >= jArr.length || jArr[i7] >= j7) {
                    break;
                }
                i7++;
            } catch (Throwable th) {
                T1.a.b(th, n.class);
                return 0;
            }
        }
        return i7;
    }

    public static final void c(String activityName, o oVar, String str, Context context) {
        String oVar2;
        if (T1.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(context, "context");
            String str2 = "Unclassified";
            if (oVar != null && (oVar2 = oVar.toString()) != null) {
                str2 = oVar2;
            }
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", str2);
            bundle.putString("fb_mobile_pckg_fp", f2071a.a(context));
            bundle.putString("fb_mobile_app_cert_hash", X1.a.a(context));
            C2237F.a aVar = C2237F.f21324b;
            C2237F a7 = aVar.a(activityName, str, null);
            a7.d("fb_mobile_activate_app", bundle);
            if (aVar.c() != C2259p.b.EXPLICIT_ONLY) {
                a7.a();
            }
        } catch (Throwable th) {
            T1.a.b(th, n.class);
        }
    }

    public static final void e(String activityName, m mVar, String str) {
        long longValue;
        String oVar;
        if (T1.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            if (mVar == null) {
                return;
            }
            Long b7 = mVar.b();
            long j7 = 0;
            if (b7 == null) {
                Long e7 = mVar.e();
                longValue = 0 - (e7 == null ? 0L : e7.longValue());
            } else {
                longValue = b7.longValue();
            }
            if (longValue < 0) {
                f2071a.d();
                longValue = 0;
            }
            long f7 = mVar.f();
            if (f7 < 0) {
                f2071a.d();
                f7 = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", mVar.c());
            x xVar = x.f16233a;
            String format = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(b(longValue))}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            bundle.putString("fb_mobile_time_between_sessions", format);
            o g7 = mVar.g();
            String str2 = "Unclassified";
            if (g7 != null && (oVar = g7.toString()) != null) {
                str2 = oVar;
            }
            bundle.putString("fb_mobile_launch_source", str2);
            Long e8 = mVar.e();
            if (e8 != null) {
                j7 = e8.longValue();
            }
            bundle.putLong("_logTime", j7 / 1000);
            C2237F.f21324b.a(activityName, str, null).c("fb_mobile_deactivate_app", f7 / 1000, bundle);
        } catch (Throwable th) {
            T1.a.b(th, n.class);
        }
    }

    public final String a(Context context) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String i7 = Intrinsics.i("PCKGCHKSUM;", packageManager.getPackageInfo(context.getPackageName(), 0).versionName);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(i7, null);
            if (string != null && string.length() == 32) {
                return string;
            }
            String c7 = l.c(context, null);
            if (c7 == null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "pm.getApplicationInfo(context.packageName, 0)");
                c7 = l.b(applicationInfo.sourceDir);
            }
            sharedPreferences.edit().putString(i7, c7).apply();
            return c7;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final void d() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            C.a aVar = C.f3715e;
            N n7 = N.APP_EVENTS;
            String str = f2072b;
            Intrinsics.b(str);
            aVar.b(n7, str, "Clock skew detected");
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }
}
