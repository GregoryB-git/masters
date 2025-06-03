package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.PathInterpolator;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class PathInterpolatorCompat$Api21Impl
{
  @DoNotInline
  public static PathInterpolator createPathInterpolator(float paramFloat1, float paramFloat2)
  {
    return new PathInterpolator(paramFloat1, paramFloat2);
  }
  
  @DoNotInline
  public static PathInterpolator createPathInterpolator(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return new PathInterpolator(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  @DoNotInline
  public static PathInterpolator createPathInterpolator(Path paramPath)
  {
    return new PathInterpolator(paramPath);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.animation.PathInterpolatorCompat.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */