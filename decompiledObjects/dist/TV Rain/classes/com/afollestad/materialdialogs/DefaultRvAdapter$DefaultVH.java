package com.afollestad.materialdialogs;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;

class DefaultRvAdapter$DefaultVH
  extends RecyclerView.ViewHolder
  implements View.OnClickListener, View.OnLongClickListener
{
  public final DefaultRvAdapter adapter;
  public final CompoundButton control;
  public final TextView title;
  
  public DefaultRvAdapter$DefaultVH(View paramView, DefaultRvAdapter paramDefaultRvAdapter)
  {
    super(paramView);
    control = ((CompoundButton)paramView.findViewById(R.id.md_control));
    title = ((TextView)paramView.findViewById(R.id.md_title));
    adapter = paramDefaultRvAdapter;
    paramView.setOnClickListener(this);
    if (access$000builder.listLongCallback != null) {
      paramView.setOnLongClickListener(this);
    }
  }
  
  public void onClick(View paramView)
  {
    if ((DefaultRvAdapter.access$100(adapter) != null) && (getAdapterPosition() != -1))
    {
      Object localObject1 = null;
      Object localObject2 = localObject1;
      if (access$000adapter).builder.items != null)
      {
        localObject2 = localObject1;
        if (getAdapterPosition() < access$000adapter).builder.items.size()) {
          localObject2 = (CharSequence)access$000adapter).builder.items.get(getAdapterPosition());
        }
      }
      DefaultRvAdapter.access$100(adapter).onItemSelected(DefaultRvAdapter.access$000(adapter), paramView, getAdapterPosition(), (CharSequence)localObject2, false);
    }
  }
  
  public boolean onLongClick(View paramView)
  {
    if ((DefaultRvAdapter.access$100(adapter) != null) && (getAdapterPosition() != -1))
    {
      Object localObject1 = null;
      Object localObject2 = localObject1;
      if (access$000adapter).builder.items != null)
      {
        localObject2 = localObject1;
        if (getAdapterPosition() < access$000adapter).builder.items.size()) {
          localObject2 = (CharSequence)access$000adapter).builder.items.get(getAdapterPosition());
        }
      }
      return DefaultRvAdapter.access$100(adapter).onItemSelected(DefaultRvAdapter.access$000(adapter), paramView, getAdapterPosition(), (CharSequence)localObject2, true);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.DefaultRvAdapter.DefaultVH
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */