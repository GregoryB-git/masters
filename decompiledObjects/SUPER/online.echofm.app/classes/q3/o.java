package q3;

import c3.t;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import o3.a;

public class o
  implements t
{
  public final a a;
  public final int b;
  
  public o(a parama, int paramInt)
  {
    a = parama;
    b = paramInt;
    if (paramInt >= 10)
    {
      parama.a(new byte[0], paramInt);
      return;
    }
    throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
  }
  
  public void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (f.b(b(paramArrayOfByte2), paramArrayOfByte1)) {
      return;
    }
    throw new GeneralSecurityException("invalid MAC");
  }
  
  public byte[] b(byte[] paramArrayOfByte)
  {
    return a.a(paramArrayOfByte, b);
  }
}

/* Location:
 * Qualified Name:     q3.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */