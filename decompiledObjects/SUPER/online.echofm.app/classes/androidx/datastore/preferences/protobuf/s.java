package androidx.datastore.preferences.protobuf;

import android.support.v4.media.a;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class s
{
  public static final s d = new s(true);
  public final h0 a;
  public boolean b;
  public boolean c;
  
  public s()
  {
    a = h0.q(16);
  }
  
  public s(h0 paramh0)
  {
    a = paramh0;
    o();
  }
  
  public s(boolean paramBoolean)
  {
    this(h0.q(0));
    o();
  }
  
  public static int b(r0.b paramb, int paramInt, Object paramObject)
  {
    int i = j.P(paramInt);
    paramInt = i;
    if (paramb == r0.b.z) {
      paramInt = i * 2;
    }
    return paramInt + c(paramb, paramObject);
  }
  
  public static int c(r0.b paramb, Object paramObject)
  {
    switch (a.b[paramb.ordinal()])
    {
    default: 
      throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
    case 18: 
      return j.k(((Integer)paramObject).intValue());
    case 17: 
      return j.M(((Long)paramObject).longValue());
    case 16: 
      return j.K(((Integer)paramObject).intValue());
    case 15: 
      return j.I(((Long)paramObject).longValue());
    case 14: 
      return j.G(((Integer)paramObject).intValue());
    case 13: 
      return j.R(((Integer)paramObject).intValue());
    case 12: 
      if ((paramObject instanceof g)) {
        return j.g((g)paramObject);
      }
      return j.e((byte[])paramObject);
    case 11: 
      if ((paramObject instanceof g)) {
        return j.g((g)paramObject);
      }
      return j.O((String)paramObject);
    case 10: 
      return j.A((O)paramObject);
    case 9: 
      return j.s((O)paramObject);
    case 8: 
      return j.d(((Boolean)paramObject).booleanValue());
    case 7: 
      return j.m(((Integer)paramObject).intValue());
    case 6: 
      return j.o(((Long)paramObject).longValue());
    case 5: 
      return j.v(((Integer)paramObject).intValue());
    case 4: 
      return j.T(((Long)paramObject).longValue());
    case 3: 
      return j.x(((Long)paramObject).longValue());
    case 2: 
      return j.q(((Float)paramObject).floatValue());
    }
    return j.i(((Double)paramObject).doubleValue());
  }
  
  public static int d(b paramb, Object paramObject)
  {
    r0.b localb = paramb.k();
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
        return j.P(i) + k + j.E(k);
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
  
  public static int i(r0.b paramb, boolean paramBoolean)
  {
    if (paramBoolean) {
      return 2;
    }
    return paramb.e();
  }
  
  public static boolean l(Map.Entry paramEntry)
  {
    a.a(paramEntry.getKey());
    throw null;
  }
  
  public static boolean m(r0.b paramb, Object paramObject)
  {
    y.a(paramObject);
    int i = a.a[paramb.c().ordinal()];
    boolean bool1 = true;
    switch (i)
    {
    default: 
      return false;
    case 9: 
      return paramObject instanceof O;
    case 8: 
      return paramObject instanceof Integer;
    case 7: 
      boolean bool2 = bool1;
      if (!(paramObject instanceof g)) {
        if ((paramObject instanceof byte[])) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
      return bool2;
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
  
  public static s r()
  {
    return new s();
  }
  
  public static void u(j paramj, r0.b paramb, int paramInt, Object paramObject)
  {
    if (paramb == r0.b.z)
    {
      paramj.r0(paramInt, (O)paramObject);
    }
    else
    {
      paramj.N0(paramInt, i(paramb, false));
      v(paramj, paramb, paramObject);
    }
  }
  
  public static void v(j paramj, r0.b paramb, Object paramObject)
  {
    switch (a.b[paramb.ordinal()])
    {
    default: 
      break;
    case 18: 
      paramj.k0(((Integer)paramObject).intValue());
      break;
    case 17: 
      paramj.K0(((Long)paramObject).longValue());
      break;
    case 16: 
      paramj.I0(((Integer)paramObject).intValue());
      break;
    case 15: 
      paramj.G0(((Long)paramObject).longValue());
      break;
    case 14: 
      paramj.E0(((Integer)paramObject).intValue());
      break;
    case 13: 
      paramj.P0(((Integer)paramObject).intValue());
      break;
    case 12: 
      if (!(paramObject instanceof g)) {
        break;
      }
    case 11: 
      do
      {
        paramj.g0((g)paramObject);
        break;
        paramj.d0((byte[])paramObject);
        break;
      } while ((paramObject instanceof g));
      paramj.M0((String)paramObject);
      break;
    case 10: 
      paramj.A0((O)paramObject);
      break;
    case 9: 
      paramj.t0((O)paramObject);
      break;
    case 8: 
      paramj.c0(((Boolean)paramObject).booleanValue());
      break;
    case 7: 
      paramj.m0(((Integer)paramObject).intValue());
      break;
    case 6: 
      paramj.o0(((Long)paramObject).longValue());
      break;
    case 5: 
      paramj.w0(((Integer)paramObject).intValue());
      break;
    case 4: 
      paramj.R0(((Long)paramObject).longValue());
      break;
    case 3: 
      paramj.y0(((Long)paramObject).longValue());
      break;
    case 2: 
      paramj.q0(((Float)paramObject).floatValue());
      break;
    }
    paramj.i0(((Double)paramObject).doubleValue());
  }
  
  public s a()
  {
    s locals = r();
    Map.Entry localEntry;
    for (int i = 0; i < a.k(); i++)
    {
      localEntry = a.j(i);
      a.a(localEntry.getKey());
      locals.s(null, localEntry.getValue());
    }
    Iterator localIterator = a.m().iterator();
    while (localIterator.hasNext())
    {
      localEntry = (Map.Entry)localIterator.next();
      a.a(localEntry.getKey());
      locals.s(null, localEntry.getValue());
    }
    c = c;
    return locals;
  }
  
  public Iterator e()
  {
    if (c) {
      return new B(a.h().iterator());
    }
    return a.h().iterator();
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof s)) {
      return false;
    }
    paramObject = (s)paramObject;
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
    Map.Entry localEntry;
    while (i < a.k())
    {
      localEntry = a.j(i);
      a.a(localEntry.getKey());
      j += d(null, localEntry.getValue());
      i++;
    }
    Iterator localIterator = a.m().iterator();
    while (localIterator.hasNext())
    {
      localEntry = (Map.Entry)localIterator.next();
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
      return new B(a.entrySet().iterator());
    }
    return a.entrySet().iterator();
  }
  
  public void o()
  {
    if (b) {
      return;
    }
    a.p();
    b = true;
  }
  
  public void p(s params)
  {
    for (int i = 0; i < a.k(); i++) {
      q(a.j(i));
    }
    params = a.m().iterator();
    while (params.hasNext()) {
      q((Map.Entry)params.next());
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
        while (((Iterator)paramObject).hasNext())
        {
          Object localObject = ((Iterator)paramObject).next();
          t(paramb.k(), localObject);
        }
        paramObject = localArrayList;
      }
      else
      {
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      }
    }
    else {
      t(paramb.k(), paramObject);
    }
    a.r(paramb, paramObject);
  }
  
  public final void t(r0.b paramb, Object paramObject)
  {
    if (m(paramb, paramObject)) {
      return;
    }
    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
  }
  
  public static abstract interface b
    extends Comparable
  {
    public abstract int g();
    
    public abstract boolean i();
    
    public abstract r0.b k();
    
    public abstract boolean q();
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */