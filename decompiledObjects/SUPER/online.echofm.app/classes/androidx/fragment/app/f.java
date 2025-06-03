package androidx.fragment.app;

import E.c;
import E.c.b;
import I.q;
import U.a;
import U.b;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

public abstract class f
{
  public static void a(final Fragment paramFragment, d paramd, final w.g paramg)
  {
    final View localView = V;
    ViewGroup localViewGroup = U;
    localViewGroup.startViewTransition(localView);
    final c localc = new c();
    localc.c(new a());
    paramg.b(paramFragment, localc);
    if (a != null)
    {
      paramd = new e(a, localViewGroup, localView);
      paramFragment.u1(V);
      paramd.setAnimationListener(new b(localViewGroup, paramFragment, paramg, localc));
      V.startAnimation(paramd);
    }
    else
    {
      paramd = b;
      paramFragment.v1(paramd);
      paramd.addListener(new c(localViewGroup, localView, paramFragment, paramg, localc));
      paramd.setTarget(V);
      paramd.start();
    }
  }
  
  public static d b(Context paramContext, Fragment paramFragment, boolean paramBoolean)
  {
    int i = paramFragment.D();
    int j = paramFragment.C();
    paramFragment.z1(0);
    Object localObject = U;
    if ((localObject != null) && (((View)localObject).getTag(b.c) != null)) {
      U.setTag(b.c, null);
    }
    localObject = U;
    if ((localObject != null) && (((ViewGroup)localObject).getLayoutTransition() != null)) {
      return null;
    }
    localObject = paramFragment.n0(i, paramBoolean, j);
    if (localObject != null) {
      return new d((Animation)localObject);
    }
    paramFragment = paramFragment.o0(i, paramBoolean, j);
    if (paramFragment != null) {
      return new d(paramFragment);
    }
    int k = j;
    if (j == 0)
    {
      k = j;
      if (i != 0) {
        k = c(i, paramBoolean);
      }
    }
    if (k != 0)
    {
      paramBoolean = "anim".equals(paramContext.getResources().getResourceTypeName(k));
      if (!paramBoolean) {}
    }
    try
    {
      paramFragment = AnimationUtils.loadAnimation(paramContext, k);
      if (paramFragment != null)
      {
        paramFragment = new d(paramFragment);
        return paramFragment;
      }
    }
    catch (Resources.NotFoundException paramContext)
    {
      throw paramContext;
      try
      {
        paramFragment = AnimatorInflater.loadAnimator(paramContext, k);
        if (paramFragment != null)
        {
          paramFragment = new d(paramFragment);
          return paramFragment;
        }
      }
      catch (RuntimeException paramFragment)
      {
        if (!paramBoolean)
        {
          paramContext = AnimationUtils.loadAnimation(paramContext, k);
          if (paramContext != null) {
            return new d(paramContext);
          }
        }
        else
        {
          throw paramFragment;
        }
      }
      return null;
    }
    catch (RuntimeException paramFragment)
    {
      for (;;) {}
    }
  }
  
  public static int c(int paramInt, boolean paramBoolean)
  {
    if (paramInt != 4097)
    {
      if (paramInt != 4099)
      {
        if (paramInt != 8194) {
          paramInt = -1;
        } else if (paramBoolean) {
          paramInt = a.a;
        } else {
          paramInt = a.b;
        }
      }
      else if (paramBoolean) {
        paramInt = a.c;
      } else {
        paramInt = a.d;
      }
    }
    else if (paramBoolean) {
      paramInt = a.e;
    } else {
      paramInt = a.f;
    }
    return paramInt;
  }
  
  public class a
    implements c.b
  {
    public a() {}
    
    public void a()
    {
      if (q() != null)
      {
        View localView = q();
        u1(null);
        localView.clearAnimation();
      }
      v1(null);
    }
  }
  
  public class b
    implements Animation.AnimationListener
  {
    public b(Fragment paramFragment, w.g paramg, c paramc) {}
    
    public void onAnimationEnd(Animation paramAnimation)
    {
      post(new a());
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
  
  public class c
    extends AnimatorListenerAdapter
  {
    public c(View paramView, Fragment paramFragment, w.g paramg, c paramc) {}
    
    public void onAnimationEnd(Animator paramAnimator)
    {
      endViewTransition(localView);
      paramAnimator = paramFragment.r();
      paramFragment.v1(null);
      if ((paramAnimator != null) && (indexOfChild(localView) < 0)) {
        paramg.a(paramFragment, localc);
      }
    }
  }
  
  public static class d
  {
    public final Animation a;
    public final Animator b;
    
    public d(Animator paramAnimator)
    {
      a = null;
      b = paramAnimator;
      if (paramAnimator != null) {
        return;
      }
      throw new IllegalStateException("Animator cannot be null");
    }
    
    public d(Animation paramAnimation)
    {
      a = paramAnimation;
      b = null;
      if (paramAnimation != null) {
        return;
      }
      throw new IllegalStateException("Animation cannot be null");
    }
  }
  
  public static class e
    extends AnimationSet
    implements Runnable
  {
    public final ViewGroup o;
    public final View p;
    public boolean q;
    public boolean r;
    public boolean s = true;
    
    public e(Animation paramAnimation, ViewGroup paramViewGroup, View paramView)
    {
      super();
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
}

/* Location:
 * Qualified Name:     androidx.fragment.app.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */