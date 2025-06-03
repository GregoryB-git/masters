package androidx.fragment.app;

import E.c;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

public class f$b
  implements Animation.AnimationListener
{
  public f$b(ViewGroup paramViewGroup, Fragment paramFragment, w.g paramg, c paramc) {}
  
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
      if (b.q() != null)
      {
        b.u1(null);
        f.b localb = f.b.this;
        c.a(b, d);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.f.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */