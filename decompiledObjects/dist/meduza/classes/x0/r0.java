package x0;

import a0.j;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import b.b;
import ec.r;
import f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import rb.h;
import sb.o;
import sb.q;

public abstract class r0
{
  public final ViewGroup a;
  public final ArrayList b;
  public final ArrayList c;
  public boolean d;
  public boolean e;
  
  public r0(ViewGroup paramViewGroup)
  {
    a = paramViewGroup;
    b = new ArrayList();
    c = new ArrayList();
  }
  
  public static final r0 m(ViewGroup paramViewGroup, y paramy)
  {
    ec.i.e(paramViewGroup, "container");
    ec.i.e(paramy, "fragmentManager");
    ec.i.d(paramy.J(), "fragmentManager.specialEffectsControllerFactory");
    paramy = paramViewGroup.getTag(2131362020);
    if ((paramy instanceof r0))
    {
      paramViewGroup = (r0)paramy;
    }
    else
    {
      paramy = new e(paramViewGroup);
      paramViewGroup.setTag(2131362020, paramy);
      paramViewGroup = paramy;
    }
    return paramViewGroup;
  }
  
  public final void a(c paramc)
  {
    ec.i.e(paramc, "operation");
    if (i)
    {
      int i = a;
      View localView = c.requireView();
      ec.i.d(localView, "operation.fragment.requireView()");
      j.a(i, localView, a);
      i = false;
    }
  }
  
  public abstract void b(ArrayList paramArrayList, boolean paramBoolean);
  
  public final void c(ArrayList paramArrayList)
  {
    ec.i.e(paramArrayList, "operations");
    ArrayList localArrayList = new ArrayList();
    Object localObject = paramArrayList.iterator();
    while (((Iterator)localObject).hasNext()) {
      o.k(nextk, localArrayList);
    }
    localObject = q.u(q.x(localArrayList));
    int i = ((List)localObject).size();
    int j = 0;
    for (int k = 0; k < i; k++) {
      ((a)((List)localObject).get(k)).c(a);
    }
    i = paramArrayList.size();
    for (k = 0; k < i; k++) {
      a((c)paramArrayList.get(k));
    }
    paramArrayList = q.u(paramArrayList);
    i = paramArrayList.size();
    for (k = j; k < i; k++)
    {
      localObject = (c)paramArrayList.get(k);
      if (k.isEmpty()) {
        ((c)localObject).b();
      }
    }
  }
  
  public final void d(int paramInt1, int paramInt2, e0 parame0)
  {
    synchronized (b)
    {
      Object localObject = c;
      ec.i.d(localObject, "fragmentStateManager.fragment");
      c localc = j((i)localObject);
      localObject = localc;
      if (localc == null)
      {
        localObject = c;
        if (mTransitioning) {
          localObject = k((i)localObject);
        } else {
          localObject = null;
        }
      }
      if (localObject != null)
      {
        ((c)localObject).d(paramInt1, paramInt2);
        return;
      }
      localObject = new x0/r0$b;
      ((b)localObject).<init>(paramInt1, paramInt2, parame0);
      b.add(localObject);
      parame0 = new x0/q0;
      parame0.<init>(0, this, localObject);
      d.add(parame0);
      parame0 = new w/g;
      parame0.<init>(3, this, localObject);
      d.add(parame0);
      parame0 = h.a;
      return;
    }
  }
  
  public final void e(int paramInt, e0 parame0)
  {
    j.p(paramInt, "finalState");
    ec.i.e(parame0, "fragmentStateManager");
    if (y.L(2))
    {
      StringBuilder localStringBuilder = f.l("SpecialEffectsController: Enqueuing add operation for fragment ");
      localStringBuilder.append(c);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    d(paramInt, 2, parame0);
  }
  
  public final void f(e0 parame0)
  {
    ec.i.e(parame0, "fragmentStateManager");
    if (y.L(2))
    {
      StringBuilder localStringBuilder = f.l("SpecialEffectsController: Enqueuing hide operation for fragment ");
      localStringBuilder.append(c);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    d(3, 1, parame0);
  }
  
  public final void g(e0 parame0)
  {
    ec.i.e(parame0, "fragmentStateManager");
    if (y.L(2))
    {
      StringBuilder localStringBuilder = f.l("SpecialEffectsController: Enqueuing remove operation for fragment ");
      localStringBuilder.append(c);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    d(1, 3, parame0);
  }
  
  public final void h(e0 parame0)
  {
    ec.i.e(parame0, "fragmentStateManager");
    if (y.L(2))
    {
      StringBuilder localStringBuilder = f.l("SpecialEffectsController: Enqueuing show operation for fragment ");
      localStringBuilder.append(c);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    d(2, 1, parame0);
  }
  
  public final void i()
  {
    if (e) {
      return;
    }
    if (!a.isAttachedToWindow())
    {
      l();
      d = false;
      return;
    }
    synchronized (b)
    {
      if (b.isEmpty())
      {
        localObject1 = q.w(c);
        c.clear();
        localObject1 = ((ArrayList)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject3 = (c)((Iterator)localObject1).next();
          if (y.L(2))
          {
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            ((StringBuilder)localObject4).append("SpecialEffectsController: Cancelling operation ");
            ((StringBuilder)localObject4).append(localObject3);
            ((StringBuilder)localObject4).append(" with no incoming pendingOperations");
            Log.v("FragmentManager", ((StringBuilder)localObject4).toString());
          }
          localObject4 = a;
          localObject3.getClass();
          ec.i.e(localObject4, "container");
          if (!e) {
            ((c)localObject3).a((ViewGroup)localObject4);
          }
          if (!f) {
            c.add(localObject3);
          }
        }
      }
      Object localObject1 = q.w(c);
      c.clear();
      localObject1 = ((ArrayList)localObject1).iterator();
      boolean bool2;
      for (;;)
      {
        bool1 = ((Iterator)localObject1).hasNext();
        bool2 = true;
        if (!bool1) {
          break;
        }
        localObject3 = (c)((Iterator)localObject1).next();
        if (y.L(2))
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((StringBuilder)localObject4).append("SpecialEffectsController: Cancelling operation ");
          ((StringBuilder)localObject4).append(localObject3);
          Log.v("FragmentManager", ((StringBuilder)localObject4).toString());
        }
        localObject4 = a;
        bool1 = c.mTransitioning;
        ec.i.e(localObject4, "container");
        if (!e)
        {
          if (bool1) {
            g = true;
          }
          ((c)localObject3).a((ViewGroup)localObject4);
        }
        if (!f) {
          c.add(localObject3);
        }
      }
      p();
      Object localObject3 = q.w(b);
      boolean bool1 = ((ArrayList)localObject3).isEmpty();
      if (bool1) {
        return;
      }
      b.clear();
      c.addAll((Collection)localObject3);
      if (y.L(2)) {
        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
      }
      b((ArrayList)localObject3, d);
      localObject1 = new ec/r;
      ((r)localObject1).<init>();
      a = true;
      Object localObject4 = ((ArrayList)localObject3).iterator();
      int i = 1;
      Object localObject5;
      int j;
      while (((Iterator)localObject4).hasNext())
      {
        localObject5 = (c)((Iterator)localObject4).next();
        if ((k.isEmpty() ^ true))
        {
          Object localObject6 = k;
          if ((!(localObject6 instanceof Collection)) || (!((ArrayList)localObject6).isEmpty()))
          {
            localObject6 = ((ArrayList)localObject6).iterator();
            while (((Iterator)localObject6).hasNext()) {
              if (!((a)((Iterator)localObject6).next()).a())
              {
                j = 0;
                break label539;
              }
            }
          }
          j = 1;
          label539:
          if (j != 0)
          {
            bool1 = true;
            break label553;
          }
        }
        bool1 = false;
        label553:
        a = bool1;
        if (!c.mTransitioning) {
          i = 0;
        }
      }
      if (a)
      {
        localObject4 = new java/util/ArrayList;
        ((ArrayList)localObject4).<init>();
        localObject5 = ((ArrayList)localObject3).iterator();
        while (((Iterator)localObject5).hasNext()) {
          o.k(nextk, (ArrayList)localObject4);
        }
        if ((((ArrayList)localObject4).isEmpty() ^ true))
        {
          bool1 = bool2;
          break label650;
        }
      }
      bool1 = false;
      label650:
      a = bool1;
      if (i == 0)
      {
        o((ArrayList)localObject3);
        c((ArrayList)localObject3);
      }
      else if (bool1)
      {
        o((ArrayList)localObject3);
        j = ((ArrayList)localObject3).size();
        for (i = 0; i < j; i++) {
          a((c)((ArrayList)localObject3).get(i));
        }
      }
      d = false;
      if (y.L(2)) {
        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
      }
      localObject1 = h.a;
      return;
    }
  }
  
  public final c j(i parami)
  {
    Iterator localIterator = b.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      c localc = (c)localObject;
      int i;
      if ((ec.i.a(c, parami)) && (!e)) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        parami = (i)localObject;
        break label71;
      }
    }
    parami = null;
    label71:
    return (c)parami;
  }
  
  public final c k(i parami)
  {
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      c localc = (c)localObject;
      int i;
      if ((ec.i.a(c, parami)) && (!e)) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        parami = (i)localObject;
        break label71;
      }
    }
    parami = null;
    label71:
    return (c)parami;
  }
  
  public final void l()
  {
    if (y.L(2)) {
      Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
    }
    boolean bool = a.isAttachedToWindow();
    synchronized (b)
    {
      p();
      o(b);
      Iterator localIterator = q.w(c).iterator();
      c localc;
      StringBuilder localStringBuilder;
      while (localIterator.hasNext())
      {
        localc = (c)localIterator.next();
        if (y.L(2))
        {
          if (bool)
          {
            localObject1 = "";
          }
          else
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            ((StringBuilder)localObject1).append("Container ");
            ((StringBuilder)localObject1).append(a);
            ((StringBuilder)localObject1).append(" is not attached to window. ");
            localObject1 = ((StringBuilder)localObject1).toString();
          }
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append("SpecialEffectsController: ");
          localStringBuilder.append((String)localObject1);
          localStringBuilder.append("Cancelling running operation ");
          localStringBuilder.append(localc);
          Log.v("FragmentManager", localStringBuilder.toString());
        }
        localc.a(a);
      }
      localIterator = q.w(b).iterator();
      while (localIterator.hasNext())
      {
        localc = (c)localIterator.next();
        if (y.L(2))
        {
          if (bool)
          {
            localObject1 = "";
          }
          else
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            ((StringBuilder)localObject1).append("Container ");
            ((StringBuilder)localObject1).append(a);
            ((StringBuilder)localObject1).append(" is not attached to window. ");
            localObject1 = ((StringBuilder)localObject1).toString();
          }
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append("SpecialEffectsController: ");
          localStringBuilder.append((String)localObject1);
          localStringBuilder.append("Cancelling pending operation ");
          localStringBuilder.append(localc);
          Log.v("FragmentManager", localStringBuilder.toString());
        }
        localc.a(a);
      }
      Object localObject1 = h.a;
      return;
    }
  }
  
  public final void n()
  {
    synchronized (b)
    {
      p();
      Object localObject1 = b;
      ListIterator localListIterator = ((List)localObject1).listIterator(((ArrayList)localObject1).size());
      boolean bool2;
      Object localObject3;
      int i;
      do
      {
        boolean bool1 = localListIterator.hasPrevious();
        bool2 = false;
        localObject3 = null;
        if (!bool1) {
          break;
        }
        localObject1 = localListIterator.previous();
        c localc = (c)localObject1;
        localObject4 = c.mView;
        ec.i.d(localObject4, "operation.fragment.mView");
        i = s0.a((View)localObject4);
        if ((a == 2) && (i != 2)) {
          i = 1;
        } else {
          i = 0;
        }
      } while (i == 0);
      break label118;
      localObject1 = null;
      label118:
      Object localObject4 = (c)localObject1;
      localObject1 = localObject3;
      if (localObject4 != null) {
        localObject1 = c;
      }
      if (localObject1 != null) {
        bool2 = ((i)localObject1).isPostponed();
      }
      e = bool2;
      localObject1 = h.a;
      return;
    }
  }
  
  public final void o(ArrayList paramArrayList)
  {
    int i = paramArrayList.size();
    int j = 0;
    for (int k = 0; k < i; k++) {
      ((c)paramArrayList.get(k)).e();
    }
    Object localObject = new ArrayList();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext()) {
      o.k(nextk, (ArrayList)localObject);
    }
    paramArrayList = q.u(q.x((Iterable)localObject));
    i = paramArrayList.size();
    for (k = j; k < i; k++)
    {
      localObject = (a)paramArrayList.get(k);
      ViewGroup localViewGroup = a;
      localObject.getClass();
      ec.i.e(localViewGroup, "container");
      if (!a) {
        ((a)localObject).e(localViewGroup);
      }
      a = true;
    }
  }
  
  public final void p()
  {
    Iterator localIterator = b.iterator();
    while (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      int i = b;
      int j = 2;
      if (i == 2)
      {
        View localView = c.requireView();
        ec.i.d(localView, "fragment.requireView()");
        i = localView.getVisibility();
        if (i != 0) {
          if (i != 4)
          {
            if (i == 8) {
              j = 3;
            } else {
              throw new IllegalArgumentException(f.h("Unknown visibility ", i));
            }
          }
          else {
            j = 4;
          }
        }
        localc.d(j, 1);
      }
    }
  }
  
  public static class a
  {
    public boolean a;
    public boolean b;
    
    public boolean a()
    {
      return this instanceof e.c;
    }
    
    public void b(ViewGroup paramViewGroup)
    {
      ec.i.e(paramViewGroup, "container");
    }
    
    public void c(ViewGroup paramViewGroup)
    {
      ec.i.e(paramViewGroup, "container");
    }
    
    public void d(b paramb, ViewGroup paramViewGroup)
    {
      ec.i.e(paramb, "backEvent");
      ec.i.e(paramViewGroup, "container");
    }
    
    public void e(ViewGroup paramViewGroup) {}
  }
  
  public static final class b
    extends r0.c
  {
    public final e0 l;
    
    public b(int paramInt1, int paramInt2, e0 parame0)
    {
      super(paramInt2, locali);
      l = parame0;
    }
    
    public final void b()
    {
      super.b();
      c.mTransitioning = false;
      l.k();
    }
    
    public final void e()
    {
      if (h) {
        return;
      }
      int i = 1;
      h = true;
      int j = b;
      Object localObject1;
      Object localObject2;
      Object localObject3;
      if (j == 2)
      {
        localObject1 = l.c;
        ec.i.d(localObject1, "fragmentStateManager.fragment");
        localObject2 = mView.findFocus();
        if (localObject2 != null)
        {
          ((i)localObject1).setFocusedView((View)localObject2);
          if (y.L(2))
          {
            localObject3 = new StringBuilder();
            ((StringBuilder)localObject3).append("requestFocus: Saved focused view ");
            ((StringBuilder)localObject3).append(localObject2);
            ((StringBuilder)localObject3).append(" for Fragment ");
            ((StringBuilder)localObject3).append(localObject1);
            Log.v("FragmentManager", ((StringBuilder)localObject3).toString());
          }
        }
        localObject2 = c.requireView();
        ec.i.d(localObject2, "this.fragment.requireView()");
        if (((View)localObject2).getParent() == null)
        {
          l.b();
          ((View)localObject2).setAlpha(0.0F);
        }
        if (((View)localObject2).getAlpha() != 0.0F) {
          i = 0;
        }
        if ((i != 0) && (((View)localObject2).getVisibility() == 0)) {
          ((View)localObject2).setVisibility(4);
        }
        ((View)localObject2).setAlpha(((i)localObject1).getPostOnViewCreatedAlpha());
      }
      else if (j == 3)
      {
        localObject3 = l.c;
        ec.i.d(localObject3, "fragmentStateManager.fragment");
        localObject1 = ((i)localObject3).requireView();
        ec.i.d(localObject1, "fragment.requireView()");
        if (y.L(2))
        {
          localObject2 = f.l("Clearing focus ");
          ((StringBuilder)localObject2).append(((View)localObject1).findFocus());
          ((StringBuilder)localObject2).append(" on view ");
          ((StringBuilder)localObject2).append(localObject1);
          ((StringBuilder)localObject2).append(" for Fragment ");
          ((StringBuilder)localObject2).append(localObject3);
          Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
        }
        ((View)localObject1).clearFocus();
      }
    }
  }
  
  public static class c
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
    
    public c(int paramInt1, int paramInt2, i parami)
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
}

/* Location:
 * Qualified Name:     x0.r0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */