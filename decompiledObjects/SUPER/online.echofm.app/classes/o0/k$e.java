package o0;

public class k$e
  extends k
{
  public final long d;
  public final long e;
  
  public k$e()
  {
    this(null, 1L, 0L, 0L, 0L);
  }
  
  public k$e(i parami, long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    super(parami, paramLong1, paramLong2);
    d = paramLong3;
    e = paramLong4;
  }
  
  public i c()
  {
    long l = e;
    i locali;
    if (l <= 0L) {
      locali = null;
    } else {
      locali = new i(null, d, l);
    }
    return locali;
  }
}

/* Location:
 * Qualified Name:     o0.k.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */