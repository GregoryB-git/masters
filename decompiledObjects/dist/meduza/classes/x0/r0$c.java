package x0;

import a0.j;
import android.util.Log;
import android.view.ViewGroup;
import f;
import g;
import java.util.ArrayList;
import java.util.Iterator;
import sb.q;

public class r0$c
{
  public int a;
  public int b;
  public final i c;
  public final ArrayList d;
  public boolean e;
  public boolean f;
  public boolean g;
  public boolean h;
  public boolean i;
  public final ArrayList j;
  public final ArrayList k;
  
  public r0$c(int paramInt1, int paramInt2, i parami)
  {
    a = paramInt1;
    b = paramInt2;
    c = parami;
    d = new ArrayList();
    i = true;
    parami = new ArrayList();
    j = parami;
    k = parami;
  }
  
  public final void a(ViewGroup paramViewGroup)
  {
    ec.i.e(paramViewGroup, "container");
    h = false;
    if (e) {
      return;
    }
    e = true;
    if (j.isEmpty())
    {
      b();
    }
    else
    {
      Iterator localIterator = q.u(k).iterator();
      while (localIterator.hasNext())
      {
        r0.a locala = (r0.a)localIterator.next();
        locala.getClass();
        if (!b) {
          locala.b(paramViewGroup);
        }
        b = true;
      }
    }
  }
  
  public void b()
  {
    h = false;
    if (f) {
      return;
    }
    if (y.L(2))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("SpecialEffectsController: ");
      ((StringBuilder)localObject).append(this);
      ((StringBuilder)localObject).append(" has called complete.");
      Log.v("FragmentManager", ((StringBuilder)localObject).toString());
    }
    f = true;
    Object localObject = d.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((Runnable)((Iterator)localObject).next()).run();
    }
  }
  
  public final void c(r0.a parama)
  {
    ec.i.e(parama, "effect");
    if ((j.remove(parama)) && (j.isEmpty())) {
      b();
    }
  }
  
  public final void d(int paramInt1, int paramInt2)
  {
    j.p(paramInt1, "finalState");
    j.p(paramInt2, "lifecycleImpact");
    if (paramInt2 != 0)
    {
      paramInt2--;
      StringBuilder localStringBuilder;
      if (paramInt2 != 0)
      {
        if (paramInt2 != 1)
        {
          if (paramInt2 != 2) {
            break label297;
          }
          if (y.L(2))
          {
            localStringBuilder = f.l("SpecialEffectsController: For fragment ");
            localStringBuilder.append(c);
            localStringBuilder.append(" mFinalState = ");
            localStringBuilder.append(j.y(a));
            localStringBuilder.append(" -> REMOVED. mLifecycleImpact  = ");
            localStringBuilder.append(g.t(b));
            localStringBuilder.append(" to REMOVING.");
            Log.v("FragmentManager", localStringBuilder.toString());
          }
          a = 1;
          b = 3;
        }
        else
        {
          if (a != 1) {
            break label297;
          }
          if (y.L(2))
          {
            localStringBuilder = f.l("SpecialEffectsController: For fragment ");
            localStringBuilder.append(c);
            localStringBuilder.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
            localStringBuilder.append(g.t(b));
            localStringBuilder.append(" to ADDING.");
            Log.v("FragmentManager", localStringBuilder.toString());
          }
          a = 2;
          b = 2;
        }
        i = true;
      }
      else if (a != 1)
      {
        if (y.L(2))
        {
          localStringBuilder = f.l("SpecialEffectsController: For fragment ");
          localStringBuilder.append(c);
          localStringBuilder.append(" mFinalState = ");
          localStringBuilder.append(j.y(a));
          localStringBuilder.append(" -> ");
          localStringBuilder.append(j.y(paramInt1));
          localStringBuilder.append('.');
          Log.v("FragmentManager", localStringBuilder.toString());
        }
        a = paramInt1;
      }
      label297:
      return;
    }
    throw null;
  }
  
  public void e()
  {
    h = true;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.m("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
    localStringBuilder.append(j.y(a));
    localStringBuilder.append(" lifecycleImpact = ");
    localStringBuilder.append(g.t(b));
    localStringBuilder.append(" fragment = ");
    localStringBuilder.append(c);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     x0.r0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */