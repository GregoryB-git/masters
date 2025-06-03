package com.facebook.devicerequests.internal;

import android.net.nsd.NsdManager.RegistrationListener;
import android.net.nsd.NsdServiceInfo;

final class DeviceRequestsHelper$1
  implements NsdManager.RegistrationListener
{
  public DeviceRequestsHelper$1(String paramString1, String paramString2) {}
  
  public void onRegistrationFailed(NsdServiceInfo paramNsdServiceInfo, int paramInt)
  {
    DeviceRequestsHelper.cleanUpAdvertisementService(val$userCode);
  }
  
  public void onServiceRegistered(NsdServiceInfo paramNsdServiceInfo)
  {
    if (!val$nsdServiceName.equals(paramNsdServiceInfo.getServiceName())) {
      DeviceRequestsHelper.cleanUpAdvertisementService(val$userCode);
    }
  }
  
  public void onServiceUnregistered(NsdServiceInfo paramNsdServiceInfo) {}
  
  public void onUnregistrationFailed(NsdServiceInfo paramNsdServiceInfo, int paramInt) {}
}

/* Location:
 * Qualified Name:     com.facebook.devicerequests.internal.DeviceRequestsHelper.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */