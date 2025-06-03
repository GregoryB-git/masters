/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.A2
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 */
package com.yandex.metrica;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.FeaturesResult;
import com.yandex.metrica.impl.ob.A2;
import java.util.List;
import java.util.Map;

public interface IParamsCallback {
    public static final String APP_METRICA_DEVICE_ID_HASH = "appmetrica_device_id_hash";
    public static final String YANDEX_MOBILE_METRICA_CLIDS = "yandex_mobile_metrica_clids";
    public static final String YANDEX_MOBILE_METRICA_DEVICE_ID = "yandex_mobile_metrica_device_id";
    public static final String YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED = "yandex_mobile_metrica_lib_ssl_enabled";
    public static final String YANDEX_MOBILE_METRICA_GET_AD_URL = "yandex_mobile_metrica_get_ad_url";
    public static final String YANDEX_MOBILE_METRICA_REPORT_AD_URL = "yandex_mobile_metrica_report_ad_url";
    public static final String YANDEX_MOBILE_METRICA_UUID = "yandex_mobile_metrica_uuid";

    public void onReceive(Result var1);

    public void onRequestError(Reason var1, Result var2);

    public static enum Reason {
        UNKNOWN,
        NETWORK,
        INVALID_RESPONSE,
        INCONSISTENT_CLIDS;

    }

    public static class Result {
        @Nullable
        private final Map<String, String> clids;
        @Nullable
        private final Map<String, List<String>> customSdkHosts;
        @Nullable
        private final String deviceId;
        @Nullable
        private final String deviceIdHash;
        @NonNull
        private final FeaturesResult features;
        @Nullable
        private final String getUrl;
        @Nullable
        private final String reportUrl;
        @Nullable
        private final String uuid;

        public Result(@Nullable String string2, @Nullable String string3, @Nullable String string4, @Nullable String string5, @Nullable String string6, @Nullable Map<String, String> map, @Nullable Map<String, List<String>> map2, @NonNull FeaturesResult featuresResult) {
            this.deviceId = string2;
            this.uuid = string3;
            this.reportUrl = string4;
            this.getUrl = string5;
            this.deviceIdHash = string6;
            this.clids = map;
            this.customSdkHosts = map2;
            this.features = featuresResult;
        }

        @Nullable
        public Map<String, String> getClids() {
            return this.clids;
        }

        @Nullable
        public Map<String, List<String>> getCustomSdkHosts() {
            return this.customSdkHosts;
        }

        @Nullable
        public String getDeviceId() {
            return this.deviceId;
        }

        @Nullable
        public String getDeviceIdHash() {
            return this.deviceIdHash;
        }

        @NonNull
        public FeaturesResult getFeatures() {
            return this.features;
        }

        @Nullable
        public String getGetUrl() {
            return this.getUrl;
        }

        @Nullable
        public String getReportUrl() {
            return this.reportUrl;
        }

        @Nullable
        public String getUuid() {
            return this.uuid;
        }

        public boolean hasClids() {
            return A2.b(this.clids) ^ true;
        }

        public boolean hasCustomSdkHosts() {
            return A2.b(this.customSdkHosts) ^ true;
        }

        public boolean hasDeviceId() {
            return TextUtils.isEmpty((CharSequence)this.deviceId) ^ true;
        }

        public boolean hasDeviceIdHash() {
            return TextUtils.isEmpty((CharSequence)this.deviceIdHash) ^ true;
        }

        public boolean hasGetUrl() {
            return TextUtils.isEmpty((CharSequence)this.getUrl) ^ true;
        }

        public boolean hasReportUrl() {
            return TextUtils.isEmpty((CharSequence)this.reportUrl) ^ true;
        }

        public boolean hasUuid() {
            return TextUtils.isEmpty((CharSequence)this.uuid) ^ true;
        }
    }
}

