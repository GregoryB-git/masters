package androidx.mediarouter.media;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class MediaRouteProviderDescriptor$Builder
{
  private List<MediaRouteDescriptor> mRoutes;
  private boolean mSupportsDynamicGroupRoute = false;
  
  public MediaRouteProviderDescriptor$Builder() {}
  
  public MediaRouteProviderDescriptor$Builder(@NonNull MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
  {
    if (paramMediaRouteProviderDescriptor != null)
    {
      mRoutes = mRoutes;
      mSupportsDynamicGroupRoute = mSupportsDynamicGroupRoute;
      return;
    }
    throw new IllegalArgumentException("descriptor must not be null");
  }
  
  @NonNull
  public Builder addRoute(@NonNull MediaRouteDescriptor paramMediaRouteDescriptor)
  {
    if (paramMediaRouteDescriptor != null)
    {
      List localList = mRoutes;
      if (localList == null) {
        mRoutes = new ArrayList();
      } else {
        if (localList.contains(paramMediaRouteDescriptor)) {
          break label50;
        }
      }
      mRoutes.add(paramMediaRouteDescriptor);
      return this;
      label50:
      throw new IllegalArgumentException("route descriptor already added");
    }
    throw new IllegalArgumentException("route must not be null");
  }
  
  @NonNull
  public Builder addRoutes(@NonNull Collection<MediaRouteDescriptor> paramCollection)
  {
    if (paramCollection != null)
    {
      if (!paramCollection.isEmpty())
      {
        paramCollection = paramCollection.iterator();
        while (paramCollection.hasNext()) {
          addRoute((MediaRouteDescriptor)paramCollection.next());
        }
      }
      return this;
    }
    throw new IllegalArgumentException("routes must not be null");
  }
  
  @NonNull
  public MediaRouteProviderDescriptor build()
  {
    return new MediaRouteProviderDescriptor(mRoutes, mSupportsDynamicGroupRoute);
  }
  
  @NonNull
  public Builder setRoutes(@Nullable Collection<MediaRouteDescriptor> paramCollection)
  {
    if ((paramCollection != null) && (!paramCollection.isEmpty())) {
      mRoutes = new ArrayList(paramCollection);
    } else {
      mRoutes = null;
    }
    return this;
  }
  
  @NonNull
  public Builder setSupportsDynamicGroupRoute(boolean paramBoolean)
  {
    mSupportsDynamicGroupRoute = paramBoolean;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouteProviderDescriptor.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */