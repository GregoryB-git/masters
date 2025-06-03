package x0;

import a0.c;
import android.graphics.Rect;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import b.k;
import dc.a;
import e0.d0;
import e0.d0.d;
import e0.k0;
import e0.w;
import ec.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import sb.m;
import sb.q;

public final class e$g
  extends r0.a
{
  public final List<e.h> c;
  public final r0.c d;
  public final r0.c e;
  public final n0 f;
  public final Object g;
  public final ArrayList<View> h;
  public final ArrayList<View> i;
  public final r.b<String, String> j;
  public final ArrayList<String> k;
  public final ArrayList<String> l;
  public final r.b<String, View> m;
  public final r.b<String, View> n;
  public final boolean o;
  public final c p;
  
  public e$g(ArrayList paramArrayList1, r0.c paramc1, r0.c paramc2, n0 paramn0, Object paramObject, ArrayList paramArrayList2, ArrayList paramArrayList3, r.b paramb1, ArrayList paramArrayList4, ArrayList paramArrayList5, r.b paramb2, r.b paramb3, boolean paramBoolean)
  {
    c = paramArrayList1;
    d = paramc1;
    e = paramc2;
    f = paramn0;
    g = paramObject;
    h = paramArrayList2;
    i = paramArrayList3;
    j = paramb1;
    k = paramArrayList4;
    l = paramArrayList5;
    m = paramb2;
    n = paramb3;
    o = paramBoolean;
    p = new c();
  }
  
  public static void f(ArrayList paramArrayList, View paramView)
  {
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      if (k0.b(localViewGroup))
      {
        if (paramArrayList.contains(paramView)) {
          return;
        }
      }
      else
      {
        int i1 = localViewGroup.getChildCount();
        for (int i2 = 0; i2 < i1; i2++)
        {
          paramView = localViewGroup.getChildAt(i2);
          if (paramView.getVisibility() == 0) {
            f(paramArrayList, paramView);
          }
        }
      }
    }
    else if (paramArrayList.contains(paramView))
    {
      return;
    }
    paramArrayList.add(paramView);
  }
  
  public final boolean a()
  {
    f.h();
    return false;
  }
  
  public final void b(ViewGroup arg1)
  {
    ec.i.e(???, "container");
    synchronized (p)
    {
      if (!a) {
        a = true;
      }
      try
      {
        ???.notifyAll();
        return;
      }
      finally {}
    }
  }
  
  public final void c(final ViewGroup paramViewGroup)
  {
    ec.i.e(paramViewGroup, "container");
    if (!paramViewGroup.isLaidOut())
    {
      localObject1 = c.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (e.h)((Iterator)localObject1).next();
        localObject3 = a;
        if (y.L(2))
        {
          localObject4 = new StringBuilder();
          ((StringBuilder)localObject4).append("SpecialEffectsController: Container ");
          ((StringBuilder)localObject4).append(paramViewGroup);
          ((StringBuilder)localObject4).append(" has not been laid out. Completing operation ");
          ((StringBuilder)localObject4).append(localObject3);
          Log.v("FragmentManager", ((StringBuilder)localObject4).toString());
        }
        a.c(this);
      }
      return;
    }
    final Object localObject2 = g(paramViewGroup, e, d);
    Object localObject3 = (ArrayList)a;
    localObject2 = b;
    Object localObject1 = c;
    Object localObject4 = new ArrayList(m.j((Iterable)localObject1));
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext()) {
      ((ArrayList)localObject4).add(nexta);
    }
    Iterator localIterator = ((ArrayList)localObject4).iterator();
    while (localIterator.hasNext())
    {
      localObject1 = (r0.c)localIterator.next();
      localObject4 = f;
      i locali = c;
      ((n0)localObject4).o(localObject2, new f(0, localObject1, this));
    }
    i((ArrayList)localObject3, paramViewGroup, new a(this, paramViewGroup, localObject2));
    if (y.L(2))
    {
      paramViewGroup = new StringBuilder();
      paramViewGroup.append("Completed executing operations from ");
      paramViewGroup.append(d);
      paramViewGroup.append(" to ");
      paramViewGroup.append(e);
      Log.v("FragmentManager", paramViewGroup.toString());
    }
  }
  
  public final void d(b.b paramb, ViewGroup paramViewGroup)
  {
    ec.i.e(paramb, "backEvent");
    ec.i.e(paramViewGroup, "container");
  }
  
  public final void e(ViewGroup paramViewGroup)
  {
    if (!paramViewGroup.isLaidOut())
    {
      Iterator localIterator = c.iterator();
      while (localIterator.hasNext())
      {
        r0.c localc = nexta;
        if (y.L(2))
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("SpecialEffectsController: Container ");
          localStringBuilder.append(paramViewGroup);
          localStringBuilder.append(" has not been laid out. Skipping onStart for operation ");
          localStringBuilder.append(localc);
          Log.v("FragmentManager", localStringBuilder.toString());
        }
      }
      return;
    }
    if ((h()) && (g != null))
    {
      a();
      paramViewGroup = new StringBuilder();
      paramViewGroup.append("Ignoring shared elements transition ");
      paramViewGroup.append(g);
      paramViewGroup.append(" between ");
      paramViewGroup.append(d);
      paramViewGroup.append(" and ");
      paramViewGroup.append(e);
      paramViewGroup.append(" as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
      Log.i("FragmentManager", paramViewGroup.toString());
    }
    a();
  }
  
  public final rb.d<ArrayList<View>, Object> g(ViewGroup paramViewGroup, r0.c paramc1, r0.c paramc2)
  {
    Object localObject1 = paramc1;
    View localView = new View(paramViewGroup.getContext());
    Rect localRect = new Rect();
    Iterator localIterator = c.iterator();
    Object localObject2 = null;
    int i1 = 0;
    Object localObject3 = null;
    int i2;
    Object localObject4;
    while (localIterator.hasNext())
    {
      if (nextd != null) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      if ((i2 != 0) && (paramc2 != null) && (localObject1 != null) && ((j.isEmpty() ^ true)) && (g != null))
      {
        h0.a(c, c, o, m);
        w.a(paramViewGroup, new g(localObject1, paramc2, this, 0));
        h.addAll(m.values());
        if ((l.isEmpty() ^ true))
        {
          localObject3 = l.get(0);
          ec.i.d(localObject3, "exitingNames[0]");
          localObject3 = (String)localObject3;
          localObject3 = (View)m.getOrDefault(localObject3, null);
          f.m((View)localObject3, g);
        }
        i.addAll(n.values());
        i2 = i1;
        if ((k.isEmpty() ^ true))
        {
          localObject4 = k.get(0);
          ec.i.d(localObject4, "enteringNames[0]");
          localObject4 = (String)localObject4;
          localObject4 = (View)n.getOrDefault(localObject4, null);
          i2 = i1;
          if (localObject4 != null)
          {
            w.a(paramViewGroup, new d(f, localObject4, localRect, 1));
            i2 = 1;
          }
        }
        f.p(g, localView, h);
        localObject4 = f;
        localObject5 = g;
        ((n0)localObject4).l(localObject5, null, null, localObject5, i);
        i1 = i2;
      }
    }
    Object localObject5 = new ArrayList();
    localIterator = c.iterator();
    localObject1 = null;
    while (localIterator.hasNext())
    {
      e.h localh = (e.h)localIterator.next();
      Object localObject6 = a;
      Transition localTransition = f.e(b);
      if (localTransition != null)
      {
        Object localObject7 = new ArrayList();
        localObject4 = c.mView;
        ec.i.d(localObject4, "operation.fragment.mView");
        f((ArrayList)localObject7, (View)localObject4);
        if ((g != null) && ((localObject6 == paramc2) || (localObject6 == paramc1))) {
          i2 = 1;
        } else {
          i2 = 0;
        }
        if (i2 != 0)
        {
          if (localObject6 == paramc2) {
            localObject4 = h;
          } else {
            localObject4 = i;
          }
          ((ArrayList)localObject7).removeAll(q.x((Iterable)localObject4));
        }
        if (((ArrayList)localObject7).isEmpty())
        {
          f.a(localView, localTransition);
        }
        else
        {
          f.b(localTransition, (ArrayList)localObject7);
          f.l(localTransition, localTransition, (ArrayList)localObject7, null, null);
          if (a == 3)
          {
            i = false;
            localObject4 = new ArrayList((Collection)localObject7);
            ((ArrayList)localObject4).remove(c.mView);
            f.k(localTransition, c.mView, (ArrayList)localObject4);
            w.a(paramViewGroup, new k(localObject7, 4));
          }
        }
        if (a == 2)
        {
          ((ArrayList)localObject5).addAll((Collection)localObject7);
          if (i1 != 0) {
            f.n(localTransition, localRect);
          }
          if (y.L(2))
          {
            localObject4 = new StringBuilder();
            ((StringBuilder)localObject4).append("Entering Transition: ");
            ((StringBuilder)localObject4).append(localTransition);
            Log.v("FragmentManager", ((StringBuilder)localObject4).toString());
            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
            localObject4 = ((ArrayList)localObject7).iterator();
            while (((Iterator)localObject4).hasNext())
            {
              localObject7 = ((Iterator)localObject4).next();
              ec.i.d(localObject7, "transitioningViews");
              localObject6 = (View)localObject7;
              localObject7 = new StringBuilder();
              ((StringBuilder)localObject7).append("View: ");
              ((StringBuilder)localObject7).append(localObject6);
              Log.v("FragmentManager", ((StringBuilder)localObject7).toString());
            }
          }
        }
        else
        {
          f.m((View)localObject3, localTransition);
          if (y.L(2))
          {
            localObject4 = new StringBuilder();
            ((StringBuilder)localObject4).append("Exiting Transition: ");
            ((StringBuilder)localObject4).append(localTransition);
            Log.v("FragmentManager", ((StringBuilder)localObject4).toString());
            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
            localObject4 = ((ArrayList)localObject7).iterator();
            while (((Iterator)localObject4).hasNext())
            {
              localObject7 = ((Iterator)localObject4).next();
              ec.i.d(localObject7, "transitioningViews");
              localObject6 = (View)localObject7;
              localObject7 = new StringBuilder();
              ((StringBuilder)localObject7).append("View: ");
              ((StringBuilder)localObject7).append(localObject6);
              Log.v("FragmentManager", ((StringBuilder)localObject7).toString());
            }
          }
        }
        if (c) {
          localObject2 = f.j(localObject2, localTransition);
        } else {
          localObject1 = f.j(localObject1, localTransition);
        }
      }
    }
    paramViewGroup = f.i(localObject2, localObject1, g);
    if (y.L(2))
    {
      paramc1 = new StringBuilder();
      paramc1.append("Final merged transition: ");
      paramc1.append(paramViewGroup);
      Log.v("FragmentManager", paramc1.toString());
    }
    return new rb.d(localObject5, paramViewGroup);
  }
  
  public final boolean h()
  {
    Object localObject = c;
    boolean bool1 = localObject instanceof Collection;
    boolean bool2 = true;
    if ((bool1) && (((Collection)localObject).isEmpty()))
    {
      bool1 = bool2;
    }
    else
    {
      localObject = ((Iterable)localObject).iterator();
      do
      {
        bool1 = bool2;
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
      } while (nexta.c.mTransitioning);
      bool1 = false;
    }
    return bool1;
  }
  
  public final void i(ArrayList<View> paramArrayList, ViewGroup paramViewGroup, a<rb.h> parama)
  {
    h0.c(4, paramArrayList);
    Object localObject1 = f;
    Object localObject2 = i;
    localObject1.getClass();
    localObject1 = new ArrayList();
    int i1 = ((ArrayList)localObject2).size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      localObject3 = (View)((ArrayList)localObject2).get(i2);
      localObject4 = d0.a;
      ((ArrayList)localObject1).add(d0.d.k((View)localObject3));
      d0.d.v((View)localObject3, null);
    }
    Object localObject5;
    if (y.L(2))
    {
      Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
      Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
      localObject2 = h.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject4 = ((Iterator)localObject2).next();
        ec.i.d(localObject4, "sharedElementFirstOutViews");
        localObject3 = (View)localObject4;
        localObject5 = new StringBuilder();
        ((StringBuilder)localObject5).append("View: ");
        ((StringBuilder)localObject5).append(localObject3);
        ((StringBuilder)localObject5).append(" Name: ");
        localObject4 = d0.a;
        ((StringBuilder)localObject5).append(d0.d.k((View)localObject3));
        Log.v("FragmentManager", ((StringBuilder)localObject5).toString());
      }
      Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
      localObject2 = i.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject4 = ((Iterator)localObject2).next();
        ec.i.d(localObject4, "sharedElementLastInViews");
        localObject5 = (View)localObject4;
        localObject3 = new StringBuilder();
        ((StringBuilder)localObject3).append("View: ");
        ((StringBuilder)localObject3).append(localObject5);
        ((StringBuilder)localObject3).append(" Name: ");
        localObject4 = d0.a;
        ((StringBuilder)localObject3).append(d0.d.k((View)localObject5));
        Log.v("FragmentManager", ((StringBuilder)localObject3).toString());
      }
    }
    parama.invoke();
    Object localObject3 = f;
    Object localObject4 = h;
    parama = i;
    localObject2 = j;
    localObject3.getClass();
    int i3 = parama.size();
    localObject3 = new ArrayList();
    for (i2 = 0; i2 < i3; i2++)
    {
      localObject5 = (View)((ArrayList)localObject4).get(i2);
      Object localObject6 = d0.a;
      localObject6 = d0.d.k((View)localObject5);
      ((ArrayList)localObject3).add(localObject6);
      if (localObject6 != null)
      {
        d0.d.v((View)localObject5, null);
        localObject5 = (String)((r.h)localObject2).getOrDefault(localObject6, null);
        for (i1 = 0; i1 < i3; i1++) {
          if (((String)localObject5).equals(((ArrayList)localObject1).get(i1)))
          {
            d0.d.v((View)parama.get(i1), (String)localObject6);
            break;
          }
        }
      }
    }
    w.a(paramViewGroup, new m0(i3, parama, (ArrayList)localObject1, (ArrayList)localObject4, (ArrayList)localObject3));
    h0.c(0, paramArrayList);
    f.q(g, h, i);
  }
  
  public static final class a
    extends j
    implements a<rb.h>
  {
    public a(e.g paramg, ViewGroup paramViewGroup, Object paramObject)
    {
      super();
    }
    
    public final Object invoke()
    {
      a.f.c(paramViewGroup, localObject2);
      return rb.h.a;
    }
  }
}

/* Location:
 * Qualified Name:     x0.e.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */