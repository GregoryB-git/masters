package androidx.mediarouter.media;

import android.content.Context;
import android.content.Intent;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2.ControllerCallback;
import android.media.MediaRouter2.RouteCallback;
import android.media.MediaRouter2.RoutingController;
import android.media.MediaRouter2.TransferCallback;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.mediarouter.R.string;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import z2;

@RequiresApi(30)
class MediaRoute2Provider
  extends MediaRouteProvider
{
  public static final boolean DEBUG = Log.isLoggable("MR2Provider", 3);
  public static final String TAG = "MR2Provider";
  public final Callback mCallback;
  private final MediaRouter2.ControllerCallback mControllerCallback = new ControllerCallback();
  public final Map<MediaRouter2.RoutingController, GroupRouteController> mControllerMap = new ArrayMap();
  private final Handler mHandler;
  private final Executor mHandlerExecutor;
  public final MediaRouter2 mMediaRouter2;
  private final MediaRouter2.RouteCallback mRouteCallback = new RouteCallback();
  private Map<String, String> mRouteIdToOriginalRouteIdMap = new ArrayMap();
  private List<MediaRoute2Info> mRoutes = new ArrayList();
  private final MediaRouter2.TransferCallback mTransferCallback = new TransferCallback();
  
  public MediaRoute2Provider(@NonNull Context paramContext, @NonNull Callback paramCallback)
  {
    super(paramContext);
    mMediaRouter2 = MediaRouter2.getInstance(paramContext);
    mCallback = paramCallback;
    paramContext = new Handler(Looper.getMainLooper());
    mHandler = paramContext;
    Objects.requireNonNull(paramContext);
    mHandlerExecutor = new d(1, paramContext);
  }
  
  @Nullable
  public static Messenger getMessengerFromRoutingController(@Nullable MediaRouter2.RoutingController paramRoutingController)
  {
    Object localObject = null;
    if (paramRoutingController == null) {
      return null;
    }
    paramRoutingController = paramRoutingController.getControlHints();
    if (paramRoutingController == null) {
      paramRoutingController = (MediaRouter2.RoutingController)localObject;
    } else {
      paramRoutingController = (Messenger)paramRoutingController.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
    }
    return paramRoutingController;
  }
  
  @Nullable
  public static String getSessionIdForRouteController(@Nullable MediaRouteProvider.RouteController paramRouteController)
  {
    boolean bool = paramRouteController instanceof GroupRouteController;
    Object localObject = null;
    if (!bool) {
      return null;
    }
    paramRouteController = mRoutingController;
    if (paramRouteController == null) {
      paramRouteController = (MediaRouteProvider.RouteController)localObject;
    } else {
      paramRouteController = paramRouteController.getId();
    }
    return paramRouteController;
  }
  
  private MediaRouteDiscoveryRequest updateDiscoveryRequest(@Nullable MediaRouteDiscoveryRequest paramMediaRouteDiscoveryRequest, boolean paramBoolean)
  {
    MediaRouteDiscoveryRequest localMediaRouteDiscoveryRequest = paramMediaRouteDiscoveryRequest;
    if (paramMediaRouteDiscoveryRequest == null) {
      localMediaRouteDiscoveryRequest = new MediaRouteDiscoveryRequest(MediaRouteSelector.EMPTY, false);
    }
    paramMediaRouteDiscoveryRequest = localMediaRouteDiscoveryRequest.getSelector().getControlCategories();
    if (paramBoolean)
    {
      if (!paramMediaRouteDiscoveryRequest.contains("android.media.intent.category.LIVE_AUDIO")) {
        paramMediaRouteDiscoveryRequest.add("android.media.intent.category.LIVE_AUDIO");
      }
    }
    else {
      paramMediaRouteDiscoveryRequest.remove("android.media.intent.category.LIVE_AUDIO");
    }
    return new MediaRouteDiscoveryRequest(new MediaRouteSelector.Builder().addControlCategories(paramMediaRouteDiscoveryRequest).build(), localMediaRouteDiscoveryRequest.isActiveScan());
  }
  
  @Nullable
  public MediaRoute2Info getRouteById(@Nullable String paramString)
  {
    if (paramString == null) {
      return null;
    }
    Iterator localIterator = mRoutes.iterator();
    while (localIterator.hasNext())
    {
      MediaRoute2Info localMediaRoute2Info = (MediaRoute2Info)localIterator.next();
      if (TextUtils.equals(localMediaRoute2Info.getId(), paramString)) {
        return localMediaRoute2Info;
      }
    }
    return null;
  }
  
  @Nullable
  public MediaRouteProvider.DynamicGroupRouteController onCreateDynamicGroupRouteController(@NonNull String paramString)
  {
    Iterator localIterator = mControllerMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      GroupRouteController localGroupRouteController = (GroupRouteController)((Map.Entry)localIterator.next()).getValue();
      if (TextUtils.equals(paramString, mInitialMemberRouteId)) {
        return localGroupRouteController;
      }
    }
    return null;
  }
  
  @Nullable
  public MediaRouteProvider.RouteController onCreateRouteController(@NonNull String paramString)
  {
    return new MemberRouteController((String)mRouteIdToOriginalRouteIdMap.get(paramString), null);
  }
  
  @Nullable
  public MediaRouteProvider.RouteController onCreateRouteController(@NonNull String paramString1, @NonNull String paramString2)
  {
    String str = (String)mRouteIdToOriginalRouteIdMap.get(paramString1);
    Object localObject = mControllerMap.values().iterator();
    while (((Iterator)localObject).hasNext())
    {
      GroupRouteController localGroupRouteController = (GroupRouteController)((Iterator)localObject).next();
      if (TextUtils.equals(paramString2, localGroupRouteController.getGroupRouteId())) {
        return new MemberRouteController(str, localGroupRouteController);
      }
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Could not find the matching GroupRouteController. routeId=");
    ((StringBuilder)localObject).append(paramString1);
    ((StringBuilder)localObject).append(", routeGroupId=");
    ((StringBuilder)localObject).append(paramString2);
    Log.w("MR2Provider", ((StringBuilder)localObject).toString());
    return new MemberRouteController(str, null);
  }
  
  public void onDiscoveryRequestChanged(@Nullable MediaRouteDiscoveryRequest paramMediaRouteDiscoveryRequest)
  {
    if (MediaRouter.getGlobalCallbackCount() > 0)
    {
      paramMediaRouteDiscoveryRequest = updateDiscoveryRequest(paramMediaRouteDiscoveryRequest, MediaRouter.isTransferToLocalEnabled());
      mMediaRouter2.registerRouteCallback(mHandlerExecutor, mRouteCallback, MediaRouter2Utils.toDiscoveryPreference(paramMediaRouteDiscoveryRequest));
      mMediaRouter2.registerTransferCallback(mHandlerExecutor, mTransferCallback);
      mMediaRouter2.registerControllerCallback(mHandlerExecutor, mControllerCallback);
    }
    else
    {
      mMediaRouter2.unregisterRouteCallback(mRouteCallback);
      mMediaRouter2.unregisterTransferCallback(mTransferCallback);
      mMediaRouter2.unregisterControllerCallback(mControllerCallback);
    }
  }
  
  public void refreshRoutes()
  {
    Object localObject1 = new ArrayList();
    Object localObject2 = new ArraySet();
    Iterator localIterator = mMediaRouter2.getRoutes().iterator();
    while (localIterator.hasNext())
    {
      localObject3 = (MediaRoute2Info)localIterator.next();
      if ((localObject3 != null) && (!((ArraySet)localObject2).contains(localObject3)) && (!((MediaRoute2Info)localObject3).isSystemRoute()))
      {
        ((ArraySet)localObject2).add(localObject3);
        ((ArrayList)localObject1).add(localObject3);
      }
    }
    if (((ArrayList)localObject1).equals(mRoutes)) {
      return;
    }
    mRoutes = ((List)localObject1);
    mRouteIdToOriginalRouteIdMap.clear();
    Object localObject3 = mRoutes.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject1 = (MediaRoute2Info)((Iterator)localObject3).next();
      localObject2 = ((MediaRoute2Info)localObject1).getExtras();
      if ((localObject2 != null) && (((BaseBundle)localObject2).getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") != null))
      {
        mRouteIdToOriginalRouteIdMap.put(((MediaRoute2Info)localObject1).getId(), ((BaseBundle)localObject2).getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
      }
      else
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Cannot find the original route Id. route=");
        ((StringBuilder)localObject2).append(localObject1);
        Log.w("MR2Provider", ((StringBuilder)localObject2).toString());
      }
    }
    localObject3 = new ArrayList();
    localIterator = mRoutes.iterator();
    while (localIterator.hasNext())
    {
      localObject2 = (MediaRoute2Info)localIterator.next();
      localObject1 = MediaRouter2Utils.toMediaRouteDescriptor((MediaRoute2Info)localObject2);
      if (localObject2 != null) {
        ((ArrayList)localObject3).add(localObject1);
      }
    }
    setDescriptor(new MediaRouteProviderDescriptor.Builder().setSupportsDynamicGroupRoute(true).addRoutes((Collection)localObject3).build());
  }
  
  public void setDynamicRouteDescriptors(MediaRouter2.RoutingController paramRoutingController)
  {
    GroupRouteController localGroupRouteController = (GroupRouteController)mControllerMap.get(paramRoutingController);
    if (localGroupRouteController == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("setDynamicRouteDescriptors: No matching routeController found. routingController=");
      ((StringBuilder)localObject1).append(paramRoutingController);
      Log.w("MR2Provider", ((StringBuilder)localObject1).toString());
      return;
    }
    Object localObject1 = paramRoutingController.getSelectedRoutes();
    if (((List)localObject1).isEmpty())
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=");
      ((StringBuilder)localObject1).append(paramRoutingController);
      Log.w("MR2Provider", ((StringBuilder)localObject1).toString());
      return;
    }
    List localList = MediaRouter2Utils.getRouteIds((List)localObject1);
    Object localObject3 = MediaRouter2Utils.toMediaRouteDescriptor((MediaRoute2Info)((List)localObject1).get(0));
    Iterator localIterator = null;
    Bundle localBundle = paramRoutingController.getControlHints();
    Object localObject4 = getContext().getString(R.string.mr_dialog_default_group_name);
    Object localObject5 = localIterator;
    Object localObject6 = localObject4;
    if (localBundle != null)
    {
      localObject5 = localObject4;
      try
      {
        localObject6 = localBundle.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
        localObject1 = localObject4;
        localObject5 = localObject4;
        if (!TextUtils.isEmpty((CharSequence)localObject6)) {
          localObject1 = localObject6;
        }
        localObject5 = localObject1;
        localObject4 = localBundle.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
        localObject5 = localIterator;
        localObject6 = localObject1;
        if (localObject4 != null)
        {
          localObject5 = localObject1;
          localObject6 = MediaRouteDescriptor.fromBundle((Bundle)localObject4);
          localObject5 = localObject6;
          localObject6 = localObject1;
        }
      }
      catch (Exception localException)
      {
        Log.w("MR2Provider", "Exception while unparceling control hints.", localException);
        localObject6 = localObject5;
        localObject5 = localIterator;
      }
    }
    Object localObject2 = localObject5;
    if (localObject5 == null) {
      localObject2 = new MediaRouteDescriptor.Builder(paramRoutingController.getId(), (String)localObject6).setConnectionState(2).setPlaybackType(1).setVolume(paramRoutingController.getVolume()).setVolumeMax(paramRoutingController.getVolumeMax()).setVolumeHandling(paramRoutingController.getVolumeHandling()).addControlFilters(((MediaRouteDescriptor)localObject3).getControlFilters()).addGroupMemberIds(localList).build();
    }
    localObject5 = MediaRouter2Utils.getRouteIds(paramRoutingController.getSelectableRoutes());
    paramRoutingController = MediaRouter2Utils.getRouteIds(paramRoutingController.getDeselectableRoutes());
    localObject4 = getDescriptor();
    if (localObject4 == null)
    {
      Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
      return;
    }
    localObject6 = new ArrayList();
    localObject4 = ((MediaRouteProviderDescriptor)localObject4).getRoutes();
    if (!((List)localObject4).isEmpty())
    {
      localIterator = ((List)localObject4).iterator();
      while (localIterator.hasNext())
      {
        localObject3 = (MediaRouteDescriptor)localIterator.next();
        localObject4 = ((MediaRouteDescriptor)localObject3).getId();
        localObject3 = new MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor.Builder((MediaRouteDescriptor)localObject3);
        int i;
        if (localList.contains(localObject4)) {
          i = 3;
        } else {
          i = 1;
        }
        ((ArrayList)localObject6).add(((MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor.Builder)localObject3).setSelectionState(i).setIsGroupable(((List)localObject5).contains(localObject4)).setIsUnselectable(paramRoutingController.contains(localObject4)).setIsTransferable(true).build());
      }
    }
    localGroupRouteController.setGroupRouteDescriptor((MediaRouteDescriptor)localObject2);
    localGroupRouteController.notifyDynamicRoutesChanged((MediaRouteDescriptor)localObject2, (Collection)localObject6);
  }
  
  public void transferTo(@NonNull String paramString)
  {
    MediaRoute2Info localMediaRoute2Info = getRouteById(paramString);
    if (localMediaRoute2Info == null)
    {
      z2.A("transferTo: Specified route not found. routeId=", paramString, "MR2Provider");
      return;
    }
    mMediaRouter2.transferTo(localMediaRoute2Info);
  }
  
  public static abstract class Callback
  {
    public abstract void onReleaseController(@NonNull MediaRouteProvider.RouteController paramRouteController);
    
    public abstract void onSelectFallbackRoute(int paramInt);
    
    public abstract void onSelectRoute(@NonNull String paramString, int paramInt);
  }
  
  public class ControllerCallback
    extends MediaRouter2.ControllerCallback
  {
    public ControllerCallback() {}
    
    public void onControllerUpdated(@NonNull MediaRouter2.RoutingController paramRoutingController)
    {
      setDynamicRouteDescriptors(paramRoutingController);
    }
  }
  
  public class GroupRouteController
    extends MediaRouteProvider.DynamicGroupRouteController
  {
    private static final long OPTIMISTIC_VOLUME_TIMEOUT_MS = 1000L;
    private final Runnable mClearOptimisticVolumeRunnable = new c(this, 2);
    public final Handler mControllerHandler;
    @Nullable
    public MediaRouteDescriptor mGroupRouteDescriptor;
    public final String mInitialMemberRouteId;
    public AtomicInteger mNextRequestId = new AtomicInteger(1);
    public int mOptimisticVolume = -1;
    public final SparseArray<MediaRouter.ControlRequestCallback> mPendingCallbacks = new SparseArray();
    @Nullable
    public final Messenger mReceiveMessenger;
    public final MediaRouter2.RoutingController mRoutingController;
    @Nullable
    public final Messenger mServiceMessenger;
    
    public GroupRouteController(@NonNull MediaRouter2.RoutingController paramRoutingController, String paramString)
    {
      mRoutingController = paramRoutingController;
      mInitialMemberRouteId = paramString;
      this$1 = MediaRoute2Provider.getMessengerFromRoutingController(paramRoutingController);
      mServiceMessenger = MediaRoute2Provider.this;
      if (MediaRoute2Provider.this == null) {
        this$1 = null;
      } else {
        this$1 = new Messenger(new ReceiveHandler());
      }
      mReceiveMessenger = MediaRoute2Provider.this;
      mControllerHandler = new Handler(Looper.getMainLooper());
    }
    
    private void scheduleClearOptimisticVolume()
    {
      mControllerHandler.removeCallbacks(mClearOptimisticVolumeRunnable);
      mControllerHandler.postDelayed(mClearOptimisticVolumeRunnable, 1000L);
    }
    
    public String getGroupRouteId()
    {
      Object localObject = mGroupRouteDescriptor;
      if (localObject != null) {
        localObject = ((MediaRouteDescriptor)localObject).getId();
      } else {
        localObject = mRoutingController.getId();
      }
      return (String)localObject;
    }
    
    public void onAddMemberRoute(@NonNull String paramString)
    {
      if ((paramString != null) && (!paramString.isEmpty()))
      {
        MediaRoute2Info localMediaRoute2Info = getRouteById(paramString);
        if (localMediaRoute2Info == null)
        {
          z2.A("onAddMemberRoute: Specified route not found. routeId=", paramString, "MR2Provider");
          return;
        }
        mRoutingController.selectRoute(localMediaRoute2Info);
        return;
      }
      Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
    }
    
    public boolean onControlRequest(Intent paramIntent, @Nullable MediaRouter.ControlRequestCallback paramControlRequestCallback)
    {
      Object localObject = mRoutingController;
      int i;
      if ((localObject != null) && (!((MediaRouter2.RoutingController)localObject).isReleased()) && (mServiceMessenger != null))
      {
        i = mNextRequestId.getAndIncrement();
        localObject = Message.obtain();
        what = 9;
        arg1 = i;
        obj = paramIntent;
        replyTo = mReceiveMessenger;
      }
      try
      {
        mServiceMessenger.send((Message)localObject);
        if (paramControlRequestCallback != null) {
          mPendingCallbacks.put(i, paramControlRequestCallback);
        }
        return true;
      }
      catch (RemoteException paramIntent)
      {
        Log.e("MR2Provider", "Could not send control request to service.", paramIntent);
        return false;
      }
      catch (DeadObjectException paramIntent)
      {
        for (;;) {}
      }
    }
    
    public void onRelease()
    {
      mRoutingController.release();
    }
    
    public void onRemoveMemberRoute(String paramString)
    {
      if ((paramString != null) && (!paramString.isEmpty()))
      {
        MediaRoute2Info localMediaRoute2Info = getRouteById(paramString);
        if (localMediaRoute2Info == null)
        {
          z2.A("onRemoveMemberRoute: Specified route not found. routeId=", paramString, "MR2Provider");
          return;
        }
        mRoutingController.deselectRoute(localMediaRoute2Info);
        return;
      }
      Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
    }
    
    public void onSetVolume(int paramInt)
    {
      MediaRouter2.RoutingController localRoutingController = mRoutingController;
      if (localRoutingController == null) {
        return;
      }
      localRoutingController.setVolume(paramInt);
      mOptimisticVolume = paramInt;
      scheduleClearOptimisticVolume();
    }
    
    public void onUpdateMemberRoutes(@Nullable List<String> paramList)
    {
      if ((paramList != null) && (!paramList.isEmpty()))
      {
        String str = (String)paramList.get(0);
        paramList = getRouteById(str);
        if (paramList == null)
        {
          z2.A("onUpdateMemberRoutes: Specified route not found. routeId=", str, "MR2Provider");
          return;
        }
        mMediaRouter2.transferTo(paramList);
        return;
      }
      Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
    }
    
    public void onUpdateVolume(int paramInt)
    {
      MediaRouter2.RoutingController localRoutingController = mRoutingController;
      if (localRoutingController == null) {
        return;
      }
      int i = mOptimisticVolume;
      int j = i;
      if (i < 0) {
        j = localRoutingController.getVolume();
      }
      paramInt = Math.max(0, Math.min(j + paramInt, mRoutingController.getVolumeMax()));
      mOptimisticVolume = paramInt;
      mRoutingController.setVolume(paramInt);
      scheduleClearOptimisticVolume();
    }
    
    public void setGroupRouteDescriptor(@NonNull MediaRouteDescriptor paramMediaRouteDescriptor)
    {
      mGroupRouteDescriptor = paramMediaRouteDescriptor;
    }
    
    public void setMemberRouteVolume(@NonNull String paramString, int paramInt)
    {
      Object localObject = mRoutingController;
      if ((localObject != null) && (!((MediaRouter2.RoutingController)localObject).isReleased()) && (mServiceMessenger != null))
      {
        int i = mNextRequestId.getAndIncrement();
        localObject = Message.obtain();
        what = 7;
        arg1 = i;
        Bundle localBundle = new Bundle();
        localBundle.putInt("volume", paramInt);
        localBundle.putString("routeId", paramString);
        ((Message)localObject).setData(localBundle);
        replyTo = mReceiveMessenger;
      }
      try
      {
        try
        {
          mServiceMessenger.send((Message)localObject);
        }
        catch (RemoteException paramString)
        {
          Log.e("MR2Provider", "Could not send control request to service.", paramString);
        }
        return;
      }
      catch (DeadObjectException paramString)
      {
        for (;;) {}
      }
    }
    
    public void updateMemberRouteVolume(@NonNull String paramString, int paramInt)
    {
      Object localObject = mRoutingController;
      Message localMessage;
      if ((localObject != null) && (!((MediaRouter2.RoutingController)localObject).isReleased()) && (mServiceMessenger != null))
      {
        int i = mNextRequestId.getAndIncrement();
        localMessage = Message.obtain();
        what = 8;
        arg1 = i;
        localObject = new Bundle();
        ((BaseBundle)localObject).putInt("volume", paramInt);
        ((BaseBundle)localObject).putString("routeId", paramString);
        localMessage.setData((Bundle)localObject);
        replyTo = mReceiveMessenger;
      }
      try
      {
        try
        {
          mServiceMessenger.send(localMessage);
        }
        catch (RemoteException paramString)
        {
          Log.e("MR2Provider", "Could not send control request to service.", paramString);
        }
        return;
      }
      catch (DeadObjectException paramString)
      {
        for (;;) {}
      }
    }
    
    public class ReceiveHandler
      extends Handler
    {
      public ReceiveHandler()
      {
        super();
      }
      
      public void handleMessage(Message paramMessage)
      {
        int i = what;
        int j = arg1;
        Object localObject = obj;
        paramMessage = paramMessage.peekData();
        MediaRouter.ControlRequestCallback localControlRequestCallback = (MediaRouter.ControlRequestCallback)mPendingCallbacks.get(j);
        if (localControlRequestCallback == null)
        {
          Log.w("MR2Provider", "Pending callback not found for control request.");
          return;
        }
        mPendingCallbacks.remove(j);
        if (i != 3)
        {
          if (i == 4)
          {
            if (paramMessage == null) {
              paramMessage = null;
            } else {
              paramMessage = paramMessage.getString("error");
            }
            localControlRequestCallback.onError(paramMessage, (Bundle)localObject);
          }
        }
        else {
          localControlRequestCallback.onResult((Bundle)localObject);
        }
      }
    }
  }
  
  public class MemberRouteController
    extends MediaRouteProvider.RouteController
  {
    public final MediaRoute2Provider.GroupRouteController mGroupRouteController;
    public final String mOriginalRouteId;
    
    public MemberRouteController(@Nullable String paramString, MediaRoute2Provider.GroupRouteController paramGroupRouteController)
    {
      mOriginalRouteId = paramString;
      mGroupRouteController = paramGroupRouteController;
    }
    
    public void onSetVolume(int paramInt)
    {
      String str = mOriginalRouteId;
      if (str != null)
      {
        MediaRoute2Provider.GroupRouteController localGroupRouteController = mGroupRouteController;
        if (localGroupRouteController != null) {
          localGroupRouteController.setMemberRouteVolume(str, paramInt);
        }
      }
    }
    
    public void onUpdateVolume(int paramInt)
    {
      String str = mOriginalRouteId;
      if (str != null)
      {
        MediaRoute2Provider.GroupRouteController localGroupRouteController = mGroupRouteController;
        if (localGroupRouteController != null) {
          localGroupRouteController.updateMemberRouteVolume(str, paramInt);
        }
      }
    }
  }
  
  public class RouteCallback
    extends MediaRouter2.RouteCallback
  {
    public RouteCallback() {}
    
    public void onRoutesAdded(@NonNull List<MediaRoute2Info> paramList)
    {
      refreshRoutes();
    }
    
    public void onRoutesChanged(@NonNull List<MediaRoute2Info> paramList)
    {
      refreshRoutes();
    }
    
    public void onRoutesRemoved(@NonNull List<MediaRoute2Info> paramList)
    {
      refreshRoutes();
    }
  }
  
  public class TransferCallback
    extends MediaRouter2.TransferCallback
  {
    public TransferCallback() {}
    
    public void onStop(@NonNull MediaRouter2.RoutingController paramRoutingController)
    {
      Object localObject = (MediaRouteProvider.RouteController)mControllerMap.remove(paramRoutingController);
      if (localObject != null)
      {
        mCallback.onReleaseController((MediaRouteProvider.RouteController)localObject);
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("onStop: No matching routeController found. routingController=");
        ((StringBuilder)localObject).append(paramRoutingController);
        Log.w("MR2Provider", ((StringBuilder)localObject).toString());
      }
    }
    
    public void onTransfer(@NonNull MediaRouter2.RoutingController paramRoutingController1, @NonNull MediaRouter2.RoutingController paramRoutingController2)
    {
      mControllerMap.remove(paramRoutingController1);
      if (paramRoutingController2 == mMediaRouter2.getSystemController())
      {
        mCallback.onSelectFallbackRoute(3);
      }
      else
      {
        paramRoutingController1 = paramRoutingController2.getSelectedRoutes();
        if (paramRoutingController1.isEmpty())
        {
          Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
          return;
        }
        paramRoutingController1 = ((MediaRoute2Info)paramRoutingController1.get(0)).getId();
        MediaRoute2Provider.GroupRouteController localGroupRouteController = new MediaRoute2Provider.GroupRouteController(MediaRoute2Provider.this, paramRoutingController2, paramRoutingController1);
        mControllerMap.put(paramRoutingController2, localGroupRouteController);
        mCallback.onSelectRoute(paramRoutingController1, 3);
        setDynamicRouteDescriptors(paramRoutingController2);
      }
    }
    
    public void onTransferFailure(@NonNull MediaRoute2Info paramMediaRoute2Info)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Transfer failed. requestedRoute=");
      localStringBuilder.append(paramMediaRoute2Info);
      Log.w("MR2Provider", localStringBuilder.toString());
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRoute2Provider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */