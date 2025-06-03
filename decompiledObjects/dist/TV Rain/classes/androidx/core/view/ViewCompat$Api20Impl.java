package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(20)
class ViewCompat$Api20Impl
{
  @DoNotInline
  public static WindowInsets dispatchApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    return paramView.dispatchApplyWindowInsets(paramWindowInsets);
  }
  
  @DoNotInline
  public static WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    return paramView.onApplyWindowInsets(paramWindowInsets);
  }
  
  @DoNotInline
  public static void requestApplyInsets(View paramView)
  {
    paramView.requestApplyInsets();
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewCompat.Api20Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */