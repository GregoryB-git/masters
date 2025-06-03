package h5;

import java.util.List;
import o7.l0;
import o7.t;
import x6.b;

public final class d$b
  implements g
{
  public final long a;
  public final t<a> b;
  
  public d$b(long paramLong, l0 paraml0)
  {
    a = paramLong;
    b = paraml0;
  }
  
  public final int f(long paramLong)
  {
    int i;
    if (a > paramLong) {
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
    return a;
  }
  
  public final List<a> h(long paramLong)
  {
    Object localObject;
    if (paramLong >= a)
    {
      localObject = b;
    }
    else
    {
      localObject = t.b;
      localObject = l0.e;
    }
    return (List<a>)localObject;
  }
  
  public final int i()
  {
    return 1;
  }
}

/* Location:
 * Qualified Name:     h5.d.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */