/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.google.android.gms.ads.identifier.AdvertisingIdClient
 *  com.google.android.gms.ads.identifier.AdvertisingIdClient$Info
 *  com.google.android.gms.common.GooglePlayServicesUtil
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.twitter.sdk.android.core.internal;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.internal.AdvertisingInfo;
import com.twitter.sdk.android.core.internal.AdvertisingInfoStrategy;

class AdvertisingInfoReflectionStrategy
implements AdvertisingInfoStrategy {
    private static final String CLASS_NAME_ADVERTISING_ID_CLIENT = "com.google.android.gms.ads.identifier.AdvertisingIdClient";
    private static final String CLASS_NAME_ADVERTISING_ID_CLIENT_INFO = "com.google.android.gms.ads.identifier.AdvertisingIdClient$Info";
    private static final String CLASS_NAME_GOOGLE_PLAY_SERVICES_UTILS = "com.google.android.gms.common.GooglePlayServicesUtil";
    private static final int GOOGLE_PLAY_SERVICES_SUCCESS_CODE = 0;
    private static final String METHOD_NAME_GET_ADVERTISING_ID_INFO = "getAdvertisingIdInfo";
    private static final String METHOD_NAME_GET_ID = "getId";
    private static final String METHOD_NAME_IS_GOOGLE_PLAY_SERVICES_AVAILABLE = "isGooglePlayServicesAvailable";
    private static final String METHOD_NAME_IS_LIMITED_AD_TRACKING_ENABLED = "isLimitAdTrackingEnabled";
    private final Context context;

    public AdvertisingInfoReflectionStrategy(Context context) {
        this.context = context.getApplicationContext();
    }

    private String getAdvertisingId() {
        try {
            String string2 = (String)AdvertisingIdClient.Info.class.getMethod(METHOD_NAME_GET_ID, new Class[0]).invoke(this.getInfo(), new Object[0]);
            return string2;
        }
        catch (Exception exception) {
            Twitter.getLogger().w("Twitter", "Could not call getId on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            return null;
        }
    }

    private Object getInfo() {
        try {
            Object object = AdvertisingIdClient.class.getMethod(METHOD_NAME_GET_ADVERTISING_ID_INFO, new Class[]{Context.class}).invoke(null, new Object[]{this.context});
            return object;
        }
        catch (Exception exception) {
            Twitter.getLogger().w("Twitter", "Could not call getAdvertisingIdInfo on com.google.android.gms.ads.identifier.AdvertisingIdClient");
            return null;
        }
    }

    private boolean isLimitAdTrackingEnabled() {
        try {
            boolean bl = (Boolean)AdvertisingIdClient.Info.class.getMethod(METHOD_NAME_IS_LIMITED_AD_TRACKING_ENABLED, new Class[0]).invoke(this.getInfo(), new Object[0]);
            return bl;
        }
        catch (Exception exception) {
            Twitter.getLogger().w("Twitter", "Could not call isLimitAdTrackingEnabled on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            return false;
        }
    }

    @Override
    public AdvertisingInfo getAdvertisingInfo() {
        if (this.isGooglePlayServiceAvailable(this.context)) {
            return new AdvertisingInfo(this.getAdvertisingId(), this.isLimitAdTrackingEnabled());
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean isGooglePlayServiceAvailable(Context context) {
        boolean bl = false;
        try {
            String string2 = GooglePlayServicesUtil.GMS_ERROR_DIALOG;
            int n = (Integer)GooglePlayServicesUtil.class.getMethod(METHOD_NAME_IS_GOOGLE_PLAY_SERVICES_AVAILABLE, new Class[]{Context.class}).invoke(null, new Object[]{context});
            if (n != 0) return bl;
            return true;
        }
        catch (Exception exception) {
            return bl;
        }
    }
}

