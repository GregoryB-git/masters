package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

public class c$e
  implements Animation.AnimationListener
{
  public c$e(c paramc, ViewGroup paramViewGroup, View paramView, c.k paramk) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    a.post(new a());
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
  
  public class a
    implements Runnable
  {
    public a() {}
    
    public void run()
    {
      c.e locale = c.e.this;
      a.endViewTransition(b);
      c.a();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.c.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */