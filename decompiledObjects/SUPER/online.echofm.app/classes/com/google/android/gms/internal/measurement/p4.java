package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class p4
  extends q4
{
  public static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();
  
  public p4()
  {
    super(null);
  }
  
  public static List e(Object paramObject, long paramLong, int paramInt)
  {
    List localList = f(paramObject, paramLong);
    if (localList.isEmpty()) {
      if ((localList instanceof n4)) {
        localObject = new o4(paramInt);
      } else if (((localList instanceof S4)) && ((localList instanceof h4))) {
        localObject = ((h4)localList).e(paramInt);
      }
    }
    h4 localh4;
    for (Object localObject = new ArrayList(paramInt);; localObject = localh4.e(localList.size() + paramInt))
    {
      D5.j(paramObject, paramLong, localObject);
      break;
      if (c.isAssignableFrom(localList.getClass()))
      {
        localObject = new ArrayList(localList.size() + paramInt);
        ((ArrayList)localObject).addAll(localList);
      }
      for (;;)
      {
        D5.j(paramObject, paramLong, localObject);
        break label246;
        if (!(localList instanceof y5)) {
          break;
        }
        localObject = new o4(localList.size() + paramInt);
        ((l3)localObject).addAll((y5)localList);
      }
      localObject = localList;
      if (!(localList instanceof S4)) {
        break;
      }
      localObject = localList;
      if (!(localList instanceof h4)) {
        break;
      }
      localh4 = (h4)localList;
      localObject = localList;
      if (localh4.c()) {
        break;
      }
    }
    label246:
    return (List)localObject;
  }
  
  public static List f(Object paramObject, long paramLong)
  {
    return (List)D5.B(paramObject, paramLong);
  }
  
  public final void b(Object paramObject1, Object paramObject2, long paramLong)
  {
    paramObject2 = f(paramObject2, paramLong);
    List localList = e(paramObject1, paramLong, ((List)paramObject2).size());
    int i = localList.size();
    int j = ((List)paramObject2).size();
    if ((i > 0) && (j > 0)) {
      localList.addAll((Collection)paramObject2);
    }
    if (i > 0) {
      paramObject2 = localList;
    }
    D5.j(paramObject1, paramLong, paramObject2);
  }
  
  public final void d(Object paramObject, long paramLong)
  {
    Object localObject = (List)D5.B(paramObject, paramLong);
    if ((localObject instanceof n4))
    {
      localObject = ((n4)localObject).w();
    }
    else
    {
      if (c.isAssignableFrom(localObject.getClass())) {
        return;
      }
      if (((localObject instanceof S4)) && ((localObject instanceof h4)))
      {
        paramObject = (h4)localObject;
        if (((h4)paramObject).c()) {
          ((h4)paramObject).G();
        }
        return;
      }
      localObject = Collections.unmodifiableList((List)localObject);
    }
    D5.j(paramObject, paramLong, localObject);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.p4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */