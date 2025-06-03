package androidx.mediarouter.app;

import android.os.Handler;
import android.os.Message;

class MediaRouteDynamicControllerDialog$1
  extends Handler
{
  public MediaRouteDynamicControllerDialog$1(MediaRouteDynamicControllerDialog paramMediaRouteDynamicControllerDialog) {}
  
  public void handleMessage(Message paramMessage)
  {
    int i = what;
    if (i != 1)
    {
      if (i == 2)
      {
        paramMessage = this$0;
        if (mRouteForVolumeUpdatingByUser != null)
        {
          mRouteForVolumeUpdatingByUser = null;
          paramMessage.updateViewsIfNeeded();
        }
      }
    }
    else {
      this$0.updateRoutesView();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicControllerDialog.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */