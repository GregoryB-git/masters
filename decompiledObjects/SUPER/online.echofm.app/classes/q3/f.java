package q3;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

public abstract class f
{
  public static byte[] a(byte[]... paramVarArgs)
  {
    int i = paramVarArgs.length;
    int j = 0;
    int k = j;
    byte[] arrayOfByte1;
    while (j < i)
    {
      arrayOfByte1 = paramVarArgs[j];
      if (k <= Integer.MAX_VALUE - arrayOfByte1.length)
      {
        k += arrayOfByte1.length;
        j++;
      }
      else
      {
        throw new GeneralSecurityException("exceeded size limit");
      }
    }
    byte[] arrayOfByte2 = new byte[k];
    i = paramVarArgs.length;
    j = 0;
    k = j;
    while (j < i)
    {
      arrayOfByte1 = paramVarArgs[j];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, k, arrayOfByte1.length);
      k += arrayOfByte1.length;
      j++;
    }
    return arrayOfByte2;
  }
  
  public static final boolean b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    return MessageDigest.isEqual(paramArrayOfByte1, paramArrayOfByte2);
  }
  
  public static final void c(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2, ByteBuffer paramByteBuffer3, int paramInt)
  {
    if ((paramInt >= 0) && (paramByteBuffer2.remaining() >= paramInt) && (paramByteBuffer3.remaining() >= paramInt) && (paramByteBuffer1.remaining() >= paramInt))
    {
      for (int i = 0; i < paramInt; i++) {
        paramByteBuffer1.put((byte)(paramByteBuffer2.get() ^ paramByteBuffer3.get()));
      }
      return;
    }
    throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
  }
  
  public static final byte[] d(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    if ((paramInt3 >= 0) && (paramArrayOfByte1.length - paramInt3 >= paramInt1) && (paramArrayOfByte2.length - paramInt3 >= paramInt2))
    {
      byte[] arrayOfByte = new byte[paramInt3];
      for (int i = 0; i < paramInt3; i++) {
        arrayOfByte[i] = ((byte)(byte)(paramArrayOfByte1[(i + paramInt1)] ^ paramArrayOfByte2[(i + paramInt2)]));
      }
      return arrayOfByte;
    }
    throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
  }
  
  public static final byte[] e(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1.length == paramArrayOfByte2.length) {
      return d(paramArrayOfByte1, 0, paramArrayOfByte2, 0, paramArrayOfByte1.length);
    }
    throw new IllegalArgumentException("The lengths of x and y should match.");
  }
  
  public static final byte[] f(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1.length >= paramArrayOfByte2.length)
    {
      int i = paramArrayOfByte1.length;
      int j = paramArrayOfByte2.length;
      paramArrayOfByte1 = Arrays.copyOf(paramArrayOfByte1, paramArrayOfByte1.length);
      for (int k = 0; k < paramArrayOfByte2.length; k++)
      {
        int m = i - j + k;
        paramArrayOfByte1[m] = ((byte)(byte)(paramArrayOfByte1[m] ^ paramArrayOfByte2[k]));
      }
      return paramArrayOfByte1;
    }
    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
  }
}

/* Location:
 * Qualified Name:     q3.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */