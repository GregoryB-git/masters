package ic;

import b.a0;

public class g
  extends a0
{
  public static final long N(long paramLong1, long paramLong2, long paramLong3)
  {
    if (paramLong2 <= paramLong3)
    {
      if (paramLong1 < paramLong2) {
        return paramLong2;
      }
      if (paramLong1 > paramLong3) {
        return paramLong3;
      }
      return paramLong1;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Cannot coerce value to an empty range: maximum ");
    localStringBuilder.append(paramLong3);
    localStringBuilder.append(" is less than minimum ");
    localStringBuilder.append(paramLong2);
    localStringBuilder.append('.');
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public static final f O(int paramInt1, int paramInt2)
  {
    if (paramInt2 <= Integer.MIN_VALUE)
    {
      f localf = f.d;
      return f.d;
    }
    return new f(paramInt1, paramInt2 - 1);
  }
}

/* Location:
 * Qualified Name:     ic.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */