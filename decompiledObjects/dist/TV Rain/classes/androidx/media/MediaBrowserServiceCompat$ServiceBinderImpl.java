package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import java.util.Iterator;
import z2;

class MediaBrowserServiceCompat$ServiceBinderImpl
{
  public MediaBrowserServiceCompat$ServiceBinderImpl(MediaBrowserServiceCompat paramMediaBrowserServiceCompat) {}
  
  public void addSubscription(final String paramString, final IBinder paramIBinder, final Bundle paramBundle, final MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks)
  {
    this$0.mHandler.postOrRun(new Runnable()
    {
      public void run()
      {
        Object localObject = paramServiceCallbacks.asBinder();
        localObject = (MediaBrowserServiceCompat.ConnectionRecord)this$0.mConnections.get(localObject);
        if (localObject == null)
        {
          localObject = z2.t("addSubscription for callback that isn't registered id=");
          ((StringBuilder)localObject).append(paramString);
          Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
          return;
        }
        this$0.addSubscription(paramString, (MediaBrowserServiceCompat.ConnectionRecord)localObject, paramIBinder, paramBundle);
      }
    });
  }
  
  public void connect(final String paramString, final int paramInt1, final int paramInt2, final Bundle paramBundle, final MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks)
  {
    if (this$0.isValidPackage(paramString, paramInt2))
    {
      this$0.mHandler.postOrRun(new Runnable()
      {
        public void run()
        {
          Object localObject1 = paramServiceCallbacks.asBinder();
          this$0.mConnections.remove(localObject1);
          MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = new MediaBrowserServiceCompat.ConnectionRecord(this$0, paramString, paramInt1, paramInt2, paramBundle, paramServiceCallbacks);
          Object localObject2 = this$0;
          mCurConnection = localConnectionRecord;
          localObject2 = ((MediaBrowserServiceCompat)localObject2).onGetRoot(paramString, paramInt2, paramBundle);
          root = ((MediaBrowserServiceCompat.BrowserRoot)localObject2);
          MediaBrowserServiceCompat localMediaBrowserServiceCompat = this$0;
          mCurConnection = null;
          StringBuilder localStringBuilder1;
          if (localObject2 == null)
          {
            localObject1 = z2.t("No root for client ");
            ((StringBuilder)localObject1).append(paramString);
            ((StringBuilder)localObject1).append(" from service ");
            ((StringBuilder)localObject1).append(getClass().getName());
            Log.i("MBServiceCompat", ((StringBuilder)localObject1).toString());
            try
            {
              paramServiceCallbacks.onConnectFailed();
            }
            catch (RemoteException localRemoteException1)
            {
              localStringBuilder1 = z2.t("Calling onConnectFailed() failed. Ignoring. pkg=");
              localStringBuilder1.append(paramString);
              Log.w("MBServiceCompat", localStringBuilder1.toString());
            }
          }
          else
          {
            try
            {
              mConnections.put(localStringBuilder1, localConnectionRecord);
              localStringBuilder1.linkToDeath(localConnectionRecord, 0);
              if (this$0.mSession != null) {
                paramServiceCallbacks.onConnect(root.getRootId(), this$0.mSession, root.getExtras());
              }
            }
            catch (RemoteException localRemoteException2)
            {
              StringBuilder localStringBuilder2 = z2.t("Calling onConnect() failed. Dropping client. pkg=");
              localStringBuilder2.append(paramString);
              Log.w("MBServiceCompat", localStringBuilder2.toString());
              this$0.mConnections.remove(localStringBuilder1);
            }
          }
        }
      });
      return;
    }
    paramBundle = new StringBuilder();
    paramBundle.append("Package/uid mismatch: uid=");
    paramBundle.append(paramInt2);
    paramBundle.append(" package=");
    paramBundle.append(paramString);
    throw new IllegalArgumentException(paramBundle.toString());
  }
  
  public void disconnect(final MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks)
  {
    this$0.mHandler.postOrRun(new Runnable()
    {
      public void run()
      {
        Object localObject = paramServiceCallbacks.asBinder();
        localObject = (MediaBrowserServiceCompat.ConnectionRecord)this$0.mConnections.remove(localObject);
        if (localObject != null) {
          callbacks.asBinder().unlinkToDeath((IBinder.DeathRecipient)localObject, 0);
        }
      }
    });
  }
  
  public void getMediaItem(final String paramString, final ResultReceiver paramResultReceiver, final MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks)
  {
    if ((!TextUtils.isEmpty(paramString)) && (paramResultReceiver != null)) {
      this$0.mHandler.postOrRun(new Runnable()
      {
        public void run()
        {
          Object localObject = paramServiceCallbacks.asBinder();
          localObject = (MediaBrowserServiceCompat.ConnectionRecord)this$0.mConnections.get(localObject);
          if (localObject == null)
          {
            localObject = z2.t("getMediaItem for callback that isn't registered id=");
            ((StringBuilder)localObject).append(paramString);
            Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
            return;
          }
          this$0.performLoadItem(paramString, (MediaBrowserServiceCompat.ConnectionRecord)localObject, paramResultReceiver);
        }
      });
    }
  }
  
  public void registerCallbacks(final MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks, final String paramString, final int paramInt1, final int paramInt2, final Bundle paramBundle)
  {
    this$0.mHandler.postOrRun(new Runnable()
    {
      public void run()
      {
        IBinder localIBinder = paramServiceCallbacks.asBinder();
        this$0.mConnections.remove(localIBinder);
        Iterator localIterator = this$0.mPendingConnections.iterator();
        Object localObject1;
        MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord;
        do
        {
          boolean bool = localIterator.hasNext();
          localObject1 = null;
          localObject2 = null;
          if (!bool) {
            break;
          }
          localConnectionRecord = (MediaBrowserServiceCompat.ConnectionRecord)localIterator.next();
        } while (uid != paramInt2);
        if (!TextUtils.isEmpty(paramString))
        {
          localObject1 = localObject2;
          if (paramInt1 > 0) {}
        }
        else
        {
          localObject1 = new MediaBrowserServiceCompat.ConnectionRecord(this$0, pkg, pid, uid, paramBundle, paramServiceCallbacks);
        }
        localIterator.remove();
        Object localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new MediaBrowserServiceCompat.ConnectionRecord(this$0, paramString, paramInt1, paramInt2, paramBundle, paramServiceCallbacks);
        }
        this$0.mConnections.put(localIBinder, localObject2);
        try
        {
          localIBinder.linkToDeath((IBinder.DeathRecipient)localObject2, 0);
        }
        catch (RemoteException localRemoteException)
        {
          Log.w("MBServiceCompat", "IBinder is already dead.");
        }
      }
    });
  }
  
  public void removeSubscription(final String paramString, final IBinder paramIBinder, final MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks)
  {
    this$0.mHandler.postOrRun(new Runnable()
    {
      public void run()
      {
        Object localObject = paramServiceCallbacks.asBinder();
        localObject = (MediaBrowserServiceCompat.ConnectionRecord)this$0.mConnections.get(localObject);
        if (localObject == null)
        {
          localObject = z2.t("removeSubscription for callback that isn't registered id=");
          ((StringBuilder)localObject).append(paramString);
          Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
          return;
        }
        if (!this$0.removeSubscription(paramString, (MediaBrowserServiceCompat.ConnectionRecord)localObject, paramIBinder))
        {
          localObject = z2.t("removeSubscription called for ");
          ((StringBuilder)localObject).append(paramString);
          ((StringBuilder)localObject).append(" which is not subscribed");
          Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
        }
      }
    });
  }
  
  public void search(final String paramString, final Bundle paramBundle, final ResultReceiver paramResultReceiver, final MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks)
  {
    if ((!TextUtils.isEmpty(paramString)) && (paramResultReceiver != null)) {
      this$0.mHandler.postOrRun(new Runnable()
      {
        public void run()
        {
          Object localObject = paramServiceCallbacks.asBinder();
          localObject = (MediaBrowserServiceCompat.ConnectionRecord)this$0.mConnections.get(localObject);
          if (localObject == null)
          {
            localObject = z2.t("search for callback that isn't registered query=");
            ((StringBuilder)localObject).append(paramString);
            Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
            return;
          }
          this$0.performSearch(paramString, paramBundle, (MediaBrowserServiceCompat.ConnectionRecord)localObject, paramResultReceiver);
        }
      });
    }
  }
  
  public void sendCustomAction(final String paramString, final Bundle paramBundle, final ResultReceiver paramResultReceiver, final MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks)
  {
    if ((!TextUtils.isEmpty(paramString)) && (paramResultReceiver != null)) {
      this$0.mHandler.postOrRun(new Runnable()
      {
        public void run()
        {
          Object localObject = paramServiceCallbacks.asBinder();
          localObject = (MediaBrowserServiceCompat.ConnectionRecord)this$0.mConnections.get(localObject);
          if (localObject == null)
          {
            localObject = z2.t("sendCustomAction for callback that isn't registered action=");
            ((StringBuilder)localObject).append(paramString);
            ((StringBuilder)localObject).append(", extras=");
            ((StringBuilder)localObject).append(paramBundle);
            Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
            return;
          }
          this$0.performCustomAction(paramString, paramBundle, (MediaBrowserServiceCompat.ConnectionRecord)localObject, paramResultReceiver);
        }
      });
    }
  }
  
  public void unregisterCallbacks(final MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks)
  {
    this$0.mHandler.postOrRun(new Runnable()
    {
      public void run()
      {
        IBinder localIBinder = paramServiceCallbacks.asBinder();
        MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = (MediaBrowserServiceCompat.ConnectionRecord)this$0.mConnections.remove(localIBinder);
        if (localConnectionRecord != null) {
          localIBinder.unlinkToDeath(localConnectionRecord, 0);
        }
      }
    });
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */