package x0;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import e0.w;

public final class o
  extends AnimationSet
  implements Runnable
{
  public final ViewGroup a;
  public final View b;
  public boolean c;
  public boolean d;
  public boolean e = true;
  
  public o(Animation paramAnimation, ViewGroup paramViewGroup, View paramView)
  {
    super(false);
    a = paramViewGroup;
    b = paramView;
    addAnimation(paramAnimation);
    paramViewGroup.post(this);
  }
  
  public final boolean getTransformation(long paramLong, Transformation paramTransformation)
  {
    e = true;
    if (c) {
      return d ^ true;
    }
    if (!super.getTransformation(paramLong, paramTransformation))
    {
      c = true;
      w.a(a, this);
    }
    return true;
  }
  
  public final boolean getTransformation(long paramLong, Transformation paramTransformation, float paramFloat)
  {
    e = true;
    if (c) {
      return d ^ true;
    }
    if (!super.getTransformation(paramLong, paramTransformation, paramFloat))
    {
      c = true;
      w.a(a, this);
    }
    return true;
  }
  
  public final void run()
  {
    if ((!c) && (e))
    {
      e = false;
      a.post(this);
    }
    else
    {
      a.endViewTransition(b);
      d = true;
    }
  }
}

/* Location:
 * Qualified Name:     x0.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */