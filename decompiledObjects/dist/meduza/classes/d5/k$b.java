package d5;

import java.util.List;

public final class k$b
  extends k.a
{
  public final List<i> j;
  
  public k$b(i parami, long paramLong1, long paramLong2, long paramLong3, long paramLong4, List<k.d> paramList, long paramLong5, List<i> paramList1, long paramLong6, long paramLong7)
  {
    super(parami, paramLong1, paramLong2, paramLong3, paramLong4, paramList, paramLong5, paramLong6, paramLong7);
    j = paramList1;
  }
  
  public final long d(long paramLong)
  {
    return j.size();
  }
  
  public final i h(long paramLong, j paramj)
  {
    return (i)j.get((int)(paramLong - d));
  }
  
  public final boolean i()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     d5.k.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */