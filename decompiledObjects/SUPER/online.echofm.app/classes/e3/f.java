package e3;

import h3.b.b;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

public abstract class f
{
  public static final b.b c = b.b.o;
  public final d a;
  public final d b;
  
  public f(byte[] paramArrayOfByte)
  {
    if (c.c())
    {
      a = e(paramArrayOfByte, 1);
      b = e(paramArrayOfByte, 0);
      return;
    }
    throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
  }
  
  public static byte[] d(byte[] paramArrayOfByte, ByteBuffer paramByteBuffer)
  {
    int i;
    if (paramArrayOfByte.length % 16 == 0) {
      i = paramArrayOfByte.length;
    } else {
      i = paramArrayOfByte.length + 16 - paramArrayOfByte.length % 16;
    }
    int j = paramByteBuffer.remaining();
    int k = j % 16;
    if (k == 0) {
      k = j;
    } else {
      k = j + 16 - k;
    }
    k += i;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(k + 16).order(ByteOrder.LITTLE_ENDIAN);
    localByteBuffer.put(paramArrayOfByte);
    localByteBuffer.position(i);
    localByteBuffer.put(paramByteBuffer);
    localByteBuffer.position(k);
    localByteBuffer.putLong(paramArrayOfByte.length);
    localByteBuffer.putLong(j);
    return localByteBuffer.array();
  }
  
  public byte[] a(ByteBuffer paramByteBuffer, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramByteBuffer.remaining() >= 16)
    {
      int i = paramByteBuffer.position();
      byte[] arrayOfByte1 = new byte[16];
      paramByteBuffer.position(paramByteBuffer.limit() - 16);
      paramByteBuffer.get(arrayOfByte1);
      paramByteBuffer.position(i);
      paramByteBuffer.limit(paramByteBuffer.limit() - 16);
      byte[] arrayOfByte2 = paramArrayOfByte2;
      if (paramArrayOfByte2 == null) {
        arrayOfByte2 = new byte[0];
      }
      try
      {
        i.f(c(paramArrayOfByte1), d(arrayOfByte2, paramByteBuffer), arrayOfByte1);
        paramByteBuffer.position(i);
        return a.c(paramArrayOfByte1, paramByteBuffer);
      }
      catch (GeneralSecurityException paramByteBuffer)
      {
        throw new AEADBadTagException(paramByteBuffer.toString());
      }
    }
    throw new GeneralSecurityException("ciphertext too short");
  }
  
  public void b(ByteBuffer paramByteBuffer, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
  {
    if (paramByteBuffer.remaining() >= paramArrayOfByte2.length + 16)
    {
      int i = paramByteBuffer.position();
      a.d(paramByteBuffer, paramArrayOfByte1, paramArrayOfByte2);
      paramByteBuffer.position(i);
      paramByteBuffer.limit(paramByteBuffer.limit() - 16);
      paramArrayOfByte2 = paramArrayOfByte3;
      if (paramArrayOfByte3 == null) {
        paramArrayOfByte2 = new byte[0];
      }
      paramArrayOfByte1 = i.a(c(paramArrayOfByte1), d(paramArrayOfByte2, paramByteBuffer));
      paramByteBuffer.limit(paramByteBuffer.limit() + 16);
      paramByteBuffer.put(paramArrayOfByte1);
      return;
    }
    throw new IllegalArgumentException("Given ByteBuffer output is too small");
  }
  
  public final byte[] c(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = b.a(paramArrayOfByte, 0);
    paramArrayOfByte = new byte[32];
    localByteBuffer.get(paramArrayOfByte);
    return paramArrayOfByte;
  }
  
  public abstract d e(byte[] paramArrayOfByte, int paramInt);
}

/* Location:
 * Qualified Name:     e3.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */