package androidx.core.view;

import android.view.ViewGroup.MarginLayoutParams;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(17)
class MarginLayoutParamsCompat$Api17Impl
{
  @DoNotInline
  public static int getLayoutDirection(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return paramMarginLayoutParams.getLayoutDirection();
  }
  
  @DoNotInline
  public static int getMarginEnd(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return paramMarginLayoutParams.getMarginEnd();
  }
  
  @DoNotInline
  public static int getMarginStart(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return paramMarginLayoutParams.getMarginStart();
  }
  
  @DoNotInline
  public static boolean isMarginRelative(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return paramMarginLayoutParams.isMarginRelative();
  }
  
  @DoNotInline
  public static void resolveLayoutDirection(ViewGroup.MarginLayoutParams paramMarginLayoutParams, int paramInt)
  {
    paramMarginLayoutParams.resolveLayoutDirection(paramInt);
  }
  
  @DoNotInline
  public static void setLayoutDirection(ViewGroup.MarginLayoutParams paramMarginLayoutParams, int paramInt)
  {
    paramMarginLayoutParams.setLayoutDirection(paramInt);
  }
  
  @DoNotInline
  public static void setMarginEnd(ViewGroup.MarginLayoutParams paramMarginLayoutParams, int paramInt)
  {
    paramMarginLayoutParams.setMarginEnd(paramInt);
  }
  
  @DoNotInline
  public static void setMarginStart(ViewGroup.MarginLayoutParams paramMarginLayoutParams, int paramInt)
  {
    paramMarginLayoutParams.setMarginStart(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.MarginLayoutParamsCompat.Api17Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */