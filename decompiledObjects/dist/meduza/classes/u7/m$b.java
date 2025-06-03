package u7;

import a0.j;
import f;

public final class m$b
{
  public static final void a(long paramLong, int paramInt)
  {
    int i = 1;
    int j;
    if ((paramInt >= 0) && (paramInt < 1000000000)) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0)
    {
      if ((-62135596800L <= paramLong) && (paramLong < 253402300800L)) {
        paramInt = i;
      } else {
        paramInt = 0;
      }
      if (paramInt != 0) {
        return;
      }
      throw new IllegalArgumentException(j.i("Timestamp seconds out of range: ", paramLong).toString());
    }
    throw new IllegalArgumentException(f.h("Timestamp nanoseconds out of range: ", paramInt).toString());
  }
}

/* Location:
 * Qualified Name:     u7.m.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */