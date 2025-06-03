package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p.m;
import p.n;
import p.o;
import p.p;
import p.u;

public class CustomTabActivityHelper
  implements ServiceConnectionCallback
{
  private n mClient;
  private p mConnection;
  private ConnectionCallback mConnectionCallback;
  private p.b mCustomTabsCallback;
  private u mCustomTabsSession;
  
  public static boolean isAvailable(Activity paramActivity)
  {
    boolean bool;
    if (CustomTabsHelper.getPackageNameToUse(paramActivity) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static void openCustomTab(Activity paramActivity, Intent paramIntent, Uri paramUri1, Map<String, String> paramMap, Uri paramUri2, int paramInt)
  {
    paramIntent.setData(paramUri1);
    if (paramMap != null)
    {
      paramUri1 = new Bundle();
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        paramUri1.putString((String)localEntry.getKey(), (String)localEntry.getValue());
      }
      paramIntent.putExtra("com.android.browser.headers", paramUri1);
    }
    if (paramUri2 != null) {
      paramIntent.putExtra("android.intent.extra.REFERRER", paramUri2);
    }
    paramActivity.startActivityForResult(paramIntent, paramInt);
  }
  
  public static void openCustomTab(Activity paramActivity, o paramo, Uri paramUri1, Map<String, String> paramMap, Uri paramUri2, int paramInt)
  {
    openCustomTab(paramActivity, a, paramUri1, paramMap, paramUri2, paramInt);
  }
  
  public static void openTrustedWebActivity(Activity paramActivity, q.b paramb, Uri paramUri1, Map<String, String> paramMap, Uri paramUri2, int paramInt)
  {
    openCustomTab(paramActivity, a, paramUri1, paramMap, paramUri2, paramInt);
  }
  
  public boolean bindCustomTabsService(Activity paramActivity)
  {
    if (mClient != null) {
      return true;
    }
    String str = CustomTabsHelper.getPackageNameToUse(paramActivity);
    if (str == null) {
      return false;
    }
    ServiceConnection localServiceConnection = new ServiceConnection(this);
    mConnection = localServiceConnection;
    localServiceConnection.setApplicationContext(paramActivity.getApplicationContext());
    Intent localIntent = new Intent("android.support.customtabs.action.CustomTabsService");
    if (!TextUtils.isEmpty(str)) {
      localIntent.setPackage(str);
    }
    return paramActivity.bindService(localIntent, localServiceConnection, 33);
  }
  
  public u getSession()
  {
    n localn = mClient;
    if (localn != null)
    {
      if (mCustomTabsSession != null) {
        break label76;
      }
      localObject = new m(mCustomTabsCallback);
    }
    try
    {
      boolean bool = a.T1((ICustomTabsCallback)localObject);
      if (bool) {
        localObject = new u(a, (m)localObject, b);
      }
    }
    catch (RemoteException localRemoteException)
    {
      label76:
      for (;;) {}
    }
    Object localObject = null;
    mCustomTabsSession = ((u)localObject);
    return mCustomTabsSession;
  }
  
  public boolean mayLaunchUrl(Uri paramUri, Bundle paramBundle, List<Bundle> paramList)
  {
    Object localObject = mClient;
    boolean bool1 = false;
    if (localObject == null) {
      return false;
    }
    localObject = getSession();
    if (localObject == null) {
      return false;
    }
    paramBundle = ((u)localObject).a(paramBundle);
    try
    {
      boolean bool2 = b.T(c, paramUri, paramBundle, paramList);
      bool1 = bool2;
    }
    catch (RemoteException paramUri)
    {
      for (;;) {}
    }
    return bool1;
  }
  
  public void onServiceConnected(n paramn)
  {
    mClient = paramn;
    paramn.getClass();
    try
    {
      a.g1(0L);
      paramn = mConnectionCallback;
      if (paramn != null) {
        paramn.onCustomTabsConnected();
      }
      return;
    }
    catch (RemoteException paramn)
    {
      for (;;) {}
    }
  }
  
  public void onServiceDisconnected()
  {
    mClient = null;
    mCustomTabsSession = null;
    ConnectionCallback localConnectionCallback = mConnectionCallback;
    if (localConnectionCallback != null) {
      localConnectionCallback.onCustomTabsDisconnected();
    }
  }
  
  public void setConnectionCallback(ConnectionCallback paramConnectionCallback)
  {
    mConnectionCallback = paramConnectionCallback;
  }
  
  public void setCustomTabsCallback(p.b paramb)
  {
    mCustomTabsCallback = paramb;
  }
  
  public void unbindCustomTabsService(Activity paramActivity)
  {
    p localp = mConnection;
    if (localp == null) {
      return;
    }
    paramActivity.unbindService(localp);
    mClient = null;
    mCustomTabsSession = null;
    mConnection = null;
  }
  
  public static abstract interface ConnectionCallback
  {
    public abstract void onCustomTabsConnected();
    
    public abstract void onCustomTabsDisconnected();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.CustomTabActivityHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */