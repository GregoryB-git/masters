package android.support.v4.media;

import a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import z2;

class MediaBrowserCompat$MediaBrowserImplBase
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
  
  public MediaBrowserCompat$MediaBrowserImplBase(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.ConnectionCallback paramConnectionCallback, Bundle paramBundle)
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

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */