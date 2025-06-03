package androidx.mediarouter.media;

import androidx.annotation.Nullable;

class MediaRoute2Provider$MemberRouteController
  extends MediaRouteProvider.RouteController
{
  public final MediaRoute2Provider.GroupRouteController mGroupRouteController;
  public final String mOriginalRouteId;
  
  public MediaRoute2Provider$MemberRouteController(@Nullable MediaRoute2Provider paramMediaRoute2Provider, @Nullable String paramString, MediaRoute2Provider.GroupRouteController paramGroupRouteController)
  {
    mOriginalRouteId = paramString;
    mGroupRouteController = paramGroupRouteController;
  }
  
  public void onSetVolume(int paramInt)
  {
    String str = mOriginalRouteId;
    if (str != null)
    {
      MediaRoute2Provider.GroupRouteController localGroupRouteController = mGroupRouteController;
      if (localGroupRouteController != null) {
        localGroupRouteController.setMemberRouteVolume(str, paramInt);
      }
    }
  }
  
  public void onUpdateVolume(int paramInt)
  {
    String str = mOriginalRouteId;
    if (str != null)
    {
      MediaRoute2Provider.GroupRouteController localGroupRouteController = mGroupRouteController;
      if (localGroupRouteController != null) {
        localGroupRouteController.updateMemberRouteVolume(str, paramInt);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRoute2Provider.MemberRouteController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */