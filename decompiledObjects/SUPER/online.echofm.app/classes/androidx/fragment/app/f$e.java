package androidx.fragment.app;

import I.q;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

public class f$e
  extends AnimationSet
  implements Runnable
{
  public final ViewGroup o;
  public final View p;
  public boolean q;
  public boolean r;
  public boolean s = true;
  
  public f$e(Animation paramAnimation, ViewGroup paramViewGroup, View paramView)
  {
    super(false);
    o = paramViewGroup;
    p = paramView;
    addAnimation(paramAnimation);
    paramViewGroup.post(this);
  }
  
  public boolean getTransformation(long paramLong, Transformation paramTransformation)
  {
    s = true;
    if (q) {
      return r ^ true;
    }
    if (!super.getTransformation(paramLong, paramTransformation))
    {
      q = true;
      q.a(o, this);
    }
    return true;
  }
  
  public boolean getTransformation(long paramLong, Transformation paramTransformation, float paramFloat)
  {
    s = true;
    if (q) {
      return r ^ true;
    }
    if (!super.getTransformation(paramLong, paramTransformation, paramFloat))
    {
      q = true;
      q.a(o, this);
    }
    return true;
  }
  
  public void run()
  {
    if ((!q) && (s))
    {
      s = false;
      o.post(this);
    }
    else
    {
      o.endViewTransition(p);
      r = true;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.f.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */