package androidx.mediarouter.app;

import android.os.Handler;
import android.os.Message;
import java.util.List;

class MediaRouteDynamicChooserDialog$1
  extends Handler
{
  public MediaRouteDynamicChooserDialog$1(MediaRouteDynamicChooserDialog paramMediaRouteDynamicChooserDialog) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (what == 1) {
      this$0.updateRoutes((List)obj);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicChooserDialog.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */