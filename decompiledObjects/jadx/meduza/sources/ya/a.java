package ya;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f17454a;

    public a(ConnectivityManager connectivityManager) {
        this.f17454a = connectivityManager;
    }

    public static ArrayList a(NetworkCapabilities networkCapabilities) {
        ArrayList arrayList = new ArrayList();
        if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
            arrayList.add("none");
            return arrayList;
        }
        if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(5)) {
            arrayList.add("wifi");
        }
        if (networkCapabilities.hasTransport(3)) {
            arrayList.add("ethernet");
        }
        if (networkCapabilities.hasTransport(4)) {
            arrayList.add("vpn");
        }
        if (networkCapabilities.hasTransport(0)) {
            arrayList.add("mobile");
        }
        if (networkCapabilities.hasTransport(2)) {
            arrayList.add("bluetooth");
        }
        if (arrayList.isEmpty() && networkCapabilities.hasCapability(12)) {
            arrayList.add("other");
        }
        if (arrayList.isEmpty()) {
            arrayList.add("none");
        }
        return arrayList;
    }
}
