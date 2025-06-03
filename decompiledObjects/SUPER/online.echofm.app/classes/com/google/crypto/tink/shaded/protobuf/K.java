package com.google.crypto.tink.shaded.protobuf;

import android.support.v4.media.a;
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
    paramObject1 = (I)paramObject1;
    a.a(paramObject2);
    if (((AbstractMap)paramObject1).isEmpty()) {
      return 0;
    }
    paramObject1 = ((I)paramObject1).entrySet().iterator();
    if (!((Iterator)paramObject1).hasNext()) {
      return 0;
    }
    paramObject1 = (Map.Entry)((Iterator)paramObject1).next();
    ((Map.Entry)paramObject1).getKey();
    ((Map.Entry)paramObject1).getValue();
    throw null;
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
    a.a(paramObject);
    throw null;
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
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.K
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */