package d9;

import f;
import ma.h;
import n9.o;

public final class c
  implements Comparable<c>
{
  public final h a;
  
  public c(h paramh)
  {
    a = paramh;
  }
  
  public final int compareTo(Object paramObject)
  {
    paramObject = (c)paramObject;
    return o.c(a, a);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof c)) && (a.equals(a))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Blob { bytes=");
    localStringBuilder.append(o.i(a));
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     d9.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */