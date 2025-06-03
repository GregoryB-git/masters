package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.util.Log;

class CustomTabsSessionToken$1
  extends CustomTabsCallback
{
  public CustomTabsSessionToken$1(CustomTabsSessionToken paramCustomTabsSessionToken) {}
  
  public void extraCallback(String paramString, Bundle paramBundle)
  {
    try
    {
      this$0.mCallbackBinder.extraCallback(paramString, paramBundle);
    }
    catch (RemoteException paramString)
    {
      Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
    }
  }
  
  public void onMessageChannelReady(Bundle paramBundle)
  {
    try
    {
      this$0.mCallbackBinder.onMessageChannelReady(paramBundle);
    }
    catch (RemoteException paramBundle)
    {
      Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
    }
  }
  
  public void onNavigationEvent(int paramInt, Bundle paramBundle)
  {
    try
    {
      this$0.mCallbackBinder.onNavigationEvent(paramInt, paramBundle);
    }
    catch (RemoteException paramBundle)
    {
      Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
    }
  }
  
  public void onPostMessage(String paramString, Bundle paramBundle)
  {
    try
    {
      this$0.mCallbackBinder.onPostMessage(paramString, paramBundle);
    }
    catch (RemoteException paramString)
    {
      Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
    }
  }
  
  public void onRelationshipValidationResult(int paramInt, Uri paramUri, boolean paramBoolean, Bundle paramBundle)
  {
    try
    {
      this$0.mCallbackBinder.onRelationshipValidationResult(paramInt, paramUri, paramBoolean, paramBundle);
    }
    catch (RemoteException paramUri)
    {
      Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
    }
  }
}

/* Location:
 * Qualified Name:     androidx.browser.customtabs.CustomTabsSessionToken.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */