package v2;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15224a;

    static {
        String f = o2.j.f("NetworkStateTracker");
        ec.i.d(f, "tagWithPrefix(\"NetworkStateTracker\")");
        f15224a = f;
    }

    public static final t2.c a(ConnectivityManager connectivityManager) {
        boolean z10;
        NetworkCapabilities a10;
        ec.i.e(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            a10 = y2.l.a(connectivityManager, y2.m.a(connectivityManager));
        } catch (SecurityException e10) {
            o2.j.d().c(f15224a, "Unable to validate active network", e10);
        }
        if (a10 != null) {
            z10 = y2.l.b(a10, 16);
            return new t2.c(z11, z10, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
        }
        z10 = false;
        return new t2.c(z11, z10, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
    }
}
