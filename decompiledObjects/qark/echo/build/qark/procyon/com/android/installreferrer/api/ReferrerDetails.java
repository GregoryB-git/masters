// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.android.installreferrer.api;

import android.os.BaseBundle;
import android.os.Bundle;

public class ReferrerDetails
{
    private static final String KEY_GOOGLE_PLAY_INSTANT = "google_play_instant";
    private static final String KEY_INSTALL_BEGIN_TIMESTAMP = "install_begin_timestamp_seconds";
    private static final String KEY_INSTALL_BEGIN_TIMESTAMP_SERVER = "install_begin_timestamp_server_seconds";
    private static final String KEY_INSTALL_REFERRER = "install_referrer";
    private static final String KEY_INSTALL_VERSION = "install_version";
    private static final String KEY_REFERRER_CLICK_TIMESTAMP = "referrer_click_timestamp_seconds";
    private static final String KEY_REFERRER_CLICK_TIMESTAMP_SERVER = "referrer_click_timestamp_server_seconds";
    private final Bundle mOriginalBundle;
    
    public ReferrerDetails(final Bundle mOriginalBundle) {
        this.mOriginalBundle = mOriginalBundle;
    }
    
    public boolean getGooglePlayInstantParam() {
        return ((BaseBundle)this.mOriginalBundle).getBoolean("google_play_instant");
    }
    
    public long getInstallBeginTimestampSeconds() {
        return ((BaseBundle)this.mOriginalBundle).getLong("install_begin_timestamp_seconds");
    }
    
    public long getInstallBeginTimestampServerSeconds() {
        return ((BaseBundle)this.mOriginalBundle).getLong("install_begin_timestamp_server_seconds");
    }
    
    public String getInstallReferrer() {
        return ((BaseBundle)this.mOriginalBundle).getString("install_referrer");
    }
    
    public String getInstallVersion() {
        return ((BaseBundle)this.mOriginalBundle).getString("install_version");
    }
    
    public long getReferrerClickTimestampSeconds() {
        return ((BaseBundle)this.mOriginalBundle).getLong("referrer_click_timestamp_seconds");
    }
    
    public long getReferrerClickTimestampServerSeconds() {
        return ((BaseBundle)this.mOriginalBundle).getLong("referrer_click_timestamp_server_seconds");
    }
}
