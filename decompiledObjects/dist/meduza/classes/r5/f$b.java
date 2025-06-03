package r5;

import o7.n;
import o7.n.a;
import v3.i0;

public final class f$b
  implements Comparable<b>
{
  public final boolean a;
  public final boolean b;
  
  public f$b(i0 parami0, int paramInt)
  {
    int i = d;
    boolean bool = true;
    if ((i & 0x1) == 0) {
      bool = false;
    }
    a = bool;
    b = f.i(paramInt, false);
  }
  
  public final int compareTo(Object paramObject)
  {
    paramObject = (b)paramObject;
    return n.a.c(b, b).c(a, a).e();
  }
}

/* Location:
 * Qualified Name:     r5.f.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */