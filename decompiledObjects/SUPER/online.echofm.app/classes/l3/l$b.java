package l3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class l$b
{
  public Integer a = null;
  public Integer b = null;
  public l.c c = null;
  public l.d d = l.d.e;
  
  public static void f(int paramInt, l.c paramc)
  {
    if (paramInt >= 10)
    {
      if (paramc == l.c.b)
      {
        if (paramInt <= 20) {
          return;
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[] { Integer.valueOf(paramInt) }));
      }
      if (paramc == l.c.c)
      {
        if (paramInt <= 28) {
          return;
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[] { Integer.valueOf(paramInt) }));
      }
      if (paramc == l.c.d)
      {
        if (paramInt <= 32) {
          return;
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[] { Integer.valueOf(paramInt) }));
      }
      if (paramc == l.c.e)
      {
        if (paramInt <= 48) {
          return;
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[] { Integer.valueOf(paramInt) }));
      }
      if (paramc == l.c.f)
      {
        if (paramInt <= 64) {
          return;
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[] { Integer.valueOf(paramInt) }));
      }
      throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
    }
    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[] { Integer.valueOf(paramInt) }));
  }
  
  public l a()
  {
    Integer localInteger = a;
    if (localInteger != null)
    {
      if (b != null)
      {
        if (c != null)
        {
          if (d != null)
          {
            if (localInteger.intValue() >= 16)
            {
              f(b.intValue(), c);
              return new l(a.intValue(), b.intValue(), d, c, null);
            }
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", new Object[] { a }));
          }
          throw new GeneralSecurityException("variant is not set");
        }
        throw new GeneralSecurityException("hash type is not set");
      }
      throw new GeneralSecurityException("tag size is not set");
    }
    throw new GeneralSecurityException("key size is not set");
  }
  
  public b b(l.c paramc)
  {
    c = paramc;
    return this;
  }
  
  public b c(int paramInt)
  {
    a = Integer.valueOf(paramInt);
    return this;
  }
  
  public b d(int paramInt)
  {
    b = Integer.valueOf(paramInt);
    return this;
  }
  
  public b e(l.d paramd)
  {
    d = paramd;
    return this;
  }
}

/* Location:
 * Qualified Name:     l3.l.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */