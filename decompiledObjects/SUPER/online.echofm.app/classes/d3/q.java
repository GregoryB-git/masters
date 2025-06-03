package d3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

public final class q
  extends c
{
  public final int a;
  public final int b;
  public final int c;
  public final c d;
  
  public q(int paramInt1, int paramInt2, int paramInt3, c paramc)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
    d = paramc;
  }
  
  public static b a()
  {
    return new b(null);
  }
  
  public int b()
  {
    return b;
  }
  
  public int c()
  {
    return a;
  }
  
  public int d()
  {
    return c;
  }
  
  public c e()
  {
    return d;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof q;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (q)paramObject;
    bool1 = bool2;
    if (((q)paramObject).c() == c())
    {
      bool1 = bool2;
      if (((q)paramObject).b() == b())
      {
        bool1 = bool2;
        if (((q)paramObject).d() == d())
        {
          bool1 = bool2;
          if (((q)paramObject).e() == e()) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public boolean f()
  {
    boolean bool;
    if (d != c.d) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return Objects.hash(new Object[] { Integer.valueOf(a), Integer.valueOf(b), Integer.valueOf(c), d });
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AesGcm Parameters (variant: ");
    localStringBuilder.append(d);
    localStringBuilder.append(", ");
    localStringBuilder.append(b);
    localStringBuilder.append("-byte IV, ");
    localStringBuilder.append(c);
    localStringBuilder.append("-byte tag, and ");
    localStringBuilder.append(a);
    localStringBuilder.append("-byte key)");
    return localStringBuilder.toString();
  }
  
  public static final class b
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
  
  public static final class c
  {
    public static final c b = new c("TINK");
    public static final c c = new c("CRUNCHY");
    public static final c d = new c("NO_PREFIX");
    public final String a;
    
    public c(String paramString)
    {
      a = paramString;
    }
    
    public String toString()
    {
      return a;
    }
  }
}

/* Location:
 * Qualified Name:     d3.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */