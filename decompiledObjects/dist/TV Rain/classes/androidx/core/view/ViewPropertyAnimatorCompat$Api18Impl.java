package androidx.core.view;

import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
class ViewPropertyAnimatorCompat$Api18Impl
{
  @DoNotInline
  public static Interpolator getInterpolator(ViewPropertyAnimator paramViewPropertyAnimator)
  {
    return (Interpolator)paramViewPropertyAnimator.getInterpolator();
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewPropertyAnimatorCompat.Api18Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */