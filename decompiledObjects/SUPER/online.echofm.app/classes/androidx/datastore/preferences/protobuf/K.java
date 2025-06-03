package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class K
  implements J
{
  public static int i(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject = (I)paramObject1;
    paramObject1 = (H)paramObject2;
    boolean bool = ((AbstractMap)localObject).isEmpty();
    int i = 0;
    if (bool) {
      return 0;
    }
    paramObject2 = ((I)localObject).entrySet().iterator();
    while (((Iterator)paramObject2).hasNext())
    {
      localObject = (Map.Entry)((Iterator)paramObject2).next();
      i += ((H)paramObject1).a(paramInt, ((Map.Entry)localObject).getKey(), ((Map.Entry)localObject).getValue());
    }
    return i;
  }
  
  public static I j(Object paramObject1, Object paramObject2)
  {
    I localI = (I)paramObject1;
    paramObject2 = (I)paramObject2;
    paramObject1 = localI;
    if (!((AbstractMap)paramObject2).isEmpty())
    {
      paramObject1 = localI;
      if (!localI.n()) {
        paramObject1 = localI.s();
      }
      ((I)paramObject1).p((I)paramObject2);
    }
    return (I)paramObject1;
  }
  
  public Object a(Object paramObject1, Object paramObject2)
  {
    return j(paramObject1, paramObject2);
  }
  
  public int b(int paramInt, Object paramObject1, Object paramObject2)
  {
    return i(paramInt, paramObject1, paramObject2);
  }
  
  public Object c(Object paramObject)
  {
    ((I)paramObject).o();
    return paramObject;
  }
  
  public H.a d(Object paramObject)
  {
    return ((H)paramObject).c();
  }
  
  public Map e(Object paramObject)
  {
    return (I)paramObject;
  }
  
  public Object f(Object paramObject)
  {
    return I.f().s();
  }
  
  public boolean g(Object paramObject)
  {
    return ((I)paramObject).n() ^ true;
  }
  
  public Map h(Object paramObject)
  {
    return (I)paramObject;
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.K
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */