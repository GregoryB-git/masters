package m0;

import e0.b.a;
import e0.b.b;
import e0.d;
import g0.M;
import g0.a;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class d0
  extends d
{
  public final float i;
  public final short j;
  public final int k;
  public final long l;
  public final long m;
  public int n;
  public boolean o;
  public int p;
  public long q;
  public int r;
  public byte[] s;
  public int t;
  public int u;
  public byte[] v;
  
  public d0()
  {
    this(100000L, 0.2F, 2000000L, 10, (short)1024);
  }
  
  public d0(long paramLong1, float paramFloat, long paramLong2, int paramInt, short paramShort)
  {
    boolean bool1 = false;
    r = 0;
    t = 0;
    u = 0;
    boolean bool2 = bool1;
    if (paramFloat >= 0.0F)
    {
      bool2 = bool1;
      if (paramFloat <= 1.0F) {
        bool2 = true;
      }
    }
    a.a(bool2);
    l = paramLong1;
    i = paramFloat;
    m = paramLong2;
    k = paramInt;
    j = ((short)paramShort);
    byte[] arrayOfByte = M.f;
    s = arrayOfByte;
    v = arrayOfByte;
  }
  
  public static void D(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 >= 32767)
    {
      paramArrayOfByte[paramInt1] = ((byte)-1);
      paramArrayOfByte[(paramInt1 + 1)] = ((byte)127);
    }
    else if (paramInt2 <= 32768)
    {
      paramArrayOfByte[paramInt1] = ((byte)0);
      paramArrayOfByte[(paramInt1 + 1)] = ((byte)Byte.MIN_VALUE);
    }
    else
    {
      paramArrayOfByte[paramInt1] = ((byte)(byte)(paramInt2 & 0xFF));
      paramArrayOfByte[(paramInt1 + 1)] = ((byte)(byte)(paramInt2 >> 8));
    }
  }
  
  public static int G(byte paramByte1, byte paramByte2)
  {
    return paramByte1 << 8 | paramByte2 & 0xFF;
  }
  
  public final void A(boolean paramBoolean)
  {
    int i1 = u;
    Object localObject = s;
    if ((i1 == localObject.length) || (paramBoolean))
    {
      int i2 = r;
      boolean bool = false;
      int i3;
      if (i2 == 0)
      {
        if (paramBoolean)
        {
          B(i1, 3);
          i2 = i1;
        }
        for (;;)
        {
          i3 = i2;
          break;
          if (i1 >= localObject.length / 2) {
            paramBoolean = true;
          } else {
            paramBoolean = false;
          }
          a.f(paramBoolean);
          i2 = s.length / 2;
          B(i2, 0);
        }
      }
      if (paramBoolean)
      {
        i2 = i1 - localObject.length / 2;
        i4 = localObject.length / 2;
        i3 = r(i2) + s.length / 2;
        B(i3, 2);
        i2 = i4 + i2;
      }
      else
      {
        i2 = i1 - localObject.length / 2;
        i3 = r(i2);
        B(i3, 1);
      }
      if (i2 % n == 0) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("bytesConsumed is not aligned to frame size: %s");
      ((StringBuilder)localObject).append(i2);
      a.g(paramBoolean, ((StringBuilder)localObject).toString());
      paramBoolean = bool;
      if (i1 >= i3) {
        paramBoolean = true;
      }
      a.f(paramBoolean);
      u -= i2;
      i1 = t + i2;
      t = i1;
      t = (i1 % s.length);
      int i4 = r;
      i1 = n;
      r = (i4 + i3 / i1);
      q += (i2 - i3) / i1;
    }
  }
  
  public final void B(int paramInt1, int paramInt2)
  {
    if (paramInt1 == 0) {
      return;
    }
    int i1 = u;
    boolean bool1 = true;
    boolean bool2;
    if (i1 >= paramInt1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    a.a(bool2);
    int i2;
    if (paramInt2 == 2)
    {
      i2 = t;
      i1 = u;
      localObject = s;
      if (i2 + i1 <= localObject.length)
      {
        System.arraycopy(localObject, i2 + i1 - paramInt1, v, 0, paramInt1);
      }
      else
      {
        i1 -= localObject.length - i2;
        if (i1 >= paramInt1)
        {
          System.arraycopy(localObject, i1 - paramInt1, v, 0, paramInt1);
        }
        else
        {
          i2 = paramInt1 - i1;
          System.arraycopy(localObject, localObject.length - i2, v, 0, i2);
          System.arraycopy(s, 0, v, i2, i1);
        }
      }
    }
    else
    {
      i2 = t;
      localObject = s;
      if (i2 + paramInt1 <= localObject.length)
      {
        System.arraycopy(localObject, i2, v, 0, paramInt1);
      }
      else
      {
        i1 = localObject.length - i2;
        System.arraycopy(localObject, i2, v, 0, i1);
        System.arraycopy(s, 0, v, i1, paramInt1 - i1);
      }
    }
    if (paramInt1 % n == 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("sizeToOutput is not aligned to frame size: ");
    ((StringBuilder)localObject).append(paramInt1);
    a.b(bool2, ((StringBuilder)localObject).toString());
    if (t < s.length) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    a.f(bool2);
    z(v, paramInt1, paramInt2);
  }
  
  public final void C(ByteBuffer paramByteBuffer)
  {
    int i1 = paramByteBuffer.limit();
    paramByteBuffer.limit(Math.min(i1, paramByteBuffer.position() + s.length));
    int i2 = t(paramByteBuffer);
    if (i2 == paramByteBuffer.position())
    {
      p = 1;
    }
    else
    {
      paramByteBuffer.limit(Math.min(i2, paramByteBuffer.capacity()));
      y(paramByteBuffer);
    }
    paramByteBuffer.limit(i1);
  }
  
  public void E(boolean paramBoolean)
  {
    o = paramBoolean;
  }
  
  public final void F(ByteBuffer paramByteBuffer)
  {
    int i1 = t;
    int i2 = s.length;
    boolean bool1 = true;
    boolean bool2;
    if (i1 < i2) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    a.f(bool2);
    int i3 = paramByteBuffer.limit();
    int i4 = u(paramByteBuffer);
    int i5 = i4 - paramByteBuffer.position();
    int i6 = t;
    i2 = u;
    byte[] arrayOfByte = s;
    if (i6 + i2 < arrayOfByte.length)
    {
      i1 = arrayOfByte.length - (i2 + i6);
      i2 = i6 + i2;
    }
    else
    {
      i2 -= arrayOfByte.length - i6;
      i1 = i6 - i2;
    }
    if (i4 < i3) {
      i4 = 1;
    } else {
      i4 = 0;
    }
    i6 = Math.min(i5, i1);
    paramByteBuffer.limit(paramByteBuffer.position() + i6);
    paramByteBuffer.get(s, i2, i6);
    i2 = u + i6;
    u = i2;
    if (i2 <= s.length) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    a.f(bool2);
    if ((i4 != 0) && (i5 < i1)) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    A(bool2);
    if (bool2)
    {
      p = 0;
      r = 0;
    }
    paramByteBuffer.limit(i3);
  }
  
  public boolean a()
  {
    boolean bool;
    if ((super.a()) && (o)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void f(ByteBuffer paramByteBuffer)
  {
    while ((paramByteBuffer.hasRemaining()) && (!h()))
    {
      int i1 = p;
      if (i1 != 0)
      {
        if (i1 == 1) {
          F(paramByteBuffer);
        } else {
          throw new IllegalStateException();
        }
      }
      else {
        C(paramByteBuffer);
      }
    }
  }
  
  public b.a i(b.a parama)
  {
    if (c == 2)
    {
      b.a locala = parama;
      if (a == -1) {
        locala = b.a.e;
      }
      return locala;
    }
    throw new b.b(parama);
  }
  
  public void j()
  {
    if (a())
    {
      n = (b.b * 2);
      int i1 = o(s(l) / 2) * 2;
      if (s.length != i1)
      {
        s = new byte[i1];
        v = new byte[i1];
      }
    }
    p = 0;
    q = 0L;
    r = 0;
    t = 0;
    u = 0;
  }
  
  public void k()
  {
    if (u > 0)
    {
      A(true);
      r = 0;
    }
  }
  
  public void l()
  {
    o = false;
    byte[] arrayOfByte = M.f;
    s = arrayOfByte;
    v = arrayOfByte;
  }
  
  public final int n(float paramFloat)
  {
    return o((int)paramFloat);
  }
  
  public final int o(int paramInt)
  {
    int i1 = n;
    return paramInt / i1 * i1;
  }
  
  public final int p(int paramInt1, int paramInt2)
  {
    int i1 = k;
    return i1 + (100 - i1) * (paramInt1 * 1000) / paramInt2 / 1000;
  }
  
  public final int q(int paramInt1, int paramInt2)
  {
    return (k - 100) * (paramInt1 * 1000 / paramInt2) / 1000 + 100;
  }
  
  public final int r(int paramInt)
  {
    int i1 = (s(m) - r) * n - s.length / 2;
    boolean bool;
    if (i1 >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    a.f(bool);
    return n(Math.min(paramInt * i + 0.5F, i1));
  }
  
  public final int s(long paramLong)
  {
    return (int)(paramLong * b.a / 1000000L);
  }
  
  public final int t(ByteBuffer paramByteBuffer)
  {
    for (int i1 = paramByteBuffer.limit() - 1; i1 >= paramByteBuffer.position(); i1 -= 2) {
      if (w(paramByteBuffer.get(i1), paramByteBuffer.get(i1 - 1)))
      {
        int i2 = n;
        return i1 / i2 * i2 + i2;
      }
    }
    return paramByteBuffer.position();
  }
  
  public final int u(ByteBuffer paramByteBuffer)
  {
    for (int i1 = paramByteBuffer.position() + 1; i1 < paramByteBuffer.limit(); i1 += 2) {
      if (w(paramByteBuffer.get(i1), paramByteBuffer.get(i1 - 1)))
      {
        int i2 = n;
        return i2 * (i1 / i2);
      }
    }
    return paramByteBuffer.limit();
  }
  
  public long v()
  {
    return q;
  }
  
  public final boolean w(byte paramByte1, byte paramByte2)
  {
    boolean bool;
    if (Math.abs(G(paramByte1, paramByte2)) > j) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void x(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 3) {
      return;
    }
    for (int i1 = 0; i1 < paramInt1; i1 += 2)
    {
      int i2 = G(paramArrayOfByte[(i1 + 1)], paramArrayOfByte[i1]);
      int i3;
      if (paramInt2 == 0) {
        i3 = q(i1, paramInt1 - 1);
      } else if (paramInt2 == 2) {
        i3 = p(i1, paramInt1 - 1);
      } else {
        i3 = k;
      }
      D(paramArrayOfByte, i1, i2 * i3 / 100);
    }
  }
  
  public final void y(ByteBuffer paramByteBuffer)
  {
    m(paramByteBuffer.remaining()).put(paramByteBuffer).flip();
  }
  
  public final void z(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool;
    if (paramInt1 % n == 0) {
      bool = true;
    } else {
      bool = false;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("byteOutput size is not aligned to frame size ");
    localStringBuilder.append(paramInt1);
    a.b(bool, localStringBuilder.toString());
    x(paramArrayOfByte, paramInt1, paramInt2);
    m(paramInt1).put(paramArrayOfByte, 0, paramInt1).flip();
  }
}

/* Location:
 * Qualified Name:     m0.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */