package androidx.viewbinding;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;

public class ViewBindings
{
  @Nullable
  public static <T extends View> T findChildViewById(View paramView, @IdRes int paramInt)
  {
    if (!(paramView instanceof ViewGroup)) {
      return null;
    }
    paramView = (ViewGroup)paramView;
    int i = paramView.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = paramView.getChildAt(j).findViewById(paramInt);
      if (localView != null) {
        return localView;
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     androidx.viewbinding.ViewBindings
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */