package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;

/* loaded from: classes.dex */
public final class AFa1kSDK {

    public static final class AFa1zSDK {
        public final String AFInAppEventParameterName;
        public final String AFInAppEventType;
        public final String valueOf;

        public AFa1zSDK(@NonNull String str, String str2, String str3) {
            this.AFInAppEventParameterName = str;
            this.AFInAppEventType = str2;
            this.valueOf = str3;
        }
    }

    private static boolean values(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }

    public final AFa1zSDK AFInAppEventParameterName(@NonNull Context context) {
        String str;
        String str2;
        TelephonyManager telephonyManager;
        String str3 = "unknown";
        String str4 = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                Network[] allNetworks = connectivityManager.getAllNetworks();
                int length = allNetworks.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i7]);
                    if (!values(networkInfo)) {
                        i7++;
                    } else if (1 == networkInfo.getType()) {
                        str3 = "WIFI";
                    } else if (networkInfo.getType() == 0) {
                        str3 = "MOBILE";
                    }
                }
            }
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
            str2 = telephonyManager.getSimOperatorName();
        } catch (Throwable th) {
            th = th;
            str = null;
        }
        try {
            str4 = telephonyManager.getNetworkOperatorName();
        } catch (Throwable th2) {
            th = th2;
            str = str4;
            str4 = str2;
            AFLogger.afErrorLog("Exception while collecting network info. ", th);
            String str5 = str;
            str2 = str4;
            str4 = str5;
            return new AFa1zSDK(str3, str4, str2);
        }
        if (str4 != null) {
            if (str4.isEmpty()) {
            }
            return new AFa1zSDK(str3, str4, str2);
        }
        if (2 == telephonyManager.getPhoneType()) {
            str4 = "CDMA";
        }
        return new AFa1zSDK(str3, str4, str2);
    }
}
