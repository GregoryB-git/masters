package androidx.lifecycle;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.viewmodel.R.id;

public class ViewTreeViewModelStoreOwner
{
  @Nullable
  public static ViewModelStoreOwner get(@NonNull View paramView)
  {
    ViewModelStoreOwner localViewModelStoreOwner = (ViewModelStoreOwner)paramView.getTag(R.id.view_tree_view_model_store_owner);
    if (localViewModelStoreOwner != null) {
      return localViewModelStoreOwner;
    }
    for (paramView = paramView.getParent(); (localViewModelStoreOwner == null) && ((paramView instanceof View)); paramView = paramView.getParent())
    {
      paramView = (View)paramView;
      localViewModelStoreOwner = (ViewModelStoreOwner)paramView.getTag(R.id.view_tree_view_model_store_owner);
    }
    return localViewModelStoreOwner;
  }
  
  public static void set(@NonNull View paramView, @Nullable ViewModelStoreOwner paramViewModelStoreOwner)
  {
    paramView.setTag(R.id.view_tree_view_model_store_owner, paramViewModelStoreOwner);
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ViewTreeViewModelStoreOwner
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */