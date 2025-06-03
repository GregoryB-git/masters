package androidx.mediarouter.media;

import android.content.IntentFilter;
import android.media.MediaRoute2Info;
import android.media.MediaRoute2Info.Builder;
import android.media.RouteDiscoveryPreference;
import android.media.RouteDiscoveryPreference.Builder;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.ArraySet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@RequiresApi(api=30)
class MediaRouter2Utils
{
  public static final String FEATURE_EMPTY = "android.media.route.feature.EMPTY";
  public static final String FEATURE_REMOTE_GROUP_PLAYBACK = "android.media.route.feature.REMOTE_GROUP_PLAYBACK";
  public static final String KEY_CONTROL_FILTERS = "androidx.mediarouter.media.KEY_CONTROL_FILTERS";
  public static final String KEY_DEVICE_TYPE = "androidx.mediarouter.media.KEY_DEVICE_TYPE";
  public static final String KEY_EXTRAS = "androidx.mediarouter.media.KEY_EXTRAS";
  public static final String KEY_GROUP_ROUTE = "androidx.mediarouter.media.KEY_GROUP_ROUTE";
  public static final String KEY_MESSENGER = "androidx.mediarouter.media.KEY_MESSENGER";
  public static final String KEY_ORIGINAL_ROUTE_ID = "androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID";
  public static final String KEY_PLAYBACK_TYPE = "androidx.mediarouter.media.KEY_PLAYBACK_TYPE";
  public static final String KEY_SESSION_NAME = "androidx.mediarouter.media.KEY_SESSION_NAME";
  
  @NonNull
  public static List<String> getRouteIds(@Nullable List<MediaRoute2Info> paramList)
  {
    if (paramList == null) {
      return new ArrayList();
    }
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      MediaRoute2Info localMediaRoute2Info = (MediaRoute2Info)paramList.next();
      if (localMediaRoute2Info != null) {
        localArrayList.add(localMediaRoute2Info.getId());
      }
    }
    return localArrayList;
  }
  
  public static String toControlCategory(String paramString)
  {
    paramString.getClass();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1348000558: 
      if (paramString.equals("android.media.route.feature.LIVE_VIDEO")) {
        j = 2;
      }
      break;
    case 1328964233: 
      if (paramString.equals("android.media.route.feature.LIVE_AUDIO")) {
        j = 1;
      }
      break;
    case 94496206: 
      if (paramString.equals("android.media.route.feature.REMOTE_PLAYBACK")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      return paramString;
    case 2: 
      return "android.media.intent.category.LIVE_VIDEO";
    case 1: 
      return "android.media.intent.category.LIVE_AUDIO";
    }
    return "android.media.intent.category.REMOTE_PLAYBACK";
  }
  
  @NonNull
  public static List<IntentFilter> toControlFilters(@Nullable Collection<String> paramCollection)
  {
    if (paramCollection == null) {
      return new ArrayList();
    }
    ArrayList localArrayList = new ArrayList();
    ArraySet localArraySet = new ArraySet();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      paramCollection = (String)localIterator.next();
      if (!localArraySet.contains(paramCollection))
      {
        localArraySet.add(paramCollection);
        IntentFilter localIntentFilter = new IntentFilter();
        localIntentFilter.addCategory(toControlCategory(paramCollection));
        localArrayList.add(localIntentFilter);
      }
    }
    return localArrayList;
  }
  
  @NonNull
  public static RouteDiscoveryPreference toDiscoveryPreference(@Nullable MediaRouteDiscoveryRequest paramMediaRouteDiscoveryRequest)
  {
    if ((paramMediaRouteDiscoveryRequest != null) && (paramMediaRouteDiscoveryRequest.isValid()))
    {
      boolean bool = paramMediaRouteDiscoveryRequest.isActiveScan();
      ArrayList localArrayList = new ArrayList();
      paramMediaRouteDiscoveryRequest = paramMediaRouteDiscoveryRequest.getSelector().getControlCategories().iterator();
      while (paramMediaRouteDiscoveryRequest.hasNext()) {
        localArrayList.add(toRouteFeature((String)paramMediaRouteDiscoveryRequest.next()));
      }
      return new RouteDiscoveryPreference.Builder(localArrayList, bool).build();
    }
    return new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
  }
  
  public static Collection<String> toFeatures(List<IntentFilter> paramList)
  {
    HashSet localHashSet = new HashSet();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      IntentFilter localIntentFilter = (IntentFilter)paramList.next();
      int i = localIntentFilter.countCategories();
      for (int j = 0; j < i; j++) {
        localHashSet.add(toRouteFeature(localIntentFilter.getCategory(j)));
      }
    }
    return localHashSet;
  }
  
  @Nullable
  public static MediaRoute2Info toFwkMediaRoute2Info(@Nullable MediaRouteDescriptor paramMediaRouteDescriptor)
  {
    if (paramMediaRouteDescriptor == null) {
      return null;
    }
    MediaRoute2Info.Builder localBuilder = new MediaRoute2Info.Builder(paramMediaRouteDescriptor.getId(), paramMediaRouteDescriptor.getName()).setDescription(paramMediaRouteDescriptor.getDescription()).setConnectionState(paramMediaRouteDescriptor.getConnectionState()).setVolumeHandling(paramMediaRouteDescriptor.getVolumeHandling()).setVolume(paramMediaRouteDescriptor.getVolume()).setVolumeMax(paramMediaRouteDescriptor.getVolumeMax()).addFeatures(toFeatures(paramMediaRouteDescriptor.getControlFilters())).setIconUri(paramMediaRouteDescriptor.getIconUri());
    int i = paramMediaRouteDescriptor.getDeviceType();
    if (i != 1)
    {
      if (i != 2) {
        break label106;
      }
    }
    else {
      localBuilder.addFeature("android.media.route.feature.REMOTE_VIDEO_PLAYBACK");
    }
    localBuilder.addFeature("android.media.route.feature.REMOTE_AUDIO_PLAYBACK");
    label106:
    if (!paramMediaRouteDescriptor.getGroupMemberIds().isEmpty()) {
      localBuilder.addFeature("android.media.route.feature.REMOTE_GROUP_PLAYBACK");
    }
    Bundle localBundle = new Bundle();
    localBundle.putBundle("androidx.mediarouter.media.KEY_EXTRAS", paramMediaRouteDescriptor.getExtras());
    localBundle.putParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS", new ArrayList(paramMediaRouteDescriptor.getControlFilters()));
    localBundle.putInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", paramMediaRouteDescriptor.getDeviceType());
    localBundle.putInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", paramMediaRouteDescriptor.getPlaybackType());
    localBundle.putString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID", paramMediaRouteDescriptor.getId());
    localBuilder.setExtras(localBundle);
    if (paramMediaRouteDescriptor.getControlFilters().isEmpty()) {
      localBuilder.addFeature("android.media.route.feature.EMPTY");
    }
    return localBuilder.build();
  }
  
  @Nullable
  public static MediaRouteDescriptor toMediaRouteDescriptor(@Nullable MediaRoute2Info paramMediaRoute2Info)
  {
    if (paramMediaRoute2Info == null) {
      return null;
    }
    MediaRouteDescriptor.Builder localBuilder = new MediaRouteDescriptor.Builder(paramMediaRoute2Info.getId(), paramMediaRoute2Info.getName().toString()).setConnectionState(paramMediaRoute2Info.getConnectionState()).setVolumeHandling(paramMediaRoute2Info.getVolumeHandling()).setVolumeMax(paramMediaRoute2Info.getVolumeMax()).setVolume(paramMediaRoute2Info.getVolume()).setExtras(paramMediaRoute2Info.getExtras()).setEnabled(true).setCanDisconnect(false);
    Object localObject = paramMediaRoute2Info.getDescription();
    if (localObject != null) {
      localBuilder.setDescription(((CharSequence)localObject).toString());
    }
    localObject = paramMediaRoute2Info.getIconUri();
    if (localObject != null) {
      localBuilder.setIconUri((Uri)localObject);
    }
    paramMediaRoute2Info = paramMediaRoute2Info.getExtras();
    if ((paramMediaRoute2Info != null) && (paramMediaRoute2Info.containsKey("androidx.mediarouter.media.KEY_EXTRAS")) && (paramMediaRoute2Info.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE")) && (paramMediaRoute2Info.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")))
    {
      localBuilder.setExtras(paramMediaRoute2Info.getBundle("androidx.mediarouter.media.KEY_EXTRAS"));
      localBuilder.setDeviceType(paramMediaRoute2Info.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0));
      localBuilder.setPlaybackType(paramMediaRoute2Info.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
      paramMediaRoute2Info = paramMediaRoute2Info.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
      if (paramMediaRoute2Info != null) {
        localBuilder.addControlFilters(paramMediaRoute2Info);
      }
      return localBuilder.build();
    }
    return null;
  }
  
  @NonNull
  public static MediaRouteDiscoveryRequest toMediaRouteDiscoveryRequest(@NonNull RouteDiscoveryPreference paramRouteDiscoveryPreference)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramRouteDiscoveryPreference.getPreferredFeatures().iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(toControlCategory((String)localIterator.next()));
    }
    return new MediaRouteDiscoveryRequest(new MediaRouteSelector.Builder().addControlCategories(localArrayList).build(), paramRouteDiscoveryPreference.shouldPerformActiveScan());
  }
  
  public static String toRouteFeature(String paramString)
  {
    paramString.getClass();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 975975375: 
      if (paramString.equals("android.media.intent.category.LIVE_VIDEO")) {
        j = 2;
      }
      break;
    case 956939050: 
      if (paramString.equals("android.media.intent.category.LIVE_AUDIO")) {
        j = 1;
      }
      break;
    case -2065577523: 
      if (paramString.equals("android.media.intent.category.REMOTE_PLAYBACK")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      return paramString;
    case 2: 
      return "android.media.route.feature.LIVE_VIDEO";
    case 1: 
      return "android.media.route.feature.LIVE_AUDIO";
    }
    return "android.media.route.feature.REMOTE_PLAYBACK";
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouter2Utils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */