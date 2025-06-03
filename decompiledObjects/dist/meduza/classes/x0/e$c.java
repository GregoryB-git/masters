package x0;

import a0.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import b.b;
import f;

public final class e$c
  extends r0.a
{
  public final e.b c;
  public AnimatorSet d;
  
  public e$c(e.b paramb)
  {
    c = paramb;
  }
  
  public final void b(ViewGroup paramViewGroup)
  {
    ec.i.e(paramViewGroup, "container");
    Object localObject = d;
    if (localObject == null)
    {
      c.a.c(this);
    }
    else
    {
      paramViewGroup = c.a;
      if (g)
      {
        if (Build.VERSION.SDK_INT >= 26) {
          e.e.a.a((AnimatorSet)localObject);
        }
      }
      else {
        ((AnimatorSet)localObject).end();
      }
      if (y.L(2))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Animator from operation ");
        ((StringBuilder)localObject).append(paramViewGroup);
        ((StringBuilder)localObject).append(" has been canceled");
        if (g) {
          paramViewGroup = " with seeking.";
        } else {
          paramViewGroup = ".";
        }
        ((StringBuilder)localObject).append(paramViewGroup);
        ((StringBuilder)localObject).append(' ');
        Log.v("FragmentManager", ((StringBuilder)localObject).toString());
      }
    }
  }
  
  public final void c(ViewGroup paramViewGroup)
  {
    ec.i.e(paramViewGroup, "container");
    paramViewGroup = c.a;
    Object localObject = d;
    if (localObject == null)
    {
      paramViewGroup.c(this);
      return;
    }
    ((AnimatorSet)localObject).start();
    if (y.L(2))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Animator from operation ");
      ((StringBuilder)localObject).append(paramViewGroup);
      ((StringBuilder)localObject).append(" has started.");
      Log.v("FragmentManager", ((StringBuilder)localObject).toString());
    }
  }
  
  public final void d(b paramb, ViewGroup paramViewGroup)
  {
    ec.i.e(paramb, "backEvent");
    ec.i.e(paramViewGroup, "container");
    paramViewGroup = c.a;
    AnimatorSet localAnimatorSet = d;
    if (localAnimatorSet == null)
    {
      paramViewGroup.c(this);
      return;
    }
    if ((Build.VERSION.SDK_INT >= 34) && (c.mTransitioning))
    {
      if (y.L(2))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Adding BackProgressCallbacks for Animators to operation ");
        localStringBuilder.append(paramViewGroup);
        Log.v("FragmentManager", localStringBuilder.toString());
      }
      long l1 = e.d.a.a(localAnimatorSet);
      long l2 = (c * (float)l1);
      long l3 = l2;
      if (l2 == 0L) {
        l3 = 1L;
      }
      l2 = l3;
      if (l3 == l1) {
        l2 = l1 - 1L;
      }
      if (y.L(2))
      {
        paramb = new StringBuilder();
        paramb.append("Setting currentPlayTime to ");
        paramb.append(l2);
        paramb.append(" for Animator ");
        paramb.append(localAnimatorSet);
        paramb.append(" on operation ");
        paramb.append(paramViewGroup);
        Log.v("FragmentManager", paramb.toString());
      }
      e.e.a.b(localAnimatorSet, l2);
    }
  }
  
  public final void e(ViewGroup paramViewGroup)
  {
    if (c.a()) {
      return;
    }
    final Object localObject1 = paramViewGroup.getContext();
    final Object localObject2 = c;
    ec.i.d(localObject1, "context");
    localObject2 = ((e.b)localObject2).b((Context)localObject1);
    if (localObject2 != null) {
      localObject2 = b;
    } else {
      localObject2 = null;
    }
    d = ((AnimatorSet)localObject2);
    localObject2 = c.a;
    localObject1 = c;
    final boolean bool;
    if (a == 3) {
      bool = true;
    } else {
      bool = false;
    }
    localObject1 = mView;
    paramViewGroup.startViewTransition((View)localObject1);
    AnimatorSet localAnimatorSet = d;
    if (localAnimatorSet != null) {
      localAnimatorSet.addListener(new a(paramViewGroup, (View)localObject1, bool, (r0.c)localObject2, this));
    }
    paramViewGroup = d;
    if (paramViewGroup != null) {
      paramViewGroup.setTarget(localObject1);
    }
  }
  
  public static final class a
    extends AnimatorListenerAdapter
  {
    public a(ViewGroup paramViewGroup, View paramView, boolean paramBoolean, r0.c paramc, e.c paramc1) {}
    
    public final void onAnimationEnd(Animator paramAnimator)
    {
      ec.i.e(paramAnimator, "anim");
      a.endViewTransition(localObject1);
      if (bool)
      {
        int i = localObject2a;
        paramAnimator = localObject1;
        ec.i.d(paramAnimator, "viewToAnimate");
        j.a(i, paramAnimator, a);
      }
      paramAnimator = jdField_this;
      c.a.c(paramAnimator);
      if (y.L(2))
      {
        paramAnimator = f.l("Animator from operation ");
        paramAnimator.append(localObject2);
        paramAnimator.append(" has ended.");
        Log.v("FragmentManager", paramAnimator.toString());
      }
    }
  }
}

/* Location:
 * Qualified Name:     x0.e.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */