package I;

import android.view.ViewGroup.MarginLayoutParams;

public abstract class h$a
{
  public static int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return paramMarginLayoutParams.getLayoutDirection();
  }
  
  public static int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return paramMarginLayoutParams.getMarginEnd();
  }
  
  public static int c(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return paramMarginLayoutParams.getMarginStart();
  }
  
  public static boolean d(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return paramMarginLayoutParams.isMarginRelative();
  }
  
  public static void e(ViewGroup.MarginLayoutParams paramMarginLayoutParams, int paramInt)
  {
    paramMarginLayoutParams.resolveLayoutDirection(paramInt);
  }
  
  public static void f(ViewGroup.MarginLayoutParams paramMarginLayoutParams, int paramInt)
  {
    paramMarginLayoutParams.setLayoutDirection(paramInt);
  }
  
  public static void g(ViewGroup.MarginLayoutParams paramMarginLayoutParams, int paramInt)
  {
    paramMarginLayoutParams.setMarginEnd(paramInt);
  }
  
  public static void h(ViewGroup.MarginLayoutParams paramMarginLayoutParams, int paramInt)
  {
    paramMarginLayoutParams.setMarginStart(paramInt);
  }
}

/* Location:
 * Qualified Name:     I.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */