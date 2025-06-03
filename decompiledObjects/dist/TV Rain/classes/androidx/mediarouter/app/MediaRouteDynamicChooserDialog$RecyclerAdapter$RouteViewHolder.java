package androidx.mediarouter.app;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.mediarouter.R.id;
import androidx.mediarouter.media.MediaRouter.RouteInfo;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

class MediaRouteDynamicChooserDialog$RecyclerAdapter$RouteViewHolder
  extends RecyclerView.ViewHolder
{
  public final ImageView mImageView;
  public final View mItemView;
  public final ProgressBar mProgressBar;
  public final TextView mTextView;
  
  public MediaRouteDynamicChooserDialog$RecyclerAdapter$RouteViewHolder(MediaRouteDynamicChooserDialog.RecyclerAdapter paramRecyclerAdapter, View paramView)
  {
    super(paramView);
    mItemView = paramView;
    mImageView = ((ImageView)paramView.findViewById(R.id.mr_picker_route_icon));
    ProgressBar localProgressBar = (ProgressBar)paramView.findViewById(R.id.mr_picker_route_progress_bar);
    mProgressBar = localProgressBar;
    mTextView = ((TextView)paramView.findViewById(R.id.mr_picker_route_name));
    MediaRouterThemeHelper.setIndeterminateProgressBarColor(this$0.mContext, localProgressBar);
  }
  
  public void bindRouteView(final MediaRouteDynamicChooserDialog.RecyclerAdapter.Item paramItem)
  {
    paramItem = (MediaRouter.RouteInfo)paramItem.getData();
    mItemView.setVisibility(0);
    mProgressBar.setVisibility(4);
    mItemView.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        paramAnonymousView = this$1.this$0;
        MediaRouter.RouteInfo localRouteInfo = paramItem;
        mSelectingRoute = localRouteInfo;
        localRouteInfo.select();
        mImageView.setVisibility(4);
        mProgressBar.setVisibility(0);
      }
    });
    mTextView.setText(paramItem.getName());
    mImageView.setImageDrawable(this$1.getIconDrawable(paramItem));
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicChooserDialog.RecyclerAdapter.RouteViewHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */