package androidx.mediarouter.media;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.OnActiveChangeListener;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.core.app.ActivityManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.core.hardware.display.DisplayManagerCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Pair;
import androidx.media.VolumeProviderCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Future;
import z2;

public final class MediaRouter
{
  public static final int AVAILABILITY_FLAG_IGNORE_DEFAULT_ROUTE = 1;
  public static final int AVAILABILITY_FLAG_REQUIRE_MATCH = 2;
  public static final int CALLBACK_FLAG_FORCE_DISCOVERY = 8;
  public static final int CALLBACK_FLAG_PERFORM_ACTIVE_SCAN = 1;
  public static final int CALLBACK_FLAG_REQUEST_DISCOVERY = 4;
  public static final int CALLBACK_FLAG_UNFILTERED_EVENTS = 2;
  public static final boolean DEBUG = Log.isLoggable("MediaRouter", 3);
  public static final String TAG = "MediaRouter";
  public static final int UNSELECT_REASON_DISCONNECTED = 1;
  public static final int UNSELECT_REASON_ROUTE_CHANGED = 3;
  public static final int UNSELECT_REASON_STOPPED = 2;
  public static final int UNSELECT_REASON_UNKNOWN = 0;
  public static GlobalMediaRouter sGlobal;
  public final ArrayList<CallbackRecord> mCallbackRecords = new ArrayList();
  public final Context mContext;
  
  public MediaRouter(Context paramContext)
  {
    mContext = paramContext;
  }
  
  public static void checkCallingThread()
  {
    if (Looper.myLooper() == Looper.getMainLooper()) {
      return;
    }
    throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
  }
  
  private int findCallbackRecord(Callback paramCallback)
  {
    int i = mCallbackRecords.size();
    for (int j = 0; j < i; j++) {
      if (mCallbackRecords.get(j)).mCallback == paramCallback) {
        return j;
      }
    }
    return -1;
  }
  
  public static int getGlobalCallbackCount()
  {
    if (sGlobal == null) {
      return 0;
    }
    return getGlobalRouter().getCallbackCount();
  }
  
  @MainThread
  public static GlobalMediaRouter getGlobalRouter()
  {
    GlobalMediaRouter localGlobalMediaRouter = sGlobal;
    if (localGlobalMediaRouter == null) {
      return null;
    }
    localGlobalMediaRouter.ensureInitialized();
    return sGlobal;
  }
  
  @NonNull
  public static MediaRouter getInstance(@NonNull Context paramContext)
  {
    if (paramContext != null)
    {
      checkCallingThread();
      if (sGlobal == null) {
        sGlobal = new GlobalMediaRouter(paramContext.getApplicationContext());
      }
      return sGlobal.getRouter(paramContext);
    }
    throw new IllegalArgumentException("context must not be null");
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static boolean isGroupVolumeUxEnabled()
  {
    if (sGlobal == null) {
      return false;
    }
    return getGlobalRouter().isGroupVolumeUxEnabled();
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static boolean isMediaTransferEnabled()
  {
    if (sGlobal == null) {
      return false;
    }
    return getGlobalRouter().isMediaTransferEnabled();
  }
  
  public static boolean isTransferToLocalEnabled()
  {
    GlobalMediaRouter localGlobalMediaRouter = getGlobalRouter();
    boolean bool;
    if (localGlobalMediaRouter == null) {
      bool = false;
    } else {
      bool = localGlobalMediaRouter.isTransferToLocalEnabled();
    }
    return bool;
  }
  
  @MainThread
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static void resetGlobalRouter()
  {
    GlobalMediaRouter localGlobalMediaRouter = sGlobal;
    if (localGlobalMediaRouter == null) {
      return;
    }
    localGlobalMediaRouter.reset();
    sGlobal = null;
  }
  
  public void addCallback(@NonNull MediaRouteSelector paramMediaRouteSelector, @NonNull Callback paramCallback)
  {
    addCallback(paramMediaRouteSelector, paramCallback, 0);
  }
  
  public void addCallback(@NonNull MediaRouteSelector paramMediaRouteSelector, @NonNull Callback paramCallback, int paramInt)
  {
    if (paramMediaRouteSelector != null)
    {
      if (paramCallback != null)
      {
        checkCallingThread();
        if (DEBUG)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("addCallback: selector=");
          localStringBuilder.append(paramMediaRouteSelector);
          localStringBuilder.append(", callback=");
          localStringBuilder.append(paramCallback);
          localStringBuilder.append(", flags=");
          localStringBuilder.append(Integer.toHexString(paramInt));
          Log.d("MediaRouter", localStringBuilder.toString());
        }
        int i = findCallbackRecord(paramCallback);
        if (i < 0)
        {
          paramCallback = new CallbackRecord(this, paramCallback);
          mCallbackRecords.add(paramCallback);
        }
        else
        {
          paramCallback = (CallbackRecord)mCallbackRecords.get(i);
        }
        i = 0;
        int j = mFlags;
        int k = 1;
        if (paramInt != j)
        {
          mFlags = paramInt;
          i = 1;
        }
        long l = SystemClock.elapsedRealtime();
        if ((paramInt & 0x1) != 0) {
          i = 1;
        }
        mTimestamp = l;
        if (!mSelector.contains(paramMediaRouteSelector))
        {
          mSelector = new MediaRouteSelector.Builder(mSelector).addSelector(paramMediaRouteSelector).build();
          paramInt = k;
        }
        else
        {
          paramInt = i;
        }
        if (paramInt != 0) {
          getGlobalRouter().updateDiscoveryRequest();
        }
        return;
      }
      throw new IllegalArgumentException("callback must not be null");
    }
    throw new IllegalArgumentException("selector must not be null");
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public void addMemberToDynamicGroup(@NonNull RouteInfo paramRouteInfo)
  {
    if (paramRouteInfo != null)
    {
      checkCallingThread();
      getGlobalRouter().addMemberToDynamicGroup(paramRouteInfo);
      return;
    }
    throw new NullPointerException("route must not be null");
  }
  
  public void addProvider(@NonNull MediaRouteProvider paramMediaRouteProvider)
  {
    if (paramMediaRouteProvider != null)
    {
      checkCallingThread();
      if (DEBUG)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("addProvider: ");
        localStringBuilder.append(paramMediaRouteProvider);
        Log.d("MediaRouter", localStringBuilder.toString());
      }
      getGlobalRouter().addProvider(paramMediaRouteProvider);
      return;
    }
    throw new IllegalArgumentException("providerInstance must not be null");
  }
  
  public void addRemoteControlClient(@NonNull Object paramObject)
  {
    if (paramObject != null)
    {
      checkCallingThread();
      if (DEBUG)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("addRemoteControlClient: ");
        localStringBuilder.append(paramObject);
        Log.d("MediaRouter", localStringBuilder.toString());
      }
      getGlobalRouter().addRemoteControlClient(paramObject);
      return;
    }
    throw new IllegalArgumentException("remoteControlClient must not be null");
  }
  
  @Nullable
  public RouteInfo getBluetoothRoute()
  {
    checkCallingThread();
    Object localObject = getGlobalRouter();
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((GlobalMediaRouter)localObject).getBluetoothRoute();
    }
    return (RouteInfo)localObject;
  }
  
  @NonNull
  public RouteInfo getDefaultRoute()
  {
    checkCallingThread();
    return getGlobalRouter().getDefaultRoute();
  }
  
  @Nullable
  public MediaSessionCompat.Token getMediaSessionToken()
  {
    Object localObject = sGlobal;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((GlobalMediaRouter)localObject).getMediaSessionToken();
    }
    return (MediaSessionCompat.Token)localObject;
  }
  
  @NonNull
  public List<ProviderInfo> getProviders()
  {
    checkCallingThread();
    Object localObject = getGlobalRouter();
    if (localObject == null) {
      localObject = Collections.emptyList();
    } else {
      localObject = ((GlobalMediaRouter)localObject).getProviders();
    }
    return (List<ProviderInfo>)localObject;
  }
  
  @Nullable
  public RouteInfo getRoute(String paramString)
  {
    checkCallingThread();
    GlobalMediaRouter localGlobalMediaRouter = getGlobalRouter();
    if (localGlobalMediaRouter == null) {
      paramString = null;
    } else {
      paramString = localGlobalMediaRouter.getRoute(paramString);
    }
    return paramString;
  }
  
  @Nullable
  public MediaRouterParams getRouterParams()
  {
    checkCallingThread();
    Object localObject = getGlobalRouter();
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((GlobalMediaRouter)localObject).getRouterParams();
    }
    return (MediaRouterParams)localObject;
  }
  
  @NonNull
  public List<RouteInfo> getRoutes()
  {
    checkCallingThread();
    Object localObject = getGlobalRouter();
    if (localObject == null) {
      localObject = Collections.emptyList();
    } else {
      localObject = ((GlobalMediaRouter)localObject).getRoutes();
    }
    return (List<RouteInfo>)localObject;
  }
  
  @NonNull
  public RouteInfo getSelectedRoute()
  {
    checkCallingThread();
    return getGlobalRouter().getSelectedRoute();
  }
  
  public boolean isRouteAvailable(@NonNull MediaRouteSelector paramMediaRouteSelector, int paramInt)
  {
    if (paramMediaRouteSelector != null)
    {
      checkCallingThread();
      return getGlobalRouter().isRouteAvailable(paramMediaRouteSelector, paramInt);
    }
    throw new IllegalArgumentException("selector must not be null");
  }
  
  public void removeCallback(@NonNull Callback paramCallback)
  {
    if (paramCallback != null)
    {
      checkCallingThread();
      if (DEBUG)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("removeCallback: callback=");
        localStringBuilder.append(paramCallback);
        Log.d("MediaRouter", localStringBuilder.toString());
      }
      int i = findCallbackRecord(paramCallback);
      if (i >= 0)
      {
        mCallbackRecords.remove(i);
        getGlobalRouter().updateDiscoveryRequest();
      }
      return;
    }
    throw new IllegalArgumentException("callback must not be null");
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public void removeMemberFromDynamicGroup(@NonNull RouteInfo paramRouteInfo)
  {
    if (paramRouteInfo != null)
    {
      checkCallingThread();
      getGlobalRouter().removeMemberFromDynamicGroup(paramRouteInfo);
      return;
    }
    throw new NullPointerException("route must not be null");
  }
  
  public void removeProvider(@NonNull MediaRouteProvider paramMediaRouteProvider)
  {
    if (paramMediaRouteProvider != null)
    {
      checkCallingThread();
      if (DEBUG)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("removeProvider: ");
        localStringBuilder.append(paramMediaRouteProvider);
        Log.d("MediaRouter", localStringBuilder.toString());
      }
      getGlobalRouter().removeProvider(paramMediaRouteProvider);
      return;
    }
    throw new IllegalArgumentException("providerInstance must not be null");
  }
  
  public void removeRemoteControlClient(@NonNull Object paramObject)
  {
    if (paramObject != null)
    {
      checkCallingThread();
      if (DEBUG)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("removeRemoteControlClient: ");
        localStringBuilder.append(paramObject);
        Log.d("MediaRouter", localStringBuilder.toString());
      }
      getGlobalRouter().removeRemoteControlClient(paramObject);
      return;
    }
    throw new IllegalArgumentException("remoteControlClient must not be null");
  }
  
  public void selectRoute(@NonNull RouteInfo paramRouteInfo)
  {
    if (paramRouteInfo != null)
    {
      checkCallingThread();
      if (DEBUG)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("selectRoute: ");
        localStringBuilder.append(paramRouteInfo);
        Log.d("MediaRouter", localStringBuilder.toString());
      }
      getGlobalRouter().selectRoute(paramRouteInfo, 3);
      return;
    }
    throw new IllegalArgumentException("route must not be null");
  }
  
  public void setMediaSession(@Nullable Object paramObject)
  {
    
    if (DEBUG)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("setMediaSession: ");
      localStringBuilder.append(paramObject);
      Log.d("MediaRouter", localStringBuilder.toString());
    }
    getGlobalRouter().setMediaSession(paramObject);
  }
  
  public void setMediaSessionCompat(@Nullable MediaSessionCompat paramMediaSessionCompat)
  {
    
    if (DEBUG)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("setMediaSessionCompat: ");
      localStringBuilder.append(paramMediaSessionCompat);
      Log.d("MediaRouter", localStringBuilder.toString());
    }
    getGlobalRouter().setMediaSessionCompat(paramMediaSessionCompat);
  }
  
  @MainThread
  public void setOnPrepareTransferListener(@Nullable OnPrepareTransferListener paramOnPrepareTransferListener)
  {
    checkCallingThread();
    getGlobalRoutermOnPrepareTransferListener = paramOnPrepareTransferListener;
  }
  
  public void setRouterParams(@Nullable MediaRouterParams paramMediaRouterParams)
  {
    checkCallingThread();
    getGlobalRouter().setRouterParams(paramMediaRouterParams);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public void transferToRoute(@NonNull RouteInfo paramRouteInfo)
  {
    if (paramRouteInfo != null)
    {
      checkCallingThread();
      getGlobalRouter().transferToRoute(paramRouteInfo);
      return;
    }
    throw new NullPointerException("route must not be null");
  }
  
  public void unselect(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= 3))
    {
      checkCallingThread();
      GlobalMediaRouter localGlobalMediaRouter = getGlobalRouter();
      RouteInfo localRouteInfo = localGlobalMediaRouter.chooseFallbackRoute();
      if (localGlobalMediaRouter.getSelectedRoute() != localRouteInfo) {
        localGlobalMediaRouter.selectRoute(localRouteInfo, paramInt);
      }
      return;
    }
    throw new IllegalArgumentException("Unsupported reason to unselect route");
  }
  
  @NonNull
  public RouteInfo updateSelectedRoute(@NonNull MediaRouteSelector paramMediaRouteSelector)
  {
    if (paramMediaRouteSelector != null)
    {
      checkCallingThread();
      if (DEBUG)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("updateSelectedRoute: ");
        ((StringBuilder)localObject).append(paramMediaRouteSelector);
        Log.d("MediaRouter", ((StringBuilder)localObject).toString());
      }
      GlobalMediaRouter localGlobalMediaRouter = getGlobalRouter();
      RouteInfo localRouteInfo = localGlobalMediaRouter.getSelectedRoute();
      Object localObject = localRouteInfo;
      if (!localRouteInfo.isDefaultOrBluetooth())
      {
        localObject = localRouteInfo;
        if (!localRouteInfo.matchesSelector(paramMediaRouteSelector))
        {
          localObject = localGlobalMediaRouter.chooseFallbackRoute();
          localGlobalMediaRouter.selectRoute((RouteInfo)localObject, 3);
        }
      }
      return (RouteInfo)localObject;
    }
    throw new IllegalArgumentException("selector must not be null");
  }
  
  public static abstract class Callback
  {
    public void onProviderAdded(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.ProviderInfo paramProviderInfo) {}
    
    public void onProviderChanged(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.ProviderInfo paramProviderInfo) {}
    
    public void onProviderRemoved(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.ProviderInfo paramProviderInfo) {}
    
    public void onRouteAdded(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.RouteInfo paramRouteInfo) {}
    
    public void onRouteChanged(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.RouteInfo paramRouteInfo) {}
    
    public void onRoutePresentationDisplayChanged(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.RouteInfo paramRouteInfo) {}
    
    public void onRouteRemoved(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.RouteInfo paramRouteInfo) {}
    
    @Deprecated
    public void onRouteSelected(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.RouteInfo paramRouteInfo) {}
    
    public void onRouteSelected(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.RouteInfo paramRouteInfo, int paramInt)
    {
      onRouteSelected(paramMediaRouter, paramRouteInfo);
    }
    
    public void onRouteSelected(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.RouteInfo paramRouteInfo1, int paramInt, @NonNull MediaRouter.RouteInfo paramRouteInfo2)
    {
      onRouteSelected(paramMediaRouter, paramRouteInfo1, paramInt);
    }
    
    @Deprecated
    public void onRouteUnselected(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.RouteInfo paramRouteInfo) {}
    
    public void onRouteUnselected(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.RouteInfo paramRouteInfo, int paramInt)
    {
      onRouteUnselected(paramMediaRouter, paramRouteInfo);
    }
    
    public void onRouteVolumeChanged(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.RouteInfo paramRouteInfo) {}
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public void onRouterParamsChanged(@NonNull MediaRouter paramMediaRouter, @Nullable MediaRouterParams paramMediaRouterParams) {}
  }
  
  public static final class CallbackRecord
  {
    public final MediaRouter.Callback mCallback;
    public int mFlags;
    public final MediaRouter mRouter;
    public MediaRouteSelector mSelector;
    public long mTimestamp;
    
    public CallbackRecord(MediaRouter paramMediaRouter, MediaRouter.Callback paramCallback)
    {
      mRouter = paramMediaRouter;
      mCallback = paramCallback;
      mSelector = MediaRouteSelector.EMPTY;
    }
    
    public boolean filterRouteEvent(MediaRouter.RouteInfo paramRouteInfo1, int paramInt1, MediaRouter.RouteInfo paramRouteInfo2, int paramInt2)
    {
      if (((mFlags & 0x2) == 0) && (!paramRouteInfo1.matchesSelector(mSelector)))
      {
        if ((MediaRouter.isTransferToLocalEnabled()) && (paramRouteInfo1.isDefaultOrBluetooth()) && (paramInt1 == 262) && (paramInt2 == 3) && (paramRouteInfo2 != null)) {
          return paramRouteInfo2.isDefaultOrBluetooth() ^ true;
        }
        return false;
      }
      return true;
    }
  }
  
  public static abstract class ControlRequestCallback
  {
    public void onError(@Nullable String paramString, @Nullable Bundle paramBundle) {}
    
    public void onResult(@Nullable Bundle paramBundle) {}
  }
  
  public static final class GlobalMediaRouter
    implements SystemMediaRouteProvider.SyncCallback, RegisteredMediaRouteProviderWatcher.Callback
  {
    private MediaRouterActiveScanThrottlingHelper mActiveScanThrottlingHelper;
    public final Context mApplicationContext;
    private MediaRouter.RouteInfo mBluetoothRoute;
    private int mCallbackCount;
    public final CallbackHandler mCallbackHandler = new CallbackHandler();
    private MediaSessionCompat mCompatSession;
    public MediaRouter.RouteInfo mDefaultRoute;
    private MediaRouteDiscoveryRequest mDiscoveryRequest;
    private MediaRouteDiscoveryRequest mDiscoveryRequestForMr2Provider;
    private DisplayManagerCompat mDisplayManager;
    public MediaRouteProvider.DynamicGroupRouteController.OnDynamicRoutesChangedListener mDynamicRoutesListener = new MediaRouteProvider.DynamicGroupRouteController.OnDynamicRoutesChangedListener()
    {
      public void onRoutesChanged(@NonNull MediaRouteProvider.DynamicGroupRouteController paramAnonymousDynamicGroupRouteController, @Nullable MediaRouteDescriptor paramAnonymousMediaRouteDescriptor, @NonNull Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> paramAnonymousCollection)
      {
        Object localObject = MediaRouter.GlobalMediaRouter.this;
        if ((paramAnonymousDynamicGroupRouteController == mRequestedRouteController) && (paramAnonymousMediaRouteDescriptor != null))
        {
          paramAnonymousDynamicGroupRouteController = mRequestedRoute.getProvider();
          localObject = paramAnonymousMediaRouteDescriptor.getId();
          paramAnonymousDynamicGroupRouteController = new MediaRouter.RouteInfo(paramAnonymousDynamicGroupRouteController, (String)localObject, assignRouteUniqueId(paramAnonymousDynamicGroupRouteController, (String)localObject));
          paramAnonymousDynamicGroupRouteController.maybeUpdateDescriptor(paramAnonymousMediaRouteDescriptor);
          paramAnonymousMediaRouteDescriptor = MediaRouter.GlobalMediaRouter.this;
          if (mSelectedRoute == paramAnonymousDynamicGroupRouteController) {
            return;
          }
          paramAnonymousMediaRouteDescriptor.notifyTransfer(paramAnonymousMediaRouteDescriptor, paramAnonymousDynamicGroupRouteController, mRequestedRouteController, 3, mRequestedRoute, paramAnonymousCollection);
          paramAnonymousDynamicGroupRouteController = MediaRouter.GlobalMediaRouter.this;
          mRequestedRoute = null;
          mRequestedRouteController = null;
        }
        else if (paramAnonymousDynamicGroupRouteController == mSelectedRouteController)
        {
          if (paramAnonymousMediaRouteDescriptor != null) {
            ((MediaRouter.GlobalMediaRouter)localObject).updateRouteDescriptorAndNotify(mSelectedRoute, paramAnonymousMediaRouteDescriptor);
          }
          mSelectedRoute.updateDynamicDescriptors(paramAnonymousCollection);
        }
      }
    };
    public boolean mIsInitialized;
    private final boolean mLowRam;
    private MediaSessionRecord mMediaSession;
    public MediaRoute2Provider mMr2Provider;
    public MediaRouter.OnPrepareTransferListener mOnPrepareTransferListener;
    public final RemoteControlClientCompat.PlaybackInfo mPlaybackInfo = new RemoteControlClientCompat.PlaybackInfo();
    private final ProviderCallback mProviderCallback = new ProviderCallback();
    private final ArrayList<MediaRouter.ProviderInfo> mProviders = new ArrayList();
    public MediaSessionCompat mRccMediaSession;
    @VisibleForTesting
    public RegisteredMediaRouteProviderWatcher mRegisteredProviderWatcher;
    private final ArrayList<RemoteControlClientRecord> mRemoteControlClients = new ArrayList();
    public MediaRouter.RouteInfo mRequestedRoute;
    public MediaRouteProvider.RouteController mRequestedRouteController;
    public final Map<String, MediaRouteProvider.RouteController> mRouteControllerMap = new HashMap();
    private MediaRouterParams mRouterParams;
    public final ArrayList<WeakReference<MediaRouter>> mRouters = new ArrayList();
    private final ArrayList<MediaRouter.RouteInfo> mRoutes = new ArrayList();
    public MediaRouter.RouteInfo mSelectedRoute;
    public MediaRouteProvider.RouteController mSelectedRouteController;
    private final MediaSessionCompat.OnActiveChangeListener mSessionActiveListener = new MediaSessionCompat.OnActiveChangeListener()
    {
      public void onActiveChanged()
      {
        Object localObject = mRccMediaSession;
        if (localObject != null) {
          if (((MediaSessionCompat)localObject).isActive())
          {
            localObject = MediaRouter.GlobalMediaRouter.this;
            ((MediaRouter.GlobalMediaRouter)localObject).addRemoteControlClient(mRccMediaSession.getRemoteControlClient());
          }
          else
          {
            localObject = MediaRouter.GlobalMediaRouter.this;
            ((MediaRouter.GlobalMediaRouter)localObject).removeRemoteControlClient(mRccMediaSession.getRemoteControlClient());
          }
        }
      }
    };
    public SystemMediaRouteProvider mSystemProvider;
    public MediaRouter.PrepareTransferNotifier mTransferNotifier;
    public boolean mTransferReceiverDeclared;
    public MediaRouter.RouteInfo mTransferredRoute;
    public MediaRouteProvider.RouteController mTransferredRouteController;
    private final Map<Pair<String, String>, String> mUniqueIdMap = new HashMap();
    
    public GlobalMediaRouter(Context paramContext)
    {
      mApplicationContext = paramContext;
      mLowRam = ActivityManagerCompat.isLowRamDevice((ActivityManager)paramContext.getSystemService("activity"));
    }
    
    private MediaRouter.ProviderInfo findProviderInfo(MediaRouteProvider paramMediaRouteProvider)
    {
      int i = mProviders.size();
      for (int j = 0; j < i; j++) {
        if (mProviders.get(j)).mProviderInstance == paramMediaRouteProvider) {
          return (MediaRouter.ProviderInfo)mProviders.get(j);
        }
      }
      return null;
    }
    
    private int findRemoteControlClientRecord(Object paramObject)
    {
      int i = mRemoteControlClients.size();
      for (int j = 0; j < i; j++) {
        if (((RemoteControlClientRecord)mRemoteControlClients.get(j)).getRemoteControlClient() == paramObject) {
          return j;
        }
      }
      return -1;
    }
    
    private int findRouteByUniqueId(String paramString)
    {
      int i = mRoutes.size();
      for (int j = 0; j < i; j++) {
        if (mRoutes.get(j)).mUniqueId.equals(paramString)) {
          return j;
        }
      }
      return -1;
    }
    
    private boolean isSystemDefaultRoute(MediaRouter.RouteInfo paramRouteInfo)
    {
      boolean bool;
      if ((paramRouteInfo.getProviderInstance() == mSystemProvider) && (mDescriptorId.equals("DEFAULT_ROUTE"))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    private boolean isSystemLiveAudioOnlyRoute(MediaRouter.RouteInfo paramRouteInfo)
    {
      boolean bool;
      if ((paramRouteInfo.getProviderInstance() == mSystemProvider) && (paramRouteInfo.supportsControlCategory("android.media.intent.category.LIVE_AUDIO")) && (!paramRouteInfo.supportsControlCategory("android.media.intent.category.LIVE_VIDEO"))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    private void setMediaSessionRecord(MediaSessionRecord paramMediaSessionRecord)
    {
      MediaSessionRecord localMediaSessionRecord = mMediaSession;
      if (localMediaSessionRecord != null) {
        localMediaSessionRecord.clearVolumeHandling();
      }
      mMediaSession = paramMediaSessionRecord;
      if (paramMediaSessionRecord != null) {
        updatePlaybackInfoFromSelectedRoute();
      }
    }
    
    private void start()
    {
      mActiveScanThrottlingHelper = new MediaRouterActiveScanThrottlingHelper(new Runnable()
      {
        public void run()
        {
          updateDiscoveryRequest();
        }
      });
      addProvider(mSystemProvider);
      Object localObject = mMr2Provider;
      if (localObject != null) {
        addProvider((MediaRouteProvider)localObject);
      }
      localObject = new RegisteredMediaRouteProviderWatcher(mApplicationContext, this);
      mRegisteredProviderWatcher = ((RegisteredMediaRouteProviderWatcher)localObject);
      ((RegisteredMediaRouteProviderWatcher)localObject).start();
    }
    
    private void updateMr2ProviderDiscoveryRequest(@NonNull MediaRouteSelector paramMediaRouteSelector, boolean paramBoolean)
    {
      if (!isMediaTransferEnabled()) {
        return;
      }
      MediaRouteDiscoveryRequest localMediaRouteDiscoveryRequest = mDiscoveryRequestForMr2Provider;
      if ((localMediaRouteDiscoveryRequest != null) && (localMediaRouteDiscoveryRequest.getSelector().equals(paramMediaRouteSelector)) && (mDiscoveryRequestForMr2Provider.isActiveScan() == paramBoolean)) {
        return;
      }
      if ((paramMediaRouteSelector.isEmpty()) && (!paramBoolean))
      {
        if (mDiscoveryRequestForMr2Provider == null) {
          return;
        }
        mDiscoveryRequestForMr2Provider = null;
      }
      else
      {
        mDiscoveryRequestForMr2Provider = new MediaRouteDiscoveryRequest(paramMediaRouteSelector, paramBoolean);
      }
      if (MediaRouter.DEBUG)
      {
        paramMediaRouteSelector = z2.t("Updated MediaRoute2Provider's discovery request: ");
        paramMediaRouteSelector.append(mDiscoveryRequestForMr2Provider);
        Log.d("MediaRouter", paramMediaRouteSelector.toString());
      }
      mMr2Provider.setDiscoveryRequest(mDiscoveryRequestForMr2Provider);
    }
    
    private void updateProviderContents(MediaRouter.ProviderInfo paramProviderInfo, MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
    {
      if (!paramProviderInfo.updateDescriptor(paramMediaRouteProviderDescriptor)) {
        return;
      }
      int i = 0;
      int j = 0;
      if ((paramMediaRouteProviderDescriptor != null) && ((paramMediaRouteProviderDescriptor.isValid()) || (paramMediaRouteProviderDescriptor == mSystemProvider.getDescriptor())))
      {
        Object localObject1 = paramMediaRouteProviderDescriptor.getRoutes();
        localObject2 = new ArrayList();
        paramMediaRouteProviderDescriptor = new ArrayList();
        localObject1 = ((List)localObject1).iterator();
        boolean bool1 = false;
        Object localObject3;
        while (((Iterator)localObject1).hasNext())
        {
          localObject3 = (MediaRouteDescriptor)((Iterator)localObject1).next();
          Object localObject4;
          if ((localObject3 != null) && (((MediaRouteDescriptor)localObject3).isValid()))
          {
            localObject4 = ((MediaRouteDescriptor)localObject3).getId();
            i = paramProviderInfo.findRouteIndexByDescriptorId((String)localObject4);
            if (i < 0)
            {
              localObject4 = new MediaRouter.RouteInfo(paramProviderInfo, (String)localObject4, assignRouteUniqueId(paramProviderInfo, (String)localObject4));
              mRoutes.add(j, localObject4);
              mRoutes.add(localObject4);
              if (((MediaRouteDescriptor)localObject3).getGroupMemberIds().size() > 0)
              {
                ((ArrayList)localObject2).add(new Pair(localObject4, localObject3));
              }
              else
              {
                ((MediaRouter.RouteInfo)localObject4).maybeUpdateDescriptor((MediaRouteDescriptor)localObject3);
                if (MediaRouter.DEBUG)
                {
                  localObject3 = new StringBuilder();
                  ((StringBuilder)localObject3).append("Route added: ");
                  ((StringBuilder)localObject3).append(localObject4);
                  Log.d("MediaRouter", ((StringBuilder)localObject3).toString());
                }
                mCallbackHandler.post(257, localObject4);
              }
              j++;
            }
            else if (i < j)
            {
              localObject4 = new StringBuilder();
              ((StringBuilder)localObject4).append("Ignoring route descriptor with duplicate id: ");
              ((StringBuilder)localObject4).append(localObject3);
              Log.w("MediaRouter", ((StringBuilder)localObject4).toString());
            }
            else
            {
              localObject4 = (MediaRouter.RouteInfo)mRoutes.get(i);
              Collections.swap(mRoutes, i, j);
              if (((MediaRouteDescriptor)localObject3).getGroupMemberIds().size() > 0)
              {
                paramMediaRouteProviderDescriptor.add(new Pair(localObject4, localObject3));
                bool2 = bool1;
              }
              else
              {
                bool2 = bool1;
                if (updateRouteDescriptorAndNotify((MediaRouter.RouteInfo)localObject4, (MediaRouteDescriptor)localObject3) != 0)
                {
                  bool2 = bool1;
                  if (localObject4 == mSelectedRoute) {
                    bool2 = true;
                  }
                }
              }
              j++;
              bool1 = bool2;
            }
          }
          else
          {
            localObject4 = new StringBuilder();
            ((StringBuilder)localObject4).append("Ignoring invalid system route descriptor: ");
            ((StringBuilder)localObject4).append(localObject3);
            Log.w("MediaRouter", ((StringBuilder)localObject4).toString());
          }
        }
        localObject2 = ((ArrayList)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (Pair)((Iterator)localObject2).next();
          localObject1 = (MediaRouter.RouteInfo)first;
          ((MediaRouter.RouteInfo)localObject1).maybeUpdateDescriptor((MediaRouteDescriptor)second);
          if (MediaRouter.DEBUG)
          {
            localObject3 = new StringBuilder();
            ((StringBuilder)localObject3).append("Route added: ");
            ((StringBuilder)localObject3).append(localObject1);
            Log.d("MediaRouter", ((StringBuilder)localObject3).toString());
          }
          mCallbackHandler.post(257, localObject1);
        }
        paramMediaRouteProviderDescriptor = paramMediaRouteProviderDescriptor.iterator();
        for (;;)
        {
          i = j;
          bool2 = bool1;
          if (!paramMediaRouteProviderDescriptor.hasNext()) {
            break;
          }
          localObject1 = (Pair)paramMediaRouteProviderDescriptor.next();
          localObject2 = (MediaRouter.RouteInfo)first;
          if ((updateRouteDescriptorAndNotify((MediaRouter.RouteInfo)localObject2, (MediaRouteDescriptor)second) != 0) && (localObject2 == mSelectedRoute)) {
            bool1 = true;
          }
        }
      }
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Ignoring invalid provider descriptor: ");
      ((StringBuilder)localObject2).append(paramMediaRouteProviderDescriptor);
      Log.w("MediaRouter", ((StringBuilder)localObject2).toString());
      boolean bool2 = false;
      for (j = mRoutes.size() - 1; j >= i; j--)
      {
        paramMediaRouteProviderDescriptor = (MediaRouter.RouteInfo)mRoutes.get(j);
        paramMediaRouteProviderDescriptor.maybeUpdateDescriptor(null);
        mRoutes.remove(paramMediaRouteProviderDescriptor);
      }
      updateSelectedRouteIfNeeded(bool2);
      for (j = mRoutes.size() - 1; j >= i; j--)
      {
        localObject2 = (MediaRouter.RouteInfo)mRoutes.remove(j);
        if (MediaRouter.DEBUG)
        {
          paramMediaRouteProviderDescriptor = new StringBuilder();
          paramMediaRouteProviderDescriptor.append("Route removed: ");
          paramMediaRouteProviderDescriptor.append(localObject2);
          Log.d("MediaRouter", paramMediaRouteProviderDescriptor.toString());
        }
        mCallbackHandler.post(258, localObject2);
      }
      if (MediaRouter.DEBUG)
      {
        paramMediaRouteProviderDescriptor = new StringBuilder();
        paramMediaRouteProviderDescriptor.append("Provider changed: ");
        paramMediaRouteProviderDescriptor.append(paramProviderInfo);
        Log.d("MediaRouter", paramMediaRouteProviderDescriptor.toString());
      }
      mCallbackHandler.post(515, paramProviderInfo);
    }
    
    public void addMemberToDynamicGroup(@NonNull MediaRouter.RouteInfo paramRouteInfo)
    {
      if ((mSelectedRouteController instanceof MediaRouteProvider.DynamicGroupRouteController))
      {
        Object localObject = getDynamicGroupState(paramRouteInfo);
        if ((!mSelectedRoute.getMemberRoutes().contains(paramRouteInfo)) && (localObject != null) && (((MediaRouter.RouteInfo.DynamicGroupState)localObject).isGroupable()))
        {
          ((MediaRouteProvider.DynamicGroupRouteController)mSelectedRouteController).onAddMemberRoute(paramRouteInfo.getDescriptorId());
          return;
        }
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Ignoring attempt to add a non-groupable route to dynamic group : ");
        ((StringBuilder)localObject).append(paramRouteInfo);
        Log.w("MediaRouter", ((StringBuilder)localObject).toString());
        return;
      }
      throw new IllegalStateException("There is no currently selected dynamic group route.");
    }
    
    public void addProvider(@NonNull MediaRouteProvider paramMediaRouteProvider)
    {
      if (findProviderInfo(paramMediaRouteProvider) == null)
      {
        MediaRouter.ProviderInfo localProviderInfo = new MediaRouter.ProviderInfo(paramMediaRouteProvider);
        mProviders.add(localProviderInfo);
        if (MediaRouter.DEBUG)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Provider added: ");
          localStringBuilder.append(localProviderInfo);
          Log.d("MediaRouter", localStringBuilder.toString());
        }
        mCallbackHandler.post(513, localProviderInfo);
        updateProviderContents(localProviderInfo, paramMediaRouteProvider.getDescriptor());
        paramMediaRouteProvider.setCallback(mProviderCallback);
        paramMediaRouteProvider.setDiscoveryRequest(mDiscoveryRequest);
      }
    }
    
    public void addRemoteControlClient(Object paramObject)
    {
      if (findRemoteControlClientRecord(paramObject) < 0)
      {
        paramObject = new RemoteControlClientRecord(paramObject);
        mRemoteControlClients.add(paramObject);
      }
    }
    
    public String assignRouteUniqueId(MediaRouter.ProviderInfo paramProviderInfo, String paramString)
    {
      paramProviderInfo = paramProviderInfo.getComponentName().flattenToShortString();
      String str = z2.p(paramProviderInfo, ":", paramString);
      if (findRouteByUniqueId(str) < 0)
      {
        mUniqueIdMap.put(new Pair(paramProviderInfo, paramString), str);
        return str;
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Either ");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(" isn't unique in ");
      ((StringBuilder)localObject).append(paramProviderInfo);
      ((StringBuilder)localObject).append(" or we're trying to assign a unique ID for an already added route");
      Log.w("MediaRouter", ((StringBuilder)localObject).toString());
      for (int i = 2;; i++)
      {
        localObject = String.format(Locale.US, "%s_%d", new Object[] { str, Integer.valueOf(i) });
        if (findRouteByUniqueId((String)localObject) < 0)
        {
          mUniqueIdMap.put(new Pair(paramProviderInfo, paramString), localObject);
          return (String)localObject;
        }
      }
    }
    
    public MediaRouter.RouteInfo chooseFallbackRoute()
    {
      Iterator localIterator = mRoutes.iterator();
      while (localIterator.hasNext())
      {
        MediaRouter.RouteInfo localRouteInfo = (MediaRouter.RouteInfo)localIterator.next();
        if ((localRouteInfo != mDefaultRoute) && (isSystemLiveAudioOnlyRoute(localRouteInfo)) && (localRouteInfo.isSelectable())) {
          return localRouteInfo;
        }
      }
      return mDefaultRoute;
    }
    
    @SuppressLint({"NewApi", "SyntheticAccessor"})
    public void ensureInitialized()
    {
      if (mIsInitialized) {
        return;
      }
      mIsInitialized = true;
      if (Build.VERSION.SDK_INT >= 30) {
        mTransferReceiverDeclared = MediaTransferReceiver.isDeclared(mApplicationContext);
      } else {
        mTransferReceiverDeclared = false;
      }
      if (mTransferReceiverDeclared) {
        mMr2Provider = new MediaRoute2Provider(mApplicationContext, new Mr2ProviderCallback());
      } else {
        mMr2Provider = null;
      }
      mSystemProvider = SystemMediaRouteProvider.obtain(mApplicationContext, this);
      start();
    }
    
    public MediaRouter.RouteInfo getBluetoothRoute()
    {
      return mBluetoothRoute;
    }
    
    public int getCallbackCount()
    {
      return mCallbackCount;
    }
    
    public ContentResolver getContentResolver()
    {
      return mApplicationContext.getContentResolver();
    }
    
    @NonNull
    public MediaRouter.RouteInfo getDefaultRoute()
    {
      MediaRouter.RouteInfo localRouteInfo = mDefaultRoute;
      if (localRouteInfo != null) {
        return localRouteInfo;
      }
      throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }
    
    public Display getDisplay(int paramInt)
    {
      if (mDisplayManager == null) {
        mDisplayManager = DisplayManagerCompat.getInstance(mApplicationContext);
      }
      return mDisplayManager.getDisplay(paramInt);
    }
    
    @Nullable
    public MediaRouter.RouteInfo.DynamicGroupState getDynamicGroupState(MediaRouter.RouteInfo paramRouteInfo)
    {
      return mSelectedRoute.getDynamicGroupState(paramRouteInfo);
    }
    
    public MediaSessionCompat.Token getMediaSessionToken()
    {
      Object localObject = mMediaSession;
      if (localObject != null) {
        return ((MediaSessionRecord)localObject).getToken();
      }
      localObject = mCompatSession;
      if (localObject != null) {
        return ((MediaSessionCompat)localObject).getSessionToken();
      }
      return null;
    }
    
    public Context getProviderContext(String paramString)
    {
      if (paramString.equals("android")) {
        return mApplicationContext;
      }
      try
      {
        paramString = mApplicationContext.createPackageContext(paramString, 4);
        return paramString;
      }
      catch (PackageManager.NameNotFoundException paramString) {}
      return null;
    }
    
    @Nullable
    public List<MediaRouter.ProviderInfo> getProviders()
    {
      return mProviders;
    }
    
    public MediaRouter.RouteInfo getRoute(String paramString)
    {
      Iterator localIterator = mRoutes.iterator();
      while (localIterator.hasNext())
      {
        MediaRouter.RouteInfo localRouteInfo = (MediaRouter.RouteInfo)localIterator.next();
        if (mUniqueId.equals(paramString)) {
          return localRouteInfo;
        }
      }
      return null;
    }
    
    public MediaRouter getRouter(Context paramContext)
    {
      int i = mRouters.size();
      MediaRouter localMediaRouter;
      do
      {
        for (;;)
        {
          i--;
          if (i < 0) {
            break label59;
          }
          localMediaRouter = (MediaRouter)((WeakReference)mRouters.get(i)).get();
          if (localMediaRouter != null) {
            break;
          }
          mRouters.remove(i);
        }
      } while (mContext != paramContext);
      return localMediaRouter;
      label59:
      paramContext = new MediaRouter(paramContext);
      mRouters.add(new WeakReference(paramContext));
      return paramContext;
    }
    
    @Nullable
    public MediaRouterParams getRouterParams()
    {
      return mRouterParams;
    }
    
    public List<MediaRouter.RouteInfo> getRoutes()
    {
      return mRoutes;
    }
    
    @NonNull
    public MediaRouter.RouteInfo getSelectedRoute()
    {
      MediaRouter.RouteInfo localRouteInfo = mSelectedRoute;
      if (localRouteInfo != null) {
        return localRouteInfo;
      }
      throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }
    
    public String getUniqueId(MediaRouter.ProviderInfo paramProviderInfo, String paramString)
    {
      paramProviderInfo = paramProviderInfo.getComponentName().flattenToShortString();
      return (String)mUniqueIdMap.get(new Pair(paramProviderInfo, paramString));
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public boolean isGroupVolumeUxEnabled()
    {
      Object localObject = mRouterParams;
      boolean bool1 = true;
      boolean bool2 = bool1;
      if (localObject != null)
      {
        localObject = mExtras;
        bool2 = bool1;
        if (localObject != null) {
          if (((BaseBundle)localObject).getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true)) {
            bool2 = bool1;
          } else {
            bool2 = false;
          }
        }
      }
      return bool2;
    }
    
    public boolean isMediaTransferEnabled()
    {
      if (mTransferReceiverDeclared)
      {
        MediaRouterParams localMediaRouterParams = mRouterParams;
        if ((localMediaRouterParams == null) || (localMediaRouterParams.isMediaTransferReceiverEnabled())) {
          return true;
        }
      }
      boolean bool = false;
      return bool;
    }
    
    public boolean isRouteAvailable(MediaRouteSelector paramMediaRouteSelector, int paramInt)
    {
      if (paramMediaRouteSelector.isEmpty()) {
        return false;
      }
      if (((paramInt & 0x2) == 0) && (mLowRam)) {
        return true;
      }
      Object localObject = mRouterParams;
      int i;
      if ((localObject != null) && (((MediaRouterParams)localObject).isOutputSwitcherEnabled()) && (isMediaTransferEnabled())) {
        i = 1;
      } else {
        i = 0;
      }
      int j = mRoutes.size();
      for (int k = 0; k < j; k++)
      {
        localObject = (MediaRouter.RouteInfo)mRoutes.get(k);
        if ((((paramInt & 0x1) == 0) || (!((MediaRouter.RouteInfo)localObject).isDefaultOrBluetooth())) && ((i == 0) || (((MediaRouter.RouteInfo)localObject).isDefaultOrBluetooth()) || (((MediaRouter.RouteInfo)localObject).getProviderInstance() == mMr2Provider)) && (((MediaRouter.RouteInfo)localObject).matchesSelector(paramMediaRouteSelector))) {
          return true;
        }
      }
      return false;
    }
    
    public boolean isTransferToLocalEnabled()
    {
      MediaRouterParams localMediaRouterParams = mRouterParams;
      if (localMediaRouterParams == null) {
        return false;
      }
      return localMediaRouterParams.isTransferToLocalEnabled();
    }
    
    public void maybeUpdateMemberRouteControllers()
    {
      if (!mSelectedRoute.isGroup()) {
        return;
      }
      Object localObject1 = mSelectedRoute.getMemberRoutes();
      Object localObject2 = new HashSet();
      Iterator localIterator = ((List)localObject1).iterator();
      while (localIterator.hasNext()) {
        ((HashSet)localObject2).add(nextmUniqueId);
      }
      localIterator = mRouteControllerMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject3 = (Map.Entry)localIterator.next();
        if (!((HashSet)localObject2).contains(((Map.Entry)localObject3).getKey()))
        {
          localObject3 = (MediaRouteProvider.RouteController)((Map.Entry)localObject3).getValue();
          ((MediaRouteProvider.RouteController)localObject3).onUnselect(0);
          ((MediaRouteProvider.RouteController)localObject3).onRelease();
          localIterator.remove();
        }
      }
      localIterator = ((List)localObject1).iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (MediaRouter.RouteInfo)localIterator.next();
        if (!mRouteControllerMap.containsKey(mUniqueId))
        {
          localObject1 = ((MediaRouter.RouteInfo)localObject2).getProviderInstance().onCreateRouteController(mDescriptorId, mSelectedRoute.mDescriptorId);
          ((MediaRouteProvider.RouteController)localObject1).onSelect();
          mRouteControllerMap.put(mUniqueId, localObject1);
        }
      }
    }
    
    public void notifyTransfer(GlobalMediaRouter paramGlobalMediaRouter, MediaRouter.RouteInfo paramRouteInfo1, @Nullable MediaRouteProvider.RouteController paramRouteController, int paramInt, @Nullable MediaRouter.RouteInfo paramRouteInfo2, @Nullable Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> paramCollection)
    {
      MediaRouter.PrepareTransferNotifier localPrepareTransferNotifier = mTransferNotifier;
      if (localPrepareTransferNotifier != null)
      {
        localPrepareTransferNotifier.cancel();
        mTransferNotifier = null;
      }
      paramRouteInfo1 = new MediaRouter.PrepareTransferNotifier(paramGlobalMediaRouter, paramRouteInfo1, paramRouteController, paramInt, paramRouteInfo2, paramCollection);
      mTransferNotifier = paramRouteInfo1;
      if (mReason == 3)
      {
        paramGlobalMediaRouter = mOnPrepareTransferListener;
        if (paramGlobalMediaRouter != null)
        {
          paramGlobalMediaRouter = paramGlobalMediaRouter.onPrepareTransfer(mSelectedRoute, mToRoute);
          if (paramGlobalMediaRouter == null)
          {
            mTransferNotifier.finishTransfer();
            return;
          }
          mTransferNotifier.setFuture(paramGlobalMediaRouter);
          return;
        }
      }
      paramRouteInfo1.finishTransfer();
    }
    
    public void onSystemRouteSelectedByDescriptorId(String paramString)
    {
      mCallbackHandler.removeMessages(262);
      MediaRouter.ProviderInfo localProviderInfo = findProviderInfo(mSystemProvider);
      if (localProviderInfo != null)
      {
        paramString = localProviderInfo.findRouteByDescriptorId(paramString);
        if (paramString != null) {
          paramString.select();
        }
      }
    }
    
    public void releaseProviderController(@NonNull RegisteredMediaRouteProvider paramRegisteredMediaRouteProvider, @NonNull MediaRouteProvider.RouteController paramRouteController)
    {
      if (mSelectedRouteController == paramRouteController) {
        selectRoute(chooseFallbackRoute(), 2);
      }
    }
    
    public void removeMemberFromDynamicGroup(@NonNull MediaRouter.RouteInfo paramRouteInfo)
    {
      if ((mSelectedRouteController instanceof MediaRouteProvider.DynamicGroupRouteController))
      {
        Object localObject = getDynamicGroupState(paramRouteInfo);
        if ((mSelectedRoute.getMemberRoutes().contains(paramRouteInfo)) && (localObject != null) && (((MediaRouter.RouteInfo.DynamicGroupState)localObject).isUnselectable()))
        {
          if (mSelectedRoute.getMemberRoutes().size() <= 1)
          {
            Log.w("MediaRouter", "Ignoring attempt to remove the last member route.");
            return;
          }
          ((MediaRouteProvider.DynamicGroupRouteController)mSelectedRouteController).onRemoveMemberRoute(paramRouteInfo.getDescriptorId());
          return;
        }
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Ignoring attempt to remove a non-unselectable member route : ");
        ((StringBuilder)localObject).append(paramRouteInfo);
        Log.w("MediaRouter", ((StringBuilder)localObject).toString());
        return;
      }
      throw new IllegalStateException("There is no currently selected dynamic group route.");
    }
    
    public void removeProvider(MediaRouteProvider paramMediaRouteProvider)
    {
      MediaRouter.ProviderInfo localProviderInfo = findProviderInfo(paramMediaRouteProvider);
      if (localProviderInfo != null)
      {
        paramMediaRouteProvider.setCallback(null);
        paramMediaRouteProvider.setDiscoveryRequest(null);
        updateProviderContents(localProviderInfo, null);
        if (MediaRouter.DEBUG)
        {
          paramMediaRouteProvider = new StringBuilder();
          paramMediaRouteProvider.append("Provider removed: ");
          paramMediaRouteProvider.append(localProviderInfo);
          Log.d("MediaRouter", paramMediaRouteProvider.toString());
        }
        mCallbackHandler.post(514, localProviderInfo);
        mProviders.remove(localProviderInfo);
      }
    }
    
    public void removeRemoteControlClient(Object paramObject)
    {
      int i = findRemoteControlClientRecord(paramObject);
      if (i >= 0) {
        ((RemoteControlClientRecord)mRemoteControlClients.remove(i)).disconnect();
      }
    }
    
    public void requestSetVolume(MediaRouter.RouteInfo paramRouteInfo, int paramInt)
    {
      if (paramRouteInfo == mSelectedRoute)
      {
        MediaRouteProvider.RouteController localRouteController = mSelectedRouteController;
        if (localRouteController != null)
        {
          localRouteController.onSetVolume(paramInt);
          return;
        }
      }
      if (!mRouteControllerMap.isEmpty())
      {
        paramRouteInfo = (MediaRouteProvider.RouteController)mRouteControllerMap.get(mUniqueId);
        if (paramRouteInfo != null) {
          paramRouteInfo.onSetVolume(paramInt);
        }
      }
    }
    
    public void requestUpdateVolume(MediaRouter.RouteInfo paramRouteInfo, int paramInt)
    {
      if (paramRouteInfo == mSelectedRoute)
      {
        MediaRouteProvider.RouteController localRouteController = mSelectedRouteController;
        if (localRouteController != null)
        {
          localRouteController.onUpdateVolume(paramInt);
          return;
        }
      }
      if (!mRouteControllerMap.isEmpty())
      {
        paramRouteInfo = (MediaRouteProvider.RouteController)mRouteControllerMap.get(mUniqueId);
        if (paramRouteInfo != null) {
          paramRouteInfo.onUpdateVolume(paramInt);
        }
      }
    }
    
    public void reset()
    {
      if (!mIsInitialized) {
        return;
      }
      mRegisteredProviderWatcher.stop();
      mActiveScanThrottlingHelper.reset();
      setMediaSessionCompat(null);
      Iterator localIterator = mRemoteControlClients.iterator();
      while (localIterator.hasNext()) {
        ((RemoteControlClientRecord)localIterator.next()).disconnect();
      }
      localIterator = new ArrayList(mProviders).iterator();
      while (localIterator.hasNext()) {
        removeProvider(nextmProviderInstance);
      }
      mCallbackHandler.removeCallbacksAndMessages(null);
    }
    
    public void selectRoute(@NonNull MediaRouter.RouteInfo paramRouteInfo, int paramInt)
    {
      Object localObject;
      if (!mRoutes.contains(paramRouteInfo))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Ignoring attempt to select removed route: ");
        ((StringBuilder)localObject).append(paramRouteInfo);
        Log.w("MediaRouter", ((StringBuilder)localObject).toString());
        return;
      }
      if (!mEnabled)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Ignoring attempt to select disabled route: ");
        ((StringBuilder)localObject).append(paramRouteInfo);
        Log.w("MediaRouter", ((StringBuilder)localObject).toString());
        return;
      }
      if (Build.VERSION.SDK_INT >= 30)
      {
        localObject = paramRouteInfo.getProviderInstance();
        MediaRoute2Provider localMediaRoute2Provider = mMr2Provider;
        if ((localObject == localMediaRoute2Provider) && (mSelectedRoute != paramRouteInfo))
        {
          localMediaRoute2Provider.transferTo(paramRouteInfo.getDescriptorId());
          return;
        }
      }
      selectRouteInternal(paramRouteInfo, paramInt);
    }
    
    public void selectRouteInternal(@NonNull MediaRouter.RouteInfo paramRouteInfo, int paramInt)
    {
      Object localObject2;
      if ((MediaRouter.sGlobal == null) || ((mBluetoothRoute != null) && (paramRouteInfo.isDefault())))
      {
        StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
        localObject1 = new StringBuilder();
        for (int i = 3; i < arrayOfStackTraceElement.length; i++)
        {
          localObject2 = arrayOfStackTraceElement[i];
          ((StringBuilder)localObject1).append(((StackTraceElement)localObject2).getClassName());
          ((StringBuilder)localObject1).append(".");
          ((StringBuilder)localObject1).append(((StackTraceElement)localObject2).getMethodName());
          ((StringBuilder)localObject1).append(":");
          ((StringBuilder)localObject1).append(((StackTraceElement)localObject2).getLineNumber());
          ((StringBuilder)localObject1).append("  ");
        }
        if (MediaRouter.sGlobal == null)
        {
          localObject2 = z2.t("setSelectedRouteInternal is called while sGlobal is null: pkgName=");
          ((StringBuilder)localObject2).append(mApplicationContext.getPackageName());
          ((StringBuilder)localObject2).append(", callers=");
          ((StringBuilder)localObject2).append(((StringBuilder)localObject1).toString());
          Log.w("MediaRouter", ((StringBuilder)localObject2).toString());
        }
        else
        {
          localObject2 = z2.t("Default route is selected while a BT route is available: pkgName=");
          ((StringBuilder)localObject2).append(mApplicationContext.getPackageName());
          ((StringBuilder)localObject2).append(", callers=");
          ((StringBuilder)localObject2).append(((StringBuilder)localObject1).toString());
          Log.w("MediaRouter", ((StringBuilder)localObject2).toString());
        }
      }
      if (mSelectedRoute == paramRouteInfo) {
        return;
      }
      if (mRequestedRoute != null)
      {
        mRequestedRoute = null;
        localObject1 = mRequestedRouteController;
        if (localObject1 != null)
        {
          ((MediaRouteProvider.RouteController)localObject1).onUnselect(3);
          mRequestedRouteController.onRelease();
          mRequestedRouteController = null;
        }
      }
      if ((isMediaTransferEnabled()) && (paramRouteInfo.getProvider().supportsDynamicGroup()))
      {
        localObject1 = paramRouteInfo.getProviderInstance().onCreateDynamicGroupRouteController(mDescriptorId);
        if (localObject1 != null)
        {
          ((MediaRouteProvider.DynamicGroupRouteController)localObject1).setOnDynamicRoutesChangedListener(ContextCompat.getMainExecutor(mApplicationContext), mDynamicRoutesListener);
          mRequestedRoute = paramRouteInfo;
          mRequestedRouteController = ((MediaRouteProvider.RouteController)localObject1);
          ((MediaRouteProvider.RouteController)localObject1).onSelect();
          return;
        }
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("setSelectedRouteInternal: Failed to create dynamic group route controller. route=");
        ((StringBuilder)localObject1).append(paramRouteInfo);
        Log.w("MediaRouter", ((StringBuilder)localObject1).toString());
      }
      Object localObject1 = paramRouteInfo.getProviderInstance().onCreateRouteController(mDescriptorId);
      if (localObject1 != null) {
        ((MediaRouteProvider.RouteController)localObject1).onSelect();
      }
      if (MediaRouter.DEBUG)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Route selected: ");
        ((StringBuilder)localObject2).append(paramRouteInfo);
        Log.d("MediaRouter", ((StringBuilder)localObject2).toString());
      }
      if (mSelectedRoute == null)
      {
        mSelectedRoute = paramRouteInfo;
        mSelectedRouteController = ((MediaRouteProvider.RouteController)localObject1);
        mCallbackHandler.post(262, new Pair(null, paramRouteInfo), paramInt);
        return;
      }
      notifyTransfer(this, paramRouteInfo, (MediaRouteProvider.RouteController)localObject1, paramInt, null, null);
    }
    
    public void sendControlRequest(MediaRouter.RouteInfo paramRouteInfo, Intent paramIntent, MediaRouter.ControlRequestCallback paramControlRequestCallback)
    {
      if (paramRouteInfo == mSelectedRoute)
      {
        localObject = mSelectedRouteController;
        if ((localObject != null) && (((MediaRouteProvider.RouteController)localObject).onControlRequest(paramIntent, paramControlRequestCallback))) {
          return;
        }
      }
      Object localObject = mTransferNotifier;
      if ((localObject != null) && (paramRouteInfo == mToRoute))
      {
        paramRouteInfo = mToRouteController;
        if ((paramRouteInfo != null) && (paramRouteInfo.onControlRequest(paramIntent, paramControlRequestCallback))) {
          return;
        }
      }
      if (paramControlRequestCallback != null) {
        paramControlRequestCallback.onError(null, null);
      }
    }
    
    public void setMediaSession(Object paramObject)
    {
      if (paramObject != null) {
        paramObject = new MediaSessionRecord(paramObject);
      } else {
        paramObject = null;
      }
      setMediaSessionRecord((MediaSessionRecord)paramObject);
    }
    
    public void setMediaSessionCompat(MediaSessionCompat paramMediaSessionCompat)
    {
      mCompatSession = paramMediaSessionCompat;
      if (paramMediaSessionCompat != null) {
        paramMediaSessionCompat = new MediaSessionRecord(paramMediaSessionCompat);
      } else {
        paramMediaSessionCompat = null;
      }
      setMediaSessionRecord(paramMediaSessionCompat);
    }
    
    @SuppressLint({"NewApi"})
    public void setRouterParams(@Nullable MediaRouterParams paramMediaRouterParams)
    {
      Object localObject = mRouterParams;
      mRouterParams = paramMediaRouterParams;
      if (isMediaTransferEnabled())
      {
        if (mMr2Provider == null)
        {
          MediaRoute2Provider localMediaRoute2Provider = new MediaRoute2Provider(mApplicationContext, new Mr2ProviderCallback());
          mMr2Provider = localMediaRoute2Provider;
          addProvider(localMediaRoute2Provider);
          updateDiscoveryRequest();
          mRegisteredProviderWatcher.rescan();
        }
        boolean bool1 = false;
        boolean bool2;
        if (localObject == null) {
          bool2 = false;
        } else {
          bool2 = ((MediaRouterParams)localObject).isTransferToLocalEnabled();
        }
        if (paramMediaRouterParams != null) {
          bool1 = paramMediaRouterParams.isTransferToLocalEnabled();
        }
        if (bool2 != bool1) {
          mMr2Provider.setDiscoveryRequestInternal(mDiscoveryRequestForMr2Provider);
        }
      }
      else
      {
        localObject = mMr2Provider;
        if (localObject != null)
        {
          removeProvider((MediaRouteProvider)localObject);
          mMr2Provider = null;
          mRegisteredProviderWatcher.rescan();
        }
      }
      mCallbackHandler.post(769, paramMediaRouterParams);
    }
    
    public void transferToRoute(@NonNull MediaRouter.RouteInfo paramRouteInfo)
    {
      if ((mSelectedRouteController instanceof MediaRouteProvider.DynamicGroupRouteController))
      {
        MediaRouter.RouteInfo.DynamicGroupState localDynamicGroupState = getDynamicGroupState(paramRouteInfo);
        if ((localDynamicGroupState != null) && (localDynamicGroupState.isTransferable()))
        {
          ((MediaRouteProvider.DynamicGroupRouteController)mSelectedRouteController).onUpdateMemberRoutes(Collections.singletonList(paramRouteInfo.getDescriptorId()));
          return;
        }
        Log.w("MediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
        return;
      }
      throw new IllegalStateException("There is no currently selected dynamic group route.");
    }
    
    public void updateDiscoveryRequest()
    {
      Object localObject1 = new MediaRouteSelector.Builder();
      mActiveScanThrottlingHelper.reset();
      int i = mRouters.size();
      int j = 0;
      int k = 0;
      int m = k;
      int n;
      MediaRouter localMediaRouter;
      for (;;)
      {
        n = i - 1;
        if (n < 0) {
          break label244;
        }
        localMediaRouter = (MediaRouter)((WeakReference)mRouters.get(n)).get();
        if (localMediaRouter != null) {
          break;
        }
        mRouters.remove(n);
        i = n;
      }
      int i1 = mCallbackRecords.size();
      int i2 = k + i1;
      int i3 = 0;
      int i4 = m;
      Object localObject2;
      for (;;)
      {
        i = n;
        k = i2;
        m = i4;
        if (i3 >= i1) {
          break;
        }
        localObject2 = (MediaRouter.CallbackRecord)mCallbackRecords.get(i3);
        ((MediaRouteSelector.Builder)localObject1).addSelector(mSelector);
        if ((mFlags & 0x1) != 0) {
          bool = true;
        } else {
          bool = false;
        }
        mActiveScanThrottlingHelper.requestActiveScan(bool, mTimestamp);
        if (bool) {
          i4 = 1;
        }
        k = mFlags;
        m = i4;
        if ((k & 0x4) != 0)
        {
          m = i4;
          if (!mLowRam) {
            m = 1;
          }
        }
        i4 = m;
        if ((k & 0x8) != 0) {
          i4 = 1;
        }
        i3++;
      }
      label244:
      boolean bool = mActiveScanThrottlingHelper.finalizeActiveScanAndScheduleSuppressActiveScanRunnable();
      mCallbackCount = k;
      if (m != 0) {
        localObject2 = ((MediaRouteSelector.Builder)localObject1).build();
      } else {
        localObject2 = MediaRouteSelector.EMPTY;
      }
      updateMr2ProviderDiscoveryRequest(((MediaRouteSelector.Builder)localObject1).build(), bool);
      localObject1 = mDiscoveryRequest;
      if ((localObject1 != null) && (((MediaRouteDiscoveryRequest)localObject1).getSelector().equals(localObject2)) && (mDiscoveryRequest.isActiveScan() == bool)) {
        return;
      }
      if ((((MediaRouteSelector)localObject2).isEmpty()) && (!bool))
      {
        if (mDiscoveryRequest == null) {
          return;
        }
        mDiscoveryRequest = null;
      }
      else
      {
        mDiscoveryRequest = new MediaRouteDiscoveryRequest((MediaRouteSelector)localObject2, bool);
      }
      if (MediaRouter.DEBUG)
      {
        localObject2 = z2.t("Updated discovery request: ");
        ((StringBuilder)localObject2).append(mDiscoveryRequest);
        Log.d("MediaRouter", ((StringBuilder)localObject2).toString());
      }
      if ((m != 0) && (!bool) && (mLowRam)) {
        Log.i("MediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
      }
      m = mProviders.size();
      for (i4 = j; i4 < m; i4++)
      {
        localObject2 = mProviders.get(i4)).mProviderInstance;
        if (localObject2 != mMr2Provider) {
          ((MediaRouteProvider)localObject2).setDiscoveryRequest(mDiscoveryRequest);
        }
      }
    }
    
    @SuppressLint({"NewApi"})
    public void updatePlaybackInfoFromSelectedRoute()
    {
      Object localObject = mSelectedRoute;
      if (localObject != null)
      {
        mPlaybackInfo.volume = ((MediaRouter.RouteInfo)localObject).getVolume();
        mPlaybackInfo.volumeMax = mSelectedRoute.getVolumeMax();
        mPlaybackInfo.volumeHandling = mSelectedRoute.getVolumeHandling();
        mPlaybackInfo.playbackStream = mSelectedRoute.getPlaybackStream();
        mPlaybackInfo.playbackType = mSelectedRoute.getPlaybackType();
        if ((isMediaTransferEnabled()) && (mSelectedRoute.getProviderInstance() == mMr2Provider)) {
          mPlaybackInfo.volumeControlId = MediaRoute2Provider.getSessionIdForRouteController(mSelectedRouteController);
        } else {
          mPlaybackInfo.volumeControlId = null;
        }
        int i = mRemoteControlClients.size();
        int j = 0;
        for (int k = 0; k < i; k++) {
          ((RemoteControlClientRecord)mRemoteControlClients.get(k)).updatePlaybackInfo();
        }
        if (mMediaSession != null) {
          if ((mSelectedRoute != getDefaultRoute()) && (mSelectedRoute != getBluetoothRoute()))
          {
            localObject = mPlaybackInfo;
            k = j;
            if (volumeHandling == 1) {
              k = 2;
            }
            mMediaSession.configureVolume(k, volumeMax, volume, volumeControlId);
          }
          else
          {
            mMediaSession.clearVolumeHandling();
          }
        }
      }
      else
      {
        localObject = mMediaSession;
        if (localObject != null) {
          ((MediaSessionRecord)localObject).clearVolumeHandling();
        }
      }
    }
    
    public void updateProviderDescriptor(MediaRouteProvider paramMediaRouteProvider, MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
    {
      paramMediaRouteProvider = findProviderInfo(paramMediaRouteProvider);
      if (paramMediaRouteProvider != null) {
        updateProviderContents(paramMediaRouteProvider, paramMediaRouteProviderDescriptor);
      }
    }
    
    public int updateRouteDescriptorAndNotify(MediaRouter.RouteInfo paramRouteInfo, MediaRouteDescriptor paramMediaRouteDescriptor)
    {
      int i = paramRouteInfo.maybeUpdateDescriptor(paramMediaRouteDescriptor);
      if (i != 0)
      {
        if ((i & 0x1) != 0)
        {
          if (MediaRouter.DEBUG)
          {
            paramMediaRouteDescriptor = new StringBuilder();
            paramMediaRouteDescriptor.append("Route changed: ");
            paramMediaRouteDescriptor.append(paramRouteInfo);
            Log.d("MediaRouter", paramMediaRouteDescriptor.toString());
          }
          mCallbackHandler.post(259, paramRouteInfo);
        }
        if ((i & 0x2) != 0)
        {
          if (MediaRouter.DEBUG)
          {
            paramMediaRouteDescriptor = new StringBuilder();
            paramMediaRouteDescriptor.append("Route volume changed: ");
            paramMediaRouteDescriptor.append(paramRouteInfo);
            Log.d("MediaRouter", paramMediaRouteDescriptor.toString());
          }
          mCallbackHandler.post(260, paramRouteInfo);
        }
        if ((i & 0x4) != 0)
        {
          if (MediaRouter.DEBUG)
          {
            paramMediaRouteDescriptor = new StringBuilder();
            paramMediaRouteDescriptor.append("Route presentation display changed: ");
            paramMediaRouteDescriptor.append(paramRouteInfo);
            Log.d("MediaRouter", paramMediaRouteDescriptor.toString());
          }
          mCallbackHandler.post(261, paramRouteInfo);
        }
      }
      return i;
    }
    
    public void updateSelectedRouteIfNeeded(boolean paramBoolean)
    {
      Object localObject1 = mDefaultRoute;
      if ((localObject1 != null) && (!((MediaRouter.RouteInfo)localObject1).isSelectable()))
      {
        localObject1 = z2.t("Clearing the default route because it is no longer selectable: ");
        ((StringBuilder)localObject1).append(mDefaultRoute);
        Log.i("MediaRouter", ((StringBuilder)localObject1).toString());
        mDefaultRoute = null;
      }
      Object localObject2;
      if ((mDefaultRoute == null) && (!mRoutes.isEmpty()))
      {
        localObject1 = mRoutes.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (MediaRouter.RouteInfo)((Iterator)localObject1).next();
          if ((isSystemDefaultRoute((MediaRouter.RouteInfo)localObject2)) && (((MediaRouter.RouteInfo)localObject2).isSelectable()))
          {
            mDefaultRoute = ((MediaRouter.RouteInfo)localObject2);
            localObject1 = z2.t("Found default route: ");
            ((StringBuilder)localObject1).append(mDefaultRoute);
            Log.i("MediaRouter", ((StringBuilder)localObject1).toString());
          }
        }
      }
      localObject1 = mBluetoothRoute;
      if ((localObject1 != null) && (!((MediaRouter.RouteInfo)localObject1).isSelectable()))
      {
        localObject1 = z2.t("Clearing the bluetooth route because it is no longer selectable: ");
        ((StringBuilder)localObject1).append(mBluetoothRoute);
        Log.i("MediaRouter", ((StringBuilder)localObject1).toString());
        mBluetoothRoute = null;
      }
      if ((mBluetoothRoute == null) && (!mRoutes.isEmpty()))
      {
        localObject2 = mRoutes.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (MediaRouter.RouteInfo)((Iterator)localObject2).next();
          if ((isSystemLiveAudioOnlyRoute((MediaRouter.RouteInfo)localObject1)) && (((MediaRouter.RouteInfo)localObject1).isSelectable()))
          {
            mBluetoothRoute = ((MediaRouter.RouteInfo)localObject1);
            localObject1 = z2.t("Found bluetooth route: ");
            ((StringBuilder)localObject1).append(mBluetoothRoute);
            Log.i("MediaRouter", ((StringBuilder)localObject1).toString());
          }
        }
      }
      localObject1 = mSelectedRoute;
      if ((localObject1 != null) && (((MediaRouter.RouteInfo)localObject1).isEnabled()))
      {
        if (paramBoolean)
        {
          maybeUpdateMemberRouteControllers();
          updatePlaybackInfoFromSelectedRoute();
        }
      }
      else
      {
        localObject1 = z2.t("Unselecting the current route because it is no longer selectable: ");
        ((StringBuilder)localObject1).append(mSelectedRoute);
        Log.i("MediaRouter", ((StringBuilder)localObject1).toString());
        selectRouteInternal(chooseFallbackRoute(), 0);
      }
    }
    
    public final class CallbackHandler
      extends Handler
    {
      public static final int MSG_PROVIDER_ADDED = 513;
      public static final int MSG_PROVIDER_CHANGED = 515;
      public static final int MSG_PROVIDER_REMOVED = 514;
      public static final int MSG_ROUTER_PARAMS_CHANGED = 769;
      public static final int MSG_ROUTE_ADDED = 257;
      public static final int MSG_ROUTE_ANOTHER_SELECTED = 264;
      public static final int MSG_ROUTE_CHANGED = 259;
      public static final int MSG_ROUTE_PRESENTATION_DISPLAY_CHANGED = 261;
      public static final int MSG_ROUTE_REMOVED = 258;
      public static final int MSG_ROUTE_SELECTED = 262;
      public static final int MSG_ROUTE_UNSELECTED = 263;
      public static final int MSG_ROUTE_VOLUME_CHANGED = 260;
      private static final int MSG_TYPE_MASK = 65280;
      private static final int MSG_TYPE_PROVIDER = 512;
      private static final int MSG_TYPE_ROUTE = 256;
      private static final int MSG_TYPE_ROUTER = 768;
      private final List<MediaRouter.RouteInfo> mDynamicGroupRoutes = new ArrayList();
      private final ArrayList<MediaRouter.CallbackRecord> mTempCallbackRecords = new ArrayList();
      
      public CallbackHandler() {}
      
      private void invokeCallback(MediaRouter.CallbackRecord paramCallbackRecord, int paramInt1, Object paramObject, int paramInt2)
      {
        MediaRouter localMediaRouter = mRouter;
        MediaRouter.Callback localCallback = mCallback;
        int i = 0xFF00 & paramInt1;
        if (i != 256)
        {
          if (i != 512)
          {
            if ((i == 768) && (paramInt1 == 769)) {
              localCallback.onRouterParamsChanged(localMediaRouter, (MediaRouterParams)paramObject);
            }
          }
          else
          {
            paramCallbackRecord = (MediaRouter.ProviderInfo)paramObject;
            switch (paramInt1)
            {
            default: 
              break;
            case 515: 
              localCallback.onProviderChanged(localMediaRouter, paramCallbackRecord);
              break;
            case 514: 
              localCallback.onProviderRemoved(localMediaRouter, paramCallbackRecord);
              break;
            case 513: 
              localCallback.onProviderAdded(localMediaRouter, paramCallbackRecord);
              break;
            }
          }
        }
        else
        {
          MediaRouter.RouteInfo localRouteInfo;
          if ((paramInt1 != 264) && (paramInt1 != 262)) {
            localRouteInfo = (MediaRouter.RouteInfo)paramObject;
          } else {
            localRouteInfo = (MediaRouter.RouteInfo)second;
          }
          if ((paramInt1 != 264) && (paramInt1 != 262)) {
            paramObject = null;
          } else {
            paramObject = (MediaRouter.RouteInfo)first;
          }
          if ((localRouteInfo != null) && (paramCallbackRecord.filterRouteEvent(localRouteInfo, paramInt1, (MediaRouter.RouteInfo)paramObject, paramInt2))) {
            switch (paramInt1)
            {
            default: 
              break;
            case 264: 
              localCallback.onRouteSelected(localMediaRouter, localRouteInfo, paramInt2, (MediaRouter.RouteInfo)paramObject);
              break;
            case 263: 
              localCallback.onRouteUnselected(localMediaRouter, localRouteInfo, paramInt2);
              break;
            case 262: 
              localCallback.onRouteSelected(localMediaRouter, localRouteInfo, paramInt2, localRouteInfo);
              break;
            case 261: 
              localCallback.onRoutePresentationDisplayChanged(localMediaRouter, localRouteInfo);
              break;
            case 260: 
              localCallback.onRouteVolumeChanged(localMediaRouter, localRouteInfo);
              break;
            case 259: 
              localCallback.onRouteChanged(localMediaRouter, localRouteInfo);
              break;
            case 258: 
              localCallback.onRouteRemoved(localMediaRouter, localRouteInfo);
              break;
            case 257: 
              localCallback.onRouteAdded(localMediaRouter, localRouteInfo);
            }
          }
        }
      }
      
      private void syncWithSystemProvider(int paramInt, Object paramObject)
      {
        if (paramInt != 262)
        {
          if (paramInt != 264)
          {
            switch (paramInt)
            {
            default: 
              break;
            case 259: 
              mSystemProvider.onSyncRouteChanged((MediaRouter.RouteInfo)paramObject);
              break;
            case 258: 
              mSystemProvider.onSyncRouteRemoved((MediaRouter.RouteInfo)paramObject);
              break;
            case 257: 
              mSystemProvider.onSyncRouteAdded((MediaRouter.RouteInfo)paramObject);
              break;
            }
          }
          else
          {
            paramObject = (MediaRouter.RouteInfo)second;
            mDynamicGroupRoutes.add(paramObject);
            mSystemProvider.onSyncRouteAdded((MediaRouter.RouteInfo)paramObject);
            mSystemProvider.onSyncRouteSelected((MediaRouter.RouteInfo)paramObject);
          }
        }
        else
        {
          paramObject = (MediaRouter.RouteInfo)second;
          mSystemProvider.onSyncRouteSelected((MediaRouter.RouteInfo)paramObject);
          if ((mDefaultRoute != null) && (((MediaRouter.RouteInfo)paramObject).isDefaultOrBluetooth()))
          {
            paramObject = mDynamicGroupRoutes.iterator();
            while (((Iterator)paramObject).hasNext())
            {
              MediaRouter.RouteInfo localRouteInfo = (MediaRouter.RouteInfo)((Iterator)paramObject).next();
              mSystemProvider.onSyncRouteRemoved(localRouteInfo);
            }
            mDynamicGroupRoutes.clear();
          }
        }
      }
      
      public void handleMessage(Message paramMessage)
      {
        int i = what;
        Object localObject = obj;
        int j = arg1;
        if ((i == 259) && (getSelectedRoute().getId().equals(((MediaRouter.RouteInfo)localObject).getId()))) {
          updateSelectedRouteIfNeeded(true);
        }
        syncWithSystemProvider(i, localObject);
        try
        {
          int k = mRouters.size();
          for (;;)
          {
            k--;
            if (k < 0) {
              break;
            }
            paramMessage = (MediaRouter)((WeakReference)mRouters.get(k)).get();
            if (paramMessage == null) {
              mRouters.remove(k);
            } else {
              mTempCallbackRecords.addAll(mCallbackRecords);
            }
          }
          int m = mTempCallbackRecords.size();
          for (k = 0; k < m; k++) {
            invokeCallback((MediaRouter.CallbackRecord)mTempCallbackRecords.get(k), i, localObject, j);
          }
          return;
        }
        finally
        {
          mTempCallbackRecords.clear();
        }
      }
      
      public void post(int paramInt, Object paramObject)
      {
        obtainMessage(paramInt, paramObject).sendToTarget();
      }
      
      public void post(int paramInt1, Object paramObject, int paramInt2)
      {
        paramObject = obtainMessage(paramInt1, paramObject);
        arg1 = paramInt2;
        ((Message)paramObject).sendToTarget();
      }
    }
    
    public final class MediaSessionRecord
    {
      private int mControlType;
      private int mMaxVolume;
      private final MediaSessionCompat mMsCompat;
      private VolumeProviderCompat mVpCompat;
      
      public MediaSessionRecord(MediaSessionCompat paramMediaSessionCompat)
      {
        mMsCompat = paramMediaSessionCompat;
      }
      
      public MediaSessionRecord(Object paramObject)
      {
        this(MediaSessionCompat.fromMediaSession(mApplicationContext, paramObject));
      }
      
      public void clearVolumeHandling()
      {
        MediaSessionCompat localMediaSessionCompat = mMsCompat;
        if (localMediaSessionCompat != null)
        {
          localMediaSessionCompat.setPlaybackToLocal(mPlaybackInfo.playbackStream);
          mVpCompat = null;
        }
      }
      
      public void configureVolume(int paramInt1, int paramInt2, int paramInt3, @Nullable String paramString)
      {
        if (mMsCompat != null)
        {
          VolumeProviderCompat localVolumeProviderCompat = mVpCompat;
          if ((localVolumeProviderCompat != null) && (paramInt1 == mControlType) && (paramInt2 == mMaxVolume))
          {
            localVolumeProviderCompat.setCurrentVolume(paramInt3);
          }
          else
          {
            paramString = new VolumeProviderCompat(paramInt1, paramInt2, paramInt3, paramString)
            {
              public void onAdjustVolume(final int paramAnonymousInt)
              {
                mCallbackHandler.post(new Runnable()
                {
                  public void run()
                  {
                    MediaRouter.RouteInfo localRouteInfo = mSelectedRoute;
                    if (localRouteInfo != null) {
                      localRouteInfo.requestUpdateVolume(paramAnonymousInt);
                    }
                  }
                });
              }
              
              public void onSetVolumeTo(final int paramAnonymousInt)
              {
                mCallbackHandler.post(new Runnable()
                {
                  public void run()
                  {
                    MediaRouter.RouteInfo localRouteInfo = mSelectedRoute;
                    if (localRouteInfo != null) {
                      localRouteInfo.requestSetVolume(paramAnonymousInt);
                    }
                  }
                });
              }
            };
            mVpCompat = paramString;
            mMsCompat.setPlaybackToRemote(paramString);
          }
        }
      }
      
      public MediaSessionCompat.Token getToken()
      {
        MediaSessionCompat localMediaSessionCompat = mMsCompat;
        if (localMediaSessionCompat != null) {
          return localMediaSessionCompat.getSessionToken();
        }
        return null;
      }
    }
    
    public final class Mr2ProviderCallback
      extends MediaRoute2Provider.Callback
    {
      public Mr2ProviderCallback() {}
      
      public void onReleaseController(@NonNull MediaRouteProvider.RouteController paramRouteController)
      {
        if (paramRouteController == mSelectedRouteController)
        {
          selectRouteToFallbackRoute(2);
        }
        else if (MediaRouter.DEBUG)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("A RouteController unrelated to the selected route is released. controller=");
          localStringBuilder.append(paramRouteController);
          Log.d("MediaRouter", localStringBuilder.toString());
        }
      }
      
      public void onSelectFallbackRoute(int paramInt)
      {
        selectRouteToFallbackRoute(paramInt);
      }
      
      public void onSelectRoute(@NonNull String paramString, int paramInt)
      {
        Iterator localIterator = getRoutes().iterator();
        while (localIterator.hasNext())
        {
          localRouteInfo = (MediaRouter.RouteInfo)localIterator.next();
          if ((localRouteInfo.getProviderInstance() == mMr2Provider) && (TextUtils.equals(paramString, localRouteInfo.getDescriptorId()))) {
            break label69;
          }
        }
        MediaRouter.RouteInfo localRouteInfo = null;
        label69:
        if (localRouteInfo == null)
        {
          z2.A("onSelectRoute: The target RouteInfo is not found for descriptorId=", paramString, "MediaRouter");
          return;
        }
        selectRouteInternal(localRouteInfo, paramInt);
      }
      
      public void selectRouteToFallbackRoute(int paramInt)
      {
        MediaRouter.RouteInfo localRouteInfo = chooseFallbackRoute();
        if (getSelectedRoute() != localRouteInfo) {
          selectRouteInternal(localRouteInfo, paramInt);
        }
      }
    }
    
    public final class ProviderCallback
      extends MediaRouteProvider.Callback
    {
      public ProviderCallback() {}
      
      public void onDescriptorChanged(@NonNull MediaRouteProvider paramMediaRouteProvider, MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
      {
        updateProviderDescriptor(paramMediaRouteProvider, paramMediaRouteProviderDescriptor);
      }
    }
    
    public final class RemoteControlClientRecord
      implements RemoteControlClientCompat.VolumeCallback
    {
      private boolean mDisconnected;
      private final RemoteControlClientCompat mRccCompat;
      
      public RemoteControlClientRecord(Object paramObject)
      {
        this$1 = RemoteControlClientCompat.obtain(mApplicationContext, paramObject);
        mRccCompat = MediaRouter.GlobalMediaRouter.this;
        setVolumeCallback(this);
        updatePlaybackInfo();
      }
      
      public void disconnect()
      {
        mDisconnected = true;
        mRccCompat.setVolumeCallback(null);
      }
      
      public Object getRemoteControlClient()
      {
        return mRccCompat.getRemoteControlClient();
      }
      
      public void onVolumeSetRequest(int paramInt)
      {
        if (!mDisconnected)
        {
          MediaRouter.RouteInfo localRouteInfo = mSelectedRoute;
          if (localRouteInfo != null) {
            localRouteInfo.requestSetVolume(paramInt);
          }
        }
      }
      
      public void onVolumeUpdateRequest(int paramInt)
      {
        if (!mDisconnected)
        {
          MediaRouter.RouteInfo localRouteInfo = mSelectedRoute;
          if (localRouteInfo != null) {
            localRouteInfo.requestUpdateVolume(paramInt);
          }
        }
      }
      
      public void updatePlaybackInfo()
      {
        mRccCompat.setPlaybackInfo(mPlaybackInfo);
      }
    }
  }
  
  public static abstract interface OnPrepareTransferListener
  {
    @MainThread
    @Nullable
    public abstract ListenableFuture<Void> onPrepareTransfer(@NonNull MediaRouter.RouteInfo paramRouteInfo1, @NonNull MediaRouter.RouteInfo paramRouteInfo2);
  }
  
  public static final class PrepareTransferNotifier
  {
    private static final long TRANSFER_TIMEOUT_MS = 15000L;
    private boolean mCanceled;
    private boolean mFinished;
    private final MediaRouter.RouteInfo mFromRoute;
    private ListenableFuture<Void> mFuture;
    @Nullable
    public final List<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> mMemberRoutes;
    public final int mReason;
    private final MediaRouter.RouteInfo mRequestedRoute;
    private final WeakReference<MediaRouter.GlobalMediaRouter> mRouter;
    public final MediaRouter.RouteInfo mToRoute;
    public final MediaRouteProvider.RouteController mToRouteController;
    
    public PrepareTransferNotifier(MediaRouter.GlobalMediaRouter paramGlobalMediaRouter, MediaRouter.RouteInfo paramRouteInfo1, @Nullable MediaRouteProvider.RouteController paramRouteController, int paramInt, @Nullable MediaRouter.RouteInfo paramRouteInfo2, @Nullable Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> paramCollection)
    {
      Object localObject = null;
      mFuture = null;
      mFinished = false;
      mCanceled = false;
      mRouter = new WeakReference(paramGlobalMediaRouter);
      mToRoute = paramRouteInfo1;
      mToRouteController = paramRouteController;
      mReason = paramInt;
      mFromRoute = mSelectedRoute;
      mRequestedRoute = paramRouteInfo2;
      if (paramCollection == null) {
        paramRouteInfo1 = (MediaRouter.RouteInfo)localObject;
      } else {
        paramRouteInfo1 = new ArrayList(paramCollection);
      }
      mMemberRoutes = paramRouteInfo1;
      mCallbackHandler.postDelayed(new c(this, 1), 15000L);
    }
    
    private void selectToRouteAndNotify()
    {
      MediaRouter.GlobalMediaRouter localGlobalMediaRouter = (MediaRouter.GlobalMediaRouter)mRouter.get();
      if (localGlobalMediaRouter == null) {
        return;
      }
      MediaRouter.RouteInfo localRouteInfo = mToRoute;
      mSelectedRoute = localRouteInfo;
      mSelectedRouteController = mToRouteController;
      Object localObject = mRequestedRoute;
      if (localObject == null) {
        mCallbackHandler.post(262, new Pair(mFromRoute, localRouteInfo), mReason);
      } else {
        mCallbackHandler.post(264, new Pair(localObject, localRouteInfo), mReason);
      }
      mRouteControllerMap.clear();
      localGlobalMediaRouter.maybeUpdateMemberRouteControllers();
      localGlobalMediaRouter.updatePlaybackInfoFromSelectedRoute();
      localObject = mMemberRoutes;
      if (localObject != null) {
        mSelectedRoute.updateDynamicDescriptors((Collection)localObject);
      }
    }
    
    private void unselectFromRouteAndNotify()
    {
      MediaRouter.GlobalMediaRouter localGlobalMediaRouter = (MediaRouter.GlobalMediaRouter)mRouter.get();
      if (localGlobalMediaRouter != null)
      {
        Object localObject1 = mSelectedRoute;
        Object localObject2 = mFromRoute;
        if (localObject1 == localObject2)
        {
          mCallbackHandler.post(263, localObject2, mReason);
          localObject2 = mSelectedRouteController;
          if (localObject2 != null)
          {
            ((MediaRouteProvider.RouteController)localObject2).onUnselect(mReason);
            mSelectedRouteController.onRelease();
          }
          if (!mRouteControllerMap.isEmpty())
          {
            localObject1 = mRouteControllerMap.values().iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject2 = (MediaRouteProvider.RouteController)((Iterator)localObject1).next();
              ((MediaRouteProvider.RouteController)localObject2).onUnselect(mReason);
              ((MediaRouteProvider.RouteController)localObject2).onRelease();
            }
            mRouteControllerMap.clear();
          }
          mSelectedRouteController = null;
        }
      }
    }
    
    public void cancel()
    {
      if ((!mFinished) && (!mCanceled))
      {
        mCanceled = true;
        MediaRouteProvider.RouteController localRouteController = mToRouteController;
        if (localRouteController != null)
        {
          localRouteController.onUnselect(0);
          mToRouteController.onRelease();
        }
      }
    }
    
    public void finishTransfer()
    {
      
      if ((!mFinished) && (!mCanceled))
      {
        MediaRouter.GlobalMediaRouter localGlobalMediaRouter = (MediaRouter.GlobalMediaRouter)mRouter.get();
        if ((localGlobalMediaRouter != null) && (mTransferNotifier == this))
        {
          ListenableFuture localListenableFuture = mFuture;
          if ((localListenableFuture == null) || (!localListenableFuture.isCancelled()))
          {
            mFinished = true;
            mTransferNotifier = null;
            unselectFromRouteAndNotify();
            selectToRouteAndNotify();
            return;
          }
        }
        cancel();
      }
    }
    
    public void setFuture(ListenableFuture<Void> paramListenableFuture)
    {
      Object localObject = (MediaRouter.GlobalMediaRouter)mRouter.get();
      if ((localObject != null) && (mTransferNotifier == this))
      {
        if (mFuture == null)
        {
          mFuture = paramListenableFuture;
          c localc = new c(this, 0);
          localObject = mCallbackHandler;
          Objects.requireNonNull(localObject);
          paramListenableFuture.addListener(localc, new d(0, (Handler)localObject));
          return;
        }
        throw new IllegalStateException("future is already set");
      }
      Log.w("MediaRouter", "Router is released. Cancel transfer");
      cancel();
    }
  }
  
  public static final class ProviderInfo
  {
    private MediaRouteProviderDescriptor mDescriptor;
    private final MediaRouteProvider.ProviderMetadata mMetadata;
    public final MediaRouteProvider mProviderInstance;
    public final List<MediaRouter.RouteInfo> mRoutes = new ArrayList();
    
    public ProviderInfo(MediaRouteProvider paramMediaRouteProvider)
    {
      mProviderInstance = paramMediaRouteProvider;
      mMetadata = paramMediaRouteProvider.getMetadata();
    }
    
    public MediaRouter.RouteInfo findRouteByDescriptorId(String paramString)
    {
      int i = mRoutes.size();
      for (int j = 0; j < i; j++) {
        if (mRoutes.get(j)).mDescriptorId.equals(paramString)) {
          return (MediaRouter.RouteInfo)mRoutes.get(j);
        }
      }
      return null;
    }
    
    public int findRouteIndexByDescriptorId(String paramString)
    {
      int i = mRoutes.size();
      for (int j = 0; j < i; j++) {
        if (mRoutes.get(j)).mDescriptorId.equals(paramString)) {
          return j;
        }
      }
      return -1;
    }
    
    @NonNull
    public ComponentName getComponentName()
    {
      return mMetadata.getComponentName();
    }
    
    @NonNull
    public String getPackageName()
    {
      return mMetadata.getPackageName();
    }
    
    @NonNull
    public MediaRouteProvider getProviderInstance()
    {
      MediaRouter.checkCallingThread();
      return mProviderInstance;
    }
    
    @NonNull
    public List<MediaRouter.RouteInfo> getRoutes()
    {
      MediaRouter.checkCallingThread();
      return Collections.unmodifiableList(mRoutes);
    }
    
    public boolean supportsDynamicGroup()
    {
      MediaRouteProviderDescriptor localMediaRouteProviderDescriptor = mDescriptor;
      boolean bool;
      if ((localMediaRouteProviderDescriptor != null) && (localMediaRouteProviderDescriptor.supportsDynamicGroupRoute())) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = z2.t("MediaRouter.RouteProviderInfo{ packageName=");
      localStringBuilder.append(getPackageName());
      localStringBuilder.append(" }");
      return localStringBuilder.toString();
    }
    
    public boolean updateDescriptor(MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
    {
      if (mDescriptor != paramMediaRouteProviderDescriptor)
      {
        mDescriptor = paramMediaRouteProviderDescriptor;
        return true;
      }
      return false;
    }
  }
  
  public static class RouteInfo
  {
    public static final int CHANGE_GENERAL = 1;
    public static final int CHANGE_PRESENTATION_DISPLAY = 4;
    public static final int CHANGE_VOLUME = 2;
    public static final int CONNECTION_STATE_CONNECTED = 2;
    public static final int CONNECTION_STATE_CONNECTING = 1;
    public static final int CONNECTION_STATE_DISCONNECTED = 0;
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final int DEVICE_TYPE_BLUETOOTH = 3;
    public static final int DEVICE_TYPE_SPEAKER = 2;
    public static final int DEVICE_TYPE_TV = 1;
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final int DEVICE_TYPE_UNKNOWN = 0;
    public static final int PLAYBACK_TYPE_LOCAL = 0;
    public static final int PLAYBACK_TYPE_REMOTE = 1;
    public static final int PLAYBACK_VOLUME_FIXED = 0;
    public static final int PLAYBACK_VOLUME_VARIABLE = 1;
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final int PRESENTATION_DISPLAY_ID_NONE = -1;
    public static final String SYSTEM_MEDIA_ROUTE_PROVIDER_PACKAGE_NAME = "android";
    private boolean mCanDisconnect;
    private int mConnectionState;
    private final ArrayList<IntentFilter> mControlFilters = new ArrayList();
    private String mDescription;
    public MediaRouteDescriptor mDescriptor;
    public final String mDescriptorId;
    private int mDeviceType;
    private Map<String, MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> mDynamicGroupDescriptors;
    public boolean mEnabled;
    private Bundle mExtras;
    private Uri mIconUri;
    private List<RouteInfo> mMemberRoutes = new ArrayList();
    private String mName;
    private int mPlaybackStream;
    private int mPlaybackType;
    private Display mPresentationDisplay;
    private int mPresentationDisplayId = -1;
    private final MediaRouter.ProviderInfo mProvider;
    private IntentSender mSettingsIntent;
    public final String mUniqueId;
    private int mVolume;
    private int mVolumeHandling;
    private int mVolumeMax;
    
    public RouteInfo(MediaRouter.ProviderInfo paramProviderInfo, String paramString1, String paramString2)
    {
      mProvider = paramProviderInfo;
      mDescriptorId = paramString1;
      mUniqueId = paramString2;
    }
    
    private boolean isSameControlFilter(IntentFilter paramIntentFilter1, IntentFilter paramIntentFilter2)
    {
      if (paramIntentFilter1 == paramIntentFilter2) {
        return true;
      }
      if ((paramIntentFilter1 != null) && (paramIntentFilter2 != null))
      {
        int i = paramIntentFilter1.countActions();
        if (i != paramIntentFilter2.countActions()) {
          return false;
        }
        for (int j = 0; j < i; j++) {
          if (!paramIntentFilter1.getAction(j).equals(paramIntentFilter2.getAction(j))) {
            return false;
          }
        }
        i = paramIntentFilter1.countCategories();
        if (i != paramIntentFilter2.countCategories()) {
          return false;
        }
        for (j = 0; j < i; j++) {
          if (!paramIntentFilter1.getCategory(j).equals(paramIntentFilter2.getCategory(j))) {
            return false;
          }
        }
        return true;
      }
      return false;
    }
    
    private boolean isSameControlFilters(List<IntentFilter> paramList1, List<IntentFilter> paramList2)
    {
      boolean bool = true;
      if (paramList1 == paramList2) {
        return true;
      }
      if ((paramList1 != null) && (paramList2 != null))
      {
        paramList1 = paramList1.listIterator();
        paramList2 = paramList2.listIterator();
        while ((paramList1.hasNext()) && (paramList2.hasNext())) {
          if (!isSameControlFilter((IntentFilter)paramList1.next(), (IntentFilter)paramList2.next())) {
            return false;
          }
        }
        if ((paramList1.hasNext()) || (paramList2.hasNext())) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    private static boolean isSystemMediaRouteProvider(RouteInfo paramRouteInfo)
    {
      return TextUtils.equals(paramRouteInfo.getProviderInstance().getMetadata().getPackageName(), "android");
    }
    
    public boolean canDisconnect()
    {
      return mCanDisconnect;
    }
    
    public RouteInfo findRouteByDynamicRouteDescriptor(MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor paramDynamicRouteDescriptor)
    {
      paramDynamicRouteDescriptor = paramDynamicRouteDescriptor.getRouteDescriptor().getId();
      return getProvider().findRouteByDescriptorId(paramDynamicRouteDescriptor);
    }
    
    public int getConnectionState()
    {
      return mConnectionState;
    }
    
    @NonNull
    public List<IntentFilter> getControlFilters()
    {
      return mControlFilters;
    }
    
    @Nullable
    public String getDescription()
    {
      return mDescription;
    }
    
    public String getDescriptorId()
    {
      return mDescriptorId;
    }
    
    public int getDeviceType()
    {
      return mDeviceType;
    }
    
    @Nullable
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public MediaRouteProvider.DynamicGroupRouteController getDynamicGroupController()
    {
      MediaRouter.checkCallingThread();
      MediaRouteProvider.RouteController localRouteController = getGlobalRoutermSelectedRouteController;
      if ((localRouteController instanceof MediaRouteProvider.DynamicGroupRouteController)) {
        return (MediaRouteProvider.DynamicGroupRouteController)localRouteController;
      }
      return null;
    }
    
    @Nullable
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public DynamicGroupState getDynamicGroupState(@NonNull RouteInfo paramRouteInfo)
    {
      if (paramRouteInfo != null)
      {
        Map localMap = mDynamicGroupDescriptors;
        if ((localMap != null) && (localMap.containsKey(mUniqueId))) {
          return new DynamicGroupState((MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor)mDynamicGroupDescriptors.get(mUniqueId));
        }
        return null;
      }
      throw new NullPointerException("route must not be null");
    }
    
    @Nullable
    public Bundle getExtras()
    {
      return mExtras;
    }
    
    @Nullable
    public Uri getIconUri()
    {
      return mIconUri;
    }
    
    @NonNull
    public String getId()
    {
      return mUniqueId;
    }
    
    @NonNull
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public List<RouteInfo> getMemberRoutes()
    {
      return Collections.unmodifiableList(mMemberRoutes);
    }
    
    @NonNull
    public String getName()
    {
      return mName;
    }
    
    public int getPlaybackStream()
    {
      return mPlaybackStream;
    }
    
    public int getPlaybackType()
    {
      return mPlaybackType;
    }
    
    @Nullable
    public Display getPresentationDisplay()
    {
      
      if ((mPresentationDisplayId >= 0) && (mPresentationDisplay == null)) {
        mPresentationDisplay = MediaRouter.getGlobalRouter().getDisplay(mPresentationDisplayId);
      }
      return mPresentationDisplay;
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public int getPresentationDisplayId()
    {
      return mPresentationDisplayId;
    }
    
    @NonNull
    public MediaRouter.ProviderInfo getProvider()
    {
      return mProvider;
    }
    
    @NonNull
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public MediaRouteProvider getProviderInstance()
    {
      return mProvider.getProviderInstance();
    }
    
    @Nullable
    public IntentSender getSettingsIntent()
    {
      return mSettingsIntent;
    }
    
    public int getVolume()
    {
      return mVolume;
    }
    
    public int getVolumeHandling()
    {
      if ((isGroup()) && (!MediaRouter.isGroupVolumeUxEnabled())) {
        return 0;
      }
      return mVolumeHandling;
    }
    
    public int getVolumeMax()
    {
      return mVolumeMax;
    }
    
    public boolean isBluetooth()
    {
      
      boolean bool;
      if (MediaRouter.getGlobalRouter().getBluetoothRoute() == this) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    @Deprecated
    public boolean isConnecting()
    {
      int i = mConnectionState;
      boolean bool = true;
      if (i != 1) {
        bool = false;
      }
      return bool;
    }
    
    public boolean isDefault()
    {
      
      boolean bool;
      if (MediaRouter.getGlobalRouter().getDefaultRoute() == this) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public boolean isDefaultOrBluetooth()
    {
      boolean bool1 = isDefault();
      boolean bool2 = true;
      boolean bool3 = bool2;
      if (!bool1) {
        if (mDeviceType == 3) {
          bool3 = bool2;
        } else if ((isSystemMediaRouteProvider(this)) && (supportsControlCategory("android.media.intent.category.LIVE_AUDIO")) && (!supportsControlCategory("android.media.intent.category.LIVE_VIDEO"))) {
          bool3 = bool2;
        } else {
          bool3 = false;
        }
      }
      return bool3;
    }
    
    public boolean isDeviceSpeaker()
    {
      int i = Resources.getSystem().getIdentifier("default_audio_route_name", "string", "android");
      boolean bool;
      if ((isDefault()) && (TextUtils.equals(Resources.getSystem().getText(i), mName))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean isEnabled()
    {
      return mEnabled;
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public boolean isGroup()
    {
      int i = getMemberRoutes().size();
      boolean bool = true;
      if (i < 1) {
        bool = false;
      }
      return bool;
    }
    
    public boolean isSelectable()
    {
      boolean bool;
      if ((mDescriptor != null) && (mEnabled)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean isSelected()
    {
      
      boolean bool;
      if (MediaRouter.getGlobalRouter().getSelectedRoute() == this) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean matchesSelector(@NonNull MediaRouteSelector paramMediaRouteSelector)
    {
      if (paramMediaRouteSelector != null)
      {
        MediaRouter.checkCallingThread();
        return paramMediaRouteSelector.matchesControlFilters(mControlFilters);
      }
      throw new IllegalArgumentException("selector must not be null");
    }
    
    public int maybeUpdateDescriptor(MediaRouteDescriptor paramMediaRouteDescriptor)
    {
      int i;
      if (mDescriptor != paramMediaRouteDescriptor) {
        i = updateDescriptor(paramMediaRouteDescriptor);
      } else {
        i = 0;
      }
      return i;
    }
    
    public void requestSetVolume(int paramInt)
    {
      MediaRouter.checkCallingThread();
      MediaRouter.getGlobalRouter().requestSetVolume(this, Math.min(mVolumeMax, Math.max(0, paramInt)));
    }
    
    public void requestUpdateVolume(int paramInt)
    {
      
      if (paramInt != 0) {
        MediaRouter.getGlobalRouter().requestUpdateVolume(this, paramInt);
      }
    }
    
    public void select()
    {
      MediaRouter.checkCallingThread();
      MediaRouter.getGlobalRouter().selectRoute(this, 3);
    }
    
    public void sendControlRequest(@NonNull Intent paramIntent, @Nullable MediaRouter.ControlRequestCallback paramControlRequestCallback)
    {
      if (paramIntent != null)
      {
        MediaRouter.checkCallingThread();
        MediaRouter.getGlobalRouter().sendControlRequest(this, paramIntent, paramControlRequestCallback);
        return;
      }
      throw new IllegalArgumentException("intent must not be null");
    }
    
    public boolean supportsControlAction(@NonNull String paramString1, @NonNull String paramString2)
    {
      if (paramString1 != null)
      {
        if (paramString2 != null)
        {
          MediaRouter.checkCallingThread();
          int i = mControlFilters.size();
          for (int j = 0; j < i; j++)
          {
            IntentFilter localIntentFilter = (IntentFilter)mControlFilters.get(j);
            if ((localIntentFilter.hasCategory(paramString1)) && (localIntentFilter.hasAction(paramString2))) {
              return true;
            }
          }
          return false;
        }
        throw new IllegalArgumentException("action must not be null");
      }
      throw new IllegalArgumentException("category must not be null");
    }
    
    public boolean supportsControlCategory(@NonNull String paramString)
    {
      if (paramString != null)
      {
        MediaRouter.checkCallingThread();
        int i = mControlFilters.size();
        for (int j = 0; j < i; j++) {
          if (((IntentFilter)mControlFilters.get(j)).hasCategory(paramString)) {
            return true;
          }
        }
        return false;
      }
      throw new IllegalArgumentException("category must not be null");
    }
    
    public boolean supportsControlRequest(@NonNull Intent paramIntent)
    {
      if (paramIntent != null)
      {
        MediaRouter.checkCallingThread();
        ContentResolver localContentResolver = MediaRouter.getGlobalRouter().getContentResolver();
        int i = mControlFilters.size();
        for (int j = 0; j < i; j++) {
          if (((IntentFilter)mControlFilters.get(j)).match(localContentResolver, paramIntent, true, "MediaRouter") >= 0) {
            return true;
          }
        }
        return false;
      }
      throw new IllegalArgumentException("intent must not be null");
    }
    
    @NonNull
    public String toString()
    {
      StringBuilder localStringBuilder1 = new StringBuilder();
      StringBuilder localStringBuilder2 = z2.t("MediaRouter.RouteInfo{ uniqueId=");
      localStringBuilder2.append(mUniqueId);
      localStringBuilder2.append(", name=");
      localStringBuilder2.append(mName);
      localStringBuilder2.append(", description=");
      localStringBuilder2.append(mDescription);
      localStringBuilder2.append(", iconUri=");
      localStringBuilder2.append(mIconUri);
      localStringBuilder2.append(", enabled=");
      localStringBuilder2.append(mEnabled);
      localStringBuilder2.append(", connectionState=");
      localStringBuilder2.append(mConnectionState);
      localStringBuilder2.append(", canDisconnect=");
      localStringBuilder2.append(mCanDisconnect);
      localStringBuilder2.append(", playbackType=");
      localStringBuilder2.append(mPlaybackType);
      localStringBuilder2.append(", playbackStream=");
      localStringBuilder2.append(mPlaybackStream);
      localStringBuilder2.append(", deviceType=");
      localStringBuilder2.append(mDeviceType);
      localStringBuilder2.append(", volumeHandling=");
      localStringBuilder2.append(mVolumeHandling);
      localStringBuilder2.append(", volume=");
      localStringBuilder2.append(mVolume);
      localStringBuilder2.append(", volumeMax=");
      localStringBuilder2.append(mVolumeMax);
      localStringBuilder2.append(", presentationDisplayId=");
      localStringBuilder2.append(mPresentationDisplayId);
      localStringBuilder2.append(", extras=");
      localStringBuilder2.append(mExtras);
      localStringBuilder2.append(", settingsIntent=");
      localStringBuilder2.append(mSettingsIntent);
      localStringBuilder2.append(", providerPackageName=");
      localStringBuilder2.append(mProvider.getPackageName());
      localStringBuilder1.append(localStringBuilder2.toString());
      if (isGroup())
      {
        localStringBuilder1.append(", members=[");
        int i = mMemberRoutes.size();
        for (int j = 0; j < i; j++)
        {
          if (j > 0) {
            localStringBuilder1.append(", ");
          }
          if (mMemberRoutes.get(j) != this) {
            localStringBuilder1.append(((RouteInfo)mMemberRoutes.get(j)).getId());
          }
        }
        localStringBuilder1.append(']');
      }
      localStringBuilder1.append(" }");
      return localStringBuilder1.toString();
    }
    
    public int updateDescriptor(MediaRouteDescriptor paramMediaRouteDescriptor)
    {
      mDescriptor = paramMediaRouteDescriptor;
      int i = 0;
      int j = 0;
      if (paramMediaRouteDescriptor != null)
      {
        if (!ObjectsCompat.equals(mName, paramMediaRouteDescriptor.getName()))
        {
          mName = paramMediaRouteDescriptor.getName();
          k = 1;
        }
        else
        {
          k = 0;
        }
        i = k;
        if (!ObjectsCompat.equals(mDescription, paramMediaRouteDescriptor.getDescription()))
        {
          mDescription = paramMediaRouteDescriptor.getDescription();
          i = k | 0x1;
        }
        int k = i;
        if (!ObjectsCompat.equals(mIconUri, paramMediaRouteDescriptor.getIconUri()))
        {
          mIconUri = paramMediaRouteDescriptor.getIconUri();
          k = i | 0x1;
        }
        int m = k;
        if (mEnabled != paramMediaRouteDescriptor.isEnabled())
        {
          mEnabled = paramMediaRouteDescriptor.isEnabled();
          m = k | 0x1;
        }
        i = m;
        if (mConnectionState != paramMediaRouteDescriptor.getConnectionState())
        {
          mConnectionState = paramMediaRouteDescriptor.getConnectionState();
          i = m | 0x1;
        }
        k = i;
        if (!isSameControlFilters(mControlFilters, paramMediaRouteDescriptor.getControlFilters()))
        {
          mControlFilters.clear();
          mControlFilters.addAll(paramMediaRouteDescriptor.getControlFilters());
          k = i | 0x1;
        }
        i = k;
        if (mPlaybackType != paramMediaRouteDescriptor.getPlaybackType())
        {
          mPlaybackType = paramMediaRouteDescriptor.getPlaybackType();
          i = k | 0x1;
        }
        m = i;
        if (mPlaybackStream != paramMediaRouteDescriptor.getPlaybackStream())
        {
          mPlaybackStream = paramMediaRouteDescriptor.getPlaybackStream();
          m = i | 0x1;
        }
        k = m;
        if (mDeviceType != paramMediaRouteDescriptor.getDeviceType())
        {
          mDeviceType = paramMediaRouteDescriptor.getDeviceType();
          k = m | 0x1;
        }
        i = k;
        if (mVolumeHandling != paramMediaRouteDescriptor.getVolumeHandling())
        {
          mVolumeHandling = paramMediaRouteDescriptor.getVolumeHandling();
          i = k | 0x3;
        }
        k = i;
        if (mVolume != paramMediaRouteDescriptor.getVolume())
        {
          mVolume = paramMediaRouteDescriptor.getVolume();
          k = i | 0x3;
        }
        i = k;
        if (mVolumeMax != paramMediaRouteDescriptor.getVolumeMax())
        {
          mVolumeMax = paramMediaRouteDescriptor.getVolumeMax();
          i = k | 0x3;
        }
        k = i;
        if (mPresentationDisplayId != paramMediaRouteDescriptor.getPresentationDisplayId())
        {
          mPresentationDisplayId = paramMediaRouteDescriptor.getPresentationDisplayId();
          mPresentationDisplay = null;
          k = i | 0x5;
        }
        i = k;
        if (!ObjectsCompat.equals(mExtras, paramMediaRouteDescriptor.getExtras()))
        {
          mExtras = paramMediaRouteDescriptor.getExtras();
          i = k | 0x1;
        }
        m = i;
        if (!ObjectsCompat.equals(mSettingsIntent, paramMediaRouteDescriptor.getSettingsActivity()))
        {
          mSettingsIntent = paramMediaRouteDescriptor.getSettingsActivity();
          m = i | 0x1;
        }
        k = m;
        if (mCanDisconnect != paramMediaRouteDescriptor.canDisconnectAndKeepPlaying())
        {
          mCanDisconnect = paramMediaRouteDescriptor.canDisconnectAndKeepPlaying();
          k = m | 0x5;
        }
        Object localObject1 = paramMediaRouteDescriptor.getGroupMemberIds();
        ArrayList localArrayList = new ArrayList();
        i = j;
        if (((List)localObject1).size() != mMemberRoutes.size()) {
          i = 1;
        }
        m = i;
        if (!((List)localObject1).isEmpty())
        {
          paramMediaRouteDescriptor = MediaRouter.getGlobalRouter();
          localObject1 = ((List)localObject1).iterator();
          for (;;)
          {
            m = i;
            if (!((Iterator)localObject1).hasNext()) {
              break;
            }
            Object localObject2 = (String)((Iterator)localObject1).next();
            localObject2 = paramMediaRouteDescriptor.getRoute(paramMediaRouteDescriptor.getUniqueId(getProvider(), (String)localObject2));
            if (localObject2 != null)
            {
              localArrayList.add(localObject2);
              if ((i == 0) && (!mMemberRoutes.contains(localObject2))) {
                i = 1;
              }
            }
          }
        }
        if (m != 0)
        {
          mMemberRoutes = localArrayList;
          i = k | 0x1;
        }
        else
        {
          i = k;
        }
      }
      return i;
    }
    
    public void updateDynamicDescriptors(Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> paramCollection)
    {
      mMemberRoutes.clear();
      if (mDynamicGroupDescriptors == null) {
        mDynamicGroupDescriptors = new ArrayMap();
      }
      mDynamicGroupDescriptors.clear();
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext())
      {
        MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor localDynamicRouteDescriptor = (MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor)localIterator.next();
        paramCollection = findRouteByDynamicRouteDescriptor(localDynamicRouteDescriptor);
        if (paramCollection != null)
        {
          mDynamicGroupDescriptors.put(mUniqueId, localDynamicRouteDescriptor);
          if ((localDynamicRouteDescriptor.getSelectionState() == 2) || (localDynamicRouteDescriptor.getSelectionState() == 3)) {
            mMemberRoutes.add(paramCollection);
          }
        }
      }
      getGlobalRoutermCallbackHandler.post(259, this);
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final class DynamicGroupState
    {
      public final MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor mDynamicDescriptor;
      
      public DynamicGroupState(MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor paramDynamicRouteDescriptor)
      {
        mDynamicDescriptor = paramDynamicRouteDescriptor;
      }
      
      @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
      public int getSelectionState()
      {
        MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor localDynamicRouteDescriptor = mDynamicDescriptor;
        int i;
        if (localDynamicRouteDescriptor != null) {
          i = localDynamicRouteDescriptor.getSelectionState();
        } else {
          i = 1;
        }
        return i;
      }
      
      @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
      public boolean isGroupable()
      {
        MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor localDynamicRouteDescriptor = mDynamicDescriptor;
        boolean bool;
        if ((localDynamicRouteDescriptor != null) && (localDynamicRouteDescriptor.isGroupable())) {
          bool = true;
        } else {
          bool = false;
        }
        return bool;
      }
      
      @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
      public boolean isTransferable()
      {
        MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor localDynamicRouteDescriptor = mDynamicDescriptor;
        boolean bool;
        if ((localDynamicRouteDescriptor != null) && (localDynamicRouteDescriptor.isTransferable())) {
          bool = true;
        } else {
          bool = false;
        }
        return bool;
      }
      
      @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
      public boolean isUnselectable()
      {
        MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor localDynamicRouteDescriptor = mDynamicDescriptor;
        boolean bool;
        if ((localDynamicRouteDescriptor != null) && (!localDynamicRouteDescriptor.isUnselectable())) {
          bool = false;
        } else {
          bool = true;
        }
        return bool;
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */