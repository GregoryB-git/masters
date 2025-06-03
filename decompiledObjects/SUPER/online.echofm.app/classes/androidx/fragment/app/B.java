package androidx.fragment.app;

import E.c;
import E.c.b;
import I.s;
import U.b;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public abstract class B
{
  public final ViewGroup a;
  public final ArrayList b = new ArrayList();
  public final ArrayList c = new ArrayList();
  public boolean d = false;
  public boolean e = false;
  
  public B(ViewGroup paramViewGroup)
  {
    a = paramViewGroup;
  }
  
  public static B n(ViewGroup paramViewGroup, n paramn)
  {
    return o(paramViewGroup, paramn.x0());
  }
  
  public static B o(ViewGroup paramViewGroup, C paramC)
  {
    Object localObject = paramViewGroup.getTag(b.b);
    if ((localObject instanceof B)) {
      return (B)localObject;
    }
    paramC = paramC.a(paramViewGroup);
    paramViewGroup.setTag(b.b, paramC);
    return paramC;
  }
  
  public final void a(B.e.c paramc, B.e.b paramb, t paramt)
  {
    c localc;
    Object localObject;
    synchronized (b)
    {
      localc = new E/c;
      localc.<init>();
      localObject = h(paramt.k());
      if (localObject != null)
      {
        ((e)localObject).k(paramc, paramb);
        return;
      }
    }
  }
  
  public void b(B.e.c paramc, t paramt)
  {
    if (n.D0(2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SpecialEffectsController: Enqueuing add operation for fragment ");
      localStringBuilder.append(paramt.k());
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    a(paramc, B.e.b.p, paramt);
  }
  
  public void c(t paramt)
  {
    if (n.D0(2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
      localStringBuilder.append(paramt.k());
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    a(B.e.c.q, B.e.b.o, paramt);
  }
  
  public void d(t paramt)
  {
    if (n.D0(2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
      localStringBuilder.append(paramt.k());
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    a(B.e.c.o, B.e.b.q, paramt);
  }
  
  public void e(t paramt)
  {
    if (n.D0(2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SpecialEffectsController: Enqueuing show operation for fragment ");
      localStringBuilder.append(paramt.k());
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    a(B.e.c.p, B.e.b.o, paramt);
  }
  
  public abstract void f(List paramList, boolean paramBoolean);
  
  public void g()
  {
    if (e) {
      return;
    }
    if (!s.t(a))
    {
      j();
      d = false;
      return;
    }
    for (;;)
    {
      e locale;
      synchronized (b)
      {
        if (b.isEmpty()) {
          break label236;
        }
        Object localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>(c);
        c.clear();
        localObject3 = ((ArrayList)localObject1).iterator();
        if (!((Iterator)localObject3).hasNext()) {
          break;
        }
        locale = (e)((Iterator)localObject3).next();
        if (n.D0(2))
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append("SpecialEffectsController: Cancelling operation ");
          ((StringBuilder)localObject1).append(locale);
          Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
        }
      }
      locale.b();
      if (!locale.i()) {
        c.add(locale);
      }
    }
    q();
    Object localObject3 = new java/util/ArrayList;
    ((ArrayList)localObject3).<init>(b);
    b.clear();
    c.addAll((Collection)localObject3);
    localIterator = ((ArrayList)localObject3).iterator();
    while (localIterator.hasNext()) {
      ((e)localIterator.next()).l();
    }
    f((List)localObject3, d);
    d = false;
    label236:
  }
  
  public final e h(Fragment paramFragment)
  {
    Iterator localIterator = b.iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      if ((locale.f().equals(paramFragment)) && (!locale.h())) {
        return locale;
      }
    }
    return null;
  }
  
  public final e i(Fragment paramFragment)
  {
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      if ((locale.f().equals(paramFragment)) && (!locale.h())) {
        return locale;
      }
    }
    return null;
  }
  
  public void j()
  {
    boolean bool = s.t(a);
    Object localObject2;
    Object localObject3;
    Object localObject4;
    StringBuilder localStringBuilder;
    synchronized (b)
    {
      q();
      Iterator localIterator = b.iterator();
      if (localIterator.hasNext()) {
        ((e)localIterator.next()).l();
      }
    }
  }
  
  public void k()
  {
    if (e)
    {
      e = false;
      g();
    }
  }
  
  public B.e.b l(t paramt)
  {
    e locale = h(paramt.k());
    if (locale != null) {
      return locale.g();
    }
    paramt = i(paramt.k());
    if (paramt != null) {
      return paramt.g();
    }
    return null;
  }
  
  public ViewGroup m()
  {
    return a;
  }
  
  public void p()
  {
    for (;;)
    {
      int i;
      synchronized (b)
      {
        q();
        e = false;
        i = b.size() - 1;
        if (i < 0) {
          break;
        }
        e locale = (e)b.get(i);
        B.e.c localc1 = B.e.c.h(fV);
        B.e.c localc2 = locale.e();
        B.e.c localc3 = B.e.c.p;
        if ((localc2 == localc3) && (localc1 != localc3)) {
          e = locale.f().a0();
        }
      }
      i--;
    }
    return;
    throw ((Throwable)localObject);
  }
  
  public final void q()
  {
    Iterator localIterator = b.iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      if (locale.g() == B.e.b.p) {
        locale.k(B.e.c.e(locale.f().q1().getVisibility()), B.e.b.o);
      }
    }
  }
  
  public void r(boolean paramBoolean)
  {
    d = paramBoolean;
  }
  
  public class a
    implements Runnable
  {
    public a(B.d paramd) {}
    
    public void run()
    {
      if (b.contains(o)) {
        o.e().c(o.f().V);
      }
    }
  }
  
  public class b
    implements Runnable
  {
    public b(B.d paramd) {}
    
    public void run()
    {
      b.remove(o);
      c.remove(o);
    }
  }
  
  public static class d
    extends B.e
  {
    public final t h;
    
    public d(B.e.c paramc, B.e.b paramb, t paramt, c paramc1)
    {
      super(paramb, paramt.k(), paramc1);
      h = paramt;
    }
    
    public void c()
    {
      super.c();
      h.m();
    }
    
    public void l()
    {
      Fragment localFragment = h.k();
      View localView = V.findFocus();
      if (localView != null)
      {
        localFragment.x1(localView);
        if (n.D0(2))
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("requestFocus: Saved focused view ");
          localStringBuilder.append(localView);
          localStringBuilder.append(" for Fragment ");
          localStringBuilder.append(localFragment);
          Log.v("FragmentManager", localStringBuilder.toString());
        }
      }
      if (g() == B.e.b.p)
      {
        localView = f().q1();
        if (localView.getParent() == null)
        {
          h.b();
          localView.setAlpha(0.0F);
        }
        if ((localView.getAlpha() == 0.0F) && (localView.getVisibility() == 0)) {
          localView.setVisibility(4);
        }
        localView.setAlpha(localFragment.G());
      }
    }
  }
  
  public static abstract class e
  {
    public c a;
    public b b;
    public final Fragment c;
    public final List d = new ArrayList();
    public final HashSet e = new HashSet();
    public boolean f = false;
    public boolean g = false;
    
    public e(c paramc, b paramb, Fragment paramFragment, c paramc1)
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
}

/* Location:
 * Qualified Name:     androidx.fragment.app.B
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */