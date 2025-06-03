package y2;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes.dex */
public final class m {
    public static final Network a(ConnectivityManager connectivityManager) {
        ec.i.e(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
