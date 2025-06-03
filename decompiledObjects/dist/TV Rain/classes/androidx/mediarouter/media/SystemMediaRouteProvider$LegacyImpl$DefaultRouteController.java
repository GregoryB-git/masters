package androidx.mediarouter.media;

import android.media.AudioManager;

final class SystemMediaRouteProvider$LegacyImpl$DefaultRouteController
  extends MediaRouteProvider.RouteController
{
  public SystemMediaRouteProvider$LegacyImpl$DefaultRouteController(SystemMediaRouteProvider.LegacyImpl paramLegacyImpl) {}
  
  public void onSetVolume(int paramInt)
  {
    this$0.mAudioManager.setStreamVolume(3, paramInt, 0);
    this$0.publishRoutes();
  }
  
  public void onUpdateVolume(int paramInt)
  {
    int i = this$0.mAudioManager.getStreamVolume(3);
    if (Math.min(this$0.mAudioManager.getStreamMaxVolume(3), Math.max(0, paramInt + i)) != i) {
      this$0.mAudioManager.setStreamVolume(3, i, 0);
    }
    this$0.publishRoutes();
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.SystemMediaRouteProvider.LegacyImpl.DefaultRouteController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */