package androidx.mediarouter.app;

import android.view.View;
import android.widget.TextView;
import androidx.mediarouter.R.id;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

class MediaRouteDynamicControllerDialog$RecyclerAdapter$HeaderViewHolder
  extends RecyclerView.ViewHolder
{
  private final TextView mTextView;
  
  public MediaRouteDynamicControllerDialog$RecyclerAdapter$HeaderViewHolder(MediaRouteDynamicControllerDialog.RecyclerAdapter paramRecyclerAdapter, View paramView)
  {
    super(paramView);
    mTextView = ((TextView)paramView.findViewById(R.id.mr_cast_header_name));
  }
  
  public void bindHeaderViewHolder(MediaRouteDynamicControllerDialog.RecyclerAdapter.Item paramItem)
  {
    paramItem = paramItem.getData().toString();
    mTextView.setText(paramItem);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicControllerDialog.RecyclerAdapter.HeaderViewHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */