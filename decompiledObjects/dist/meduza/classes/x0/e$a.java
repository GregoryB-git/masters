package x0;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import f;

public final class e$a
  extends r0.a
{
  public final e.b c;
  
  public e$a(e.b paramb)
  {
    c = paramb;
  }
  
  public final void b(ViewGroup paramViewGroup)
  {
    ec.i.e(paramViewGroup, "container");
    r0.c localc = c.a;
    View localView = c.mView;
    localView.clearAnimation();
    paramViewGroup.endViewTransition(localView);
    c.a.c(this);
    if (y.L(2))
    {
      paramViewGroup = new StringBuilder();
      paramViewGroup.append("Animation from operation ");
      paramViewGroup.append(localc);
      paramViewGroup.append(" has been cancelled.");
      Log.v("FragmentManager", paramViewGroup.toString());
    }
  }
  
  public final void c(final ViewGroup paramViewGroup)
  {
    ec.i.e(paramViewGroup, "container");
    if (c.a())
    {
      c.a.c(this);
      return;
    }
    Context localContext = paramViewGroup.getContext();
    Object localObject = c;
    r0.c localc = a;
    final View localView = c.mView;
    ec.i.d(localContext, "context");
    localObject = ((e.b)localObject).b(localContext);
    if (localObject != null)
    {
      localObject = a;
      if (localObject != null)
      {
        if (a != 1)
        {
          localView.startAnimation((Animation)localObject);
          c.a.c(this);
        }
        else
        {
          paramViewGroup.startViewTransition(localView);
          localObject = new o((Animation)localObject, paramViewGroup, localView);
          ((Animation)localObject).setAnimationListener(new a(localc, paramViewGroup, localView, this));
          localView.startAnimation((Animation)localObject);
          if (y.L(2))
          {
            paramViewGroup = new StringBuilder();
            paramViewGroup.append("Animation from operation ");
            paramViewGroup.append(localc);
            paramViewGroup.append(" has started.");
            Log.v("FragmentManager", paramViewGroup.toString());
          }
        }
        return;
      }
      throw new IllegalStateException("Required value was null.".toString());
    }
    throw new IllegalStateException("Required value was null.".toString());
  }
  
  public static final class a
    implements Animation.AnimationListener
  {
    public a(r0.c paramc, ViewGroup paramViewGroup, View paramView, e.a parama) {}
    
    public final void onAnimationEnd(Animation paramAnimation)
    {
      ec.i.e(paramAnimation, "animation");
      paramAnimation = paramViewGroup;
      paramAnimation.post(new d(paramAnimation, localView, jdField_this, 0));
      if (y.L(2))
      {
        paramAnimation = f.l("Animation from operation ");
        paramAnimation.append(a);
        paramAnimation.append(" has ended.");
        Log.v("FragmentManager", paramAnimation.toString());
      }
    }
    
    public final void onAnimationRepeat(Animation paramAnimation)
    {
      ec.i.e(paramAnimation, "animation");
    }
    
    public final void onAnimationStart(Animation paramAnimation)
    {
      ec.i.e(paramAnimation, "animation");
      if (y.L(2))
      {
        paramAnimation = f.l("Animation from operation ");
        paramAnimation.append(a);
        paramAnimation.append(" has reached onAnimationStart.");
        Log.v("FragmentManager", paramAnimation.toString());
      }
    }
  }
}

/* Location:
 * Qualified Name:     x0.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */