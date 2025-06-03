package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService.Stub;
import java.util.List;
import java.util.Map;

class CustomTabsService$1
  extends ICustomTabsService.Stub
{
  public CustomTabsService$1(CustomTabsService paramCustomTabsService) {}
  
  public Bundle extraCommand(String paramString, Bundle paramBundle)
  {
    return this$0.extraCommand(paramString, paramBundle);
  }
  
  public boolean mayLaunchUrl(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri, Bundle paramBundle, List<Bundle> paramList)
  {
    return this$0.mayLaunchUrl(new CustomTabsSessionToken(paramICustomTabsCallback), paramUri, paramBundle, paramList);
  }
  
  public boolean newSession(ICustomTabsCallback paramICustomTabsCallback)
  {
    CustomTabsSessionToken localCustomTabsSessionToken = new CustomTabsSessionToken(paramICustomTabsCallback);
    try
    {
      IBinder.DeathRecipient local1 = new androidx/browser/customtabs/CustomTabsService$1$1;
      local1.<init>(this, localCustomTabsSessionToken);
      synchronized (this$0.mDeathRecipientMap)
      {
        paramICustomTabsCallback.asBinder().linkToDeath(local1, 0);
        this$0.mDeathRecipientMap.put(paramICustomTabsCallback.asBinder(), local1);
        boolean bool = this$0.newSession(localCustomTabsSessionToken);
        return bool;
      }
      return false;
    }
    catch (RemoteException paramICustomTabsCallback) {}
  }
  
  public int postMessage(ICustomTabsCallback paramICustomTabsCallback, String paramString, Bundle paramBundle)
  {
    return this$0.postMessage(new CustomTabsSessionToken(paramICustomTabsCallback), paramString, paramBundle);
  }
  
  public boolean requestPostMessageChannel(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri)
  {
    return this$0.requestPostMessageChannel(new CustomTabsSessionToken(paramICustomTabsCallback), paramUri);
  }
  
  public boolean updateVisuals(ICustomTabsCallback paramICustomTabsCallback, Bundle paramBundle)
  {
    return this$0.updateVisuals(new CustomTabsSessionToken(paramICustomTabsCallback), paramBundle);
  }
  
  public boolean validateRelationship(ICustomTabsCallback paramICustomTabsCallback, int paramInt, Uri paramUri, Bundle paramBundle)
  {
    return this$0.validateRelationship(new CustomTabsSessionToken(paramICustomTabsCallback), paramInt, paramUri, paramBundle);
  }
  
  public boolean warmup(long paramLong)
  {
    return this$0.warmup(paramLong);
  }
}

/* Location:
 * Qualified Name:     androidx.browser.customtabs.CustomTabsService.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */