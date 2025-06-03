/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.net.Network
 *  android.net.NetworkInfo
 *  android.telephony.TelephonyManager
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;

public final class AFa1kSDK {
    private static boolean values(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final AFa1zSDK AFInAppEventParameterName(@NonNull Context var1_1) {
        block15 : {
            var6_2 = "unknown";
            var8_4 = null;
            var7_5 = null;
            var5_7 = var6_2;
            try {
                var9_8 = (ConnectivityManager)var1_1.getSystemService("connectivity");
                var4_9 = var6_2;
                if (var9_8 != null) {
                    var5_7 = var6_2;
                    var10_10 = var9_8.getAllNetworks();
                    var5_7 = var6_2;
                    var3_11 = var10_10.length;
                    var2_12 = 0;
                }
                ** GOTO lbl37
            }
            catch (Throwable var6_3) {
                var8_4 = null;
                var4_9 = var5_7;
                var1_1 = var7_5;
                var5_7 = var8_4;
                break block15;
            }
            do {
                block17 : {
                    block16 : {
                        var4_9 = var6_2;
                        if (var2_12 >= var3_11) break block16;
                        var5_7 = var6_2;
                        var11_13 = var9_8.getNetworkInfo((Network)var10_10[var2_12]);
                        var5_7 = var6_2;
                        if (!AFa1kSDK.values(var11_13)) break block17;
                        var5_7 = var6_2;
                        if (1 == var11_13.getType()) {
                            var4_9 = "WIFI";
                        } else {
                            var4_9 = var6_2;
                            var5_7 = var6_2;
                            if (var11_13.getType() == 0) {
                                var4_9 = "MOBILE";
                            }
                        }
                    }
                    var5_7 = var4_9;
                    var10_10 = (TelephonyManager)var1_1.getSystemService("phone");
                    var5_7 = var4_9;
                    var6_2 = var10_10.getSimOperatorName();
                    var5_7 = var8_4;
                    var9_8 = var10_10.getNetworkOperatorName();
                    if (var9_8 != null) {
                        var8_4 = var4_9;
                        var1_1 = var9_8;
                        var7_5 = var6_2;
                        var5_7 = var9_8;
                        if (var9_8.isEmpty() == false) return new AFa1zSDK(var8_4, (String)var1_1, (String)var7_5);
                    }
                    var8_4 = var4_9;
                    var1_1 = var9_8;
                    var7_5 = var6_2;
                    var5_7 = var9_8;
                    if (2 != var10_10.getPhoneType()) return new AFa1zSDK(var8_4, (String)var1_1, (String)var7_5);
                    var1_1 = "CDMA";
                    var8_4 = var4_9;
                    var7_5 = var6_2;
                    return new AFa1zSDK(var8_4, (String)var1_1, (String)var7_5);
                }
                ++var2_12;
            } while (true);
            catch (Throwable var7_6) {
                var1_1 = var6_2;
                var6_2 = var7_6;
            }
        }
        AFLogger.afErrorLog("Exception while collecting network info. ", (Throwable)var6_2);
        var7_5 = var1_1;
        var1_1 = var5_7;
        var8_4 = var4_9;
        return new AFa1zSDK(var8_4, (String)var1_1, (String)var7_5);
    }

    public static final class AFa1zSDK {
        public final String AFInAppEventParameterName;
        public final String AFInAppEventType;
        public final String valueOf;

        public AFa1zSDK(@NonNull String string2, String string3, String string4) {
            this.AFInAppEventParameterName = string2;
            this.AFInAppEventType = string3;
            this.valueOf = string4;
        }
    }

}

