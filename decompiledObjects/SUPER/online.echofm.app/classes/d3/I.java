package d3;

import java.util.Objects;

public final class I
  extends c
{
  public final a a;
  
  public I(a parama)
  {
    a = parama;
  }
  
  public static I a(a parama)
  {
    return new I(parama);
  }
  
  public a b()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof I;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    if (((I)paramObject).b() == b()) {
      bool2 = true;
    }
    return bool2;
  }
  
  public int hashCode()
  {
    return Objects.hashCode(a);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("XChaCha20Poly1305 Parameters (variant: ");
    localStringBuilder.append(a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public static final a b = new a("TINK");
    public static final a c = new a("CRUNCHY");
    public static final a d = new a("NO_PREFIX");
    public final String a;
    
    public a(String paramString)
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
 * Qualified Name:     d3.I
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */