package androidx.mediarouter.media;

import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import androidx.core.util.ObjectsCompat;
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
import z2;

public abstract class MediaRouteProviderService
  extends Service
{
  public static final boolean DEBUG = Log.isLoggable("MediaRouteProviderSrv", 3);
  public static final int PRIVATE_MSG_CLIENT_DIED = 1;
  public static final String SERVICE_INTERFACE = "android.media.MediaRouteProviderService";
  public static final String TAG = "MediaRouteProviderSrv";
  public final MediaRouteProviderServiceImpl mImpl;
  public final PrivateHandler mPrivateHandler;
  public MediaRouteProvider mProvider;
  private final MediaRouteProvider.Callback mProviderCallback;
  private final ReceiveHandler mReceiveHandler;
  public final Messenger mReceiveMessenger;
  
  public MediaRouteProviderService()
  {
    ReceiveHandler localReceiveHandler = new ReceiveHandler(this);
    mReceiveHandler = localReceiveHandler;
    mReceiveMessenger = new Messenger(localReceiveHandler);
    mPrivateHandler = new PrivateHandler();
    if (Build.VERSION.SDK_INT >= 30) {
      mImpl = new MediaRouteProviderServiceImplApi30(this);
    } else {
      mImpl = new MediaRouteProviderServiceImplBase(this);
    }
    mProviderCallback = mImpl.getProviderCallback();
  }
  
  @VisibleForTesting
  public static Bundle createDescriptorBundleForClientVersion(MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor, int paramInt)
  {
    if (paramMediaRouteProviderDescriptor == null) {
      return null;
    }
    MediaRouteProviderDescriptor.Builder localBuilder = new MediaRouteProviderDescriptor.Builder(paramMediaRouteProviderDescriptor);
    localBuilder.setRoutes(null);
    if (paramInt < 4) {
      localBuilder.setSupportsDynamicGroupRoute(false);
    }
    Iterator localIterator = paramMediaRouteProviderDescriptor.getRoutes().iterator();
    while (localIterator.hasNext())
    {
      paramMediaRouteProviderDescriptor = (MediaRouteDescriptor)localIterator.next();
      if ((paramInt >= paramMediaRouteProviderDescriptor.getMinClientVersion()) && (paramInt <= paramMediaRouteProviderDescriptor.getMaxClientVersion())) {
        localBuilder.addRoute(paramMediaRouteProviderDescriptor);
      }
    }
    return localBuilder.build().asBundle();
  }
  
  public static String getClientId(Messenger paramMessenger)
  {
    StringBuilder localStringBuilder = z2.t("Client connection ");
    localStringBuilder.append(paramMessenger.getBinder().toString());
    return localStringBuilder.toString();
  }
  
  public static void sendGenericFailure(Messenger paramMessenger, int paramInt)
  {
    if (paramInt != 0) {
      sendMessage(paramMessenger, 0, paramInt, 0, null, null);
    }
  }
  
  public static void sendGenericSuccess(Messenger paramMessenger, int paramInt)
  {
    if (paramInt != 0) {
      sendMessage(paramMessenger, 1, paramInt, 0, null, null);
    }
  }
  
  public static void sendMessage(Messenger paramMessenger, int paramInt1, int paramInt2, int paramInt3, Object paramObject, Bundle paramBundle)
  {
    Message localMessage = Message.obtain();
    what = paramInt1;
    arg1 = paramInt2;
    arg2 = paramInt3;
    obj = paramObject;
    localMessage.setData(paramBundle);
    try
    {
      try
      {
        paramMessenger.send(localMessage);
      }
      catch (RemoteException paramObject)
      {
        paramBundle = z2.t("Could not send message to ");
        paramBundle.append(getClientId(paramMessenger));
        Log.e("MediaRouteProviderSrv", paramBundle.toString(), (Throwable)paramObject);
      }
      return;
    }
    catch (DeadObjectException paramMessenger)
    {
      for (;;) {}
    }
  }
  
  public void attachBaseContext(@NonNull Context paramContext)
  {
    super.attachBaseContext(paramContext);
    mImpl.attachBaseContext(paramContext);
  }
  
  public void ensureProvider()
  {
    if (mProvider == null)
    {
      Object localObject = onCreateMediaRouteProvider();
      if (localObject != null)
      {
        String str = ((MediaRouteProvider)localObject).getMetadata().getPackageName();
        if (str.equals(getPackageName()))
        {
          mProvider = ((MediaRouteProvider)localObject);
          ((MediaRouteProvider)localObject).setCallback(mProviderCallback);
        }
        else
        {
          localObject = a.s("onCreateMediaRouteProvider() returned a provider whose package name does not match the package name of the service.  A media route provider service can only export its own media route providers.  Provider package name: ", str, ".  Service package name: ");
          ((StringBuilder)localObject).append(getPackageName());
          ((StringBuilder)localObject).append(".");
          throw new IllegalStateException(((StringBuilder)localObject).toString());
        }
      }
    }
  }
  
  @Nullable
  public MediaRouteProvider getMediaRouteProvider()
  {
    return mProvider;
  }
  
  @Nullable
  public IBinder onBind(@NonNull Intent paramIntent)
  {
    return mImpl.onBind(paramIntent);
  }
  
  @Nullable
  public abstract MediaRouteProvider onCreateMediaRouteProvider();
  
  public void onDestroy()
  {
    MediaRouteProvider localMediaRouteProvider = mProvider;
    if (localMediaRouteProvider != null) {
      localMediaRouteProvider.setCallback(null);
    }
    super.onDestroy();
  }
  
  public static abstract interface MediaRouteProviderServiceImpl
  {
    public abstract void attachBaseContext(Context paramContext);
    
    public abstract MediaRouteProvider.Callback getProviderCallback();
    
    public abstract boolean onAddMemberRoute(Messenger paramMessenger, int paramInt1, int paramInt2, String paramString);
    
    public abstract IBinder onBind(Intent paramIntent);
    
    public abstract void onBinderDied(Messenger paramMessenger);
    
    public abstract boolean onCreateDynamicGroupRouteController(Messenger paramMessenger, int paramInt1, int paramInt2, String paramString);
    
    public abstract boolean onCreateRouteController(Messenger paramMessenger, int paramInt1, int paramInt2, String paramString1, String paramString2);
    
    public abstract boolean onRegisterClient(Messenger paramMessenger, int paramInt1, int paramInt2, String paramString);
    
    public abstract boolean onReleaseRouteController(Messenger paramMessenger, int paramInt1, int paramInt2);
    
    public abstract boolean onRemoveMemberRoute(Messenger paramMessenger, int paramInt1, int paramInt2, String paramString);
    
    public abstract boolean onRouteControlRequest(Messenger paramMessenger, int paramInt1, int paramInt2, Intent paramIntent);
    
    public abstract boolean onSelectRoute(Messenger paramMessenger, int paramInt1, int paramInt2);
    
    public abstract boolean onSetDiscoveryRequest(Messenger paramMessenger, int paramInt, MediaRouteDiscoveryRequest paramMediaRouteDiscoveryRequest);
    
    public abstract boolean onSetRouteVolume(Messenger paramMessenger, int paramInt1, int paramInt2, int paramInt3);
    
    public abstract boolean onUnregisterClient(Messenger paramMessenger, int paramInt);
    
    public abstract boolean onUnselectRoute(Messenger paramMessenger, int paramInt1, int paramInt2, int paramInt3);
    
    public abstract boolean onUpdateMemberRoutes(Messenger paramMessenger, int paramInt1, int paramInt2, List<String> paramList);
    
    public abstract boolean onUpdateRouteVolume(Messenger paramMessenger, int paramInt1, int paramInt2, int paramInt3);
  }
  
  @RequiresApi(api=30)
  public static class MediaRouteProviderServiceImplApi30
    extends MediaRouteProviderService.MediaRouteProviderServiceImplBase
  {
    public final MediaRouteProvider.DynamicGroupRouteController.OnDynamicRoutesChangedListener mDynamicRoutesChangedListener = new a(this);
    public MediaRoute2ProviderServiceAdapter mMR2ProviderServiceAdapter;
    
    public MediaRouteProviderServiceImplApi30(MediaRouteProviderService paramMediaRouteProviderService)
    {
      super();
    }
    
    public void attachBaseContext(Context paramContext)
    {
      MediaRoute2ProviderServiceAdapter localMediaRoute2ProviderServiceAdapter = mMR2ProviderServiceAdapter;
      if (localMediaRoute2ProviderServiceAdapter != null) {
        localMediaRoute2ProviderServiceAdapter.attachBaseContext(paramContext);
      }
    }
    
    public MediaRouteProviderService.MediaRouteProviderServiceImplBase.ClientRecord createClientRecord(Messenger paramMessenger, int paramInt, String paramString)
    {
      return new ClientRecord(paramMessenger, paramInt, paramString);
    }
    
    public IBinder onBind(Intent paramIntent)
    {
      mService.ensureProvider();
      if (mMR2ProviderServiceAdapter == null)
      {
        mMR2ProviderServiceAdapter = new MediaRoute2ProviderServiceAdapter(this);
        if (mService.getBaseContext() != null) {
          mMR2ProviderServiceAdapter.attachBaseContext(mService);
        }
      }
      IBinder localIBinder = super.onBind(paramIntent);
      if (localIBinder != null) {
        return localIBinder;
      }
      return mMR2ProviderServiceAdapter.onBind(paramIntent);
    }
    
    public void sendDescriptorChanged(MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
    {
      super.sendDescriptorChanged(paramMediaRouteProviderDescriptor);
      mMR2ProviderServiceAdapter.setProviderDescriptor(paramMediaRouteProviderDescriptor);
    }
    
    public void setDynamicRoutesChangedListener(MediaRouteProvider.DynamicGroupRouteController paramDynamicGroupRouteController)
    {
      paramDynamicGroupRouteController.setOnDynamicRoutesChangedListener(ContextCompat.getMainExecutor(mService.getApplicationContext()), mDynamicRoutesChangedListener);
    }
    
    public class ClientRecord
      extends MediaRouteProviderService.MediaRouteProviderServiceImplBase.ClientRecord
    {
      private static final long DISABLE_ROUTE_FOR_RELEASED_CONTROLLER_TIMEOUT_MS = 5000L;
      private final Handler mClientHandler = new Handler(Looper.getMainLooper());
      private final Map<String, Integer> mReleasedControllerIds;
      private final Map<String, MediaRouteProvider.RouteController> mRouteIdToControllerMap = new ArrayMap();
      
      public ClientRecord(Messenger paramMessenger, int paramInt, String paramString)
      {
        super(paramMessenger, paramInt, paramString);
        if (paramInt < 4) {
          mReleasedControllerIds = new ArrayMap();
        } else {
          mReleasedControllerIds = Collections.emptyMap();
        }
      }
      
      private void disableRouteForReleasedRouteController(String paramString, int paramInt)
      {
        mReleasedControllerIds.put(paramString, Integer.valueOf(paramInt));
        mClientHandler.postDelayed(new b(this, paramString), 5000L);
        sendDescriptor();
      }
      
      private void enableRouteForReleasedRouteController(String paramString)
      {
        if (mReleasedControllerIds.remove(paramString) == null) {
          return;
        }
        sendDescriptor();
      }
      
      public Bundle createDescriptorBundle(MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
      {
        if (mReleasedControllerIds.isEmpty()) {
          return super.createDescriptorBundle(paramMediaRouteProviderDescriptor);
        }
        ArrayList localArrayList = new ArrayList();
        Iterator localIterator = paramMediaRouteProviderDescriptor.getRoutes().iterator();
        while (localIterator.hasNext())
        {
          MediaRouteDescriptor localMediaRouteDescriptor = (MediaRouteDescriptor)localIterator.next();
          if (mReleasedControllerIds.containsKey(localMediaRouteDescriptor.getId())) {
            localArrayList.add(new MediaRouteDescriptor.Builder(localMediaRouteDescriptor).setEnabled(false).build());
          } else {
            localArrayList.add(localMediaRouteDescriptor);
          }
        }
        return super.createDescriptorBundle(new MediaRouteProviderDescriptor.Builder(paramMediaRouteProviderDescriptor).setRoutes(localArrayList).build());
      }
      
      public Bundle createDynamicGroupRouteController(String paramString, int paramInt)
      {
        Bundle localBundle = super.createDynamicGroupRouteController(paramString, paramInt);
        if ((localBundle != null) && (mPackageName != null)) {
          mMR2ProviderServiceAdapter.notifyRouteControllerAdded(this, (MediaRouteProvider.RouteController)mControllers.get(paramInt), paramInt, mPackageName, paramString);
        }
        return localBundle;
      }
      
      public boolean createRouteController(String paramString1, String paramString2, int paramInt)
      {
        MediaRouteProvider.RouteController localRouteController = (MediaRouteProvider.RouteController)mRouteIdToControllerMap.get(paramString1);
        if (localRouteController != null)
        {
          mControllers.put(paramInt, localRouteController);
          return true;
        }
        boolean bool = super.createRouteController(paramString1, paramString2, paramInt);
        if ((paramString2 == null) && (bool) && (mPackageName != null)) {
          mMR2ProviderServiceAdapter.notifyRouteControllerAdded(this, (MediaRouteProvider.RouteController)mControllers.get(paramInt), paramInt, mPackageName, paramString1);
        }
        if (bool) {
          mRouteIdToControllerMap.put(paramString1, (MediaRouteProvider.RouteController)mControllers.get(paramInt));
        }
        return bool;
      }
      
      public void dispose()
      {
        int i = mControllers.size();
        for (int j = 0; j < i; j++)
        {
          int k = mControllers.keyAt(j);
          mMR2ProviderServiceAdapter.notifyRouteControllerRemoved(k);
        }
        mRouteIdToControllerMap.clear();
        super.dispose();
      }
      
      public MediaRouteProvider.RouteController findControllerByRouteId(String paramString)
      {
        return (MediaRouteProvider.RouteController)mRouteIdToControllerMap.get(paramString);
      }
      
      public int findControllerIdByController(MediaRouteProvider.RouteController paramRouteController)
      {
        int i = mControllers.indexOfValue(paramRouteController);
        if (i < 0) {
          return -1;
        }
        return mControllers.keyAt(i);
      }
      
      public void releaseControllerByProvider(MediaRouteProvider.RouteController paramRouteController, String paramString)
      {
        int i = findControllerIdByController(paramRouteController);
        releaseRouteController(i);
        if (mVersion >= 4)
        {
          if (i < 0)
          {
            z2.A("releaseControllerByProvider: Can't find the controller. route ID=", paramString, "MediaRouteProviderSrv");
            return;
          }
          MediaRouteProviderService.sendMessage(mMessenger, 8, 0, i, null, null);
        }
        else
        {
          disableRouteForReleasedRouteController(paramString, i);
        }
      }
      
      public boolean releaseRouteController(int paramInt)
      {
        mMR2ProviderServiceAdapter.notifyRouteControllerRemoved(paramInt);
        Object localObject = (MediaRouteProvider.RouteController)mControllers.get(paramInt);
        if (localObject != null)
        {
          localIterator = mRouteIdToControllerMap.entrySet().iterator();
          while (localIterator.hasNext())
          {
            Map.Entry localEntry = (Map.Entry)localIterator.next();
            if (localEntry.getValue() == localObject) {
              mRouteIdToControllerMap.remove(localEntry.getKey());
            }
          }
        }
        Iterator localIterator = mReleasedControllerIds.entrySet().iterator();
        while (localIterator.hasNext())
        {
          localObject = (Map.Entry)localIterator.next();
          if (((Integer)((Map.Entry)localObject).getValue()).intValue() == paramInt) {
            enableRouteForReleasedRouteController((String)((Map.Entry)localObject).getKey());
          }
        }
        return super.releaseRouteController(paramInt);
      }
      
      public void sendDescriptor()
      {
        MediaRouteProviderDescriptor localMediaRouteProviderDescriptor = getService().getMediaRouteProvider().getDescriptor();
        if (localMediaRouteProviderDescriptor != null) {
          MediaRouteProviderService.sendMessage(mMessenger, 5, 0, 0, createDescriptorBundle(localMediaRouteProviderDescriptor), null);
        }
      }
      
      public void sendDynamicRouteDescriptors(MediaRouteProvider.DynamicGroupRouteController paramDynamicGroupRouteController, MediaRouteDescriptor paramMediaRouteDescriptor, Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> paramCollection)
      {
        super.sendDynamicRouteDescriptors(paramDynamicGroupRouteController, paramMediaRouteDescriptor, paramCollection);
        MediaRoute2ProviderServiceAdapter localMediaRoute2ProviderServiceAdapter = mMR2ProviderServiceAdapter;
        if (localMediaRoute2ProviderServiceAdapter != null) {
          localMediaRoute2ProviderServiceAdapter.setDynamicRouteDescriptor(paramDynamicGroupRouteController, paramMediaRouteDescriptor, paramCollection);
        }
      }
    }
  }
  
  public static class MediaRouteProviderServiceImplBase
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
    
    public MediaRouteProviderServiceImplBase(MediaRouteProviderService paramMediaRouteProviderService)
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
  
  public final class PrivateHandler
    extends Handler
  {
    public PrivateHandler() {}
    
    public void handleMessage(Message paramMessage)
    {
      if (what == 1) {
        mImpl.onBinderDied((Messenger)obj);
      }
    }
  }
  
  public static final class ReceiveHandler
    extends Handler
  {
    private final WeakReference<MediaRouteProviderService> mServiceRef;
    
    public ReceiveHandler(MediaRouteProviderService paramMediaRouteProviderService)
    {
      mServiceRef = new WeakReference(paramMediaRouteProviderService);
    }
    
    private boolean processMessage(int paramInt1, Messenger paramMessenger, int paramInt2, int paramInt3, Object paramObject, Bundle paramBundle, String paramString)
    {
      MediaRouteProviderService localMediaRouteProviderService = (MediaRouteProviderService)mServiceRef.get();
      int i = 0;
      if (localMediaRouteProviderService != null) {
        switch (paramInt1)
        {
        default: 
          break;
        case 14: 
          paramObject = paramBundle.getStringArrayList("memberRouteIds");
          if (paramObject != null) {
            return mImpl.onUpdateMemberRoutes(paramMessenger, paramInt2, paramInt3, (List)paramObject);
          }
          break;
        case 13: 
          paramObject = paramBundle.getString("memberRouteId");
          if (paramObject != null) {
            return mImpl.onRemoveMemberRoute(paramMessenger, paramInt2, paramInt3, (String)paramObject);
          }
          break;
        case 12: 
          paramObject = paramBundle.getString("memberRouteId");
          if (paramObject != null) {
            return mImpl.onAddMemberRoute(paramMessenger, paramInt2, paramInt3, (String)paramObject);
          }
          break;
        case 11: 
          paramObject = paramBundle.getString("memberRouteId");
          if (paramObject != null) {
            return mImpl.onCreateDynamicGroupRouteController(paramMessenger, paramInt2, paramInt3, (String)paramObject);
          }
          break;
        case 10: 
          if ((paramObject == null) || ((paramObject instanceof Bundle)))
          {
            paramObject = MediaRouteDiscoveryRequest.fromBundle((Bundle)paramObject);
            paramBundle = mImpl;
            if ((paramObject == null) || (!((MediaRouteDiscoveryRequest)paramObject).isValid())) {
              paramObject = null;
            }
            return paramBundle.onSetDiscoveryRequest(paramMessenger, paramInt2, (MediaRouteDiscoveryRequest)paramObject);
          }
          break;
        case 9: 
          if ((paramObject instanceof Intent)) {
            return mImpl.onRouteControlRequest(paramMessenger, paramInt2, paramInt3, (Intent)paramObject);
          }
          break;
        case 8: 
          paramInt1 = paramBundle.getInt("volume", 0);
          if (paramInt1 != 0) {
            return mImpl.onUpdateRouteVolume(paramMessenger, paramInt2, paramInt3, paramInt1);
          }
          break;
        case 7: 
          paramInt1 = paramBundle.getInt("volume", -1);
          if (paramInt1 >= 0) {
            return mImpl.onSetRouteVolume(paramMessenger, paramInt2, paramInt3, paramInt1);
          }
          break;
        case 6: 
          if (paramBundle == null) {
            paramInt1 = i;
          } else {
            paramInt1 = paramBundle.getInt("unselectReason", 0);
          }
          return mImpl.onUnselectRoute(paramMessenger, paramInt2, paramInt3, paramInt1);
        case 5: 
          return mImpl.onSelectRoute(paramMessenger, paramInt2, paramInt3);
        case 4: 
          return mImpl.onReleaseRouteController(paramMessenger, paramInt2, paramInt3);
        case 3: 
          paramObject = paramBundle.getString("routeId");
          paramBundle = paramBundle.getString("routeGroupId");
          if (paramObject != null) {
            return mImpl.onCreateRouteController(paramMessenger, paramInt2, paramInt3, (String)paramObject, paramBundle);
          }
          break;
        case 2: 
          return mImpl.onUnregisterClient(paramMessenger, paramInt2);
        case 1: 
          return mImpl.onRegisterClient(paramMessenger, paramInt2, paramInt3, paramString);
        }
      }
      return false;
    }
    
    public void handleMessage(Message paramMessage)
    {
      Messenger localMessenger = replyTo;
      if (MediaRouteProviderProtocol.isValidRemoteMessenger(localMessenger))
      {
        int i = what;
        int j = arg1;
        int k = arg2;
        Object localObject = obj;
        Bundle localBundle = paramMessage.peekData();
        if (i == 1)
        {
          paramMessage = ((MediaRouteProviderService)mServiceRef.get()).getPackageManager().getPackagesForUid(sendingUid);
          if ((paramMessage != null) && (paramMessage.length > 0))
          {
            paramMessage = paramMessage[0];
            break label85;
          }
        }
        paramMessage = null;
        label85:
        if (!processMessage(i, localMessenger, j, k, localObject, localBundle, paramMessage))
        {
          if (MediaRouteProviderService.DEBUG)
          {
            paramMessage = new StringBuilder();
            paramMessage.append(MediaRouteProviderService.getClientId(localMessenger));
            paramMessage.append(": Message failed, what=");
            paramMessage.append(i);
            paramMessage.append(", requestId=");
            paramMessage.append(j);
            paramMessage.append(", arg=");
            paramMessage.append(k);
            paramMessage.append(", obj=");
            paramMessage.append(localObject);
            paramMessage.append(", data=");
            paramMessage.append(localBundle);
            Log.d("MediaRouteProviderSrv", paramMessage.toString());
          }
          MediaRouteProviderService.sendGenericFailure(localMessenger, j);
        }
      }
      else if (MediaRouteProviderService.DEBUG)
      {
        Log.d("MediaRouteProviderSrv", "Ignoring message without valid reply messenger.");
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouteProviderService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */