package androidx.mediarouter.media;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2.RouteCallback;
import androidx.annotation.NonNull;
import java.util.List;

class MediaRoute2Provider$RouteCallback
  extends MediaRouter2.RouteCallback
{
  public MediaRoute2Provider$RouteCallback(MediaRoute2Provider paramMediaRoute2Provider) {}
  
  public void onRoutesAdded(@NonNull List<MediaRoute2Info> paramList)
  {
    this$0.refreshRoutes();
  }
  
  public void onRoutesChanged(@NonNull List<MediaRoute2Info> paramList)
  {
    this$0.refreshRoutes();
  }
  
  public void onRoutesRemoved(@NonNull List<MediaRoute2Info> paramList)
  {
    this$0.refreshRoutes();
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRoute2Provider.RouteCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */