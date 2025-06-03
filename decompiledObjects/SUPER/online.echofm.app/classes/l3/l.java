package l3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

public final class l
  extends q
{
  public final int a;
  public final int b;
  public final d c;
  public final c d;
  
  public l(int paramInt1, int paramInt2, d paramd, c paramc)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramd;
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
  
  public c c()
  {
    return d;
  }
  
  public int d()
  {
    return a;
  }
  
  public int e()
  {
    d locald = c;
    if (locald == d.e) {
      return b();
    }
    if (locald == d.b) {}
    while ((locald == d.c) || (locald == d.d)) {
      return b() + 5;
    }
    throw new IllegalStateException("Unknown variant");
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof l;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (l)paramObject;
    bool1 = bool2;
    if (((l)paramObject).d() == d())
    {
      bool1 = bool2;
      if (((l)paramObject).e() == e())
      {
        bool1 = bool2;
        if (((l)paramObject).f() == f())
        {
          bool1 = bool2;
          if (((l)paramObject).c() == c()) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public d f()
  {
    return c;
  }
  
  public boolean g()
  {
    boolean bool;
    if (c != d.e) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return Objects.hash(new Object[] { Integer.valueOf(a), Integer.valueOf(b), c, d });
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("HMAC Parameters (variant: ");
    localStringBuilder.append(c);
    localStringBuilder.append(", hashType: ");
    localStringBuilder.append(d);
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
  
  public static final class c
  {
    public static final c b = new c("SHA1");
    public static final c c = new c("SHA224");
    public static final c d = new c("SHA256");
    public static final c e = new c("SHA384");
    public static final c f = new c("SHA512");
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
  
  public static final class d
  {
    public static final d b = new d("TINK");
    public static final d c = new d("CRUNCHY");
    public static final d d = new d("LEGACY");
    public static final d e = new d("NO_PREFIX");
    public final String a;
    
    public d(String paramString)
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
 * Qualified Name:     l3.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */