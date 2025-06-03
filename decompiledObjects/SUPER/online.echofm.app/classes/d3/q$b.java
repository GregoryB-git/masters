package d3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class q$b
{
  public Integer a = null;
  public Integer b = null;
  public Integer c = null;
  public q.c d = q.c.d;
  
  public q a()
  {
    Integer localInteger = a;
    if (localInteger != null)
    {
      if (d != null)
      {
        if (b != null)
        {
          if (c != null) {
            return new q(localInteger.intValue(), b.intValue(), c.intValue(), d, null);
          }
          throw new GeneralSecurityException("Tag size is not set");
        }
        throw new GeneralSecurityException("IV size is not set");
      }
      throw new GeneralSecurityException("Variant is not set");
    }
    throw new GeneralSecurityException("Key size is not set");
  }
  
  public b b(int paramInt)
  {
    if (paramInt > 0)
    {
      b = Integer.valueOf(paramInt);
      return this;
    }
    throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", new Object[] { Integer.valueOf(paramInt) }));
  }
  
  public b c(int paramInt)
  {
    if ((paramInt != 16) && (paramInt != 24) && (paramInt != 32)) {
      throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[] { Integer.valueOf(paramInt) }));
    }
    a = Integer.valueOf(paramInt);
    return this;
  }
  
  public b d(int paramInt)
  {
    if ((paramInt != 12) && (paramInt != 13) && (paramInt != 14) && (paramInt != 15) && (paramInt != 16)) {
      throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be one of the following: 12, 13, 14, 15 or 16 bytes", new Object[] { Integer.valueOf(paramInt) }));
    }
    c = Integer.valueOf(paramInt);
    return this;
  }
  
  public b e(q.c paramc)
  {
    d = paramc;
    return this;
  }
}

/* Location:
 * Qualified Name:     d3.q.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */