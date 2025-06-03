package n5;

import h5.a;
import h5.g;
import java.util.Collections;
import java.util.List;
import v5.e0;

public final class b
  implements g
{
  public final a[] a;
  public final long[] b;
  
  public b(a[] paramArrayOfa, long[] paramArrayOfLong)
  {
    a = paramArrayOfa;
    b = paramArrayOfLong;
  }
  
  public final int f(long paramLong)
  {
    int i = e0.b(b, paramLong, false);
    if (i >= b.length) {
      i = -1;
    }
    return i;
  }
  
  public final long g(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    x6.b.q(bool2);
    if (paramInt < b.length) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    x6.b.q(bool2);
    return b[paramInt];
  }
  
  public final List<a> h(long paramLong)
  {
    int i = e0.f(b, paramLong, false);
    if (i != -1)
    {
      a locala = a[i];
      if (locala != a.z) {
        return Collections.singletonList(locala);
      }
    }
    return Collections.emptyList();
  }
  
  public final int i()
  {
    return b.length;
  }
}

/* Location:
 * Qualified Name:     n5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */