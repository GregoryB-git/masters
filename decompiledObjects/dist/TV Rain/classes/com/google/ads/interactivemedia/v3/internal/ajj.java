package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Map.Entry;
import java.util.Objects;

public abstract class ajj<L, R>
  implements Serializable, Comparable<ajj<L, R>>, Map.Entry<L, R>
{
  private static final long serialVersionUID = 4954918890077093841L;
  
  public static <L, R> ajj<L, R> a(L paramL, R paramR)
  {
    return new ajh(paramL, paramR);
  }
  
  public abstract L a();
  
  public abstract R b();
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof Map.Entry))
    {
      paramObject = (Map.Entry)paramObject;
      if ((Objects.equals(getKey(), ((Map.Entry)paramObject).getKey())) && (Objects.equals(getValue(), ((Map.Entry)paramObject).getValue()))) {
        return true;
      }
    }
    return false;
  }
  
  public final L getKey()
  {
    return (L)a();
  }
  
  public R getValue()
  {
    return (R)b();
  }
  
  public int hashCode()
  {
    Object localObject = getKey();
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = getKey().hashCode();
    }
    if (getValue() != null) {
      i = getValue().hashCode();
    }
    return j ^ i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("(");
    localStringBuilder.append(a());
    localStringBuilder.append(',');
    localStringBuilder.append(b());
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ajj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */