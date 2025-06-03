package c1;

import X2.v;
import java.util.List;

public class e
{
  public final v a;
  public final long b;
  public final long c;
  public final long d;
  
  public e(List paramList, long paramLong1, long paramLong2)
  {
    a = v.U(paramList);
    b = paramLong1;
    c = paramLong2;
    long l1 = -9223372036854775807L;
    long l2 = l1;
    if (paramLong1 != -9223372036854775807L) {
      if (paramLong2 == -9223372036854775807L) {
        l2 = l1;
      } else {
        l2 = paramLong1 + paramLong2;
      }
    }
    d = l2;
  }
}

/* Location:
 * Qualified Name:     c1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */