package X2;

import java.util.Iterator;

public abstract class t$b
{
  public static int c(int paramInt1, int paramInt2)
  {
    if (paramInt2 >= 0)
    {
      int i = paramInt1 + (paramInt1 >> 1) + 1;
      paramInt1 = i;
      if (i < paramInt2) {
        paramInt1 = Integer.highestOneBit(paramInt2 - 1) << 1;
      }
      paramInt2 = paramInt1;
      if (paramInt1 < 0) {
        paramInt2 = Integer.MAX_VALUE;
      }
      return paramInt2;
    }
    throw new AssertionError("cannot store more than MAX_VALUE elements");
  }
  
  public abstract b a(Object paramObject);
  
  public b b(Iterable paramIterable)
  {
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext()) {
      a(paramIterable.next());
    }
    return this;
  }
}

/* Location:
 * Qualified Name:     X2.t.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */