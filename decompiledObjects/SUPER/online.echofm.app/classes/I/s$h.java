package I;

import android.graphics.Paint;
import android.view.Display;
import android.view.View;
import androidx.annotation.NonNull;

public abstract class s$h
{
  public static int a()
  {
    return View.generateViewId();
  }
  
  public static Display b(@NonNull View paramView)
  {
    return paramView.getDisplay();
  }
  
  public static int c(View paramView)
  {
    return paramView.getLabelFor();
  }
  
  public static int d(View paramView)
  {
    return paramView.getLayoutDirection();
  }
  
  public static int e(View paramView)
  {
    return paramView.getPaddingEnd();
  }
  
  public static int f(View paramView)
  {
    return paramView.getPaddingStart();
  }
  
  public static boolean g(View paramView)
  {
    return paramView.isPaddingRelative();
  }
  
  public static void h(View paramView, int paramInt)
  {
    paramView.setLabelFor(paramInt);
  }
  
  public static void i(View paramView, Paint paramPaint)
  {
    paramView.setLayerPaint(paramPaint);
  }
  
  public static void j(View paramView, int paramInt)
  {
    paramView.setLayoutDirection(paramInt);
  }
  
  public static void k(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.setPaddingRelative(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}

/* Location:
 * Qualified Name:     I.s.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */