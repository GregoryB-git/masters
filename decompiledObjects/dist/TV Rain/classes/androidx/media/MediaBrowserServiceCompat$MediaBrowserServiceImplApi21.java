package androidx.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.media.browse.MediaBrowser.MediaItem;
import android.media.session.MediaSession.Token;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.service.media.MediaBrowserService.BrowserRoot;
import android.service.media.MediaBrowserService.Result;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.BundleCompat;
import androidx.core.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@RequiresApi(21)
class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21
  implements MediaBrowserServiceCompat.MediaBrowserServiceImpl
{
  public Messenger mMessenger;
  public final List<Bundle> mRootExtrasList = new ArrayList();
  public MediaBrowserService mServiceFwk;
  
  public MediaBrowserServiceCompat$MediaBrowserServiceImplApi21(MediaBrowserServiceCompat paramMediaBrowserServiceCompat) {}
  
  public Bundle getBrowserRootHints()
  {
    Object localObject = mMessenger;
    Bundle localBundle = null;
    if (localObject == null) {
      return null;
    }
    localObject = this$0.mCurConnection;
    if (localObject != null)
    {
      if (rootHints != null) {
        localBundle = new Bundle(this$0.mCurConnection.rootHints);
      }
      return localBundle;
    }
    throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
  }
  
  public MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo()
  {
    MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = this$0.mCurConnection;
    if (localConnectionRecord != null) {
      return browserInfo;
    }
    throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
  }
  
  public void notifyChildrenChanged(MediaSessionManager.RemoteUserInfo paramRemoteUserInfo, String paramString, Bundle paramBundle)
  {
    notifyChildrenChangedForCompat(paramRemoteUserInfo, paramString, paramBundle);
  }
  
  public void notifyChildrenChanged(String paramString, Bundle paramBundle)
  {
    notifyChildrenChangedForFramework(paramString, paramBundle);
    notifyChildrenChangedForCompat(paramString, paramBundle);
  }
  
  public void notifyChildrenChangedForCompat(final MediaSessionManager.RemoteUserInfo paramRemoteUserInfo, final String paramString, final Bundle paramBundle)
  {
    this$0.mHandler.post(new Runnable()
    {
      public void run()
      {
        for (int i = 0; i < this$0.mConnections.size(); i++)
        {
          MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = (MediaBrowserServiceCompat.ConnectionRecord)this$0.mConnections.valueAt(i);
          if (browserInfo.equals(paramRemoteUserInfo)) {
            notifyChildrenChangedForCompatOnHandler(localConnectionRecord, paramString, paramBundle);
          }
        }
      }
    });
  }
  
  public void notifyChildrenChangedForCompat(final String paramString, final Bundle paramBundle)
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
          notifyChildrenChangedForCompatOnHandler((MediaBrowserServiceCompat.ConnectionRecord)localObject, paramString, paramBundle);
        }
      }
    });
  }
  
  public void notifyChildrenChangedForCompatOnHandler(MediaBrowserServiceCompat.ConnectionRecord paramConnectionRecord, String paramString, Bundle paramBundle)
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
  
  public void notifyChildrenChangedForFramework(String paramString, Bundle paramBundle)
  {
    mServiceFwk.notifyChildrenChanged(paramString);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return mServiceFwk.onBind(paramIntent);
  }
  
  public void onCreate()
  {
    MediaBrowserServiceApi21 localMediaBrowserServiceApi21 = new MediaBrowserServiceApi21(this$0);
    mServiceFwk = localMediaBrowserServiceApi21;
    localMediaBrowserServiceApi21.onCreate();
  }
  
  public MediaBrowserServiceCompat.BrowserRoot onGetRoot(String paramString, int paramInt, Bundle paramBundle)
  {
    Object localObject2;
    int i;
    if ((paramBundle != null) && (paramBundle.getInt("extra_client_version", 0) != 0))
    {
      paramBundle.remove("extra_client_version");
      mMessenger = new Messenger(this$0.mHandler);
      localObject1 = new Bundle();
      ((BaseBundle)localObject1).putInt("extra_service_version", 2);
      BundleCompat.putBinder((Bundle)localObject1, "extra_messenger", mMessenger.getBinder());
      localObject2 = this$0.mSession;
      if (localObject2 != null)
      {
        localObject2 = ((MediaSessionCompat.Token)localObject2).getExtraBinder();
        if (localObject2 == null) {
          localObject2 = null;
        } else {
          localObject2 = ((IInterface)localObject2).asBinder();
        }
        BundleCompat.putBinder((Bundle)localObject1, "extra_session_binder", (IBinder)localObject2);
      }
      else
      {
        mRootExtrasList.add(localObject1);
      }
      i = paramBundle.getInt("extra_calling_pid", -1);
      paramBundle.remove("extra_calling_pid");
      localObject2 = localObject1;
    }
    else
    {
      i = -1;
      localObject2 = null;
    }
    Object localObject1 = new MediaBrowserServiceCompat.ConnectionRecord(this$0, paramString, i, paramInt, paramBundle, null);
    MediaBrowserServiceCompat localMediaBrowserServiceCompat = this$0;
    mCurConnection = ((MediaBrowserServiceCompat.ConnectionRecord)localObject1);
    paramBundle = localMediaBrowserServiceCompat.onGetRoot(paramString, paramInt, paramBundle);
    paramString = this$0;
    mCurConnection = null;
    if (paramBundle == null) {
      return null;
    }
    if (mMessenger != null) {
      mPendingConnections.add(localObject1);
    }
    if (localObject2 == null)
    {
      paramString = paramBundle.getExtras();
    }
    else
    {
      paramString = (String)localObject2;
      if (paramBundle.getExtras() != null)
      {
        ((Bundle)localObject2).putAll(paramBundle.getExtras());
        paramString = (String)localObject2;
      }
    }
    return new MediaBrowserServiceCompat.BrowserRoot(paramBundle.getRootId(), paramString);
  }
  
  public void onLoadChildren(String paramString, final MediaBrowserServiceCompat.ResultWrapper<List<Parcel>> paramResultWrapper)
  {
    MediaBrowserServiceCompat.Result local2 = new MediaBrowserServiceCompat.Result(paramString)
    {
      public void detach()
      {
        paramResultWrapper.detach();
      }
      
      public void onResultSent(@Nullable List<MediaBrowserCompat.MediaItem> paramAnonymousList)
      {
        if (paramAnonymousList != null)
        {
          ArrayList localArrayList = new ArrayList(paramAnonymousList.size());
          Iterator localIterator = paramAnonymousList.iterator();
          for (;;)
          {
            paramAnonymousList = localArrayList;
            if (!localIterator.hasNext()) {
              break;
            }
            paramAnonymousList = (MediaBrowserCompat.MediaItem)localIterator.next();
            Parcel localParcel = Parcel.obtain();
            paramAnonymousList.writeToParcel(localParcel, 0);
            localArrayList.add(localParcel);
          }
        }
        paramAnonymousList = null;
        paramResultWrapper.sendResult(paramAnonymousList);
      }
    };
    paramResultWrapper = this$0;
    mCurConnection = mConnectionFromFwk;
    paramResultWrapper.onLoadChildren(paramString, local2);
    this$0.mCurConnection = null;
  }
  
  public void setSessionToken(final MediaSessionCompat.Token paramToken)
  {
    this$0.mHandler.postOrRun(new Runnable()
    {
      public void run()
      {
        setSessionTokenOnHandler(paramToken);
      }
    });
  }
  
  public void setSessionTokenOnHandler(MediaSessionCompat.Token paramToken)
  {
    if (!mRootExtrasList.isEmpty())
    {
      IMediaSession localIMediaSession = paramToken.getExtraBinder();
      if (localIMediaSession != null)
      {
        Iterator localIterator = mRootExtrasList.iterator();
        while (localIterator.hasNext()) {
          BundleCompat.putBinder((Bundle)localIterator.next(), "extra_session_binder", localIMediaSession.asBinder());
        }
      }
      mRootExtrasList.clear();
    }
    mServiceFwk.setSessionToken((MediaSession.Token)paramToken.getToken());
  }
  
  @RequiresApi(21)
  public class MediaBrowserServiceApi21
    extends MediaBrowserService
  {
    public MediaBrowserServiceApi21(Context paramContext)
    {
      attachBaseContext(paramContext);
    }
    
    @SuppressLint({"SyntheticAccessor"})
    public MediaBrowserService.BrowserRoot onGetRoot(String paramString, int paramInt, Bundle paramBundle)
    {
      MediaSessionCompat.ensureClassLoader(paramBundle);
      MediaBrowserServiceCompat.MediaBrowserServiceImplApi21 localMediaBrowserServiceImplApi21 = MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.this;
      Object localObject = null;
      if (paramBundle == null) {
        paramBundle = null;
      } else {
        paramBundle = new Bundle(paramBundle);
      }
      paramString = localMediaBrowserServiceImplApi21.onGetRoot(paramString, paramInt, paramBundle);
      if (paramString == null) {
        paramString = (String)localObject;
      } else {
        paramString = new MediaBrowserService.BrowserRoot(MediaBrowserServiceCompat.BrowserRoot.access$000(paramString), MediaBrowserServiceCompat.BrowserRoot.access$100(paramString));
      }
      return paramString;
    }
    
    public void onLoadChildren(String paramString, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> paramResult)
    {
      onLoadChildren(paramString, new MediaBrowserServiceCompat.ResultWrapper(paramResult));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */