package x2;

import a0.j;

public final class s$a
{
  public static long a(boolean paramBoolean1, int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3, boolean paramBoolean2, long paramLong3, long paramLong4, long paramLong5, long paramLong6)
  {
    j.p(paramInt2, "backoffPolicy");
    long l = Long.MAX_VALUE;
    if ((paramLong6 != Long.MAX_VALUE) && (paramBoolean2))
    {
      if (paramInt3 != 0)
      {
        paramLong1 = 900000L + paramLong2;
        if (paramLong6 < paramLong1) {
          paramLong6 = paramLong1;
        }
      }
      return paramLong6;
    }
    int i = 0;
    int j = 0;
    if (paramBoolean1)
    {
      paramInt3 = j;
      if (paramInt2 == 2) {
        paramInt3 = 1;
      }
      if (paramInt3 != 0) {
        paramLong1 = paramInt1 * paramLong1;
      } else {
        paramLong1 = Math.scalb((float)paramLong1, paramInt1 - 1);
      }
      paramLong3 = paramLong1;
      if (paramLong1 > 18000000L) {
        paramLong3 = 18000000L;
      }
      paramLong1 = paramLong2 + paramLong3;
    }
    else if (paramBoolean2)
    {
      if (paramInt3 == 0) {
        paramLong1 = paramLong2 + paramLong3;
      } else {
        paramLong1 = paramLong2 + paramLong5;
      }
      paramLong2 = paramLong1;
      paramInt1 = i;
      if (paramLong4 != paramLong5) {
        paramInt1 = 1;
      }
      paramLong1 = paramLong2;
      if (paramInt1 != 0)
      {
        paramLong1 = paramLong2;
        if (paramInt3 == 0) {
          paramLong1 = paramLong2 + (paramLong5 - paramLong4);
        }
      }
    }
    else if (paramLong2 == -1L)
    {
      paramLong1 = l;
    }
    else
    {
      paramLong1 = paramLong2 + paramLong3;
    }
    return paramLong1;
  }
}

/* Location:
 * Qualified Name:     x2.s.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */