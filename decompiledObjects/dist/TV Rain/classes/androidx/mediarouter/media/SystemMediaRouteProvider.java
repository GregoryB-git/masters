package androidx.mediarouter.media;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.mediarouter.R.string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

abstract class SystemMediaRouteProvider
  extends MediaRouteProvider
{
  public static final String DEFAULT_ROUTE_ID = "DEFAULT_ROUTE";
  public static final String PACKAGE_NAME = "android";
  private static final String TAG = "SystemMediaRouteProvider";
  
  public SystemMediaRouteProvider(Context paramContext)
  {
    super(paramContext, new MediaRouteProvider.ProviderMetadata(new ComponentName("android", SystemMediaRouteProvider.class.getName())));
  }
  
  public static SystemMediaRouteProvider obtain(Context paramContext, SyncCallback paramSyncCallback)
  {
    return new Api24Impl(paramContext, paramSyncCallback);
  }
  
  public Object getDefaultRoute()
  {
    return null;
  }
  
  public Object getSystemRoute(MediaRouter.RouteInfo paramRouteInfo)
  {
    return null;
  }
  
  public void onSyncRouteAdded(MediaRouter.RouteInfo paramRouteInfo) {}
  
  public void onSyncRouteChanged(MediaRouter.RouteInfo paramRouteInfo) {}
  
  public void onSyncRouteRemoved(MediaRouter.RouteInfo paramRouteInfo) {}
  
  public void onSyncRouteSelected(MediaRouter.RouteInfo paramRouteInfo) {}
  
  @RequiresApi(24)
  public static class Api24Impl
    extends SystemMediaRouteProvider.JellybeanMr2Impl
  {
    public Api24Impl(Context paramContext, SystemMediaRouteProvider.SyncCallback paramSyncCallback)
    {
      super(paramSyncCallback);
    }
    
    public void onBuildSystemRouteDescriptor(SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord paramSystemRouteRecord, MediaRouteDescriptor.Builder paramBuilder)
    {
      super.onBuildSystemRouteDescriptor(paramSystemRouteRecord, paramBuilder);
      paramBuilder.setDeviceType(MediaRouterApi24.RouteInfo.getDeviceType(mRouteObj));
    }
  }
  
  @RequiresApi(16)
  public static class JellybeanImpl
    extends SystemMediaRouteProvider
    implements MediaRouterJellybean.Callback, MediaRouterJellybean.VolumeCallback
  {
    private static final ArrayList<IntentFilter> LIVE_AUDIO_CONTROL_FILTERS;
    private static final ArrayList<IntentFilter> LIVE_VIDEO_CONTROL_FILTERS;
    public boolean mActiveScan;
    public final Object mCallbackObj;
    public boolean mCallbackRegistered;
    private MediaRouterJellybean.GetDefaultRouteWorkaround mGetDefaultRouteWorkaround;
    public int mRouteTypes;
    public final Object mRouterObj;
    private MediaRouterJellybean.SelectRouteWorkaround mSelectRouteWorkaround;
    private final SystemMediaRouteProvider.SyncCallback mSyncCallback;
    public final ArrayList<SystemRouteRecord> mSystemRouteRecords = new ArrayList();
    public final Object mUserRouteCategoryObj;
    public final ArrayList<UserRouteRecord> mUserRouteRecords = new ArrayList();
    public final Object mVolumeCallbackObj;
    
    static
    {
      Object localObject1 = new IntentFilter();
      ((IntentFilter)localObject1).addCategory("android.media.intent.category.LIVE_AUDIO");
      Object localObject2 = new ArrayList();
      LIVE_AUDIO_CONTROL_FILTERS = (ArrayList)localObject2;
      ((ArrayList)localObject2).add(localObject1);
      localObject2 = new IntentFilter();
      ((IntentFilter)localObject2).addCategory("android.media.intent.category.LIVE_VIDEO");
      localObject1 = new ArrayList();
      LIVE_VIDEO_CONTROL_FILTERS = (ArrayList)localObject1;
      ((ArrayList)localObject1).add(localObject2);
    }
    
    public JellybeanImpl(Context paramContext, SystemMediaRouteProvider.SyncCallback paramSyncCallback)
    {
      super();
      mSyncCallback = paramSyncCallback;
      paramSyncCallback = MediaRouterJellybean.getMediaRouter(paramContext);
      mRouterObj = paramSyncCallback;
      mCallbackObj = createCallbackObj();
      mVolumeCallbackObj = createVolumeCallbackObj();
      mUserRouteCategoryObj = MediaRouterJellybean.createRouteCategory(paramSyncCallback, paramContext.getResources().getString(R.string.mr_user_route_category_name), false);
      updateSystemRoutes();
    }
    
    private boolean addSystemRouteNoPublish(Object paramObject)
    {
      if ((getUserRouteRecord(paramObject) == null) && (findSystemRouteRecord(paramObject) < 0))
      {
        paramObject = new SystemRouteRecord(paramObject, assignRouteId(paramObject));
        updateSystemRouteDescriptor((SystemRouteRecord)paramObject);
        mSystemRouteRecords.add(paramObject);
        return true;
      }
      return false;
    }
    
    private String assignRouteId(Object paramObject)
    {
      if (getDefaultRoute() == paramObject) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        paramObject = "DEFAULT_ROUTE";
      } else {
        paramObject = String.format(Locale.US, "ROUTE_%08x", new Object[] { Integer.valueOf(getRouteName(paramObject).hashCode()) });
      }
      if (findSystemRouteRecordByDescriptorId((String)paramObject) < 0) {
        return (String)paramObject;
      }
      for (int i = 2;; i++)
      {
        String str = String.format(Locale.US, "%s_%d", new Object[] { paramObject, Integer.valueOf(i) });
        if (findSystemRouteRecordByDescriptorId(str) < 0) {
          return str;
        }
      }
    }
    
    private void updateSystemRoutes()
    {
      updateCallback();
      Iterator localIterator = MediaRouterJellybean.getRoutes(mRouterObj).iterator();
      boolean bool = false;
      while (localIterator.hasNext()) {
        bool |= addSystemRouteNoPublish(localIterator.next());
      }
      if (bool) {
        publishRoutes();
      }
    }
    
    public Object createCallbackObj()
    {
      return MediaRouterJellybean.createCallback(this);
    }
    
    public Object createVolumeCallbackObj()
    {
      return MediaRouterJellybean.createVolumeCallback(this);
    }
    
    public int findSystemRouteRecord(Object paramObject)
    {
      int i = mSystemRouteRecords.size();
      for (int j = 0; j < i; j++) {
        if (mSystemRouteRecords.get(j)).mRouteObj == paramObject) {
          return j;
        }
      }
      return -1;
    }
    
    public int findSystemRouteRecordByDescriptorId(String paramString)
    {
      int i = mSystemRouteRecords.size();
      for (int j = 0; j < i; j++) {
        if (mSystemRouteRecords.get(j)).mRouteDescriptorId.equals(paramString)) {
          return j;
        }
      }
      return -1;
    }
    
    public int findUserRouteRecord(MediaRouter.RouteInfo paramRouteInfo)
    {
      int i = mUserRouteRecords.size();
      for (int j = 0; j < i; j++) {
        if (mUserRouteRecords.get(j)).mRoute == paramRouteInfo) {
          return j;
        }
      }
      return -1;
    }
    
    public Object getDefaultRoute()
    {
      if (mGetDefaultRouteWorkaround == null) {
        mGetDefaultRouteWorkaround = new MediaRouterJellybean.GetDefaultRouteWorkaround();
      }
      return mGetDefaultRouteWorkaround.getDefaultRoute(mRouterObj);
    }
    
    public String getRouteName(Object paramObject)
    {
      paramObject = MediaRouterJellybean.RouteInfo.getName(paramObject, getContext());
      if (paramObject != null) {
        paramObject = ((CharSequence)paramObject).toString();
      } else {
        paramObject = "";
      }
      return (String)paramObject;
    }
    
    public Object getSystemRoute(MediaRouter.RouteInfo paramRouteInfo)
    {
      if (paramRouteInfo == null) {
        return null;
      }
      int i = findSystemRouteRecordByDescriptorId(paramRouteInfo.getDescriptorId());
      if (i >= 0) {
        return mSystemRouteRecords.get(i)).mRouteObj;
      }
      return null;
    }
    
    public UserRouteRecord getUserRouteRecord(Object paramObject)
    {
      paramObject = MediaRouterJellybean.RouteInfo.getTag(paramObject);
      if ((paramObject instanceof UserRouteRecord)) {
        paramObject = (UserRouteRecord)paramObject;
      } else {
        paramObject = null;
      }
      return (UserRouteRecord)paramObject;
    }
    
    public void onBuildSystemRouteDescriptor(SystemRouteRecord paramSystemRouteRecord, MediaRouteDescriptor.Builder paramBuilder)
    {
      int i = MediaRouterJellybean.RouteInfo.getSupportedTypes(mRouteObj);
      if ((i & 0x1) != 0) {
        paramBuilder.addControlFilters(LIVE_AUDIO_CONTROL_FILTERS);
      }
      if ((i & 0x2) != 0) {
        paramBuilder.addControlFilters(LIVE_VIDEO_CONTROL_FILTERS);
      }
      paramBuilder.setPlaybackType(MediaRouterJellybean.RouteInfo.getPlaybackType(mRouteObj));
      paramBuilder.setPlaybackStream(MediaRouterJellybean.RouteInfo.getPlaybackStream(mRouteObj));
      paramBuilder.setVolume(MediaRouterJellybean.RouteInfo.getVolume(mRouteObj));
      paramBuilder.setVolumeMax(MediaRouterJellybean.RouteInfo.getVolumeMax(mRouteObj));
      paramBuilder.setVolumeHandling(MediaRouterJellybean.RouteInfo.getVolumeHandling(mRouteObj));
    }
    
    public MediaRouteProvider.RouteController onCreateRouteController(String paramString)
    {
      int i = findSystemRouteRecordByDescriptorId(paramString);
      if (i >= 0) {
        return new SystemRouteController(mSystemRouteRecords.get(i)).mRouteObj);
      }
      return null;
    }
    
    public void onDiscoveryRequestChanged(MediaRouteDiscoveryRequest paramMediaRouteDiscoveryRequest)
    {
      int i = 0;
      int j = 0;
      boolean bool;
      if (paramMediaRouteDiscoveryRequest != null)
      {
        List localList = paramMediaRouteDiscoveryRequest.getSelector().getControlCategories();
        int k = localList.size();
        i = 0;
        while (j < k)
        {
          String str = (String)localList.get(j);
          if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
            i |= 0x1;
          } else if (str.equals("android.media.intent.category.LIVE_VIDEO")) {
            i |= 0x2;
          } else {
            i |= 0x800000;
          }
          j++;
        }
        bool = paramMediaRouteDiscoveryRequest.isActiveScan();
      }
      else
      {
        bool = false;
      }
      if ((mRouteTypes != i) || (mActiveScan != bool))
      {
        mRouteTypes = i;
        mActiveScan = bool;
        updateSystemRoutes();
      }
    }
    
    public void onRouteAdded(Object paramObject)
    {
      if (addSystemRouteNoPublish(paramObject)) {
        publishRoutes();
      }
    }
    
    public void onRouteChanged(Object paramObject)
    {
      if (getUserRouteRecord(paramObject) == null)
      {
        int i = findSystemRouteRecord(paramObject);
        if (i >= 0)
        {
          updateSystemRouteDescriptor((SystemRouteRecord)mSystemRouteRecords.get(i));
          publishRoutes();
        }
      }
    }
    
    public void onRouteGrouped(Object paramObject1, Object paramObject2, int paramInt) {}
    
    public void onRouteRemoved(Object paramObject)
    {
      if (getUserRouteRecord(paramObject) == null)
      {
        int i = findSystemRouteRecord(paramObject);
        if (i >= 0)
        {
          mSystemRouteRecords.remove(i);
          publishRoutes();
        }
      }
    }
    
    public void onRouteSelected(int paramInt, Object paramObject)
    {
      if (paramObject != MediaRouterJellybean.getSelectedRoute(mRouterObj, 8388611)) {
        return;
      }
      UserRouteRecord localUserRouteRecord = getUserRouteRecord(paramObject);
      if (localUserRouteRecord != null)
      {
        mRoute.select();
      }
      else
      {
        paramInt = findSystemRouteRecord(paramObject);
        if (paramInt >= 0)
        {
          paramObject = (SystemRouteRecord)mSystemRouteRecords.get(paramInt);
          mSyncCallback.onSystemRouteSelectedByDescriptorId(mRouteDescriptorId);
        }
      }
    }
    
    public void onRouteUngrouped(Object paramObject1, Object paramObject2) {}
    
    public void onRouteUnselected(int paramInt, Object paramObject) {}
    
    public void onRouteVolumeChanged(Object paramObject)
    {
      if (getUserRouteRecord(paramObject) == null)
      {
        int i = findSystemRouteRecord(paramObject);
        if (i >= 0)
        {
          SystemRouteRecord localSystemRouteRecord = (SystemRouteRecord)mSystemRouteRecords.get(i);
          i = MediaRouterJellybean.RouteInfo.getVolume(paramObject);
          if (i != mRouteDescriptor.getVolume())
          {
            mRouteDescriptor = new MediaRouteDescriptor.Builder(mRouteDescriptor).setVolume(i).build();
            publishRoutes();
          }
        }
      }
    }
    
    public void onSyncRouteAdded(MediaRouter.RouteInfo paramRouteInfo)
    {
      if (paramRouteInfo.getProviderInstance() != this)
      {
        Object localObject = MediaRouterJellybean.createUserRoute(mRouterObj, mUserRouteCategoryObj);
        paramRouteInfo = new UserRouteRecord(paramRouteInfo, localObject);
        MediaRouterJellybean.RouteInfo.setTag(localObject, paramRouteInfo);
        MediaRouterJellybean.UserRouteInfo.setVolumeCallback(localObject, mVolumeCallbackObj);
        updateUserRouteProperties(paramRouteInfo);
        mUserRouteRecords.add(paramRouteInfo);
        MediaRouterJellybean.addUserRoute(mRouterObj, localObject);
      }
      else
      {
        int i = findSystemRouteRecord(MediaRouterJellybean.getSelectedRoute(mRouterObj, 8388611));
        if ((i >= 0) && (mSystemRouteRecords.get(i)).mRouteDescriptorId.equals(paramRouteInfo.getDescriptorId()))) {
          paramRouteInfo.select();
        }
      }
    }
    
    public void onSyncRouteChanged(MediaRouter.RouteInfo paramRouteInfo)
    {
      if (paramRouteInfo.getProviderInstance() != this)
      {
        int i = findUserRouteRecord(paramRouteInfo);
        if (i >= 0) {
          updateUserRouteProperties((UserRouteRecord)mUserRouteRecords.get(i));
        }
      }
    }
    
    public void onSyncRouteRemoved(MediaRouter.RouteInfo paramRouteInfo)
    {
      if (paramRouteInfo.getProviderInstance() != this)
      {
        int i = findUserRouteRecord(paramRouteInfo);
        if (i >= 0)
        {
          paramRouteInfo = (UserRouteRecord)mUserRouteRecords.remove(i);
          MediaRouterJellybean.RouteInfo.setTag(mRouteObj, null);
          MediaRouterJellybean.UserRouteInfo.setVolumeCallback(mRouteObj, null);
          MediaRouterJellybean.removeUserRoute(mRouterObj, mRouteObj);
        }
      }
    }
    
    public void onSyncRouteSelected(MediaRouter.RouteInfo paramRouteInfo)
    {
      if (!paramRouteInfo.isSelected()) {
        return;
      }
      int i;
      if (paramRouteInfo.getProviderInstance() != this)
      {
        i = findUserRouteRecord(paramRouteInfo);
        if (i >= 0) {
          selectRoute(mUserRouteRecords.get(i)).mRouteObj);
        }
      }
      else
      {
        i = findSystemRouteRecordByDescriptorId(paramRouteInfo.getDescriptorId());
        if (i >= 0) {
          selectRoute(mSystemRouteRecords.get(i)).mRouteObj);
        }
      }
    }
    
    public void onVolumeSetRequest(Object paramObject, int paramInt)
    {
      paramObject = getUserRouteRecord(paramObject);
      if (paramObject != null) {
        mRoute.requestSetVolume(paramInt);
      }
    }
    
    public void onVolumeUpdateRequest(Object paramObject, int paramInt)
    {
      paramObject = getUserRouteRecord(paramObject);
      if (paramObject != null) {
        mRoute.requestUpdateVolume(paramInt);
      }
    }
    
    public void publishRoutes()
    {
      MediaRouteProviderDescriptor.Builder localBuilder = new MediaRouteProviderDescriptor.Builder();
      int i = mSystemRouteRecords.size();
      for (int j = 0; j < i; j++) {
        localBuilder.addRoute(mSystemRouteRecords.get(j)).mRouteDescriptor);
      }
      setDescriptor(localBuilder.build());
    }
    
    public void selectRoute(Object paramObject)
    {
      if (mSelectRouteWorkaround == null) {
        mSelectRouteWorkaround = new MediaRouterJellybean.SelectRouteWorkaround();
      }
      mSelectRouteWorkaround.selectRoute(mRouterObj, 8388611, paramObject);
    }
    
    public void updateCallback()
    {
      if (mCallbackRegistered)
      {
        mCallbackRegistered = false;
        MediaRouterJellybean.removeCallback(mRouterObj, mCallbackObj);
      }
      int i = mRouteTypes;
      if (i != 0)
      {
        mCallbackRegistered = true;
        MediaRouterJellybean.addCallback(mRouterObj, i, mCallbackObj);
      }
    }
    
    public void updateSystemRouteDescriptor(SystemRouteRecord paramSystemRouteRecord)
    {
      MediaRouteDescriptor.Builder localBuilder = new MediaRouteDescriptor.Builder(mRouteDescriptorId, getRouteName(mRouteObj));
      onBuildSystemRouteDescriptor(paramSystemRouteRecord, localBuilder);
      mRouteDescriptor = localBuilder.build();
    }
    
    public void updateUserRouteProperties(UserRouteRecord paramUserRouteRecord)
    {
      MediaRouterJellybean.UserRouteInfo.setName(mRouteObj, mRoute.getName());
      MediaRouterJellybean.UserRouteInfo.setPlaybackType(mRouteObj, mRoute.getPlaybackType());
      MediaRouterJellybean.UserRouteInfo.setPlaybackStream(mRouteObj, mRoute.getPlaybackStream());
      MediaRouterJellybean.UserRouteInfo.setVolume(mRouteObj, mRoute.getVolume());
      MediaRouterJellybean.UserRouteInfo.setVolumeMax(mRouteObj, mRoute.getVolumeMax());
      MediaRouterJellybean.UserRouteInfo.setVolumeHandling(mRouteObj, mRoute.getVolumeHandling());
    }
    
    public static final class SystemRouteController
      extends MediaRouteProvider.RouteController
    {
      private final Object mRouteObj;
      
      public SystemRouteController(Object paramObject)
      {
        mRouteObj = paramObject;
      }
      
      public void onSetVolume(int paramInt)
      {
        MediaRouterJellybean.RouteInfo.requestSetVolume(mRouteObj, paramInt);
      }
      
      public void onUpdateVolume(int paramInt)
      {
        MediaRouterJellybean.RouteInfo.requestUpdateVolume(mRouteObj, paramInt);
      }
    }
    
    public static final class SystemRouteRecord
    {
      public MediaRouteDescriptor mRouteDescriptor;
      public final String mRouteDescriptorId;
      public final Object mRouteObj;
      
      public SystemRouteRecord(Object paramObject, String paramString)
      {
        mRouteObj = paramObject;
        mRouteDescriptorId = paramString;
      }
    }
    
    public static final class UserRouteRecord
    {
      public final MediaRouter.RouteInfo mRoute;
      public final Object mRouteObj;
      
      public UserRouteRecord(MediaRouter.RouteInfo paramRouteInfo, Object paramObject)
      {
        mRoute = paramRouteInfo;
        mRouteObj = paramObject;
      }
    }
  }
  
  @RequiresApi(17)
  public static class JellybeanMr1Impl
    extends SystemMediaRouteProvider.JellybeanImpl
    implements MediaRouterJellybeanMr1.Callback
  {
    private MediaRouterJellybeanMr1.ActiveScanWorkaround mActiveScanWorkaround;
    private MediaRouterJellybeanMr1.IsConnectingWorkaround mIsConnectingWorkaround;
    
    public JellybeanMr1Impl(Context paramContext, SystemMediaRouteProvider.SyncCallback paramSyncCallback)
    {
      super(paramSyncCallback);
    }
    
    public Object createCallbackObj()
    {
      return MediaRouterJellybeanMr1.createCallback(this);
    }
    
    public boolean isConnecting(SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord paramSystemRouteRecord)
    {
      if (mIsConnectingWorkaround == null) {
        mIsConnectingWorkaround = new MediaRouterJellybeanMr1.IsConnectingWorkaround();
      }
      return mIsConnectingWorkaround.isConnecting(mRouteObj);
    }
    
    public void onBuildSystemRouteDescriptor(SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord paramSystemRouteRecord, MediaRouteDescriptor.Builder paramBuilder)
    {
      super.onBuildSystemRouteDescriptor(paramSystemRouteRecord, paramBuilder);
      if (!MediaRouterJellybeanMr1.RouteInfo.isEnabled(mRouteObj)) {
        paramBuilder.setEnabled(false);
      }
      if (isConnecting(paramSystemRouteRecord)) {
        paramBuilder.setConnectionState(1);
      }
      paramSystemRouteRecord = MediaRouterJellybeanMr1.RouteInfo.getPresentationDisplay(mRouteObj);
      if (paramSystemRouteRecord != null) {
        paramBuilder.setPresentationDisplayId(paramSystemRouteRecord.getDisplayId());
      }
    }
    
    public void onRoutePresentationDisplayChanged(Object paramObject)
    {
      int i = findSystemRouteRecord(paramObject);
      if (i >= 0)
      {
        SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord localSystemRouteRecord = (SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord)mSystemRouteRecords.get(i);
        paramObject = MediaRouterJellybeanMr1.RouteInfo.getPresentationDisplay(paramObject);
        if (paramObject != null) {
          i = ((Display)paramObject).getDisplayId();
        } else {
          i = -1;
        }
        if (i != mRouteDescriptor.getPresentationDisplayId())
        {
          mRouteDescriptor = new MediaRouteDescriptor.Builder(mRouteDescriptor).setPresentationDisplayId(i).build();
          publishRoutes();
        }
      }
    }
    
    public void updateCallback()
    {
      super.updateCallback();
      if (mActiveScanWorkaround == null) {
        mActiveScanWorkaround = new MediaRouterJellybeanMr1.ActiveScanWorkaround(getContext(), getHandler());
      }
      MediaRouterJellybeanMr1.ActiveScanWorkaround localActiveScanWorkaround = mActiveScanWorkaround;
      int i;
      if (mActiveScan) {
        i = mRouteTypes;
      } else {
        i = 0;
      }
      localActiveScanWorkaround.setActiveScanRouteTypes(i);
    }
  }
  
  @RequiresApi(18)
  public static class JellybeanMr2Impl
    extends SystemMediaRouteProvider.JellybeanMr1Impl
  {
    public JellybeanMr2Impl(Context paramContext, SystemMediaRouteProvider.SyncCallback paramSyncCallback)
    {
      super(paramSyncCallback);
    }
    
    public Object getDefaultRoute()
    {
      return MediaRouterJellybeanMr2.getDefaultRoute(mRouterObj);
    }
    
    public boolean isConnecting(SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord paramSystemRouteRecord)
    {
      return MediaRouterJellybeanMr2.RouteInfo.isConnecting(mRouteObj);
    }
    
    public void onBuildSystemRouteDescriptor(SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord paramSystemRouteRecord, MediaRouteDescriptor.Builder paramBuilder)
    {
      super.onBuildSystemRouteDescriptor(paramSystemRouteRecord, paramBuilder);
      paramSystemRouteRecord = MediaRouterJellybeanMr2.RouteInfo.getDescription(mRouteObj);
      if (paramSystemRouteRecord != null) {
        paramBuilder.setDescription(paramSystemRouteRecord.toString());
      }
    }
    
    public void selectRoute(Object paramObject)
    {
      MediaRouterJellybean.selectRoute(mRouterObj, 8388611, paramObject);
    }
    
    public void updateCallback()
    {
      if (mCallbackRegistered) {
        MediaRouterJellybean.removeCallback(mRouterObj, mCallbackObj);
      }
      mCallbackRegistered = true;
      MediaRouterJellybeanMr2.addCallback(mRouterObj, mRouteTypes, mCallbackObj, mActiveScan | true);
    }
    
    public void updateUserRouteProperties(SystemMediaRouteProvider.JellybeanImpl.UserRouteRecord paramUserRouteRecord)
    {
      super.updateUserRouteProperties(paramUserRouteRecord);
      MediaRouterJellybeanMr2.UserRouteInfo.setDescription(mRouteObj, mRoute.getDescription());
    }
  }
  
  public static class LegacyImpl
    extends SystemMediaRouteProvider
  {
    private static final ArrayList<IntentFilter> CONTROL_FILTERS;
    public static final int PLAYBACK_STREAM = 3;
    public final AudioManager mAudioManager;
    public int mLastReportedVolume = -1;
    private final VolumeChangeReceiver mVolumeChangeReceiver;
    
    static
    {
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
      localIntentFilter.addCategory("android.media.intent.category.LIVE_VIDEO");
      ArrayList localArrayList = new ArrayList();
      CONTROL_FILTERS = localArrayList;
      localArrayList.add(localIntentFilter);
    }
    
    public LegacyImpl(Context paramContext)
    {
      super();
      mAudioManager = ((AudioManager)paramContext.getSystemService("audio"));
      VolumeChangeReceiver localVolumeChangeReceiver = new VolumeChangeReceiver();
      mVolumeChangeReceiver = localVolumeChangeReceiver;
      paramContext.registerReceiver(localVolumeChangeReceiver, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
      publishRoutes();
    }
    
    public MediaRouteProvider.RouteController onCreateRouteController(String paramString)
    {
      if (paramString.equals("DEFAULT_ROUTE")) {
        return new DefaultRouteController();
      }
      return null;
    }
    
    public void publishRoutes()
    {
      Object localObject = getContext().getResources();
      int i = mAudioManager.getStreamMaxVolume(3);
      mLastReportedVolume = mAudioManager.getStreamVolume(3);
      localObject = new MediaRouteDescriptor.Builder("DEFAULT_ROUTE", ((Resources)localObject).getString(R.string.mr_system_route_name)).addControlFilters(CONTROL_FILTERS).setPlaybackStream(3).setPlaybackType(0).setVolumeHandling(1).setVolumeMax(i).setVolume(mLastReportedVolume).build();
      setDescriptor(new MediaRouteProviderDescriptor.Builder().addRoute((MediaRouteDescriptor)localObject).build());
    }
    
    public final class DefaultRouteController
      extends MediaRouteProvider.RouteController
    {
      public DefaultRouteController() {}
      
      public void onSetVolume(int paramInt)
      {
        mAudioManager.setStreamVolume(3, paramInt, 0);
        publishRoutes();
      }
      
      public void onUpdateVolume(int paramInt)
      {
        int i = mAudioManager.getStreamVolume(3);
        if (Math.min(mAudioManager.getStreamMaxVolume(3), Math.max(0, paramInt + i)) != i) {
          mAudioManager.setStreamVolume(3, i, 0);
        }
        publishRoutes();
      }
    }
    
    public final class VolumeChangeReceiver
      extends BroadcastReceiver
    {
      public static final String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";
      public static final String EXTRA_VOLUME_STREAM_VALUE = "android.media.EXTRA_VOLUME_STREAM_VALUE";
      public static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
      
      public VolumeChangeReceiver() {}
      
      public void onReceive(Context paramContext, Intent paramIntent)
      {
        if ((paramIntent.getAction().equals("android.media.VOLUME_CHANGED_ACTION")) && (paramIntent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3))
        {
          int i = paramIntent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
          if (i >= 0)
          {
            paramContext = SystemMediaRouteProvider.LegacyImpl.this;
            if (i != mLastReportedVolume) {
              paramContext.publishRoutes();
            }
          }
        }
      }
    }
  }
  
  public static abstract interface SyncCallback
  {
    public abstract void onSystemRouteSelectedByDescriptorId(@NonNull String paramString);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.SystemMediaRouteProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */