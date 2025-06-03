package androidx.mediarouter.app;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import androidx.mediarouter.media.MediaRouter.RouteInfo;

class MediaRouteDynamicChooserDialog$RecyclerAdapter$RouteViewHolder$1
  implements View.OnClickListener
{
  public MediaRouteDynamicChooserDialog$RecyclerAdapter$RouteViewHolder$1(MediaRouteDynamicChooserDialog.RecyclerAdapter.RouteViewHolder paramRouteViewHolder, MediaRouter.RouteInfo paramRouteInfo) {}
  
  public void onClick(View paramView)
  {
    paramView = this$2.this$1.this$0;
    MediaRouter.RouteInfo localRouteInfo = val$route;
    mSelectingRoute = localRouteInfo;
    localRouteInfo.select();
    this$2.mImageView.setVisibility(4);
    this$2.mProgressBar.setVisibility(0);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicChooserDialog.RecyclerAdapter.RouteViewHolder.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */