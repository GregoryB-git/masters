package y6;

import u6.F;
import u6.G;

public abstract class e
{
  public static final int a = G.g("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
  public static final F b = new F("PERMIT");
  public static final F c = new F("TAKEN");
  public static final F d = new F("BROKEN");
  public static final F e = new F("CANCELLED");
  public static final int f = G.g("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
  
  public static final f h(long paramLong, f paramf)
  {
    return new f(paramLong, paramf, 0);
  }
}

/* Location:
 * Qualified Name:     y6.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */