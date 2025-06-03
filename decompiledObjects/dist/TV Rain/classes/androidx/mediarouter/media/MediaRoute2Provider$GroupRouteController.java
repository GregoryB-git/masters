package androidx.mediarouter.media;

import android.content.Intent;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2.RoutingController;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import z2;

class MediaRoute2Provider$GroupRouteController
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
  
  public MediaRoute2Provider$GroupRouteController(@NonNull MediaRoute2Provider paramMediaRoute2Provider, @NonNull MediaRouter2.RoutingController paramRoutingController, String paramString)
  {
    mRoutingController = paramRoutingController;
    mInitialMemberRouteId = paramString;
    paramMediaRoute2Provider = MediaRoute2Provider.getMessengerFromRoutingController(paramRoutingController);
    mServiceMessenger = paramMediaRoute2Provider;
    if (paramMediaRoute2Provider == null) {
      paramMediaRoute2Provider = null;
    } else {
      paramMediaRoute2Provider = new Messenger(new ReceiveHandler());
    }
    mReceiveMessenger = paramMediaRoute2Provider;
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
      MediaRoute2Info localMediaRoute2Info = this$0.getRouteById(paramString);
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
      MediaRoute2Info localMediaRoute2Info = this$0.getRouteById(paramString);
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
      paramList = this$0.getRouteById(str);
      if (paramList == null)
      {
        z2.A("onUpdateMemberRoutes: Specified route not found. routeId=", str, "MR2Provider");
        return;
      }
      this$0.mMediaRouter2.transferTo(paramList);
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

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRoute2Provider.GroupRouteController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */