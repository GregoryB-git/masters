package l4;

import b.a0;
import c4.y;
import c4.y.a;
import java.util.Arrays;
import o7.t;
import p4.a;
import p4.a.b;
import v3.i0;
import v3.i0.a;
import v5.e0;
import v5.u;
import x6.b;

public final class g
  extends h
{
  public static final byte[] o = { 79, 112, 117, 115, 72, 101, 97, 100 };
  public static final byte[] p = { 79, 112, 117, 115, 84, 97, 103, 115 };
  public boolean n;
  
  public static boolean e(u paramu, byte[] paramArrayOfByte)
  {
    int i = c;
    int j = b;
    if (i - j < paramArrayOfByte.length) {
      return false;
    }
    byte[] arrayOfByte = new byte[paramArrayOfByte.length];
    paramu.d(arrayOfByte, 0, paramArrayOfByte.length);
    paramu.G(j);
    return Arrays.equals(arrayOfByte, paramArrayOfByte);
  }
  
  public final long b(u paramu)
  {
    paramu = a;
    byte b1 = 0;
    byte b2 = paramu[0];
    byte b3 = b1;
    if (paramu.length > 1)
    {
      b1 = paramu[1];
      b3 = b1;
    }
    long l = a0.v(b2, b3);
    return i * l / 1000000L;
  }
  
  public final boolean c(u paramu, long paramLong, h.a parama)
  {
    int i;
    Object localObject1;
    if (e(paramu, o))
    {
      paramu = Arrays.copyOf(a, c);
      i = paramu[9];
      paramu = a0.n(paramu);
      if (a != null) {
        return true;
      }
      localObject1 = new i0.a();
      k = "audio/opus";
      x = (i & 0xFF);
      y = 48000;
      m = paramu;
      paramu = new i0((i0.a)localObject1);
    }
    else
    {
      if (!e(paramu, p)) {
        break label292;
      }
      b.K(a);
      if (n) {
        return true;
      }
      n = true;
      paramu.H(8);
      paramu = y.a(t.q(ba));
      if (paramu == null) {
        return true;
      }
      localObject1 = a;
      localObject1.getClass();
      localObject1 = new i0.a((i0)localObject1);
      Object localObject2 = a.r;
      if (localObject2 != null)
      {
        localObject2 = a;
        if (localObject2.length != 0)
        {
          paramLong = b;
          paramu = a;
          i = e0.a;
          Object[] arrayOfObject = Arrays.copyOf(paramu, paramu.length + localObject2.length);
          System.arraycopy(localObject2, 0, arrayOfObject, paramu.length, localObject2.length);
          paramu = new a(paramLong, (a.b[])arrayOfObject);
        }
      }
      i = paramu;
      paramu = new i0((i0.a)localObject1);
    }
    a = paramu;
    return true;
    label292:
    b.K(a);
    return false;
  }
  
  public final void d(boolean paramBoolean)
  {
    super.d(paramBoolean);
    if (paramBoolean) {
      n = false;
    }
  }
}

/* Location:
 * Qualified Name:     l4.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */