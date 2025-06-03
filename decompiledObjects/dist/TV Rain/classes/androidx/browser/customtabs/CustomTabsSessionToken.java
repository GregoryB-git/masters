package androidx.browser.customtabs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsCallback.Stub;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.app.BundleCompat;

public class CustomTabsSessionToken
{
  private static final String TAG = "CustomTabsSessionToken";
  private final CustomTabsCallback mCallback;
  public final ICustomTabsCallback mCallbackBinder;
  
  public CustomTabsSessionToken(ICustomTabsCallback paramICustomTabsCallback)
  {
    mCallbackBinder = paramICustomTabsCallback;
    mCallback = new CustomTabsCallback()
    {
      public void extraCallback(String paramAnonymousString, Bundle paramAnonymousBundle)
      {
        try
        {
          mCallbackBinder.extraCallback(paramAnonymousString, paramAnonymousBundle);
        }
        catch (RemoteException paramAnonymousString)
        {
          Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
      }
      
      public void onMessageChannelReady(Bundle paramAnonymousBundle)
      {
        try
        {
          mCallbackBinder.onMessageChannelReady(paramAnonymousBundle);
        }
        catch (RemoteException paramAnonymousBundle)
        {
          Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
      }
      
      public void onNavigationEvent(int paramAnonymousInt, Bundle paramAnonymousBundle)
      {
        try
        {
          mCallbackBinder.onNavigationEvent(paramAnonymousInt, paramAnonymousBundle);
        }
        catch (RemoteException paramAnonymousBundle)
        {
          Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
      }
      
      public void onPostMessage(String paramAnonymousString, Bundle paramAnonymousBundle)
      {
        try
        {
          mCallbackBinder.onPostMessage(paramAnonymousString, paramAnonymousBundle);
        }
        catch (RemoteException paramAnonymousString)
        {
          Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
      }
      
      public void onRelationshipValidationResult(int paramAnonymousInt, Uri paramAnonymousUri, boolean paramAnonymousBoolean, Bundle paramAnonymousBundle)
      {
        try
        {
          mCallbackBinder.onRelationshipValidationResult(paramAnonymousInt, paramAnonymousUri, paramAnonymousBoolean, paramAnonymousBundle);
        }
        catch (RemoteException paramAnonymousUri)
        {
          Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
      }
    };
  }
  
  @NonNull
  public static CustomTabsSessionToken createMockSessionTokenForTesting()
  {
    return new CustomTabsSessionToken(new MockCallback());
  }
  
  public static CustomTabsSessionToken getSessionTokenFromIntent(Intent paramIntent)
  {
    paramIntent = BundleCompat.getBinder(paramIntent.getExtras(), "android.support.customtabs.extra.SESSION");
    if (paramIntent == null) {
      return null;
    }
    return new CustomTabsSessionToken(ICustomTabsCallback.Stub.asInterface(paramIntent));
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof CustomTabsSessionToken)) {
      return false;
    }
    return ((CustomTabsSessionToken)paramObject).getCallbackBinder().equals(mCallbackBinder.asBinder());
  }
  
  public CustomTabsCallback getCallback()
  {
    return mCallback;
  }
  
  public IBinder getCallbackBinder()
  {
    return mCallbackBinder.asBinder();
  }
  
  public int hashCode()
  {
    return getCallbackBinder().hashCode();
  }
  
  public boolean isAssociatedWith(CustomTabsSession paramCustomTabsSession)
  {
    return paramCustomTabsSession.getBinder().equals(mCallbackBinder);
  }
  
  public static class MockCallback
    extends ICustomTabsCallback.Stub
  {
    public IBinder asBinder()
    {
      return this;
    }
    
    public void extraCallback(String paramString, Bundle paramBundle) {}
    
    public void onMessageChannelReady(Bundle paramBundle) {}
    
    public void onNavigationEvent(int paramInt, Bundle paramBundle) {}
    
    public void onPostMessage(String paramString, Bundle paramBundle) {}
    
    public void onRelationshipValidationResult(int paramInt, Uri paramUri, boolean paramBoolean, Bundle paramBundle) {}
  }
}

/* Location:
 * Qualified Name:     androidx.browser.customtabs.CustomTabsSessionToken
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */