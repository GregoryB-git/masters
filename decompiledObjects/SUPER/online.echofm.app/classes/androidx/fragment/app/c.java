package androidx.fragment.app;

import H.e;
import I.q;
import I.s;
import I.v;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import t.a;
import t.h;

public class c
  extends B
{
  public c(ViewGroup paramViewGroup)
  {
    super(paramViewGroup);
  }
  
  public void f(final List paramList, boolean paramBoolean)
  {
    Object localObject1 = paramList.iterator();
    Object localObject2 = null;
    Object localObject3 = null;
    while (((Iterator)localObject1).hasNext())
    {
      localObject4 = (B.e)((Iterator)localObject1).next();
      localObject5 = B.e.c.h(fV);
      int i = a.a[localObject4.e().ordinal()];
      if ((i != 1) && (i != 2) && (i != 3))
      {
        if ((i == 4) && (localObject5 != B.e.c.p)) {
          localObject3 = localObject4;
        }
      }
      else if ((localObject5 == B.e.c.p) && (localObject2 == null)) {
        localObject2 = localObject4;
      }
    }
    localObject1 = new ArrayList();
    Object localObject5 = new ArrayList();
    final Object localObject4 = new ArrayList(paramList);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (B.e)localIterator.next();
      E.c localc = new E.c();
      paramList.j(localc);
      ((List)localObject1).add(new k(paramList, localc));
      localc = new E.c();
      paramList.j(localc);
      boolean bool = false;
      if (paramBoolean)
      {
        if (paramList != localObject2) {}
      }
      else {
        while (paramList == localObject3)
        {
          bool = true;
          break;
        }
      }
      ((List)localObject5).add(new m(paramList, localc, paramBoolean, bool));
      paramList.a(new b((List)localObject4, paramList));
    }
    paramList = x((List)localObject5, paramBoolean, (B.e)localObject2, (B.e)localObject3);
    w((List)localObject1, (List)localObject4, paramList.containsValue(Boolean.TRUE), paramList);
    paramList = ((List)localObject4).iterator();
    while (paramList.hasNext()) {
      s((B.e)paramList.next());
    }
    ((List)localObject4).clear();
  }
  
  public void s(B.e parame)
  {
    View localView = fV;
    parame.e().c(localView);
  }
  
  public void t(ArrayList paramArrayList, View paramView)
  {
    Object localObject = paramView;
    if ((paramView instanceof ViewGroup))
    {
      localObject = (ViewGroup)paramView;
      if (!v.a((ViewGroup)localObject))
      {
        int i = ((ViewGroup)localObject).getChildCount();
        for (int j = 0; j < i; j++)
        {
          paramView = ((ViewGroup)localObject).getChildAt(j);
          if (paramView.getVisibility() == 0) {
            t(paramArrayList, paramView);
          }
        }
      }
    }
    paramArrayList.add(localObject);
  }
  
  public void u(Map paramMap, View paramView)
  {
    Object localObject = s.q(paramView);
    if (localObject != null) {
      paramMap.put(localObject, paramView);
    }
    if ((paramView instanceof ViewGroup))
    {
      localObject = (ViewGroup)paramView;
      int i = ((ViewGroup)localObject).getChildCount();
      for (int j = 0; j < i; j++)
      {
        paramView = ((ViewGroup)localObject).getChildAt(j);
        if (paramView.getVisibility() == 0) {
          u(paramMap, paramView);
        }
      }
    }
  }
  
  public void v(a parama, Collection paramCollection)
  {
    parama = parama.entrySet().iterator();
    while (parama.hasNext()) {
      if (!paramCollection.contains(s.q((View)((Map.Entry)parama.next()).getValue()))) {
        parama.remove();
      }
    }
  }
  
  public final void w(List paramList1, final List paramList2, boolean paramBoolean, final Map paramMap)
  {
    final ViewGroup localViewGroup = m();
    Context localContext = localViewGroup.getContext();
    Object localObject1 = new ArrayList();
    paramList1 = paramList1.iterator();
    int i = 0;
    final Object localObject2;
    while (paramList1.hasNext())
    {
      localObject2 = (k)paramList1.next();
      if (((l)localObject2).d()) {
        label60:
        ((l)localObject2).a();
      }
      final Object localObject4;
      for (;;)
      {
        break;
        localObject3 = ((k)localObject2).e(localContext);
        if (localObject3 == null) {
          break label60;
        }
        localObject4 = b;
        if (localObject4 != null) {
          break label108;
        }
        ((ArrayList)localObject1).add(localObject2);
      }
      label108:
      final B.e locale = ((l)localObject2).b();
      final Object localObject3 = locale.f();
      if (Boolean.TRUE.equals(paramMap.get(locale)))
      {
        if (n.D0(2))
        {
          localObject4 = new StringBuilder();
          ((StringBuilder)localObject4).append("Ignoring Animator set on ");
          ((StringBuilder)localObject4).append(localObject3);
          ((StringBuilder)localObject4).append(" as this Fragment was involved in a Transition.");
          Log.v("FragmentManager", ((StringBuilder)localObject4).toString());
        }
        ((l)localObject2).a();
      }
      else
      {
        final boolean bool;
        if (locale.e() == B.e.c.q) {
          bool = true;
        } else {
          bool = false;
        }
        if (bool) {
          paramList2.remove(locale);
        }
        localObject3 = V;
        localViewGroup.startViewTransition((View)localObject3);
        ((Animator)localObject4).addListener(new c(localViewGroup, (View)localObject3, bool, locale, (k)localObject2));
        ((Animator)localObject4).setTarget(localObject3);
        ((Animator)localObject4).start();
        ((l)localObject2).c().c(new d((Animator)localObject4));
        i = 1;
      }
    }
    localObject1 = ((ArrayList)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      paramMap = (k)((Iterator)localObject1).next();
      paramList1 = paramMap.b();
      paramList2 = paramList1.f();
      if (paramBoolean) {
        if (n.D0(2))
        {
          paramList1 = new StringBuilder();
          paramList1.append("Ignoring Animation set on ");
          paramList1.append(paramList2);
        }
      }
      for (paramList2 = " as Animations cannot run alongside Transitions.";; paramList2 = " as Animations cannot run alongside Animators.")
      {
        paramList1.append(paramList2);
        Log.v("FragmentManager", paramList1.toString());
        do
        {
          paramMap.a();
          break;
          if (i == 0) {
            break label452;
          }
        } while (!n.D0(2));
        paramList1 = new StringBuilder();
        paramList1.append("Ignoring Animation set on ");
        paramList1.append(paramList2);
      }
      label452:
      paramList2 = V;
      localObject2 = (Animation)e.b(bea);
      if (paramList1.e() != B.e.c.o)
      {
        paramList2.startAnimation((Animation)localObject2);
        paramMap.a();
      }
      else
      {
        localViewGroup.startViewTransition(paramList2);
        paramList1 = new f.e((Animation)localObject2, localViewGroup, paramList2);
        paramList1.setAnimationListener(new e(localViewGroup, paramList2, paramMap));
        paramList2.startAnimation(paramList1);
      }
      paramMap.c().c(new f(paramList2, localViewGroup, paramMap));
    }
  }
  
  public final Map x(List paramList, final boolean paramBoolean, final B.e parame1, final B.e parame2)
  {
    B.e locale = parame1;
    final Object localObject1 = parame2;
    HashMap localHashMap = new HashMap();
    Object localObject2 = paramList.iterator();
    Object localObject3 = null;
    while (((Iterator)localObject2).hasNext())
    {
      localObject4 = (m)((Iterator)localObject2).next();
      if (!((l)localObject4).d())
      {
        localObject5 = ((m)localObject4).e();
        if (localObject3 == null)
        {
          localObject3 = localObject5;
        }
        else if ((localObject5 != null) && (localObject3 != localObject5))
        {
          paramList = new StringBuilder();
          paramList.append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
          paramList.append(((l)localObject4).b().f());
          paramList.append(" returned Transition ");
          paramList.append(((m)localObject4).h());
          paramList.append(" which uses a different Transition  type than other Fragments.");
          throw new IllegalArgumentException(paramList.toString());
        }
      }
    }
    if (localObject3 == null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        parame1 = (m)paramList.next();
        localHashMap.put(parame1.b(), Boolean.FALSE);
        parame1.a();
      }
      return localHashMap;
    }
    Object localObject5 = new View(m().getContext());
    final Rect localRect = new Rect();
    localObject2 = new ArrayList();
    Object localObject4 = new ArrayList();
    a locala = new a();
    Object localObject6 = paramList.iterator();
    Object localObject7 = null;
    Object localObject8 = null;
    int i = 0;
    final Object localObject9 = localObject3;
    localObject3 = localObject8;
    int j;
    Object localObject11;
    for (;;)
    {
      boolean bool = paramBoolean;
      if (!((Iterator)localObject6).hasNext()) {
        break;
      }
      localObject8 = (m)((Iterator)localObject6).next();
      if ((((m)localObject8).i()) && (locale != null) && (localObject1 != null))
      {
        localObject8 = ((y)localObject9).B(((y)localObject9).g(((m)localObject8).g()));
        localArrayList1 = parame2.f().N();
        localObject10 = parame1.f().N();
        localObject7 = parame1.f().O();
        for (j = 0; j < ((ArrayList)localObject7).size(); j++)
        {
          k = localArrayList1.indexOf(((ArrayList)localObject7).get(j));
          if (k != -1) {
            localArrayList1.set(k, ((ArrayList)localObject10).get(j));
          }
        }
        localObject7 = parame2.f().O();
        localObject10 = parame1.f();
        if (!bool)
        {
          ((Fragment)localObject10).x();
          parame2.f().v();
        }
        else
        {
          ((Fragment)localObject10).v();
          parame2.f().x();
        }
        int k = localArrayList1.size();
        for (j = 0; j < k; j++) {
          locala.put((String)localArrayList1.get(j), (String)((ArrayList)localObject7).get(j));
        }
        localObject11 = new a();
        u((Map)localObject11, fV);
        ((a)localObject11).p(localArrayList1);
        locala.p(((a)localObject11).keySet());
        localObject10 = new a();
        u((Map)localObject10, fV);
        ((a)localObject10).p((Collection)localObject7);
        ((a)localObject10).p(locala.values());
        w.x(locala, (a)localObject10);
        v((a)localObject11, locala.keySet());
        v((a)localObject10, locala.values());
        if (locala.isEmpty())
        {
          ((ArrayList)localObject2).clear();
          ((ArrayList)localObject4).clear();
          localObject7 = null;
        }
        else
        {
          w.f(parame2.f(), parame1.f(), bool, (a)localObject11, true);
          q.a(m(), new g(parame2, parame1, paramBoolean, (a)localObject10));
          localObject1 = ((a)localObject11).values().iterator();
          while (((Iterator)localObject1).hasNext()) {
            t((ArrayList)localObject2, (View)((Iterator)localObject1).next());
          }
          if (!localArrayList1.isEmpty())
          {
            localObject3 = (View)((h)localObject11).get((String)localArrayList1.get(0));
            ((y)localObject9).v(localObject8, (View)localObject3);
          }
          localObject1 = ((a)localObject10).values().iterator();
          while (((Iterator)localObject1).hasNext()) {
            t((ArrayList)localObject4, (View)((Iterator)localObject1).next());
          }
          j = i;
          if (!((ArrayList)localObject7).isEmpty())
          {
            localObject1 = (View)((h)localObject10).get((String)((ArrayList)localObject7).get(0));
            j = i;
            if (localObject1 != null)
            {
              q.a(m(), new h((y)localObject9, (View)localObject1, localRect));
              j = 1;
            }
          }
          ((y)localObject9).z(localObject8, (View)localObject5, (ArrayList)localObject2);
          ((y)localObject9).t(localObject8, null, null, null, null, localObject8, (ArrayList)localObject4);
          localObject7 = Boolean.TRUE;
          locale = parame1;
          localHashMap.put(locale, localObject7);
          localObject1 = parame2;
          localHashMap.put(localObject1, localObject7);
          localObject7 = localObject8;
          i = j;
        }
      }
    }
    localObject8 = localObject4;
    localObject6 = localObject2;
    ArrayList localArrayList1 = new ArrayList();
    final Object localObject10 = paramList.iterator();
    parame2 = null;
    parame1 = null;
    localObject2 = localObject3;
    localObject3 = localObject1;
    localObject4 = localObject5;
    localObject5 = localObject6;
    localObject1 = localObject8;
    while (((Iterator)localObject10).hasNext())
    {
      localObject11 = (m)((Iterator)localObject10).next();
      if (((l)localObject11).d())
      {
        localHashMap.put(((l)localObject11).b(), Boolean.FALSE);
        ((l)localObject11).a();
      }
      else
      {
        Object localObject12 = ((y)localObject9).g(((m)localObject11).h());
        localObject8 = ((l)localObject11).b();
        if ((localObject7 != null) && ((localObject8 == locale) || (localObject8 == localObject3))) {
          j = 1;
        } else {
          j = 0;
        }
        if (localObject12 == null)
        {
          if (j == 0)
          {
            localHashMap.put(localObject8, Boolean.FALSE);
            ((l)localObject11).a();
          }
        }
        else
        {
          final ArrayList localArrayList2 = new ArrayList();
          t(localArrayList2, fV);
          if (j != 0) {
            if (localObject8 == locale) {
              localArrayList2.removeAll((Collection)localObject5);
            } else {
              localArrayList2.removeAll((Collection)localObject1);
            }
          }
          if (localArrayList2.isEmpty())
          {
            ((y)localObject9).a(localObject12, (View)localObject4);
          }
          else
          {
            ((y)localObject9).b(localObject12, localArrayList2);
            localObject6 = localObject8;
            ((y)localObject9).t(localObject12, localObject12, localArrayList2, null, null, null, null);
            if (((B.e)localObject6).e() == B.e.c.q)
            {
              ((y)localObject9).r(localObject12, fV, localArrayList2);
              q.a(m(), new i(localArrayList2));
            }
          }
          if (((B.e)localObject8).e() == B.e.c.p)
          {
            localArrayList1.addAll(localArrayList2);
            if (i != 0) {
              ((y)localObject9).u(localObject12, localRect);
            }
          }
          else
          {
            ((y)localObject9).v(localObject12, (View)localObject2);
          }
          localHashMap.put(localObject8, Boolean.TRUE);
          if (((m)localObject11).j()) {
            parame1 = ((y)localObject9).n(parame1, localObject12, null);
          } else {
            parame2 = ((y)localObject9).n(parame2, localObject12, null);
          }
        }
      }
    }
    parame1 = ((y)localObject9).m(parame1, parame2, localObject7);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      parame2 = (m)paramList.next();
      if (!parame2.d())
      {
        localObject2 = parame2.h();
        localObject4 = parame2.b();
        if ((localObject7 != null) && ((localObject4 == locale) || (localObject4 == localObject3))) {
          i = 1;
        } else {
          i = 0;
        }
        if ((localObject2 != null) || (i != 0)) {
          ((y)localObject9).w(parame2.b().f(), parame1, parame2.c(), new j(parame2));
        }
      }
    }
    w.A(localArrayList1, 4);
    paramList = ((y)localObject9).o((ArrayList)localObject1);
    ((y)localObject9).c(m(), parame1);
    ((y)localObject9).y(m(), (ArrayList)localObject5, (ArrayList)localObject1, paramList, locala);
    w.A(localArrayList1, 0);
    ((y)localObject9).A(localObject7, (ArrayList)localObject5, (ArrayList)localObject1);
    return localHashMap;
  }
  
  public class b
    implements Runnable
  {
    public b(List paramList, B.e parame) {}
    
    public void run()
    {
      if (localObject4.contains(paramList))
      {
        localObject4.remove(paramList);
        s(paramList);
      }
    }
  }
  
  public class c
    extends AnimatorListenerAdapter
  {
    public c(ViewGroup paramViewGroup, View paramView, boolean paramBoolean, B.e parame, c.k paramk) {}
    
    public void onAnimationEnd(Animator paramAnimator)
    {
      localViewGroup.endViewTransition(localObject3);
      if (bool) {
        locale.e().c(localObject3);
      }
      localObject2.a();
    }
  }
  
  public class d
    implements E.c.b
  {
    public d(Animator paramAnimator) {}
    
    public void a()
    {
      localObject4.end();
    }
  }
  
  public class e
    implements Animation.AnimationListener
  {
    public e(ViewGroup paramViewGroup, View paramView, c.k paramk) {}
    
    public void onAnimationEnd(Animation paramAnimation)
    {
      localViewGroup.post(new a());
    }
    
    public void onAnimationRepeat(Animation paramAnimation) {}
    
    public void onAnimationStart(Animation paramAnimation) {}
    
    public class a
      implements Runnable
    {
      public a() {}
      
      public void run()
      {
        c.e locale = c.e.this;
        a.endViewTransition(b);
        c.a();
      }
    }
  }
  
  public class f
    implements E.c.b
  {
    public f(View paramView, ViewGroup paramViewGroup, c.k paramk) {}
    
    public void a()
    {
      paramList2.clearAnimation();
      localViewGroup.endViewTransition(paramList2);
      paramMap.a();
    }
  }
  
  public class g
    implements Runnable
  {
    public g(B.e parame1, B.e parame2, boolean paramBoolean, a parama) {}
    
    public void run()
    {
      w.f(parame2.f(), parame1.f(), paramBoolean, localObject10, false);
    }
  }
  
  public class h
    implements Runnable
  {
    public h(y paramy, View paramView, Rect paramRect) {}
    
    public void run()
    {
      localObject9.k(localObject1, localRect);
    }
  }
  
  public class i
    implements Runnable
  {
    public i(ArrayList paramArrayList) {}
    
    public void run()
    {
      w.A(localArrayList2, 4);
    }
  }
  
  public class j
    implements Runnable
  {
    public j(c.m paramm) {}
    
    public void run()
    {
      parame2.a();
    }
  }
  
  public static class k
    extends c.l
  {
    public boolean c = false;
    public f.d d;
    
    public k(B.e parame, E.c paramc)
    {
      super(paramc);
    }
    
    public f.d e(Context paramContext)
    {
      if (c) {
        return d;
      }
      Fragment localFragment = b().f();
      boolean bool;
      if (b().e() == B.e.c.p) {
        bool = true;
      } else {
        bool = false;
      }
      paramContext = f.b(paramContext, localFragment, bool);
      d = paramContext;
      c = true;
      return paramContext;
    }
  }
  
  public static abstract class l
  {
    public final B.e a;
    public final E.c b;
    
    public l(B.e parame, E.c paramc)
    {
      a = parame;
      b = paramc;
    }
    
    public void a()
    {
      a.d(b);
    }
    
    public B.e b()
    {
      return a;
    }
    
    public E.c c()
    {
      return b;
    }
    
    public boolean d()
    {
      B.e.c localc1 = B.e.c.h(a.f().V);
      B.e.c localc2 = a.e();
      if (localc1 != localc2)
      {
        B.e.c localc3 = B.e.c.p;
        if ((localc1 == localc3) || (localc2 == localc3))
        {
          bool = false;
          break label53;
        }
      }
      boolean bool = true;
      label53:
      return bool;
    }
  }
  
  public static class m
    extends c.l
  {
    public final Object c;
    public final boolean d;
    public final Object e;
    
    public m(B.e parame, E.c paramc, boolean paramBoolean1, boolean paramBoolean2)
    {
      super(paramc);
      if (parame.e() == B.e.c.p)
      {
        paramc = parame.f();
        if (paramBoolean1) {
          paramc = paramc.H();
        } else {
          paramc = paramc.u();
        }
        c = paramc;
        paramc = parame.f();
        if (paramBoolean1) {
          bool = paramc.p();
        }
      }
      for (boolean bool = paramc.o();; bool = true)
      {
        d = bool;
        break;
        paramc = parame.f();
        if (paramBoolean1) {
          paramc = paramc.K();
        } else {
          paramc = paramc.w();
        }
        c = paramc;
      }
      if (paramBoolean2)
      {
        parame = parame.f();
        if (paramBoolean1) {
          parame = parame.M();
        }
      }
      for (;;)
      {
        e = parame;
        break;
        parame = parame.L();
        continue;
        parame = null;
      }
    }
    
    public y e()
    {
      Object localObject = f(c);
      y localy = f(e);
      if ((localObject != null) && (localy != null) && (localObject != localy))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
        ((StringBuilder)localObject).append(b().f());
        ((StringBuilder)localObject).append(" returned Transition ");
        ((StringBuilder)localObject).append(c);
        ((StringBuilder)localObject).append(" which uses a different Transition  type than its shared element transition ");
        ((StringBuilder)localObject).append(e);
        throw new IllegalArgumentException(((StringBuilder)localObject).toString());
      }
      if (localObject == null) {
        localObject = localy;
      }
      return (y)localObject;
    }
    
    public final y f(Object paramObject)
    {
      if (paramObject == null) {
        return null;
      }
      Object localObject = w.b;
      if ((localObject != null) && (((y)localObject).e(paramObject))) {
        return (y)localObject;
      }
      localObject = w.c;
      if ((localObject != null) && (((y)localObject).e(paramObject))) {
        return (y)localObject;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Transition ");
      ((StringBuilder)localObject).append(paramObject);
      ((StringBuilder)localObject).append(" for fragment ");
      ((StringBuilder)localObject).append(b().f());
      ((StringBuilder)localObject).append(" is not a valid framework Transition or AndroidX Transition");
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    
    public Object g()
    {
      return e;
    }
    
    public Object h()
    {
      return c;
    }
    
    public boolean i()
    {
      boolean bool;
      if (e != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean j()
    {
      return d;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */