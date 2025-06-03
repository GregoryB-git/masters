package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import androidx.core.os.CancellationSignal;

class FragmentAnim$2
  implements Animation.AnimationListener
{
  public FragmentAnim$2(ViewGroup paramViewGroup, Fragment paramFragment, FragmentTransition.Callback paramCallback, CancellationSignal paramCancellationSignal) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    val$container.post(new Runnable()
    {
      public void run()
      {
        if (val$fragment.getAnimatingAway() != null)
        {
          val$fragment.setAnimatingAway(null);
          FragmentAnim.2 local2 = FragmentAnim.2.this;
          val$callback.onComplete(val$fragment, val$signal);
        }
      }
    });
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentAnim.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */