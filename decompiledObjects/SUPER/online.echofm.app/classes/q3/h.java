package q3;

import c3.a;
import c3.t;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class h
  implements a
{
  public final l a;
  public final t b;
  public final int c;
  
  public h(l paraml, t paramt, int paramInt)
  {
    a = paraml;
    b = paramt;
    c = paramInt;
  }
  
  public byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = a.a(paramArrayOfByte1);
    paramArrayOfByte1 = paramArrayOfByte2;
    if (paramArrayOfByte2 == null) {
      paramArrayOfByte1 = new byte[0];
    }
    paramArrayOfByte2 = Arrays.copyOf(ByteBuffer.allocate(8).putLong(paramArrayOfByte1.length * 8L).array(), 8);
    return f.a(new byte[][] { arrayOfByte, b.b(f.a(new byte[][] { paramArrayOfByte1, arrayOfByte, paramArrayOfByte2 })) });
  }
  
  public byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = paramArrayOfByte1.length;
    int j = c;
    if (i >= j)
    {
      byte[] arrayOfByte1 = Arrays.copyOfRange(paramArrayOfByte1, 0, paramArrayOfByte1.length - j);
      byte[] arrayOfByte2 = Arrays.copyOfRange(paramArrayOfByte1, paramArrayOfByte1.length - c, paramArrayOfByte1.length);
      paramArrayOfByte1 = paramArrayOfByte2;
      if (paramArrayOfByte2 == null) {
        paramArrayOfByte1 = new byte[0];
      }
      paramArrayOfByte2 = Arrays.copyOf(ByteBuffer.allocate(8).putLong(paramArrayOfByte1.length * 8L).array(), 8);
      b.a(arrayOfByte2, f.a(new byte[][] { paramArrayOfByte1, arrayOfByte1, paramArrayOfByte2 }));
      return a.b(arrayOfByte1);
    }
    throw new GeneralSecurityException("ciphertext too short");
  }
}

/* Location:
 * Qualified Name:     q3.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */