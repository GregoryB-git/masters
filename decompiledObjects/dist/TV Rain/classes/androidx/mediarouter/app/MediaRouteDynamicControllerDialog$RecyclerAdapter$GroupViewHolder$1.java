package androidx.mediarouter.app;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import androidx.mediarouter.media.MediaRouter;

class MediaRouteDynamicControllerDialog$RecyclerAdapter$GroupViewHolder$1
  implements View.OnClickListener
{
  public MediaRouteDynamicControllerDialog$RecyclerAdapter$GroupViewHolder$1(MediaRouteDynamicControllerDialog.RecyclerAdapter.GroupViewHolder paramGroupViewHolder) {}
  
  public void onClick(View paramView)
  {
    paramView = this$2;
    this$1.this$0.mRouter.transferToRoute(mRoute);
    this$2.mImageView.setVisibility(4);
    this$2.mProgressBar.setVisibility(0);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicControllerDialog.RecyclerAdapter.GroupViewHolder.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */