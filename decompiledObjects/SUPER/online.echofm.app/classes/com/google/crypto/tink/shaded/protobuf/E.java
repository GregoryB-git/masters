package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class E
{
  public static final E a = new b(null);
  public static final E b = new c(null);
  
  public static E a()
  {
    return a;
  }
  
  public static E b()
  {
    return b;
  }
  
  public abstract void c(Object paramObject, long paramLong);
  
  public abstract void d(Object paramObject1, Object paramObject2, long paramLong);
  
  public abstract List e(Object paramObject, long paramLong);
  
  public static final class b
    extends E
  {
    public static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();
    
    public b()
    {
      super();
    }
    
    public static List f(Object paramObject, long paramLong)
    {
      return (List)o0.C(paramObject, paramLong);
    }
    
    public static List g(Object paramObject, long paramLong, int paramInt)
    {
      List localList = f(paramObject, paramLong);
      if (localList.isEmpty()) {
        if ((localList instanceof D)) {
          localObject = new C(paramInt);
        } else if (((localList instanceof Y)) && ((localList instanceof z.d))) {
          localObject = ((z.d)localList).h(paramInt);
        }
      }
      z.d locald;
      for (Object localObject = new ArrayList(paramInt);; localObject = locald.h(localList.size() + paramInt))
      {
        o0.R(paramObject, paramLong, localObject);
        break;
        if (c.isAssignableFrom(localList.getClass()))
        {
          localObject = new ArrayList(localList.size() + paramInt);
          ((ArrayList)localObject).addAll(localList);
        }
        for (;;)
        {
          o0.R(paramObject, paramLong, localObject);
          break label246;
          if (!(localList instanceof n0)) {
            break;
          }
          localObject = new C(localList.size() + paramInt);
          ((C)localObject).addAll((n0)localList);
        }
        localObject = localList;
        if (!(localList instanceof Y)) {
          break;
        }
        localObject = localList;
        if (!(localList instanceof z.d)) {
          break;
        }
        locald = (z.d)localList;
        localObject = localList;
        if (locald.p()) {
          break;
        }
      }
      label246:
      return (List)localObject;
    }
    
    public void c(Object paramObject, long paramLong)
    {
      Object localObject = (List)o0.C(paramObject, paramLong);
      if ((localObject instanceof D))
      {
        localObject = ((D)localObject).m();
      }
      else
      {
        if (c.isAssignableFrom(localObject.getClass())) {
          return;
        }
        if (((localObject instanceof Y)) && ((localObject instanceof z.d)))
        {
          paramObject = (z.d)localObject;
          if (((z.d)paramObject).p()) {
            ((z.d)paramObject).j();
          }
          return;
        }
        localObject = Collections.unmodifiableList((List)localObject);
      }
      o0.R(paramObject, paramLong, localObject);
    }
    
    public void d(Object paramObject1, Object paramObject2, long paramLong)
    {
      paramObject2 = f(paramObject2, paramLong);
      List localList = g(paramObject1, paramLong, ((List)paramObject2).size());
      int i = localList.size();
      int j = ((List)paramObject2).size();
      if ((i > 0) && (j > 0)) {
        localList.addAll((Collection)paramObject2);
      }
      if (i > 0) {
        paramObject2 = localList;
      }
      o0.R(paramObject1, paramLong, paramObject2);
    }
    
    public List e(Object paramObject, long paramLong)
    {
      return g(paramObject, paramLong, 10);
    }
  }
  
  public static final class c
    extends E
  {
    public c()
    {
      super();
    }
    
    public static z.d f(Object paramObject, long paramLong)
    {
      return (z.d)o0.C(paramObject, paramLong);
    }
    
    public void c(Object paramObject, long paramLong)
    {
      f(paramObject, paramLong).j();
    }
    
    public void d(Object paramObject1, Object paramObject2, long paramLong)
    {
      Object localObject = f(paramObject1, paramLong);
      z.d locald = f(paramObject2, paramLong);
      int i = ((List)localObject).size();
      int j = locald.size();
      paramObject2 = localObject;
      if (i > 0)
      {
        paramObject2 = localObject;
        if (j > 0)
        {
          paramObject2 = localObject;
          if (!((z.d)localObject).p()) {
            paramObject2 = ((z.d)localObject).h(j + i);
          }
          ((List)paramObject2).addAll(locald);
        }
      }
      localObject = locald;
      if (i > 0) {
        localObject = paramObject2;
      }
      o0.R(paramObject1, paramLong, localObject);
    }
    
    public List e(Object paramObject, long paramLong)
    {
      z.d locald1 = f(paramObject, paramLong);
      z.d locald2 = locald1;
      if (!locald1.p())
      {
        int i = locald1.size();
        if (i == 0) {
          i = 10;
        } else {
          i *= 2;
        }
        locald2 = locald1.h(i);
        o0.R(paramObject, paramLong, locald2);
      }
      return locald2;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */