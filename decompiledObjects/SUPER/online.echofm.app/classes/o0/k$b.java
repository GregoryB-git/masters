package o0;

import java.util.List;

public final class k$b
  extends k.a
{
  public final List j;
  
  public k$b(i parami, long paramLong1, long paramLong2, long paramLong3, long paramLong4, List paramList1, long paramLong5, List paramList2, long paramLong6, long paramLong7)
  {
    super(parami, paramLong1, paramLong2, paramLong3, paramLong4, paramList1, paramLong5, paramLong6, paramLong7);
    j = paramList2;
  }
  
  public long g(long paramLong)
  {
    return j.size();
  }
  
  public i k(j paramj, long paramLong)
  {
    return (i)j.get((int)(paramLong - d));
  }
  
  public boolean l()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     o0.k.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */