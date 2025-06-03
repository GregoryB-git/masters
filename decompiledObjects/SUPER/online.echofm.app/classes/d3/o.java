package d3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.a;

public final class o
  extends b
{
  public final q a;
  public final r3.b b;
  public final a c;
  public final Integer d;
  
  public o(q paramq, r3.b paramb, a parama, Integer paramInteger)
  {
    a = paramq;
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
    public q a = null;
    public r3.b b = null;
    public Integer c = null;
    
    public o a()
    {
      Object localObject = a;
      if ((localObject != null) && (b != null))
      {
        if (((q)localObject).c() == b.b())
        {
          if ((a.f()) && (c == null)) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
          }
          if ((!a.f()) && (c != null)) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
          }
          localObject = b();
          return new o(a, b, (a)localObject, c, null);
        }
        throw new GeneralSecurityException("Key size mismatch");
      }
      throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }
    
    public final a b()
    {
      if (a.e() == q.c.d) {
        return a.a(new byte[0]);
      }
      if (a.e() == q.c.c) {
        return a.a(ByteBuffer.allocate(5).put((byte)0).putInt(c.intValue()).array());
      }
      if (a.e() == q.c.b) {
        return a.a(ByteBuffer.allocate(5).put((byte)1).putInt(c.intValue()).array());
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unknown AesGcmParameters.Variant: ");
      localStringBuilder.append(a.e());
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
    
    public b e(q paramq)
    {
      a = paramq;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     d3.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */