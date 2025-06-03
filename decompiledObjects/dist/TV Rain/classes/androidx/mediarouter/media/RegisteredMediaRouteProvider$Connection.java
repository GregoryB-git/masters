package androidx.mediarouter.media;

import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z2;

final class RegisteredMediaRouteProvider$Connection
  implements IBinder.DeathRecipient
{
  private int mNextControllerId = 1;
  private int mNextRequestId = 1;
  private final SparseArray<MediaRouter.ControlRequestCallback> mPendingCallbacks = new SparseArray();
  private int mPendingRegisterRequestId;
  private final RegisteredMediaRouteProvider.ReceiveHandler mReceiveHandler;
  private final Messenger mReceiveMessenger;
  private final Messenger mServiceMessenger;
  private int mServiceVersion;
  
  public RegisteredMediaRouteProvider$Connection(RegisteredMediaRouteProvider paramRegisteredMediaRouteProvider, Messenger paramMessenger)
  {
    mServiceMessenger = paramMessenger;
    paramRegisteredMediaRouteProvider = new RegisteredMediaRouteProvider.ReceiveHandler(this);
    mReceiveHandler = paramRegisteredMediaRouteProvider;
    mReceiveMessenger = new Messenger(paramRegisteredMediaRouteProvider);
  }
  
  private boolean sendRequest(int paramInt1, int paramInt2, int paramInt3, Object paramObject, Bundle paramBundle)
  {
    Message localMessage = Message.obtain();
    what = paramInt1;
    arg1 = paramInt2;
    arg2 = paramInt3;
    obj = paramObject;
    localMessage.setData(paramBundle);
    replyTo = mReceiveMessenger;
    try
    {
      mServiceMessenger.send(localMessage);
      return true;
    }
    catch (RemoteException paramObject)
    {
      if (paramInt1 != 2) {
        Log.e("MediaRouteProviderProxy", "Could not send message to service.", (Throwable)paramObject);
      }
      return false;
    }
    catch (DeadObjectException paramObject)
    {
      for (;;) {}
    }
  }
  
  public void addMemberRoute(int paramInt, String paramString)
  {
    paramString = z2.d("memberRouteId", paramString);
    int i = mNextRequestId;
    mNextRequestId = (i + 1);
    sendRequest(12, i, paramInt, null, paramString);
  }
  
  public void binderDied()
  {
    this$0.mPrivateHandler.post(new Runnable()
    {
      public void run()
      {
        RegisteredMediaRouteProvider.Connection localConnection = RegisteredMediaRouteProvider.Connection.this;
        this$0.onConnectionDied(localConnection);
      }
    });
  }
  
  public int createDynamicGroupRouteController(String paramString, MediaRouter.ControlRequestCallback paramControlRequestCallback)
  {
    int i = mNextControllerId;
    mNextControllerId = (i + 1);
    int j = mNextRequestId;
    mNextRequestId = (j + 1);
    sendRequest(11, j, i, null, z2.d("memberRouteId", paramString));
    mPendingCallbacks.put(j, paramControlRequestCallback);
    return i;
  }
  
  public int createRouteController(String paramString1, String paramString2)
  {
    int i = mNextControllerId;
    mNextControllerId = (i + 1);
    Bundle localBundle = new Bundle();
    localBundle.putString("routeId", paramString1);
    localBundle.putString("routeGroupId", paramString2);
    int j = mNextRequestId;
    mNextRequestId = (j + 1);
    sendRequest(3, j, i, null, localBundle);
    return i;
  }
  
  public void dispose()
  {
    sendRequest(2, 0, 0, null, null);
    mReceiveHandler.dispose();
    mServiceMessenger.getBinder().unlinkToDeath(this, 0);
    this$0.mPrivateHandler.post(new Runnable()
    {
      public void run()
      {
        failPendingCallbacks();
      }
    });
  }
  
  public void failPendingCallbacks()
  {
    int i = mPendingCallbacks.size();
    for (int j = 0; j < i; j++) {
      ((MediaRouter.ControlRequestCallback)mPendingCallbacks.valueAt(j)).onError(null, null);
    }
    mPendingCallbacks.clear();
  }
  
  public boolean onControlRequestFailed(int paramInt, String paramString, Bundle paramBundle)
  {
    MediaRouter.ControlRequestCallback localControlRequestCallback = (MediaRouter.ControlRequestCallback)mPendingCallbacks.get(paramInt);
    if (localControlRequestCallback != null)
    {
      mPendingCallbacks.remove(paramInt);
      localControlRequestCallback.onError(paramString, paramBundle);
      return true;
    }
    return false;
  }
  
  public boolean onControlRequestSucceeded(int paramInt, Bundle paramBundle)
  {
    MediaRouter.ControlRequestCallback localControlRequestCallback = (MediaRouter.ControlRequestCallback)mPendingCallbacks.get(paramInt);
    if (localControlRequestCallback != null)
    {
      mPendingCallbacks.remove(paramInt);
      localControlRequestCallback.onResult(paramBundle);
      return true;
    }
    return false;
  }
  
  public void onControllerReleasedByProvider(int paramInt)
  {
    this$0.onConnectionControllerReleasedByProvider(this, paramInt);
  }
  
  public boolean onDescriptorChanged(Bundle paramBundle)
  {
    if (mServiceVersion != 0)
    {
      this$0.onConnectionDescriptorChanged(this, MediaRouteProviderDescriptor.fromBundle(paramBundle));
      return true;
    }
    return false;
  }
  
  public void onDynamicGroupRouteControllerCreated(int paramInt, Bundle paramBundle)
  {
    MediaRouter.ControlRequestCallback localControlRequestCallback = (MediaRouter.ControlRequestCallback)mPendingCallbacks.get(paramInt);
    if ((paramBundle != null) && (paramBundle.containsKey("routeId")))
    {
      mPendingCallbacks.remove(paramInt);
      localControlRequestCallback.onResult(paramBundle);
    }
    else
    {
      localControlRequestCallback.onError("DynamicGroupRouteController is created without valid route id.", paramBundle);
    }
  }
  
  public boolean onDynamicRouteDescriptorsChanged(int paramInt, Bundle paramBundle)
  {
    if (mServiceVersion != 0)
    {
      MediaRouteDescriptor localMediaRouteDescriptor = null;
      Object localObject = (Bundle)paramBundle.getParcelable("groupRoute");
      if (localObject != null) {
        localMediaRouteDescriptor = MediaRouteDescriptor.fromBundle((Bundle)localObject);
      }
      localObject = paramBundle.getParcelableArrayList("dynamicRoutes");
      paramBundle = new ArrayList();
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        paramBundle.add(MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor.fromBundle((Bundle)((Iterator)localObject).next()));
      }
      this$0.onDynamicRouteDescriptorChanged(this, paramInt, localMediaRouteDescriptor, paramBundle);
      return true;
    }
    return false;
  }
  
  public boolean onGenericFailure(int paramInt)
  {
    if (paramInt == mPendingRegisterRequestId)
    {
      mPendingRegisterRequestId = 0;
      this$0.onConnectionError(this, "Registration failed");
    }
    MediaRouter.ControlRequestCallback localControlRequestCallback = (MediaRouter.ControlRequestCallback)mPendingCallbacks.get(paramInt);
    if (localControlRequestCallback != null)
    {
      mPendingCallbacks.remove(paramInt);
      localControlRequestCallback.onError(null, null);
    }
    return true;
  }
  
  public boolean onGenericSuccess(int paramInt)
  {
    return true;
  }
  
  public boolean onRegistered(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    if ((mServiceVersion == 0) && (paramInt1 == mPendingRegisterRequestId) && (paramInt2 >= 1))
    {
      mPendingRegisterRequestId = 0;
      mServiceVersion = paramInt2;
      this$0.onConnectionDescriptorChanged(this, MediaRouteProviderDescriptor.fromBundle(paramBundle));
      this$0.onConnectionReady(this);
      return true;
    }
    return false;
  }
  
  public boolean register()
  {
    int i = mNextRequestId;
    mNextRequestId = (i + 1);
    mPendingRegisterRequestId = i;
    if (!sendRequest(1, i, 4, null, null)) {
      return false;
    }
    try
    {
      mServiceMessenger.getBinder().linkToDeath(this, 0);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      binderDied();
    }
    return false;
  }
  
  public void releaseRouteController(int paramInt)
  {
    int i = mNextRequestId;
    mNextRequestId = (i + 1);
    sendRequest(4, i, paramInt, null, null);
  }
  
  public void removeMemberRoute(int paramInt, String paramString)
  {
    paramString = z2.d("memberRouteId", paramString);
    int i = mNextRequestId;
    mNextRequestId = (i + 1);
    sendRequest(13, i, paramInt, null, paramString);
  }
  
  public void selectRoute(int paramInt)
  {
    int i = mNextRequestId;
    mNextRequestId = (i + 1);
    sendRequest(5, i, paramInt, null, null);
  }
  
  public boolean sendControlRequest(int paramInt, Intent paramIntent, MediaRouter.ControlRequestCallback paramControlRequestCallback)
  {
    int i = mNextRequestId;
    mNextRequestId = (i + 1);
    if (sendRequest(9, i, paramInt, paramIntent, null))
    {
      if (paramControlRequestCallback != null) {
        mPendingCallbacks.put(i, paramControlRequestCallback);
      }
      return true;
    }
    return false;
  }
  
  public void setDiscoveryRequest(MediaRouteDiscoveryRequest paramMediaRouteDiscoveryRequest)
  {
    int i = mNextRequestId;
    mNextRequestId = (i + 1);
    if (paramMediaRouteDiscoveryRequest != null) {
      paramMediaRouteDiscoveryRequest = paramMediaRouteDiscoveryRequest.asBundle();
    } else {
      paramMediaRouteDiscoveryRequest = null;
    }
    sendRequest(10, i, 0, paramMediaRouteDiscoveryRequest, null);
  }
  
  public void setVolume(int paramInt1, int paramInt2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("volume", paramInt2);
    paramInt2 = mNextRequestId;
    mNextRequestId = (paramInt2 + 1);
    sendRequest(7, paramInt2, paramInt1, null, localBundle);
  }
  
  public void unselectRoute(int paramInt1, int paramInt2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("unselectReason", paramInt2);
    paramInt2 = mNextRequestId;
    mNextRequestId = (paramInt2 + 1);
    sendRequest(6, paramInt2, paramInt1, null, localBundle);
  }
  
  public void updateMemberRoutes(int paramInt, List<String> paramList)
  {
    Bundle localBundle = new Bundle();
    localBundle.putStringArrayList("memberRouteIds", new ArrayList(paramList));
    int i = mNextRequestId;
    mNextRequestId = (i + 1);
    sendRequest(14, i, paramInt, null, localBundle);
  }
  
  public void updateVolume(int paramInt1, int paramInt2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("volume", paramInt2);
    paramInt2 = mNextRequestId;
    mNextRequestId = (paramInt2 + 1);
    sendRequest(8, paramInt2, paramInt1, null, localBundle);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.RegisteredMediaRouteProvider.Connection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */