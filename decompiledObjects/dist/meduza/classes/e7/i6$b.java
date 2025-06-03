package e7;

import b.z;
import m6.j;

public final class i6$b
{
  public final i6 a;
  public int b;
  public long c;
  
  public i6$b(i6 parami6)
  {
    a = parami6;
    b = 1;
    c = a();
  }
  
  public final long a()
  {
    j.i(a);
    long l1 = ((Long)h0.u.a(null)).longValue();
    long l2 = ((Long)h0.v.a(null)).longValue();
    long l3;
    for (int i = 1;; i++)
    {
      l3 = l1;
      if (i >= b) {
        break;
      }
      l1 <<= 1;
      l3 = l1;
      if (l1 >= l2) {
        break;
      }
    }
    ((z)a.zzb()).getClass();
    l1 = System.currentTimeMillis();
    return Math.min(l3, l2) + l1;
  }
}

/* Location:
 * Qualified Name:     e7.i6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */