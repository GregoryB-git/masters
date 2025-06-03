package i5;

import h5.a;
import h5.g;
import java.util.Collections;
import java.util.List;
import x6.b;

public final class d
  implements g
{
  public final List<a> a;
  
  public d(List<a> paramList)
  {
    a = paramList;
  }
  
  public final int f(long paramLong)
  {
    int i;
    if (paramLong < 0L) {
      i = 0;
    } else {
      i = -1;
    }
    return i;
  }
  
  public final long g(int paramInt)
  {
    boolean bool;
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    }
    b.q(bool);
    return 0L;
  }
  
  public final List<a> h(long paramLong)
  {
    List localList;
    if (paramLong >= 0L) {
      localList = a;
    } else {
      localList = Collections.emptyList();
    }
    return localList;
  }
  
  public final int i()
  {
    return 1;
  }
}

/* Location:
 * Qualified Name:     i5.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */