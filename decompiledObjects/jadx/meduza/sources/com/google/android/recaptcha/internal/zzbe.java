package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import ec.i;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import rb.d;
import sb.u;
import sb.y;

/* loaded from: classes.dex */
public final class zzbe {
    public zzbe() {
        new ConcurrentHashMap();
        zzb();
    }

    public static final Set zza(Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            i.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                linkedHashSet.add(zzqi.TRANSPORT_WIFI);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                linkedHashSet.add(zzqi.TRANSPORT_CELLULAR);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                linkedHashSet.add(zzqi.TRANSPORT_VPN);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                linkedHashSet.add(zzqi.TRANSPORT_ETHERNET);
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                linkedHashSet.add(zzqi.NET_CAPABILITY_VALIDATED);
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return u.f14326a;
        }
    }

    private static final Map zzb() {
        d[] dVarArr = {new d(0, zzqi.NET_CAPABILITY_MMS), new d(1, zzqi.NET_CAPABILITY_SUPL), new d(2, zzqi.NET_CAPABILITY_DUN), new d(3, zzqi.NET_CAPABILITY_FOTA), new d(4, zzqi.NET_CAPABILITY_IMS), new d(5, zzqi.NET_CAPABILITY_CBS), new d(6, zzqi.NET_CAPABILITY_WIFI_P2P), new d(7, zzqi.NET_CAPABILITY_IA), new d(8, zzqi.NET_CAPABILITY_RCS), new d(9, zzqi.NET_CAPABILITY_XCAP), new d(10, zzqi.NET_CAPABILITY_EIMS), new d(11, zzqi.NET_CAPABILITY_NOT_METERED), new d(12, zzqi.NET_CAPABILITY_INTERNET), new d(13, zzqi.NET_CAPABILITY_NOT_RESTRICTED), new d(14, zzqi.NET_CAPABILITY_TRUSTED), new d(15, zzqi.NET_CAPABILITY_NOT_VPN)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(y.H0(16));
        for (int i10 = 0; i10 < 16; i10++) {
            d dVar = dVarArr[i10];
            linkedHashMap.put(dVar.f13844a, dVar.f13845b);
        }
        int i11 = Build.VERSION.SDK_INT;
        linkedHashMap.put(17, zzqi.NET_CAPABILITY_CAPTIVE_PORTAL);
        linkedHashMap.put(16, zzqi.NET_CAPABILITY_VALIDATED);
        if (i11 >= 28) {
            linkedHashMap.put(18, zzqi.NET_CAPABILITY_NOT_ROAMING);
            linkedHashMap.put(19, zzqi.NET_CAPABILITY_FOREGROUND);
            linkedHashMap.put(20, zzqi.NET_CAPABILITY_NOT_CONGESTED);
            linkedHashMap.put(21, zzqi.NET_CAPABILITY_NOT_SUSPENDED);
        }
        if (i11 >= 29) {
            linkedHashMap.put(23, zzqi.NET_CAPABILITY_MCX);
        }
        if (i11 >= 30) {
            linkedHashMap.put(25, zzqi.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i11 >= 31) {
            linkedHashMap.put(32, zzqi.NET_CAPABILITY_HEAD_UNIT);
            linkedHashMap.put(29, zzqi.NET_CAPABILITY_ENTERPRISE);
        }
        if (i11 >= 33) {
            linkedHashMap.put(35, zzqi.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            linkedHashMap.put(34, zzqi.NET_CAPABILITY_PRIORITIZE_LATENCY);
            linkedHashMap.put(33, zzqi.NET_CAPABILITY_MMTEL);
        }
        return linkedHashMap;
    }
}
