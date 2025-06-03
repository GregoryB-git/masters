package d9;

import f;

public final class l0
  implements e0
{
  public final long a;
  
  public l0(long paramLong)
  {
    a = paramLong;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (l0.class == paramObject.getClass()))
    {
      paramObject = (l0)paramObject;
      if (a != a) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    long l = a;
    return (int)(l ^ l >>> 32);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("PersistentCacheSettings{sizeBytes=");
    localStringBuilder.append(a);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     d9.l0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */