package rb;

import ec.i;

public final class b
  implements Comparable<b>
{
  public static final b e = new b();
  public final int a = 2;
  public final int b = 1;
  public final int c = 0;
  public final int d = 131328;
  
  public final int compareTo(Object paramObject)
  {
    paramObject = (b)paramObject;
    i.e(paramObject, "other");
    return d - d;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof b)) {
      paramObject = (b)paramObject;
    } else {
      paramObject = null;
    }
    if (paramObject == null) {
      return false;
    }
    if (d != d) {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return d;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append('.');
    localStringBuilder.append(b);
    localStringBuilder.append('.');
    localStringBuilder.append(c);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     rb.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */