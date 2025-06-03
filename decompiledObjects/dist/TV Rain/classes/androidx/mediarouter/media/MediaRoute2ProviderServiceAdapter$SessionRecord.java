package androidx.mediarouter.media;

import android.media.MediaRoute2ProviderService;
import android.media.RoutingSessionInfo;
import android.media.RoutingSessionInfo.Builder;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Messenger;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RequiresApi(api=30)
final class MediaRoute2ProviderServiceAdapter$SessionRecord
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
  
  public MediaRoute2ProviderServiceAdapter$SessionRecord(MediaRoute2ProviderServiceAdapter paramMediaRoute2ProviderServiceAdapter, MediaRouteProvider.DynamicGroupRouteController paramDynamicGroupRouteController, long paramLong, int paramInt)
  {
    this(paramMediaRoute2ProviderServiceAdapter, paramDynamicGroupRouteController, paramLong, paramInt, null);
  }
  
  public MediaRoute2ProviderServiceAdapter$SessionRecord(MediaRoute2ProviderServiceAdapter paramMediaRoute2ProviderServiceAdapter, MediaRouteProvider.DynamicGroupRouteController paramDynamicGroupRouteController, long paramLong, int paramInt, MediaRouteProviderService.MediaRouteProviderServiceImplApi30.ClientRecord paramClientRecord)
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
      paramString2 = this$0.getMediaRouteProvider().onCreateRouteController(paramString1);
    } else {
      paramString2 = this$0.getMediaRouteProvider().onCreateRouteController(paramString1, paramString2);
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
    this$0.notifySessionCreated(mRequestId, mSessionInfo);
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
      this$0.notifySessionReleased(mSessionId);
    }
  }
  
  public void setSessionInfo(@NonNull RoutingSessionInfo paramRoutingSessionInfo)
  {
    if (mSessionInfo != null)
    {
      Log.w("MR2ProviderService", "setSessionInfo: This shouldn't be called after sessionInfo is set");
      return;
    }
    Messenger localMessenger = new Messenger(new MediaRoute2ProviderServiceAdapter.IncomingHandler(this$0, mSessionId));
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
      this$0.onReleaseSession(0L, mSessionId);
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
      this$0.notifySessionUpdated(mSessionInfo);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRoute2ProviderServiceAdapter.SessionRecord
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */