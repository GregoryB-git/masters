package androidx.mediarouter.media;

import android.os.BaseBundle;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import z2;

public final class MediaRouteProviderDescriptor
{
  private static final String KEY_ROUTES = "routes";
  private static final String KEY_SUPPORTS_DYNAMIC_GROUP_ROUTE = "supportsDynamicGroupRoute";
  public Bundle mBundle;
  public final List<MediaRouteDescriptor> mRoutes;
  public final boolean mSupportsDynamicGroupRoute;
  
  public MediaRouteProviderDescriptor(List<MediaRouteDescriptor> paramList, boolean paramBoolean)
  {
    Object localObject = paramList;
    if (paramList == null) {
      localObject = Collections.emptyList();
    }
    mRoutes = ((List)localObject);
    mSupportsDynamicGroupRoute = paramBoolean;
  }
  
  @Nullable
  public static MediaRouteProviderDescriptor fromBundle(@Nullable Bundle paramBundle)
  {
    Object localObject1 = null;
    if (paramBundle == null) {
      return null;
    }
    ArrayList localArrayList = paramBundle.getParcelableArrayList("routes");
    Object localObject2 = localObject1;
    if (localArrayList != null)
    {
      localObject2 = localObject1;
      if (!localArrayList.isEmpty())
      {
        int i = localArrayList.size();
        localObject2 = new ArrayList(i);
        for (int j = 0; j < i; j++) {
          ((ArrayList)localObject2).add(MediaRouteDescriptor.fromBundle((Bundle)localArrayList.get(j)));
        }
      }
    }
    return new MediaRouteProviderDescriptor((List)localObject2, paramBundle.getBoolean("supportsDynamicGroupRoute", false));
  }
  
  @NonNull
  public Bundle asBundle()
  {
    Object localObject = mBundle;
    if (localObject != null) {
      return (Bundle)localObject;
    }
    mBundle = new Bundle();
    localObject = mRoutes;
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      int i = mRoutes.size();
      localObject = new ArrayList(i);
      for (int j = 0; j < i; j++) {
        ((ArrayList)localObject).add(((MediaRouteDescriptor)mRoutes.get(j)).asBundle());
      }
      mBundle.putParcelableArrayList("routes", (ArrayList)localObject);
    }
    mBundle.putBoolean("supportsDynamicGroupRoute", mSupportsDynamicGroupRoute);
    return mBundle;
  }
  
  @NonNull
  public List<MediaRouteDescriptor> getRoutes()
  {
    return mRoutes;
  }
  
  public boolean isValid()
  {
    int i = getRoutes().size();
    int j = 0;
    while (j < i)
    {
      MediaRouteDescriptor localMediaRouteDescriptor = (MediaRouteDescriptor)mRoutes.get(j);
      if ((localMediaRouteDescriptor != null) && (localMediaRouteDescriptor.isValid())) {
        j++;
      } else {
        return false;
      }
    }
    return true;
  }
  
  public boolean supportsDynamicGroupRoute()
  {
    return mSupportsDynamicGroupRoute;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.u("MediaRouteProviderDescriptor{ ", "routes=");
    localStringBuilder.append(Arrays.toString(getRoutes().toArray()));
    localStringBuilder.append(", isValid=");
    localStringBuilder.append(isValid());
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
  
  public static final class Builder
  {
    private List<MediaRouteDescriptor> mRoutes;
    private boolean mSupportsDynamicGroupRoute = false;
    
    public Builder() {}
    
    public Builder(@NonNull MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
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
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouteProviderDescriptor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */