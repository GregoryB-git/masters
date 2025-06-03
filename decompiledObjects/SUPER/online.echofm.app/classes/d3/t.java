package d3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.a;

public final class t
  extends b
{
  public final v a;
  public final r3.b b;
  public final a c;
  public final Integer d;
  
  public t(v paramv, r3.b paramb, a parama, Integer paramInteger)
  {
    a = paramv;
    b = paramb;
    c = parama;
    d = paramInteger;
  }
  
  public static b a()
  {
    return new b(null);
  }
  
  public static class b
  {
    public v a = null;
    public r3.b b = null;
    public Integer c = null;
    
    public t a()
    {
      Object localObject = a;
      if ((localObject != null) && (b != null))
      {
        if (((v)localObject).b() == b.b())
        {
          if ((a.d()) && (c == null)) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
          }
          if ((!a.d()) && (c != null)) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
          }
          localObject = b();
          return new t(a, b, (a)localObject, c, null);
        }
        throw new GeneralSecurityException("Key size mismatch");
      }
      throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }
    
    public final a b()
    {
      if (a.c() == v.c.d) {
        return a.a(new byte[0]);
      }
      if (a.c() == v.c.c) {
        return a.a(ByteBuffer.allocate(5).put((byte)0).putInt(c.intValue()).array());
      }
      if (a.c() == v.c.b) {
        return a.a(ByteBuffer.allocate(5).put((byte)1).putInt(c.intValue()).array());
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unknown AesGcmSivParameters.Variant: ");
      localStringBuilder.append(a.c());
      throw new IllegalStateException(localStringBuilder.toString());
    }
    
    public b c(Integer paramInteger)
    {
      c = paramInteger;
      return this;
    }
    
    public b d(r3.b paramb)
    {
      b = paramb;
      return this;
    }
    
    public b e(v paramv)
    {
      a = paramv;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     d3.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */