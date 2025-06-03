package o7;

import java.util.Map.Entry;
import x6.b;

public abstract class e<K, V>
  implements Map.Entry<K, V>
{
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Map.Entry;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramObject = (Map.Entry)paramObject;
      bool3 = bool2;
      if (b.Q(getKey(), ((Map.Entry)paramObject).getKey()))
      {
        bool3 = bool2;
        if (b.Q(getValue(), ((Map.Entry)paramObject).getValue())) {
          bool3 = true;
        }
      }
    }
    return bool3;
  }
  
  public abstract K getKey();
  
  public abstract V getValue();
  
  public final int hashCode()
  {
    Object localObject1 = getKey();
    Object localObject2 = getValue();
    int i = 0;
    int j;
    if (localObject1 == null) {
      j = 0;
    } else {
      j = localObject1.hashCode();
    }
    if (localObject2 != null) {
      i = localObject2.hashCode();
    }
    return j ^ i;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getKey());
    localStringBuilder.append("=");
    localStringBuilder.append(getValue());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     o7.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */