package x0;

import android.util.Log;
import b.b;
import b.p;
import b.w;
import f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import sb.o;
import sb.q;

public final class y$b
  extends p
{
  public y$b(y paramy)
  {
    super(false);
  }
  
  public final void handleOnBackCancelled()
  {
    if (y.L(3))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("handleOnBackCancelled. PREDICTIVE_BACK = ");
      ((StringBuilder)localObject).append(true);
      ((StringBuilder)localObject).append(" fragment manager ");
      ((StringBuilder)localObject).append(a);
      Log.d("FragmentManager", ((StringBuilder)localObject).toString());
    }
    y localy = a;
    Object localObject = h;
    if (localObject != null)
    {
      q = false;
      ((a)localObject).d(false);
      localy.A(true);
      localy.F();
      localObject = n.iterator();
      while (((Iterator)localObject).hasNext()) {
        ((y.l)((Iterator)localObject).next()).c();
      }
    }
    a.h = null;
  }
  
  public final void handleOnBackPressed()
  {
    if (y.L(3))
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("handleOnBackPressed. PREDICTIVE_BACK = ");
      ((StringBuilder)localObject1).append(true);
      ((StringBuilder)localObject1).append(" fragment manager ");
      ((StringBuilder)localObject1).append(a);
      Log.d("FragmentManager", ((StringBuilder)localObject1).toString());
    }
    Object localObject1 = a;
    ((y)localObject1).A(true);
    if (h != null)
    {
      Object localObject3;
      if (!n.isEmpty())
      {
        localObject2 = new LinkedHashSet(y.G(h));
        Iterator localIterator1 = n.iterator();
        while (localIterator1.hasNext())
        {
          localObject3 = (y.l)localIterator1.next();
          Iterator localIterator2 = ((Set)localObject2).iterator();
          while (localIterator2.hasNext())
          {
            i locali = (i)localIterator2.next();
            ((y.l)localObject3).d();
          }
        }
      }
      Object localObject2 = h.a.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = nextb;
        if (localObject3 != null) {
          mTransitioning = false;
        }
      }
      localObject2 = ((y)localObject1).g(new ArrayList(Collections.singletonList(h)), 0, 1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (r0)((Iterator)localObject2).next();
        localObject3.getClass();
        if (y.L(3)) {
          Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        ((r0)localObject3).o(c);
        ((r0)localObject3).c(c);
      }
      h = null;
      ((y)localObject1).f0();
      if (y.L(3))
      {
        Log.d("FragmentManager", "Op is being set to null");
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("OnBackPressedCallback enabled=");
        ((StringBuilder)localObject2).append(i.isEnabled());
        ((StringBuilder)localObject2).append(" for  FragmentManager ");
        ((StringBuilder)localObject2).append(localObject1);
        Log.d("FragmentManager", ((StringBuilder)localObject2).toString());
      }
    }
    else
    {
      boolean bool1 = i.isEnabled();
      boolean bool2 = y.L(3);
      if (bool1)
      {
        if (bool2) {
          Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
        }
        ((y)localObject1).R();
      }
      else
      {
        if (bool2) {
          Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
        }
        g.b();
      }
    }
  }
  
  public final void handleOnBackProgressed(b paramb)
  {
    if (y.L(2))
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("handleOnBackProgressed. PREDICTIVE_BACK = ");
      ((StringBuilder)localObject1).append(true);
      ((StringBuilder)localObject1).append(" fragment manager ");
      ((StringBuilder)localObject1).append(a);
      Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
    }
    Object localObject1 = a;
    if (h != null)
    {
      Iterator localIterator = ((y)localObject1).g(new ArrayList(Collections.singletonList(a.h)), 0, 1).iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (r0)localIterator.next();
        localObject1.getClass();
        ec.i.e(paramb, "backEvent");
        if (y.L(2))
        {
          localObject2 = f.l("SpecialEffectsController: Processing Progress ");
          ((StringBuilder)localObject2).append(c);
          Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
        }
        Object localObject3 = c;
        Object localObject2 = new ArrayList();
        localObject3 = ((ArrayList)localObject3).iterator();
        while (((Iterator)localObject3).hasNext()) {
          o.k(nextk, (ArrayList)localObject2);
        }
        localObject2 = q.u(q.x((Iterable)localObject2));
        int i = ((List)localObject2).size();
        for (int j = 0; j < i; j++) {
          ((r0.a)((List)localObject2).get(j)).d(paramb, a);
        }
      }
      paramb = a.n.iterator();
      while (paramb.hasNext()) {
        ((y.l)paramb.next()).a();
      }
    }
  }
  
  public final void handleOnBackStarted(b paramb)
  {
    if (y.L(3))
    {
      paramb = new StringBuilder();
      paramb.append("handleOnBackStarted. PREDICTIVE_BACK = ");
      paramb.append(true);
      paramb.append(" fragment manager ");
      paramb.append(a);
      Log.d("FragmentManager", paramb.toString());
    }
    a.x();
    paramb = a;
    paramb.getClass();
    paramb.y(new y.o(paramb), false);
  }
}

/* Location:
 * Qualified Name:     x0.y.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */