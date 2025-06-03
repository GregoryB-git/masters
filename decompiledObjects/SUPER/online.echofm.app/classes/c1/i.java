package c1;

import g0.g;
import java.util.List;

public abstract class i
{
  public static int a(k paramk, long paramLong)
  {
    if (paramLong == -9223372036854775807L) {
      return 0;
    }
    int i = paramk.c(paramLong);
    int j = i;
    if (i == -1) {
      j = paramk.j();
    }
    i = j;
    if (j > 0)
    {
      i = j;
      if (paramk.e(j - 1) == paramLong) {
        i = j - 1;
      }
    }
    return i;
  }
  
  public static void b(k paramk, int paramInt, g paramg)
  {
    long l1 = paramk.e(paramInt);
    List localList = paramk.h(l1);
    if (localList.isEmpty()) {
      return;
    }
    if (paramInt != paramk.j() - 1)
    {
      long l2 = paramk.e(paramInt + 1) - paramk.e(paramInt);
      if (l2 > 0L) {
        paramg.accept(new e(localList, l1, l2));
      }
      return;
    }
    throw new IllegalStateException();
  }
  
  public static void c(k paramk, t.b paramb, g paramg)
  {
    int i = a(paramk, a);
    long l1 = a;
    int j = 0;
    if ((l1 != -9223372036854775807L) && (i < paramk.j()))
    {
      List localList = paramk.h(a);
      l1 = paramk.e(i);
      if (!localList.isEmpty())
      {
        long l2 = a;
        if (l2 < l1)
        {
          paramg.accept(new e(localList, l2, l1 - l2));
          k = 1;
          break label113;
        }
      }
    }
    int k = 0;
    label113:
    for (int m = i; m < paramk.j(); m++) {
      b(paramk, m, paramg);
    }
    if (b)
    {
      int n = i;
      m = j;
      if (k != 0) {
        n = i - 1;
      }
      for (m = j; m < n; m++) {
        b(paramk, m, paramg);
      }
      if (k != 0) {
        paramg.accept(new e(paramk.h(a), paramk.e(n), a - paramk.e(n)));
      }
    }
  }
}

/* Location:
 * Qualified Name:     c1.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */