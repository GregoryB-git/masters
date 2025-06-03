package androidx.mediarouter.media;

import android.content.ComponentName;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import z2;

public final class MediaRouter$ProviderInfo
{
  private MediaRouteProviderDescriptor mDescriptor;
  private final MediaRouteProvider.ProviderMetadata mMetadata;
  public final MediaRouteProvider mProviderInstance;
  public final List<MediaRouter.RouteInfo> mRoutes = new ArrayList();
  
  public MediaRouter$ProviderInfo(MediaRouteProvider paramMediaRouteProvider)
  {
    mProviderInstance = paramMediaRouteProvider;
    mMetadata = paramMediaRouteProvider.getMetadata();
  }
  
  public MediaRouter.RouteInfo findRouteByDescriptorId(String paramString)
  {
    int i = mRoutes.size();
    for (int j = 0; j < i; j++) {
      if (mRoutes.get(j)).mDescriptorId.equals(paramString)) {
        return (MediaRouter.RouteInfo)mRoutes.get(j);
      }
    }
    return null;
  }
  
  public int findRouteIndexByDescriptorId(String paramString)
  {
    int i = mRoutes.size();
    for (int j = 0; j < i; j++) {
      if (mRoutes.get(j)).mDescriptorId.equals(paramString)) {
        return j;
      }
    }
    return -1;
  }
  
  @NonNull
  public ComponentName getComponentName()
  {
    return mMetadata.getComponentName();
  }
  
  @NonNull
  public String getPackageName()
  {
    return mMetadata.getPackageName();
  }
  
  @NonNull
  public MediaRouteProvider getProviderInstance()
  {
    MediaRouter.checkCallingThread();
    return mProviderInstance;
  }
  
  @NonNull
  public List<MediaRouter.RouteInfo> getRoutes()
  {
    MediaRouter.checkCallingThread();
    return Collections.unmodifiableList(mRoutes);
  }
  
  public boolean supportsDynamicGroup()
  {
    MediaRouteProviderDescriptor localMediaRouteProviderDescriptor = mDescriptor;
    boolean bool;
    if ((localMediaRouteProviderDescriptor != null) && (localMediaRouteProviderDescriptor.supportsDynamicGroupRoute())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("MediaRouter.RouteProviderInfo{ packageName=");
    localStringBuilder.append(getPackageName());
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
  
  public boolean updateDescriptor(MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
  {
    if (mDescriptor != paramMediaRouteProviderDescriptor)
    {
      mDescriptor = paramMediaRouteProviderDescriptor;
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouter.ProviderInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */