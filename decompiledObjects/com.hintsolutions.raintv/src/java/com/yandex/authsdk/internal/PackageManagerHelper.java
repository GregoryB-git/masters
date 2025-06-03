/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.Signature
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.math.BigInteger
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package com.yandex.authsdk.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.authsdk.YandexAuthOptions;
import com.yandex.authsdk.internal.Logger;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PackageManagerHelper {
    public static final String META_AM_INTERNAL_VERSION = "com.yandex.auth.INTERNAL_VERSION";
    public static final String META_AM_VERSION = "com.yandex.auth.VERSION";
    public static final String META_SDK_VERSION = "com.yandex.auth.LOGIN_SDK_VERSION";
    private static final String TAG = "PackageManagerHelper";
    public static final String YANDEX_FINGERPRINT = "5D224274D9377C35DA777AD934C65C8CCA6E7A20";
    @NonNull
    private final YandexAuthOptions options;
    @NonNull
    private final PackageManager packageManager;

    public PackageManagerHelper(@NonNull PackageManager packageManager, @NonNull YandexAuthOptions yandexAuthOptions) {
        this.packageManager = packageManager;
        this.options = yandexAuthOptions;
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    private List<String> extractFingerprints(@NonNull String string2) {
        void var1_4;
        block5: {
            PackageInfo packageInfo;
            try {
                packageInfo = this.packageManager.getPackageInfo(string2, 64);
                string2 = new ArrayList(packageInfo.signatures.length);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                break block5;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                // empty catch block
            }
            for (Signature signature : packageInfo.signatures) {
                MessageDigest messageDigest = MessageDigest.getInstance((String)"SHA");
                messageDigest.update(signature.toByteArray());
                string2.add((Object)PackageManagerHelper.toHex(messageDigest.digest()));
            }
            return string2;
        }
        Logger.e(this.options, TAG, "Error getting fingerprint", (Throwable)var1_4);
        return null;
    }

    @NonNull
    private List<YandexApplicationInfo> findLoginSdkApplications() {
        ArrayList arrayList = new ArrayList();
        for (Object object : this.packageManager.getInstalledApplications(128)) {
            List<String> list;
            Bundle bundle = object.metaData;
            object = object.packageName;
            if (bundle == null || !bundle.containsKey(META_SDK_VERSION) || !bundle.containsKey(META_AM_VERSION) || (list = this.extractFingerprints((String)object)) == null || !list.contains((Object)YANDEX_FINGERPRINT)) continue;
            arrayList.add((Object)new YandexApplicationInfo((String)object, bundle.getInt(META_SDK_VERSION), bundle.getFloat(META_AM_VERSION), bundle.getInt(META_AM_INTERNAL_VERSION, -1)));
        }
        return arrayList;
    }

    @NonNull
    private static String toHex(@NonNull byte[] byArray) {
        BigInteger bigInteger = new BigInteger(1, byArray);
        return String.format((String)z2.q(z2.t("%0"), byArray.length << 1, "X"), (Object[])new Object[]{bigInteger});
    }

    @Nullable
    public YandexApplicationInfo findLatestApplication() {
        Iterator iterator = this.findLoginSdkApplications().iterator();
        YandexApplicationInfo yandexApplicationInfo = null;
        while (iterator.hasNext()) {
            YandexApplicationInfo yandexApplicationInfo2 = (YandexApplicationInfo)iterator.next();
            if (yandexApplicationInfo != null && !(yandexApplicationInfo2.amVersion > yandexApplicationInfo.amVersion) && !(yandexApplicationInfo2.amInternalVersion > yandexApplicationInfo.amInternalVersion)) continue;
            yandexApplicationInfo = yandexApplicationInfo2;
        }
        return yandexApplicationInfo;
    }

    public static class YandexApplicationInfo {
        public final float amInternalVersion;
        public final float amVersion;
        public final int loginSdkVersion;
        @NonNull
        public final String packageName;

        public YandexApplicationInfo(@NonNull String string2, int n, float f2, int n3) {
            this.packageName = string2;
            this.loginSdkVersion = n;
            this.amVersion = f2;
            this.amInternalVersion = n3;
        }
    }
}

