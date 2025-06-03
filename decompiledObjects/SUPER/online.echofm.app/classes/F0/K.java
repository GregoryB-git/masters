package F0;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public abstract class K
{
  public static List a(byte[] paramArrayOfByte)
  {
    long l1 = k(f(paramArrayOfByte));
    long l2 = k(3840L);
    ArrayList localArrayList = new ArrayList(3);
    localArrayList.add(paramArrayOfByte);
    localArrayList.add(b(l1));
    localArrayList.add(b(l2));
    return localArrayList;
  }
  
  public static byte[] b(long paramLong)
  {
    return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(paramLong).array();
  }
  
  public static int c(byte[] paramArrayOfByte)
  {
    return paramArrayOfByte[9] & 0xFF;
  }
  
  public static long d(byte paramByte1, byte paramByte2)
  {
    int i = paramByte1 & 0x3;
    int k;
    if (i != 0)
    {
      int j = 2;
      k = j;
      if (i != 1)
      {
        k = j;
        if (i != 2) {
          k = paramByte2 & 0x3F;
        }
      }
    }
    else
    {
      k = 1;
    }
    paramByte2 = (paramByte1 & 0xFF) >> 3;
    paramByte1 = paramByte2 & 0x3;
    if (paramByte2 >= 16) {
      paramByte1 = 2500 << paramByte1;
    } else if (paramByte2 >= 12) {
      paramByte1 = 10000 << (paramByte2 & 0x1);
    } else if (paramByte1 == 3) {
      paramByte1 = 60000;
    } else {
      paramByte1 = 10000 << paramByte1;
    }
    return k * paramByte1;
  }
  
  public static long e(byte[] paramArrayOfByte)
  {
    byte b1 = 0;
    byte b2 = paramArrayOfByte[0];
    byte b3 = b1;
    if (paramArrayOfByte.length > 1)
    {
      b1 = paramArrayOfByte[1];
      b3 = b1;
    }
    return d(b2, b3);
  }
  
  public static int f(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte[11];
    return paramArrayOfByte[10] & 0xFF | (i & 0xFF) << 8;
  }
  
  public static boolean g(long paramLong1, long paramLong2)
  {
    boolean bool;
    if (paramLong1 - paramLong2 <= k(3840L) / 1000L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static int h(ByteBuffer paramByteBuffer)
  {
    int i = i(paramByteBuffer);
    i = paramByteBuffer.get(i + 26) + 27 + i;
    byte b = paramByteBuffer.get(i);
    int j;
    if (paramByteBuffer.limit() - i > 1)
    {
      i = paramByteBuffer.get(i + 1);
      j = i;
    }
    else
    {
      i = 0;
      j = i;
    }
    return (int)(d(b, j) * 48000L / 1000000L);
  }
  
  public static int i(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.get(5);
    int j = 0;
    if ((i & 0x2) == 0) {
      return 0;
    }
    int k = paramByteBuffer.get(26);
    int m = 28;
    int n = 0;
    i = 28;
    while (n < k)
    {
      i += paramByteBuffer.get(n + 27);
      n++;
    }
    k = paramByteBuffer.get(i + 26);
    n = m;
    while (j < k)
    {
      n += paramByteBuffer.get(i + 27 + j);
      j++;
    }
    return i + n;
  }
  
  public static int j(ByteBuffer paramByteBuffer)
  {
    byte b1 = 0;
    byte b2 = paramByteBuffer.get(0);
    byte b3 = b1;
    if (paramByteBuffer.limit() > 1)
    {
      b1 = paramByteBuffer.get(1);
      b3 = b1;
    }
    return (int)(d(b2, b3) * 48000L / 1000000L);
  }
  
  public static long k(long paramLong)
  {
    return paramLong * 1000000000L / 48000L;
  }
}

/* Location:
 * Qualified Name:     F0.K
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */