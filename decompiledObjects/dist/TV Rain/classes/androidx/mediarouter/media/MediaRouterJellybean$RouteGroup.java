package androidx.mediarouter.media;

import android.media.MediaRouter.RouteGroup;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

public final class MediaRouterJellybean$RouteGroup
{
  @NonNull
  public static List getGroupedRoutes(@NonNull Object paramObject)
  {
    MediaRouter.RouteGroup localRouteGroup = (MediaRouter.RouteGroup)paramObject;
    int i = localRouteGroup.getRouteCount();
    paramObject = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      ((ArrayList)paramObject).add(localRouteGroup.getRouteAt(j));
    }
    return (List)paramObject;
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouterJellybean.RouteGroup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */