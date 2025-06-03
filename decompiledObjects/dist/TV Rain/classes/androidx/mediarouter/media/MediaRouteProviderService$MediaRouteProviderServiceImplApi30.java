package androidx.mediarouter.media;

import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import z2;

@RequiresApi(api=30)
class MediaRouteProviderService$MediaRouteProviderServiceImplApi30
  extends MediaRouteProviderService.MediaRouteProviderServiceImplBase
{
  public final MediaRouteProvider.DynamicGroupRouteController.OnDynamicRoutesChangedListener mDynamicRoutesChangedListener = new a(this);
  public MediaRoute2ProviderServiceAdapter mMR2ProviderServiceAdapter;
  
  public MediaRouteProviderService$MediaRouteProviderServiceImplApi30(MediaRouteProviderService paramMediaRouteProviderService)
  {
    super(paramMediaRouteProviderService);
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

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouteProviderService.MediaRouteProviderServiceImplApi30
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */