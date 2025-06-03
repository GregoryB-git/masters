package androidx.mediarouter.media;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class MediaRouteProvider$RouteController
{
  public boolean onControlRequest(@NonNull Intent paramIntent, @Nullable MediaRouter.ControlRequestCallback paramControlRequestCallback)
  {
    return false;
  }
  
  public void onRelease() {}
  
  public void onSelect() {}
  
  public void onSetVolume(int paramInt) {}
  
  @Deprecated
  public void onUnselect() {}
  
  public void onUnselect(int paramInt)
  {
    onUnselect();
  }
  
  public void onUpdateVolume(int paramInt) {}
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouteProvider.RouteController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */