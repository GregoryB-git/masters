package androidx.mediarouter.media;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.util.ObjectsCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class MediaRouteProviderService$MediaRouteProviderServiceImplBase$ClientRecord
  implements IBinder.DeathRecipient
{
  public final SparseArray<MediaRouteProvider.RouteController> mControllers = new SparseArray();
  public MediaRouteDiscoveryRequest mDiscoveryRequest;
  public long mDiscoveryRequestTimestamp;
  public final MediaRouteProvider.DynamicGroupRouteController.OnDynamicRoutesChangedListener mDynamicRoutesChangedListener = new MediaRouteProvider.DynamicGroupRouteController.OnDynamicRoutesChangedListener()
  {
    public void onRoutesChanged(@NonNull MediaRouteProvider.DynamicGroupRouteController paramAnonymousDynamicGroupRouteController, @NonNull MediaRouteDescriptor paramAnonymousMediaRouteDescriptor, @NonNull Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> paramAnonymousCollection)
    {
      sendDynamicRouteDescriptors(paramAnonymousDynamicGroupRouteController, paramAnonymousMediaRouteDescriptor, paramAnonymousCollection);
    }
  };
  public final Messenger mMessenger;
  public final String mPackageName;
  public final int mVersion;
  
  public MediaRouteProviderService$MediaRouteProviderServiceImplBase$ClientRecord(MediaRouteProviderService.MediaRouteProviderServiceImplBase paramMediaRouteProviderServiceImplBase, Messenger paramMessenger, int paramInt, String paramString)
  {
    mMessenger = paramMessenger;
    mVersion = paramInt;
    mPackageName = paramString;
  }
  
  public void binderDied()
  {
    this$0.mService.mPrivateHandler.obtainMessage(1, mMessenger).sendToTarget();
  }
  
  public Bundle createDescriptorBundle(MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
  {
    return MediaRouteProviderService.createDescriptorBundleForClientVersion(paramMediaRouteProviderDescriptor, mVersion);
  }
  
  public Bundle createDynamicGroupRouteController(String paramString, int paramInt)
  {
    if (mControllers.indexOfKey(paramInt) < 0)
    {
      paramString = this$0.mService.getMediaRouteProvider().onCreateDynamicGroupRouteController(paramString);
      if (paramString != null)
      {
        paramString.setOnDynamicRoutesChangedListener(ContextCompat.getMainExecutor(this$0.mService.getApplicationContext()), mDynamicRoutesChangedListener);
        mControllers.put(paramInt, paramString);
        Bundle localBundle = new Bundle();
        localBundle.putString("groupableTitle", paramString.getGroupableSelectionTitle());
        localBundle.putString("transferableTitle", paramString.getTransferableSectionTitle());
        return localBundle;
      }
    }
    return null;
  }
  
  public boolean createRouteController(String paramString1, String paramString2, int paramInt)
  {
    if (mControllers.indexOfKey(paramInt) < 0)
    {
      if (paramString2 == null) {
        paramString1 = this$0.mService.getMediaRouteProvider().onCreateRouteController(paramString1);
      } else {
        paramString1 = this$0.mService.getMediaRouteProvider().onCreateRouteController(paramString1, paramString2);
      }
      if (paramString1 != null)
      {
        mControllers.put(paramInt, paramString1);
        return true;
      }
    }
    return false;
  }
  
  public void dispose()
  {
    int i = mControllers.size();
    for (int j = 0; j < i; j++) {
      ((MediaRouteProvider.RouteController)mControllers.valueAt(j)).onRelease();
    }
    mControllers.clear();
    mMessenger.getBinder().unlinkToDeath(this, 0);
    setDiscoveryRequest(null);
  }
  
  public MediaRouteProvider.RouteController getRouteController(int paramInt)
  {
    return (MediaRouteProvider.RouteController)mControllers.get(paramInt);
  }
  
  public boolean hasMessenger(Messenger paramMessenger)
  {
    boolean bool;
    if (mMessenger.getBinder() == paramMessenger.getBinder()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean register()
  {
    try
    {
      mMessenger.getBinder().linkToDeath(this, 0);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      binderDied();
    }
    return false;
  }
  
  public boolean releaseRouteController(int paramInt)
  {
    MediaRouteProvider.RouteController localRouteController = (MediaRouteProvider.RouteController)mControllers.get(paramInt);
    if (localRouteController != null)
    {
      mControllers.remove(paramInt);
      localRouteController.onRelease();
      return true;
    }
    return false;
  }
  
  public void sendDynamicRouteDescriptors(MediaRouteProvider.DynamicGroupRouteController paramDynamicGroupRouteController, MediaRouteDescriptor paramMediaRouteDescriptor, Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> paramCollection)
  {
    int i = mControllers.indexOfValue(paramDynamicGroupRouteController);
    if (i < 0)
    {
      paramMediaRouteDescriptor = new StringBuilder();
      paramMediaRouteDescriptor.append("Ignoring unknown dynamic group route controller: ");
      paramMediaRouteDescriptor.append(paramDynamicGroupRouteController);
      Log.w("MediaRouteProviderSrv", paramMediaRouteDescriptor.toString());
      return;
    }
    i = mControllers.keyAt(i);
    paramDynamicGroupRouteController = new ArrayList();
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      paramDynamicGroupRouteController.add(((MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor)paramCollection.next()).toBundle());
    }
    paramCollection = new Bundle();
    if (paramMediaRouteDescriptor != null) {
      paramCollection.putParcelable("groupRoute", paramMediaRouteDescriptor.asBundle());
    }
    paramCollection.putParcelableArrayList("dynamicRoutes", paramDynamicGroupRouteController);
    MediaRouteProviderService.sendMessage(mMessenger, 7, 0, i, paramCollection, null);
  }
  
  public boolean setDiscoveryRequest(MediaRouteDiscoveryRequest paramMediaRouteDiscoveryRequest)
  {
    long l = SystemClock.elapsedRealtime();
    if (!ObjectsCompat.equals(mDiscoveryRequest, paramMediaRouteDiscoveryRequest))
    {
      mDiscoveryRequest = paramMediaRouteDiscoveryRequest;
      mDiscoveryRequestTimestamp = l;
      return this$0.updateCompositeDiscoveryRequest();
    }
    return false;
  }
  
  public String toString()
  {
    return MediaRouteProviderService.getClientId(mMessenger);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouteProviderService.MediaRouteProviderServiceImplBase.ClientRecord
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */