package com.google.firebase.firestore;

import f;
import g;
import java.util.Map;
import java.util.Objects;
import ka.d0;

public final class b
{
  public final d9.a a;
  public final Map<String, d0> b;
  
  public b(d9.a parama, Map<String, d0> paramMap)
  {
    a = parama;
    b = paramMap;
  }
  
  public final long a()
  {
    a.b localb = new a.b();
    Object localObject = (Number)c(localb, Number.class);
    if (localObject != null) {
      localObject = Long.valueOf(((Number)localObject).longValue());
    } else {
      localObject = null;
    }
    if (localObject != null) {
      return ((Long)localObject).longValue();
    }
    throw new IllegalArgumentException(g.f(f.l("RunAggregationQueryResponse alias "), c, " is null"));
  }
  
  public final Object b(a parama)
  {
    if (b.containsKey(c))
    {
      parama = (d0)b.get(c);
      return new m(a.a.b, d.a.a).b(parama);
    }
    StringBuilder localStringBuilder = f.l("'");
    localStringBuilder.append(b);
    localStringBuilder.append("(");
    localStringBuilder.append(parama.a());
    localStringBuilder.append(")' was not requested in the aggregation query.");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public final <T> T c(a parama, Class<T> paramClass)
  {
    Object localObject = b(parama);
    if (localObject == null)
    {
      parama = null;
    }
    else
    {
      if (!paramClass.isInstance(localObject)) {
        break label31;
      }
      parama = paramClass.cast(localObject);
    }
    return parama;
    label31:
    localObject = f.l("AggregateField '");
    ((StringBuilder)localObject).append(c);
    ((StringBuilder)localObject).append("' is not a ");
    ((StringBuilder)localObject).append(paramClass.getName());
    throw new RuntimeException(((StringBuilder)localObject).toString());
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    if ((!a.equals(a)) || (!b.equals(b))) {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { a, b });
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.firestore.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */