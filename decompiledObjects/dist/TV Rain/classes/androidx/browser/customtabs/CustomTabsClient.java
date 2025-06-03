package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback.Stub;
import android.support.customtabs.ICustomTabsService;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomTabsClient
{
  private final ICustomTabsService mService;
  private final ComponentName mServiceComponentName;
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public CustomTabsClient(ICustomTabsService paramICustomTabsService, ComponentName paramComponentName)
  {
    mService = paramICustomTabsService;
    mServiceComponentName = paramComponentName;
  }
  
  public static boolean bindCustomTabsService(Context paramContext, String paramString, CustomTabsServiceConnection paramCustomTabsServiceConnection)
  {
    Intent localIntent = new Intent("android.support.customtabs.action.CustomTabsService");
    if (!TextUtils.isEmpty(paramString)) {
      localIntent.setPackage(paramString);
    }
    return paramContext.bindService(localIntent, paramCustomTabsServiceConnection, 33);
  }
  
  public static boolean connectAndInitialize(Context paramContext, String paramString)
  {
    if (paramString == null) {
      return false;
    }
    Context localContext = paramContext.getApplicationContext();
    paramContext = new CustomTabsServiceConnection()
    {
      public final void onCustomTabsServiceConnected(ComponentName paramAnonymousComponentName, CustomTabsClient paramAnonymousCustomTabsClient)
      {
        paramAnonymousCustomTabsClient.warmup(0L);
        val$applicationContext.unbindService(this);
      }
      
      public final void onServiceDisconnected(ComponentName paramAnonymousComponentName) {}
    };
    try
    {
      boolean bool = bindCustomTabsService(localContext, paramString, paramContext);
      return bool;
    }
    catch (SecurityException paramContext) {}
    return false;
  }
  
  public static String getPackageName(Context paramContext, @Nullable List<String> paramList)
  {
    return getPackageName(paramContext, paramList, false);
  }
  
  public static String getPackageName(Context paramContext, @Nullable List<String> paramList, boolean paramBoolean)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    if (paramList == null) {
      paramContext = new ArrayList();
    } else {
      paramContext = paramList;
    }
    Object localObject1 = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
    Object localObject2 = paramContext;
    if (!paramBoolean)
    {
      localObject1 = localPackageManager.resolveActivity((Intent)localObject1, 0);
      localObject2 = paramContext;
      if (localObject1 != null)
      {
        localObject1 = activityInfo.packageName;
        localObject2 = new ArrayList(paramContext.size() + 1);
        ((ArrayList)localObject2).add(localObject1);
        if (paramList != null) {
          ((ArrayList)localObject2).addAll(paramList);
        }
      }
    }
    paramContext = new Intent("android.support.customtabs.action.CustomTabsService");
    localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      paramList = (String)((Iterator)localObject2).next();
      paramContext.setPackage(paramList);
      if (localPackageManager.resolveService(paramContext, 0) != null) {
        return paramList;
      }
    }
    return null;
  }
  
  public Bundle extraCommand(String paramString, Bundle paramBundle)
  {
    try
    {
      paramString = mService.extraCommand(paramString, paramBundle);
      return paramString;
    }
    catch (RemoteException paramString) {}
    return null;
  }
  
  public CustomTabsSession newSession(final CustomTabsCallback paramCustomTabsCallback)
  {
    ICustomTabsCallback.Stub local2 = new ICustomTabsCallback.Stub()
    {
      private Handler mHandler = new Handler(Looper.getMainLooper());
      
      public void extraCallback(final String paramAnonymousString, final Bundle paramAnonymousBundle)
        throws RemoteException
      {
        if (paramCustomTabsCallback == null) {
          return;
        }
        mHandler.post(new Runnable()
        {
          public void run()
          {
            val$callback.extraCallback(paramAnonymousString, paramAnonymousBundle);
          }
        });
      }
      
      public void onMessageChannelReady(final Bundle paramAnonymousBundle)
        throws RemoteException
      {
        if (paramCustomTabsCallback == null) {
          return;
        }
        mHandler.post(new Runnable()
        {
          public void run()
          {
            val$callback.onMessageChannelReady(paramAnonymousBundle);
          }
        });
      }
      
      public void onNavigationEvent(final int paramAnonymousInt, final Bundle paramAnonymousBundle)
      {
        if (paramCustomTabsCallback == null) {
          return;
        }
        mHandler.post(new Runnable()
        {
          public void run()
          {
            val$callback.onNavigationEvent(paramAnonymousInt, paramAnonymousBundle);
          }
        });
      }
      
      public void onPostMessage(final String paramAnonymousString, final Bundle paramAnonymousBundle)
        throws RemoteException
      {
        if (paramCustomTabsCallback == null) {
          return;
        }
        mHandler.post(new Runnable()
        {
          public void run()
          {
            val$callback.onPostMessage(paramAnonymousString, paramAnonymousBundle);
          }
        });
      }
      
      public void onRelationshipValidationResult(final int paramAnonymousInt, final Uri paramAnonymousUri, final boolean paramAnonymousBoolean, @Nullable final Bundle paramAnonymousBundle)
        throws RemoteException
      {
        if (paramCustomTabsCallback == null) {
          return;
        }
        mHandler.post(new Runnable()
        {
          public void run()
          {
            val$callback.onRelationshipValidationResult(paramAnonymousInt, paramAnonymousUri, paramAnonymousBoolean, paramAnonymousBundle);
          }
        });
      }
    };
    paramCustomTabsCallback = null;
    try
    {
      boolean bool = mService.newSession(local2);
      if (!bool) {
        return null;
      }
      paramCustomTabsCallback = new CustomTabsSession(mService, local2, mServiceComponentName);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
    return paramCustomTabsCallback;
  }
  
  public boolean warmup(long paramLong)
  {
    try
    {
      boolean bool = mService.warmup(paramLong);
      return bool;
    }
    catch (RemoteException localRemoteException) {}
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.browser.customtabs.CustomTabsClient
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */