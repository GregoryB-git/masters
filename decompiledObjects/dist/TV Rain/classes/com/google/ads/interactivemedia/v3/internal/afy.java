package com.google.ads.interactivemedia.v3.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.util.Log;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

public final class afy
{
  public String deviceId = "";
  public String idType = "";
  public boolean isLimitedAdTracking = false;
  
  public afy() {}
  
  public afy(Context paramContext)
  {
    Object localObject = new AdvertisingIdClient.Info("", false);
    idType = "";
    try
    {
      AdvertisingIdClient.Info localInfo = getInfoFromPlayServices(paramContext);
      localObject = localInfo;
      idType = "adid";
      localObject = localInfo;
    }
    catch (Exception localException)
    {
      try
      {
        paramContext = getInfoFromContentResolver(paramContext);
        localObject = paramContext;
        idType = "afai";
        localObject = paramContext;
      }
      catch (Settings.SettingNotFoundException paramContext)
      {
        Log.w("IMASDK", "Failed to get advertising ID.");
        idType = "";
      }
    }
    deviceId = ((AdvertisingIdClient.Info)localObject).getId();
    isLimitedAdTracking = ((AdvertisingIdClient.Info)localObject).isLimitAdTrackingEnabled();
  }
  
  public final AdvertisingIdClient.Info getInfoFromContentResolver(Context paramContext)
    throws Settings.SettingNotFoundException
  {
    ContentResolver localContentResolver = paramContext.getContentResolver();
    paramContext = Settings.Secure.getString(localContentResolver, "advertising_id");
    int i = Settings.Secure.getInt(localContentResolver, "limit_ad_tracking");
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return new AdvertisingIdClient.Info(paramContext, bool);
  }
  
  public final AdvertisingIdClient.Info getInfoFromPlayServices(Context paramContext)
    throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
  {
    return AdvertisingIdClient.getAdvertisingIdInfo(paramContext);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.afy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */