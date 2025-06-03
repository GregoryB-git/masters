package j6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class j {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f8501b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f8502c = false;

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final AtomicBoolean f8500a = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f8503d = new AtomicBoolean();

    @Deprecated
    public static void a(Context context, int i10) {
        f fVar = f.f8490b;
        int c10 = fVar.c(context, i10);
        if (c10 != 0) {
            Intent a10 = fVar.a(context, "e", c10);
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + c10);
            if (a10 != null) {
                throw new h(c10, a10);
            }
            throw new g(c10);
        }
    }

    public static boolean b(Context context) {
        try {
            if (!f8502c) {
                try {
                    PackageInfo b10 = x6.d.a(context).b(64, "com.google.android.gms");
                    k.a(context);
                    if (b10 == null || k.d(b10, false) || !k.d(b10, true)) {
                        f8501b = false;
                    } else {
                        f8501b = true;
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                }
            }
            return f8501b || !Constants.USER.equals(Build.TYPE);
        } finally {
            f8502c = true;
        }
    }

    public static boolean c(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
