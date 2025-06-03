package android.support.v4.media;

import a;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.media.browse.MediaBrowser.ConnectionCallback;
import android.media.browse.MediaBrowser.ItemCallback;
import android.media.browse.MediaBrowser.MediaItem;
import android.media.browse.MediaBrowser.SubscriptionCallback;
import android.os.BadParcelableException;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.IMediaSession.Stub;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.BundleCompat;
import androidx.media.MediaBrowserCompatUtils;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import z2;

public final class MediaBrowserCompat
{
  public static final String CUSTOM_ACTION_DOWNLOAD = "android.support.v4.media.action.DOWNLOAD";
  public static final String CUSTOM_ACTION_REMOVE_DOWNLOADED_FILE = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";
  public static final boolean DEBUG = Log.isLoggable("MediaBrowserCompat", 3);
  public static final String EXTRA_DOWNLOAD_PROGRESS = "android.media.browse.extra.DOWNLOAD_PROGRESS";
  public static final String EXTRA_MEDIA_ID = "android.media.browse.extra.MEDIA_ID";
  public static final String EXTRA_PAGE = "android.media.browse.extra.PAGE";
  public static final String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";
  public static final String TAG = "MediaBrowserCompat";
  private final MediaBrowserImpl mImpl;
  
  public MediaBrowserCompat(Context paramContext, ComponentName paramComponentName, ConnectionCallback paramConnectionCallback, Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      mImpl = new MediaBrowserImplApi26(paramContext, paramComponentName, paramConnectionCallback, paramBundle);
    } else {
      mImpl = new MediaBrowserImplApi23(paramContext, paramComponentName, paramConnectionCallback, paramBundle);
    }
  }
  
  public void connect()
  {
    Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
    mImpl.connect();
  }
  
  public void disconnect()
  {
    mImpl.disconnect();
  }
  
  @Nullable
  public Bundle getExtras()
  {
    return mImpl.getExtras();
  }
  
  public void getItem(@NonNull String paramString, @NonNull ItemCallback paramItemCallback)
  {
    mImpl.getItem(paramString, paramItemCallback);
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public Bundle getNotifyChildrenChangedOptions()
  {
    return mImpl.getNotifyChildrenChangedOptions();
  }
  
  @NonNull
  public String getRoot()
  {
    return mImpl.getRoot();
  }
  
  @NonNull
  public ComponentName getServiceComponent()
  {
    return mImpl.getServiceComponent();
  }
  
  @NonNull
  public MediaSessionCompat.Token getSessionToken()
  {
    return mImpl.getSessionToken();
  }
  
  public boolean isConnected()
  {
    return mImpl.isConnected();
  }
  
  public void search(@NonNull String paramString, Bundle paramBundle, @NonNull SearchCallback paramSearchCallback)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      if (paramSearchCallback != null)
      {
        mImpl.search(paramString, paramBundle, paramSearchCallback);
        return;
      }
      throw new IllegalArgumentException("callback cannot be null");
    }
    throw new IllegalArgumentException("query cannot be empty");
  }
  
  public void sendCustomAction(@NonNull String paramString, Bundle paramBundle, @Nullable CustomActionCallback paramCustomActionCallback)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      mImpl.sendCustomAction(paramString, paramBundle, paramCustomActionCallback);
      return;
    }
    throw new IllegalArgumentException("action cannot be empty");
  }
  
  public void subscribe(@NonNull String paramString, @NonNull Bundle paramBundle, @NonNull SubscriptionCallback paramSubscriptionCallback)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      if (paramSubscriptionCallback != null)
      {
        if (paramBundle != null)
        {
          mImpl.subscribe(paramString, paramBundle, paramSubscriptionCallback);
          return;
        }
        throw new IllegalArgumentException("options are null");
      }
      throw new IllegalArgumentException("callback is null");
    }
    throw new IllegalArgumentException("parentId is empty");
  }
  
  public void subscribe(@NonNull String paramString, @NonNull SubscriptionCallback paramSubscriptionCallback)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      if (paramSubscriptionCallback != null)
      {
        mImpl.subscribe(paramString, null, paramSubscriptionCallback);
        return;
      }
      throw new IllegalArgumentException("callback is null");
    }
    throw new IllegalArgumentException("parentId is empty");
  }
  
  public void unsubscribe(@NonNull String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      mImpl.unsubscribe(paramString, null);
      return;
    }
    throw new IllegalArgumentException("parentId is empty");
  }
  
  public void unsubscribe(@NonNull String paramString, @NonNull SubscriptionCallback paramSubscriptionCallback)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      if (paramSubscriptionCallback != null)
      {
        mImpl.unsubscribe(paramString, paramSubscriptionCallback);
        return;
      }
      throw new IllegalArgumentException("callback is null");
    }
    throw new IllegalArgumentException("parentId is empty");
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static MediaDescription getDescription(MediaBrowser.MediaItem paramMediaItem)
    {
      return paramMediaItem.getDescription();
    }
    
    @DoNotInline
    public static int getFlags(MediaBrowser.MediaItem paramMediaItem)
    {
      return paramMediaItem.getFlags();
    }
  }
  
  public static class CallbackHandler
    extends Handler
  {
    private final WeakReference<MediaBrowserCompat.MediaBrowserServiceCallbackImpl> mCallbackImplRef;
    private WeakReference<Messenger> mCallbacksMessengerRef;
    
    public CallbackHandler(MediaBrowserCompat.MediaBrowserServiceCallbackImpl paramMediaBrowserServiceCallbackImpl)
    {
      mCallbackImplRef = new WeakReference(paramMediaBrowserServiceCallbackImpl);
    }
    
    public void handleMessage(@NonNull Message paramMessage)
    {
      Object localObject1 = mCallbacksMessengerRef;
      if ((localObject1 != null) && (((Reference)localObject1).get() != null) && (mCallbackImplRef.get() != null))
      {
        Object localObject2 = paramMessage.getData();
        MediaSessionCompat.ensureClassLoader((Bundle)localObject2);
        localObject1 = (MediaBrowserCompat.MediaBrowserServiceCallbackImpl)mCallbackImplRef.get();
        Messenger localMessenger = (Messenger)mCallbacksMessengerRef.get();
        try
        {
          int i = what;
          Bundle localBundle2;
          if (i != 1)
          {
            if (i != 2)
            {
              if (i != 3)
              {
                localObject2 = new java/lang/StringBuilder;
                ((StringBuilder)localObject2).<init>();
                ((StringBuilder)localObject2).append("Unhandled message: ");
                ((StringBuilder)localObject2).append(paramMessage);
                ((StringBuilder)localObject2).append("\n  Client version: ");
                ((StringBuilder)localObject2).append(1);
                ((StringBuilder)localObject2).append("\n  Service version: ");
                ((StringBuilder)localObject2).append(arg1);
                Log.w("MediaBrowserCompat", ((StringBuilder)localObject2).toString());
              }
              else
              {
                Bundle localBundle1 = ((Bundle)localObject2).getBundle("data_options");
                MediaSessionCompat.ensureClassLoader(localBundle1);
                localBundle2 = ((Bundle)localObject2).getBundle("data_notify_children_changed_options");
                MediaSessionCompat.ensureClassLoader(localBundle2);
                ((MediaBrowserCompat.MediaBrowserServiceCallbackImpl)localObject1).onLoadChildren(localMessenger, ((BaseBundle)localObject2).getString("data_media_item_id"), ((Bundle)localObject2).getParcelableArrayList("data_media_item_list"), localBundle1, localBundle2);
              }
            }
            else {
              ((MediaBrowserCompat.MediaBrowserServiceCallbackImpl)localObject1).onConnectionFailed(localMessenger);
            }
          }
          else
          {
            localBundle2 = ((Bundle)localObject2).getBundle("data_root_hints");
            MediaSessionCompat.ensureClassLoader(localBundle2);
            ((MediaBrowserCompat.MediaBrowserServiceCallbackImpl)localObject1).onServiceConnected(localMessenger, ((BaseBundle)localObject2).getString("data_media_item_id"), (MediaSessionCompat.Token)((Bundle)localObject2).getParcelable("data_media_session_token"), localBundle2);
          }
        }
        catch (BadParcelableException localBadParcelableException)
        {
          Log.e("MediaBrowserCompat", "Could not unparcel the data.");
          if (what == 1) {
            ((MediaBrowserCompat.MediaBrowserServiceCallbackImpl)localObject1).onConnectionFailed(localMessenger);
          }
        }
      }
    }
    
    public void setCallbacksMessenger(Messenger paramMessenger)
    {
      mCallbacksMessengerRef = new WeakReference(paramMessenger);
    }
  }
  
  public static class ConnectionCallback
  {
    public final MediaBrowser.ConnectionCallback mConnectionCallbackFwk = new ConnectionCallbackApi21();
    public ConnectionCallbackInternal mConnectionCallbackInternal;
    
    public void onConnected() {}
    
    public void onConnectionFailed() {}
    
    public void onConnectionSuspended() {}
    
    public void setInternalConnectionCallback(ConnectionCallbackInternal paramConnectionCallbackInternal)
    {
      mConnectionCallbackInternal = paramConnectionCallbackInternal;
    }
    
    @RequiresApi(21)
    public class ConnectionCallbackApi21
      extends MediaBrowser.ConnectionCallback
    {
      public ConnectionCallbackApi21() {}
      
      public void onConnected()
      {
        MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal localConnectionCallbackInternal = mConnectionCallbackInternal;
        if (localConnectionCallbackInternal != null) {
          localConnectionCallbackInternal.onConnected();
        }
        MediaBrowserCompat.ConnectionCallback.this.onConnected();
      }
      
      public void onConnectionFailed()
      {
        MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal localConnectionCallbackInternal = mConnectionCallbackInternal;
        if (localConnectionCallbackInternal != null) {
          localConnectionCallbackInternal.onConnectionFailed();
        }
        MediaBrowserCompat.ConnectionCallback.this.onConnectionFailed();
      }
      
      public void onConnectionSuspended()
      {
        MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal localConnectionCallbackInternal = mConnectionCallbackInternal;
        if (localConnectionCallbackInternal != null) {
          localConnectionCallbackInternal.onConnectionSuspended();
        }
        MediaBrowserCompat.ConnectionCallback.this.onConnectionSuspended();
      }
    }
    
    public static abstract interface ConnectionCallbackInternal
    {
      public abstract void onConnected();
      
      public abstract void onConnectionFailed();
      
      public abstract void onConnectionSuspended();
    }
  }
  
  public static abstract class CustomActionCallback
  {
    public void onError(String paramString, Bundle paramBundle1, Bundle paramBundle2) {}
    
    public void onProgressUpdate(String paramString, Bundle paramBundle1, Bundle paramBundle2) {}
    
    public void onResult(String paramString, Bundle paramBundle1, Bundle paramBundle2) {}
  }
  
  public static class CustomActionResultReceiver
    extends ResultReceiver
  {
    private final String mAction;
    private final MediaBrowserCompat.CustomActionCallback mCallback;
    private final Bundle mExtras;
    
    public CustomActionResultReceiver(String paramString, Bundle paramBundle, MediaBrowserCompat.CustomActionCallback paramCustomActionCallback, Handler paramHandler)
    {
      super();
      mAction = paramString;
      mExtras = paramBundle;
      mCallback = paramCustomActionCallback;
    }
    
    public void onReceiveResult(int paramInt, Bundle paramBundle)
    {
      if (mCallback == null) {
        return;
      }
      MediaSessionCompat.ensureClassLoader(paramBundle);
      if (paramInt != -1)
      {
        if (paramInt != 0)
        {
          if (paramInt != 1)
          {
            StringBuilder localStringBuilder = a.r("Unknown result code: ", paramInt, " (extras=");
            localStringBuilder.append(mExtras);
            localStringBuilder.append(", resultData=");
            localStringBuilder.append(paramBundle);
            localStringBuilder.append(")");
            Log.w("MediaBrowserCompat", localStringBuilder.toString());
          }
          else
          {
            mCallback.onProgressUpdate(mAction, mExtras, paramBundle);
          }
        }
        else {
          mCallback.onResult(mAction, mExtras, paramBundle);
        }
      }
      else {
        mCallback.onError(mAction, mExtras, paramBundle);
      }
    }
  }
  
  public static abstract class ItemCallback
  {
    public final MediaBrowser.ItemCallback mItemCallbackFwk = new ItemCallbackApi23();
    
    public void onError(@NonNull String paramString) {}
    
    public void onItemLoaded(MediaBrowserCompat.MediaItem paramMediaItem) {}
    
    @RequiresApi(23)
    public class ItemCallbackApi23
      extends MediaBrowser.ItemCallback
    {
      public ItemCallbackApi23() {}
      
      public void onError(@NonNull String paramString)
      {
        MediaBrowserCompat.ItemCallback.this.onError(paramString);
      }
      
      public void onItemLoaded(MediaBrowser.MediaItem paramMediaItem)
      {
        onItemLoaded(MediaBrowserCompat.MediaItem.fromMediaItem(paramMediaItem));
      }
    }
  }
  
  public static class ItemReceiver
    extends ResultReceiver
  {
    private final MediaBrowserCompat.ItemCallback mCallback;
    private final String mMediaId;
    
    public ItemReceiver(String paramString, MediaBrowserCompat.ItemCallback paramItemCallback, Handler paramHandler)
    {
      super();
      mMediaId = paramString;
      mCallback = paramItemCallback;
    }
    
    public void onReceiveResult(int paramInt, Bundle paramBundle)
    {
      Bundle localBundle = paramBundle;
      if (paramBundle != null) {
        localBundle = MediaSessionCompat.unparcelWithClassLoader(paramBundle);
      }
      if ((paramInt == 0) && (localBundle != null) && (localBundle.containsKey("media_item")))
      {
        paramBundle = localBundle.getParcelable("media_item");
        if ((paramBundle != null) && (!(paramBundle instanceof MediaBrowserCompat.MediaItem))) {
          mCallback.onError(mMediaId);
        } else {
          mCallback.onItemLoaded((MediaBrowserCompat.MediaItem)paramBundle);
        }
        return;
      }
      mCallback.onError(mMediaId);
    }
  }
  
  public static abstract interface MediaBrowserImpl
  {
    public abstract void connect();
    
    public abstract void disconnect();
    
    @Nullable
    public abstract Bundle getExtras();
    
    public abstract void getItem(@NonNull String paramString, @NonNull MediaBrowserCompat.ItemCallback paramItemCallback);
    
    @Nullable
    public abstract Bundle getNotifyChildrenChangedOptions();
    
    @NonNull
    public abstract String getRoot();
    
    public abstract ComponentName getServiceComponent();
    
    @NonNull
    public abstract MediaSessionCompat.Token getSessionToken();
    
    public abstract boolean isConnected();
    
    public abstract void search(@NonNull String paramString, Bundle paramBundle, @NonNull MediaBrowserCompat.SearchCallback paramSearchCallback);
    
    public abstract void sendCustomAction(@NonNull String paramString, Bundle paramBundle, @Nullable MediaBrowserCompat.CustomActionCallback paramCustomActionCallback);
    
    public abstract void subscribe(@NonNull String paramString, @Nullable Bundle paramBundle, @NonNull MediaBrowserCompat.SubscriptionCallback paramSubscriptionCallback);
    
    public abstract void unsubscribe(@NonNull String paramString, MediaBrowserCompat.SubscriptionCallback paramSubscriptionCallback);
  }
  
  @RequiresApi(21)
  public static class MediaBrowserImplApi21
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
    
    public MediaBrowserImplApi21(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.ConnectionCallback paramConnectionCallback, Bundle paramBundle)
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
  
  @RequiresApi(23)
  public static class MediaBrowserImplApi23
    extends MediaBrowserCompat.MediaBrowserImplApi21
  {
    public MediaBrowserImplApi23(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.ConnectionCallback paramConnectionCallback, Bundle paramBundle)
    {
      super(paramComponentName, paramConnectionCallback, paramBundle);
    }
    
    public void getItem(@NonNull String paramString, @NonNull MediaBrowserCompat.ItemCallback paramItemCallback)
    {
      if (mServiceBinderWrapper == null) {
        mBrowserFwk.getItem(paramString, mItemCallbackFwk);
      } else {
        super.getItem(paramString, paramItemCallback);
      }
    }
  }
  
  @RequiresApi(26)
  public static class MediaBrowserImplApi26
    extends MediaBrowserCompat.MediaBrowserImplApi23
  {
    public MediaBrowserImplApi26(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.ConnectionCallback paramConnectionCallback, Bundle paramBundle)
    {
      super(paramComponentName, paramConnectionCallback, paramBundle);
    }
    
    public void subscribe(@NonNull String paramString, @Nullable Bundle paramBundle, @NonNull MediaBrowserCompat.SubscriptionCallback paramSubscriptionCallback)
    {
      if ((mServiceBinderWrapper != null) && (mServiceVersion >= 2)) {
        super.subscribe(paramString, paramBundle, paramSubscriptionCallback);
      } else if (paramBundle == null) {
        mBrowserFwk.subscribe(paramString, mSubscriptionCallbackFwk);
      } else {
        mBrowserFwk.subscribe(paramString, paramBundle, mSubscriptionCallbackFwk);
      }
    }
    
    public void unsubscribe(@NonNull String paramString, MediaBrowserCompat.SubscriptionCallback paramSubscriptionCallback)
    {
      if ((mServiceBinderWrapper != null) && (mServiceVersion >= 2)) {
        super.unsubscribe(paramString, paramSubscriptionCallback);
      } else if (paramSubscriptionCallback == null) {
        mBrowserFwk.unsubscribe(paramString);
      } else {
        mBrowserFwk.unsubscribe(paramString, mSubscriptionCallbackFwk);
      }
    }
  }
  
  public static class MediaBrowserImplBase
    implements MediaBrowserCompat.MediaBrowserImpl, MediaBrowserCompat.MediaBrowserServiceCallbackImpl
  {
    public static final int CONNECT_STATE_CONNECTED = 3;
    public static final int CONNECT_STATE_CONNECTING = 2;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 0;
    public static final int CONNECT_STATE_SUSPENDED = 4;
    public final MediaBrowserCompat.ConnectionCallback mCallback;
    public Messenger mCallbacksMessenger;
    public final Context mContext;
    private Bundle mExtras;
    public final MediaBrowserCompat.CallbackHandler mHandler = new MediaBrowserCompat.CallbackHandler(this);
    private MediaSessionCompat.Token mMediaSessionToken;
    private Bundle mNotifyChildrenChangedOptions;
    public final Bundle mRootHints;
    private String mRootId;
    public MediaBrowserCompat.ServiceBinderWrapper mServiceBinderWrapper;
    public final ComponentName mServiceComponent;
    public MediaServiceConnection mServiceConnection;
    public int mState = 1;
    private final ArrayMap<String, MediaBrowserCompat.Subscription> mSubscriptions = new ArrayMap();
    
    public MediaBrowserImplBase(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.ConnectionCallback paramConnectionCallback, Bundle paramBundle)
    {
      if (paramContext != null)
      {
        if (paramComponentName != null)
        {
          if (paramConnectionCallback != null)
          {
            mContext = paramContext;
            mServiceComponent = paramComponentName;
            mCallback = paramConnectionCallback;
            if (paramBundle == null) {
              paramContext = null;
            } else {
              paramContext = new Bundle(paramBundle);
            }
            mRootHints = paramContext;
            return;
          }
          throw new IllegalArgumentException("connection callback must not be null");
        }
        throw new IllegalArgumentException("service component must not be null");
      }
      throw new IllegalArgumentException("context must not be null");
    }
    
    private static String getStateLabel(int paramInt)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2)
          {
            if (paramInt != 3)
            {
              if (paramInt != 4) {
                return a.f("UNKNOWN/", paramInt);
              }
              return "CONNECT_STATE_SUSPENDED";
            }
            return "CONNECT_STATE_CONNECTED";
          }
          return "CONNECT_STATE_CONNECTING";
        }
        return "CONNECT_STATE_DISCONNECTED";
      }
      return "CONNECT_STATE_DISCONNECTING";
    }
    
    private boolean isCurrent(Messenger paramMessenger, String paramString)
    {
      if (mCallbacksMessenger == paramMessenger)
      {
        i = mState;
        if ((i != 0) && (i != 1)) {
          return true;
        }
      }
      int i = mState;
      if ((i != 0) && (i != 1))
      {
        paramMessenger = z2.u(paramString, " for ");
        paramMessenger.append(mServiceComponent);
        paramMessenger.append(" with mCallbacksMessenger=");
        paramMessenger.append(mCallbacksMessenger);
        paramMessenger.append(" this=");
        paramMessenger.append(this);
        Log.i("MediaBrowserCompat", paramMessenger.toString());
      }
      return false;
    }
    
    public void connect()
    {
      int i = mState;
      if ((i != 0) && (i != 1)) {
        throw new IllegalStateException(z2.s(z2.t("connect() called while neigther disconnecting nor disconnected (state="), getStateLabel(mState), ")"));
      }
      mState = 2;
      mHandler.post(new Runnable()
      {
        public void run()
        {
          Object localObject = MediaBrowserCompat.MediaBrowserImplBase.this;
          if (mState == 0) {
            return;
          }
          mState = 2;
          if ((MediaBrowserCompat.DEBUG) && (mServiceConnection != null))
          {
            localObject = z2.t("mServiceConnection should be null. Instead it is ");
            ((StringBuilder)localObject).append(mServiceConnection);
            throw new RuntimeException(((StringBuilder)localObject).toString());
          }
          if (mServiceBinderWrapper == null)
          {
            if (mCallbacksMessenger == null)
            {
              localObject = new Intent("android.media.browse.MediaBrowserService");
              ((Intent)localObject).setComponent(mServiceComponent);
              MediaBrowserCompat.MediaBrowserImplBase localMediaBrowserImplBase = MediaBrowserCompat.MediaBrowserImplBase.this;
              mServiceConnection = new MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection(localMediaBrowserImplBase);
              boolean bool1 = false;
              boolean bool2;
              try
              {
                localMediaBrowserImplBase = MediaBrowserCompat.MediaBrowserImplBase.this;
                bool2 = mContext.bindService((Intent)localObject, mServiceConnection, 1);
              }
              catch (Exception localException)
              {
                localStringBuilder = z2.t("Failed binding to service ");
                localStringBuilder.append(mServiceComponent);
                Log.e("MediaBrowserCompat", localStringBuilder.toString());
                bool2 = bool1;
              }
              if (!bool2)
              {
                forceCloseConnection();
                mCallback.onConnectionFailed();
              }
              if (MediaBrowserCompat.DEBUG)
              {
                Log.d("MediaBrowserCompat", "connect...");
                dump();
              }
              return;
            }
            localStringBuilder = z2.t("mCallbacksMessenger should be null. Instead it is ");
            localStringBuilder.append(mCallbacksMessenger);
            throw new RuntimeException(localStringBuilder.toString());
          }
          StringBuilder localStringBuilder = z2.t("mServiceBinderWrapper should be null. Instead it is ");
          localStringBuilder.append(mServiceBinderWrapper);
          throw new RuntimeException(localStringBuilder.toString());
        }
      });
    }
    
    public void disconnect()
    {
      mState = 0;
      mHandler.post(new Runnable()
      {
        public void run()
        {
          MediaBrowserCompat.MediaBrowserImplBase localMediaBrowserImplBase = MediaBrowserCompat.MediaBrowserImplBase.this;
          Messenger localMessenger = mCallbacksMessenger;
          if (localMessenger != null) {
            try
            {
              mServiceBinderWrapper.disconnect(localMessenger);
            }
            catch (RemoteException localRemoteException)
            {
              localObject = z2.t("RemoteException during connect for ");
              ((StringBuilder)localObject).append(mServiceComponent);
              Log.w("MediaBrowserCompat", ((StringBuilder)localObject).toString());
            }
          }
          Object localObject = MediaBrowserCompat.MediaBrowserImplBase.this;
          int i = mState;
          ((MediaBrowserCompat.MediaBrowserImplBase)localObject).forceCloseConnection();
          if (i != 0) {
            mState = i;
          }
          if (MediaBrowserCompat.DEBUG)
          {
            Log.d("MediaBrowserCompat", "disconnect...");
            dump();
          }
        }
      });
    }
    
    public void dump()
    {
      Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("  mServiceComponent=");
      localStringBuilder.append(mServiceComponent);
      Log.d("MediaBrowserCompat", localStringBuilder.toString());
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("  mCallback=");
      localStringBuilder.append(mCallback);
      Log.d("MediaBrowserCompat", localStringBuilder.toString());
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("  mRootHints=");
      localStringBuilder.append(mRootHints);
      Log.d("MediaBrowserCompat", localStringBuilder.toString());
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("  mState=");
      localStringBuilder.append(getStateLabel(mState));
      Log.d("MediaBrowserCompat", localStringBuilder.toString());
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("  mServiceConnection=");
      localStringBuilder.append(mServiceConnection);
      Log.d("MediaBrowserCompat", localStringBuilder.toString());
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("  mServiceBinderWrapper=");
      localStringBuilder.append(mServiceBinderWrapper);
      Log.d("MediaBrowserCompat", localStringBuilder.toString());
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("  mCallbacksMessenger=");
      localStringBuilder.append(mCallbacksMessenger);
      Log.d("MediaBrowserCompat", localStringBuilder.toString());
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("  mRootId=");
      localStringBuilder.append(mRootId);
      Log.d("MediaBrowserCompat", localStringBuilder.toString());
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("  mMediaSessionToken=");
      localStringBuilder.append(mMediaSessionToken);
      Log.d("MediaBrowserCompat", localStringBuilder.toString());
    }
    
    public void forceCloseConnection()
    {
      MediaServiceConnection localMediaServiceConnection = mServiceConnection;
      if (localMediaServiceConnection != null) {
        mContext.unbindService(localMediaServiceConnection);
      }
      mState = 1;
      mServiceConnection = null;
      mServiceBinderWrapper = null;
      mCallbacksMessenger = null;
      mHandler.setCallbacksMessenger(null);
      mRootId = null;
      mMediaSessionToken = null;
    }
    
    @Nullable
    public Bundle getExtras()
    {
      if (isConnected()) {
        return mExtras;
      }
      throw new IllegalStateException(z2.s(z2.t("getExtras() called while not connected (state="), getStateLabel(mState), ")"));
    }
    
    public void getItem(@NonNull final String paramString, @NonNull final MediaBrowserCompat.ItemCallback paramItemCallback)
    {
      if (!TextUtils.isEmpty(paramString))
      {
        if (paramItemCallback != null)
        {
          if (!isConnected())
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
      if (isConnected()) {
        return mRootId;
      }
      throw new IllegalStateException(z2.s(z2.t("getRoot() called while not connected(state="), getStateLabel(mState), ")"));
    }
    
    @NonNull
    public ComponentName getServiceComponent()
    {
      if (isConnected()) {
        return mServiceComponent;
      }
      throw new IllegalStateException(z2.q(z2.t("getServiceComponent() called while not connected (state="), mState, ")"));
    }
    
    @NonNull
    public MediaSessionCompat.Token getSessionToken()
    {
      if (isConnected()) {
        return mMediaSessionToken;
      }
      throw new IllegalStateException(z2.q(z2.t("getSessionToken() called while not connected(state="), mState, ")"));
    }
    
    public boolean isConnected()
    {
      boolean bool;
      if (mState == 3) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void onConnectionFailed(Messenger paramMessenger)
    {
      StringBuilder localStringBuilder = z2.t("onConnectFailed for ");
      localStringBuilder.append(mServiceComponent);
      Log.e("MediaBrowserCompat", localStringBuilder.toString());
      if (!isCurrent(paramMessenger, "onConnectFailed")) {
        return;
      }
      if (mState != 2)
      {
        paramMessenger = z2.t("onConnect from service while mState=");
        paramMessenger.append(getStateLabel(mState));
        paramMessenger.append("... ignoring");
        Log.w("MediaBrowserCompat", paramMessenger.toString());
        return;
      }
      forceCloseConnection();
      mCallback.onConnectionFailed();
    }
    
    public void onLoadChildren(Messenger paramMessenger, String paramString, List<MediaBrowserCompat.MediaItem> paramList, Bundle paramBundle1, Bundle paramBundle2)
    {
      if (!isCurrent(paramMessenger, "onLoadChildren")) {
        return;
      }
      boolean bool = MediaBrowserCompat.DEBUG;
      if (bool)
      {
        paramMessenger = z2.t("onLoadChildren for ");
        paramMessenger.append(mServiceComponent);
        paramMessenger.append(" id=");
        paramMessenger.append(paramString);
        Log.d("MediaBrowserCompat", paramMessenger.toString());
      }
      paramMessenger = (MediaBrowserCompat.Subscription)mSubscriptions.get(paramString);
      if (paramMessenger == null)
      {
        if (bool)
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
    
    public void onServiceConnected(Messenger paramMessenger, String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle)
    {
      if (!isCurrent(paramMessenger, "onConnect")) {
        return;
      }
      if (mState != 2)
      {
        paramMessenger = z2.t("onConnect from service while mState=");
        paramMessenger.append(getStateLabel(mState));
        paramMessenger.append("... ignoring");
        Log.w("MediaBrowserCompat", paramMessenger.toString());
        return;
      }
      mRootId = paramString;
      mMediaSessionToken = paramToken;
      mExtras = paramBundle;
      mState = 3;
      if (MediaBrowserCompat.DEBUG)
      {
        Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
        dump();
      }
      mCallback.onConnected();
      try
      {
        paramString = mSubscriptions.entrySet().iterator();
        while (paramString.hasNext())
        {
          paramToken = (Map.Entry)paramString.next();
          paramMessenger = (String)paramToken.getKey();
          paramBundle = (MediaBrowserCompat.Subscription)paramToken.getValue();
          paramToken = paramBundle.getCallbacks();
          paramBundle = paramBundle.getOptionsList();
          for (int i = 0; i < paramToken.size(); i++) {
            mServiceBinderWrapper.addSubscription(paramMessenger, getmToken, (Bundle)paramBundle.get(i), mCallbacksMessenger);
          }
        }
        return;
      }
      catch (RemoteException paramMessenger)
      {
        Log.d("MediaBrowserCompat", "addSubscription failed with RemoteException.");
      }
    }
    
    public void search(@NonNull final String paramString, final Bundle paramBundle, @NonNull final MediaBrowserCompat.SearchCallback paramSearchCallback)
    {
      if (isConnected())
      {
        MediaBrowserCompat.SearchResultReceiver localSearchResultReceiver = new MediaBrowserCompat.SearchResultReceiver(paramString, paramBundle, paramSearchCallback, mHandler);
        try
        {
          mServiceBinderWrapper.search(paramString, paramBundle, localSearchResultReceiver, mCallbacksMessenger);
        }
        catch (RemoteException localRemoteException)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Remote error searching items with query: ");
          localStringBuilder.append(paramString);
          Log.i("MediaBrowserCompat", localStringBuilder.toString(), localRemoteException);
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
      throw new IllegalStateException(z2.s(z2.t("search() called while not connected (state="), getStateLabel(mState), ")"));
    }
    
    public void sendCustomAction(@NonNull final String paramString, final Bundle paramBundle, @Nullable final MediaBrowserCompat.CustomActionCallback paramCustomActionCallback)
    {
      if (isConnected())
      {
        MediaBrowserCompat.CustomActionResultReceiver localCustomActionResultReceiver = new MediaBrowserCompat.CustomActionResultReceiver(paramString, paramBundle, paramCustomActionCallback, mHandler);
        try
        {
          mServiceBinderWrapper.sendCustomAction(paramString, paramBundle, localCustomActionResultReceiver, mCallbacksMessenger);
        }
        catch (RemoteException localRemoteException)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Remote error sending a custom action: action=");
          localStringBuilder.append(paramString);
          localStringBuilder.append(", extras=");
          localStringBuilder.append(paramBundle);
          Log.i("MediaBrowserCompat", localStringBuilder.toString(), localRemoteException);
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
      MediaBrowserCompat.Subscription localSubscription1 = (MediaBrowserCompat.Subscription)mSubscriptions.get(paramString);
      MediaBrowserCompat.Subscription localSubscription2 = localSubscription1;
      if (localSubscription1 == null)
      {
        localSubscription2 = new MediaBrowserCompat.Subscription();
        mSubscriptions.put(paramString, localSubscription2);
      }
      if (paramBundle == null) {
        paramBundle = null;
      } else {
        paramBundle = new Bundle(paramBundle);
      }
      localSubscription2.putCallback(paramBundle, paramSubscriptionCallback);
      if (isConnected()) {
        try
        {
          mServiceBinderWrapper.addSubscription(paramString, mToken, paramBundle, mCallbacksMessenger);
        }
        catch (RemoteException paramBundle)
        {
          paramBundle = new StringBuilder();
          paramBundle.append("addSubscription failed with RemoteException parentId=");
          paramBundle.append(paramString);
          Log.d("MediaBrowserCompat", paramBundle.toString());
        }
      }
    }
    
    public void unsubscribe(@NonNull String paramString, MediaBrowserCompat.SubscriptionCallback paramSubscriptionCallback)
    {
      MediaBrowserCompat.Subscription localSubscription = (MediaBrowserCompat.Subscription)mSubscriptions.get(paramString);
      if (localSubscription == null) {
        return;
      }
      if (paramSubscriptionCallback == null) {}
      try
      {
        if (!isConnected()) {
          break label172;
        }
        mServiceBinderWrapper.removeSubscription(paramString, null, mCallbacksMessenger);
      }
      catch (RemoteException localRemoteException)
      {
        List localList1;
        List localList2;
        int i;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("removeSubscription failed with RemoteException parentId=");
        localStringBuilder.append(paramString);
        Log.d("MediaBrowserCompat", localStringBuilder.toString());
        label172:
        if ((!localSubscription.isEmpty()) && (paramSubscriptionCallback != null)) {
          return;
        }
        mSubscriptions.remove(paramString);
      }
      localList1 = localSubscription.getCallbacks();
      localList2 = localSubscription.getOptionsList();
      for (i = localList1.size() - 1; i >= 0; i--) {
        if (localList1.get(i) == paramSubscriptionCallback)
        {
          if (isConnected()) {
            mServiceBinderWrapper.removeSubscription(paramString, mToken, mCallbacksMessenger);
          }
          localList1.remove(i);
          localList2.remove(i);
        }
      }
    }
    
    public class MediaServiceConnection
      implements ServiceConnection
    {
      public MediaServiceConnection() {}
      
      private void postOrRun(Runnable paramRunnable)
      {
        if (Thread.currentThread() == mHandler.getLooper().getThread()) {
          paramRunnable.run();
        } else {
          mHandler.post(paramRunnable);
        }
      }
      
      public boolean isCurrent(String paramString)
      {
        MediaBrowserCompat.MediaBrowserImplBase localMediaBrowserImplBase = MediaBrowserCompat.MediaBrowserImplBase.this;
        if (mServiceConnection == this)
        {
          i = mState;
          if ((i != 0) && (i != 1)) {
            return true;
          }
        }
        int i = mState;
        if ((i != 0) && (i != 1))
        {
          paramString = z2.u(paramString, " for ");
          paramString.append(mServiceComponent);
          paramString.append(" with mServiceConnection=");
          paramString.append(mServiceConnection);
          paramString.append(" this=");
          paramString.append(this);
          Log.i("MediaBrowserCompat", paramString.toString());
        }
        return false;
      }
      
      public void onServiceConnected(final ComponentName paramComponentName, final IBinder paramIBinder)
      {
        postOrRun(new Runnable()
        {
          public void run()
          {
            boolean bool = MediaBrowserCompat.DEBUG;
            if (bool)
            {
              localObject = z2.t("MediaServiceConnection.onServiceConnected name=");
              ((StringBuilder)localObject).append(paramComponentName);
              ((StringBuilder)localObject).append(" binder=");
              ((StringBuilder)localObject).append(paramIBinder);
              Log.d("MediaBrowserCompat", ((StringBuilder)localObject).toString());
              dump();
            }
            if (!isCurrent("onServiceConnected")) {
              return;
            }
            Object localObject = MediaBrowserCompat.MediaBrowserImplBase.this;
            mServiceBinderWrapper = new MediaBrowserCompat.ServiceBinderWrapper(paramIBinder, mRootHints);
            mCallbacksMessenger = new Messenger(mHandler);
            localObject = MediaBrowserCompat.MediaBrowserImplBase.this;
            mHandler.setCallbacksMessenger(mCallbacksMessenger);
            mState = 2;
            if (bool) {}
            try
            {
              Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
              dump();
              localObject = MediaBrowserCompat.MediaBrowserImplBase.this;
              mServiceBinderWrapper.connect(mContext, mCallbacksMessenger);
            }
            catch (RemoteException localRemoteException)
            {
              StringBuilder localStringBuilder = z2.t("RemoteException during connect for ");
              localStringBuilder.append(mServiceComponent);
              Log.w("MediaBrowserCompat", localStringBuilder.toString());
              if (MediaBrowserCompat.DEBUG)
              {
                Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                dump();
              }
            }
          }
        });
      }
      
      public void onServiceDisconnected(final ComponentName paramComponentName)
      {
        postOrRun(new Runnable()
        {
          public void run()
          {
            if (MediaBrowserCompat.DEBUG)
            {
              localObject = z2.t("MediaServiceConnection.onServiceDisconnected name=");
              ((StringBuilder)localObject).append(paramComponentName);
              ((StringBuilder)localObject).append(" this=");
              ((StringBuilder)localObject).append(this);
              ((StringBuilder)localObject).append(" mServiceConnection=");
              ((StringBuilder)localObject).append(mServiceConnection);
              Log.d("MediaBrowserCompat", ((StringBuilder)localObject).toString());
              dump();
            }
            if (!isCurrent("onServiceDisconnected")) {
              return;
            }
            Object localObject = MediaBrowserCompat.MediaBrowserImplBase.this;
            mServiceBinderWrapper = null;
            mCallbacksMessenger = null;
            mHandler.setCallbacksMessenger(null);
            localObject = MediaBrowserCompat.MediaBrowserImplBase.this;
            mState = 4;
            mCallback.onConnectionSuspended();
          }
        });
      }
    }
  }
  
  public static abstract interface MediaBrowserServiceCallbackImpl
  {
    public abstract void onConnectionFailed(Messenger paramMessenger);
    
    public abstract void onLoadChildren(Messenger paramMessenger, String paramString, List<MediaBrowserCompat.MediaItem> paramList, Bundle paramBundle1, Bundle paramBundle2);
    
    public abstract void onServiceConnected(Messenger paramMessenger, String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle);
  }
  
  @SuppressLint({"BanParcelableUsage"})
  public static class MediaItem
    implements Parcelable
  {
    public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator()
    {
      public MediaBrowserCompat.MediaItem createFromParcel(Parcel paramAnonymousParcel)
      {
        return new MediaBrowserCompat.MediaItem(paramAnonymousParcel);
      }
      
      public MediaBrowserCompat.MediaItem[] newArray(int paramAnonymousInt)
      {
        return new MediaBrowserCompat.MediaItem[paramAnonymousInt];
      }
    };
    public static final int FLAG_BROWSABLE = 1;
    public static final int FLAG_PLAYABLE = 2;
    private final MediaDescriptionCompat mDescription;
    private final int mFlags;
    
    public MediaItem(Parcel paramParcel)
    {
      mFlags = paramParcel.readInt();
      mDescription = ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel));
    }
    
    public MediaItem(@NonNull MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
    {
      if (paramMediaDescriptionCompat != null)
      {
        if (!TextUtils.isEmpty(paramMediaDescriptionCompat.getMediaId()))
        {
          mFlags = paramInt;
          mDescription = paramMediaDescriptionCompat;
          return;
        }
        throw new IllegalArgumentException("description must have a non-empty media id");
      }
      throw new IllegalArgumentException("description cannot be null");
    }
    
    public static MediaItem fromMediaItem(Object paramObject)
    {
      if (paramObject != null)
      {
        paramObject = (MediaBrowser.MediaItem)paramObject;
        int i = MediaBrowserCompat.Api21Impl.getFlags((MediaBrowser.MediaItem)paramObject);
        return new MediaItem(MediaDescriptionCompat.fromMediaDescription(MediaBrowserCompat.Api21Impl.getDescription((MediaBrowser.MediaItem)paramObject)), i);
      }
      return null;
    }
    
    public static List<MediaItem> fromMediaItemList(List<?> paramList)
    {
      if (paramList != null)
      {
        ArrayList localArrayList = new ArrayList(paramList.size());
        paramList = paramList.iterator();
        while (paramList.hasNext()) {
          localArrayList.add(fromMediaItem(paramList.next()));
        }
        return localArrayList;
      }
      return null;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    @NonNull
    public MediaDescriptionCompat getDescription()
    {
      return mDescription;
    }
    
    public int getFlags()
    {
      return mFlags;
    }
    
    @Nullable
    public String getMediaId()
    {
      return mDescription.getMediaId();
    }
    
    public boolean isBrowsable()
    {
      int i = mFlags;
      boolean bool = true;
      if ((i & 0x1) == 0) {
        bool = false;
      }
      return bool;
    }
    
    public boolean isPlayable()
    {
      boolean bool;
      if ((mFlags & 0x2) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    @NonNull
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("MediaItem{");
      localStringBuilder.append("mFlags=");
      localStringBuilder.append(mFlags);
      localStringBuilder.append(", mDescription=");
      localStringBuilder.append(mDescription);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(mFlags);
      mDescription.writeToParcel(paramParcel, paramInt);
    }
  }
  
  public static abstract class SearchCallback
  {
    public void onError(@NonNull String paramString, Bundle paramBundle) {}
    
    public void onSearchResult(@NonNull String paramString, Bundle paramBundle, @NonNull List<MediaBrowserCompat.MediaItem> paramList) {}
  }
  
  public static class SearchResultReceiver
    extends ResultReceiver
  {
    private final MediaBrowserCompat.SearchCallback mCallback;
    private final Bundle mExtras;
    private final String mQuery;
    
    public SearchResultReceiver(String paramString, Bundle paramBundle, MediaBrowserCompat.SearchCallback paramSearchCallback, Handler paramHandler)
    {
      super();
      mQuery = paramString;
      mExtras = paramBundle;
      mCallback = paramSearchCallback;
    }
    
    public void onReceiveResult(int paramInt, Bundle paramBundle)
    {
      Object localObject = paramBundle;
      if (paramBundle != null) {
        localObject = MediaSessionCompat.unparcelWithClassLoader(paramBundle);
      }
      if ((paramInt == 0) && (localObject != null) && (((BaseBundle)localObject).containsKey("search_results")))
      {
        paramBundle = ((Bundle)localObject).getParcelableArray("search_results");
        if (paramBundle != null)
        {
          localObject = new ArrayList(paramBundle.length);
          int i = paramBundle.length;
          for (paramInt = 0; paramInt < i; paramInt++) {
            ((ArrayList)localObject).add((MediaBrowserCompat.MediaItem)paramBundle[paramInt]);
          }
          mCallback.onSearchResult(mQuery, mExtras, (List)localObject);
        }
        else
        {
          mCallback.onError(mQuery, mExtras);
        }
        return;
      }
      mCallback.onError(mQuery, mExtras);
    }
  }
  
  public static class ServiceBinderWrapper
  {
    private Messenger mMessenger;
    private Bundle mRootHints;
    
    public ServiceBinderWrapper(IBinder paramIBinder, Bundle paramBundle)
    {
      mMessenger = new Messenger(paramIBinder);
      mRootHints = paramBundle;
    }
    
    private void sendRequest(int paramInt, Bundle paramBundle, Messenger paramMessenger)
      throws RemoteException
    {
      Message localMessage = Message.obtain();
      what = paramInt;
      arg1 = 1;
      localMessage.setData(paramBundle);
      replyTo = paramMessenger;
      mMessenger.send(localMessage);
    }
    
    public void addSubscription(String paramString, IBinder paramIBinder, Bundle paramBundle, Messenger paramMessenger)
      throws RemoteException
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("data_media_item_id", paramString);
      BundleCompat.putBinder(localBundle, "data_callback_token", paramIBinder);
      localBundle.putBundle("data_options", paramBundle);
      sendRequest(3, localBundle, paramMessenger);
    }
    
    public void connect(Context paramContext, Messenger paramMessenger)
      throws RemoteException
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("data_package_name", paramContext.getPackageName());
      localBundle.putInt("data_calling_pid", Process.myPid());
      localBundle.putBundle("data_root_hints", mRootHints);
      sendRequest(1, localBundle, paramMessenger);
    }
    
    public void disconnect(Messenger paramMessenger)
      throws RemoteException
    {
      sendRequest(2, null, paramMessenger);
    }
    
    public void getMediaItem(String paramString, ResultReceiver paramResultReceiver, Messenger paramMessenger)
      throws RemoteException
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("data_media_item_id", paramString);
      localBundle.putParcelable("data_result_receiver", paramResultReceiver);
      sendRequest(5, localBundle, paramMessenger);
    }
    
    public void registerCallbackMessenger(Context paramContext, Messenger paramMessenger)
      throws RemoteException
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("data_package_name", paramContext.getPackageName());
      localBundle.putInt("data_calling_pid", Process.myPid());
      localBundle.putBundle("data_root_hints", mRootHints);
      sendRequest(6, localBundle, paramMessenger);
    }
    
    public void removeSubscription(String paramString, IBinder paramIBinder, Messenger paramMessenger)
      throws RemoteException
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("data_media_item_id", paramString);
      BundleCompat.putBinder(localBundle, "data_callback_token", paramIBinder);
      sendRequest(4, localBundle, paramMessenger);
    }
    
    public void search(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver, Messenger paramMessenger)
      throws RemoteException
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("data_search_query", paramString);
      localBundle.putBundle("data_search_extras", paramBundle);
      localBundle.putParcelable("data_result_receiver", paramResultReceiver);
      sendRequest(8, localBundle, paramMessenger);
    }
    
    public void sendCustomAction(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver, Messenger paramMessenger)
      throws RemoteException
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("data_custom_action", paramString);
      localBundle.putBundle("data_custom_action_extras", paramBundle);
      localBundle.putParcelable("data_result_receiver", paramResultReceiver);
      sendRequest(9, localBundle, paramMessenger);
    }
    
    public void unregisterCallbackMessenger(Messenger paramMessenger)
      throws RemoteException
    {
      sendRequest(7, null, paramMessenger);
    }
  }
  
  public static class Subscription
  {
    private final List<MediaBrowserCompat.SubscriptionCallback> mCallbacks = new ArrayList();
    private final List<Bundle> mOptionsList = new ArrayList();
    
    public MediaBrowserCompat.SubscriptionCallback getCallback(Bundle paramBundle)
    {
      for (int i = 0; i < mOptionsList.size(); i++) {
        if (MediaBrowserCompatUtils.areSameOptions((Bundle)mOptionsList.get(i), paramBundle)) {
          return (MediaBrowserCompat.SubscriptionCallback)mCallbacks.get(i);
        }
      }
      return null;
    }
    
    public List<MediaBrowserCompat.SubscriptionCallback> getCallbacks()
    {
      return mCallbacks;
    }
    
    public List<Bundle> getOptionsList()
    {
      return mOptionsList;
    }
    
    public boolean isEmpty()
    {
      return mCallbacks.isEmpty();
    }
    
    public void putCallback(Bundle paramBundle, MediaBrowserCompat.SubscriptionCallback paramSubscriptionCallback)
    {
      for (int i = 0; i < mOptionsList.size(); i++) {
        if (MediaBrowserCompatUtils.areSameOptions((Bundle)mOptionsList.get(i), paramBundle))
        {
          mCallbacks.set(i, paramSubscriptionCallback);
          return;
        }
      }
      mCallbacks.add(paramSubscriptionCallback);
      mOptionsList.add(paramBundle);
    }
  }
  
  public static abstract class SubscriptionCallback
  {
    public final MediaBrowser.SubscriptionCallback mSubscriptionCallbackFwk;
    public WeakReference<MediaBrowserCompat.Subscription> mSubscriptionRef;
    public final IBinder mToken = new Binder();
    
    public SubscriptionCallback()
    {
      if (Build.VERSION.SDK_INT >= 26) {
        mSubscriptionCallbackFwk = new SubscriptionCallbackApi26();
      } else {
        mSubscriptionCallbackFwk = new SubscriptionCallbackApi21();
      }
    }
    
    public void onChildrenLoaded(@NonNull String paramString, @NonNull List<MediaBrowserCompat.MediaItem> paramList) {}
    
    public void onChildrenLoaded(@NonNull String paramString, @NonNull List<MediaBrowserCompat.MediaItem> paramList, @NonNull Bundle paramBundle) {}
    
    public void onError(@NonNull String paramString) {}
    
    public void onError(@NonNull String paramString, @NonNull Bundle paramBundle) {}
    
    public void setSubscription(MediaBrowserCompat.Subscription paramSubscription)
    {
      mSubscriptionRef = new WeakReference(paramSubscription);
    }
    
    @RequiresApi(21)
    public class SubscriptionCallbackApi21
      extends MediaBrowser.SubscriptionCallback
    {
      public SubscriptionCallbackApi21() {}
      
      public List<MediaBrowserCompat.MediaItem> applyOptions(List<MediaBrowserCompat.MediaItem> paramList, Bundle paramBundle)
      {
        if (paramList == null) {
          return null;
        }
        int i = paramBundle.getInt("android.media.browse.extra.PAGE", -1);
        int j = paramBundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if ((i == -1) && (j == -1)) {
          return paramList;
        }
        int k = j * i;
        int m = k + j;
        if ((i >= 0) && (j >= 1) && (k < paramList.size()))
        {
          i = m;
          if (m > paramList.size()) {
            i = paramList.size();
          }
          return paramList.subList(k, i);
        }
        return Collections.emptyList();
      }
      
      public void onChildrenLoaded(@NonNull String paramString, List<MediaBrowser.MediaItem> paramList)
      {
        Object localObject = mSubscriptionRef;
        if (localObject == null) {
          localObject = null;
        } else {
          localObject = (MediaBrowserCompat.Subscription)((Reference)localObject).get();
        }
        if (localObject == null)
        {
          MediaBrowserCompat.SubscriptionCallback.this.onChildrenLoaded(paramString, MediaBrowserCompat.MediaItem.fromMediaItemList(paramList));
        }
        else
        {
          paramList = MediaBrowserCompat.MediaItem.fromMediaItemList(paramList);
          List localList1 = ((MediaBrowserCompat.Subscription)localObject).getCallbacks();
          List localList2 = ((MediaBrowserCompat.Subscription)localObject).getOptionsList();
          for (int i = 0; i < localList1.size(); i++)
          {
            localObject = (Bundle)localList2.get(i);
            if (localObject == null) {
              MediaBrowserCompat.SubscriptionCallback.this.onChildrenLoaded(paramString, paramList);
            } else {
              onChildrenLoaded(paramString, applyOptions(paramList, (Bundle)localObject), (Bundle)localObject);
            }
          }
        }
      }
      
      public void onError(@NonNull String paramString)
      {
        MediaBrowserCompat.SubscriptionCallback.this.onError(paramString);
      }
    }
    
    @RequiresApi(26)
    public class SubscriptionCallbackApi26
      extends MediaBrowserCompat.SubscriptionCallback.SubscriptionCallbackApi21
    {
      public SubscriptionCallbackApi26()
      {
        super();
      }
      
      public void onChildrenLoaded(@NonNull String paramString, @NonNull List<MediaBrowser.MediaItem> paramList, @NonNull Bundle paramBundle)
      {
        MediaSessionCompat.ensureClassLoader(paramBundle);
        MediaBrowserCompat.SubscriptionCallback.this.onChildrenLoaded(paramString, MediaBrowserCompat.MediaItem.fromMediaItemList(paramList), paramBundle);
      }
      
      public void onError(@NonNull String paramString, @NonNull Bundle paramBundle)
      {
        MediaSessionCompat.ensureClassLoader(paramBundle);
        MediaBrowserCompat.SubscriptionCallback.this.onError(paramString, paramBundle);
      }
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */