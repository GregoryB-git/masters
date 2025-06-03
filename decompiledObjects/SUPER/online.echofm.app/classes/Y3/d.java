package Y3;

import S3.c;
import S3.c.a;
import S3.l;
import V3.k;
import d4.b;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public final class d
  implements Iterable
{
  public static final c q;
  public static final d r;
  public final Object o;
  public final c p;
  
  static
  {
    c localc = c.a.c(l.b(b.class));
    q = localc;
    r = new d(null, localc);
  }
  
  public d(Object paramObject)
  {
    this(paramObject, q);
  }
  
  public d(Object paramObject, c paramc)
  {
    o = paramObject;
    p = paramc;
  }
  
  public static d d()
  {
    return r;
  }
  
  public d D(b paramb)
  {
    paramb = (d)p.d(paramb);
    if (paramb != null) {
      return paramb;
    }
    return d();
  }
  
  public c M()
  {
    return p;
  }
  
  public Object S(k paramk)
  {
    return T(paramk, i.a);
  }
  
  public Object T(k paramk, i parami)
  {
    Object localObject1 = o;
    if ((localObject1 != null) && (parami.a(localObject1))) {
      localObject1 = o;
    } else {
      localObject1 = null;
    }
    Iterator localIterator = paramk.iterator();
    paramk = this;
    while (localIterator.hasNext())
    {
      Object localObject2 = (b)localIterator.next();
      localObject2 = (d)p.d(localObject2);
      if (localObject2 == null) {
        return localObject1;
      }
      Object localObject3 = o;
      paramk = (k)localObject2;
      if (localObject3 != null)
      {
        paramk = (k)localObject2;
        if (parami.a(localObject3))
        {
          localObject1 = o;
          paramk = (k)localObject2;
        }
      }
    }
    return localObject1;
  }
  
  public d U(k paramk)
  {
    if (paramk.isEmpty())
    {
      if (p.isEmpty()) {
        return d();
      }
      return new d(null, p);
    }
    b localb = paramk.Z();
    d locald = (d)p.d(localb);
    if (locald != null)
    {
      paramk = locald.U(paramk.c0());
      if (paramk.isEmpty()) {
        paramk = p.D(localb);
      } else {
        paramk = p.s(localb, paramk);
      }
      if ((o == null) && (paramk.isEmpty())) {
        return d();
      }
      return new d(o, paramk);
    }
    return this;
  }
  
  public Object V(k paramk, i parami)
  {
    Object localObject1 = o;
    if ((localObject1 != null) && (parami.a(localObject1))) {
      return o;
    }
    Iterator localIterator = paramk.iterator();
    paramk = this;
    while (localIterator.hasNext())
    {
      localObject1 = (b)localIterator.next();
      localObject1 = (d)p.d(localObject1);
      if (localObject1 == null) {
        return null;
      }
      Object localObject2 = o;
      paramk = (k)localObject1;
      if (localObject2 != null)
      {
        paramk = (k)localObject1;
        if (parami.a(localObject2)) {
          return o;
        }
      }
    }
    return null;
  }
  
  public d W(k paramk, Object paramObject)
  {
    if (paramk.isEmpty()) {
      return new d(paramObject, p);
    }
    b localb = paramk.Z();
    d locald1 = (d)p.d(localb);
    d locald2 = locald1;
    if (locald1 == null) {
      locald2 = d();
    }
    paramk = locald2.W(paramk.c0(), paramObject);
    paramk = p.s(localb, paramk);
    return new d(o, paramk);
  }
  
  public d X(k paramk, d paramd)
  {
    if (paramk.isEmpty()) {
      return paramd;
    }
    b localb = paramk.Z();
    d locald1 = (d)p.d(localb);
    d locald2 = locald1;
    if (locald1 == null) {
      locald2 = d();
    }
    paramk = locald2.X(paramk.c0(), paramd);
    if (paramk.isEmpty()) {
      paramk = p.D(localb);
    } else {
      paramk = p.s(localb, paramk);
    }
    return new d(o, paramk);
  }
  
  public d Y(k paramk)
  {
    if (paramk.isEmpty()) {
      return this;
    }
    Object localObject = paramk.Z();
    localObject = (d)p.d(localObject);
    if (localObject != null) {
      return ((d)localObject).Y(paramk.c0());
    }
    return d();
  }
  
  public Collection Z()
  {
    final ArrayList localArrayList = new ArrayList();
    q(new a(localArrayList));
    return localArrayList;
  }
  
  public boolean a(i parami)
  {
    Object localObject = o;
    if ((localObject != null) && (parami.a(localObject))) {
      return true;
    }
    localObject = p.iterator();
    while (((Iterator)localObject).hasNext()) {
      if (((d)((Map.Entry)((Iterator)localObject).next()).getValue()).a(parami)) {
        return true;
      }
    }
    return false;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (d.class == paramObject.getClass()))
    {
      paramObject = (d)paramObject;
      Object localObject = p;
      if (localObject != null ? !((c)localObject).equals(p) : p != null) {
        return false;
      }
      localObject = o;
      paramObject = o;
      return localObject != null ? localObject.equals(paramObject) : paramObject == null;
    }
    return false;
  }
  
  public k f(k paramk, i parami)
  {
    Object localObject = o;
    if ((localObject != null) && (parami.a(localObject))) {
      return k.Y();
    }
    if (paramk.isEmpty()) {
      return null;
    }
    localObject = paramk.Z();
    d locald = (d)p.d(localObject);
    if (locald != null)
    {
      paramk = locald.f(paramk.c0(), parami);
      if (paramk != null) {
        return new k(new b[] { localObject }).T(paramk);
      }
    }
    return null;
  }
  
  public k g(k paramk)
  {
    return f(paramk, i.a);
  }
  
  public Object getValue()
  {
    return o;
  }
  
  public int hashCode()
  {
    Object localObject = o;
    int i = 0;
    int j;
    if (localObject != null) {
      j = localObject.hashCode();
    } else {
      j = 0;
    }
    localObject = p;
    if (localObject != null) {
      i = ((c)localObject).hashCode();
    }
    return j * 31 + i;
  }
  
  public final Object i(k paramk, c paramc, Object paramObject)
  {
    Object localObject1 = p.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Map.Entry)((Iterator)localObject1).next();
      paramObject = ((d)((Map.Entry)localObject2).getValue()).i(paramk.U((b)((Map.Entry)localObject2).getKey()), paramc, paramObject);
    }
    Object localObject2 = o;
    localObject1 = paramObject;
    if (localObject2 != null) {
      localObject1 = paramc.a(paramk, localObject2, paramObject);
    }
    return localObject1;
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if ((o == null) && (p.isEmpty())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Iterator iterator()
  {
    final ArrayList localArrayList = new ArrayList();
    q(new b(localArrayList));
    return localArrayList.iterator();
  }
  
  public Object k(Object paramObject, c paramc)
  {
    return i(k.Y(), paramc, paramObject);
  }
  
  public void q(c paramc)
  {
    i(k.Y(), paramc, null);
  }
  
  public Object s(k paramk)
  {
    if (paramk.isEmpty()) {
      return o;
    }
    Object localObject = paramk.Z();
    localObject = (d)p.d(localObject);
    if (localObject != null) {
      return ((d)localObject).s(paramk.c0());
    }
    return null;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ImmutableTree { value=");
    localStringBuilder.append(getValue());
    localStringBuilder.append(", children={");
    Iterator localIterator = p.iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localStringBuilder.append(((b)localEntry.getKey()).e());
      localStringBuilder.append("=");
      localStringBuilder.append(localEntry.getValue());
    }
    localStringBuilder.append("} }");
    return localStringBuilder.toString();
  }
  
  public class a
    implements d.c
  {
    public a(ArrayList paramArrayList) {}
    
    public Void b(k paramk, Object paramObject, Void paramVoid)
    {
      localArrayList.add(paramObject);
      return null;
    }
  }
  
  public class b
    implements d.c
  {
    public b(List paramList) {}
    
    public Void b(k paramk, Object paramObject, Void paramVoid)
    {
      localArrayList.add(new AbstractMap.SimpleImmutableEntry(paramk, paramObject));
      return null;
    }
  }
  
  public static abstract interface c
  {
    public abstract Object a(k paramk, Object paramObject1, Object paramObject2);
  }
}

/* Location:
 * Qualified Name:     Y3.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */