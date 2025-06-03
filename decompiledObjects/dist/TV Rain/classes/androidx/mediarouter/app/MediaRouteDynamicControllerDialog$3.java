package androidx.mediarouter.app;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.app.AppCompatDialog;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaRouter.RouteInfo;

class MediaRouteDynamicControllerDialog$3
  implements View.OnClickListener
{
  public MediaRouteDynamicControllerDialog$3(MediaRouteDynamicControllerDialog paramMediaRouteDynamicControllerDialog) {}
  
  public void onClick(View paramView)
  {
    if (this$0.mSelectedRoute.isSelected()) {
      this$0.mRouter.unselect(2);
    }
    this$0.dismiss();
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicControllerDialog.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */