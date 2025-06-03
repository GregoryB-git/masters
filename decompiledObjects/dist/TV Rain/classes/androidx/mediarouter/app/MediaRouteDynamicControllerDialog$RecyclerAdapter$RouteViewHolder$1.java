package androidx.mediarouter.app;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaRouter.RouteInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class MediaRouteDynamicControllerDialog$RecyclerAdapter$RouteViewHolder$1
  implements View.OnClickListener
{
  public MediaRouteDynamicControllerDialog$RecyclerAdapter$RouteViewHolder$1(MediaRouteDynamicControllerDialog.RecyclerAdapter.RouteViewHolder paramRouteViewHolder) {}
  
  public void onClick(View paramView)
  {
    paramView = this$2;
    boolean bool1 = paramView.isSelected(mRoute) ^ true;
    boolean bool2 = this$2.mRoute.isGroup();
    if (bool1)
    {
      paramView = this$2;
      this$1.this$0.mRouter.addMemberToDynamicGroup(mRoute);
    }
    else
    {
      paramView = this$2;
      this$1.this$0.mRouter.removeMemberFromDynamicGroup(mRoute);
    }
    this$2.showSelectingProgress(bool1, bool2 ^ true);
    if (bool2)
    {
      List localList = this$2.this$1.this$0.mSelectedRoute.getMemberRoutes();
      paramView = this$2.mRoute.getMemberRoutes().iterator();
      while (paramView.hasNext())
      {
        Object localObject = (MediaRouter.RouteInfo)paramView.next();
        if (localList.contains(localObject) != bool1)
        {
          localObject = (MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder)this$2.this$1.this$0.mVolumeSliderHolderMap.get(((MediaRouter.RouteInfo)localObject).getId());
          if ((localObject instanceof MediaRouteDynamicControllerDialog.RecyclerAdapter.RouteViewHolder)) {
            ((MediaRouteDynamicControllerDialog.RecyclerAdapter.RouteViewHolder)localObject).showSelectingProgress(bool1, true);
          }
        }
      }
    }
    paramView = this$2;
    this$1.mayUpdateGroupVolume(mRoute, bool1);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicControllerDialog.RecyclerAdapter.RouteViewHolder.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */