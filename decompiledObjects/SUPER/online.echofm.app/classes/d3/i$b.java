package d3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class i$b
{
  public Integer a = null;
  public Integer b = null;
  public Integer c = null;
  public i.c d = i.c.d;
  
  public i a()
  {
    Integer localInteger = a;
    if (localInteger != null)
    {
      if (b != null)
      {
        if (d != null)
        {
          if (c != null) {
            return new i(localInteger.intValue(), b.intValue(), c.intValue(), d, null);
          }
          throw new GeneralSecurityException("Tag size is not set");
        }
        throw new GeneralSecurityException("Variant is not set");
      }
      throw new GeneralSecurityException("IV size is not set");
    }
    throw new GeneralSecurityException("Key size is not set");
  }
  
  public b b(int paramInt)
  {
    if ((paramInt != 12) && (paramInt != 16)) {
      throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", new Object[] { Integer.valueOf(paramInt) }));
    }
    b = Integer.valueOf(paramInt);
    return this;
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
    if ((paramInt >= 0) && (paramInt <= 16))
    {
      c = Integer.valueOf(paramInt);
      return this;
    }
    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", new Object[] { Integer.valueOf(paramInt) }));
  }
  
  public b e(i.c paramc)
  {
    d = paramc;
    return this;
  }
}

/* Location:
 * Qualified Name:     d3.i.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */