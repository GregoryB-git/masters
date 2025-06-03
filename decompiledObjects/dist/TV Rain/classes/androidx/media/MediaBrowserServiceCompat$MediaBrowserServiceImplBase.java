package androidx.media;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pair;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import z2;

class MediaBrowserServiceCompat$MediaBrowserServiceImplBase
  implements MediaBrowserServiceCompat.MediaBrowserServiceImpl
{
  private Messenger mMessenger;
  
  public MediaBrowserServiceCompat$MediaBrowserServiceImplBase(MediaBrowserServiceCompat paramMediaBrowserServiceCompat) {}
  
  public Bundle getBrowserRootHints()
  {
    Object localObject = this$0.mCurConnection;
    if (localObject != null)
    {
      if (rootHints == null) {
        localObject = null;
      } else {
        localObject = new Bundle(this$0.mCurConnection.rootHints);
      }
      return (Bundle)localObject;
    }
    throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
  }
  
  public MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo()
  {
    MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = this$0.mCurConnection;
    if (localConnectionRecord != null) {
      return browserInfo;
    }
    throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
  }
  
  public void notifyChildrenChanged(@NonNull final MediaSessionManager.RemoteUserInfo paramRemoteUserInfo, @NonNull final String paramString, final Bundle paramBundle)
  {
    this$0.mHandler.post(new Runnable()
    {
      public void run()
      {
        for (int i = 0; i < this$0.mConnections.size(); i++)
        {
          MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = (MediaBrowserServiceCompat.ConnectionRecord)this$0.mConnections.valueAt(i);
          if (browserInfo.equals(paramRemoteUserInfo))
          {
            notifyChildrenChangedOnHandler(localConnectionRecord, paramString, paramBundle);
            break;
          }
        }
      }
    });
  }
  
  public void notifyChildrenChanged(@NonNull final String paramString, final Bundle paramBundle)
  {
    this$0.mHandler.post(new Runnable()
    {
      public void run()
      {
        Iterator localIterator = this$0.mConnections.keySet().iterator();
        while (localIterator.hasNext())
        {
          Object localObject = (IBinder)localIterator.next();
          localObject = (MediaBrowserServiceCompat.ConnectionRecord)this$0.mConnections.get(localObject);
          notifyChildrenChangedOnHandler((MediaBrowserServiceCompat.ConnectionRecord)localObject, paramString, paramBundle);
        }
      }
    });
  }
  
  public void notifyChildrenChangedOnHandler(MediaBrowserServiceCompat.ConnectionRecord paramConnectionRecord, String paramString, Bundle paramBundle)
  {
    Object localObject = (List)subscriptions.get(paramString);
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        Pair localPair = (Pair)((Iterator)localObject).next();
        if (MediaBrowserCompatUtils.hasDuplicatedItems(paramBundle, (Bundle)second)) {
          this$0.performLoadChildren(paramString, paramConnectionRecord, (Bundle)second, paramBundle);
        }
      }
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    if ("android.media.browse.MediaBrowserService".equals(paramIntent.getAction())) {
      return mMessenger.getBinder();
    }
    return null;
  }
  
  public void onCreate()
  {
    mMessenger = new Messenger(this$0.mHandler);
  }
  
  public void setSessionToken(final MediaSessionCompat.Token paramToken)
  {
    this$0.mHandler.post(new Runnable()
    {
      public void run()
      {
        Iterator localIterator = this$0.mConnections.values().iterator();
        while (localIterator.hasNext())
        {
          MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = (MediaBrowserServiceCompat.ConnectionRecord)localIterator.next();
          try
          {
            callbacks.onConnect(root.getRootId(), paramToken, root.getExtras());
          }
          catch (RemoteException localRemoteException)
          {
            StringBuilder localStringBuilder = z2.t("Connection for ");
            localStringBuilder.append(pkg);
            localStringBuilder.append(" is no longer valid.");
            Log.w("MBServiceCompat", localStringBuilder.toString());
            localIterator.remove();
          }
        }
      }
    });
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */