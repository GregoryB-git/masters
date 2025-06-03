package e3;

import java.util.Arrays;

public class g
  extends d
{
  public g(byte[] paramArrayOfByte, int paramInt)
  {
    super(paramArrayOfByte, paramInt);
  }
  
  public static int[] g(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    int[] arrayOfInt = new int[16];
    a.c(arrayOfInt, paramArrayOfInt1);
    arrayOfInt[12] = paramArrayOfInt2[0];
    arrayOfInt[13] = paramArrayOfInt2[1];
    arrayOfInt[14] = paramArrayOfInt2[2];
    arrayOfInt[15] = paramArrayOfInt2[3];
    a.d(arrayOfInt);
    arrayOfInt[4] = arrayOfInt[12];
    arrayOfInt[5] = arrayOfInt[13];
    arrayOfInt[6] = arrayOfInt[14];
    arrayOfInt[7] = arrayOfInt[15];
    return Arrays.copyOf(arrayOfInt, 8);
  }
  
  public int[] b(int[] paramArrayOfInt, int paramInt)
  {
    if (paramArrayOfInt.length == e() / 4)
    {
      int[] arrayOfInt = new int[16];
      a.c(arrayOfInt, g(a, paramArrayOfInt));
      arrayOfInt[12] = paramInt;
      arrayOfInt[13] = 0;
      arrayOfInt[14] = paramArrayOfInt[4];
      arrayOfInt[15] = paramArrayOfInt[5];
      return arrayOfInt;
    }
    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[] { Integer.valueOf(paramArrayOfInt.length * 32) }));
  }
  
  public int e()
  {
    return 24;
  }
}

/* Location:
 * Qualified Name:     e3.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */