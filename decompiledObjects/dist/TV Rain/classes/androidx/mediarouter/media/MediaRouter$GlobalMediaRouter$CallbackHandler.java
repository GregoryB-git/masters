package androidx.mediarouter.media;

import android.os.Handler;
import android.os.Message;
import androidx.core.util.Pair;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class MediaRouter$GlobalMediaRouter$CallbackHandler
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
  
  public MediaRouter$GlobalMediaRouter$CallbackHandler(MediaRouter.GlobalMediaRouter paramGlobalMediaRouter) {}
  
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
          this$0.mSystemProvider.onSyncRouteChanged((MediaRouter.RouteInfo)paramObject);
          break;
        case 258: 
          this$0.mSystemProvider.onSyncRouteRemoved((MediaRouter.RouteInfo)paramObject);
          break;
        case 257: 
          this$0.mSystemProvider.onSyncRouteAdded((MediaRouter.RouteInfo)paramObject);
          break;
        }
      }
      else
      {
        paramObject = (MediaRouter.RouteInfo)second;
        mDynamicGroupRoutes.add(paramObject);
        this$0.mSystemProvider.onSyncRouteAdded((MediaRouter.RouteInfo)paramObject);
        this$0.mSystemProvider.onSyncRouteSelected((MediaRouter.RouteInfo)paramObject);
      }
    }
    else
    {
      paramObject = (MediaRouter.RouteInfo)second;
      this$0.mSystemProvider.onSyncRouteSelected((MediaRouter.RouteInfo)paramObject);
      if ((this$0.mDefaultRoute != null) && (((MediaRouter.RouteInfo)paramObject).isDefaultOrBluetooth()))
      {
        paramObject = mDynamicGroupRoutes.iterator();
        while (((Iterator)paramObject).hasNext())
        {
          MediaRouter.RouteInfo localRouteInfo = (MediaRouter.RouteInfo)((Iterator)paramObject).next();
          this$0.mSystemProvider.onSyncRouteRemoved(localRouteInfo);
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
    if ((i == 259) && (this$0.getSelectedRoute().getId().equals(((MediaRouter.RouteInfo)localObject).getId()))) {
      this$0.updateSelectedRouteIfNeeded(true);
    }
    syncWithSystemProvider(i, localObject);
    try
    {
      int k = this$0.mRouters.size();
      for (;;)
      {
        k--;
        if (k < 0) {
          break;
        }
        paramMessage = (MediaRouter)((WeakReference)this$0.mRouters.get(k)).get();
        if (paramMessage == null) {
          this$0.mRouters.remove(k);
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

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouter.GlobalMediaRouter.CallbackHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */