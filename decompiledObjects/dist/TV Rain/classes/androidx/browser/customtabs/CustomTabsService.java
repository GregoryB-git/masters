package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService.Stub;
import androidx.collection.ArrayMap;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public abstract class CustomTabsService
  extends Service
{
  public static final String ACTION_CUSTOM_TABS_CONNECTION = "android.support.customtabs.action.CustomTabsService";
  public static final String KEY_URL = "android.support.customtabs.otherurls.URL";
  public static final int RELATION_HANDLE_ALL_URLS = 2;
  public static final int RELATION_USE_AS_ORIGIN = 1;
  public static final int RESULT_FAILURE_DISALLOWED = -1;
  public static final int RESULT_FAILURE_MESSAGING_ERROR = -3;
  public static final int RESULT_FAILURE_REMOTE_ERROR = -2;
  public static final int RESULT_SUCCESS = 0;
  private ICustomTabsService.Stub mBinder = new ICustomTabsService.Stub()
  {
    public Bundle extraCommand(String paramAnonymousString, Bundle paramAnonymousBundle)
    {
      return CustomTabsService.this.extraCommand(paramAnonymousString, paramAnonymousBundle);
    }
    
    public boolean mayLaunchUrl(ICustomTabsCallback paramAnonymousICustomTabsCallback, Uri paramAnonymousUri, Bundle paramAnonymousBundle, List<Bundle> paramAnonymousList)
    {
      return mayLaunchUrl(new CustomTabsSessionToken(paramAnonymousICustomTabsCallback), paramAnonymousUri, paramAnonymousBundle, paramAnonymousList);
    }
    
    public boolean newSession(ICustomTabsCallback paramAnonymousICustomTabsCallback)
    {
      CustomTabsSessionToken localCustomTabsSessionToken = new CustomTabsSessionToken(paramAnonymousICustomTabsCallback);
      try
      {
        IBinder.DeathRecipient local1 = new androidx/browser/customtabs/CustomTabsService$1$1;
        local1.<init>(this, localCustomTabsSessionToken);
        synchronized (mDeathRecipientMap)
        {
          paramAnonymousICustomTabsCallback.asBinder().linkToDeath(local1, 0);
          mDeathRecipientMap.put(paramAnonymousICustomTabsCallback.asBinder(), local1);
          boolean bool = newSession(localCustomTabsSessionToken);
          return bool;
        }
        return false;
      }
      catch (RemoteException paramAnonymousICustomTabsCallback) {}
    }
    
    public int postMessage(ICustomTabsCallback paramAnonymousICustomTabsCallback, String paramAnonymousString, Bundle paramAnonymousBundle)
    {
      return postMessage(new CustomTabsSessionToken(paramAnonymousICustomTabsCallback), paramAnonymousString, paramAnonymousBundle);
    }
    
    public boolean requestPostMessageChannel(ICustomTabsCallback paramAnonymousICustomTabsCallback, Uri paramAnonymousUri)
    {
      return requestPostMessageChannel(new CustomTabsSessionToken(paramAnonymousICustomTabsCallback), paramAnonymousUri);
    }
    
    public boolean updateVisuals(ICustomTabsCallback paramAnonymousICustomTabsCallback, Bundle paramAnonymousBundle)
    {
      return updateVisuals(new CustomTabsSessionToken(paramAnonymousICustomTabsCallback), paramAnonymousBundle);
    }
    
    public boolean validateRelationship(ICustomTabsCallback paramAnonymousICustomTabsCallback, int paramAnonymousInt, Uri paramAnonymousUri, Bundle paramAnonymousBundle)
    {
      return validateRelationship(new CustomTabsSessionToken(paramAnonymousICustomTabsCallback), paramAnonymousInt, paramAnonymousUri, paramAnonymousBundle);
    }
    
    public boolean warmup(long paramAnonymousLong)
    {
      return CustomTabsService.this.warmup(paramAnonymousLong);
    }
  };
  public final Map<IBinder, IBinder.DeathRecipient> mDeathRecipientMap = new ArrayMap();
  
  public boolean cleanUpSession(CustomTabsSessionToken paramCustomTabsSessionToken)
  {
    try
    {
      synchronized (mDeathRecipientMap)
      {
        paramCustomTabsSessionToken = paramCustomTabsSessionToken.getCallbackBinder();
        paramCustomTabsSessionToken.unlinkToDeath((IBinder.DeathRecipient)mDeathRecipientMap.get(paramCustomTabsSessionToken), 0);
        mDeathRecipientMap.remove(paramCustomTabsSessionToken);
        return true;
      }
      return false;
    }
    catch (NoSuchElementException paramCustomTabsSessionToken) {}
  }
  
  public abstract Bundle extraCommand(String paramString, Bundle paramBundle);
  
  public abstract boolean mayLaunchUrl(CustomTabsSessionToken paramCustomTabsSessionToken, Uri paramUri, Bundle paramBundle, List<Bundle> paramList);
  
  public abstract boolean newSession(CustomTabsSessionToken paramCustomTabsSessionToken);
  
  public IBinder onBind(Intent paramIntent)
  {
    return mBinder;
  }
  
  public abstract int postMessage(CustomTabsSessionToken paramCustomTabsSessionToken, String paramString, Bundle paramBundle);
  
  public abstract boolean requestPostMessageChannel(CustomTabsSessionToken paramCustomTabsSessionToken, Uri paramUri);
  
  public abstract boolean updateVisuals(CustomTabsSessionToken paramCustomTabsSessionToken, Bundle paramBundle);
  
  public abstract boolean validateRelationship(CustomTabsSessionToken paramCustomTabsSessionToken, int paramInt, Uri paramUri, Bundle paramBundle);
  
  public abstract boolean warmup(long paramLong);
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Relation {}
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Result {}
}

/* Location:
 * Qualified Name:     androidx.browser.customtabs.CustomTabsService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */