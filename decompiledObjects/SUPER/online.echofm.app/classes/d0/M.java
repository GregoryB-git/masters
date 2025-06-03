package d0;

public final class M
  extends Exception
{
  public final long o;
  
  public M(Throwable paramThrowable, long paramLong)
  {
    super(paramThrowable);
    o = paramLong;
  }
  
  public static M a(Exception paramException)
  {
    return b(paramException, -9223372036854775807L);
  }
  
  public static M b(Exception paramException, long paramLong)
  {
    if ((paramException instanceof M)) {
      return (M)paramException;
    }
    return new M(paramException, paramLong);
  }
}

/* Location:
 * Qualified Name:     d0.M
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */