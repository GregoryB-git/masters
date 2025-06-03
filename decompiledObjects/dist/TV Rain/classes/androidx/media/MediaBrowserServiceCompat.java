package androidx.media;

import a;
import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.browse.MediaBrowser.MediaItem;
import android.media.session.MediaSession.Token;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.service.media.MediaBrowserService.BrowserRoot;
import android.service.media.MediaBrowserService.Result;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.BundleCompat;
import androidx.core.util.Pair;
import c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import z2;

public abstract class MediaBrowserServiceCompat
  extends Service
{
  public static final boolean DEBUG = Log.isLoggable("MBServiceCompat", 3);
  private static final float EPSILON = 1.0E-5F;
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String KEY_MEDIA_ITEM = "media_item";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String KEY_SEARCH_RESULTS = "search_results";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final int RESULT_ERROR = -1;
  public static final int RESULT_FLAG_ON_LOAD_ITEM_NOT_IMPLEMENTED = 2;
  public static final int RESULT_FLAG_ON_SEARCH_NOT_IMPLEMENTED = 4;
  public static final int RESULT_FLAG_OPTION_NOT_HANDLED = 1;
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final int RESULT_OK = 0;
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final int RESULT_PROGRESS_UPDATE = 1;
  public static final String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";
  public static final String TAG = "MBServiceCompat";
  public final ConnectionRecord mConnectionFromFwk = new ConnectionRecord("android.media.session.MediaController", -1, -1, null, null);
  public final ArrayMap<IBinder, ConnectionRecord> mConnections = new ArrayMap();
  public ConnectionRecord mCurConnection;
  public final ServiceHandler mHandler = new ServiceHandler();
  private MediaBrowserServiceImpl mImpl;
  public final ArrayList<ConnectionRecord> mPendingConnections = new ArrayList();
  public MediaSessionCompat.Token mSession;
  
  public void addSubscription(String paramString, ConnectionRecord paramConnectionRecord, IBinder paramIBinder, Bundle paramBundle)
  {
    Object localObject1 = (List)subscriptions.get(paramString);
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = new ArrayList();
    }
    localObject1 = ((List)localObject2).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Pair localPair = (Pair)((Iterator)localObject1).next();
      if ((paramIBinder == first) && (MediaBrowserCompatUtils.areSameOptions(paramBundle, (Bundle)second))) {
        return;
      }
    }
    ((List)localObject2).add(new Pair(paramIBinder, paramBundle));
    subscriptions.put(paramString, localObject2);
    performLoadChildren(paramString, paramConnectionRecord, paramBundle, null);
    mCurConnection = paramConnectionRecord;
    onSubscribe(paramString, paramBundle);
    mCurConnection = null;
  }
  
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
      j = m;
      if (m > paramList.size()) {
        j = paramList.size();
      }
      return paramList.subList(k, j);
    }
    return Collections.emptyList();
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void attachToBaseContext(Context paramContext)
  {
    attachBaseContext(paramContext);
  }
  
  public void dump(FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {}
  
  public final Bundle getBrowserRootHints()
  {
    return mImpl.getBrowserRootHints();
  }
  
  @NonNull
  public final MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo()
  {
    return mImpl.getCurrentBrowserInfo();
  }
  
  @Nullable
  public MediaSessionCompat.Token getSessionToken()
  {
    return mSession;
  }
  
  public boolean isValidPackage(String paramString, int paramInt)
  {
    if (paramString == null) {
      return false;
    }
    String[] arrayOfString = getPackageManager().getPackagesForUid(paramInt);
    int i = arrayOfString.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      if (arrayOfString[paramInt].equals(paramString)) {
        return true;
      }
    }
    return false;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void notifyChildrenChanged(@NonNull MediaSessionManager.RemoteUserInfo paramRemoteUserInfo, @NonNull String paramString, @NonNull Bundle paramBundle)
  {
    if (paramRemoteUserInfo != null)
    {
      if (paramString != null)
      {
        if (paramBundle != null)
        {
          mImpl.notifyChildrenChanged(paramRemoteUserInfo, paramString, paramBundle);
          return;
        }
        throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
      }
      throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }
    throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
  }
  
  public void notifyChildrenChanged(@NonNull String paramString)
  {
    if (paramString != null)
    {
      mImpl.notifyChildrenChanged(paramString, null);
      return;
    }
    throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
  }
  
  public void notifyChildrenChanged(@NonNull String paramString, @NonNull Bundle paramBundle)
  {
    if (paramString != null)
    {
      if (paramBundle != null)
      {
        mImpl.notifyChildrenChanged(paramString, paramBundle);
        return;
      }
      throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
    }
    throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return mImpl.onBind(paramIntent);
  }
  
  public void onCreate()
  {
    super.onCreate();
    int i = Build.VERSION.SDK_INT;
    if (i >= 28) {
      mImpl = new MediaBrowserServiceImplApi28();
    } else if (i >= 26) {
      mImpl = new MediaBrowserServiceImplApi26();
    } else {
      mImpl = new MediaBrowserServiceImplApi23();
    }
    mImpl.onCreate();
  }
  
  public void onCustomAction(@NonNull String paramString, Bundle paramBundle, @NonNull Result<Bundle> paramResult)
  {
    paramResult.sendError(null);
  }
  
  @Nullable
  public abstract BrowserRoot onGetRoot(@NonNull String paramString, int paramInt, @Nullable Bundle paramBundle);
  
  public abstract void onLoadChildren(@NonNull String paramString, @NonNull Result<List<MediaBrowserCompat.MediaItem>> paramResult);
  
  public void onLoadChildren(@NonNull String paramString, @NonNull Result<List<MediaBrowserCompat.MediaItem>> paramResult, @NonNull Bundle paramBundle)
  {
    paramResult.setFlags(1);
    onLoadChildren(paramString, paramResult);
  }
  
  public void onLoadItem(String paramString, @NonNull Result<MediaBrowserCompat.MediaItem> paramResult)
  {
    paramResult.setFlags(2);
    paramResult.sendResult(null);
  }
  
  public void onSearch(@NonNull String paramString, Bundle paramBundle, @NonNull Result<List<MediaBrowserCompat.MediaItem>> paramResult)
  {
    paramResult.setFlags(4);
    paramResult.sendResult(null);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public void onSubscribe(String paramString, Bundle paramBundle) {}
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public void onUnsubscribe(String paramString) {}
  
  public void performCustomAction(String paramString, Bundle paramBundle, ConnectionRecord paramConnectionRecord, final ResultReceiver paramResultReceiver)
  {
    paramResultReceiver = new Result(paramString)
    {
      public void onErrorSent(@Nullable Bundle paramAnonymousBundle)
      {
        paramResultReceiver.send(-1, paramAnonymousBundle);
      }
      
      public void onProgressUpdateSent(@Nullable Bundle paramAnonymousBundle)
      {
        paramResultReceiver.send(1, paramAnonymousBundle);
      }
      
      public void onResultSent(@Nullable Bundle paramAnonymousBundle)
      {
        paramResultReceiver.send(0, paramAnonymousBundle);
      }
    };
    mCurConnection = paramConnectionRecord;
    onCustomAction(paramString, paramBundle, paramResultReceiver);
    mCurConnection = null;
    if (paramResultReceiver.isDone()) {
      return;
    }
    paramConnectionRecord = new StringBuilder();
    paramConnectionRecord.append("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
    paramConnectionRecord.append(paramString);
    paramConnectionRecord.append(" extras=");
    paramConnectionRecord.append(paramBundle);
    throw new IllegalStateException(paramConnectionRecord.toString());
  }
  
  public void performLoadChildren(final String paramString, final ConnectionRecord paramConnectionRecord, final Bundle paramBundle1, final Bundle paramBundle2)
  {
    paramBundle2 = new Result(paramString)
    {
      public void onResultSent(@Nullable List<MediaBrowserCompat.MediaItem> paramAnonymousList)
      {
        if (mConnections.get(paramConnectionRecordcallbacks.asBinder()) != paramConnectionRecord)
        {
          if (MediaBrowserServiceCompat.DEBUG)
          {
            paramAnonymousList = z2.t("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
            paramAnonymousList.append(paramConnectionRecordpkg);
            paramAnonymousList.append(" id=");
            paramAnonymousList.append(paramString);
            Log.d("MBServiceCompat", paramAnonymousList.toString());
          }
          return;
        }
        Object localObject = paramAnonymousList;
        if ((getFlags() & 0x1) != 0) {
          localObject = applyOptions(paramAnonymousList, paramBundle1);
        }
        try
        {
          paramConnectionRecordcallbacks.onLoadChildren(paramString, (List)localObject, paramBundle1, paramBundle2);
        }
        catch (RemoteException paramAnonymousList)
        {
          paramAnonymousList = z2.t("Calling onLoadChildren() failed for id=");
          paramAnonymousList.append(paramString);
          paramAnonymousList.append(" package=");
          paramAnonymousList.append(paramConnectionRecordpkg);
          Log.w("MBServiceCompat", paramAnonymousList.toString());
        }
      }
    };
    mCurConnection = paramConnectionRecord;
    if (paramBundle1 == null) {
      onLoadChildren(paramString, paramBundle2);
    } else {
      onLoadChildren(paramString, paramBundle2, paramBundle1);
    }
    mCurConnection = null;
    if (paramBundle2.isDone()) {
      return;
    }
    throw new IllegalStateException(a.p(z2.t("onLoadChildren must call detach() or sendResult() before returning for package="), pkg, " id=", paramString));
  }
  
  public void performLoadItem(String paramString, ConnectionRecord paramConnectionRecord, final ResultReceiver paramResultReceiver)
  {
    paramResultReceiver = new Result(paramString)
    {
      public void onResultSent(@Nullable MediaBrowserCompat.MediaItem paramAnonymousMediaItem)
      {
        if ((getFlags() & 0x2) != 0)
        {
          paramResultReceiver.send(-1, null);
          return;
        }
        Bundle localBundle = new Bundle();
        localBundle.putParcelable("media_item", paramAnonymousMediaItem);
        paramResultReceiver.send(0, localBundle);
      }
    };
    mCurConnection = paramConnectionRecord;
    onLoadItem(paramString, paramResultReceiver);
    mCurConnection = null;
    if (paramResultReceiver.isDone()) {
      return;
    }
    throw new IllegalStateException(z2.o("onLoadItem must call detach() or sendResult() before returning for id=", paramString));
  }
  
  public void performSearch(String paramString, Bundle paramBundle, ConnectionRecord paramConnectionRecord, final ResultReceiver paramResultReceiver)
  {
    paramResultReceiver = new Result(paramString)
    {
      public void onResultSent(@Nullable List<MediaBrowserCompat.MediaItem> paramAnonymousList)
      {
        if (((getFlags() & 0x4) == 0) && (paramAnonymousList != null))
        {
          Bundle localBundle = new Bundle();
          localBundle.putParcelableArray("search_results", (Parcelable[])paramAnonymousList.toArray(new MediaBrowserCompat.MediaItem[0]));
          paramResultReceiver.send(0, localBundle);
          return;
        }
        paramResultReceiver.send(-1, null);
      }
    };
    mCurConnection = paramConnectionRecord;
    onSearch(paramString, paramBundle, paramResultReceiver);
    mCurConnection = null;
    if (paramResultReceiver.isDone()) {
      return;
    }
    throw new IllegalStateException(z2.o("onSearch must call detach() or sendResult() before returning for query=", paramString));
  }
  
  public boolean removeSubscription(String paramString, ConnectionRecord paramConnectionRecord, IBinder paramIBinder)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    boolean bool3 = false;
    if (paramIBinder == null) {}
    try
    {
      paramIBinder = subscriptions.remove(paramString);
      if (paramIBinder != null) {
        bool3 = bool1;
      } else {
        bool3 = false;
      }
      return bool3;
    }
    finally
    {
      List localList;
      Iterator localIterator;
      mCurConnection = paramConnectionRecord;
      onUnsubscribe(paramString);
      mCurConnection = null;
    }
    localList = (List)subscriptions.get(paramString);
    bool1 = bool2;
    if (localList != null)
    {
      localIterator = localList.iterator();
      while (localIterator.hasNext()) {
        if (paramIBinder == nextfirst)
        {
          localIterator.remove();
          bool3 = true;
        }
      }
      bool1 = bool3;
      if (localList.size() == 0)
      {
        subscriptions.remove(paramString);
        bool1 = bool3;
      }
    }
    mCurConnection = paramConnectionRecord;
    onUnsubscribe(paramString);
    mCurConnection = null;
    return bool1;
  }
  
  public void setSessionToken(MediaSessionCompat.Token paramToken)
  {
    if (paramToken != null)
    {
      if (mSession == null)
      {
        mSession = paramToken;
        mImpl.setSessionToken(paramToken);
        return;
      }
      throw new IllegalStateException("The session token has already been set");
    }
    throw new IllegalArgumentException("Session token may not be null");
  }
  
  public static final class BrowserRoot
  {
    public static final String EXTRA_OFFLINE = "android.service.media.extra.OFFLINE";
    public static final String EXTRA_RECENT = "android.service.media.extra.RECENT";
    public static final String EXTRA_SUGGESTED = "android.service.media.extra.SUGGESTED";
    @Deprecated
    public static final String EXTRA_SUGGESTION_KEYWORDS = "android.service.media.extra.SUGGESTION_KEYWORDS";
    private final Bundle mExtras;
    private final String mRootId;
    
    public BrowserRoot(@NonNull String paramString, @Nullable Bundle paramBundle)
    {
      if (paramString != null)
      {
        mRootId = paramString;
        mExtras = paramBundle;
        return;
      }
      throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
    }
    
    public Bundle getExtras()
    {
      return mExtras;
    }
    
    public String getRootId()
    {
      return mRootId;
    }
  }
  
  public class ConnectionRecord
    implements IBinder.DeathRecipient
  {
    public final MediaSessionManager.RemoteUserInfo browserInfo;
    public final MediaBrowserServiceCompat.ServiceCallbacks callbacks;
    public final int pid;
    public final String pkg;
    public MediaBrowserServiceCompat.BrowserRoot root;
    public final Bundle rootHints;
    public final HashMap<String, List<Pair<IBinder, Bundle>>> subscriptions = new HashMap();
    public final int uid;
    
    public ConnectionRecord(String paramString, int paramInt1, int paramInt2, Bundle paramBundle, MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks)
    {
      pkg = paramString;
      pid = paramInt1;
      uid = paramInt2;
      browserInfo = new MediaSessionManager.RemoteUserInfo(paramString, paramInt1, paramInt2);
      rootHints = paramBundle;
      callbacks = paramServiceCallbacks;
    }
    
    public void binderDied()
    {
      mHandler.post(new Runnable()
      {
        public void run()
        {
          MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = MediaBrowserServiceCompat.ConnectionRecord.this;
          this$0.mConnections.remove(callbacks.asBinder());
        }
      });
    }
  }
  
  public static abstract interface MediaBrowserServiceImpl
  {
    public abstract Bundle getBrowserRootHints();
    
    public abstract MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo();
    
    public abstract void notifyChildrenChanged(MediaSessionManager.RemoteUserInfo paramRemoteUserInfo, String paramString, Bundle paramBundle);
    
    public abstract void notifyChildrenChanged(String paramString, Bundle paramBundle);
    
    public abstract IBinder onBind(Intent paramIntent);
    
    public abstract void onCreate();
    
    public abstract void setSessionToken(MediaSessionCompat.Token paramToken);
  }
  
  @RequiresApi(21)
  public class MediaBrowserServiceImplApi21
    implements MediaBrowserServiceCompat.MediaBrowserServiceImpl
  {
    public Messenger mMessenger;
    public final List<Bundle> mRootExtrasList = new ArrayList();
    public MediaBrowserService mServiceFwk;
    
    public MediaBrowserServiceImplApi21() {}
    
    public Bundle getBrowserRootHints()
    {
      Object localObject = mMessenger;
      Bundle localBundle = null;
      if (localObject == null) {
        return null;
      }
      localObject = mCurConnection;
      if (localObject != null)
      {
        if (rootHints != null) {
          localBundle = new Bundle(mCurConnection.rootHints);
        }
        return localBundle;
      }
      throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
    }
    
    public MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo()
    {
      MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = mCurConnection;
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
      mHandler.post(new Runnable()
      {
        public void run()
        {
          for (int i = 0; i < mConnections.size(); i++)
          {
            MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = (MediaBrowserServiceCompat.ConnectionRecord)mConnections.valueAt(i);
            if (browserInfo.equals(paramRemoteUserInfo)) {
              notifyChildrenChangedForCompatOnHandler(localConnectionRecord, paramString, paramBundle);
            }
          }
        }
      });
    }
    
    public void notifyChildrenChangedForCompat(final String paramString, final Bundle paramBundle)
    {
      mHandler.post(new Runnable()
      {
        public void run()
        {
          Iterator localIterator = mConnections.keySet().iterator();
          while (localIterator.hasNext())
          {
            Object localObject = (IBinder)localIterator.next();
            localObject = (MediaBrowserServiceCompat.ConnectionRecord)mConnections.get(localObject);
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
            performLoadChildren(paramString, paramConnectionRecord, (Bundle)second, paramBundle);
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
      MediaBrowserServiceApi21 localMediaBrowserServiceApi21 = new MediaBrowserServiceApi21(MediaBrowserServiceCompat.this);
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
        mMessenger = new Messenger(mHandler);
        localObject1 = new Bundle();
        ((BaseBundle)localObject1).putInt("extra_service_version", 2);
        BundleCompat.putBinder((Bundle)localObject1, "extra_messenger", mMessenger.getBinder());
        localObject2 = mSession;
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
      Object localObject1 = new MediaBrowserServiceCompat.ConnectionRecord(MediaBrowserServiceCompat.this, paramString, i, paramInt, paramBundle, null);
      MediaBrowserServiceCompat localMediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
      mCurConnection = ((MediaBrowserServiceCompat.ConnectionRecord)localObject1);
      paramBundle = localMediaBrowserServiceCompat.onGetRoot(paramString, paramInt, paramBundle);
      paramString = MediaBrowserServiceCompat.this;
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
      paramResultWrapper = MediaBrowserServiceCompat.this;
      mCurConnection = mConnectionFromFwk;
      paramResultWrapper.onLoadChildren(paramString, local2);
      mCurConnection = null;
    }
    
    public void setSessionToken(final MediaSessionCompat.Token paramToken)
    {
      mHandler.postOrRun(new Runnable()
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
  
  @RequiresApi(23)
  public class MediaBrowserServiceImplApi23
    extends MediaBrowserServiceCompat.MediaBrowserServiceImplApi21
  {
    public MediaBrowserServiceImplApi23()
    {
      super();
    }
    
    public void onCreate()
    {
      MediaBrowserServiceApi23 localMediaBrowserServiceApi23 = new MediaBrowserServiceApi23(MediaBrowserServiceCompat.this);
      mServiceFwk = localMediaBrowserServiceApi23;
      localMediaBrowserServiceApi23.onCreate();
    }
    
    public void onLoadItem(String paramString, final MediaBrowserServiceCompat.ResultWrapper<Parcel> paramResultWrapper)
    {
      MediaBrowserServiceCompat.Result local1 = new MediaBrowserServiceCompat.Result(paramString)
      {
        public void detach()
        {
          paramResultWrapper.detach();
        }
        
        public void onResultSent(@Nullable MediaBrowserCompat.MediaItem paramAnonymousMediaItem)
        {
          if (paramAnonymousMediaItem == null)
          {
            paramResultWrapper.sendResult(null);
          }
          else
          {
            Parcel localParcel = Parcel.obtain();
            paramAnonymousMediaItem.writeToParcel(localParcel, 0);
            paramResultWrapper.sendResult(localParcel);
          }
        }
      };
      paramResultWrapper = MediaBrowserServiceCompat.this;
      mCurConnection = mConnectionFromFwk;
      paramResultWrapper.onLoadItem(paramString, local1);
      mCurConnection = null;
    }
    
    public class MediaBrowserServiceApi23
      extends MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.MediaBrowserServiceApi21
    {
      public MediaBrowserServiceApi23(Context paramContext)
      {
        super(paramContext);
      }
      
      public void onLoadItem(String paramString, MediaBrowserService.Result<MediaBrowser.MediaItem> paramResult)
      {
        onLoadItem(paramString, new MediaBrowserServiceCompat.ResultWrapper(paramResult));
      }
    }
  }
  
  @RequiresApi(26)
  public class MediaBrowserServiceImplApi26
    extends MediaBrowserServiceCompat.MediaBrowserServiceImplApi23
  {
    public MediaBrowserServiceImplApi26()
    {
      super();
    }
    
    public Bundle getBrowserRootHints()
    {
      Object localObject = MediaBrowserServiceCompat.this;
      MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = mCurConnection;
      if (localConnectionRecord != null)
      {
        if (localConnectionRecord == mConnectionFromFwk) {
          return mServiceFwk.getBrowserRootHints();
        }
        if (rootHints == null) {
          localObject = null;
        } else {
          localObject = new Bundle(mCurConnection.rootHints);
        }
        return (Bundle)localObject;
      }
      throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
    }
    
    public void notifyChildrenChangedForFramework(String paramString, Bundle paramBundle)
    {
      if (paramBundle != null) {
        mServiceFwk.notifyChildrenChanged(paramString, paramBundle);
      } else {
        super.notifyChildrenChangedForFramework(paramString, paramBundle);
      }
    }
    
    public void onCreate()
    {
      MediaBrowserServiceApi26 localMediaBrowserServiceApi26 = new MediaBrowserServiceApi26(MediaBrowserServiceCompat.this);
      mServiceFwk = localMediaBrowserServiceApi26;
      localMediaBrowserServiceApi26.onCreate();
    }
    
    public void onLoadChildren(String paramString, final MediaBrowserServiceCompat.ResultWrapper<List<Parcel>> paramResultWrapper, final Bundle paramBundle)
    {
      MediaBrowserServiceCompat.Result local1 = new MediaBrowserServiceCompat.Result(paramString)
      {
        public void detach()
        {
          paramResultWrapper.detach();
        }
        
        public void onResultSent(@Nullable List<MediaBrowserCompat.MediaItem> paramAnonymousList)
        {
          if (paramAnonymousList == null)
          {
            paramResultWrapper.sendResult(null);
            return;
          }
          Object localObject = paramAnonymousList;
          if ((getFlags() & 0x1) != 0) {
            localObject = applyOptions(paramAnonymousList, paramBundle);
          }
          paramAnonymousList = new ArrayList(((List)localObject).size());
          localObject = ((List)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            MediaBrowserCompat.MediaItem localMediaItem = (MediaBrowserCompat.MediaItem)((Iterator)localObject).next();
            Parcel localParcel = Parcel.obtain();
            localMediaItem.writeToParcel(localParcel, 0);
            paramAnonymousList.add(localParcel);
          }
          paramResultWrapper.sendResult(paramAnonymousList);
        }
      };
      paramResultWrapper = MediaBrowserServiceCompat.this;
      mCurConnection = mConnectionFromFwk;
      paramResultWrapper.onLoadChildren(paramString, local1, paramBundle);
      mCurConnection = null;
    }
    
    public class MediaBrowserServiceApi26
      extends MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.MediaBrowserServiceApi23
    {
      public MediaBrowserServiceApi26(Context paramContext)
      {
        super(paramContext);
      }
      
      public void onLoadChildren(String paramString, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> paramResult, Bundle paramBundle)
      {
        MediaSessionCompat.ensureClassLoader(paramBundle);
        MediaBrowserServiceCompat.MediaBrowserServiceImplApi26 localMediaBrowserServiceImplApi26 = MediaBrowserServiceCompat.MediaBrowserServiceImplApi26.this;
        MediaBrowserServiceCompat localMediaBrowserServiceCompat = this$0;
        mCurConnection = mConnectionFromFwk;
        localMediaBrowserServiceImplApi26.onLoadChildren(paramString, new MediaBrowserServiceCompat.ResultWrapper(paramResult), paramBundle);
        mCurConnection = null;
      }
    }
  }
  
  @RequiresApi(28)
  public class MediaBrowserServiceImplApi28
    extends MediaBrowserServiceCompat.MediaBrowserServiceImplApi26
  {
    public MediaBrowserServiceImplApi28()
    {
      super();
    }
    
    public MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo()
    {
      MediaBrowserServiceCompat localMediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
      MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = mCurConnection;
      if (localConnectionRecord != null)
      {
        if (localConnectionRecord == mConnectionFromFwk) {
          return new MediaSessionManager.RemoteUserInfo(c.e(mServiceFwk));
        }
        return browserInfo;
      }
      throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
    }
  }
  
  public class MediaBrowserServiceImplBase
    implements MediaBrowserServiceCompat.MediaBrowserServiceImpl
  {
    private Messenger mMessenger;
    
    public MediaBrowserServiceImplBase() {}
    
    public Bundle getBrowserRootHints()
    {
      Object localObject = mCurConnection;
      if (localObject != null)
      {
        if (rootHints == null) {
          localObject = null;
        } else {
          localObject = new Bundle(mCurConnection.rootHints);
        }
        return (Bundle)localObject;
      }
      throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
    }
    
    public MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo()
    {
      MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = mCurConnection;
      if (localConnectionRecord != null) {
        return browserInfo;
      }
      throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
    }
    
    public void notifyChildrenChanged(@NonNull final MediaSessionManager.RemoteUserInfo paramRemoteUserInfo, @NonNull final String paramString, final Bundle paramBundle)
    {
      mHandler.post(new Runnable()
      {
        public void run()
        {
          for (int i = 0; i < mConnections.size(); i++)
          {
            MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = (MediaBrowserServiceCompat.ConnectionRecord)mConnections.valueAt(i);
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
      mHandler.post(new Runnable()
      {
        public void run()
        {
          Iterator localIterator = mConnections.keySet().iterator();
          while (localIterator.hasNext())
          {
            Object localObject = (IBinder)localIterator.next();
            localObject = (MediaBrowserServiceCompat.ConnectionRecord)mConnections.get(localObject);
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
            performLoadChildren(paramString, paramConnectionRecord, (Bundle)second, paramBundle);
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
      mMessenger = new Messenger(mHandler);
    }
    
    public void setSessionToken(final MediaSessionCompat.Token paramToken)
    {
      mHandler.post(new Runnable()
      {
        public void run()
        {
          Iterator localIterator = mConnections.values().iterator();
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
  
  public static class Result<T>
  {
    private final Object mDebug;
    private boolean mDetachCalled;
    private int mFlags;
    private boolean mSendErrorCalled;
    private boolean mSendResultCalled;
    
    public Result(Object paramObject)
    {
      mDebug = paramObject;
    }
    
    private void checkExtraFields(@Nullable Bundle paramBundle)
    {
      if (paramBundle == null) {
        return;
      }
      if (paramBundle.containsKey("android.media.browse.extra.DOWNLOAD_PROGRESS"))
      {
        float f = paramBundle.getFloat("android.media.browse.extra.DOWNLOAD_PROGRESS");
        if ((f < -1.0E-5F) || (f > 1.00001F)) {
          throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0]");
        }
      }
    }
    
    public void detach()
    {
      if (!mDetachCalled)
      {
        if (!mSendResultCalled)
        {
          if (!mSendErrorCalled)
          {
            mDetachCalled = true;
            return;
          }
          localStringBuilder = z2.t("detach() called when sendError() had already been called for: ");
          localStringBuilder.append(mDebug);
          throw new IllegalStateException(localStringBuilder.toString());
        }
        localStringBuilder = z2.t("detach() called when sendResult() had already been called for: ");
        localStringBuilder.append(mDebug);
        throw new IllegalStateException(localStringBuilder.toString());
      }
      StringBuilder localStringBuilder = z2.t("detach() called when detach() had already been called for: ");
      localStringBuilder.append(mDebug);
      throw new IllegalStateException(localStringBuilder.toString());
    }
    
    public int getFlags()
    {
      return mFlags;
    }
    
    public boolean isDone()
    {
      boolean bool;
      if ((!mDetachCalled) && (!mSendResultCalled) && (!mSendErrorCalled)) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public void onErrorSent(@Nullable Bundle paramBundle)
    {
      paramBundle = z2.t("It is not supported to send an error for ");
      paramBundle.append(mDebug);
      throw new UnsupportedOperationException(paramBundle.toString());
    }
    
    public void onProgressUpdateSent(@Nullable Bundle paramBundle)
    {
      paramBundle = z2.t("It is not supported to send an interim update for ");
      paramBundle.append(mDebug);
      throw new UnsupportedOperationException(paramBundle.toString());
    }
    
    public void onResultSent(@Nullable T paramT) {}
    
    public void sendError(@Nullable Bundle paramBundle)
    {
      if ((!mSendResultCalled) && (!mSendErrorCalled))
      {
        mSendErrorCalled = true;
        onErrorSent(paramBundle);
        return;
      }
      paramBundle = z2.t("sendError() called when either sendResult() or sendError() had already been called for: ");
      paramBundle.append(mDebug);
      throw new IllegalStateException(paramBundle.toString());
    }
    
    public void sendProgressUpdate(@Nullable Bundle paramBundle)
    {
      if ((!mSendResultCalled) && (!mSendErrorCalled))
      {
        checkExtraFields(paramBundle);
        onProgressUpdateSent(paramBundle);
        return;
      }
      paramBundle = z2.t("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: ");
      paramBundle.append(mDebug);
      throw new IllegalStateException(paramBundle.toString());
    }
    
    public void sendResult(@Nullable T paramT)
    {
      if ((!mSendResultCalled) && (!mSendErrorCalled))
      {
        mSendResultCalled = true;
        onResultSent(paramT);
        return;
      }
      paramT = z2.t("sendResult() called when either sendResult() or sendError() had already been called for: ");
      paramT.append(mDebug);
      throw new IllegalStateException(paramT.toString());
    }
    
    public void setFlags(int paramInt)
    {
      mFlags = paramInt;
    }
  }
  
  @RequiresApi(21)
  public static class ResultWrapper<T>
  {
    public MediaBrowserService.Result mResultFwk;
    
    public ResultWrapper(MediaBrowserService.Result paramResult)
    {
      mResultFwk = paramResult;
    }
    
    public void detach()
    {
      mResultFwk.detach();
    }
    
    public List<MediaBrowser.MediaItem> parcelListToItemList(List<Parcel> paramList)
    {
      if (paramList == null) {
        return null;
      }
      ArrayList localArrayList = new ArrayList(paramList.size());
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        Parcel localParcel = (Parcel)paramList.next();
        localParcel.setDataPosition(0);
        localArrayList.add((MediaBrowser.MediaItem)MediaBrowser.MediaItem.CREATOR.createFromParcel(localParcel));
        localParcel.recycle();
      }
      return localArrayList;
    }
    
    public void sendResult(T paramT)
    {
      if ((paramT instanceof List))
      {
        mResultFwk.sendResult(parcelListToItemList((List)paramT));
      }
      else if ((paramT instanceof Parcel))
      {
        paramT = (Parcel)paramT;
        paramT.setDataPosition(0);
        mResultFwk.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(paramT));
        paramT.recycle();
      }
      else
      {
        mResultFwk.sendResult(null);
      }
    }
  }
  
  public class ServiceBinderImpl
  {
    public ServiceBinderImpl() {}
    
    public void addSubscription(final String paramString, final IBinder paramIBinder, final Bundle paramBundle, final MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks)
    {
      mHandler.postOrRun(new Runnable()
      {
        public void run()
        {
          Object localObject = paramServiceCallbacks.asBinder();
          localObject = (MediaBrowserServiceCompat.ConnectionRecord)mConnections.get(localObject);
          if (localObject == null)
          {
            localObject = z2.t("addSubscription for callback that isn't registered id=");
            ((StringBuilder)localObject).append(paramString);
            Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
            return;
          }
          addSubscription(paramString, (MediaBrowserServiceCompat.ConnectionRecord)localObject, paramIBinder, paramBundle);
        }
      });
    }
    
    public void connect(final String paramString, final int paramInt1, final int paramInt2, final Bundle paramBundle, final MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks)
    {
      if (isValidPackage(paramString, paramInt2))
      {
        mHandler.postOrRun(new Runnable()
        {
          public void run()
          {
            Object localObject1 = paramServiceCallbacks.asBinder();
            mConnections.remove(localObject1);
            MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = new MediaBrowserServiceCompat.ConnectionRecord(MediaBrowserServiceCompat.this, paramString, paramInt1, paramInt2, paramBundle, paramServiceCallbacks);
            Object localObject2 = MediaBrowserServiceCompat.this;
            mCurConnection = localConnectionRecord;
            localObject2 = ((MediaBrowserServiceCompat)localObject2).onGetRoot(paramString, paramInt2, paramBundle);
            root = ((MediaBrowserServiceCompat.BrowserRoot)localObject2);
            MediaBrowserServiceCompat localMediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
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
                if (mSession != null) {
                  paramServiceCallbacks.onConnect(root.getRootId(), mSession, root.getExtras());
                }
              }
              catch (RemoteException localRemoteException2)
              {
                StringBuilder localStringBuilder2 = z2.t("Calling onConnect() failed. Dropping client. pkg=");
                localStringBuilder2.append(paramString);
                Log.w("MBServiceCompat", localStringBuilder2.toString());
                mConnections.remove(localStringBuilder1);
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
      mHandler.postOrRun(new Runnable()
      {
        public void run()
        {
          Object localObject = paramServiceCallbacks.asBinder();
          localObject = (MediaBrowserServiceCompat.ConnectionRecord)mConnections.remove(localObject);
          if (localObject != null) {
            callbacks.asBinder().unlinkToDeath((IBinder.DeathRecipient)localObject, 0);
          }
        }
      });
    }
    
    public void getMediaItem(final String paramString, final ResultReceiver paramResultReceiver, final MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks)
    {
      if ((!TextUtils.isEmpty(paramString)) && (paramResultReceiver != null)) {
        mHandler.postOrRun(new Runnable()
        {
          public void run()
          {
            Object localObject = paramServiceCallbacks.asBinder();
            localObject = (MediaBrowserServiceCompat.ConnectionRecord)mConnections.get(localObject);
            if (localObject == null)
            {
              localObject = z2.t("getMediaItem for callback that isn't registered id=");
              ((StringBuilder)localObject).append(paramString);
              Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
              return;
            }
            performLoadItem(paramString, (MediaBrowserServiceCompat.ConnectionRecord)localObject, paramResultReceiver);
          }
        });
      }
    }
    
    public void registerCallbacks(final MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks, final String paramString, final int paramInt1, final int paramInt2, final Bundle paramBundle)
    {
      mHandler.postOrRun(new Runnable()
      {
        public void run()
        {
          IBinder localIBinder = paramServiceCallbacks.asBinder();
          mConnections.remove(localIBinder);
          Iterator localIterator = mPendingConnections.iterator();
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
            localObject1 = new MediaBrowserServiceCompat.ConnectionRecord(MediaBrowserServiceCompat.this, pkg, pid, uid, paramBundle, paramServiceCallbacks);
          }
          localIterator.remove();
          Object localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new MediaBrowserServiceCompat.ConnectionRecord(MediaBrowserServiceCompat.this, paramString, paramInt1, paramInt2, paramBundle, paramServiceCallbacks);
          }
          mConnections.put(localIBinder, localObject2);
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
      mHandler.postOrRun(new Runnable()
      {
        public void run()
        {
          Object localObject = paramServiceCallbacks.asBinder();
          localObject = (MediaBrowserServiceCompat.ConnectionRecord)mConnections.get(localObject);
          if (localObject == null)
          {
            localObject = z2.t("removeSubscription for callback that isn't registered id=");
            ((StringBuilder)localObject).append(paramString);
            Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
            return;
          }
          if (!removeSubscription(paramString, (MediaBrowserServiceCompat.ConnectionRecord)localObject, paramIBinder))
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
        mHandler.postOrRun(new Runnable()
        {
          public void run()
          {
            Object localObject = paramServiceCallbacks.asBinder();
            localObject = (MediaBrowserServiceCompat.ConnectionRecord)mConnections.get(localObject);
            if (localObject == null)
            {
              localObject = z2.t("search for callback that isn't registered query=");
              ((StringBuilder)localObject).append(paramString);
              Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
              return;
            }
            performSearch(paramString, paramBundle, (MediaBrowserServiceCompat.ConnectionRecord)localObject, paramResultReceiver);
          }
        });
      }
    }
    
    public void sendCustomAction(final String paramString, final Bundle paramBundle, final ResultReceiver paramResultReceiver, final MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks)
    {
      if ((!TextUtils.isEmpty(paramString)) && (paramResultReceiver != null)) {
        mHandler.postOrRun(new Runnable()
        {
          public void run()
          {
            Object localObject = paramServiceCallbacks.asBinder();
            localObject = (MediaBrowserServiceCompat.ConnectionRecord)mConnections.get(localObject);
            if (localObject == null)
            {
              localObject = z2.t("sendCustomAction for callback that isn't registered action=");
              ((StringBuilder)localObject).append(paramString);
              ((StringBuilder)localObject).append(", extras=");
              ((StringBuilder)localObject).append(paramBundle);
              Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
              return;
            }
            performCustomAction(paramString, paramBundle, (MediaBrowserServiceCompat.ConnectionRecord)localObject, paramResultReceiver);
          }
        });
      }
    }
    
    public void unregisterCallbacks(final MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks)
    {
      mHandler.postOrRun(new Runnable()
      {
        public void run()
        {
          IBinder localIBinder = paramServiceCallbacks.asBinder();
          MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = (MediaBrowserServiceCompat.ConnectionRecord)mConnections.remove(localIBinder);
          if (localConnectionRecord != null) {
            localIBinder.unlinkToDeath(localConnectionRecord, 0);
          }
        }
      });
    }
  }
  
  public static abstract interface ServiceCallbacks
  {
    public abstract IBinder asBinder();
    
    public abstract void onConnect(String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle)
      throws RemoteException;
    
    public abstract void onConnectFailed()
      throws RemoteException;
    
    public abstract void onLoadChildren(String paramString, List<MediaBrowserCompat.MediaItem> paramList, Bundle paramBundle1, Bundle paramBundle2)
      throws RemoteException;
  }
  
  public static class ServiceCallbacksCompat
    implements MediaBrowserServiceCompat.ServiceCallbacks
  {
    public final Messenger mCallbacks;
    
    public ServiceCallbacksCompat(Messenger paramMessenger)
    {
      mCallbacks = paramMessenger;
    }
    
    private void sendRequest(int paramInt, Bundle paramBundle)
      throws RemoteException
    {
      Message localMessage = Message.obtain();
      what = paramInt;
      arg1 = 2;
      localMessage.setData(paramBundle);
      mCallbacks.send(localMessage);
    }
    
    public IBinder asBinder()
    {
      return mCallbacks.getBinder();
    }
    
    public void onConnect(String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle)
      throws RemoteException
    {
      Bundle localBundle = paramBundle;
      if (paramBundle == null) {
        localBundle = new Bundle();
      }
      localBundle.putInt("extra_service_version", 2);
      paramBundle = new Bundle();
      paramBundle.putString("data_media_item_id", paramString);
      paramBundle.putParcelable("data_media_session_token", paramToken);
      paramBundle.putBundle("data_root_hints", localBundle);
      sendRequest(1, paramBundle);
    }
    
    public void onConnectFailed()
      throws RemoteException
    {
      sendRequest(2, null);
    }
    
    public void onLoadChildren(String paramString, List<MediaBrowserCompat.MediaItem> paramList, Bundle paramBundle1, Bundle paramBundle2)
      throws RemoteException
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("data_media_item_id", paramString);
      localBundle.putBundle("data_options", paramBundle1);
      localBundle.putBundle("data_notify_children_changed_options", paramBundle2);
      if (paramList != null)
      {
        if ((paramList instanceof ArrayList)) {
          paramString = (ArrayList)paramList;
        } else {
          paramString = new ArrayList(paramList);
        }
        localBundle.putParcelableArrayList("data_media_item_list", paramString);
      }
      sendRequest(3, localBundle);
    }
  }
  
  public final class ServiceHandler
    extends Handler
  {
    private final MediaBrowserServiceCompat.ServiceBinderImpl mServiceBinderImpl = new MediaBrowserServiceCompat.ServiceBinderImpl(MediaBrowserServiceCompat.this);
    
    public ServiceHandler() {}
    
    public void handleMessage(Message paramMessage)
    {
      Object localObject = paramMessage.getData();
      Bundle localBundle;
      switch (what)
      {
      default: 
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Unhandled message: ");
        ((StringBuilder)localObject).append(paramMessage);
        ((StringBuilder)localObject).append("\n  Service version: ");
        ((StringBuilder)localObject).append(2);
        ((StringBuilder)localObject).append("\n  Client version: ");
        ((StringBuilder)localObject).append(arg1);
        Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
        break;
      case 9: 
        localBundle = ((Bundle)localObject).getBundle("data_custom_action_extras");
        MediaSessionCompat.ensureClassLoader(localBundle);
        mServiceBinderImpl.sendCustomAction(((BaseBundle)localObject).getString("data_custom_action"), localBundle, (ResultReceiver)((Bundle)localObject).getParcelable("data_result_receiver"), new MediaBrowserServiceCompat.ServiceCallbacksCompat(replyTo));
        break;
      case 8: 
        localBundle = ((Bundle)localObject).getBundle("data_search_extras");
        MediaSessionCompat.ensureClassLoader(localBundle);
        mServiceBinderImpl.search(((BaseBundle)localObject).getString("data_search_query"), localBundle, (ResultReceiver)((Bundle)localObject).getParcelable("data_result_receiver"), new MediaBrowserServiceCompat.ServiceCallbacksCompat(replyTo));
        break;
      case 7: 
        mServiceBinderImpl.unregisterCallbacks(new MediaBrowserServiceCompat.ServiceCallbacksCompat(replyTo));
        break;
      case 6: 
        localBundle = ((Bundle)localObject).getBundle("data_root_hints");
        MediaSessionCompat.ensureClassLoader(localBundle);
        mServiceBinderImpl.registerCallbacks(new MediaBrowserServiceCompat.ServiceCallbacksCompat(replyTo), ((BaseBundle)localObject).getString("data_package_name"), ((BaseBundle)localObject).getInt("data_calling_pid"), ((BaseBundle)localObject).getInt("data_calling_uid"), localBundle);
        break;
      case 5: 
        mServiceBinderImpl.getMediaItem(((BaseBundle)localObject).getString("data_media_item_id"), (ResultReceiver)((Bundle)localObject).getParcelable("data_result_receiver"), new MediaBrowserServiceCompat.ServiceCallbacksCompat(replyTo));
        break;
      case 4: 
        mServiceBinderImpl.removeSubscription(((BaseBundle)localObject).getString("data_media_item_id"), BundleCompat.getBinder((Bundle)localObject, "data_callback_token"), new MediaBrowserServiceCompat.ServiceCallbacksCompat(replyTo));
        break;
      case 3: 
        localBundle = ((Bundle)localObject).getBundle("data_options");
        MediaSessionCompat.ensureClassLoader(localBundle);
        mServiceBinderImpl.addSubscription(((BaseBundle)localObject).getString("data_media_item_id"), BundleCompat.getBinder((Bundle)localObject, "data_callback_token"), localBundle, new MediaBrowserServiceCompat.ServiceCallbacksCompat(replyTo));
        break;
      case 2: 
        mServiceBinderImpl.disconnect(new MediaBrowserServiceCompat.ServiceCallbacksCompat(replyTo));
        break;
      case 1: 
        localBundle = ((Bundle)localObject).getBundle("data_root_hints");
        MediaSessionCompat.ensureClassLoader(localBundle);
        mServiceBinderImpl.connect(((BaseBundle)localObject).getString("data_package_name"), ((BaseBundle)localObject).getInt("data_calling_pid"), ((BaseBundle)localObject).getInt("data_calling_uid"), localBundle, new MediaBrowserServiceCompat.ServiceCallbacksCompat(replyTo));
      }
    }
    
    public void postOrRun(Runnable paramRunnable)
    {
      if (Thread.currentThread() == getLooper().getThread()) {
        paramRunnable.run();
      } else {
        post(paramRunnable);
      }
    }
    
    public boolean sendMessageAtTime(Message paramMessage, long paramLong)
    {
      Bundle localBundle = paramMessage.getData();
      localBundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
      localBundle.putInt("data_calling_uid", Binder.getCallingUid());
      int i = Binder.getCallingPid();
      if (i > 0) {
        localBundle.putInt("data_calling_pid", i);
      } else if (!localBundle.containsKey("data_calling_pid")) {
        localBundle.putInt("data_calling_pid", -1);
      }
      return super.sendMessageAtTime(paramMessage, paramLong);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */