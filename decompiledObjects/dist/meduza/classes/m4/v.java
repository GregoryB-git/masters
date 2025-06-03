package m4;

import c4.i;
import v5.c0;
import v5.e0;
import v5.u;

public final class v
{
  public final c0 a = new c0(0L);
  public final u b = new u();
  public boolean c;
  public boolean d;
  public boolean e;
  public long f = -9223372036854775807L;
  public long g = -9223372036854775807L;
  public long h = -9223372036854775807L;
  
  public static int b(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte[paramInt];
    int j = paramArrayOfByte[(paramInt + 1)];
    int k = paramArrayOfByte[(paramInt + 2)];
    return paramArrayOfByte[(paramInt + 3)] & 0xFF | (i & 0xFF) << 24 | (j & 0xFF) << 16 | (k & 0xFF) << 8;
  }
  
  public static long c(u paramu)
  {
    int i = b;
    if (c - i < 9) {
      return -9223372036854775807L;
    }
    byte[] arrayOfByte = new byte[9];
    int j = 0;
    paramu.d(arrayOfByte, 0, 9);
    paramu.G(i);
    i = arrayOfByte[0];
    if (((i & 0xC4) == 68) && ((arrayOfByte[2] & 0x4) == 4) && ((arrayOfByte[4] & 0x4) == 4) && ((arrayOfByte[5] & 0x1) == 1) && ((arrayOfByte[8] & 0x3) == 3)) {
      j = 1;
    }
    if (j == 0) {
      return -9223372036854775807L;
    }
    long l1 = i;
    long l2 = arrayOfByte[1];
    long l3 = arrayOfByte[2];
    return (l1 & 0x3) << 28 | (0x38 & l1) >> 3 << 30 | (l2 & 0xFF) << 20 | (l3 & 0xF8) >> 3 << 15 | (l3 & 0x3) << 13 | (arrayOfByte[3] & 0xFF) << 5 | (arrayOfByte[4] & 0xF8) >> 3;
  }
  
  public final void a(i parami)
  {
    u localu = b;
    byte[] arrayOfByte = e0.f;
    localu.getClass();
    localu.E(arrayOfByte, arrayOfByte.length);
    c = true;
    parami.i();
  }
}

/* Location:
 * Qualified Name:     m4.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */