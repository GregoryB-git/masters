package com.google.protobuf;

import android.support.v4.media.a;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class o
{
  public static final o d = new o(true);
  public final c0 a;
  public boolean b;
  public boolean c;
  
  public o()
  {
    a = c0.q(16);
  }
  
  public o(c0 paramc0)
  {
    a = paramc0;
    o();
  }
  
  public o(boolean paramBoolean)
  {
    this(c0.q(0));
    o();
  }
  
  public static int b(m0.b paramb, int paramInt, Object paramObject)
  {
    int i = h.O(paramInt);
    paramInt = i;
    if (paramb == m0.b.z) {
      paramInt = i * 2;
    }
    return paramInt + c(paramb, paramObject);
  }
  
  public static int c(m0.b paramb, Object paramObject)
  {
    switch (a.b[paramb.ordinal()])
    {
    default: 
      throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
    case 18: 
      if ((paramObject instanceof t.a)) {
        return h.l(((t.a)paramObject).g());
      }
      return h.l(((Integer)paramObject).intValue());
    case 17: 
      return h.L(((Long)paramObject).longValue());
    case 16: 
      return h.J(((Integer)paramObject).intValue());
    case 15: 
      return h.H(((Long)paramObject).longValue());
    case 14: 
      return h.F(((Integer)paramObject).intValue());
    case 13: 
      return h.Q(((Integer)paramObject).intValue());
    case 12: 
      if ((paramObject instanceof f)) {
        return h.h((f)paramObject);
      }
      return h.f((byte[])paramObject);
    case 11: 
      if ((paramObject instanceof f)) {
        return h.h((f)paramObject);
      }
      return h.N((String)paramObject);
    case 10: 
      return h.B((K)paramObject);
    case 9: 
      return h.t((K)paramObject);
    case 8: 
      return h.e(((Boolean)paramObject).booleanValue());
    case 7: 
      return h.n(((Integer)paramObject).intValue());
    case 6: 
      return h.p(((Long)paramObject).longValue());
    case 5: 
      return h.w(((Integer)paramObject).intValue());
    case 4: 
      return h.S(((Long)paramObject).longValue());
    case 3: 
      return h.y(((Long)paramObject).longValue());
    case 2: 
      return h.r(((Float)paramObject).floatValue());
    }
    return h.j(((Double)paramObject).doubleValue());
  }
  
  public static int d(b paramb, Object paramObject)
  {
    m0.b localb = paramb.k();
    int i = paramb.g();
    if (paramb.i())
    {
      boolean bool = paramb.q();
      int j = 0;
      int k = 0;
      paramb = (List)paramObject;
      if (bool)
      {
        paramb = paramb.iterator();
        while (paramb.hasNext()) {
          k += c(localb, paramb.next());
        }
        return h.O(i) + k + h.Q(k);
      }
      paramb = paramb.iterator();
      k = j;
      while (paramb.hasNext()) {
        k += b(localb, i, paramb.next());
      }
      return k;
    }
    return b(localb, i, paramObject);
  }
  
  public static int i(m0.b paramb, boolean paramBoolean)
  {
    if (paramBoolean) {
      return 2;
    }
    return paramb.h();
  }
  
  public static boolean l(Map.Entry paramEntry)
  {
    a.a(paramEntry.getKey());
    throw null;
  }
  
  public static boolean m(m0.b paramb, Object paramObject)
  {
    t.a(paramObject);
    int i = a.a[paramb.e().ordinal()];
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3;
    switch (i)
    {
    default: 
      return false;
    case 9: 
      return paramObject instanceof K;
    case 8: 
      bool3 = bool2;
      if (!(paramObject instanceof Integer)) {
        if ((paramObject instanceof t.a)) {
          bool3 = bool2;
        } else {
          bool3 = false;
        }
      }
      return bool3;
    case 7: 
      bool3 = bool1;
      if (!(paramObject instanceof f)) {
        if ((paramObject instanceof byte[])) {
          bool3 = bool1;
        } else {
          bool3 = false;
        }
      }
      return bool3;
    case 6: 
      return paramObject instanceof String;
    case 5: 
      return paramObject instanceof Boolean;
    case 4: 
      return paramObject instanceof Double;
    case 3: 
      return paramObject instanceof Float;
    case 2: 
      return paramObject instanceof Long;
    }
    return paramObject instanceof Integer;
  }
  
  public static o r()
  {
    return new o();
  }
  
  public static void u(h paramh, m0.b paramb, int paramInt, Object paramObject)
  {
    if (paramb == m0.b.z)
    {
      paramh.r0(paramInt, (K)paramObject);
    }
    else
    {
      paramh.N0(paramInt, i(paramb, false));
      v(paramh, paramb, paramObject);
    }
  }
  
  public static void v(h paramh, m0.b paramb, Object paramObject)
  {
    switch (a.b[paramb.ordinal()])
    {
    default: 
      break;
    case 18: 
      if ((paramObject instanceof t.a)) {}
      for (int i = ((t.a)paramObject).g();; i = ((Integer)paramObject).intValue())
      {
        paramh.k0(i);
        break;
      }
    case 17: 
      paramh.K0(((Long)paramObject).longValue());
      break;
    case 16: 
      paramh.I0(((Integer)paramObject).intValue());
      break;
    case 15: 
      paramh.G0(((Long)paramObject).longValue());
      break;
    case 14: 
      paramh.E0(((Integer)paramObject).intValue());
      break;
    case 13: 
      paramh.P0(((Integer)paramObject).intValue());
      break;
    case 12: 
      if (!(paramObject instanceof f)) {
        break;
      }
    case 11: 
      do
      {
        paramh.g0((f)paramObject);
        break;
        paramh.d0((byte[])paramObject);
        break;
      } while ((paramObject instanceof f));
      paramh.M0((String)paramObject);
      break;
    case 10: 
      paramh.A0((K)paramObject);
      break;
    case 9: 
      paramh.t0((K)paramObject);
      break;
    case 8: 
      paramh.c0(((Boolean)paramObject).booleanValue());
      break;
    case 7: 
      paramh.m0(((Integer)paramObject).intValue());
      break;
    case 6: 
      paramh.o0(((Long)paramObject).longValue());
      break;
    case 5: 
      paramh.w0(((Integer)paramObject).intValue());
      break;
    case 4: 
      paramh.R0(((Long)paramObject).longValue());
      break;
    case 3: 
      paramh.y0(((Long)paramObject).longValue());
      break;
    case 2: 
      paramh.q0(((Float)paramObject).floatValue());
      break;
    }
    paramh.i0(((Double)paramObject).doubleValue());
  }
  
  public o a()
  {
    o localo = r();
    for (int i = 0; i < a.k(); i++)
    {
      localObject = a.j(i);
      a.a(((Map.Entry)localObject).getKey());
      localo.s(null, ((Map.Entry)localObject).getValue());
    }
    Object localObject = a.m().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      a.a(localEntry.getKey());
      localo.s(null, localEntry.getValue());
    }
    c = c;
    return localo;
  }
  
  public Iterator e()
  {
    if (c) {
      return new x(a.h().iterator());
    }
    return a.h().iterator();
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof o)) {
      return false;
    }
    paramObject = (o)paramObject;
    return a.equals(a);
  }
  
  public int f()
  {
    int i = 0;
    int j = 0;
    while (i < a.k())
    {
      j += g(a.j(i));
      i++;
    }
    Iterator localIterator = a.m().iterator();
    while (localIterator.hasNext()) {
      j += g((Map.Entry)localIterator.next());
    }
    return j;
  }
  
  public final int g(Map.Entry paramEntry)
  {
    a.a(paramEntry.getKey());
    paramEntry.getValue();
    throw null;
  }
  
  public int h()
  {
    int i = 0;
    int j = 0;
    while (i < a.k())
    {
      localObject = a.j(i);
      a.a(((Map.Entry)localObject).getKey());
      j += d(null, ((Map.Entry)localObject).getValue());
      i++;
    }
    Object localObject = a.m().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      a.a(localEntry.getKey());
      j += d(null, localEntry.getValue());
    }
    return j;
  }
  
  public int hashCode()
  {
    return a.hashCode();
  }
  
  public boolean j()
  {
    return a.isEmpty();
  }
  
  public boolean k()
  {
    for (int i = 0; i < a.k(); i++) {
      if (!l(a.j(i))) {
        return false;
      }
    }
    Iterator localIterator = a.m().iterator();
    while (localIterator.hasNext()) {
      if (!l((Map.Entry)localIterator.next())) {
        return false;
      }
    }
    return true;
  }
  
  public Iterator n()
  {
    if (c) {
      return new x(a.entrySet().iterator());
    }
    return a.entrySet().iterator();
  }
  
  public void o()
  {
    if (b) {
      return;
    }
    for (int i = 0; i < a.k(); i++)
    {
      Map.Entry localEntry = a.j(i);
      if ((localEntry.getValue() instanceof r)) {
        ((r)localEntry.getValue()).J();
      }
    }
    a.p();
    b = true;
  }
  
  public void p(o paramo)
  {
    for (int i = 0; i < a.k(); i++) {
      q(a.j(i));
    }
    paramo = a.m().iterator();
    while (paramo.hasNext()) {
      q((Map.Entry)paramo.next());
    }
  }
  
  public final void q(Map.Entry paramEntry)
  {
    a.a(paramEntry.getKey());
    paramEntry.getValue();
    throw null;
  }
  
  public void s(b paramb, Object paramObject)
  {
    if (paramb.i())
    {
      if ((paramObject instanceof List))
      {
        ArrayList localArrayList = new ArrayList();
        localArrayList.addAll((List)paramObject);
        paramObject = localArrayList.iterator();
        while (((Iterator)paramObject).hasNext()) {
          t(paramb, ((Iterator)paramObject).next());
        }
        paramObject = localArrayList;
      }
      else
      {
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      }
    }
    else {
      t(paramb, paramObject);
    }
    a.r(paramb, paramObject);
  }
  
  public final void t(b paramb, Object paramObject)
  {
    if (m(paramb.k(), paramObject)) {
      return;
    }
    throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[] { Integer.valueOf(paramb.g()), paramb.k().e(), paramObject.getClass().getName() }));
  }
  
  public static abstract interface b
    extends Comparable
  {
    public abstract int g();
    
    public abstract boolean i();
    
    public abstract m0.b k();
    
    public abstract boolean q();
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */