package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
class ViewCompat$Api23Impl
{
  @Nullable
  public static WindowInsetsCompat getRootWindowInsets(@NonNull View paramView)
  {
    Object localObject = paramView.getRootWindowInsets();
    if (localObject == null) {
      return null;
    }
    localObject = WindowInsetsCompat.toWindowInsetsCompat((WindowInsets)localObject);
    ((WindowInsetsCompat)localObject).setRootWindowInsets((WindowInsetsCompat)localObject);
    ((WindowInsetsCompat)localObject).copyRootViewBounds(paramView.getRootView());
    return (WindowInsetsCompat)localObject;
  }
  
  @DoNotInline
  public static int getScrollIndicators(@NonNull View paramView)
  {
    return paramView.getScrollIndicators();
  }
  
  @DoNotInline
  public static void setScrollIndicators(@NonNull View paramView, int paramInt)
  {
    paramView.setScrollIndicators(paramInt);
  }
  
  @DoNotInline
  public static void setScrollIndicators(@NonNull View paramView, int paramInt1, int paramInt2)
  {
    paramView.setScrollIndicators(paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewCompat.Api23Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */