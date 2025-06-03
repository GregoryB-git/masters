package q3;

import c3.a;
import e3.h;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class s
  implements a
{
  public final h a;
  
  public s(byte[] paramArrayOfByte)
  {
    a = new h(paramArrayOfByte);
  }
  
  public byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramArrayOfByte1.length + 40);
    byte[] arrayOfByte = p.c(24);
    localByteBuffer.put(arrayOfByte);
    a.b(localByteBuffer, arrayOfByte, paramArrayOfByte1, paramArrayOfByte2);
    return localByteBuffer.array();
  }
  
  public byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1.length >= 40)
    {
      byte[] arrayOfByte = Arrays.copyOf(paramArrayOfByte1, 24);
      paramArrayOfByte1 = ByteBuffer.wrap(paramArrayOfByte1, 24, paramArrayOfByte1.length - 24);
      return a.a(paramArrayOfByte1, arrayOfByte, paramArrayOfByte2);
    }
    throw new GeneralSecurityException("ciphertext too short");
  }
}

/* Location:
 * Qualified Name:     q3.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */