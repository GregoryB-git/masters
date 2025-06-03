package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.installreferrer.commons.InstallReferrerCommons;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import r2.a;
import r2.a.a;

public class InstallReferrerClientImpl
  extends InstallReferrerClient
{
  public int a = 0;
  public final Context b;
  public a c;
  public ServiceConnection d;
  
  public InstallReferrerClientImpl(Context paramContext)
  {
    b = paramContext.getApplicationContext();
  }
  
  public final boolean c()
  {
    PackageManager localPackageManager = b.getPackageManager();
    try
    {
      int i = getPackageInfo"com.android.vending"128versionCode;
      if (i >= 80837300) {
        return true;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
    return false;
  }
  
  public void endConnection()
  {
    a = 3;
    if (d != null)
    {
      InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
      b.unbindService(d);
      d = null;
    }
    c = null;
  }
  
  public ReferrerDetails getInstallReferrer()
  {
    if (isReady())
    {
      Object localObject = new Bundle();
      ((BaseBundle)localObject).putString("package_name", b.getPackageName());
      try
      {
        localObject = new ReferrerDetails(c.P((Bundle)localObject));
        return (ReferrerDetails)localObject;
      }
      catch (RemoteException localRemoteException)
      {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
        a = 0;
        throw localRemoteException;
      }
    }
    throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
  }
  
  public boolean isReady()
  {
    return (a == 2) && (c != null) && (d != null);
  }
  
  public void startConnection(InstallReferrerStateListener paramInstallReferrerStateListener)
  {
    if (isReady())
    {
      InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
      paramInstallReferrerStateListener.onInstallReferrerSetupFinished(0);
      return;
    }
    int i = a;
    if (i == 1)
    {
      InstallReferrerCommons.logWarn("InstallReferrerClient", "Client is already in the process of connecting to the service.");
      paramInstallReferrerStateListener.onInstallReferrerSetupFinished(3);
      return;
    }
    if (i == 3)
    {
      InstallReferrerCommons.logWarn("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
      paramInstallReferrerStateListener.onInstallReferrerSetupFinished(3);
      return;
    }
    InstallReferrerCommons.logVerbose("InstallReferrerClient", "Starting install referrer service setup.");
    Intent localIntent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
    localIntent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
    Object localObject1 = b.getPackageManager().queryIntentServices(localIntent, 0);
    if ((localObject1 != null) && (!((List)localObject1).isEmpty()))
    {
      Object localObject2 = get0serviceInfo;
      if (localObject2 != null)
      {
        localObject1 = packageName;
        localObject2 = name;
        if (("com.android.vending".equals(localObject1)) && (localObject2 != null) && (c()))
        {
          localIntent = new Intent(localIntent);
          localObject1 = new b(paramInstallReferrerStateListener, null);
          d = ((ServiceConnection)localObject1);
          if (b.bindService(localIntent, (ServiceConnection)localObject1, 1))
          {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service was bonded successfully.");
            return;
          }
          InstallReferrerCommons.logWarn("InstallReferrerClient", "Connection to service is blocked.");
          a = 0;
          paramInstallReferrerStateListener.onInstallReferrerSetupFinished(1);
          return;
        }
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
        a = 0;
        paramInstallReferrerStateListener.onInstallReferrerSetupFinished(2);
        return;
      }
    }
    a = 0;
    InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service unavailable on device.");
    paramInstallReferrerStateListener.onInstallReferrerSetupFinished(2);
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface ClientState
  {
    public static final int CLOSED = 3;
    public static final int CONNECTED = 2;
    public static final int CONNECTING = 1;
    public static final int DISCONNECTED = 0;
  }
  
  public final class b
    implements ServiceConnection
  {
    public final InstallReferrerStateListener a;
    
    public b(InstallReferrerStateListener paramInstallReferrerStateListener)
    {
      if (paramInstallReferrerStateListener != null)
      {
        a = paramInstallReferrerStateListener;
        return;
      }
      throw new RuntimeException("Please specify a listener to know when setup is done.");
    }
    
    public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
      InstallReferrerClientImpl.a(InstallReferrerClientImpl.this, a.a.n(paramIBinder));
      InstallReferrerClientImpl.b(InstallReferrerClientImpl.this, 2);
      a.onInstallReferrerSetupFinished(0);
    }
    
    public void onServiceDisconnected(ComponentName paramComponentName)
    {
      InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
      InstallReferrerClientImpl.a(InstallReferrerClientImpl.this, null);
      InstallReferrerClientImpl.b(InstallReferrerClientImpl.this, 0);
      a.onInstallReferrerServiceDisconnected();
    }
  }
}

/* Location:
 * Qualified Name:     com.android.installreferrer.api.InstallReferrerClientImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */