package androidx.datastore.preferences.protobuf;

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
      return (List)p0.A(paramObject, paramLong);
    }
    
    public static List g(Object paramObject, long paramLong, int paramInt)
    {
      List localList = f(paramObject, paramLong);
      if (localList.isEmpty()) {
        if ((localList instanceof D)) {
          localObject = new C(paramInt);
        } else if (((localList instanceof Y)) && ((localList instanceof y.b))) {
          localObject = ((y.b)localList).h(paramInt);
        }
      }
      y.b localb;
      for (Object localObject = new ArrayList(paramInt);; localObject = localb.h(localList.size() + paramInt))
      {
        p0.O(paramObject, paramLong, localObject);
        break;
        if (c.isAssignableFrom(localList.getClass()))
        {
          localObject = new ArrayList(localList.size() + paramInt);
          ((ArrayList)localObject).addAll(localList);
        }
        for (;;)
        {
          p0.O(paramObject, paramLong, localObject);
          break label246;
          if (!(localList instanceof o0)) {
            break;
          }
          localObject = new C(localList.size() + paramInt);
          ((C)localObject).addAll((o0)localList);
        }
        localObject = localList;
        if (!(localList instanceof Y)) {
          break;
        }
        localObject = localList;
        if (!(localList instanceof y.b)) {
          break;
        }
        localb = (y.b)localList;
        localObject = localList;
        if (localb.p()) {
          break;
        }
      }
      label246:
      return (List)localObject;
    }
    
    public void c(Object paramObject, long paramLong)
    {
      Object localObject = (List)p0.A(paramObject, paramLong);
      if ((localObject instanceof D))
      {
        localObject = ((D)localObject).m();
      }
      else
      {
        if (c.isAssignableFrom(localObject.getClass())) {
          return;
        }
        if (((localObject instanceof Y)) && ((localObject instanceof y.b)))
        {
          paramObject = (y.b)localObject;
          if (((y.b)paramObject).p()) {
            ((y.b)paramObject).j();
          }
          return;
        }
        localObject = Collections.unmodifiableList((List)localObject);
      }
      p0.O(paramObject, paramLong, localObject);
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
      p0.O(paramObject1, paramLong, paramObject2);
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
    
    public static y.b f(Object paramObject, long paramLong)
    {
      return (y.b)p0.A(paramObject, paramLong);
    }
    
    public void c(Object paramObject, long paramLong)
    {
      f(paramObject, paramLong).j();
    }
    
    public void d(Object paramObject1, Object paramObject2, long paramLong)
    {
      Object localObject = f(paramObject1, paramLong);
      y.b localb = f(paramObject2, paramLong);
      int i = ((List)localObject).size();
      int j = localb.size();
      paramObject2 = localObject;
      if (i > 0)
      {
        paramObject2 = localObject;
        if (j > 0)
        {
          paramObject2 = localObject;
          if (!((y.b)localObject).p()) {
            paramObject2 = ((y.b)localObject).h(j + i);
          }
          ((List)paramObject2).addAll(localb);
        }
      }
      localObject = localb;
      if (i > 0) {
        localObject = paramObject2;
      }
      p0.O(paramObject1, paramLong, localObject);
    }
    
    public List e(Object paramObject, long paramLong)
    {
      y.b localb1 = f(paramObject, paramLong);
      y.b localb2 = localb1;
      if (!localb1.p())
      {
        int i = localb1.size();
        if (i == 0) {
          i = 10;
        } else {
          i *= 2;
        }
        localb2 = localb1.h(i);
        p0.O(paramObject, paramLong, localb2);
      }
      return localb2;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */