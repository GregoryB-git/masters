package l1;

import g0.z;

public abstract class L
{
  public static int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    while ((paramInt1 < paramInt2) && (paramArrayOfByte[paramInt1] != 71)) {
      paramInt1++;
    }
    return paramInt1;
  }
  
  public static boolean b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = -4;
    int j = 0;
    while (i <= 4)
    {
      int k = i * 188 + paramInt3;
      if ((k >= paramInt1) && (k < paramInt2) && (paramArrayOfByte[k] == 71))
      {
        k = j + 1;
        j = k;
        if (k == 5) {
          return true;
        }
      }
      else
      {
        j = 0;
      }
      i++;
    }
    return false;
  }
  
  public static long c(z paramz, int paramInt1, int paramInt2)
  {
    paramz.T(paramInt1);
    if (paramz.a() < 5) {
      return -9223372036854775807L;
    }
    paramInt1 = paramz.p();
    if ((0x800000 & paramInt1) != 0) {
      return -9223372036854775807L;
    }
    if ((0x1FFF00 & paramInt1) >> 8 != paramInt2) {
      return -9223372036854775807L;
    }
    if (((paramInt1 & 0x20) != 0) && (paramz.G() >= 7) && (paramz.a() >= 7) && ((paramz.G() & 0x10) == 16))
    {
      byte[] arrayOfByte = new byte[6];
      paramz.l(arrayOfByte, 0, 6);
      return d(arrayOfByte);
    }
    return -9223372036854775807L;
  }
  
  public static long d(byte[] paramArrayOfByte)
  {
    return (paramArrayOfByte[0] & 0xFF) << 25 | (paramArrayOfByte[1] & 0xFF) << 17 | (paramArrayOfByte[2] & 0xFF) << 9 | (paramArrayOfByte[3] & 0xFF) << 1 | (0xFF & paramArrayOfByte[4]) >> 7;
  }
}

/* Location:
 * Qualified Name:     l1.L
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */