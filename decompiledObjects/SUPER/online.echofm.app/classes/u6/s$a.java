package u6;

public final class s$a
{
  public final int a(long paramLong)
  {
    int i;
    if ((paramLong & 0x2000000000000000) != 0L) {
      i = 2;
    } else {
      i = 1;
    }
    return i;
  }
  
  public final long b(long paramLong, int paramInt)
  {
    return d(paramLong, 1073741823L) | paramInt;
  }
  
  public final long c(long paramLong, int paramInt)
  {
    return d(paramLong, 1152921503533105152L) | paramInt << 30;
  }
  
  public final long d(long paramLong1, long paramLong2)
  {
    return paramLong1 & paramLong2;
  }
}

/* Location:
 * Qualified Name:     u6.s.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */