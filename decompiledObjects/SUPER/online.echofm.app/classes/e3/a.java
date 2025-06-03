package e3;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

public abstract class a
{
  public static final int[] a = e(new byte[] { 101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107 });
  
  public static void a(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramArrayOfInt[paramInt1] + paramArrayOfInt[paramInt2];
    paramArrayOfInt[paramInt1] = i;
    i = b(i ^ paramArrayOfInt[paramInt4], 16);
    paramArrayOfInt[paramInt4] = i;
    i = paramArrayOfInt[paramInt3] + i;
    paramArrayOfInt[paramInt3] = i;
    i = b(paramArrayOfInt[paramInt2] ^ i, 12);
    paramArrayOfInt[paramInt2] = i;
    i = paramArrayOfInt[paramInt1] + i;
    paramArrayOfInt[paramInt1] = i;
    paramInt1 = b(paramArrayOfInt[paramInt4] ^ i, 8);
    paramArrayOfInt[paramInt4] = paramInt1;
    paramInt1 = paramArrayOfInt[paramInt3] + paramInt1;
    paramArrayOfInt[paramInt3] = paramInt1;
    paramArrayOfInt[paramInt2] = b(paramArrayOfInt[paramInt2] ^ paramInt1, 7);
  }
  
  public static int b(int paramInt1, int paramInt2)
  {
    return paramInt1 >>> -paramInt2 | paramInt1 << paramInt2;
  }
  
  public static void c(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    int[] arrayOfInt = a;
    System.arraycopy(arrayOfInt, 0, paramArrayOfInt1, 0, arrayOfInt.length);
    System.arraycopy(paramArrayOfInt2, 0, paramArrayOfInt1, arrayOfInt.length, 8);
  }
  
  public static void d(int[] paramArrayOfInt)
  {
    for (int i = 0; i < 10; i++)
    {
      a(paramArrayOfInt, 0, 4, 8, 12);
      a(paramArrayOfInt, 1, 5, 9, 13);
      a(paramArrayOfInt, 2, 6, 10, 14);
      a(paramArrayOfInt, 3, 7, 11, 15);
      a(paramArrayOfInt, 0, 5, 10, 15);
      a(paramArrayOfInt, 1, 6, 11, 12);
      a(paramArrayOfInt, 2, 7, 8, 13);
      a(paramArrayOfInt, 3, 4, 9, 14);
    }
  }
  
  public static int[] e(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
    int[] arrayOfInt = new int[paramArrayOfByte.remaining()];
    paramArrayOfByte.get(arrayOfInt);
    return arrayOfInt;
  }
}

/* Location:
 * Qualified Name:     e3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */