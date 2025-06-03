package androidx.mediarouter.media;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.core.util.ObjectsCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import z2;

public class MediaRouter$RouteInfo
{
  public static final int CHANGE_GENERAL = 1;
  public static final int CHANGE_PRESENTATION_DISPLAY = 4;
  public static final int CHANGE_VOLUME = 2;
  public static final int CONNECTION_STATE_CONNECTED = 2;
  public static final int CONNECTION_STATE_CONNECTING = 1;
  public static final int CONNECTION_STATE_DISCONNECTED = 0;
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final int DEVICE_TYPE_BLUETOOTH = 3;
  public static final int DEVICE_TYPE_SPEAKER = 2;
  public static final int DEVICE_TYPE_TV = 1;
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final int DEVICE_TYPE_UNKNOWN = 0;
  public static final int PLAYBACK_TYPE_LOCAL = 0;
  public static final int PLAYBACK_TYPE_REMOTE = 1;
  public static final int PLAYBACK_VOLUME_FIXED = 0;
  public static final int PLAYBACK_VOLUME_VARIABLE = 1;
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final int PRESENTATION_DISPLAY_ID_NONE = -1;
  public static final String SYSTEM_MEDIA_ROUTE_PROVIDER_PACKAGE_NAME = "android";
  private boolean mCanDisconnect;
  private int mConnectionState;
  private final ArrayList<IntentFilter> mControlFilters = new ArrayList();
  private String mDescription;
  public MediaRouteDescriptor mDescriptor;
  public final String mDescriptorId;
  private int mDeviceType;
  private Map<String, MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> mDynamicGroupDescriptors;
  public boolean mEnabled;
  private Bundle mExtras;
  private Uri mIconUri;
  private List<RouteInfo> mMemberRoutes = new ArrayList();
  private String mName;
  private int mPlaybackStream;
  private int mPlaybackType;
  private Display mPresentationDisplay;
  private int mPresentationDisplayId = -1;
  private final MediaRouter.ProviderInfo mProvider;
  private IntentSender mSettingsIntent;
  public final String mUniqueId;
  private int mVolume;
  private int mVolumeHandling;
  private int mVolumeMax;
  
  public MediaRouter$RouteInfo(MediaRouter.ProviderInfo paramProviderInfo, String paramString1, String paramString2)
  {
    mProvider = paramProviderInfo;
    mDescriptorId = paramString1;
    mUniqueId = paramString2;
  }
  
  private boolean isSameControlFilter(IntentFilter paramIntentFilter1, IntentFilter paramIntentFilter2)
  {
    if (paramIntentFilter1 == paramIntentFilter2) {
      return true;
    }
    if ((paramIntentFilter1 != null) && (paramIntentFilter2 != null))
    {
      int i = paramIntentFilter1.countActions();
      if (i != paramIntentFilter2.countActions()) {
        return false;
      }
      for (int j = 0; j < i; j++) {
        if (!paramIntentFilter1.getAction(j).equals(paramIntentFilter2.getAction(j))) {
          return false;
        }
      }
      i = paramIntentFilter1.countCategories();
      if (i != paramIntentFilter2.countCategories()) {
        return false;
      }
      for (j = 0; j < i; j++) {
        if (!paramIntentFilter1.getCategory(j).equals(paramIntentFilter2.getCategory(j))) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  private boolean isSameControlFilters(List<IntentFilter> paramList1, List<IntentFilter> paramList2)
  {
    boolean bool = true;
    if (paramList1 == paramList2) {
      return true;
    }
    if ((paramList1 != null) && (paramList2 != null))
    {
      paramList1 = paramList1.listIterator();
      paramList2 = paramList2.listIterator();
      while ((paramList1.hasNext()) && (paramList2.hasNext())) {
        if (!isSameControlFilter((IntentFilter)paramList1.next(), (IntentFilter)paramList2.next())) {
          return false;
        }
      }
      if ((paramList1.hasNext()) || (paramList2.hasNext())) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  private static boolean isSystemMediaRouteProvider(RouteInfo paramRouteInfo)
  {
    return TextUtils.equals(paramRouteInfo.getProviderInstance().getMetadata().getPackageName(), "android");
  }
  
  public boolean canDisconnect()
  {
    return mCanDisconnect;
  }
  
  public RouteInfo findRouteByDynamicRouteDescriptor(MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor paramDynamicRouteDescriptor)
  {
    paramDynamicRouteDescriptor = paramDynamicRouteDescriptor.getRouteDescriptor().getId();
    return getProvider().findRouteByDescriptorId(paramDynamicRouteDescriptor);
  }
  
  public int getConnectionState()
  {
    return mConnectionState;
  }
  
  @NonNull
  public List<IntentFilter> getControlFilters()
  {
    return mControlFilters;
  }
  
  @Nullable
  public String getDescription()
  {
    return mDescription;
  }
  
  public String getDescriptorId()
  {
    return mDescriptorId;
  }
  
  public int getDeviceType()
  {
    return mDeviceType;
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public MediaRouteProvider.DynamicGroupRouteController getDynamicGroupController()
  {
    MediaRouter.checkCallingThread();
    MediaRouteProvider.RouteController localRouteController = getGlobalRoutermSelectedRouteController;
    if ((localRouteController instanceof MediaRouteProvider.DynamicGroupRouteController)) {
      return (MediaRouteProvider.DynamicGroupRouteController)localRouteController;
    }
    return null;
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public DynamicGroupState getDynamicGroupState(@NonNull RouteInfo paramRouteInfo)
  {
    if (paramRouteInfo != null)
    {
      Map localMap = mDynamicGroupDescriptors;
      if ((localMap != null) && (localMap.containsKey(mUniqueId))) {
        return new DynamicGroupState((MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor)mDynamicGroupDescriptors.get(mUniqueId));
      }
      return null;
    }
    throw new NullPointerException("route must not be null");
  }
  
  @Nullable
  public Bundle getExtras()
  {
    return mExtras;
  }
  
  @Nullable
  public Uri getIconUri()
  {
    return mIconUri;
  }
  
  @NonNull
  public String getId()
  {
    return mUniqueId;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public List<RouteInfo> getMemberRoutes()
  {
    return Collections.unmodifiableList(mMemberRoutes);
  }
  
  @NonNull
  public String getName()
  {
    return mName;
  }
  
  public int getPlaybackStream()
  {
    return mPlaybackStream;
  }
  
  public int getPlaybackType()
  {
    return mPlaybackType;
  }
  
  @Nullable
  public Display getPresentationDisplay()
  {
    
    if ((mPresentationDisplayId >= 0) && (mPresentationDisplay == null)) {
      mPresentationDisplay = MediaRouter.getGlobalRouter().getDisplay(mPresentationDisplayId);
    }
    return mPresentationDisplay;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public int getPresentationDisplayId()
  {
    return mPresentationDisplayId;
  }
  
  @NonNull
  public MediaRouter.ProviderInfo getProvider()
  {
    return mProvider;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public MediaRouteProvider getProviderInstance()
  {
    return mProvider.getProviderInstance();
  }
  
  @Nullable
  public IntentSender getSettingsIntent()
  {
    return mSettingsIntent;
  }
  
  public int getVolume()
  {
    return mVolume;
  }
  
  public int getVolumeHandling()
  {
    if ((isGroup()) && (!MediaRouter.isGroupVolumeUxEnabled())) {
      return 0;
    }
    return mVolumeHandling;
  }
  
  public int getVolumeMax()
  {
    return mVolumeMax;
  }
  
  public boolean isBluetooth()
  {
    
    boolean bool;
    if (MediaRouter.getGlobalRouter().getBluetoothRoute() == this) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Deprecated
  public boolean isConnecting()
  {
    int i = mConnectionState;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  public boolean isDefault()
  {
    
    boolean bool;
    if (MediaRouter.getGlobalRouter().getDefaultRoute() == this) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public boolean isDefaultOrBluetooth()
  {
    boolean bool1 = isDefault();
    boolean bool2 = true;
    boolean bool3 = bool2;
    if (!bool1) {
      if (mDeviceType == 3) {
        bool3 = bool2;
      } else if ((isSystemMediaRouteProvider(this)) && (supportsControlCategory("android.media.intent.category.LIVE_AUDIO")) && (!supportsControlCategory("android.media.intent.category.LIVE_VIDEO"))) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
    }
    return bool3;
  }
  
  public boolean isDeviceSpeaker()
  {
    int i = Resources.getSystem().getIdentifier("default_audio_route_name", "string", "android");
    boolean bool;
    if ((isDefault()) && (TextUtils.equals(Resources.getSystem().getText(i), mName))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isEnabled()
  {
    return mEnabled;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public boolean isGroup()
  {
    int i = getMemberRoutes().size();
    boolean bool = true;
    if (i < 1) {
      bool = false;
    }
    return bool;
  }
  
  public boolean isSelectable()
  {
    boolean bool;
    if ((mDescriptor != null) && (mEnabled)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isSelected()
  {
    
    boolean bool;
    if (MediaRouter.getGlobalRouter().getSelectedRoute() == this) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean matchesSelector(@NonNull MediaRouteSelector paramMediaRouteSelector)
  {
    if (paramMediaRouteSelector != null)
    {
      MediaRouter.checkCallingThread();
      return paramMediaRouteSelector.matchesControlFilters(mControlFilters);
    }
    throw new IllegalArgumentException("selector must not be null");
  }
  
  public int maybeUpdateDescriptor(MediaRouteDescriptor paramMediaRouteDescriptor)
  {
    int i;
    if (mDescriptor != paramMediaRouteDescriptor) {
      i = updateDescriptor(paramMediaRouteDescriptor);
    } else {
      i = 0;
    }
    return i;
  }
  
  public void requestSetVolume(int paramInt)
  {
    MediaRouter.checkCallingThread();
    MediaRouter.getGlobalRouter().requestSetVolume(this, Math.min(mVolumeMax, Math.max(0, paramInt)));
  }
  
  public void requestUpdateVolume(int paramInt)
  {
    
    if (paramInt != 0) {
      MediaRouter.getGlobalRouter().requestUpdateVolume(this, paramInt);
    }
  }
  
  public void select()
  {
    MediaRouter.checkCallingThread();
    MediaRouter.getGlobalRouter().selectRoute(this, 3);
  }
  
  public void sendControlRequest(@NonNull Intent paramIntent, @Nullable MediaRouter.ControlRequestCallback paramControlRequestCallback)
  {
    if (paramIntent != null)
    {
      MediaRouter.checkCallingThread();
      MediaRouter.getGlobalRouter().sendControlRequest(this, paramIntent, paramControlRequestCallback);
      return;
    }
    throw new IllegalArgumentException("intent must not be null");
  }
  
  public boolean supportsControlAction(@NonNull String paramString1, @NonNull String paramString2)
  {
    if (paramString1 != null)
    {
      if (paramString2 != null)
      {
        MediaRouter.checkCallingThread();
        int i = mControlFilters.size();
        for (int j = 0; j < i; j++)
        {
          IntentFilter localIntentFilter = (IntentFilter)mControlFilters.get(j);
          if ((localIntentFilter.hasCategory(paramString1)) && (localIntentFilter.hasAction(paramString2))) {
            return true;
          }
        }
        return false;
      }
      throw new IllegalArgumentException("action must not be null");
    }
    throw new IllegalArgumentException("category must not be null");
  }
  
  public boolean supportsControlCategory(@NonNull String paramString)
  {
    if (paramString != null)
    {
      MediaRouter.checkCallingThread();
      int i = mControlFilters.size();
      for (int j = 0; j < i; j++) {
        if (((IntentFilter)mControlFilters.get(j)).hasCategory(paramString)) {
          return true;
        }
      }
      return false;
    }
    throw new IllegalArgumentException("category must not be null");
  }
  
  public boolean supportsControlRequest(@NonNull Intent paramIntent)
  {
    if (paramIntent != null)
    {
      MediaRouter.checkCallingThread();
      ContentResolver localContentResolver = MediaRouter.getGlobalRouter().getContentResolver();
      int i = mControlFilters.size();
      for (int j = 0; j < i; j++) {
        if (((IntentFilter)mControlFilters.get(j)).match(localContentResolver, paramIntent, true, "MediaRouter") >= 0) {
          return true;
        }
      }
      return false;
    }
    throw new IllegalArgumentException("intent must not be null");
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = z2.t("MediaRouter.RouteInfo{ uniqueId=");
    localStringBuilder2.append(mUniqueId);
    localStringBuilder2.append(", name=");
    localStringBuilder2.append(mName);
    localStringBuilder2.append(", description=");
    localStringBuilder2.append(mDescription);
    localStringBuilder2.append(", iconUri=");
    localStringBuilder2.append(mIconUri);
    localStringBuilder2.append(", enabled=");
    localStringBuilder2.append(mEnabled);
    localStringBuilder2.append(", connectionState=");
    localStringBuilder2.append(mConnectionState);
    localStringBuilder2.append(", canDisconnect=");
    localStringBuilder2.append(mCanDisconnect);
    localStringBuilder2.append(", playbackType=");
    localStringBuilder2.append(mPlaybackType);
    localStringBuilder2.append(", playbackStream=");
    localStringBuilder2.append(mPlaybackStream);
    localStringBuilder2.append(", deviceType=");
    localStringBuilder2.append(mDeviceType);
    localStringBuilder2.append(", volumeHandling=");
    localStringBuilder2.append(mVolumeHandling);
    localStringBuilder2.append(", volume=");
    localStringBuilder2.append(mVolume);
    localStringBuilder2.append(", volumeMax=");
    localStringBuilder2.append(mVolumeMax);
    localStringBuilder2.append(", presentationDisplayId=");
    localStringBuilder2.append(mPresentationDisplayId);
    localStringBuilder2.append(", extras=");
    localStringBuilder2.append(mExtras);
    localStringBuilder2.append(", settingsIntent=");
    localStringBuilder2.append(mSettingsIntent);
    localStringBuilder2.append(", providerPackageName=");
    localStringBuilder2.append(mProvider.getPackageName());
    localStringBuilder1.append(localStringBuilder2.toString());
    if (isGroup())
    {
      localStringBuilder1.append(", members=[");
      int i = mMemberRoutes.size();
      for (int j = 0; j < i; j++)
      {
        if (j > 0) {
          localStringBuilder1.append(", ");
        }
        if (mMemberRoutes.get(j) != this) {
          localStringBuilder1.append(((RouteInfo)mMemberRoutes.get(j)).getId());
        }
      }
      localStringBuilder1.append(']');
    }
    localStringBuilder1.append(" }");
    return localStringBuilder1.toString();
  }
  
  public int updateDescriptor(MediaRouteDescriptor paramMediaRouteDescriptor)
  {
    mDescriptor = paramMediaRouteDescriptor;
    int i = 0;
    int j = 0;
    if (paramMediaRouteDescriptor != null)
    {
      if (!ObjectsCompat.equals(mName, paramMediaRouteDescriptor.getName()))
      {
        mName = paramMediaRouteDescriptor.getName();
        k = 1;
      }
      else
      {
        k = 0;
      }
      i = k;
      if (!ObjectsCompat.equals(mDescription, paramMediaRouteDescriptor.getDescription()))
      {
        mDescription = paramMediaRouteDescriptor.getDescription();
        i = k | 0x1;
      }
      int k = i;
      if (!ObjectsCompat.equals(mIconUri, paramMediaRouteDescriptor.getIconUri()))
      {
        mIconUri = paramMediaRouteDescriptor.getIconUri();
        k = i | 0x1;
      }
      int m = k;
      if (mEnabled != paramMediaRouteDescriptor.isEnabled())
      {
        mEnabled = paramMediaRouteDescriptor.isEnabled();
        m = k | 0x1;
      }
      i = m;
      if (mConnectionState != paramMediaRouteDescriptor.getConnectionState())
      {
        mConnectionState = paramMediaRouteDescriptor.getConnectionState();
        i = m | 0x1;
      }
      k = i;
      if (!isSameControlFilters(mControlFilters, paramMediaRouteDescriptor.getControlFilters()))
      {
        mControlFilters.clear();
        mControlFilters.addAll(paramMediaRouteDescriptor.getControlFilters());
        k = i | 0x1;
      }
      i = k;
      if (mPlaybackType != paramMediaRouteDescriptor.getPlaybackType())
      {
        mPlaybackType = paramMediaRouteDescriptor.getPlaybackType();
        i = k | 0x1;
      }
      m = i;
      if (mPlaybackStream != paramMediaRouteDescriptor.getPlaybackStream())
      {
        mPlaybackStream = paramMediaRouteDescriptor.getPlaybackStream();
        m = i | 0x1;
      }
      k = m;
      if (mDeviceType != paramMediaRouteDescriptor.getDeviceType())
      {
        mDeviceType = paramMediaRouteDescriptor.getDeviceType();
        k = m | 0x1;
      }
      i = k;
      if (mVolumeHandling != paramMediaRouteDescriptor.getVolumeHandling())
      {
        mVolumeHandling = paramMediaRouteDescriptor.getVolumeHandling();
        i = k | 0x3;
      }
      k = i;
      if (mVolume != paramMediaRouteDescriptor.getVolume())
      {
        mVolume = paramMediaRouteDescriptor.getVolume();
        k = i | 0x3;
      }
      i = k;
      if (mVolumeMax != paramMediaRouteDescriptor.getVolumeMax())
      {
        mVolumeMax = paramMediaRouteDescriptor.getVolumeMax();
        i = k | 0x3;
      }
      k = i;
      if (mPresentationDisplayId != paramMediaRouteDescriptor.getPresentationDisplayId())
      {
        mPresentationDisplayId = paramMediaRouteDescriptor.getPresentationDisplayId();
        mPresentationDisplay = null;
        k = i | 0x5;
      }
      i = k;
      if (!ObjectsCompat.equals(mExtras, paramMediaRouteDescriptor.getExtras()))
      {
        mExtras = paramMediaRouteDescriptor.getExtras();
        i = k | 0x1;
      }
      m = i;
      if (!ObjectsCompat.equals(mSettingsIntent, paramMediaRouteDescriptor.getSettingsActivity()))
      {
        mSettingsIntent = paramMediaRouteDescriptor.getSettingsActivity();
        m = i | 0x1;
      }
      k = m;
      if (mCanDisconnect != paramMediaRouteDescriptor.canDisconnectAndKeepPlaying())
      {
        mCanDisconnect = paramMediaRouteDescriptor.canDisconnectAndKeepPlaying();
        k = m | 0x5;
      }
      Object localObject1 = paramMediaRouteDescriptor.getGroupMemberIds();
      ArrayList localArrayList = new ArrayList();
      i = j;
      if (((List)localObject1).size() != mMemberRoutes.size()) {
        i = 1;
      }
      m = i;
      if (!((List)localObject1).isEmpty())
      {
        paramMediaRouteDescriptor = MediaRouter.getGlobalRouter();
        localObject1 = ((List)localObject1).iterator();
        for (;;)
        {
          m = i;
          if (!((Iterator)localObject1).hasNext()) {
            break;
          }
          Object localObject2 = (String)((Iterator)localObject1).next();
          localObject2 = paramMediaRouteDescriptor.getRoute(paramMediaRouteDescriptor.getUniqueId(getProvider(), (String)localObject2));
          if (localObject2 != null)
          {
            localArrayList.add(localObject2);
            if ((i == 0) && (!mMemberRoutes.contains(localObject2))) {
              i = 1;
            }
          }
        }
      }
      if (m != 0)
      {
        mMemberRoutes = localArrayList;
        i = k | 0x1;
      }
      else
      {
        i = k;
      }
    }
    return i;
  }
  
  public void updateDynamicDescriptors(Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> paramCollection)
  {
    mMemberRoutes.clear();
    if (mDynamicGroupDescriptors == null) {
      mDynamicGroupDescriptors = new ArrayMap();
    }
    mDynamicGroupDescriptors.clear();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor localDynamicRouteDescriptor = (MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor)localIterator.next();
      paramCollection = findRouteByDynamicRouteDescriptor(localDynamicRouteDescriptor);
      if (paramCollection != null)
      {
        mDynamicGroupDescriptors.put(mUniqueId, localDynamicRouteDescriptor);
        if ((localDynamicRouteDescriptor.getSelectionState() == 2) || (localDynamicRouteDescriptor.getSelectionState() == 3)) {
          mMemberRoutes.add(paramCollection);
        }
      }
    }
    getGlobalRoutermCallbackHandler.post(259, this);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final class DynamicGroupState
  {
    public final MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor mDynamicDescriptor;
    
    public DynamicGroupState(MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor paramDynamicRouteDescriptor)
    {
      mDynamicDescriptor = paramDynamicRouteDescriptor;
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public int getSelectionState()
    {
      MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor localDynamicRouteDescriptor = mDynamicDescriptor;
      int i;
      if (localDynamicRouteDescriptor != null) {
        i = localDynamicRouteDescriptor.getSelectionState();
      } else {
        i = 1;
      }
      return i;
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public boolean isGroupable()
    {
      MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor localDynamicRouteDescriptor = mDynamicDescriptor;
      boolean bool;
      if ((localDynamicRouteDescriptor != null) && (localDynamicRouteDescriptor.isGroupable())) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public boolean isTransferable()
    {
      MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor localDynamicRouteDescriptor = mDynamicDescriptor;
      boolean bool;
      if ((localDynamicRouteDescriptor != null) && (localDynamicRouteDescriptor.isTransferable())) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public boolean isUnselectable()
    {
      MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor localDynamicRouteDescriptor = mDynamicDescriptor;
      boolean bool;
      if ((localDynamicRouteDescriptor != null) && (!localDynamicRouteDescriptor.isUnselectable())) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouter.RouteInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */