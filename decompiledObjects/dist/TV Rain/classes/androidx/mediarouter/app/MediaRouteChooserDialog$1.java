package androidx.mediarouter.app;

import android.os.Handler;
import android.os.Message;
import java.util.List;

class MediaRouteChooserDialog$1
  extends Handler
{
  public MediaRouteChooserDialog$1(MediaRouteChooserDialog paramMediaRouteChooserDialog) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (what == 1) {
      this$0.updateRoutes((List)obj);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteChooserDialog.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */