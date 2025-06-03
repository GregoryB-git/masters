/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.text.TextUtils
 *  com.twitter.sdk.android.core.internal.AdvertisingInfoReflectionStrategy
 *  com.twitter.sdk.android.core.internal.AdvertisingInfoServiceStrategy
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 */
package com.twitter.sdk.android.core.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.internal.AdvertisingInfo;
import com.twitter.sdk.android.core.internal.AdvertisingInfoReflectionStrategy;
import com.twitter.sdk.android.core.internal.AdvertisingInfoServiceStrategy;
import com.twitter.sdk.android.core.internal.AdvertisingInfoStrategy;
import com.twitter.sdk.android.core.internal.persistence.PreferenceStore;

class AdvertisingInfoProvider {
    private static final String PREFKEY_ADVERTISING_ID = "advertising_id";
    private static final String PREFKEY_LIMIT_AD_TRACKING = "limit_ad_tracking_enabled";
    private final Context context;
    private final PreferenceStore preferenceStore;

    public AdvertisingInfoProvider(Context context, PreferenceStore preferenceStore) {
        this.context = context.getApplicationContext();
        this.preferenceStore = preferenceStore;
    }

    private AdvertisingInfo getAdvertisingInfoFromStrategies() {
        AdvertisingInfo advertisingInfo = this.getReflectionStrategy().getAdvertisingInfo();
        if (!this.isInfoValid(advertisingInfo)) {
            advertisingInfo = this.getServiceStrategy().getAdvertisingInfo();
            if (!this.isInfoValid(advertisingInfo)) {
                Twitter.getLogger().d("Twitter", "AdvertisingInfo not present");
            } else {
                Twitter.getLogger().d("Twitter", "Using AdvertisingInfo from Service Provider");
            }
        } else {
            Twitter.getLogger().d("Twitter", "Using AdvertisingInfo from Reflection Provider");
        }
        return advertisingInfo;
    }

    private AdvertisingInfo getInfoFromPreferences() {
        return new AdvertisingInfo(this.preferenceStore.get().getString(PREFKEY_ADVERTISING_ID, ""), this.preferenceStore.get().getBoolean(PREFKEY_LIMIT_AD_TRACKING, false));
    }

    private AdvertisingInfoStrategy getReflectionStrategy() {
        return new AdvertisingInfoReflectionStrategy(this.context);
    }

    private AdvertisingInfoStrategy getServiceStrategy() {
        return new AdvertisingInfoServiceStrategy(this.context);
    }

    private boolean isInfoValid(AdvertisingInfo advertisingInfo) {
        boolean bl = advertisingInfo != null && !TextUtils.isEmpty((CharSequence)advertisingInfo.advertisingId);
        return bl;
    }

    private void refreshInfoIfNeededAsync(AdvertisingInfo advertisingInfo) {
        new Thread(new Runnable(this, advertisingInfo){
            public final AdvertisingInfoProvider this$0;
            public final AdvertisingInfo val$advertisingInfo;
            {
                this.this$0 = advertisingInfoProvider;
                this.val$advertisingInfo = advertisingInfo;
            }

            public void run() {
                AdvertisingInfo advertisingInfo = this.this$0.getAdvertisingInfoFromStrategies();
                if (!this.val$advertisingInfo.equals(advertisingInfo)) {
                    Twitter.getLogger().d("Twitter", "Asychronously getting Advertising Info and storing it to preferences");
                    this.this$0.storeInfoToPreferences(advertisingInfo);
                }
            }
        }).start();
    }

    @SuppressLint(value={"CommitPrefEdits"})
    private void storeInfoToPreferences(AdvertisingInfo object) {
        if (this.isInfoValid((AdvertisingInfo)object)) {
            PreferenceStore preferenceStore = this.preferenceStore;
            preferenceStore.save(preferenceStore.edit().putString(PREFKEY_ADVERTISING_ID, ((AdvertisingInfo)object).advertisingId).putBoolean(PREFKEY_LIMIT_AD_TRACKING, ((AdvertisingInfo)object).limitAdTrackingEnabled));
        } else {
            object = this.preferenceStore;
            object.save(object.edit().remove(PREFKEY_ADVERTISING_ID).remove(PREFKEY_LIMIT_AD_TRACKING));
        }
    }

    public AdvertisingInfo getAdvertisingInfo() {
        AdvertisingInfo advertisingInfo = this.getInfoFromPreferences();
        if (this.isInfoValid(advertisingInfo)) {
            Twitter.getLogger().d("Twitter", "Using AdvertisingInfo from Preference Store");
            this.refreshInfoIfNeededAsync(advertisingInfo);
            return advertisingInfo;
        }
        advertisingInfo = this.getAdvertisingInfoFromStrategies();
        this.storeInfoToPreferences(advertisingInfo);
        return advertisingInfo;
    }
}

