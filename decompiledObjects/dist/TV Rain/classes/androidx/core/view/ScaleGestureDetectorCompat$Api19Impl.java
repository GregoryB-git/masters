package androidx.core.view;

import android.view.ScaleGestureDetector;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
class ScaleGestureDetectorCompat$Api19Impl
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

/* Location:
 * Qualified Name:     androidx.core.view.ScaleGestureDetectorCompat.Api19Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */