package d4;

import S3.h.b;
import V3.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class c
  implements n
{
  public static Comparator r = new a();
  public final S3.c o;
  public final n p;
  public String q = null;
  
  public c()
  {
    o = S3.c.a.c(r);
    p = r.a();
  }
  
  public c(S3.c paramc, n paramn)
  {
    if ((paramc.isEmpty()) && (!paramn.isEmpty())) {
      throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
    }
    p = paramn;
    o = paramc;
  }
  
  public static void s(StringBuilder paramStringBuilder, int paramInt)
  {
    for (int i = 0; i < paramInt; i++) {
      paramStringBuilder.append(" ");
    }
  }
  
  public n A(k paramk)
  {
    b localb = paramk.Z();
    if (localb == null) {
      return this;
    }
    return v(localb).A(paramk.c0());
  }
  
  public boolean B()
  {
    return false;
  }
  
  public int D(n paramn)
  {
    if (isEmpty())
    {
      if (paramn.isEmpty()) {
        return 0;
      }
      return -1;
    }
    if (paramn.B()) {
      return 1;
    }
    if (paramn.isEmpty()) {
      return 1;
    }
    if (paramn == n.l) {
      return -1;
    }
    return 0;
  }
  
  public int E()
  {
    return o.size();
  }
  
  public b I(b paramb)
  {
    return (b)o.k(paramb);
  }
  
  public n J(n paramn)
  {
    if (o.isEmpty()) {
      return g.W();
    }
    return new c(o, paramn);
  }
  
  public Object L(boolean paramBoolean)
  {
    if (isEmpty()) {
      return null;
    }
    HashMap localHashMap = new HashMap();
    Object localObject1 = o.iterator();
    int i = 0;
    int j = 1;
    int k = 0;
    int m = k;
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Map.Entry)((Iterator)localObject1).next();
      String str = ((b)((Map.Entry)localObject2).getKey()).e();
      localHashMap.put(str, ((n)((Map.Entry)localObject2).getValue()).L(paramBoolean));
      int n = k + 1;
      k = n;
      if (j != 0)
      {
        if ((str.length() > 1) && (str.charAt(0) == '0')) {}
        do
        {
          j = 0;
          k = n;
          break;
          localObject2 = Y3.m.k(str);
        } while ((localObject2 == null) || (((Integer)localObject2).intValue() < 0));
        k = n;
        if (((Integer)localObject2).intValue() > m)
        {
          m = ((Integer)localObject2).intValue();
          k = n;
        }
      }
    }
    if ((!paramBoolean) && (j != 0) && (m < k * 2))
    {
      localObject1 = new ArrayList(m + 1);
      for (k = i; k <= m; k++)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("");
        ((StringBuilder)localObject2).append(k);
        ((List)localObject1).add(localHashMap.get(((StringBuilder)localObject2).toString()));
      }
      return localObject1;
    }
    if ((paramBoolean) && (!p.isEmpty())) {
      localHashMap.put(".priority", p.getValue());
    }
    return localHashMap;
  }
  
  public void M(c paramc)
  {
    S(paramc, false);
  }
  
  public n N(b paramb, n paramn)
  {
    if (paramb.s()) {
      return J(paramn);
    }
    Object localObject1 = o;
    Object localObject2 = localObject1;
    if (((S3.c)localObject1).a(paramb)) {
      localObject2 = ((S3.c)localObject1).D(paramb);
    }
    localObject1 = localObject2;
    if (!paramn.isEmpty()) {
      localObject1 = ((S3.c)localObject2).s(paramb, paramn);
    }
    if (((S3.c)localObject1).isEmpty()) {
      return g.W();
    }
    return new c((S3.c)localObject1, p);
  }
  
  public String O(n.b paramb)
  {
    Object localObject1 = n.b.o;
    if (paramb == localObject1)
    {
      paramb = new StringBuilder();
      if (!p.isEmpty())
      {
        paramb.append("priority:");
        paramb.append(p.O((n.b)localObject1));
        paramb.append(":");
      }
      localObject1 = new ArrayList();
      Object localObject2 = iterator();
      Object localObject3;
      for (int i = 0;; i = 1)
      {
        if (!((Iterator)localObject2).hasNext()) {
          break label132;
        }
        localObject3 = (m)((Iterator)localObject2).next();
        ((List)localObject1).add(localObject3);
        if ((i == 0) && (((m)localObject3).d().t().isEmpty())) {
          break;
        }
      }
      label132:
      if (i != 0) {
        Collections.sort((List)localObject1, q.j());
      }
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (m)((Iterator)localObject1).next();
        localObject3 = ((m)localObject2).d().R();
        if (!((String)localObject3).equals(""))
        {
          paramb.append(":");
          paramb.append(((m)localObject2).c().e());
          paramb.append(":");
          paramb.append((String)localObject3);
        }
      }
      return paramb.toString();
    }
    throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
  }
  
  public Iterator P()
  {
    return new d(o.P());
  }
  
  public boolean Q(b paramb)
  {
    return v(paramb).isEmpty() ^ true;
  }
  
  public String R()
  {
    if (q == null)
    {
      String str = O(n.b.o);
      if (str.isEmpty()) {
        str = "";
      } else {
        str = Y3.m.i(str);
      }
      q = str;
    }
    return q;
  }
  
  public void S(final c paramc, boolean paramBoolean)
  {
    if ((paramBoolean) && (!t().isEmpty())) {
      o.q(new b(paramc));
    } else {
      o.q(paramc);
    }
  }
  
  public b T()
  {
    return (b)o.i();
  }
  
  public b U()
  {
    return (b)o.g();
  }
  
  public final void V(StringBuilder paramStringBuilder, int paramInt)
  {
    if ((o.isEmpty()) && (p.isEmpty())) {}
    for (Object localObject1 = "{ }";; localObject1 = "}")
    {
      paramStringBuilder.append((String)localObject1);
      break;
      paramStringBuilder.append("{\n");
      localObject1 = o.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
        int i = paramInt + 2;
        s(paramStringBuilder, i);
        paramStringBuilder.append(((b)((Map.Entry)localObject2).getKey()).e());
        paramStringBuilder.append("=");
        boolean bool = ((Map.Entry)localObject2).getValue() instanceof c;
        localObject2 = ((Map.Entry)localObject2).getValue();
        if (bool) {
          ((c)localObject2).V(paramStringBuilder, i);
        } else {
          paramStringBuilder.append(((n)localObject2).toString());
        }
        paramStringBuilder.append("\n");
      }
      if (!p.isEmpty())
      {
        s(paramStringBuilder, paramInt + 2);
        paramStringBuilder.append(".priority=");
        paramStringBuilder.append(p.toString());
        paramStringBuilder.append("\n");
      }
      s(paramStringBuilder, paramInt);
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof c)) {
      return false;
    }
    Object localObject = (c)paramObject;
    if (!t().equals(((c)localObject).t())) {
      return false;
    }
    if (o.size() != o.size()) {
      return false;
    }
    paramObject = o.iterator();
    localObject = o.iterator();
    while ((((Iterator)paramObject).hasNext()) && (((Iterator)localObject).hasNext()))
    {
      Map.Entry localEntry1 = (Map.Entry)((Iterator)paramObject).next();
      Map.Entry localEntry2 = (Map.Entry)((Iterator)localObject).next();
      if ((!((b)localEntry1.getKey()).equals(localEntry2.getKey())) || (!((n)localEntry1.getValue()).equals(localEntry2.getValue()))) {
        return false;
      }
    }
    if ((!((Iterator)paramObject).hasNext()) && (!((Iterator)localObject).hasNext())) {
      return true;
    }
    throw new IllegalStateException("Something went wrong internally.");
  }
  
  public Object getValue()
  {
    return L(false);
  }
  
  public int hashCode()
  {
    Iterator localIterator = iterator();
    m localm;
    for (int i = 0; localIterator.hasNext(); i = (i * 31 + localm.c().hashCode()) * 17 + localm.d().hashCode()) {
      localm = (m)localIterator.next();
    }
    return i;
  }
  
  public boolean isEmpty()
  {
    return o.isEmpty();
  }
  
  public Iterator iterator()
  {
    return new d(o.iterator());
  }
  
  public n t()
  {
    return p;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    V(localStringBuilder, 0);
    return localStringBuilder.toString();
  }
  
  public n v(b paramb)
  {
    if ((paramb.s()) && (!p.isEmpty())) {
      return p;
    }
    if (o.a(paramb)) {
      return (n)o.d(paramb);
    }
    return g.W();
  }
  
  public n y(k paramk, n paramn)
  {
    b localb = paramk.Z();
    if (localb == null) {
      return paramn;
    }
    if (localb.s())
    {
      Y3.m.f(r.b(paramn));
      return J(paramn);
    }
    return N(localb, v(localb).y(paramk.c0(), paramn));
  }
  
  public class a
    implements Comparator
  {
    public int a(b paramb1, b paramb2)
    {
      return paramb1.h(paramb2);
    }
  }
  
  public class b
    extends h.b
  {
    public boolean a = false;
    
    public b(c.c paramc) {}
    
    public void b(b paramb, n paramn)
    {
      if ((!a) && (paramb.h(b.o()) > 0))
      {
        a = true;
        paramc.b(b.o(), t());
      }
      paramc.b(paramb, paramn);
    }
  }
  
  public static abstract class c
    extends h.b
  {
    public abstract void b(b paramb, n paramn);
    
    public void c(b paramb, n paramn)
    {
      b(paramb, paramn);
    }
  }
  
  public static class d
    implements Iterator
  {
    public final Iterator o;
    
    public d(Iterator paramIterator)
    {
      o = paramIterator;
    }
    
    public m b()
    {
      Map.Entry localEntry = (Map.Entry)o.next();
      return new m((b)localEntry.getKey(), (n)localEntry.getValue());
    }
    
    public boolean hasNext()
    {
      return o.hasNext();
    }
    
    public void remove()
    {
      o.remove();
    }
  }
}

/* Location:
 * Qualified Name:     d4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */