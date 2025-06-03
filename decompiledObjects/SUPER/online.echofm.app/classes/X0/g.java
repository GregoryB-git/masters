package X0;

import F0.s;

public final class g
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
  
  public static int c(int paramInt)
  {
    int i = 0;
    long l1;
    long l2;
    do
    {
      long[] arrayOfLong = d;
      if (i >= arrayOfLong.length) {
        break;
      }
      l1 = arrayOfLong[i];
      l2 = paramInt;
      j = i + 1;
      i = j;
    } while ((l1 & l2) == 0L);
    break label43;
    int j = -1;
    label43:
    return j;
  }
  
  public int b()
  {
    return c;
  }
  
  public long d(s params, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    if (b == 0)
    {
      if (!params.d(a, 0, 1, paramBoolean1)) {
        return -1L;
      }
      i = c(a[0] & 0xFF);
      c = i;
      if (i != -1) {
        b = 1;
      } else {
        throw new IllegalStateException("No valid varint length mask found");
      }
    }
    int i = c;
    if (i > paramInt)
    {
      b = 0;
      return -2L;
    }
    if (i != 1) {
      params.readFully(a, 1, i - 1);
    }
    b = 0;
    return a(a, c, paramBoolean2);
  }
  
  public void e()
  {
    b = 0;
    c = 0;
  }
}

/* Location:
 * Qualified Name:     X0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */