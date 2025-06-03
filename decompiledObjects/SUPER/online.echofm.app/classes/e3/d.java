package e3;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import q3.f;

public abstract class d
{
  public int[] a;
  public final int b;
  
  public d(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramArrayOfByte.length == 32)
    {
      a = a.e(paramArrayOfByte);
      b = paramInt;
      return;
    }
    throw new InvalidKeyException("The key length in bytes must be 32.");
  }
  
  public ByteBuffer a(byte[] paramArrayOfByte, int paramInt)
  {
    paramArrayOfByte = b(a.e(paramArrayOfByte), paramInt);
    Object localObject = (int[])paramArrayOfByte.clone();
    a.d((int[])localObject);
    for (paramInt = 0; paramInt < paramArrayOfByte.length; paramInt++) {
      paramArrayOfByte[paramInt] += localObject[paramInt];
    }
    localObject = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
    ((ByteBuffer)localObject).asIntBuffer().put(paramArrayOfByte, 0, 16);
    return (ByteBuffer)localObject;
  }
  
  public abstract int[] b(int[] paramArrayOfInt, int paramInt);
  
  public byte[] c(byte[] paramArrayOfByte, ByteBuffer paramByteBuffer)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramByteBuffer.remaining());
    f(paramArrayOfByte, localByteBuffer, paramByteBuffer);
    return localByteBuffer.array();
  }
  
  public void d(ByteBuffer paramByteBuffer, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramByteBuffer.remaining() >= paramArrayOfByte2.length)
    {
      f(paramArrayOfByte1, paramByteBuffer, ByteBuffer.wrap(paramArrayOfByte2));
      return;
    }
    throw new IllegalArgumentException("Given ByteBuffer output is too small");
  }
  
  public abstract int e();
  
  public final void f(byte[] paramArrayOfByte, ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2)
  {
    if (paramArrayOfByte.length == e())
    {
      int i = paramByteBuffer2.remaining();
      int j = i / 64;
      for (int k = 0; k < j + 1; k++)
      {
        ByteBuffer localByteBuffer = a(paramArrayOfByte, b + k);
        int m = 64;
        if (k == j) {
          m = i % 64;
        }
        f.c(paramByteBuffer1, paramByteBuffer2, localByteBuffer, m);
      }
      return;
    }
    paramArrayOfByte = new StringBuilder();
    paramArrayOfByte.append("The nonce length (in bytes) must be ");
    paramArrayOfByte.append(e());
    throw new GeneralSecurityException(paramArrayOfByte.toString());
  }
}

/* Location:
 * Qualified Name:     e3.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */