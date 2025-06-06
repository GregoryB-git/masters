package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsCallback.Stub;
import android.support.customtabs.IPostMessageService;
import android.support.customtabs.IPostMessageService.Stub;

public abstract class PostMessageServiceConnection
  implements ServiceConnection
{
  private final Object mLock = new Object();
  private IPostMessageService mService;
  private final ICustomTabsCallback mSessionBinder;
  
  public PostMessageServiceConnection(CustomTabsSessionToken paramCustomTabsSessionToken)
  {
    mSessionBinder = ICustomTabsCallback.Stub.asInterface(paramCustomTabsSessionToken.getCallbackBinder());
  }
  
  public boolean bindSessionToPostMessageService(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.setClassName(paramString, PostMessageService.class.getName());
    return paramContext.bindService(localIntent, this, 1);
  }
  
  public final boolean notifyMessageChannelReady(Bundle paramBundle)
  {
    if (mService == null) {
      return false;
    }
    try
    {
      synchronized (mLock)
      {
        mService.onMessageChannelReady(mSessionBinder, paramBundle);
        return true;
      }
    }
    catch (RemoteException paramBundle)
    {
      return false;
    }
  }
  
  public void onPostMessageServiceConnected() {}
  
  public void onPostMessageServiceDisconnected() {}
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    mService = IPostMessageService.Stub.asInterface(paramIBinder);
    onPostMessageServiceConnected();
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    mService = null;
    onPostMessageServiceDisconnected();
  }
  
  public final boolean postMessage(String paramString, Bundle paramBundle)
  {
    if (mService == null) {
      return false;
    }
    try
    {
      synchronized (mLock)
      {
        mService.onPostMessage(mSessionBinder, paramString, paramBundle);
        return true;
      }
    }
    catch (RemoteException paramString)
    {
      return false;
    }
  }
  
  public void unbindFromContext(Context paramContext)
  {
    paramContext.unbindService(this);
  }
}

/* Location:
 * Qualified Name:     androidx.browser.customtabs.PostMessageServiceConnection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */