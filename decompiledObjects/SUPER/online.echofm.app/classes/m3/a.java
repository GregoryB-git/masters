package m3;

import java.util.Arrays;

public abstract class a
{
  public static byte[] a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length < 16)
    {
      byte[] arrayOfByte = Arrays.copyOf(paramArrayOfByte, 16);
      arrayOfByte[paramArrayOfByte.length] = ((byte)Byte.MIN_VALUE);
      return arrayOfByte;
    }
    throw new IllegalArgumentException("x must be smaller than a block.");
  }
  
  public static byte[] b(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length == 16)
    {
      byte[] arrayOfByte = new byte[16];
      for (int i = 0; i < 16; i++)
      {
        int j = (byte)(paramArrayOfByte[i] << 1 & 0xFE);
        arrayOfByte[i] = ((byte)j);
        if (i < 15) {
          arrayOfByte[i] = ((byte)(byte)((byte)(paramArrayOfByte[(i + 1)] >> 7 & 0x1) | j));
        }
      }
      i = arrayOfByte[15];
      arrayOfByte[15] = ((byte)(byte)((byte)(paramArrayOfByte[0] >> 7 & 0x87) ^ i));
      return arrayOfByte;
    }
    throw new IllegalArgumentException("value must be a block.");
  }
}

/* Location:
 * Qualified Name:     m3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */