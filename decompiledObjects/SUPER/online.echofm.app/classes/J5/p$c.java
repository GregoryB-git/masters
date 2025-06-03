package J5;

import E5.p;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class p$c
  extends p
{
  public static final c d = new c();
  
  public Object g(byte paramByte, ByteBuffer paramByteBuffer)
  {
    if (paramByte != Byte.MIN_VALUE)
    {
      if (paramByte != -127) {
        return super.g(paramByte, paramByteBuffer);
      }
      return p.e.a((ArrayList)f(paramByteBuffer));
    }
    return p.d.a((ArrayList)f(paramByteBuffer));
  }
  
  public void p(ByteArrayOutputStream paramByteArrayOutputStream, Object paramObject)
  {
    if ((paramObject instanceof p.d)) {
      paramByteArrayOutputStream.write(128);
    }
    for (paramObject = ((p.d)paramObject).w();; paramObject = ((p.e)paramObject).f())
    {
      p(paramByteArrayOutputStream, paramObject);
      return;
      if (!(paramObject instanceof p.e)) {
        break;
      }
      paramByteArrayOutputStream.write(129);
    }
    super.p(paramByteArrayOutputStream, paramObject);
  }
}

/* Location:
 * Qualified Name:     J5.p.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */