package eb;

import java.io.Serializable;
import n7.d;
import x6.b;

public final class s0$b<T>
  extends s0.d<T>
{
  public final s0.c<T> e;
  
  public s0$b(String paramString, s0.c paramc)
  {
    super(paramString, false, paramc);
    b.r(paramString.endsWith("-bin") ^ true, "ASCII header is named %s.  Only binary headers may end with %s", paramString, "-bin");
    b.y(paramc, "marshaller");
    e = paramc;
  }
  
  public final T a(byte[] paramArrayOfByte)
  {
    return (T)e.b(new String(paramArrayOfByte, d.a));
  }
  
  public final byte[] b(Serializable paramSerializable)
  {
    paramSerializable = e.a(paramSerializable);
    b.y(paramSerializable, "null marshaller.toAsciiString()");
    return paramSerializable.getBytes(d.a);
  }
}

/* Location:
 * Qualified Name:     eb.s0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */