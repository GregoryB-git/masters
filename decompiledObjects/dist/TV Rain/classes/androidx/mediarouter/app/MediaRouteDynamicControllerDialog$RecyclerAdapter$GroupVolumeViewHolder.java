package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.mediarouter.R.dimen;
import androidx.mediarouter.R.id;
import androidx.mediarouter.media.MediaRouter.RouteInfo;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

class MediaRouteDynamicControllerDialog$RecyclerAdapter$GroupVolumeViewHolder
  extends MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder
{
  private final int mExpandedHeight;
  private final TextView mTextView;
  
  public MediaRouteDynamicControllerDialog$RecyclerAdapter$GroupVolumeViewHolder(MediaRouteDynamicControllerDialog.RecyclerAdapter paramRecyclerAdapter, View paramView)
  {
    super(this$0, paramView, (ImageButton)paramView.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider)paramView.findViewById(R.id.mr_cast_volume_slider));
    mTextView = ((TextView)paramView.findViewById(R.id.mr_group_volume_route_name));
    paramView = this$0.mContext.getResources();
    paramRecyclerAdapter = paramView.getDisplayMetrics();
    TypedValue localTypedValue = new TypedValue();
    paramView.getValue(R.dimen.mr_dynamic_volume_group_list_item_height, localTypedValue, true);
    mExpandedHeight = ((int)localTypedValue.getDimension(paramRecyclerAdapter));
  }
  
  public void bindGroupVolumeViewHolder(MediaRouteDynamicControllerDialog.RecyclerAdapter.Item paramItem)
  {
    View localView = itemView;
    int i;
    if (this$1.isGroupVolumeNeeded()) {
      i = mExpandedHeight;
    } else {
      i = 0;
    }
    MediaRouteDynamicControllerDialog.setLayoutHeight(localView, i);
    paramItem = (MediaRouter.RouteInfo)paramItem.getData();
    super.bindRouteVolumeSliderHolder(paramItem);
    mTextView.setText(paramItem.getName());
  }
  
  public int getExpandedHeight()
  {
    return mExpandedHeight;
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicControllerDialog.RecyclerAdapter.GroupVolumeViewHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */