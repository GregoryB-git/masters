package d3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.a;
import r3.b;

public class g$b
{
  public i a = null;
  public b b = null;
  public Integer c = null;
  
  public g a()
  {
    Object localObject = a;
    if ((localObject != null) && (b != null))
    {
      if (((i)localObject).c() == b.b())
      {
        if ((a.f()) && (c == null)) {
          throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if ((!a.f()) && (c != null)) {
          throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        localObject = b();
        return new g(a, b, (a)localObject, c, null);
      }
      throw new GeneralSecurityException("Key size mismatch");
    }
    throw new GeneralSecurityException("Cannot build without parameters and/or key material");
  }
  
  public final a b()
  {
    if (a.e() == i.c.d) {
      return a.a(new byte[0]);
    }
    if (a.e() == i.c.c) {
      return a.a(ByteBuffer.allocate(5).put((byte)0).putInt(c.intValue()).array());
    }
    if (a.e() == i.c.b) {
      return a.a(ByteBuffer.allocate(5).put((byte)1).putInt(c.intValue()).array());
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unknown AesEaxParameters.Variant: ");
    localStringBuilder.append(a.e());
    throw new IllegalStateException(localStringBuilder.toString());
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
  
  public b e(i parami)
  {
    a = parami;
    return this;
  }
}

/* Location:
 * Qualified Name:     d3.g.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */