package j9;

import g;

public final class f
  implements Comparable<f>
{
  public final String a;
  public final String b;
  
  public f(String paramString1, String paramString2)
  {
    a = paramString1;
    b = paramString2;
  }
  
  public final int compareTo(Object paramObject)
  {
    paramObject = (f)paramObject;
    int i = a.compareTo(a);
    if (i == 0) {
      i = b.compareTo(b);
    }
    return i;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (f.class == paramObject.getClass()))
    {
      paramObject = (f)paramObject;
      if ((!a.equals(a)) || (!b.equals(b))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    return b.hashCode() + i * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("DatabaseId(");
    localStringBuilder.append(a);
    localStringBuilder.append(", ");
    return g.f(localStringBuilder, b, ")");
  }
}

/* Location:
 * Qualified Name:     j9.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */