package androidx.fragment.app;

import android.animation.Animator;
import android.view.animation.Animation;

public class f$d
{
  public final Animation a;
  public final Animator b;
  
  public f$d(Animator paramAnimator)
  {
    a = null;
    b = paramAnimator;
    if (paramAnimator != null) {
      return;
    }
    throw new IllegalStateException("Animator cannot be null");
  }
  
  public f$d(Animation paramAnimation)
  {
    a = paramAnimation;
    b = null;
    if (paramAnimation != null) {
      return;
    }
    throw new IllegalStateException("Animation cannot be null");
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.f.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */