package androidx.lifecycle;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.runtime.R.id;

public class ViewTreeLifecycleOwner
{
  @Nullable
  public static LifecycleOwner get(@NonNull View paramView)
  {
    LifecycleOwner localLifecycleOwner = (LifecycleOwner)paramView.getTag(R.id.view_tree_lifecycle_owner);
    if (localLifecycleOwner != null) {
      return localLifecycleOwner;
    }
    for (paramView = paramView.getParent(); (localLifecycleOwner == null) && ((paramView instanceof View)); paramView = paramView.getParent())
    {
      paramView = (View)paramView;
      localLifecycleOwner = (LifecycleOwner)paramView.getTag(R.id.view_tree_lifecycle_owner);
    }
    return localLifecycleOwner;
  }
  
  public static void set(@NonNull View paramView, @Nullable LifecycleOwner paramLifecycleOwner)
  {
    paramView.setTag(R.id.view_tree_lifecycle_owner, paramLifecycleOwner);
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ViewTreeLifecycleOwner
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */