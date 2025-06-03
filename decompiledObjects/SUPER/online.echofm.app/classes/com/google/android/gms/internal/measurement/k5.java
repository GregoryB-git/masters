package com.google.android.gms.internal.measurement;

import java.util.Map.Entry;

public final class k5
  implements Comparable, Map.Entry
{
  public final Comparable o;
  public Object p;
  
  public k5(d5 paramd5, Comparable paramComparable, Object paramObject)
  {
    o = paramComparable;
    p = paramObject;
  }
  
  public k5(d5 paramd5, Map.Entry paramEntry)
  {
    this(paramd5, (Comparable)paramEntry.getKey(), paramEntry.getValue());
  }
  
  public static boolean c(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null) {
      return paramObject2 == null;
    }
    return paramObject1.equals(paramObject2);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof Map.Entry)) {
      return false;
    }
    paramObject = (Map.Entry)paramObject;
    return (c(o, ((Map.Entry)paramObject).getKey())) && (c(p, ((Map.Entry)paramObject).getValue()));
  }
  
  public final Object getValue()
  {
    return p;
  }
  
  public final int hashCode()
  {
    Object localObject = o;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = localObject.hashCode();
    }
    localObject = p;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return j ^ i;
  }
  
  public final Object setValue(Object paramObject)
  {
    d5.n(q);
    Object localObject = p;
    p = paramObject;
    return localObject;
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(o);
    String str2 = String.valueOf(p);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str1);
    localStringBuilder.append("=");
    localStringBuilder.append(str2);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.k5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */