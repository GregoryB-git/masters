package h9;

import java.math.RoundingMode;
import java.util.Arrays;

public final class f
{
  public static final byte[][] c;
  public byte[] a = new byte['Ѐ'];
  public int b = 0;
  
  static
  {
    byte[] arrayOfByte1 = { 0, 0 };
    byte[] arrayOfByte2 = { -128, 0 };
    byte[] arrayOfByte3 = { -64, 0 };
    byte[] arrayOfByte4 = { -16, 0 };
    byte[] arrayOfByte5 = { -8, 0 };
    byte[] arrayOfByte6 = { -4, 0 };
    byte[] arrayOfByte7 = { -2, 0 };
    byte[] arrayOfByte8 = { -1, 0 };
    byte[] arrayOfByte9 = { -1, -128 };
    byte[] arrayOfByte10 = { -1, -64 };
    c = new byte[][] { arrayOfByte1, arrayOfByte2, arrayOfByte3, { -32, 0 }, arrayOfByte4, arrayOfByte5, arrayOfByte6, arrayOfByte7, arrayOfByte8, arrayOfByte9, arrayOfByte10 };
  }
  
  public final void a(int paramInt)
  {
    paramInt += b;
    byte[] arrayOfByte = a;
    if (paramInt <= arrayOfByte.length) {
      return;
    }
    int i = arrayOfByte.length * 2;
    if (i >= paramInt) {
      paramInt = i;
    }
    a = Arrays.copyOf(arrayOfByte, paramInt);
  }
  
  public final void b(byte paramByte)
  {
    if (paramByte == 0)
    {
      d((byte)0);
      d((byte)-1);
    }
    else if (paramByte == -1)
    {
      d((byte)-1);
      d((byte)0);
    }
    else
    {
      d(paramByte);
    }
  }
  
  public final void c(byte paramByte)
  {
    if (paramByte == 0)
    {
      e((byte)0);
      e((byte)-1);
    }
    else if (paramByte == -1)
    {
      e((byte)-1);
      e((byte)0);
    }
    else
    {
      e(paramByte);
    }
  }
  
  public final void d(byte paramByte)
  {
    a(1);
    byte[] arrayOfByte = a;
    int i = b;
    b = (i + 1);
    arrayOfByte[i] = ((byte)paramByte);
  }
  
  public final void e(byte paramByte)
  {
    a(1);
    byte[] arrayOfByte = a;
    int i = b;
    b = (i + 1);
    arrayOfByte[i] = ((byte)(byte)paramByte);
  }
  
  public final void f(long paramLong)
  {
    boolean bool = paramLong < 0L;
    long l1;
    if (bool) {
      l1 = paramLong;
    } else {
      l1 = paramLong;
    }
    byte[] arrayOfByte1;
    int i;
    if (l1 < 64L)
    {
      a(1);
      arrayOfByte1 = a;
      i = b;
      b = (i + 1);
      arrayOfByte1[i] = ((byte)(byte)(int)(paramLong ^ c[1][0]));
      return;
    }
    long l2 = l1;
    if (l1 < 0L) {
      l2 = l1;
    }
    int j = e.a(64 - Long.numberOfLeadingZeros(l2) + 1, 7, RoundingMode.UP);
    a(j);
    if (j >= 2)
    {
      if (i < 0) {
        i = -1;
      } else {
        i = 0;
      }
      int k = b;
      if (j == 10)
      {
        m = k + 2;
        arrayOfByte1 = a;
        arrayOfByte1[k] = ((byte)i);
        arrayOfByte1[(k + 1)] = ((byte)i);
        i = m;
      }
      else if (j == 9)
      {
        m = k + 1;
        a[k] = ((byte)i);
        i = m;
      }
      else
      {
        i = k;
      }
      for (k = j - 1 + k; k >= i; k--)
      {
        a[k] = ((byte)(byte)(int)(0xFF & paramLong));
        paramLong >>= 8;
      }
      byte[] arrayOfByte2 = a;
      i = b;
      k = arrayOfByte2[i];
      arrayOfByte1 = c[j];
      arrayOfByte2[i] = ((byte)(byte)(k ^ arrayOfByte1[0]));
      int m = i + 1;
      k = arrayOfByte2[m];
      arrayOfByte2[m] = ((byte)(byte)(arrayOfByte1[1] ^ k));
      b = (i + j);
      return;
    }
    throw new AssertionError(String.format("Invalid length (%d) returned by signedNumLength", new Object[] { Integer.valueOf(j) }));
  }
}

/* Location:
 * Qualified Name:     h9.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */