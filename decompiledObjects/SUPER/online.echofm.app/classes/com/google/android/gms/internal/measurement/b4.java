package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class b4
{
  public static s a(r2 paramr2)
  {
    if (paramr2 == null) {
      return s.d;
    }
    int i = E3.a[paramr2.H().ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4)
          {
            if (i != 5)
            {
              paramr2 = String.valueOf(paramr2);
              localObject1 = new StringBuilder("Invalid entity: ");
              ((StringBuilder)localObject1).append(paramr2);
              throw new IllegalStateException(((StringBuilder)localObject1).toString());
            }
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
          }
          Object localObject2 = paramr2.L();
          Object localObject1 = new ArrayList();
          localObject2 = ((List)localObject2).iterator();
          while (((Iterator)localObject2).hasNext()) {
            ((List)localObject1).add(a((r2)((Iterator)localObject2).next()));
          }
          return new v(paramr2.J(), (List)localObject1);
        }
        if (paramr2.N()) {
          return new h(Boolean.valueOf(paramr2.M()));
        }
        return new h(null);
      }
      if (paramr2.O()) {
        return new k(Double.valueOf(paramr2.G()));
      }
      return new k(null);
    }
    if (paramr2.P()) {
      return new u(paramr2.K());
    }
    return s.k;
  }
  
  public static s b(Object paramObject)
  {
    if (paramObject == null) {
      return s.e;
    }
    if ((paramObject instanceof String)) {
      return new u((String)paramObject);
    }
    if ((paramObject instanceof Double)) {
      return new k((Double)paramObject);
    }
    if ((paramObject instanceof Long)) {
      return new k(Double.valueOf(((Long)paramObject).doubleValue()));
    }
    if ((paramObject instanceof Integer)) {
      return new k(Double.valueOf(((Integer)paramObject).doubleValue()));
    }
    if ((paramObject instanceof Boolean)) {
      return new h((Boolean)paramObject);
    }
    Object localObject;
    if ((paramObject instanceof Map))
    {
      r localr = new r();
      Map localMap = (Map)paramObject;
      Iterator localIterator = localMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        localObject = localIterator.next();
        s locals = b(localMap.get(localObject));
        if (localObject != null)
        {
          paramObject = localObject;
          if (!(localObject instanceof String)) {
            paramObject = localObject.toString();
          }
          localr.a((String)paramObject, locals);
        }
      }
      return localr;
    }
    if ((paramObject instanceof List))
    {
      localObject = new g();
      paramObject = ((List)paramObject).iterator();
      while (((Iterator)paramObject).hasNext()) {
        ((g)localObject).T(b(((Iterator)paramObject).next()));
      }
      return (s)localObject;
    }
    throw new IllegalArgumentException("Invalid value type");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.b4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */