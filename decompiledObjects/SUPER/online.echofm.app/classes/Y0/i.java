package Y0;

import F0.I.a;
import g0.M;
import g0.z;

public final class i
{
  public final I.a a;
  public final long b;
  public final long c;
  public final int d;
  public final int e;
  public final long[] f;
  
  public i(I.a parama, long paramLong1, long paramLong2, long[] paramArrayOfLong, int paramInt1, int paramInt2)
  {
    a = new I.a(parama);
    b = paramLong1;
    c = paramLong2;
    f = paramArrayOfLong;
    d = paramInt1;
    e = paramInt2;
  }
  
  public static i b(I.a parama, z paramz)
  {
    int i = paramz.p();
    int j;
    if ((i & 0x1) != 0) {
      j = paramz.K();
    } else {
      j = -1;
    }
    if ((i & 0x2) != 0) {}
    for (long l = paramz.I();; l = -1L) {
      break;
    }
    long[] arrayOfLong;
    int k;
    if ((i & 0x4) == 4)
    {
      arrayOfLong = new long[100];
      for (k = 0; k < 100; k++) {
        arrayOfLong[k] = paramz.G();
      }
    }
    else
    {
      arrayOfLong = null;
    }
    if ((i & 0x8) != 0) {
      paramz.U(4);
    }
    if (paramz.a() >= 24)
    {
      paramz.U(21);
      i = paramz.J();
      k = i & 0xFFF;
      i = (0xFFF000 & i) >> 12;
    }
    else
    {
      i = -1;
      k = i;
    }
    return new i(parama, j, l, arrayOfLong, i, k);
  }
  
  public long a()
  {
    long l = b;
    if ((l != -1L) && (l != 0L))
    {
      I.a locala = a;
      return M.V0(l * g - 1L, d);
    }
    return -9223372036854775807L;
  }
}

/* Location:
 * Qualified Name:     Y0.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */