package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class A$b
  extends A
{
  public static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();
  
  public A$b()
  {
    super(null);
  }
  
  public static List e(Object paramObject, long paramLong)
  {
    return (List)k0.C(paramObject, paramLong);
  }
  
  public static List f(Object paramObject, long paramLong, int paramInt)
  {
    List localList = e(paramObject, paramLong);
    if (localList.isEmpty()) {
      if ((localList instanceof z)) {
        localObject = new y(paramInt);
      } else if (((localList instanceof U)) && ((localList instanceof t.e))) {
        localObject = ((t.e)localList).h(paramInt);
      }
    }
    t.e locale;
    for (Object localObject = new ArrayList(paramInt);; localObject = locale.h(localList.size() + paramInt))
    {
      k0.R(paramObject, paramLong, localObject);
      break;
      if (c.isAssignableFrom(localList.getClass()))
      {
        localObject = new ArrayList(localList.size() + paramInt);
        ((ArrayList)localObject).addAll(localList);
      }
      for (;;)
      {
        k0.R(paramObject, paramLong, localObject);
        break label246;
        if (!(localList instanceof j0)) {
          break;
        }
        localObject = new y(localList.size() + paramInt);
        ((y)localObject).addAll((j0)localList);
      }
      localObject = localList;
      if (!(localList instanceof U)) {
        break;
      }
      localObject = localList;
      if (!(localList instanceof t.e)) {
        break;
      }
      locale = (t.e)localList;
      localObject = localList;
      if (locale.p()) {
        break;
      }
    }
    label246:
    return (List)localObject;
  }
  
  public void c(Object paramObject, long paramLong)
  {
    Object localObject = (List)k0.C(paramObject, paramLong);
    if ((localObject instanceof z))
    {
      localObject = ((z)localObject).m();
    }
    else
    {
      if (c.isAssignableFrom(localObject.getClass())) {
        return;
      }
      if (((localObject instanceof U)) && ((localObject instanceof t.e)))
      {
        paramObject = (t.e)localObject;
        if (((t.e)paramObject).p()) {
          ((t.e)paramObject).j();
        }
        return;
      }
      localObject = Collections.unmodifiableList((List)localObject);
    }
    k0.R(paramObject, paramLong, localObject);
  }
  
  public void d(Object paramObject1, Object paramObject2, long paramLong)
  {
    paramObject2 = e(paramObject2, paramLong);
    List localList = f(paramObject1, paramLong, ((List)paramObject2).size());
    int i = localList.size();
    int j = ((List)paramObject2).size();
    if ((i > 0) && (j > 0)) {
      localList.addAll((Collection)paramObject2);
    }
    if (i > 0) {
      paramObject2 = localList;
    }
    k0.R(paramObject1, paramLong, paramObject2);
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.A.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */