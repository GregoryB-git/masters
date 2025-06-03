package o7;

public abstract class r$b<E>
{
  public static int a(int paramInt1, int paramInt2)
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
}

/* Location:
 * Qualified Name:     o7.r.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */