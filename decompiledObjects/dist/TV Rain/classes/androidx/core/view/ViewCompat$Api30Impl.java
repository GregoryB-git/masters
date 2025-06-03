package androidx.core.view;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import l4;

@RequiresApi(30)
class ViewCompat$Api30Impl
{
  @DoNotInline
  public static CharSequence getStateDescription(View paramView)
  {
    return l4.f(paramView);
  }
  
  @Nullable
  public static WindowInsetsControllerCompat getWindowInsetsController(@NonNull View paramView)
  {
    paramView = l4.d(paramView);
    if (paramView != null) {
      paramView = WindowInsetsControllerCompat.toWindowInsetsControllerCompat(paramView);
    } else {
      paramView = null;
    }
    return paramView;
  }
  
  @DoNotInline
  public static void setStateDescription(View paramView, CharSequence paramCharSequence)
  {
    l4.k(paramView, paramCharSequence);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewCompat.Api30Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */