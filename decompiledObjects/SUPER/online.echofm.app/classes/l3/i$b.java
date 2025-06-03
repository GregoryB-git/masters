package l3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.a;
import r3.b;

public class i$b
{
  public l a = null;
  public b b = null;
  public Integer c = null;
  
  public i a()
  {
    Object localObject = a;
    if ((localObject != null) && (b != null))
    {
      if (((l)localObject).d() == b.b())
      {
        if ((a.g()) && (c == null)) {
          throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if ((!a.g()) && (c != null)) {
          throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        localObject = b();
        return new i(a, b, (a)localObject, c, null);
      }
      throw new GeneralSecurityException("Key size mismatch");
    }
    throw new GeneralSecurityException("Cannot build without parameters and/or key material");
  }
  
  public final a b()
  {
    if (a.f() == l.d.e) {
      return a.a(new byte[0]);
    }
    if ((a.f() != l.d.d) && (a.f() != l.d.c))
    {
      if (a.f() == l.d.b) {
        return a.a(ByteBuffer.allocate(5).put((byte)1).putInt(c.intValue()).array());
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unknown HmacParameters.Variant: ");
      localStringBuilder.append(a.f());
      throw new IllegalStateException(localStringBuilder.toString());
    }
    return a.a(ByteBuffer.allocate(5).put((byte)0).putInt(c.intValue()).array());
  }
  
  public b c(Integer paramInteger)
  {
    c = paramInteger;
    return this;
  }
  
  public b d(b paramb)
  {
    b = paramb;
    return this;
  }
  
  public b e(l paraml)
  {
    a = paraml;
    return this;
  }
}

/* Location:
 * Qualified Name:     l3.i.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */