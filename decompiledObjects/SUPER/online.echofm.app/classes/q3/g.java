package q3;

import c3.a;
import e3.e;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class g
  implements a
{
  public final e a;
  
  public g(byte[] paramArrayOfByte)
  {
    a = new e(paramArrayOfByte);
  }
  
  public byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramArrayOfByte1.length + 28);
    byte[] arrayOfByte = p.c(12);
    localByteBuffer.put(arrayOfByte);
    a.b(localByteBuffer, arrayOfByte, paramArrayOfByte1, paramArrayOfByte2);
    return localByteBuffer.array();
  }
  
  public byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1.length >= 28)
    {
      byte[] arrayOfByte = Arrays.copyOf(paramArrayOfByte1, 12);
      paramArrayOfByte1 = ByteBuffer.wrap(paramArrayOfByte1, 12, paramArrayOfByte1.length - 12);
      return a.a(paramArrayOfByte1, arrayOfByte, paramArrayOfByte2);
    }
    throw new GeneralSecurityException("ciphertext too short");
  }
}

/* Location:
 * Qualified Name:     q3.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */