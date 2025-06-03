/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package tvrain.utils;

import android.os.Build;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0014\u0010\b\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003\"\u0014\u0010\n\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0003\"\u0014\u0010\f\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0003\"\u0014\u0010\u000e\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0003\"\u0014\u0010\u0010\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0003\"\u0014\u0010\u0012\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0003\"\u0011\u0010\u0014\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0003\u00a8\u0006\u0016"}, d2={"API_CONSUMER_KEY", "", "getAPI_CONSUMER_KEY", "()Ljava/lang/String;", "acceptHeader", "getAcceptHeader", "billingLicenseKey", "getBillingLicenseKey", "fbBannerId", "getFbBannerId", "fbFullscreenId", "getFbFullscreenId", "fbNativeId", "getFbNativeId", "googleBanner1Id", "getGoogleBanner1Id", "googleBanner2Id", "getGoogleBanner2Id", "googleFullscreenId", "getGoogleFullscreenId", "userAgentHeader", "getUserAgentHeader", "app_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class ConstsKt {
    @NotNull
    private static final String API_CONSUMER_KEY = "a908545f-1cea-7741-a0a0-9fca0010";
    @NotNull
    private static final String acceptHeader;
    @NotNull
    private static final String billingLicenseKey;
    @NotNull
    private static final String fbBannerId;
    @NotNull
    private static final String fbFullscreenId;
    @NotNull
    private static final String fbNativeId;
    @NotNull
    private static final String googleBanner1Id;
    @NotNull
    private static final String googleBanner2Id;
    @NotNull
    private static final String googleFullscreenId;
    @NotNull
    private static final String userAgentHeader;

    static {
        userAgentHeader = a.p(new StringBuilder(), Build.MODEL, "; API_CONSUMER_KEY=", API_CONSUMER_KEY);
        acceptHeader = "application/tvrain.api.2.24+json";
        billingLicenseKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAorj8WPZ1LBE/0wMO44uLRSqlt7i4uRyZe+RFfw+fpSkb5dXUgyqNexMRFGhlHeS/ow4ryjZuWIu7RQPJIYmV2dawi901YRs2j4C1l/FJ/NLivZXVKMg/K6CG2fF3MizbDVWbGe8IGNC9+13YL6BY37qy2+rzrUBLSpVX9nkBnzOXW1CfDGWmTN/QLsH/GKu9nms7ImlqvqcZf1c3ytTSff66SXlFOHvNavvyPzO31YlAcYBmYq3Hj3PC4lGRhigvXy7h1r0cUlCOWOzV1FECH1KUu11/9EyQ1fVfPwJiUgD+thQZaIiLcmg3EqUMUijveecgjvU84H7+1cXWFYQ6wQIDAQAB";
        fbFullscreenId = "188964134476198_1104085102964092";
        fbNativeId = "188964134476198_1104084509630818";
        fbBannerId = "188964134476198_1104081639631105";
        googleBanner1Id = "/124171376/tvrain_apps/android_after3";
        googleBanner2Id = "/124171376/tvrain_apps/android_after10";
        googleFullscreenId = "/124171376/tvrain_apps/android_fullscreen";
    }

    @NotNull
    public static final String getAPI_CONSUMER_KEY() {
        return API_CONSUMER_KEY;
    }

    @NotNull
    public static final String getAcceptHeader() {
        return acceptHeader;
    }

    @NotNull
    public static final String getBillingLicenseKey() {
        return billingLicenseKey;
    }

    @NotNull
    public static final String getFbBannerId() {
        return fbBannerId;
    }

    @NotNull
    public static final String getFbFullscreenId() {
        return fbFullscreenId;
    }

    @NotNull
    public static final String getFbNativeId() {
        return fbNativeId;
    }

    @NotNull
    public static final String getGoogleBanner1Id() {
        return googleBanner1Id;
    }

    @NotNull
    public static final String getGoogleBanner2Id() {
        return googleBanner2Id;
    }

    @NotNull
    public static final String getGoogleFullscreenId() {
        return googleFullscreenId;
    }

    @NotNull
    public static final String getUserAgentHeader() {
        return userAgentHeader;
    }
}

