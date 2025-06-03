package b1;

import ec.i;
import f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import n.a;
import n.b;
import n.b.b;
import n.b.c;
import n.b.d;
import n.b.e;
import qc.t;

public final class p
  extends k
{
  public final boolean a = true;
  public a<n, a> b = new a();
  public k.b c;
  public final WeakReference<o> d;
  public int e;
  public boolean f;
  public boolean g;
  public ArrayList<k.b> h;
  public final t i;
  
  public p(o paramo)
  {
    k.b localb = k.b.b;
    c = localb;
    h = new ArrayList();
    d = new WeakReference(paramo);
    i = new t(localb);
  }
  
  public final void a(n paramn)
  {
    i.e(paramn, "observer");
    e("addObserver");
    Object localObject1 = c;
    Object localObject2 = k.b.a;
    if (localObject1 != localObject2) {
      localObject2 = k.b.b;
    }
    localObject1 = new a(paramn, (k.b)localObject2);
    if ((a)b.h(paramn, localObject1) != null) {
      return;
    }
    o localo = (o)d.get();
    if (localo == null) {
      return;
    }
    int j;
    if ((e == 0) && (!f)) {
      j = 0;
    } else {
      j = 1;
    }
    localObject2 = d(paramn);
    e += 1;
    while ((a.compareTo((Enum)localObject2) < 0) && (b.e.containsKey(paramn)))
    {
      localObject2 = a;
      h.add(localObject2);
      localObject2 = k.a.Companion;
      k.b localb = a;
      localObject2.getClass();
      localObject2 = k.a.a.b(localb);
      if (localObject2 != null)
      {
        ((a)localObject1).a(localo, (k.a)localObject2);
        localObject2 = h;
        ((ArrayList)localObject2).remove(((ArrayList)localObject2).size() - 1);
        localObject2 = d(paramn);
      }
      else
      {
        paramn = f.l("no event up from ");
        paramn.append(a);
        throw new IllegalStateException(paramn.toString());
      }
    }
    if (j == 0) {
      i();
    }
    e -= 1;
  }
  
  public final k.b b()
  {
    return c;
  }
  
  public final void c(n paramn)
  {
    i.e(paramn, "observer");
    e("removeObserver");
    b.i(paramn);
  }
  
  public final k.b d(n paramn)
  {
    Object localObject1 = b;
    boolean bool = e.containsKey(paramn);
    Object localObject2 = null;
    if (bool) {
      paramn = e.get(paramn)).d;
    } else {
      paramn = null;
    }
    if (paramn != null)
    {
      paramn = (a)b;
      if (paramn != null)
      {
        paramn = a;
        break label67;
      }
    }
    paramn = null;
    label67:
    if ((h.isEmpty() ^ true))
    {
      localObject2 = h;
      localObject2 = (k.b)((ArrayList)localObject2).get(((ArrayList)localObject2).size() - 1);
    }
    localObject1 = c;
    i.e(localObject1, "state1");
    if ((paramn == null) || (paramn.compareTo((Enum)localObject1) >= 0)) {
      paramn = (n)localObject1;
    }
    if ((localObject2 == null) || (((Enum)localObject2).compareTo(paramn) >= 0)) {
      localObject2 = paramn;
    }
    return (k.b)localObject2;
  }
  
  public final void e(String paramString)
  {
    if ((a) && (!m.c.v().w())) {
      throw new IllegalStateException(g.e("Method ", paramString, " must be called on the main thread").toString());
    }
  }
  
  public final void f(k.a parama)
  {
    i.e(parama, "event");
    e("handleLifecycleEvent");
    g(parama.f());
  }
  
  public final void g(k.b paramb)
  {
    k.b localb1 = k.b.a;
    k.b localb2 = c;
    if (localb2 == paramb) {
      return;
    }
    int j;
    if ((localb2 == k.b.b) && (paramb == localb1)) {
      j = 0;
    } else {
      j = 1;
    }
    if (j != 0)
    {
      c = paramb;
      if ((!f) && (e == 0))
      {
        f = true;
        i();
        f = false;
        if (c == localb1) {
          b = new a();
        }
        return;
      }
      g = true;
      return;
    }
    paramb = f.l("no event down from ");
    paramb.append(c);
    paramb.append(" in component ");
    paramb.append(d.get());
    throw new IllegalStateException(paramb.toString().toString());
  }
  
  public final void h(k.b paramb)
  {
    i.e(paramb, "state");
    e("setCurrentState");
    g(paramb);
  }
  
  public final void i()
  {
    Object localObject1 = (o)d.get();
    if (localObject1 != null)
    {
      Object localObject4;
      Object localObject5;
      Object localObject6;
      label356:
      do
      {
        localObject2 = b;
        int j = d;
        int k = 1;
        if (j != 0)
        {
          localObject2 = a;
          i.b(localObject2);
          localObject2 = b).a;
          localObject3 = b.b;
          i.b(localObject3);
          localObject3 = b).a;
          if ((localObject2 != localObject3) || (c != localObject3)) {
            k = 0;
          }
        }
        g = false;
        if (k != 0) {
          break;
        }
        localObject2 = c;
        localObject3 = b.a;
        i.b(localObject3);
        if (((Enum)localObject2).compareTo(b).a) < 0)
        {
          localObject3 = b;
          localObject2 = new b.b(b, a);
          c.put(localObject2, Boolean.FALSE);
          while ((((b.e)localObject2).hasNext()) && (!g))
          {
            localObject4 = (Map.Entry)((b.e)localObject2).next();
            i.d(localObject4, "next()");
            localObject3 = (n)((Map.Entry)localObject4).getKey();
            localObject4 = (a)((Map.Entry)localObject4).getValue();
            while ((a.compareTo(c) > 0) && (!g) && (b.e.containsKey(localObject3)))
            {
              localObject5 = k.a.Companion;
              localObject6 = a;
              localObject5.getClass();
              localObject6 = k.a.a.a((k.b)localObject6);
              if (localObject6 == null) {
                break label356;
              }
              localObject5 = ((k.a)localObject6).f();
              h.add(localObject5);
              ((a)localObject4).a((o)localObject1, (k.a)localObject6);
              localObject6 = h;
              ((ArrayList)localObject6).remove(((ArrayList)localObject6).size() - 1);
            }
            continue;
            localObject1 = f.l("no event down from ");
            ((StringBuilder)localObject1).append(a);
            throw new IllegalStateException(((StringBuilder)localObject1).toString());
          }
        }
        localObject2 = b.b;
      } while ((g) || (localObject2 == null) || (c.compareTo(b).a) <= 0));
      Object localObject3 = b;
      localObject3.getClass();
      Object localObject2 = new b.d((b)localObject3);
      c.put(localObject2, Boolean.FALSE);
      while ((((b.d)localObject2).hasNext()) && (!g))
      {
        localObject4 = (Map.Entry)((b.d)localObject2).next();
        localObject3 = (n)((Map.Entry)localObject4).getKey();
        localObject4 = (a)((Map.Entry)localObject4).getValue();
        while ((a.compareTo(c) < 0) && (!g) && (b.e.containsKey(localObject3)))
        {
          localObject6 = a;
          h.add(localObject6);
          localObject5 = k.a.Companion;
          localObject6 = a;
          localObject5.getClass();
          localObject6 = k.a.a.b((k.b)localObject6);
          if (localObject6 == null) {
            break label619;
          }
          ((a)localObject4).a((o)localObject1, (k.a)localObject6);
          localObject6 = h;
          ((ArrayList)localObject6).remove(((ArrayList)localObject6).size() - 1);
        }
      }
      label619:
      localObject1 = f.l("no event up from ");
      ((StringBuilder)localObject1).append(a);
      throw new IllegalStateException(((StringBuilder)localObject1).toString());
      i.setValue(c);
      return;
    }
    throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
  }
  
  public static final class a
  {
    public k.b a;
    public m b;
    
    public a(n paramn, k.b paramb)
    {
      i.b(paramn);
      Object localObject = s.a;
      boolean bool1 = paramn instanceof m;
      boolean bool2 = paramn instanceof d;
      if ((bool1) && (bool2))
      {
        paramn = new e((d)paramn, (m)paramn);
      }
      else if (bool2)
      {
        paramn = new e((d)paramn, null);
      }
      else if (bool1)
      {
        paramn = (m)paramn;
      }
      else
      {
        localObject = paramn.getClass();
        if (s.c((Class)localObject) == 2)
        {
          localObject = s.b.get(localObject);
          i.b(localObject);
          List localList = (List)localObject;
          int i = localList.size();
          int j = 0;
          if (i == 1)
          {
            paramn = new n0(s.a((Constructor)localList.get(0), paramn));
          }
          else
          {
            i = localList.size();
            g[] arrayOfg = new g[i];
            while (j < i)
            {
              localObject = s.a;
              arrayOfg[j] = s.a((Constructor)localList.get(j), paramn);
              j++;
            }
            paramn = new c(arrayOfg);
          }
        }
        else
        {
          paramn = new b0(paramn);
        }
      }
      b = paramn;
      a = paramb;
    }
    
    public final void a(o paramo, k.a parama)
    {
      k.b localb1 = parama.f();
      k.b localb2 = a;
      i.e(localb2, "state1");
      k.b localb3 = localb2;
      if (localb1.compareTo(localb2) < 0) {
        localb3 = localb1;
      }
      a = localb3;
      b.a(paramo, parama);
      a = localb1;
    }
  }
}

/* Location:
 * Qualified Name:     b1.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */