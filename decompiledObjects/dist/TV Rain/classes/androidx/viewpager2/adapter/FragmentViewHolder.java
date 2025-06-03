package androidx.viewpager2.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public final class FragmentViewHolder
  extends RecyclerView.ViewHolder
{
  private FragmentViewHolder(@NonNull FrameLayout paramFrameLayout)
  {
    super(paramFrameLayout);
  }
  
  @NonNull
  public static FragmentViewHolder create(@NonNull ViewGroup paramViewGroup)
  {
    paramViewGroup = new FrameLayout(paramViewGroup.getContext());
    paramViewGroup.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    paramViewGroup.setId(ViewCompat.generateViewId());
    paramViewGroup.setSaveEnabled(false);
    return new FragmentViewHolder(paramViewGroup);
  }
  
  @NonNull
  public FrameLayout getContainer()
  {
    return (FrameLayout)itemView;
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.adapter.FragmentViewHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */