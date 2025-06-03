package androidx.browser.customtabs;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.IPostMessageService.Stub;

class PostMessageService$1
  extends IPostMessageService.Stub
{
  public PostMessageService$1(PostMessageService paramPostMessageService) {}
  
  public void onMessageChannelReady(ICustomTabsCallback paramICustomTabsCallback, Bundle paramBundle)
    throws RemoteException
  {
    paramICustomTabsCallback.onMessageChannelReady(paramBundle);
  }
  
  public void onPostMessage(ICustomTabsCallback paramICustomTabsCallback, String paramString, Bundle paramBundle)
    throws RemoteException
  {
    paramICustomTabsCallback.onPostMessage(paramString, paramBundle);
  }
}

/* Location:
 * Qualified Name:     androidx.browser.customtabs.PostMessageService.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */