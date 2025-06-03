package org.chromium.support_lib_boundary;

import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;

public abstract interface ProfileBoundaryInterface
{
  public abstract CookieManager getCookieManager();
  
  public abstract GeolocationPermissions getGeoLocationPermissions();
  
  public abstract String getName();
  
  public abstract ServiceWorkerController getServiceWorkerController();
  
  public abstract WebStorage getWebStorage();
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.ProfileBoundaryInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */