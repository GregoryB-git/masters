package androidx.mediarouter.app;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.mediarouter.R.id;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaRouter.RouteInfo;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;

class MediaRouteDynamicControllerDialog$RecyclerAdapter$GroupViewHolder
  extends RecyclerView.ViewHolder
{
  public final float mDisabledAlpha;
  public final ImageView mImageView;
  public final View mItemView;
  public final ProgressBar mProgressBar;
  public MediaRouter.RouteInfo mRoute;
  public final TextView mTextView;
  
  public MediaRouteDynamicControllerDialog$RecyclerAdapter$GroupViewHolder(MediaRouteDynamicControllerDialog.RecyclerAdapter paramRecyclerAdapter, View paramView)
  {
    super(paramView);
    mItemView = paramView;
    mImageView = ((ImageView)paramView.findViewById(R.id.mr_cast_group_icon));
    ProgressBar localProgressBar = (ProgressBar)paramView.findViewById(R.id.mr_cast_group_progress_bar);
    mProgressBar = localProgressBar;
    mTextView = ((TextView)paramView.findViewById(R.id.mr_cast_group_name));
    mDisabledAlpha = MediaRouterThemeHelper.getDisabledAlpha(this$0.mContext);
    MediaRouterThemeHelper.setIndeterminateProgressBarColor(this$0.mContext, localProgressBar);
  }
  
  private boolean isEnabled(MediaRouter.RouteInfo paramRouteInfo)
  {
    List localList = this$1.this$0.mSelectedRoute.getMemberRoutes();
    return (localList.size() != 1) || (localList.get(0) != paramRouteInfo);
  }
  
  public void bindGroupViewHolder(MediaRouteDynamicControllerDialog.RecyclerAdapter.Item paramItem)
  {
    MediaRouter.RouteInfo localRouteInfo = (MediaRouter.RouteInfo)paramItem.getData();
    mRoute = localRouteInfo;
    mImageView.setVisibility(0);
    mProgressBar.setVisibility(4);
    boolean bool = isEnabled(localRouteInfo);
    paramItem = mItemView;
    float f;
    if (bool) {
      f = 1.0F;
    } else {
      f = mDisabledAlpha;
    }
    paramItem.setAlpha(f);
    mItemView.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        paramAnonymousView = MediaRouteDynamicControllerDialog.RecyclerAdapter.GroupViewHolder.this;
        this$1.this$0.mRouter.transferToRoute(mRoute);
        mImageView.setVisibility(4);
        mProgressBar.setVisibility(0);
      }
    });
    mImageView.setImageDrawable(this$1.getIconDrawable(localRouteInfo));
    mTextView.setText(localRouteInfo.getName());
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicControllerDialog.RecyclerAdapter.GroupViewHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */