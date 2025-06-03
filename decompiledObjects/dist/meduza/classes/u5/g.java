package u5;

import f;
import java.io.File;

public class g
  implements Comparable<g>
{
  public final String a;
  public final long b;
  public final long c;
  public final boolean d;
  public final File e;
  public final long f;
  
  public g(String paramString, long paramLong1, long paramLong2, long paramLong3, File paramFile)
  {
    a = paramString;
    b = paramLong1;
    c = paramLong2;
    boolean bool;
    if (paramFile != null) {
      bool = true;
    } else {
      bool = false;
    }
    d = bool;
    e = paramFile;
    f = paramLong3;
  }
  
  public final int f(g paramg)
  {
    if (!a.equals(a)) {
      return a.compareTo(a);
    }
    boolean bool = b - b < 0L;
    int i;
    if (!bool) {
      bool = false;
    } else if (bool) {
      i = -1;
    } else {
      i = 1;
    }
    return i;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("[");
    localStringBuilder.append(b);
    localStringBuilder.append(", ");
    localStringBuilder.append(c);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     u5.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */