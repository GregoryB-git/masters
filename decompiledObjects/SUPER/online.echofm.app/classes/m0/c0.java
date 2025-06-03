package m0;

import F0.K;
import e0.b;
import g0.M;
import g0.a;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

public final class c0
{
  public static final byte[] d = { 79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0 };
  public static final byte[] e = { 79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0 };
  public ByteBuffer a = b.a;
  public int b = 2;
  public int c = 0;
  
  public void a(j0.i parami, List paramList)
  {
    a.e(r);
    if (r.limit() - r.position() == 0) {
      return;
    }
    if ((b == 2) && ((paramList.size() == 1) || (paramList.size() == 3))) {
      paramList = (byte[])paramList.get(0);
    } else {
      paramList = null;
    }
    a = b(r, paramList);
    parami.m();
    parami.z(a.remaining());
    r.put(a);
    parami.C();
  }
  
  public final ByteBuffer b(ByteBuffer paramByteBuffer, byte[] paramArrayOfByte)
  {
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.limit();
    int k = j - i;
    int m = (k + 255) / 255;
    int n = m + 27 + k;
    if (b == 2)
    {
      if (paramArrayOfByte != null) {
        i1 = paramArrayOfByte.length + 28;
      } else {
        i1 = d.length;
      }
      n += e.length + i1;
      i2 = i1;
      i1 = n;
    }
    else
    {
      i2 = 0;
      i1 = n;
    }
    ByteBuffer localByteBuffer = c(i1);
    if (b == 2)
    {
      if (paramArrayOfByte != null) {
        e(localByteBuffer, paramArrayOfByte);
      } else {
        localByteBuffer.put(d);
      }
      localByteBuffer.put(e);
    }
    int i1 = K.j(paramByteBuffer);
    i1 = c + i1;
    c = i1;
    f(localByteBuffer, i1, b, m, false);
    n = 0;
    i1 = k;
    for (k = n;; k++)
    {
      n = i;
      if (k >= m) {
        break;
      }
      if (i1 >= 255)
      {
        localByteBuffer.put((byte)-1);
        i1 -= 255;
      }
      else
      {
        localByteBuffer.put((byte)i1);
        i1 = 0;
      }
    }
    while (n < j)
    {
      localByteBuffer.put(paramByteBuffer.get(n));
      n++;
    }
    paramByteBuffer.position(paramByteBuffer.limit());
    localByteBuffer.flip();
    i1 = b;
    k = 22;
    if (i1 == 2)
    {
      paramArrayOfByte = localByteBuffer.array();
      i1 = localByteBuffer.arrayOffset();
      paramByteBuffer = e;
      i1 = M.x(paramArrayOfByte, i1 + i2 + paramByteBuffer.length, localByteBuffer.limit() - localByteBuffer.position(), 0);
    }
    for (int i2 = i2 + paramByteBuffer.length + 22;; i2 = k)
    {
      localByteBuffer.putInt(i2, i1);
      break;
      i1 = M.x(localByteBuffer.array(), localByteBuffer.arrayOffset(), localByteBuffer.limit() - localByteBuffer.position(), 0);
    }
    b += 1;
    return localByteBuffer;
  }
  
  public final ByteBuffer c(int paramInt)
  {
    if (a.capacity() < paramInt) {
      a = ByteBuffer.allocate(paramInt).order(ByteOrder.LITTLE_ENDIAN);
    } else {
      a.clear();
    }
    return a;
  }
  
  public void d()
  {
    a = b.a;
    c = 0;
    b = 2;
  }
  
  public final void e(ByteBuffer paramByteBuffer, byte[] paramArrayOfByte)
  {
    f(paramByteBuffer, 0L, 0, 1, true);
    paramByteBuffer.put(a3.i.a(paramArrayOfByte.length));
    paramByteBuffer.put(paramArrayOfByte);
    paramByteBuffer.putInt(22, M.x(paramByteBuffer.array(), paramByteBuffer.arrayOffset(), paramArrayOfByte.length + 28, 0));
    paramByteBuffer.position(paramArrayOfByte.length + 28);
  }
  
  public final void f(ByteBuffer paramByteBuffer, long paramLong, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    paramByteBuffer.put((byte)79);
    paramByteBuffer.put((byte)103);
    paramByteBuffer.put((byte)103);
    paramByteBuffer.put((byte)83);
    paramByteBuffer.put((byte)0);
    byte b1;
    byte b2;
    if (paramBoolean)
    {
      b1 = 2;
      b2 = b1;
    }
    else
    {
      b1 = 0;
      b2 = b1;
    }
    paramByteBuffer.put(b2);
    paramByteBuffer.putLong(paramLong);
    paramByteBuffer.putInt(0);
    paramByteBuffer.putInt(paramInt1);
    paramByteBuffer.putInt(0);
    paramByteBuffer.put(a3.i.a(paramInt2));
  }
}

/* Location:
 * Qualified Name:     m0.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */