package androidx.fragment.app;

import E.c;
import E.c.b;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public abstract class B$e
{
  public c a;
  public b b;
  public final Fragment c;
  public final List d = new ArrayList();
  public final HashSet e = new HashSet();
  public boolean f = false;
  public boolean g = false;
  
  public B$e(c paramc, b paramb, Fragment paramFragment, c paramc1)
  {
    a = paramc;
    b = paramb;
    c = paramFragment;
    paramc1.c(new a());
  }
  
  public final void a(Runnable paramRunnable)
  {
    d.add(paramRunnable);
  }
  
  public final void b()
  {
    if (h()) {
      return;
    }
    f = true;
    if (e.isEmpty())
    {
      c();
    }
    else
    {
      Iterator localIterator = new ArrayList(e).iterator();
      while (localIterator.hasNext()) {
        ((c)localIterator.next()).a();
      }
    }
  }
  
  public void c()
  {
    if (g) {
      return;
    }
    if (n.D0(2))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("SpecialEffectsController: ");
      ((StringBuilder)localObject).append(this);
      ((StringBuilder)localObject).append(" has called complete.");
      Log.v("FragmentManager", ((StringBuilder)localObject).toString());
    }
    g = true;
    Object localObject = d.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((Runnable)((Iterator)localObject).next()).run();
    }
  }
  
  public final void d(c paramc)
  {
    if ((e.remove(paramc)) && (e.isEmpty())) {
      c();
    }
  }
  
  public c e()
  {
    return a;
  }
  
  public final Fragment f()
  {
    return c;
  }
  
  public b g()
  {
    return b;
  }
  
  public final boolean h()
  {
    return f;
  }
  
  public final boolean i()
  {
    return g;
  }
  
  public final void j(c paramc)
  {
    l();
    e.add(paramc);
  }
  
  public final void k(c paramc, b paramb)
  {
    int i = B.c.b[paramb.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if ((i == 3) && (a != c.o))
        {
          if (n.D0(2))
          {
            paramb = new StringBuilder();
            paramb.append("SpecialEffectsController: For fragment ");
            paramb.append(c);
            paramb.append(" mFinalState = ");
            paramb.append(a);
            paramb.append(" -> ");
            paramb.append(paramc);
            paramb.append(". ");
            Log.v("FragmentManager", paramb.toString());
          }
          a = paramc;
        }
      }
      else
      {
        if (n.D0(2))
        {
          paramc = new StringBuilder();
          paramc.append("SpecialEffectsController: For fragment ");
          paramc.append(c);
          paramc.append(" mFinalState = ");
          paramc.append(a);
          paramc.append(" -> REMOVED. mLifecycleImpact  = ");
          paramc.append(b);
          paramc.append(" to REMOVING.");
          Log.v("FragmentManager", paramc.toString());
        }
        a = c.o;
      }
    }
    else {
      for (paramc = b.q;; paramc = b.p)
      {
        b = paramc;
        break;
        if (a != c.o) {
          break;
        }
        if (n.D0(2))
        {
          paramc = new StringBuilder();
          paramc.append("SpecialEffectsController: For fragment ");
          paramc.append(c);
          paramc.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
          paramc.append(b);
          paramc.append(" to ADDING.");
          Log.v("FragmentManager", paramc.toString());
        }
        a = c.p;
      }
    }
  }
  
  public abstract void l();
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Operation ");
    localStringBuilder.append("{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append("} ");
    localStringBuilder.append("{");
    localStringBuilder.append("mFinalState = ");
    localStringBuilder.append(a);
    localStringBuilder.append("} ");
    localStringBuilder.append("{");
    localStringBuilder.append("mLifecycleImpact = ");
    localStringBuilder.append(b);
    localStringBuilder.append("} ");
    localStringBuilder.append("{");
    localStringBuilder.append("mFragment = ");
    localStringBuilder.append(c);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public class a
    implements c.b
  {
    public a() {}
    
    public void a()
    {
      b();
    }
  }
  
  public static enum b
  {
    static
    {
      b localb1 = new b("NONE", 0);
      o = localb1;
      b localb2 = new b("ADDING", 1);
      p = localb2;
      b localb3 = new b("REMOVING", 2);
      q = localb3;
      r = new b[] { localb1, localb2, localb3 };
    }
  }
  
  public static enum c
  {
    static
    {
      c localc1 = new c("REMOVED", 0);
      o = localc1;
      c localc2 = new c("VISIBLE", 1);
      p = localc2;
      c localc3 = new c("GONE", 2);
      q = localc3;
      c localc4 = new c("INVISIBLE", 3);
      r = localc4;
      s = new c[] { localc1, localc2, localc3, localc4 };
    }
    
    public static c e(int paramInt)
    {
      if (paramInt != 0)
      {
        if (paramInt != 4)
        {
          if (paramInt == 8) {
            return q;
          }
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Unknown visibility ");
          localStringBuilder.append(paramInt);
          throw new IllegalArgumentException(localStringBuilder.toString());
        }
        return r;
      }
      return p;
    }
    
    public static c h(View paramView)
    {
      if ((paramView.getAlpha() == 0.0F) && (paramView.getVisibility() == 0)) {
        return r;
      }
      return e(paramView.getVisibility());
    }
    
    public void c(View paramView)
    {
      int i = B.c.a[ordinal()];
      Object localObject;
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4) {
              return;
            }
            if (n.D0(2))
            {
              localObject = new StringBuilder();
              ((StringBuilder)localObject).append("SpecialEffectsController: Setting view ");
              ((StringBuilder)localObject).append(paramView);
              ((StringBuilder)localObject).append(" to INVISIBLE");
              Log.v("FragmentManager", ((StringBuilder)localObject).toString());
            }
            paramView.setVisibility(4);
            return;
          }
          if (n.D0(2))
          {
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append("SpecialEffectsController: Setting view ");
            ((StringBuilder)localObject).append(paramView);
            ((StringBuilder)localObject).append(" to GONE");
            Log.v("FragmentManager", ((StringBuilder)localObject).toString());
          }
        }
        for (i = 8;; i = 0)
        {
          paramView.setVisibility(i);
          break;
          if (n.D0(2))
          {
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append("SpecialEffectsController: Setting view ");
            ((StringBuilder)localObject).append(paramView);
            ((StringBuilder)localObject).append(" to VISIBLE");
            Log.v("FragmentManager", ((StringBuilder)localObject).toString());
          }
        }
      }
      else
      {
        localObject = (ViewGroup)paramView.getParent();
        if (localObject != null)
        {
          if (n.D0(2))
          {
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("SpecialEffectsController: Removing view ");
            localStringBuilder.append(paramView);
            localStringBuilder.append(" from container ");
            localStringBuilder.append(localObject);
            Log.v("FragmentManager", localStringBuilder.toString());
          }
          ((ViewGroup)localObject).removeView(paramView);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.B.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */