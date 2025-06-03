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
  
  public ReferrerDetails(Bundle paramBundle)
  {
    mOriginalBundle = paramBundle;
  }
  
  public boolean getGooglePlayInstantParam()
  {
    return mOriginalBundle.getBoolean("google_play_instant");
  }
  
  public long getInstallBeginTimestampSeconds()
  {
    return mOriginalBundle.getLong("install_begin_timestamp_seconds");
  }
  
  public long getInstallBeginTimestampServerSeconds()
  {
    return mOriginalBundle.getLong("install_begin_timestamp_server_seconds");
  }
  
  public String getInstallReferrer()
  {
    return mOriginalBundle.getString("install_referrer");
  }
  
  public String getInstallVersion()
  {
    return mOriginalBundle.getString("install_version");
  }
  
  public long getReferrerClickTimestampSeconds()
  {
    return mOriginalBundle.getLong("referrer_click_timestamp_seconds");
  }
  
  public long getReferrerClickTimestampServerSeconds()
  {
    return mOriginalBundle.getLong("referrer_click_timestamp_server_seconds");
  }
}

/* Location:
 * Qualified Name:     com.android.installreferrer.api.ReferrerDetails
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */