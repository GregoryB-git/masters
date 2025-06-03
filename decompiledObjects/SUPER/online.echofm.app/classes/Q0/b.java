package Q0;

import O0.c;
import d0.x;
import d0.x.b;
import g0.z;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class b
  extends c
{
  public x b(O0.b paramb, ByteBuffer paramByteBuffer)
  {
    return new x(new x.b[] { c(new z(paramByteBuffer.array(), paramByteBuffer.limit())) });
  }
  
  public a c(z paramz)
  {
    return new a((String)g0.a.e(paramz.A()), (String)g0.a.e(paramz.A()), paramz.z(), paramz.z(), Arrays.copyOfRange(paramz.e(), paramz.f(), paramz.g()));
  }
}

/* Location:
 * Qualified Name:     Q0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */