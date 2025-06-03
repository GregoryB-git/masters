package S5;

import E5.p;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class a$c
  extends p
{
  public static final c d = new c();
  
  public Object g(byte paramByte, ByteBuffer paramByteBuffer)
  {
    if (paramByte != Byte.MIN_VALUE) {
      return super.g(paramByte, paramByteBuffer);
    }
    return a.d.a((ArrayList)f(paramByteBuffer));
  }
  
  public void p(ByteArrayOutputStream paramByteArrayOutputStream, Object paramObject)
  {
    if ((paramObject instanceof a.d))
    {
      paramByteArrayOutputStream.write(128);
      p(paramByteArrayOutputStream, ((a.d)paramObject).h());
    }
    else
    {
      super.p(paramByteArrayOutputStream, paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     S5.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */