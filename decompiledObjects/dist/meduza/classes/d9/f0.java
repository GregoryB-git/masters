package d9;

import f;

public final class f0
  implements e0
{
  public h0 a;
  
  public f0(g0 paramg0)
  {
    a = paramg0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (f0.class == paramObject.getClass())) {
      return a.equals(a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("MemoryCacheSettings{gcSettings=");
    localStringBuilder.append(a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     d9.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */