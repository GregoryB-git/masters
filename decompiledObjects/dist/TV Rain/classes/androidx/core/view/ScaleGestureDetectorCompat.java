package androidx.core.view;

import android.view.ScaleGestureDetector;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public final class ScaleGestureDetectorCompat
{
  public static boolean isQuickScaleEnabled(@NonNull ScaleGestureDetector paramScaleGestureDetector)
  {
    return Api19Impl.isQuickScaleEnabled(paramScaleGestureDetector);
  }
  
  @Deprecated
  public static boolean isQuickScaleEnabled(Object paramObject)
  {
    return isQuickScaleEnabled((ScaleGestureDetector)paramObject);
  }
  
  public static void setQuickScaleEnabled(@NonNull ScaleGestureDetector paramScaleGestureDetector, boolean paramBoolean)
  {
    Api19Impl.setQuickScaleEnabled(paramScaleGestureDetector, paramBoolean);
  }
  
  @Deprecated
  public static void setQuickScaleEnabled(Object paramObject, boolean paramBoolean)
  {
    setQuickScaleEnabled((ScaleGestureDetector)paramObject, paramBoolean);
  }
  
  @RequiresApi(19)
  public static class Api19Impl
  {
    @DoNotInline
    public static boolean isQuickScaleEnabled(ScaleGestureDetector paramScaleGestureDetector)
    {
      return paramScaleGestureDetector.isQuickScaleEnabled();
    }
    
    @DoNotInline
    public static void setQuickScaleEnabled(ScaleGestureDetector paramScaleGestureDetector, boolean paramBoolean)
    {
      paramScaleGestureDetector.setQuickScaleEnabled(paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ScaleGestureDetectorCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */