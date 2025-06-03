package e3;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import q3.f;

public abstract class i
{
  public static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1.length == 32)
    {
      long l1 = c(paramArrayOfByte1, 0, 0) & 0x3FFFFFF;
      long l2 = c(paramArrayOfByte1, 3, 2) & 0x3FFFF03;
      long l3 = c(paramArrayOfByte1, 6, 4) & 0x3FFC0FF;
      long l4 = c(paramArrayOfByte1, 9, 6) & 0x3F03FFF;
      long l5 = c(paramArrayOfByte1, 12, 8) & 0xFFFFF;
      long l6 = l3 * 5L;
      long l7 = l4 * 5L;
      long l8 = l5 * 5L;
      byte[] arrayOfByte = new byte[17];
      long l9 = 0L;
      int i = 0;
      long l10 = 0L;
      long l11 = l10;
      long l12 = l11;
      long l13 = l12;
      long l14 = l11;
      l11 = l9;
      while (i < paramArrayOfByte2.length)
      {
        b(arrayOfByte, paramArrayOfByte2, i);
        l13 += c(arrayOfByte, 0, 0);
        l11 += c(arrayOfByte, 3, 2);
        l10 += c(arrayOfByte, 6, 4);
        long l15 = l14 + c(arrayOfByte, 9, 6);
        long l16 = l12 + (c(arrayOfByte, 12, 8) | arrayOfByte[16] << 24);
        long l17 = l13 * l1 + l11 * l8 + l10 * l7 + l15 * l6 + l16 * (l2 * 5L);
        l9 = l13 * l2 + l11 * l1 + l10 * l8 + l15 * l7 + l16 * l6 + (l17 >> 26);
        l14 = l13 * l3 + l11 * l2 + l10 * l1 + l15 * l8 + l16 * l7 + (l9 >> 26);
        l12 = l13 * l4 + l11 * l3 + l10 * l2 + l15 * l1 + l16 * l8 + (l14 >> 26);
        l15 = l13 * l5 + l11 * l4 + l10 * l3 + l15 * l2 + l16 * l1 + (l12 >> 26);
        l13 = (l17 & 0x3FFFFFF) + (l15 >> 26) * 5L;
        l11 = (l9 & 0x3FFFFFF) + (l13 >> 26);
        i += 16;
        l10 = l14 & 0x3FFFFFF;
        l14 = l12 & 0x3FFFFFF;
        l12 = l15 & 0x3FFFFFF;
        l13 &= 0x3FFFFFF;
      }
      l9 = l10 + (l11 >> 26);
      l10 = l9 & 0x3FFFFFF;
      l9 = l14 + (l9 >> 26);
      l14 = l9 & 0x3FFFFFF;
      l9 = l12 + (l9 >> 26);
      l12 = l9 & 0x3FFFFFF;
      l13 += (l9 >> 26) * 5L;
      l3 = l13 & 0x3FFFFFF;
      l8 = (l11 & 0x3FFFFFF) + (l13 >> 26);
      l5 = l3 + 5L;
      l6 = (l5 >> 26) + l8;
      l4 = l10 + (l6 >> 26);
      l7 = l14 + (l4 >> 26);
      l9 = l12 + (l7 >> 26) - 67108864L;
      l13 = l9 >> 63;
      l11 = l13;
      l6 = l6 & 0x3FFFFFF & l11 | l8 & l13;
      l10 = l4 & 0x3FFFFFF & l11 | l10 & l13;
      l14 = l7 & 0x3FFFFFF & l11 | l14 & l13;
      l3 = ((l3 & l13 | l5 & 0x3FFFFFF & l11 | l6 << 26) & 0xFFFFFFFF) + d(paramArrayOfByte1, 16);
      l5 = ((l6 >> 6 | l10 << 20) & 0xFFFFFFFF) + d(paramArrayOfByte1, 20) + (l3 >> 32);
      l6 = ((l10 >> 12 | l14 << 14) & 0xFFFFFFFF) + d(paramArrayOfByte1, 24) + (l5 >> 32);
      l10 = d(paramArrayOfByte1, 28);
      paramArrayOfByte1 = new byte[16];
      e(paramArrayOfByte1, l3 & 0xFFFFFFFF, 0);
      e(paramArrayOfByte1, l5 & 0xFFFFFFFF, 4);
      e(paramArrayOfByte1, l6 & 0xFFFFFFFF, 8);
      e(paramArrayOfByte1, ((l14 >> 18 | (l9 & l11 | l12 & l13) << 8) & 0xFFFFFFFF) + l10 + (l6 >> 32) & 0xFFFFFFFF, 12);
      return paramArrayOfByte1;
    }
    throw new IllegalArgumentException("The key length in bytes must be 32.");
  }
  
  public static void b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    int i = Math.min(16, paramArrayOfByte2.length - paramInt);
    System.arraycopy(paramArrayOfByte2, paramInt, paramArrayOfByte1, 0, i);
    paramArrayOfByte1[i] = ((byte)1);
    if (i != 16) {
      Arrays.fill(paramArrayOfByte1, i + 1, paramArrayOfByte1.length, (byte)0);
    }
  }
  
  public static long c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return d(paramArrayOfByte, paramInt1) >> paramInt2 & 0x3FFFFFF;
  }
  
  public static long d(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte[paramInt];
    int j = paramArrayOfByte[(paramInt + 1)];
    int k = paramArrayOfByte[(paramInt + 2)];
    return ((paramArrayOfByte[(paramInt + 3)] & 0xFF) << 24 | i & 0xFF | (j & 0xFF) << 8 | (k & 0xFF) << 16) & 0xFFFFFFFF;
  }
  
  public static void e(byte[] paramArrayOfByte, long paramLong, int paramInt)
  {
    int i = 0;
    while (i < 4)
    {
      paramArrayOfByte[(paramInt + i)] = ((byte)(byte)(int)(0xFF & paramLong));
      i++;
      paramLong >>= 8;
    }
  }
  
  public static void f(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
  {
    if (f.b(a(paramArrayOfByte1, paramArrayOfByte2), paramArrayOfByte3)) {
      return;
    }
    throw new GeneralSecurityException("invalid MAC");
  }
}

/* Location:
 * Qualified Name:     e3.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */