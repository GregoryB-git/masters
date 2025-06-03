package androidx.core.view;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewPropertyAnimator;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
class ViewPropertyAnimatorCompat$Api19Impl
{
  @DoNotInline
  public static ViewPropertyAnimator setUpdateListener(ViewPropertyAnimator paramViewPropertyAnimator, ValueAnimator.AnimatorUpdateListener paramAnimatorUpdateListener)
  {
    return paramViewPropertyAnimator.setUpdateListener(paramAnimatorUpdateListener);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewPropertyAnimatorCompat.Api19Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */