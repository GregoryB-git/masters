package d3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class v$b
{
  public Integer a = null;
  public v.c b = v.c.d;
  
  public v a()
  {
    Integer localInteger = a;
    if (localInteger != null)
    {
      if (b != null) {
        return new v(localInteger.intValue(), b, null);
      }
      throw new GeneralSecurityException("Variant is not set");
    }
    throw new GeneralSecurityException("Key size is not set");
  }
  
  public b b(int paramInt)
  {
    if ((paramInt != 16) && (paramInt != 32)) {
      throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", new Object[] { Integer.valueOf(paramInt) }));
    }
    a = Integer.valueOf(paramInt);
    return this;
  }
  
  public b c(v.c paramc)
  {
    b = paramc;
    return this;
  }
}

/* Location:
 * Qualified Name:     d3.v.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */