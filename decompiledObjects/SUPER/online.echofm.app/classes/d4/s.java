package d4;

import V3.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class s
{
  public final k a;
  public final k b;
  public final n c;
  
  public s(T3.o paramo)
  {
    Object localObject1 = paramo.a();
    Object localObject2 = null;
    if (localObject1 != null) {
      localObject1 = new k((List)localObject1);
    } else {
      localObject1 = null;
    }
    a = ((k)localObject1);
    List localList = paramo.b();
    localObject1 = localObject2;
    if (localList != null) {
      localObject1 = new k(localList);
    }
    b = ((k)localObject1);
    c = o.a(paramo.c());
  }
  
  public n a(n paramn)
  {
    return b(k.Y(), paramn, c);
  }
  
  public final n b(k paramk, n paramn1, n paramn2)
  {
    Object localObject1 = a;
    boolean bool1 = true;
    int i;
    if (localObject1 == null) {
      i = 1;
    } else {
      i = paramk.V((k)localObject1);
    }
    localObject1 = b;
    int j;
    if (localObject1 == null) {
      j = -1;
    } else {
      j = paramk.V((k)localObject1);
    }
    localObject1 = a;
    int k;
    if ((localObject1 != null) && (paramk.W((k)localObject1))) {
      k = 1;
    } else {
      k = 0;
    }
    localObject1 = b;
    boolean bool2;
    if ((localObject1 != null) && (paramk.W((k)localObject1))) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    if ((i > 0) && (j < 0) && (!bool2)) {
      return paramn2;
    }
    if ((i > 0) && (bool2) && (paramn2.B())) {
      return paramn2;
    }
    if ((i > 0) && (j == 0))
    {
      Y3.m.f(bool2);
      Y3.m.f(paramn2.B() ^ true);
      if (paramn1.B()) {
        return g.W();
      }
      return paramn1;
    }
    if ((k == 0) && (!bool2))
    {
      bool2 = bool1;
      if (j <= 0) {
        if (i <= 0) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
      Y3.m.f(bool2);
      return paramn1;
    }
    localObject1 = new HashSet();
    Object localObject2 = paramn1.iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((Set)localObject1).add(((m)((Iterator)localObject2).next()).c());
    }
    localObject2 = paramn2.iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((Set)localObject1).add(((m)((Iterator)localObject2).next()).c());
    }
    localObject2 = new ArrayList(((Set)localObject1).size() + 1);
    ((List)localObject2).addAll((Collection)localObject1);
    if ((!paramn2.t().isEmpty()) || (!paramn1.t().isEmpty())) {
      ((List)localObject2).add(b.o());
    }
    localObject2 = ((List)localObject2).iterator();
    localObject1 = paramn1;
    while (((Iterator)localObject2).hasNext())
    {
      b localb = (b)((Iterator)localObject2).next();
      n localn1 = paramn1.v(localb);
      n localn2 = b(paramk.U(localb), paramn1.v(localb), paramn2.v(localb));
      if (localn2 != localn1) {
        localObject1 = ((n)localObject1).N(localb, localn2);
      }
    }
    return (n)localObject1;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("RangeMerge{optExclusiveStart=");
    localStringBuilder.append(a);
    localStringBuilder.append(", optInclusiveEnd=");
    localStringBuilder.append(b);
    localStringBuilder.append(", snap=");
    localStringBuilder.append(c);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     d4.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */