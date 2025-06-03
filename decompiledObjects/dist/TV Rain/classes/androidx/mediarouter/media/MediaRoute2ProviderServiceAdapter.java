package androidx.mediarouter.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.MediaRoute2ProviderService;
import android.media.RouteDiscoveryPreference;
import android.media.RoutingSessionInfo;
import android.media.RoutingSessionInfo.Builder;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import z2;

@RequiresApi(api=30)
class MediaRoute2ProviderServiceAdapter
  extends MediaRoute2ProviderService
{
  public static final boolean DEBUG = Log.isLoggable("MR2ProviderService", 3);
  @SuppressLint({"InlinedApi"})
  public static final String SERVICE_INTERFACE = "android.media.MediaRoute2ProviderService";
  private static final String TAG = "MR2ProviderService";
  private final Object mLock = new Object();
  private volatile MediaRouteProviderDescriptor mProviderDescriptor;
  public final MediaRouteProviderService.MediaRouteProviderServiceImplApi30 mServiceImpl;
  public final SparseArray<String> mSessionIdMap = new SparseArray();
  @GuardedBy("mLock")
  public final Map<String, SessionRecord> mSessionRecords = new ArrayMap();
  
  public MediaRoute2ProviderServiceAdapter(MediaRouteProviderService.MediaRouteProviderServiceImplApi30 paramMediaRouteProviderServiceImplApi30)
  {
    mServiceImpl = paramMediaRouteProviderServiceImplApi30;
  }
  
  private String assignSessionId(SessionRecord paramSessionRecord)
  {
    synchronized (mLock)
    {
      String str;
      do
      {
        str = UUID.randomUUID().toString();
      } while (mSessionRecords.containsKey(str));
      mSessionId = str;
      mSessionRecords.put(str, paramSessionRecord);
      return str;
    }
  }
  
  private MediaRouteProvider.RouteController findControllerByRouteId(String paramString)
  {
    Object localObject1 = new ArrayList();
    synchronized (mLock)
    {
      ((ArrayList)localObject1).addAll(mSessionRecords.values());
      localObject1 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        ??? = ((SessionRecord)((Iterator)localObject1).next()).findControllerByRouteId(paramString);
        if (??? != null) {
          return (MediaRouteProvider.RouteController)???;
        }
      }
      return null;
    }
  }
  
  private MediaRouteProvider.DynamicGroupRouteController findControllerBySessionId(String paramString)
  {
    synchronized (mLock)
    {
      paramString = (SessionRecord)mSessionRecords.get(paramString);
      if (paramString == null) {
        paramString = null;
      } else {
        paramString = paramString.getGroupController();
      }
      return paramString;
    }
  }
  
  private SessionRecord findSessionRecordByController(MediaRouteProvider.DynamicGroupRouteController paramDynamicGroupRouteController)
  {
    synchronized (mLock)
    {
      Iterator localIterator = mSessionRecords.entrySet().iterator();
      while (localIterator.hasNext())
      {
        SessionRecord localSessionRecord = (SessionRecord)((Map.Entry)localIterator.next()).getValue();
        if (localSessionRecord.getGroupController() == paramDynamicGroupRouteController) {
          return localSessionRecord;
        }
      }
      return null;
    }
  }
  
  private MediaRouteDescriptor getRouteDescriptor(String paramString1, String paramString2)
  {
    if ((getMediaRouteProvider() != null) && (mProviderDescriptor != null))
    {
      Iterator localIterator = mProviderDescriptor.getRoutes().iterator();
      while (localIterator.hasNext())
      {
        localObject = (MediaRouteDescriptor)localIterator.next();
        if (TextUtils.equals(((MediaRouteDescriptor)localObject).getId(), paramString1)) {
          return (MediaRouteDescriptor)localObject;
        }
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramString2);
      ((StringBuilder)localObject).append(": Couldn't find a route : ");
      ((StringBuilder)localObject).append(paramString1);
      Log.w("MR2ProviderService", ((StringBuilder)localObject).toString());
      return null;
    }
    z2.A(paramString2, ": no provider info", "MR2ProviderService");
    return null;
  }
  
  public void attachBaseContext(Context paramContext)
  {
    super.attachBaseContext(paramContext);
  }
  
  public MediaRouteProvider getMediaRouteProvider()
  {
    MediaRouteProviderService localMediaRouteProviderService = mServiceImpl.getService();
    if (localMediaRouteProviderService == null) {
      return null;
    }
    return localMediaRouteProviderService.getMediaRouteProvider();
  }
  
  public void notifyRouteControllerAdded(MediaRouteProviderService.MediaRouteProviderServiceImplApi30.ClientRecord paramClientRecord, MediaRouteProvider.RouteController paramRouteController, int paramInt, String paramString1, String paramString2)
  {
    MediaRouteDescriptor localMediaRouteDescriptor = getRouteDescriptor(paramString2, "notifyRouteControllerAdded");
    if (localMediaRouteDescriptor == null) {
      return;
    }
    int i = 0;
    if ((paramRouteController instanceof MediaRouteProvider.DynamicGroupRouteController))
    {
      paramRouteController = (MediaRouteProvider.DynamicGroupRouteController)paramRouteController;
      i = 6;
    }
    else
    {
      if (!localMediaRouteDescriptor.getGroupMemberIds().isEmpty()) {
        i = 2;
      }
      paramRouteController = new DynamicGroupRouteControllerProxy(paramString2, paramRouteController);
    }
    paramClientRecord = new SessionRecord(paramRouteController, 0L, i, paramClientRecord);
    mRouteId = paramString2;
    paramRouteController = assignSessionId(paramClientRecord);
    mSessionIdMap.put(paramInt, paramRouteController);
    paramRouteController = new RoutingSessionInfo.Builder(paramRouteController, paramString1).setName(localMediaRouteDescriptor.getName()).setVolumeHandling(localMediaRouteDescriptor.getVolumeHandling()).setVolume(localMediaRouteDescriptor.getVolume()).setVolumeMax(localMediaRouteDescriptor.getVolumeMax());
    if (localMediaRouteDescriptor.getGroupMemberIds().isEmpty())
    {
      paramRouteController.addSelectedRoute(paramString2);
    }
    else
    {
      paramString1 = localMediaRouteDescriptor.getGroupMemberIds().iterator();
      while (paramString1.hasNext()) {
        paramRouteController.addSelectedRoute((String)paramString1.next());
      }
    }
    paramClientRecord.setSessionInfo(paramRouteController.build());
  }
  
  public void notifyRouteControllerRemoved(int paramInt)
  {
    Object localObject1 = (String)mSessionIdMap.get(paramInt);
    if (localObject1 == null) {
      return;
    }
    mSessionIdMap.remove(paramInt);
    synchronized (mLock)
    {
      localObject1 = (SessionRecord)mSessionRecords.remove(localObject1);
      if (localObject1 != null) {
        ((SessionRecord)localObject1).release(false);
      }
      return;
    }
  }
  
  public void onControlRequest(final Messenger paramMessenger, final int paramInt, final String paramString, final Intent paramIntent)
  {
    if (getSessionInfo(paramString) == null)
    {
      Log.w("MR2ProviderService", "onCustomCommand: Couldn't find a session");
      return;
    }
    MediaRouteProvider.DynamicGroupRouteController localDynamicGroupRouteController = findControllerBySessionId(paramString);
    if (localDynamicGroupRouteController == null)
    {
      Log.w("MR2ProviderService", "onControlRequest: Couldn't find a controller");
      notifyRequestFailed(paramInt, 3);
      return;
    }
    localDynamicGroupRouteController.onControlRequest(paramIntent, new MediaRouter.ControlRequestCallback()
    {
      public void onError(String paramAnonymousString, Bundle paramAnonymousBundle)
      {
        if (MediaRoute2ProviderServiceAdapter.DEBUG)
        {
          StringBuilder localStringBuilder = z2.t("Route control request failed, sessionId=");
          localStringBuilder.append(paramString);
          localStringBuilder.append(", intent=");
          localStringBuilder.append(paramIntent);
          localStringBuilder.append(", error=");
          localStringBuilder.append(paramAnonymousString);
          localStringBuilder.append(", data=");
          localStringBuilder.append(paramAnonymousBundle);
          Log.d("MR2ProviderService", localStringBuilder.toString());
        }
        if (paramAnonymousString != null)
        {
          paramAnonymousString = z2.d("error", paramAnonymousString);
          sendReply(paramMessenger, 4, paramInt, 0, paramAnonymousBundle, paramAnonymousString);
        }
        else
        {
          sendReply(paramMessenger, 4, paramInt, 0, paramAnonymousBundle, null);
        }
      }
      
      public void onResult(Bundle paramAnonymousBundle)
      {
        if (MediaRoute2ProviderServiceAdapter.DEBUG)
        {
          StringBuilder localStringBuilder = z2.t("Route control request succeeded, sessionId=");
          localStringBuilder.append(paramString);
          localStringBuilder.append(", intent=");
          localStringBuilder.append(paramIntent);
          localStringBuilder.append(", data=");
          localStringBuilder.append(paramAnonymousBundle);
          Log.d("MR2ProviderService", localStringBuilder.toString());
        }
        sendReply(paramMessenger, 3, paramInt, 0, paramAnonymousBundle, null);
      }
      
      public void sendReply(Messenger paramAnonymousMessenger, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, Object paramAnonymousObject, Bundle paramAnonymousBundle)
      {
        Message localMessage = Message.obtain();
        what = paramAnonymousInt1;
        arg1 = paramAnonymousInt2;
        arg2 = paramAnonymousInt3;
        obj = paramAnonymousObject;
        localMessage.setData(paramAnonymousBundle);
        try
        {
          try
          {
            paramAnonymousMessenger.send(localMessage);
          }
          catch (RemoteException paramAnonymousMessenger)
          {
            Log.e("MR2ProviderService", "Could not send message to the client.", paramAnonymousMessenger);
          }
          return;
        }
        catch (DeadObjectException paramAnonymousMessenger)
        {
          for (;;) {}
        }
      }
    });
  }
  
  public void onCreateSession(long paramLong, @NonNull String paramString1, @NonNull String paramString2, @Nullable Bundle paramBundle)
  {
    paramBundle = getMediaRouteProvider();
    Object localObject1 = getRouteDescriptor(paramString2, "onCreateSession");
    int i = 3;
    if (localObject1 == null)
    {
      notifyRequestFailed(paramLong, 3);
      return;
    }
    if (mProviderDescriptor.supportsDynamicGroupRoute())
    {
      localObject2 = paramBundle.onCreateDynamicGroupRouteController(paramString2);
      i = 7;
      paramBundle = (Bundle)localObject2;
      if (localObject2 == null)
      {
        Log.w("MR2ProviderService", "onCreateSession: Couldn't create a dynamic controller");
        notifyRequestFailed(paramLong, 1);
      }
    }
    else
    {
      paramBundle = paramBundle.onCreateRouteController(paramString2);
      if (paramBundle == null)
      {
        Log.w("MR2ProviderService", "onCreateSession: Couldn't create a controller");
        notifyRequestFailed(paramLong, 1);
        return;
      }
      if (((MediaRouteDescriptor)localObject1).getGroupMemberIds().isEmpty()) {
        i = 1;
      }
      paramBundle = new DynamicGroupRouteControllerProxy(paramString2, paramBundle);
    }
    paramBundle.onSelect();
    Object localObject2 = new SessionRecord(paramBundle, paramLong, i);
    paramString1 = new RoutingSessionInfo.Builder(assignSessionId((SessionRecord)localObject2), paramString1).setName(((MediaRouteDescriptor)localObject1).getName()).setVolumeHandling(((MediaRouteDescriptor)localObject1).getVolumeHandling()).setVolume(((MediaRouteDescriptor)localObject1).getVolume()).setVolumeMax(((MediaRouteDescriptor)localObject1).getVolumeMax());
    if (((MediaRouteDescriptor)localObject1).getGroupMemberIds().isEmpty())
    {
      paramString1.addSelectedRoute(paramString2);
    }
    else
    {
      localObject1 = ((MediaRouteDescriptor)localObject1).getGroupMemberIds().iterator();
      while (((Iterator)localObject1).hasNext()) {
        paramString1.addSelectedRoute((String)((Iterator)localObject1).next());
      }
    }
    paramString1 = paramString1.build();
    ((SessionRecord)localObject2).setSessionInfo(paramString1);
    if ((i & 0x6) == 2) {
      ((SessionRecord)localObject2).updateMemberRouteControllers(paramString2, null, paramString1);
    }
    mServiceImpl.setDynamicRoutesChangedListener(paramBundle);
  }
  
  public void onDeselectRoute(long paramLong, @NonNull String paramString1, @NonNull String paramString2)
  {
    if (getSessionInfo(paramString1) == null)
    {
      Log.w("MR2ProviderService", "onDeselectRoute: Couldn't find a session");
      notifyRequestFailed(paramLong, 4);
      return;
    }
    if (getRouteDescriptor(paramString2, "onDeselectRoute") == null)
    {
      notifyRequestFailed(paramLong, 3);
      return;
    }
    paramString1 = findControllerBySessionId(paramString1);
    if (paramString1 == null)
    {
      Log.w("MR2ProviderService", "onDeselectRoute: Couldn't find a controller");
      notifyRequestFailed(paramLong, 3);
      return;
    }
    paramString1.onRemoveMemberRoute(paramString2);
  }
  
  public void onDiscoveryPreferenceChanged(@NonNull RouteDiscoveryPreference paramRouteDiscoveryPreference)
  {
    mServiceImpl.setBaseDiscoveryRequest(MediaRouter2Utils.toMediaRouteDiscoveryRequest(paramRouteDiscoveryPreference));
  }
  
  public void onReleaseSession(long paramLong, @NonNull String paramString)
  {
    if (getSessionInfo(paramString) == null) {
      return;
    }
    synchronized (mLock)
    {
      paramString = (SessionRecord)mSessionRecords.remove(paramString);
      if (paramString == null)
      {
        Log.w("MR2ProviderService", "onReleaseSession: Couldn't find a session");
        notifyRequestFailed(paramLong, 4);
        return;
      }
      paramString.release(true);
      return;
    }
  }
  
  public void onSelectRoute(long paramLong, @NonNull String paramString1, @NonNull String paramString2)
  {
    if (getSessionInfo(paramString1) == null)
    {
      Log.w("MR2ProviderService", "onSelectRoute: Couldn't find a session");
      notifyRequestFailed(paramLong, 4);
      return;
    }
    if (getRouteDescriptor(paramString2, "onSelectRoute") == null)
    {
      notifyRequestFailed(paramLong, 3);
      return;
    }
    paramString1 = findControllerBySessionId(paramString1);
    if (paramString1 == null)
    {
      Log.w("MR2ProviderService", "onSelectRoute: Couldn't find a controller");
      notifyRequestFailed(paramLong, 3);
      return;
    }
    paramString1.onAddMemberRoute(paramString2);
  }
  
  public void onSetRouteVolume(long paramLong, @NonNull String paramString, int paramInt)
  {
    MediaRouteProvider.RouteController localRouteController = findControllerByRouteId(paramString);
    if (localRouteController == null)
    {
      z2.A("onSetRouteVolume: Couldn't find a controller for routeId=", paramString, "MR2ProviderService");
      notifyRequestFailed(paramLong, 3);
      return;
    }
    localRouteController.onSetVolume(paramInt);
  }
  
  public void onSetSessionVolume(long paramLong, @NonNull String paramString, int paramInt)
  {
    if (getSessionInfo(paramString) == null)
    {
      Log.w("MR2ProviderService", "onSetSessionVolume: Couldn't find a session");
      notifyRequestFailed(paramLong, 4);
      return;
    }
    paramString = findControllerBySessionId(paramString);
    if (paramString == null)
    {
      Log.w("MR2ProviderService", "onSetSessionVolume: Couldn't find a controller");
      notifyRequestFailed(paramLong, 3);
      return;
    }
    paramString.onSetVolume(paramInt);
  }
  
  public void onTransferToRoute(long paramLong, @NonNull String paramString1, @NonNull String paramString2)
  {
    if (getSessionInfo(paramString1) == null)
    {
      Log.w("MR2ProviderService", "onTransferToRoute: Couldn't find a session");
      notifyRequestFailed(paramLong, 4);
      return;
    }
    if (getRouteDescriptor(paramString2, "onTransferToRoute") == null)
    {
      notifyRequestFailed(paramLong, 3);
      return;
    }
    paramString1 = findControllerBySessionId(paramString1);
    if (paramString1 == null)
    {
      Log.w("MR2ProviderService", "onTransferToRoute: Couldn't find a controller");
      notifyRequestFailed(paramLong, 3);
      return;
    }
    paramString1.onUpdateMemberRoutes(Collections.singletonList(paramString2));
  }
  
  public void setDynamicRouteDescriptor(MediaRouteProvider.DynamicGroupRouteController paramDynamicGroupRouteController, MediaRouteDescriptor paramMediaRouteDescriptor, Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> paramCollection)
  {
    paramDynamicGroupRouteController = findSessionRecordByController(paramDynamicGroupRouteController);
    if (paramDynamicGroupRouteController == null)
    {
      Log.w("MR2ProviderService", "setDynamicRouteDescriptor: Ignoring unknown controller");
      return;
    }
    paramDynamicGroupRouteController.updateSessionInfo(paramMediaRouteDescriptor, paramCollection);
  }
  
  public void setProviderDescriptor(@Nullable MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
  {
    mProviderDescriptor = paramMediaRouteProviderDescriptor;
    if (paramMediaRouteProviderDescriptor == null) {
      paramMediaRouteProviderDescriptor = Collections.emptyList();
    } else {
      paramMediaRouteProviderDescriptor = paramMediaRouteProviderDescriptor.getRoutes();
    }
    Object localObject = new ArrayMap();
    Iterator localIterator = paramMediaRouteProviderDescriptor.iterator();
    while (localIterator.hasNext())
    {
      paramMediaRouteProviderDescriptor = (MediaRouteDescriptor)localIterator.next();
      if (paramMediaRouteProviderDescriptor != null) {
        ((Map)localObject).put(paramMediaRouteProviderDescriptor.getId(), paramMediaRouteProviderDescriptor);
      }
    }
    updateStaticSessions((Map)localObject);
    paramMediaRouteProviderDescriptor = new ArrayList();
    localIterator = ((Map)localObject).values().iterator();
    while (localIterator.hasNext())
    {
      localObject = MediaRouter2Utils.toFwkMediaRoute2Info((MediaRouteDescriptor)localIterator.next());
      if (localObject != null) {
        paramMediaRouteProviderDescriptor.add(localObject);
      }
    }
    notifyRoutes(paramMediaRouteProviderDescriptor);
  }
  
  public void setRouteVolume(@NonNull String paramString, int paramInt)
  {
    MediaRouteProvider.RouteController localRouteController = findControllerByRouteId(paramString);
    if (localRouteController == null)
    {
      z2.A("setRouteVolume: Couldn't find a controller for routeId=", paramString, "MR2ProviderService");
      return;
    }
    localRouteController.onSetVolume(paramInt);
  }
  
  public void updateRouteVolume(@NonNull String paramString, int paramInt)
  {
    MediaRouteProvider.RouteController localRouteController = findControllerByRouteId(paramString);
    if (localRouteController == null)
    {
      z2.A("updateRouteVolume: Couldn't find a controller for routeId=", paramString, "MR2ProviderService");
      return;
    }
    localRouteController.onUpdateVolume(paramInt);
  }
  
  public void updateStaticSessions(Map<String, MediaRouteDescriptor> paramMap)
  {
    Object localObject1 = new ArrayList();
    synchronized (mLock)
    {
      Iterator localIterator = mSessionRecords.values().iterator();
      while (localIterator.hasNext())
      {
        localObject3 = (SessionRecord)localIterator.next();
        if ((((SessionRecord)localObject3).getFlags() & 0x4) == 0) {
          ((ArrayList)localObject1).add(localObject3);
        }
      }
      Object localObject3 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject1 = (SessionRecord)((Iterator)localObject3).next();
        ??? = (DynamicGroupRouteControllerProxy)((SessionRecord)localObject1).getGroupController();
        if (paramMap.containsKey(((DynamicGroupRouteControllerProxy)???).getRouteId())) {
          ((SessionRecord)localObject1).updateSessionInfo((MediaRouteDescriptor)paramMap.get(((DynamicGroupRouteControllerProxy)???).getRouteId()), null);
        }
      }
      return;
    }
  }
  
  public static class DynamicGroupRouteControllerProxy
    extends MediaRouteProvider.DynamicGroupRouteController
  {
    public final MediaRouteProvider.RouteController mRouteController;
    private final String mRouteId;
    
    public DynamicGroupRouteControllerProxy(String paramString, MediaRouteProvider.RouteController paramRouteController)
    {
      mRouteId = paramString;
      mRouteController = paramRouteController;
    }
    
    public String getRouteId()
    {
      return mRouteId;
    }
    
    public void onAddMemberRoute(@NonNull String paramString) {}
    
    public boolean onControlRequest(@NonNull Intent paramIntent, MediaRouter.ControlRequestCallback paramControlRequestCallback)
    {
      return mRouteController.onControlRequest(paramIntent, paramControlRequestCallback);
    }
    
    public void onRelease()
    {
      mRouteController.onRelease();
    }
    
    public void onRemoveMemberRoute(@NonNull String paramString) {}
    
    public void onSelect()
    {
      mRouteController.onSelect();
    }
    
    public void onSetVolume(int paramInt)
    {
      mRouteController.onSetVolume(paramInt);
    }
    
    public void onUnselect(int paramInt)
    {
      mRouteController.onUnselect(paramInt);
    }
    
    public void onUpdateMemberRoutes(@Nullable List<String> paramList) {}
    
    public void onUpdateVolume(int paramInt)
    {
      mRouteController.onUpdateVolume(paramInt);
    }
  }
  
  public static class IncomingHandler
    extends Handler
  {
    private final MediaRoute2ProviderServiceAdapter mServiceAdapter;
    private final String mSessionId;
    
    public IncomingHandler(MediaRoute2ProviderServiceAdapter paramMediaRoute2ProviderServiceAdapter, String paramString)
    {
      super();
      mServiceAdapter = paramMediaRoute2ProviderServiceAdapter;
      mSessionId = paramString;
    }
    
    public void handleMessage(Message paramMessage)
    {
      Messenger localMessenger = replyTo;
      int i = what;
      int j = arg1;
      Object localObject = obj;
      paramMessage = paramMessage.getData();
      if (i != 7)
      {
        if (i != 8)
        {
          if ((i == 9) && ((localObject instanceof Intent))) {
            mServiceAdapter.onControlRequest(localMessenger, j, mSessionId, (Intent)localObject);
          }
        }
        else
        {
          j = paramMessage.getInt("volume", 0);
          paramMessage = paramMessage.getString("routeId");
          if ((j != 0) && (paramMessage != null)) {
            mServiceAdapter.updateRouteVolume(paramMessage, j);
          }
        }
      }
      else
      {
        j = paramMessage.getInt("volume", -1);
        paramMessage = paramMessage.getString("routeId");
        if ((j >= 0) && (paramMessage != null)) {
          mServiceAdapter.setRouteVolume(paramMessage, j);
        }
      }
    }
  }
  
  @RequiresApi(api=30)
  public final class SessionRecord
  {
    public static final int SESSION_FLAG_DYNAMIC = 4;
    public static final int SESSION_FLAG_GROUP = 2;
    public static final int SESSION_FLAG_MR2 = 1;
    private final WeakReference<MediaRouteProviderService.MediaRouteProviderServiceImplApi30.ClientRecord> mClientRecord;
    private final MediaRouteProvider.DynamicGroupRouteController mController;
    private final int mFlags;
    private boolean mIsCreated = false;
    private boolean mIsReleased;
    private final long mRequestId;
    public String mRouteId;
    private final Map<String, MediaRouteProvider.RouteController> mRouteIdToControllerMap = new ArrayMap();
    public String mSessionId;
    private RoutingSessionInfo mSessionInfo;
    
    public SessionRecord(MediaRouteProvider.DynamicGroupRouteController paramDynamicGroupRouteController, long paramLong, int paramInt)
    {
      this(paramDynamicGroupRouteController, paramLong, paramInt, null);
    }
    
    public SessionRecord(MediaRouteProvider.DynamicGroupRouteController paramDynamicGroupRouteController, long paramLong, int paramInt, MediaRouteProviderService.MediaRouteProviderServiceImplApi30.ClientRecord paramClientRecord)
    {
      mController = paramDynamicGroupRouteController;
      mRequestId = paramLong;
      mFlags = paramInt;
      mClientRecord = new WeakReference(paramClientRecord);
    }
    
    private MediaRouteProvider.RouteController getOrCreateRouteController(String paramString1, String paramString2)
    {
      MediaRouteProvider.RouteController localRouteController = (MediaRouteProvider.RouteController)mRouteIdToControllerMap.get(paramString1);
      if (localRouteController != null) {
        return localRouteController;
      }
      if (paramString2 == null) {
        paramString2 = getMediaRouteProvider().onCreateRouteController(paramString1);
      } else {
        paramString2 = getMediaRouteProvider().onCreateRouteController(paramString1, paramString2);
      }
      if (paramString2 != null) {
        mRouteIdToControllerMap.put(paramString1, paramString2);
      }
      return paramString2;
    }
    
    private void notifySessionCreated()
    {
      if (mIsCreated)
      {
        Log.w("MR2ProviderService", "notifySessionCreated: Routing session is already created.");
        return;
      }
      mIsCreated = true;
      notifySessionCreated(mRequestId, mSessionInfo);
    }
    
    private boolean releaseRouteControllerByRouteId(String paramString)
    {
      paramString = (MediaRouteProvider.RouteController)mRouteIdToControllerMap.remove(paramString);
      if (paramString != null)
      {
        paramString.onUnselect(0);
        paramString.onRelease();
        return true;
      }
      return false;
    }
    
    public MediaRouteProvider.RouteController findControllerByRouteId(String paramString)
    {
      MediaRouteProviderService.MediaRouteProviderServiceImplApi30.ClientRecord localClientRecord = (MediaRouteProviderService.MediaRouteProviderServiceImplApi30.ClientRecord)mClientRecord.get();
      if (localClientRecord != null) {
        return localClientRecord.findControllerByRouteId(paramString);
      }
      return (MediaRouteProvider.RouteController)mRouteIdToControllerMap.get(paramString);
    }
    
    public int getFlags()
    {
      return mFlags;
    }
    
    public MediaRouteProvider.DynamicGroupRouteController getGroupController()
    {
      return mController;
    }
    
    public void release(boolean paramBoolean)
    {
      if (!mIsReleased)
      {
        if ((mFlags & 0x3) == 3) {
          updateMemberRouteControllers(null, mSessionInfo, null);
        }
        if (paramBoolean)
        {
          mController.onUnselect(2);
          mController.onRelease();
          if ((mFlags & 0x1) == 0)
          {
            MediaRouteProviderService.MediaRouteProviderServiceImplApi30.ClientRecord localClientRecord = (MediaRouteProviderService.MediaRouteProviderServiceImplApi30.ClientRecord)mClientRecord.get();
            if (localClientRecord != null)
            {
              MediaRouteProvider.DynamicGroupRouteController localDynamicGroupRouteController = mController;
              Object localObject = localDynamicGroupRouteController;
              if ((localDynamicGroupRouteController instanceof MediaRoute2ProviderServiceAdapter.DynamicGroupRouteControllerProxy)) {
                localObject = mRouteController;
              }
              localClientRecord.releaseControllerByProvider((MediaRouteProvider.RouteController)localObject, mRouteId);
            }
          }
        }
        mIsReleased = true;
        notifySessionReleased(mSessionId);
      }
    }
    
    public void setSessionInfo(@NonNull RoutingSessionInfo paramRoutingSessionInfo)
    {
      if (mSessionInfo != null)
      {
        Log.w("MR2ProviderService", "setSessionInfo: This shouldn't be called after sessionInfo is set");
        return;
      }
      Messenger localMessenger = new Messenger(new MediaRoute2ProviderServiceAdapter.IncomingHandler(MediaRoute2ProviderServiceAdapter.this, mSessionId));
      RoutingSessionInfo.Builder localBuilder = new RoutingSessionInfo.Builder(paramRoutingSessionInfo);
      Bundle localBundle = new Bundle();
      localBundle.putParcelable("androidx.mediarouter.media.KEY_MESSENGER", localMessenger);
      if (paramRoutingSessionInfo.getName() != null) {
        paramRoutingSessionInfo = paramRoutingSessionInfo.getName().toString();
      } else {
        paramRoutingSessionInfo = null;
      }
      localBundle.putString("androidx.mediarouter.media.KEY_SESSION_NAME", paramRoutingSessionInfo);
      mSessionInfo = localBuilder.setControlHints(localBundle).build();
    }
    
    public void updateMemberRouteControllers(String paramString, RoutingSessionInfo paramRoutingSessionInfo1, RoutingSessionInfo paramRoutingSessionInfo2)
    {
      if (paramRoutingSessionInfo1 == null) {
        paramRoutingSessionInfo1 = Collections.emptyList();
      } else {
        paramRoutingSessionInfo1 = paramRoutingSessionInfo1.getSelectedRoutes();
      }
      if (paramRoutingSessionInfo2 == null) {
        paramRoutingSessionInfo2 = Collections.emptyList();
      } else {
        paramRoutingSessionInfo2 = paramRoutingSessionInfo2.getSelectedRoutes();
      }
      Iterator localIterator = paramRoutingSessionInfo2.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (findControllerByRouteId(str) == null) {
          getOrCreateRouteController(str, paramString).onSelect();
        }
      }
      paramRoutingSessionInfo1 = paramRoutingSessionInfo1.iterator();
      while (paramRoutingSessionInfo1.hasNext())
      {
        paramString = (String)paramRoutingSessionInfo1.next();
        if (!paramRoutingSessionInfo2.contains(paramString)) {
          releaseRouteControllerByRouteId(paramString);
        }
      }
    }
    
    public void updateSessionInfo(@Nullable MediaRouteDescriptor paramMediaRouteDescriptor, @Nullable Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> paramCollection)
    {
      RoutingSessionInfo localRoutingSessionInfo = mSessionInfo;
      if (localRoutingSessionInfo == null)
      {
        Log.w("MR2ProviderService", "updateSessionInfo: mSessionInfo is null. This shouldn't happen.");
        return;
      }
      if ((paramMediaRouteDescriptor != null) && (!paramMediaRouteDescriptor.isEnabled()))
      {
        onReleaseSession(0L, mSessionId);
        return;
      }
      RoutingSessionInfo.Builder localBuilder = new RoutingSessionInfo.Builder(localRoutingSessionInfo);
      Object localObject1;
      Object localObject2;
      if (paramMediaRouteDescriptor != null)
      {
        mRouteId = paramMediaRouteDescriptor.getId();
        localBuilder.setName(paramMediaRouteDescriptor.getName()).setVolume(paramMediaRouteDescriptor.getVolume()).setVolumeMax(paramMediaRouteDescriptor.getVolumeMax()).setVolumeHandling(paramMediaRouteDescriptor.getVolumeHandling());
        localBuilder.clearSelectedRoutes();
        if (paramMediaRouteDescriptor.getGroupMemberIds().isEmpty())
        {
          localBuilder.addSelectedRoute(mRouteId);
        }
        else
        {
          localObject1 = paramMediaRouteDescriptor.getGroupMemberIds().iterator();
          while (((Iterator)localObject1).hasNext()) {
            localBuilder.addSelectedRoute((String)((Iterator)localObject1).next());
          }
        }
        localObject2 = localRoutingSessionInfo.getControlHints();
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          Log.w("MR2ProviderService", "updateSessionInfo: controlHints is null. This shouldn't happen.");
          localObject1 = new Bundle();
        }
        ((BaseBundle)localObject1).putString("androidx.mediarouter.media.KEY_SESSION_NAME", paramMediaRouteDescriptor.getName());
        ((Bundle)localObject1).putBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE", paramMediaRouteDescriptor.asBundle());
        localBuilder.setControlHints((Bundle)localObject1);
      }
      mSessionInfo = localBuilder.build();
      if ((paramCollection != null) && (!paramCollection.isEmpty()))
      {
        int i = 0;
        localBuilder.clearSelectedRoutes();
        localBuilder.clearSelectableRoutes();
        localBuilder.clearDeselectableRoutes();
        localBuilder.clearTransferableRoutes();
        localObject1 = paramCollection.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          paramCollection = (MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor)((Iterator)localObject1).next();
          localObject2 = paramCollection.getRouteDescriptor().getId();
          int j = mSelectionState;
          int k;
          if (j != 2)
          {
            k = i;
            if (j != 3) {}
          }
          else
          {
            localBuilder.addSelectedRoute((String)localObject2);
            k = 1;
          }
          if (paramCollection.isGroupable()) {
            localBuilder.addSelectableRoute((String)localObject2);
          }
          if (paramCollection.isUnselectable()) {
            localBuilder.addDeselectableRoute((String)localObject2);
          }
          i = k;
          if (paramCollection.isTransferable())
          {
            localBuilder.addTransferableRoute((String)localObject2);
            i = k;
          }
        }
        if (i != 0) {
          mSessionInfo = localBuilder.build();
        }
      }
      if (MediaRoute2ProviderServiceAdapter.DEBUG)
      {
        paramCollection = new StringBuilder();
        paramCollection.append("updateSessionInfo: groupRoute=");
        paramCollection.append(paramMediaRouteDescriptor);
        paramCollection.append(", sessionInfo=");
        paramCollection.append(mSessionInfo);
        Log.d("MR2ProviderService", paramCollection.toString());
      }
      if (((mFlags & 0x5) == 5) && (paramMediaRouteDescriptor != null)) {
        updateMemberRouteControllers(paramMediaRouteDescriptor.getId(), localRoutingSessionInfo, mSessionInfo);
      }
      if (!mIsCreated) {
        notifySessionCreated();
      } else {
        notifySessionUpdated(mSessionInfo);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRoute2ProviderServiceAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */