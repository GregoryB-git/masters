package d3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

public final class v
  extends c
{
  public final int a;
  public final c b;
  
  public v(int paramInt, c paramc)
  {
    a = paramInt;
    b = paramc;
  }
  
  public static b a()
  {
    return new b(null);
  }
  
  public int b()
  {
    return a;
  }
  
  public c c()
  {
    return b;
  }
  
  public boolean d()
  {
    boolean bool;
    if (b != c.d) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof v;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (v)paramObject;
    bool1 = bool2;
    if (((v)paramObject).b() == b())
    {
      bool1 = bool2;
      if (((v)paramObject).c() == c()) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    return Objects.hash(new Object[] { Integer.valueOf(a), b });
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AesGcmSiv Parameters (variant: ");
    localStringBuilder.append(b);
    localStringBuilder.append(", ");
    localStringBuilder.append(a);
    localStringBuilder.append("-byte key)");
    return localStringBuilder.toString();
  }
  
  public static final class b
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
 * Qualified Name:     d3.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */