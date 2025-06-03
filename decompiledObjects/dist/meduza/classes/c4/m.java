package c4;

import java.util.Arrays;
import v5.u;

public final class m
{
  public static o.a a(u paramu)
  {
    paramu.H(1);
    int i = paramu.x();
    long l1 = b;
    long l2 = i;
    int j = i / 18;
    long[] arrayOfLong1 = new long[j];
    long[] arrayOfLong2 = new long[j];
    long[] arrayOfLong3;
    long[] arrayOfLong4;
    for (i = 0;; i++)
    {
      arrayOfLong3 = arrayOfLong1;
      arrayOfLong4 = arrayOfLong2;
      if (i >= j) {
        break;
      }
      long l3 = paramu.o();
      if (l3 == -1L)
      {
        arrayOfLong3 = Arrays.copyOf(arrayOfLong1, i);
        arrayOfLong4 = Arrays.copyOf(arrayOfLong2, i);
        break;
      }
      arrayOfLong1[i] = l3;
      arrayOfLong2[i] = paramu.o();
      paramu.H(2);
    }
    paramu.H((int)(l1 + l2 - b));
    return new o.a(arrayOfLong3, arrayOfLong4);
  }
}

/* Location:
 * Qualified Name:     c4.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */