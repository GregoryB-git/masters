package androidx.mediarouter.media;

import android.os.Handler;
import android.os.Message;

final class MediaRouteProvider$ProviderHandler
  extends Handler
{
  public MediaRouteProvider$ProviderHandler(MediaRouteProvider paramMediaRouteProvider) {}
  
  public void handleMessage(Message paramMessage)
  {
    int i = what;
    if (i != 1)
    {
      if (i == 2) {
        this$0.deliverDiscoveryRequestChanged();
      }
    }
    else {
      this$0.deliverDescriptorChanged();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouteProvider.ProviderHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */