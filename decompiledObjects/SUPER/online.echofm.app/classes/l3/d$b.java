package l3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class d$b
{
  public Integer a = null;
  public Integer b = null;
  public d.c c = d.c.e;
  
  public d a()
  {
    Integer localInteger = a;
    if (localInteger != null)
    {
      if (b != null)
      {
        if (c != null) {
          return new d(localInteger.intValue(), b.intValue(), c, null);
        }
        throw new GeneralSecurityException("variant not set");
      }
      throw new GeneralSecurityException("tag size not set");
    }
    throw new GeneralSecurityException("key size not set");
  }
  
  public b b(int paramInt)
  {
    if ((paramInt != 16) && (paramInt != 32)) {
      throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[] { Integer.valueOf(paramInt * 8) }));
    }
    a = Integer.valueOf(paramInt);
    return this;
  }
  
  public b c(int paramInt)
  {
    if ((paramInt >= 10) && (16 >= paramInt))
    {
      b = Integer.valueOf(paramInt);
      return this;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Invalid tag size for AesCmacParameters: ");
    localStringBuilder.append(paramInt);
    throw new GeneralSecurityException(localStringBuilder.toString());
  }
  
  public b d(d.c paramc)
  {
    c = paramc;
    return this;
  }
}

/* Location:
 * Qualified Name:     l3.d.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */