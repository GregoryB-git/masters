package androidx.core.view;

import android.view.ViewPropertyAnimator;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(16)
class ViewPropertyAnimatorCompat$Api16Impl
{
  @DoNotInline
  public static ViewPropertyAnimator withEndAction(ViewPropertyAnimator paramViewPropertyAnimator, Runnable paramRunnable)
  {
    return paramViewPropertyAnimator.withEndAction(paramRunnable);
  }
  
  @DoNotInline
  public static ViewPropertyAnimator withLayer(ViewPropertyAnimator paramViewPropertyAnimator)
  {
    return paramViewPropertyAnimator.withLayer();
  }
  
  @DoNotInline
  public static ViewPropertyAnimator withStartAction(ViewPropertyAnimator paramViewPropertyAnimator, Runnable paramRunnable)
  {
    return paramViewPropertyAnimator.withStartAction(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewPropertyAnimatorCompat.Api16Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */