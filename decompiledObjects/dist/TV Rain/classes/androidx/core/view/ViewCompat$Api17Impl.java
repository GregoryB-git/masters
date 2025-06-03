package androidx.core.view;

import android.graphics.Paint;
import android.view.Display;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(17)
class ViewCompat$Api17Impl
{
  @DoNotInline
  public static int generateViewId()
  {
    return View.generateViewId();
  }
  
  @DoNotInline
  public static Display getDisplay(@NonNull View paramView)
  {
    return paramView.getDisplay();
  }
  
  @DoNotInline
  public static int getLabelFor(View paramView)
  {
    return paramView.getLabelFor();
  }
  
  @DoNotInline
  public static int getLayoutDirection(View paramView)
  {
    return paramView.getLayoutDirection();
  }
  
  @DoNotInline
  public static int getPaddingEnd(View paramView)
  {
    return paramView.getPaddingEnd();
  }
  
  @DoNotInline
  public static int getPaddingStart(View paramView)
  {
    return paramView.getPaddingStart();
  }
  
  @DoNotInline
  public static boolean isPaddingRelative(View paramView)
  {
    return paramView.isPaddingRelative();
  }
  
  @DoNotInline
  public static void setLabelFor(View paramView, int paramInt)
  {
    paramView.setLabelFor(paramInt);
  }
  
  @DoNotInline
  public static void setLayerPaint(View paramView, Paint paramPaint)
  {
    paramView.setLayerPaint(paramPaint);
  }
  
  @DoNotInline
  public static void setLayoutDirection(View paramView, int paramInt)
  {
    paramView.setLayoutDirection(paramInt);
  }
  
  @DoNotInline
  public static void setPaddingRelative(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.setPaddingRelative(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewCompat.Api17Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */