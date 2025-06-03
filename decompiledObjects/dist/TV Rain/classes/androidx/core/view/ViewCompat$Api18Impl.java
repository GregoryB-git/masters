package androidx.core.view;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
class ViewCompat$Api18Impl
{
  @DoNotInline
  public static Rect getClipBounds(@NonNull View paramView)
  {
    return paramView.getClipBounds();
  }
  
  @DoNotInline
  public static boolean isInLayout(@NonNull View paramView)
  {
    return paramView.isInLayout();
  }
  
  @DoNotInline
  public static void setClipBounds(@NonNull View paramView, Rect paramRect)
  {
    paramView.setClipBounds(paramRect);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewCompat.Api18Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */