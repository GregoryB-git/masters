package l3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.b;

public class a$b
{
  public d a = null;
  public b b = null;
  public Integer c = null;
  
  public a a()
  {
    Object localObject = a;
    if ((localObject != null) && (b != null))
    {
      if (((d)localObject).c() == b.b())
      {
        if ((a.f()) && (c == null)) {
          throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if ((!a.f()) && (c != null)) {
          throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        localObject = b();
        return new a(a, b, (r3.a)localObject, c, null);
      }
      throw new GeneralSecurityException("Key size mismatch");
    }
    throw new GeneralSecurityException("Cannot build without parameters and/or key material");
  }
  
  public final r3.a b()
  {
    if (a.e() == d.c.e) {
      return r3.a.a(new byte[0]);
    }
    if ((a.e() != d.c.d) && (a.e() != d.c.c))
    {
      if (a.e() == d.c.b) {
        return r3.a.a(ByteBuffer.allocate(5).put((byte)1).putInt(c.intValue()).array());
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unknown AesCmacParametersParameters.Variant: ");
      localStringBuilder.append(a.e());
      throw new IllegalStateException(localStringBuilder.toString());
    }
    return r3.a.a(ByteBuffer.allocate(5).put((byte)0).putInt(c.intValue()).array());
  }
  
  public b c(b paramb)
  {
    b = paramb;
    return this;
  }
  
  public b d(Integer paramInteger)
  {
    c = paramInteger;
    return this;
  }
  
  public b e(d paramd)
  {
    a = paramd;
    return this;
  }
}

/* Location:
 * Qualified Name:     l3.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */