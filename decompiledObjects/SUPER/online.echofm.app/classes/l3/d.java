package l3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

public final class d
  extends q
{
  public final int a;
  public final int b;
  public final c c;
  
  public d(int paramInt1, int paramInt2, c paramc)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramc;
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
    c localc = c;
    if (localc == c.e) {
      return b();
    }
    if (localc == c.b) {}
    while ((localc == c.c) || (localc == c.d)) {
      return b() + 5;
    }
    throw new IllegalStateException("Unknown variant");
  }
  
  public c e()
  {
    return c;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof d;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (d)paramObject;
    bool1 = bool2;
    if (((d)paramObject).c() == c())
    {
      bool1 = bool2;
      if (((d)paramObject).d() == d())
      {
        bool1 = bool2;
        if (((d)paramObject).e() == e()) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public boolean f()
  {
    boolean bool;
    if (c != c.e) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return Objects.hash(new Object[] { Integer.valueOf(a), Integer.valueOf(b), c });
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AES-CMAC Parameters (variant: ");
    localStringBuilder.append(c);
    localStringBuilder.append(", ");
    localStringBuilder.append(b);
    localStringBuilder.append("-byte tags, and ");
    localStringBuilder.append(a);
    localStringBuilder.append("-byte key)");
    return localStringBuilder.toString();
  }
  
  public static final class b
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
  
  public static final class c
  {
    public static final c b = new c("TINK");
    public static final c c = new c("CRUNCHY");
    public static final c d = new c("LEGACY");
    public static final c e = new c("NO_PREFIX");
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
 * Qualified Name:     l3.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */