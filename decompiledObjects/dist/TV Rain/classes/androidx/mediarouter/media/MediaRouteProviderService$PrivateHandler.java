package androidx.mediarouter.media;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;

final class MediaRouteProviderService$PrivateHandler
  extends Handler
{
  public MediaRouteProviderService$PrivateHandler(MediaRouteProviderService paramMediaRouteProviderService) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (what == 1) {
      this$0.mImpl.onBinderDied((Messenger)obj);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouteProviderService.PrivateHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */