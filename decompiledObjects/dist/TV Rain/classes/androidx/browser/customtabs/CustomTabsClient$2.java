package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback.Stub;
import androidx.annotation.Nullable;

class CustomTabsClient$2
  extends ICustomTabsCallback.Stub
{
  private Handler mHandler = new Handler(Looper.getMainLooper());
  
  public CustomTabsClient$2(CustomTabsClient paramCustomTabsClient, CustomTabsCallback paramCustomTabsCallback) {}
  
  public void extraCallback(final String paramString, final Bundle paramBundle)
    throws RemoteException
  {
    if (val$callback == null) {
      return;
    }
    mHandler.post(new Runnable()
    {
      public void run()
      {
        val$callback.extraCallback(paramString, paramBundle);
      }
    });
  }
  
  public void onMessageChannelReady(final Bundle paramBundle)
    throws RemoteException
  {
    if (val$callback == null) {
      return;
    }
    mHandler.post(new Runnable()
    {
      public void run()
      {
        val$callback.onMessageChannelReady(paramBundle);
      }
    });
  }
  
  public void onNavigationEvent(final int paramInt, final Bundle paramBundle)
  {
    if (val$callback == null) {
      return;
    }
    mHandler.post(new Runnable()
    {
      public void run()
      {
        val$callback.onNavigationEvent(paramInt, paramBundle);
      }
    });
  }
  
  public void onPostMessage(final String paramString, final Bundle paramBundle)
    throws RemoteException
  {
    if (val$callback == null) {
      return;
    }
    mHandler.post(new Runnable()
    {
      public void run()
      {
        val$callback.onPostMessage(paramString, paramBundle);
      }
    });
  }
  
  public void onRelationshipValidationResult(final int paramInt, final Uri paramUri, final boolean paramBoolean, @Nullable final Bundle paramBundle)
    throws RemoteException
  {
    if (val$callback == null) {
      return;
    }
    mHandler.post(new Runnable()
    {
      public void run()
      {
        val$callback.onRelationshipValidationResult(paramInt, paramUri, paramBoolean, paramBundle);
      }
    });
  }
}

/* Location:
 * Qualified Name:     androidx.browser.customtabs.CustomTabsClient.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */