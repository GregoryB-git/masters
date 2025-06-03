package androidx.mediarouter.app;

import androidx.mediarouter.media.MediaRouter.RouteInfo;
import java.util.Comparator;

final class MediaRouteChooserDialog$RouteComparator
  implements Comparator<MediaRouter.RouteInfo>
{
  public static final RouteComparator sInstance = new RouteComparator();
  
  public int compare(MediaRouter.RouteInfo paramRouteInfo1, MediaRouter.RouteInfo paramRouteInfo2)
  {
    return paramRouteInfo1.getName().compareToIgnoreCase(paramRouteInfo2.getName());
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteChooserDialog.RouteComparator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */