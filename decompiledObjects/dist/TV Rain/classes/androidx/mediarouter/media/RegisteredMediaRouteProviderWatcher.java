package androidx.mediarouter.media;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class RegisteredMediaRouteProviderWatcher
{
  public final Callback mCallback;
  private final Context mContext;
  private final Handler mHandler;
  private final PackageManager mPackageManager;
  private final ArrayList<RegisteredMediaRouteProvider> mProviders = new ArrayList();
  private boolean mRunning;
  private final BroadcastReceiver mScanPackagesReceiver = new BroadcastReceiver()
  {
    public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      scanPackages();
    }
  };
  private final Runnable mScanPackagesRunnable = new Runnable()
  {
    public void run()
    {
      scanPackages();
    }
  };
  
  public RegisteredMediaRouteProviderWatcher(Context paramContext, Callback paramCallback)
  {
    mContext = paramContext;
    mCallback = paramCallback;
    mHandler = new Handler();
    mPackageManager = paramContext.getPackageManager();
  }
  
  private int findProvider(String paramString1, String paramString2)
  {
    int i = mProviders.size();
    for (int j = 0; j < i; j++) {
      if (((RegisteredMediaRouteProvider)mProviders.get(j)).hasComponentName(paramString1, paramString2)) {
        return j;
      }
    }
    return -1;
  }
  
  public static boolean listContainsServiceInfo(List<ServiceInfo> paramList, ServiceInfo paramServiceInfo)
  {
    if ((paramServiceInfo != null) && (paramList != null) && (!paramList.isEmpty()))
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        ServiceInfo localServiceInfo = (ServiceInfo)paramList.next();
        if ((packageName.equals(packageName)) && (name.equals(name))) {
          return true;
        }
      }
    }
    return false;
  }
  
  @NonNull
  @RequiresApi(30)
  public List<ServiceInfo> getMediaRoute2ProviderServices()
  {
    Object localObject = new Intent("android.media.MediaRoute2ProviderService");
    ArrayList localArrayList = new ArrayList();
    localObject = mPackageManager.queryIntentServices((Intent)localObject, 0).iterator();
    while (((Iterator)localObject).hasNext()) {
      localArrayList.add(nextserviceInfo);
    }
    return localArrayList;
  }
  
  public void rescan()
  {
    mHandler.post(mScanPackagesRunnable);
  }
  
  public void scanPackages()
  {
    if (!mRunning) {
      return;
    }
    Object localObject1 = new ArrayList();
    if (Build.VERSION.SDK_INT >= 30) {
      localObject1 = getMediaRoute2ProviderServices();
    }
    Object localObject2 = new Intent("android.media.MediaRouteProviderService");
    Object localObject3 = mPackageManager;
    int i = 0;
    localObject3 = ((PackageManager)localObject3).queryIntentServices((Intent)localObject2, 0).iterator();
    int k;
    label257:
    while (((Iterator)localObject3).hasNext())
    {
      localObject2 = nextserviceInfo;
      if ((localObject2 != null) && ((!MediaRouter.isMediaTransferEnabled()) || (!listContainsServiceInfo((List)localObject1, (ServiceInfo)localObject2))))
      {
        int j = findProvider(packageName, name);
        if (j < 0)
        {
          localObject2 = new RegisteredMediaRouteProvider(mContext, new ComponentName(packageName, name));
          ((RegisteredMediaRouteProvider)localObject2).setControllerCallback(new e(this, (RegisteredMediaRouteProvider)localObject2));
          ((RegisteredMediaRouteProvider)localObject2).start();
          ArrayList localArrayList = mProviders;
          k = i + 1;
          localArrayList.add(i, localObject2);
          mCallback.addProvider((MediaRouteProvider)localObject2);
        }
        for (i = k;; i = k)
        {
          break;
          if (j < i) {
            break label257;
          }
          localObject2 = (RegisteredMediaRouteProvider)mProviders.get(j);
          ((RegisteredMediaRouteProvider)localObject2).start();
          ((RegisteredMediaRouteProvider)localObject2).rebindIfDisconnected();
          localObject2 = mProviders;
          k = i + 1;
          Collections.swap((List)localObject2, j, i);
        }
      }
    }
    if (i < mProviders.size()) {
      for (k = mProviders.size() - 1; k >= i; k--)
      {
        localObject1 = (RegisteredMediaRouteProvider)mProviders.get(k);
        mCallback.removeProvider((MediaRouteProvider)localObject1);
        mProviders.remove(localObject1);
        ((RegisteredMediaRouteProvider)localObject1).setControllerCallback(null);
        ((RegisteredMediaRouteProvider)localObject1).stop();
      }
    }
  }
  
  public void start()
  {
    if (!mRunning)
    {
      mRunning = true;
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.PACKAGE_ADDED");
      localIntentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
      localIntentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
      localIntentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
      localIntentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
      localIntentFilter.addDataScheme("package");
      mContext.registerReceiver(mScanPackagesReceiver, localIntentFilter, null, mHandler);
      mHandler.post(mScanPackagesRunnable);
    }
  }
  
  public void stop()
  {
    if (mRunning)
    {
      mRunning = false;
      mContext.unregisterReceiver(mScanPackagesReceiver);
      mHandler.removeCallbacks(mScanPackagesRunnable);
      for (int i = mProviders.size() - 1; i >= 0; i--) {
        ((RegisteredMediaRouteProvider)mProviders.get(i)).stop();
      }
    }
  }
  
  public static abstract interface Callback
  {
    public abstract void addProvider(@NonNull MediaRouteProvider paramMediaRouteProvider);
    
    public abstract void releaseProviderController(@NonNull RegisteredMediaRouteProvider paramRegisteredMediaRouteProvider, @NonNull MediaRouteProvider.RouteController paramRouteController);
    
    public abstract void removeProvider(@NonNull MediaRouteProvider paramMediaRouteProvider);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.RegisteredMediaRouteProviderWatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */