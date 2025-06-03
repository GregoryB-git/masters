package r4;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p4.a.b;
import p4.d;
import v5.u;

public final class b
  extends e9.a
{
  public static a C(u paramu)
  {
    String str1 = paramu.p();
    str1.getClass();
    String str2 = paramu.p();
    str2.getClass();
    return new a(str1, str2, paramu.o(), paramu.o(), Arrays.copyOfRange(a, b, c));
  }
  
  public final p4.a i(d paramd, ByteBuffer paramByteBuffer)
  {
    return new p4.a(new a.b[] { C(new u(paramByteBuffer.array(), paramByteBuffer.limit())) });
  }
}

/* Location:
 * Qualified Name:     r4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */