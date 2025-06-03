package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.util.Map;

class MediaRouteControllerDialog$8
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public MediaRouteControllerDialog$8(MediaRouteControllerDialog paramMediaRouteControllerDialog, Map paramMap1, Map paramMap2) {}
  
  public void onGlobalLayout()
  {
    this$0.mVolumeGroupList.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    this$0.animateGroupListItemsInternal(val$previousRouteBoundMap, val$previousRouteBitmapMap);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteControllerDialog.8
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */