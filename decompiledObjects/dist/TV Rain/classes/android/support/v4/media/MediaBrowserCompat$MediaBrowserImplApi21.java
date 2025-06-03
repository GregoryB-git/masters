package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.IMediaSession.Stub;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.BundleCompat;
import java.util.List;

@RequiresApi(21)
class MediaBrowserCompat$MediaBrowserImplApi21
  implements MediaBrowserCompat.MediaBrowserImpl, MediaBrowserCompat.MediaBrowserServiceCallbackImpl, MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
{
  public final MediaBrowser mBrowserFwk;
  public Messenger mCallbacksMessenger;
  public final Context mContext;
  public final MediaBrowserCompat.CallbackHandler mHandler = new MediaBrowserCompat.CallbackHandler(this);
  private MediaSessionCompat.Token mMediaSessionToken;
  private Bundle mNotifyChildrenChangedOptions;
  public final Bundle mRootHints;
  public MediaBrowserCompat.ServiceBinderWrapper mServiceBinderWrapper;
  public int mServiceVersion;
  private final ArrayMap<String, MediaBrowserCompat.Subscription> mSubscriptions = new ArrayMap();
  
  public MediaBrowserCompat$MediaBrowserImplApi21(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.ConnectionCallback paramConnectionCallback, Bundle paramBundle)
  {
    mContext = paramContext;
    Bundle localBundle = new android/os/Bundle;
    if (paramBundle != null) {
      localBundle.<init>(paramBundle);
    } else {
      localBundle.<init>();
    }
    mRootHints = localBundle;
    localBundle.putInt("extra_client_version", 1);
    localBundle.putInt("extra_calling_pid", Process.myPid());
    paramConnectionCallback.setInternalConnectionCallback(this);
    mBrowserFwk = new MediaBrowser(paramContext, paramComponentName, mConnectionCallbackFwk, localBundle);
  }
  
  public void connect()
  {
    mBrowserFwk.connect();
  }
  
  public void disconnect()
  {
    MediaBrowserCompat.ServiceBinderWrapper localServiceBinderWrapper = mServiceBinderWrapper;
    if (localServiceBinderWrapper != null)
    {
      Messenger localMessenger = mCallbacksMessenger;
      if (localMessenger != null) {
        try
        {
          localServiceBinderWrapper.unregisterCallbackMessenger(localMessenger);
        }
        catch (RemoteException localRemoteException)
        {
          Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
        }
      }
    }
    mBrowserFwk.disconnect();
  }
  
  @Nullable
  public Bundle getExtras()
  {
    return mBrowserFwk.getExtras();
  }
  
  public void getItem(@NonNull final String paramString, @NonNull final MediaBrowserCompat.ItemCallback paramItemCallback)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      if (paramItemCallback != null)
      {
        if (!mBrowserFwk.isConnected())
        {
          Log.i("MediaBrowserCompat", "Not connected, unable to retrieve the MediaItem.");
          mHandler.post(new Runnable()
          {
            public void run()
            {
              paramItemCallback.onError(paramString);
            }
          });
          return;
        }
        if (mServiceBinderWrapper == null)
        {
          mHandler.post(new Runnable()
          {
            public void run()
            {
              paramItemCallback.onError(paramString);
            }
          });
          return;
        }
        MediaBrowserCompat.ItemReceiver localItemReceiver = new MediaBrowserCompat.ItemReceiver(paramString, paramItemCallback, mHandler);
        try
        {
          mServiceBinderWrapper.getMediaItem(paramString, localItemReceiver, mCallbacksMessenger);
        }
        catch (RemoteException localRemoteException)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Remote error getting media item: ");
          localStringBuilder.append(paramString);
          Log.i("MediaBrowserCompat", localStringBuilder.toString());
          mHandler.post(new Runnable()
          {
            public void run()
            {
              paramItemCallback.onError(paramString);
            }
          });
        }
        return;
      }
      throw new IllegalArgumentException("cb is null");
    }
    throw new IllegalArgumentException("mediaId is empty");
  }
  
  public Bundle getNotifyChildrenChangedOptions()
  {
    return mNotifyChildrenChangedOptions;
  }
  
  @NonNull
  public String getRoot()
  {
    return mBrowserFwk.getRoot();
  }
  
  public ComponentName getServiceComponent()
  {
    return mBrowserFwk.getServiceComponent();
  }
  
  @NonNull
  public MediaSessionCompat.Token getSessionToken()
  {
    if (mMediaSessionToken == null) {
      mMediaSessionToken = MediaSessionCompat.Token.fromToken(mBrowserFwk.getSessionToken());
    }
    return mMediaSessionToken;
  }
  
  public boolean isConnected()
  {
    return mBrowserFwk.isConnected();
  }
  
  public void onConnected()
  {
    try
    {
      Object localObject1 = mBrowserFwk.getExtras();
      if (localObject1 == null) {
        return;
      }
      mServiceVersion = ((BaseBundle)localObject1).getInt("extra_service_version", 0);
      Object localObject2 = BundleCompat.getBinder((Bundle)localObject1, "extra_messenger");
      if (localObject2 != null)
      {
        mServiceBinderWrapper = new MediaBrowserCompat.ServiceBinderWrapper((IBinder)localObject2, mRootHints);
        localObject2 = new Messenger(mHandler);
        mCallbacksMessenger = ((Messenger)localObject2);
        mHandler.setCallbacksMessenger((Messenger)localObject2);
        try
        {
          mServiceBinderWrapper.registerCallbackMessenger(mContext, mCallbacksMessenger);
        }
        catch (RemoteException localRemoteException)
        {
          Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
        }
      }
      localObject1 = IMediaSession.Stub.asInterface(BundleCompat.getBinder((Bundle)localObject1, "extra_session_binder"));
      if (localObject1 != null) {
        mMediaSessionToken = MediaSessionCompat.Token.fromToken(mBrowserFwk.getSessionToken(), (IMediaSession)localObject1);
      }
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", localIllegalStateException);
    }
  }
  
  public void onConnectionFailed() {}
  
  public void onConnectionFailed(Messenger paramMessenger) {}
  
  public void onConnectionSuspended()
  {
    mServiceBinderWrapper = null;
    mCallbacksMessenger = null;
    mMediaSessionToken = null;
    mHandler.setCallbacksMessenger(null);
  }
  
  public void onLoadChildren(Messenger paramMessenger, String paramString, List<MediaBrowserCompat.MediaItem> paramList, Bundle paramBundle1, Bundle paramBundle2)
  {
    if (mCallbacksMessenger != paramMessenger) {
      return;
    }
    paramMessenger = (MediaBrowserCompat.Subscription)mSubscriptions.get(paramString);
    if (paramMessenger == null)
    {
      if (MediaBrowserCompat.DEBUG)
      {
        paramMessenger = new StringBuilder();
        paramMessenger.append("onLoadChildren for id that isn't subscribed id=");
        paramMessenger.append(paramString);
        Log.d("MediaBrowserCompat", paramMessenger.toString());
      }
      return;
    }
    paramMessenger = paramMessenger.getCallback(paramBundle1);
    if (paramMessenger != null) {
      if (paramBundle1 == null)
      {
        if (paramList == null)
        {
          paramMessenger.onError(paramString);
        }
        else
        {
          mNotifyChildrenChangedOptions = paramBundle2;
          paramMessenger.onChildrenLoaded(paramString, paramList);
          mNotifyChildrenChangedOptions = null;
        }
      }
      else if (paramList == null)
      {
        paramMessenger.onError(paramString, paramBundle1);
      }
      else
      {
        mNotifyChildrenChangedOptions = paramBundle2;
        paramMessenger.onChildrenLoaded(paramString, paramList, paramBundle1);
        mNotifyChildrenChangedOptions = null;
      }
    }
  }
  
  public void onServiceConnected(Messenger paramMessenger, String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle) {}
  
  public void search(@NonNull final String paramString, final Bundle paramBundle, @NonNull final MediaBrowserCompat.SearchCallback paramSearchCallback)
  {
    if (isConnected())
    {
      if (mServiceBinderWrapper == null)
      {
        Log.i("MediaBrowserCompat", "The connected service doesn't support search.");
        mHandler.post(new Runnable()
        {
          public void run()
          {
            paramSearchCallback.onError(paramString, paramBundle);
          }
        });
        return;
      }
      Object localObject = new MediaBrowserCompat.SearchResultReceiver(paramString, paramBundle, paramSearchCallback, mHandler);
      try
      {
        mServiceBinderWrapper.search(paramString, paramBundle, (ResultReceiver)localObject, mCallbacksMessenger);
      }
      catch (RemoteException localRemoteException)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Remote error searching items with query: ");
        ((StringBuilder)localObject).append(paramString);
        Log.i("MediaBrowserCompat", ((StringBuilder)localObject).toString(), localRemoteException);
        mHandler.post(new Runnable()
        {
          public void run()
          {
            paramSearchCallback.onError(paramString, paramBundle);
          }
        });
      }
      return;
    }
    throw new IllegalStateException("search() called while not connected");
  }
  
  public void sendCustomAction(@NonNull final String paramString, final Bundle paramBundle, @Nullable final MediaBrowserCompat.CustomActionCallback paramCustomActionCallback)
  {
    if (isConnected())
    {
      if (mServiceBinderWrapper == null)
      {
        Log.i("MediaBrowserCompat", "The connected service doesn't support sendCustomAction.");
        if (paramCustomActionCallback != null) {
          mHandler.post(new Runnable()
          {
            public void run()
            {
              paramCustomActionCallback.onError(paramString, paramBundle, null);
            }
          });
        }
      }
      Object localObject = new MediaBrowserCompat.CustomActionResultReceiver(paramString, paramBundle, paramCustomActionCallback, mHandler);
      try
      {
        mServiceBinderWrapper.sendCustomAction(paramString, paramBundle, (ResultReceiver)localObject, mCallbacksMessenger);
      }
      catch (RemoteException localRemoteException)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Remote error sending a custom action: action=");
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append(", extras=");
        ((StringBuilder)localObject).append(paramBundle);
        Log.i("MediaBrowserCompat", ((StringBuilder)localObject).toString(), localRemoteException);
        if (paramCustomActionCallback != null) {
          mHandler.post(new Runnable()
          {
            public void run()
            {
              paramCustomActionCallback.onError(paramString, paramBundle, null);
            }
          });
        }
      }
      return;
    }
    paramCustomActionCallback = new StringBuilder();
    paramCustomActionCallback.append("Cannot send a custom action (");
    paramCustomActionCallback.append(paramString);
    paramCustomActionCallback.append(") with extras ");
    paramCustomActionCallback.append(paramBundle);
    paramCustomActionCallback.append(" because the browser is not connected to the service.");
    throw new IllegalStateException(paramCustomActionCallback.toString());
  }
  
  public void subscribe(@NonNull String paramString, Bundle paramBundle, @NonNull MediaBrowserCompat.SubscriptionCallback paramSubscriptionCallback)
  {
    MediaBrowserCompat.Subscription localSubscription = (MediaBrowserCompat.Subscription)mSubscriptions.get(paramString);
    Object localObject = localSubscription;
    if (localSubscription == null)
    {
      localObject = new MediaBrowserCompat.Subscription();
      mSubscriptions.put(paramString, localObject);
    }
    paramSubscriptionCallback.setSubscription((MediaBrowserCompat.Subscription)localObject);
    if (paramBundle == null) {
      paramBundle = null;
    } else {
      paramBundle = new Bundle(paramBundle);
    }
    ((MediaBrowserCompat.Subscription)localObject).putCallback(paramBundle, paramSubscriptionCallback);
    localObject = mServiceBinderWrapper;
    if (localObject == null) {
      mBrowserFwk.subscribe(paramString, mSubscriptionCallbackFwk);
    } else {
      try
      {
        ((MediaBrowserCompat.ServiceBinderWrapper)localObject).addSubscription(paramString, mToken, paramBundle, mCallbacksMessenger);
      }
      catch (RemoteException paramBundle)
      {
        paramBundle = new StringBuilder();
        paramBundle.append("Remote error subscribing media item: ");
        paramBundle.append(paramString);
        Log.i("MediaBrowserCompat", paramBundle.toString());
      }
    }
  }
  
  public void unsubscribe(@NonNull String paramString, MediaBrowserCompat.SubscriptionCallback paramSubscriptionCallback)
  {
    MediaBrowserCompat.Subscription localSubscription = (MediaBrowserCompat.Subscription)mSubscriptions.get(paramString);
    if (localSubscription == null) {
      return;
    }
    Object localObject = mServiceBinderWrapper;
    List localList;
    int i;
    if (localObject == null)
    {
      if (paramSubscriptionCallback == null)
      {
        mBrowserFwk.unsubscribe(paramString);
      }
      else
      {
        localObject = localSubscription.getCallbacks();
        localList = localSubscription.getOptionsList();
        for (i = ((List)localObject).size() - 1; i >= 0; i--) {
          if (((List)localObject).get(i) == paramSubscriptionCallback)
          {
            ((List)localObject).remove(i);
            localList.remove(i);
          }
        }
        if (((List)localObject).size() == 0) {
          mBrowserFwk.unsubscribe(paramString);
        }
      }
    }
    else
    {
      if (paramSubscriptionCallback == null) {}
      try
      {
        ((MediaBrowserCompat.ServiceBinderWrapper)localObject).removeSubscription(paramString, null, mCallbacksMessenger);
      }
      catch (RemoteException localRemoteException)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("removeSubscription failed with RemoteException parentId=");
        localStringBuilder.append(paramString);
        Log.d("MediaBrowserCompat", localStringBuilder.toString());
      }
      localObject = localSubscription.getCallbacks();
      localList = localSubscription.getOptionsList();
      for (i = ((List)localObject).size() - 1; i >= 0; i--) {
        if (((List)localObject).get(i) == paramSubscriptionCallback)
        {
          mServiceBinderWrapper.removeSubscription(paramString, mToken, mCallbacksMessenger);
          ((List)localObject).remove(i);
          localList.remove(i);
        }
      }
    }
    if ((localSubscription.isEmpty()) || (paramSubscriptionCallback == null)) {
      mSubscriptions.remove(paramString);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */