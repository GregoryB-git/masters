package androidx.mediarouter.media;

import android.content.Context;
import android.content.Intent;
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
import java.util.List;
import z2;

class MediaRouteProviderService$MediaRouteProviderServiceImplBase
  implements MediaRouteProviderService.MediaRouteProviderServiceImpl
{
  private final MediaRouterActiveScanThrottlingHelper mActiveScanThrottlingHelper = new MediaRouterActiveScanThrottlingHelper(new Runnable()
  {
    public void run()
    {
      updateCompositeDiscoveryRequest();
    }
  });
  public MediaRouteDiscoveryRequest mBaseDiscoveryRequest;
  public long mBaseDiscoveryRequestTimestamp;
  public final ArrayList<ClientRecord> mClients = new ArrayList();
  public MediaRouteDiscoveryRequest mCompositeDiscoveryRequest;
  public final MediaRouteProviderService mService;
  
  public MediaRouteProviderService$MediaRouteProviderServiceImplBase(MediaRouteProviderService paramMediaRouteProviderService)
  {
    mService = paramMediaRouteProviderService;
  }
  
  private ClientRecord getClient(Messenger paramMessenger)
  {
    int i = findClient(paramMessenger);
    if (i >= 0) {
      paramMessenger = (ClientRecord)mClients.get(i);
    } else {
      paramMessenger = null;
    }
    return paramMessenger;
  }
  
  public void attachBaseContext(Context paramContext) {}
  
  public ClientRecord createClientRecord(Messenger paramMessenger, int paramInt, String paramString)
  {
    return new ClientRecord(paramMessenger, paramInt, paramString);
  }
  
  public int findClient(Messenger paramMessenger)
  {
    int i = mClients.size();
    for (int j = 0; j < i; j++) {
      if (((ClientRecord)mClients.get(j)).hasMessenger(paramMessenger)) {
        return j;
      }
    }
    return -1;
  }
  
  public MediaRouteProvider.Callback getProviderCallback()
  {
    return new ProviderCallbackBase();
  }
  
  public MediaRouteProviderService getService()
  {
    return mService;
  }
  
  public boolean onAddMemberRoute(Messenger paramMessenger, int paramInt1, int paramInt2, String paramString)
  {
    ClientRecord localClientRecord = getClient(paramMessenger);
    if (localClientRecord != null)
    {
      Object localObject = localClientRecord.getRouteController(paramInt2);
      if ((localObject instanceof MediaRouteProvider.DynamicGroupRouteController))
      {
        ((MediaRouteProvider.DynamicGroupRouteController)localObject).onAddMemberRoute(paramString);
        if (MediaRouteProviderService.DEBUG)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append(localClientRecord);
          ((StringBuilder)localObject).append(": Added a member route, controllerId=");
          ((StringBuilder)localObject).append(paramInt2);
          ((StringBuilder)localObject).append(", memberId=");
          ((StringBuilder)localObject).append(paramString);
          Log.d("MediaRouteProviderSrv", ((StringBuilder)localObject).toString());
        }
        MediaRouteProviderService.sendGenericSuccess(paramMessenger, paramInt1);
        return true;
      }
    }
    return false;
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    if (paramIntent.getAction().equals("android.media.MediaRouteProviderService"))
    {
      mService.ensureProvider();
      if (mService.getMediaRouteProvider() != null) {
        return mService.mReceiveMessenger.getBinder();
      }
    }
    return null;
  }
  
  public void onBinderDied(Messenger paramMessenger)
  {
    int i = findClient(paramMessenger);
    if (i >= 0)
    {
      ClientRecord localClientRecord = (ClientRecord)mClients.remove(i);
      if (MediaRouteProviderService.DEBUG)
      {
        paramMessenger = new StringBuilder();
        paramMessenger.append(localClientRecord);
        paramMessenger.append(": Binder died");
        Log.d("MediaRouteProviderSrv", paramMessenger.toString());
      }
      localClientRecord.dispose();
    }
  }
  
  public boolean onCreateDynamicGroupRouteController(Messenger paramMessenger, int paramInt1, int paramInt2, String paramString)
  {
    ClientRecord localClientRecord = getClient(paramMessenger);
    if (localClientRecord != null)
    {
      Bundle localBundle = localClientRecord.createDynamicGroupRouteController(paramString, paramInt2);
      if (localBundle != null)
      {
        if (MediaRouteProviderService.DEBUG)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append(localClientRecord);
          localStringBuilder.append(": Route controller created, controllerId=");
          localStringBuilder.append(paramInt2);
          localStringBuilder.append(", initialMemberRouteId=");
          localStringBuilder.append(paramString);
          Log.d("MediaRouteProviderSrv", localStringBuilder.toString());
        }
        MediaRouteProviderService.sendMessage(paramMessenger, 6, paramInt1, 3, localBundle, null);
        return true;
      }
    }
    return false;
  }
  
  public boolean onCreateRouteController(Messenger paramMessenger, int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    ClientRecord localClientRecord = getClient(paramMessenger);
    if ((localClientRecord != null) && (localClientRecord.createRouteController(paramString1, paramString2, paramInt2)))
    {
      if (MediaRouteProviderService.DEBUG)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(localClientRecord);
        localStringBuilder.append(": Route controller created, controllerId=");
        localStringBuilder.append(paramInt2);
        localStringBuilder.append(", routeId=");
        localStringBuilder.append(paramString1);
        localStringBuilder.append(", routeGroupId=");
        localStringBuilder.append(paramString2);
        Log.d("MediaRouteProviderSrv", localStringBuilder.toString());
      }
      MediaRouteProviderService.sendGenericSuccess(paramMessenger, paramInt1);
      return true;
    }
    return false;
  }
  
  public boolean onRegisterClient(Messenger paramMessenger, int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt2 >= 1) && (findClient(paramMessenger) < 0))
    {
      ClientRecord localClientRecord = createClientRecord(paramMessenger, paramInt2, paramString);
      if (localClientRecord.register())
      {
        mClients.add(localClientRecord);
        if (MediaRouteProviderService.DEBUG)
        {
          paramString = new StringBuilder();
          paramString.append(localClientRecord);
          paramString.append(": Registered, version=");
          paramString.append(paramInt2);
          Log.d("MediaRouteProviderSrv", paramString.toString());
        }
        if (paramInt1 != 0) {
          MediaRouteProviderService.sendMessage(paramMessenger, 2, paramInt1, 3, MediaRouteProviderService.createDescriptorBundleForClientVersion(mService.getMediaRouteProvider().getDescriptor(), mVersion), null);
        }
        return true;
      }
    }
    return false;
  }
  
  public boolean onReleaseRouteController(Messenger paramMessenger, int paramInt1, int paramInt2)
  {
    ClientRecord localClientRecord = getClient(paramMessenger);
    if ((localClientRecord != null) && (localClientRecord.releaseRouteController(paramInt2)))
    {
      if (MediaRouteProviderService.DEBUG)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(localClientRecord);
        localStringBuilder.append(": Route controller released, controllerId=");
        localStringBuilder.append(paramInt2);
        Log.d("MediaRouteProviderSrv", localStringBuilder.toString());
      }
      MediaRouteProviderService.sendGenericSuccess(paramMessenger, paramInt1);
      return true;
    }
    return false;
  }
  
  public boolean onRemoveMemberRoute(Messenger paramMessenger, int paramInt1, int paramInt2, String paramString)
  {
    ClientRecord localClientRecord = getClient(paramMessenger);
    if (localClientRecord != null)
    {
      Object localObject = localClientRecord.getRouteController(paramInt2);
      if ((localObject instanceof MediaRouteProvider.DynamicGroupRouteController))
      {
        ((MediaRouteProvider.DynamicGroupRouteController)localObject).onRemoveMemberRoute(paramString);
        if (MediaRouteProviderService.DEBUG)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append(localClientRecord);
          ((StringBuilder)localObject).append(": Removed a member route, controllerId=");
          ((StringBuilder)localObject).append(paramInt2);
          ((StringBuilder)localObject).append(", memberId=");
          ((StringBuilder)localObject).append(paramString);
          Log.d("MediaRouteProviderSrv", ((StringBuilder)localObject).toString());
        }
        MediaRouteProviderService.sendGenericSuccess(paramMessenger, paramInt1);
        return true;
      }
    }
    return false;
  }
  
  public boolean onRouteControlRequest(final Messenger paramMessenger, final int paramInt1, final int paramInt2, final Intent paramIntent)
  {
    final ClientRecord localClientRecord = getClient(paramMessenger);
    if (localClientRecord != null)
    {
      MediaRouteProvider.RouteController localRouteController = localClientRecord.getRouteController(paramInt2);
      if (localRouteController != null)
      {
        MediaRouter.ControlRequestCallback local2 = null;
        if (paramInt1 != 0) {
          local2 = new MediaRouter.ControlRequestCallback()
          {
            public void onError(String paramAnonymousString, Bundle paramAnonymousBundle)
            {
              if (MediaRouteProviderService.DEBUG)
              {
                StringBuilder localStringBuilder = new StringBuilder();
                localStringBuilder.append(localClientRecord);
                localStringBuilder.append(": Route control request failed, controllerId=");
                localStringBuilder.append(paramInt2);
                localStringBuilder.append(", intent=");
                localStringBuilder.append(paramIntent);
                localStringBuilder.append(", error=");
                localStringBuilder.append(paramAnonymousString);
                localStringBuilder.append(", data=");
                localStringBuilder.append(paramAnonymousBundle);
                Log.d("MediaRouteProviderSrv", localStringBuilder.toString());
              }
              if (findClient(paramMessenger) >= 0) {
                if (paramAnonymousString != null)
                {
                  paramAnonymousString = z2.d("error", paramAnonymousString);
                  MediaRouteProviderService.sendMessage(paramMessenger, 4, paramInt1, 0, paramAnonymousBundle, paramAnonymousString);
                }
                else
                {
                  MediaRouteProviderService.sendMessage(paramMessenger, 4, paramInt1, 0, paramAnonymousBundle, null);
                }
              }
            }
            
            public void onResult(Bundle paramAnonymousBundle)
            {
              if (MediaRouteProviderService.DEBUG)
              {
                StringBuilder localStringBuilder = new StringBuilder();
                localStringBuilder.append(localClientRecord);
                localStringBuilder.append(": Route control request succeeded, controllerId=");
                localStringBuilder.append(paramInt2);
                localStringBuilder.append(", intent=");
                localStringBuilder.append(paramIntent);
                localStringBuilder.append(", data=");
                localStringBuilder.append(paramAnonymousBundle);
                Log.d("MediaRouteProviderSrv", localStringBuilder.toString());
              }
              if (findClient(paramMessenger) >= 0) {
                MediaRouteProviderService.sendMessage(paramMessenger, 3, paramInt1, 0, paramAnonymousBundle, null);
              }
            }
          };
        }
        if (localRouteController.onControlRequest(paramIntent, local2))
        {
          if (MediaRouteProviderService.DEBUG)
          {
            paramMessenger = new StringBuilder();
            paramMessenger.append(localClientRecord);
            paramMessenger.append(": Route control request delivered, controllerId=");
            paramMessenger.append(paramInt2);
            paramMessenger.append(", intent=");
            paramMessenger.append(paramIntent);
            Log.d("MediaRouteProviderSrv", paramMessenger.toString());
          }
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean onSelectRoute(Messenger paramMessenger, int paramInt1, int paramInt2)
  {
    ClientRecord localClientRecord = getClient(paramMessenger);
    if (localClientRecord != null)
    {
      Object localObject = localClientRecord.getRouteController(paramInt2);
      if (localObject != null)
      {
        ((MediaRouteProvider.RouteController)localObject).onSelect();
        if (MediaRouteProviderService.DEBUG)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append(localClientRecord);
          ((StringBuilder)localObject).append(": Route selected, controllerId=");
          ((StringBuilder)localObject).append(paramInt2);
          Log.d("MediaRouteProviderSrv", ((StringBuilder)localObject).toString());
        }
        MediaRouteProviderService.sendGenericSuccess(paramMessenger, paramInt1);
        return true;
      }
    }
    return false;
  }
  
  public boolean onSetDiscoveryRequest(Messenger paramMessenger, int paramInt, MediaRouteDiscoveryRequest paramMediaRouteDiscoveryRequest)
  {
    ClientRecord localClientRecord = getClient(paramMessenger);
    if (localClientRecord != null)
    {
      boolean bool = localClientRecord.setDiscoveryRequest(paramMediaRouteDiscoveryRequest);
      if (MediaRouteProviderService.DEBUG)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(localClientRecord);
        localStringBuilder.append(": Set discovery request, request=");
        localStringBuilder.append(paramMediaRouteDiscoveryRequest);
        localStringBuilder.append(", actuallyChanged=");
        localStringBuilder.append(bool);
        localStringBuilder.append(", compositeDiscoveryRequest=");
        localStringBuilder.append(mCompositeDiscoveryRequest);
        Log.d("MediaRouteProviderSrv", localStringBuilder.toString());
      }
      MediaRouteProviderService.sendGenericSuccess(paramMessenger, paramInt);
      return true;
    }
    return false;
  }
  
  public boolean onSetRouteVolume(Messenger paramMessenger, int paramInt1, int paramInt2, int paramInt3)
  {
    ClientRecord localClientRecord = getClient(paramMessenger);
    if (localClientRecord != null)
    {
      Object localObject = localClientRecord.getRouteController(paramInt2);
      if (localObject != null)
      {
        ((MediaRouteProvider.RouteController)localObject).onSetVolume(paramInt3);
        if (MediaRouteProviderService.DEBUG)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append(localClientRecord);
          ((StringBuilder)localObject).append(": Route volume changed, controllerId=");
          ((StringBuilder)localObject).append(paramInt2);
          ((StringBuilder)localObject).append(", volume=");
          ((StringBuilder)localObject).append(paramInt3);
          Log.d("MediaRouteProviderSrv", ((StringBuilder)localObject).toString());
        }
        MediaRouteProviderService.sendGenericSuccess(paramMessenger, paramInt1);
        return true;
      }
    }
    return false;
  }
  
  public boolean onUnregisterClient(Messenger paramMessenger, int paramInt)
  {
    int i = findClient(paramMessenger);
    if (i >= 0)
    {
      ClientRecord localClientRecord = (ClientRecord)mClients.remove(i);
      if (MediaRouteProviderService.DEBUG)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(localClientRecord);
        localStringBuilder.append(": Unregistered");
        Log.d("MediaRouteProviderSrv", localStringBuilder.toString());
      }
      localClientRecord.dispose();
      MediaRouteProviderService.sendGenericSuccess(paramMessenger, paramInt);
      return true;
    }
    return false;
  }
  
  public boolean onUnselectRoute(Messenger paramMessenger, int paramInt1, int paramInt2, int paramInt3)
  {
    ClientRecord localClientRecord = getClient(paramMessenger);
    if (localClientRecord != null)
    {
      Object localObject = localClientRecord.getRouteController(paramInt2);
      if (localObject != null)
      {
        ((MediaRouteProvider.RouteController)localObject).onUnselect(paramInt3);
        if (MediaRouteProviderService.DEBUG)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append(localClientRecord);
          ((StringBuilder)localObject).append(": Route unselected, controllerId=");
          ((StringBuilder)localObject).append(paramInt2);
          Log.d("MediaRouteProviderSrv", ((StringBuilder)localObject).toString());
        }
        MediaRouteProviderService.sendGenericSuccess(paramMessenger, paramInt1);
        return true;
      }
    }
    return false;
  }
  
  public boolean onUpdateMemberRoutes(Messenger paramMessenger, int paramInt1, int paramInt2, List<String> paramList)
  {
    ClientRecord localClientRecord = getClient(paramMessenger);
    if (localClientRecord != null)
    {
      Object localObject = localClientRecord.getRouteController(paramInt2);
      if ((localObject instanceof MediaRouteProvider.DynamicGroupRouteController))
      {
        ((MediaRouteProvider.DynamicGroupRouteController)localObject).onUpdateMemberRoutes(paramList);
        if (MediaRouteProviderService.DEBUG)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append(localClientRecord);
          ((StringBuilder)localObject).append(": Updated list of member routes, controllerId=");
          ((StringBuilder)localObject).append(paramInt2);
          ((StringBuilder)localObject).append(", memberIds=");
          ((StringBuilder)localObject).append(paramList);
          Log.d("MediaRouteProviderSrv", ((StringBuilder)localObject).toString());
        }
        MediaRouteProviderService.sendGenericSuccess(paramMessenger, paramInt1);
        return true;
      }
    }
    return false;
  }
  
  public boolean onUpdateRouteVolume(Messenger paramMessenger, int paramInt1, int paramInt2, int paramInt3)
  {
    ClientRecord localClientRecord = getClient(paramMessenger);
    if (localClientRecord != null)
    {
      Object localObject = localClientRecord.getRouteController(paramInt2);
      if (localObject != null)
      {
        ((MediaRouteProvider.RouteController)localObject).onUpdateVolume(paramInt3);
        if (MediaRouteProviderService.DEBUG)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append(localClientRecord);
          ((StringBuilder)localObject).append(": Route volume updated, controllerId=");
          ((StringBuilder)localObject).append(paramInt2);
          ((StringBuilder)localObject).append(", delta=");
          ((StringBuilder)localObject).append(paramInt3);
          Log.d("MediaRouteProviderSrv", ((StringBuilder)localObject).toString());
        }
        MediaRouteProviderService.sendGenericSuccess(paramMessenger, paramInt1);
        return true;
      }
    }
    return false;
  }
  
  public void sendDescriptorChanged(MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
  {
    int i = mClients.size();
    for (int j = 0; j < i; j++)
    {
      ClientRecord localClientRecord = (ClientRecord)mClients.get(j);
      MediaRouteProviderService.sendMessage(mMessenger, 5, 0, 0, localClientRecord.createDescriptorBundle(paramMediaRouteProviderDescriptor), null);
      if (MediaRouteProviderService.DEBUG)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(localClientRecord);
        localStringBuilder.append(": Sent descriptor change event, descriptor=");
        localStringBuilder.append(paramMediaRouteProviderDescriptor);
        Log.d("MediaRouteProviderSrv", localStringBuilder.toString());
      }
    }
  }
  
  public boolean setBaseDiscoveryRequest(MediaRouteDiscoveryRequest paramMediaRouteDiscoveryRequest)
  {
    long l = SystemClock.elapsedRealtime();
    if ((ObjectsCompat.equals(mBaseDiscoveryRequest, paramMediaRouteDiscoveryRequest)) && (!paramMediaRouteDiscoveryRequest.isActiveScan())) {
      return false;
    }
    mBaseDiscoveryRequest = paramMediaRouteDiscoveryRequest;
    mBaseDiscoveryRequestTimestamp = l;
    return updateCompositeDiscoveryRequest();
  }
  
  public boolean updateCompositeDiscoveryRequest()
  {
    mActiveScanThrottlingHelper.reset();
    Object localObject1 = mBaseDiscoveryRequest;
    Object localObject2 = null;
    if (localObject1 != null)
    {
      mActiveScanThrottlingHelper.requestActiveScan(((MediaRouteDiscoveryRequest)localObject1).isActiveScan(), mBaseDiscoveryRequestTimestamp);
      localObject1 = new MediaRouteSelector.Builder(mBaseDiscoveryRequest.getSelector());
    }
    else
    {
      localObject1 = null;
    }
    int i = mClients.size();
    int j = 0;
    for (Object localObject3 = localObject1; j < i; localObject3 = localObject1)
    {
      ClientRecord localClientRecord = (ClientRecord)mClients.get(j);
      MediaRouteDiscoveryRequest localMediaRouteDiscoveryRequest = mDiscoveryRequest;
      localObject1 = localObject3;
      if (localMediaRouteDiscoveryRequest != null) {
        if (localMediaRouteDiscoveryRequest.getSelector().isEmpty())
        {
          localObject1 = localObject3;
          if (!localMediaRouteDiscoveryRequest.isActiveScan()) {}
        }
        else
        {
          mActiveScanThrottlingHelper.requestActiveScan(localMediaRouteDiscoveryRequest.isActiveScan(), mDiscoveryRequestTimestamp);
          if (localObject3 == null)
          {
            localObject1 = new MediaRouteSelector.Builder(localMediaRouteDiscoveryRequest.getSelector());
          }
          else
          {
            ((MediaRouteSelector.Builder)localObject3).addSelector(localMediaRouteDiscoveryRequest.getSelector());
            localObject1 = localObject3;
          }
        }
      }
      j++;
    }
    boolean bool = mActiveScanThrottlingHelper.finalizeActiveScanAndScheduleSuppressActiveScanRunnable();
    if (localObject3 == null) {
      localObject1 = localObject2;
    } else {
      localObject1 = new MediaRouteDiscoveryRequest(((MediaRouteSelector.Builder)localObject3).build(), bool);
    }
    if (!ObjectsCompat.equals(mCompositeDiscoveryRequest, localObject1))
    {
      mCompositeDiscoveryRequest = ((MediaRouteDiscoveryRequest)localObject1);
      mService.getMediaRouteProvider().setDiscoveryRequest((MediaRouteDiscoveryRequest)localObject1);
      return true;
    }
    return false;
  }
  
  public class ClientRecord
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
    
    public ClientRecord(Messenger paramMessenger, int paramInt, String paramString)
    {
      mMessenger = paramMessenger;
      mVersion = paramInt;
      mPackageName = paramString;
    }
    
    public void binderDied()
    {
      mService.mPrivateHandler.obtainMessage(1, mMessenger).sendToTarget();
    }
    
    public Bundle createDescriptorBundle(MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
    {
      return MediaRouteProviderService.createDescriptorBundleForClientVersion(paramMediaRouteProviderDescriptor, mVersion);
    }
    
    public Bundle createDynamicGroupRouteController(String paramString, int paramInt)
    {
      if (mControllers.indexOfKey(paramInt) < 0)
      {
        paramString = mService.getMediaRouteProvider().onCreateDynamicGroupRouteController(paramString);
        if (paramString != null)
        {
          paramString.setOnDynamicRoutesChangedListener(ContextCompat.getMainExecutor(mService.getApplicationContext()), mDynamicRoutesChangedListener);
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
          paramString1 = mService.getMediaRouteProvider().onCreateRouteController(paramString1);
        } else {
          paramString1 = mService.getMediaRouteProvider().onCreateRouteController(paramString1, paramString2);
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
        return updateCompositeDiscoveryRequest();
      }
      return false;
    }
    
    public String toString()
    {
      return MediaRouteProviderService.getClientId(mMessenger);
    }
  }
  
  public class ProviderCallbackBase
    extends MediaRouteProvider.Callback
  {
    public ProviderCallbackBase() {}
    
    public void onDescriptorChanged(@NonNull MediaRouteProvider paramMediaRouteProvider, MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
    {
      sendDescriptorChanged(paramMediaRouteProviderDescriptor);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouteProviderService.MediaRouteProviderServiceImplBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */