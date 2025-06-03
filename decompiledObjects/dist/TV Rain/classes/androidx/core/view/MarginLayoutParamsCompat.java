package androidx.core.view;

import android.view.ViewGroup.MarginLayoutParams;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public final class MarginLayoutParamsCompat
{
  public static int getLayoutDirection(@NonNull ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    int i = Api17Impl.getLayoutDirection(paramMarginLayoutParams);
    int j = i;
    if (i != 0)
    {
      j = i;
      if (i != 1) {
        j = 0;
      }
    }
    return j;
  }
  
  public static int getMarginEnd(@NonNull ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return Api17Impl.getMarginEnd(paramMarginLayoutParams);
  }
  
  public static int getMarginStart(@NonNull ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return Api17Impl.getMarginStart(paramMarginLayoutParams);
  }
  
  public static boolean isMarginRelative(@NonNull ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return Api17Impl.isMarginRelative(paramMarginLayoutParams);
  }
  
  public static void resolveLayoutDirection(@NonNull ViewGroup.MarginLayoutParams paramMarginLayoutParams, int paramInt)
  {
    Api17Impl.resolveLayoutDirection(paramMarginLayoutParams, paramInt);
  }
  
  public static void setLayoutDirection(@NonNull ViewGroup.MarginLayoutParams paramMarginLayoutParams, int paramInt)
  {
    Api17Impl.setLayoutDirection(paramMarginLayoutParams, paramInt);
  }
  
  public static void setMarginEnd(@NonNull ViewGroup.MarginLayoutParams paramMarginLayoutParams, int paramInt)
  {
    Api17Impl.setMarginEnd(paramMarginLayoutParams, paramInt);
  }
  
  public static void setMarginStart(@NonNull ViewGroup.MarginLayoutParams paramMarginLayoutParams, int paramInt)
  {
    Api17Impl.setMarginStart(paramMarginLayoutParams, paramInt);
  }
  
  @RequiresApi(17)
  public static class Api17Impl
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
}

/* Location:
 * Qualified Name:     androidx.core.view.MarginLayoutParamsCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */