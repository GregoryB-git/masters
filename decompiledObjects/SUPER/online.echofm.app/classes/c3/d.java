package c3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p3.C.c;

public abstract class d
{
  public static final byte[] a = new byte[0];
  
  public static byte[] a(C.c paramc)
  {
    int i = a.a[paramc.b0().ordinal()];
    if ((i != 1) && (i != 2)) {
      if (i != 3)
      {
        if (i == 4) {
          return a;
        }
        throw new GeneralSecurityException("unknown output prefix type");
      }
    }
    for (ByteBuffer localByteBuffer = ByteBuffer.allocate(5).put((byte)1);; localByteBuffer = ByteBuffer.allocate(5).put((byte)0)) {
      return localByteBuffer.putInt(paramc.a0()).array();
    }
  }
}

/* Location:
 * Qualified Name:     c3.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */