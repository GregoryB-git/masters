package androidx.mediarouter.app;

import android.view.View;
import android.widget.TextView;
import androidx.mediarouter.R.id;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

class MediaRouteDynamicChooserDialog$RecyclerAdapter$HeaderViewHolder
  extends RecyclerView.ViewHolder
{
  public TextView mTextView;
  
  public MediaRouteDynamicChooserDialog$RecyclerAdapter$HeaderViewHolder(MediaRouteDynamicChooserDialog.RecyclerAdapter paramRecyclerAdapter, View paramView)
  {
    super(paramView);
    mTextView = ((TextView)paramView.findViewById(R.id.mr_picker_header_name));
  }
  
  public void bindHeaderView(MediaRouteDynamicChooserDialog.RecyclerAdapter.Item paramItem)
  {
    paramItem = paramItem.getData().toString();
    mTextView.setText(paramItem);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicChooserDialog.RecyclerAdapter.HeaderViewHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */