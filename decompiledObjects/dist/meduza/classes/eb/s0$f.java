package eb;

import java.io.Serializable;
import x6.b;

public final class s0$f<T>
  extends s0.d<T>
{
  public final s0.g<T> e;
  
  public s0$f(String paramString, boolean paramBoolean, s0.g paramg)
  {
    super(paramString, paramBoolean, paramg);
    b.r(paramString.endsWith("-bin") ^ true, "ASCII header is named %s.  Only binary headers may end with %s", paramString, "-bin");
    e = paramg;
  }
  
  public final T a(byte[] paramArrayOfByte)
  {
    return (T)e.b(paramArrayOfByte);
  }
  
  public final byte[] b(Serializable paramSerializable)
  {
    paramSerializable = e.a(paramSerializable);
    b.y(paramSerializable, "null marshaller.toAsciiString()");
    return paramSerializable;
  }
}

/* Location:
 * Qualified Name:     eb.s0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */