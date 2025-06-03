package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.content.ComponentName;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import p.n;
import p.p;

public class ServiceConnection
  extends p
{
  private WeakReference<ServiceConnectionCallback> mConnectionCallback;
  
  public ServiceConnection(ServiceConnectionCallback paramServiceConnectionCallback)
  {
    mConnectionCallback = new WeakReference(paramServiceConnectionCallback);
  }
  
  public void onCustomTabsServiceConnected(ComponentName paramComponentName, n paramn)
  {
    paramComponentName = (ServiceConnectionCallback)mConnectionCallback.get();
    if (paramComponentName != null) {
      paramComponentName.onServiceConnected(paramn);
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    paramComponentName = (ServiceConnectionCallback)mConnectionCallback.get();
    if (paramComponentName != null) {
      paramComponentName.onServiceDisconnected();
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ServiceConnection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */