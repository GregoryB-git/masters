package y2;

import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class n {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        ec.i.e(connectivityManager, "<this>");
        ec.i.e(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
