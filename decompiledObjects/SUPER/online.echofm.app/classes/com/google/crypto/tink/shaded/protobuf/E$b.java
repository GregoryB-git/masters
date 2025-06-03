package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class E$b
  extends E
{
  public static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();
  
  public E$b()
  {
    super(null);
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

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.E.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */