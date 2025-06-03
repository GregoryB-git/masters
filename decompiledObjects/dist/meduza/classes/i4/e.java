package i4;

import c4.i;

public final class e
{
  public static final long[] d = { 128L, 64L, 32L, 16L, 8L, 4L, 2L, 1L };
  public final byte[] a = new byte[8];
  public int b;
  public int c;
  
  public static long a(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    long l1 = paramArrayOfByte[0] & 0xFF;
    long l2 = l1;
    if (paramBoolean) {
      l2 = l1 & d[(paramInt - 1)];
    }
    for (int i = 1; i < paramInt; i++) {
      l2 = l2 << 8 | paramArrayOfByte[i] & 0xFF;
    }
    return l2;
  }
  
  public final long b(i parami, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    if (b == 0)
    {
      if (!parami.b(a, 0, 1, paramBoolean1)) {
        return -1L;
      }
      int i = a[0];
      j = 0;
      long l1;
      long l2;
      do
      {
        long[] arrayOfLong = d;
        if (j >= 8) {
          break;
        }
        l1 = arrayOfLong[j];
        l2 = i & 0xFF;
        k = j + 1;
        j = k;
      } while ((l2 & l1) == 0L);
      break label92;
      int k = -1;
      label92:
      c = k;
      if (k != -1) {
        b = 1;
      } else {
        throw new IllegalStateException("No valid varint length mask found");
      }
    }
    int j = c;
    if (j > paramInt)
    {
      b = 0;
      return -2L;
    }
    if (j != 1) {
      parami.readFully(a, 1, j - 1);
    }
    b = 0;
    return a(a, c, paramBoolean2);
  }
}

/* Location:
 * Qualified Name:     i4.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */