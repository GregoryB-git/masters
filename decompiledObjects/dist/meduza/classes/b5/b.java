package b5;

import java.util.NoSuchElementException;

public abstract class b
  implements n
{
  public final long b;
  public final long c;
  public long d;
  
  public b(long paramLong1, long paramLong2)
  {
    b = paramLong1;
    c = paramLong2;
    d = (paramLong1 - 1L);
  }
  
  public final void c()
  {
    long l = d;
    if ((l >= b) && (l <= c)) {
      return;
    }
    throw new NoSuchElementException();
  }
  
  public final boolean next()
  {
    long l = d + 1L;
    d = l;
    int i;
    if (l > c) {
      i = 1;
    } else {
      i = 0;
    }
    return i ^ 0x1;
  }
}

/* Location:
 * Qualified Name:     b5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */