package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public final class GravityCompat
{
  public static final int END = 8388613;
  public static final int RELATIVE_HORIZONTAL_GRAVITY_MASK = 8388615;
  public static final int RELATIVE_LAYOUT_DIRECTION = 8388608;
  public static final int START = 8388611;
  
  public static void apply(int paramInt1, int paramInt2, int paramInt3, @NonNull Rect paramRect1, int paramInt4, int paramInt5, @NonNull Rect paramRect2, int paramInt6)
  {
    Api17Impl.apply(paramInt1, paramInt2, paramInt3, paramRect1, paramInt4, paramInt5, paramRect2, paramInt6);
  }
  
  public static void apply(int paramInt1, int paramInt2, int paramInt3, @NonNull Rect paramRect1, @NonNull Rect paramRect2, int paramInt4)
  {
    Api17Impl.apply(paramInt1, paramInt2, paramInt3, paramRect1, paramRect2, paramInt4);
  }
  
  public static void applyDisplay(int paramInt1, @NonNull Rect paramRect1, @NonNull Rect paramRect2, int paramInt2)
  {
    Api17Impl.applyDisplay(paramInt1, paramRect1, paramRect2, paramInt2);
  }
  
  public static int getAbsoluteGravity(int paramInt1, int paramInt2)
  {
    return Gravity.getAbsoluteGravity(paramInt1, paramInt2);
  }
  
  @RequiresApi(17)
  public static class Api17Impl
  {
    @DoNotInline
    public static void apply(int paramInt1, int paramInt2, int paramInt3, Rect paramRect1, int paramInt4, int paramInt5, Rect paramRect2, int paramInt6)
    {
      Gravity.apply(paramInt1, paramInt2, paramInt3, paramRect1, paramInt4, paramInt5, paramRect2, paramInt6);
    }
    
    @DoNotInline
    public static void apply(int paramInt1, int paramInt2, int paramInt3, Rect paramRect1, Rect paramRect2, int paramInt4)
    {
      Gravity.apply(paramInt1, paramInt2, paramInt3, paramRect1, paramRect2, paramInt4);
    }
    
    @DoNotInline
    public static void applyDisplay(int paramInt1, Rect paramRect1, Rect paramRect2, int paramInt2)
    {
      Gravity.applyDisplay(paramInt1, paramRect1, paramRect2, paramInt2);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.GravityCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */