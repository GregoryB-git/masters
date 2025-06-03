package q3;

import c3.a;
import e3.b;
import h3.b.b;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class c
  implements a
{
  public static final b.b b = b.b.p;
  public final b a;
  
  public c(byte[] paramArrayOfByte)
  {
    if (b.c())
    {
      a = new b(paramArrayOfByte, true);
      return;
    }
    throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
  }
  
  public byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = p.c(12);
    return a.b(arrayOfByte, paramArrayOfByte1, paramArrayOfByte2);
  }
  
  public byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = Arrays.copyOf(paramArrayOfByte1, 12);
    return a.a(arrayOfByte, paramArrayOfByte1, paramArrayOfByte2);
  }
}

/* Location:
 * Qualified Name:     q3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */