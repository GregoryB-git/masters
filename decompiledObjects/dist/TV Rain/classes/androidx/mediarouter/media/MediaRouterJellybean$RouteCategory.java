package androidx.mediarouter.media;

import android.content.Context;
import android.media.MediaRouter.RouteCategory;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public final class MediaRouterJellybean$RouteCategory
{
  @Nullable
  public static CharSequence getName(@NonNull Object paramObject, @NonNull Context paramContext)
  {
    return ((MediaRouter.RouteCategory)paramObject).getName(paramContext);
  }
  
  @NonNull
  public static List getRoutes(@NonNull Object paramObject)
  {
    ArrayList localArrayList = new ArrayList();
    ((MediaRouter.RouteCategory)paramObject).getRoutes(localArrayList);
    return localArrayList;
  }
  
  public static int getSupportedTypes(@NonNull Object paramObject)
  {
    return ((MediaRouter.RouteCategory)paramObject).getSupportedTypes();
  }
  
  public static boolean isGroupable(@NonNull Object paramObject)
  {
    return ((MediaRouter.RouteCategory)paramObject).isGroupable();
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouterJellybean.RouteCategory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */