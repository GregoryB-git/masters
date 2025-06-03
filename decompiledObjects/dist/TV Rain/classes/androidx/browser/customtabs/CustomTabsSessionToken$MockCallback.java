package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsCallback.Stub;

class CustomTabsSessionToken$MockCallback
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

/* Location:
 * Qualified Name:     androidx.browser.customtabs.CustomTabsSessionToken.MockCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */