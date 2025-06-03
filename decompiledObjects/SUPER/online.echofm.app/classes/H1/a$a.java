package H1;

import W5.g;

public final class a$a
{
  public final int b(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt.length != 0)
    {
      int i = paramArrayOfInt[0];
      int j = g.j(paramArrayOfInt);
      int k = 1;
      int m = i;
      if (1 <= j) {
        for (;;)
        {
          i *= paramArrayOfInt[k];
          m = i;
          if (k == j) {
            break;
          }
          k++;
        }
      }
      return m;
    }
    throw new UnsupportedOperationException("Empty array can't be reduced.");
  }
}

/* Location:
 * Qualified Name:     H1.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */