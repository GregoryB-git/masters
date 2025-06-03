/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  com.twitter.sdk.android.core.internal.persistence.PreferenceStoreImpl
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Locale
 *  java.util.UUID
 *  java.util.concurrent.locks.ReentrantLock
 *  java.util.regex.Pattern
 */
package com.twitter.sdk.android.core.internal;

import android.content.Context;
import android.os.Build;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.internal.AdvertisingInfo;
import com.twitter.sdk.android.core.internal.AdvertisingInfoProvider;
import com.twitter.sdk.android.core.internal.CommonUtils;
import com.twitter.sdk.android.core.internal.persistence.PreferenceStore;
import com.twitter.sdk.android.core.internal.persistence.PreferenceStoreImpl;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

public class IdManager {
    public static final String ADVERTISING_PREFERENCES = "com.twitter.sdk.android.AdvertisingPreferences";
    public static final String COLLECT_IDENTIFIERS_ENABLED = "com.twitter.sdk.android.COLLECT_IDENTIFIERS_ENABLED";
    private static final String FORWARD_SLASH_REGEX;
    private static final Pattern ID_PATTERN;
    public static final String PREFKEY_INSTALLATION_UUID = "installation_uuid";
    public AdvertisingInfo advertisingInfo;
    public AdvertisingInfoProvider advertisingInfoProvider;
    private final String appIdentifier;
    private final boolean collectHardwareIds;
    public boolean fetchedAdvertisingInfo;
    private final ReentrantLock installationIdLock = new ReentrantLock();
    private final PreferenceStore preferenceStore;

    static {
        ID_PATTERN = Pattern.compile((String)"[^\\p{Alnum}]");
        FORWARD_SLASH_REGEX = Pattern.quote((String)"/");
    }

    public IdManager(Context context) {
        this(context, (PreferenceStore)new PreferenceStoreImpl(context, ADVERTISING_PREFERENCES));
    }

    public IdManager(Context context, PreferenceStore preferenceStore) {
        this(context, preferenceStore, new AdvertisingInfoProvider(context, preferenceStore));
    }

    public IdManager(Context context, PreferenceStore object, AdvertisingInfoProvider advertisingInfoProvider) {
        if (context != null) {
            boolean bl;
            this.appIdentifier = context.getPackageName();
            this.advertisingInfoProvider = advertisingInfoProvider;
            this.preferenceStore = object;
            this.collectHardwareIds = bl = CommonUtils.getBooleanResourceValue(context, COLLECT_IDENTIFIERS_ENABLED, true);
            if (!bl) {
                object = Twitter.getLogger();
                advertisingInfoProvider = z2.t("Device ID collection disabled for ");
                advertisingInfoProvider.append(context.getPackageName());
                object.d("Twitter", advertisingInfoProvider.toString());
            }
            return;
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    private String createInstallationUUID() {
        String string2;
        block4: {
            this.installationIdLock.lock();
            Object object = this.preferenceStore.get().getString(PREFKEY_INSTALLATION_UUID, null);
            string2 = object;
            if (object != null) break block4;
            string2 = this.formatId(UUID.randomUUID().toString());
            object = this.preferenceStore;
            object.save(object.edit().putString(PREFKEY_INSTALLATION_UUID, string2));
        }
        return string2;
        finally {
            this.installationIdLock.unlock();
        }
    }

    private String formatId(String string2) {
        string2 = string2 == null ? null : ID_PATTERN.matcher((CharSequence)string2).replaceAll("").toLowerCase(Locale.US);
        return string2;
    }

    private String removeForwardSlashesIn(String string2) {
        return string2.replaceAll(FORWARD_SLASH_REGEX, "");
    }

    public String getAdvertisingId() {
        Object object;
        object = this.collectHardwareIds && (object = this.getAdvertisingInfo()) != null ? ((AdvertisingInfo)object).advertisingId : null;
        return object;
    }

    public AdvertisingInfo getAdvertisingInfo() {
        IdManager idManager = this;
        synchronized (idManager) {
            if (!this.fetchedAdvertisingInfo) {
                this.advertisingInfo = this.advertisingInfoProvider.getAdvertisingInfo();
                this.fetchedAdvertisingInfo = true;
            }
            AdvertisingInfo advertisingInfo = this.advertisingInfo;
            return advertisingInfo;
        }
    }

    public String getAppIdentifier() {
        return this.appIdentifier;
    }

    public String getDeviceUUID() {
        String string2;
        if (this.collectHardwareIds) {
            String string3;
            string2 = string3 = this.preferenceStore.get().getString(PREFKEY_INSTALLATION_UUID, null);
            if (string3 == null) {
                string2 = this.createInstallationUUID();
            }
        } else {
            string2 = "";
        }
        return string2;
    }

    public String getModelName() {
        return String.format((Locale)Locale.US, (String)"%s/%s", (Object[])new Object[]{this.removeForwardSlashesIn(Build.MANUFACTURER), this.removeForwardSlashesIn(Build.MODEL)});
    }

    public String getOsBuildVersionString() {
        return this.removeForwardSlashesIn(Build.VERSION.INCREMENTAL);
    }

    public String getOsDisplayVersionString() {
        return this.removeForwardSlashesIn(Build.VERSION.RELEASE);
    }

    public String getOsVersionString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getOsDisplayVersionString());
        stringBuilder.append("/");
        stringBuilder.append(this.getOsBuildVersionString());
        return stringBuilder.toString();
    }

    public Boolean isLimitAdTrackingEnabled() {
        AdvertisingInfo advertisingInfo;
        advertisingInfo = this.collectHardwareIds && (advertisingInfo = this.getAdvertisingInfo()) != null ? Boolean.valueOf((boolean)advertisingInfo.limitAdTrackingEnabled) : null;
        return advertisingInfo;
    }
}

