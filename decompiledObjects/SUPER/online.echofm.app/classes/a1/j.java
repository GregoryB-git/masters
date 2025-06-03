package a1;

import F0.W;
import F0.W.a;
import F0.W.b;
import F0.W.c;
import X2.v;
import d0.A;
import d0.q.b;
import d0.x;
import g0.a;
import g0.z;
import java.util.ArrayList;
import java.util.Arrays;

public final class j
  extends i
{
  public a n;
  public int o;
  public boolean p;
  public W.c q;
  public W.a r;
  
  public static void n(z paramz, long paramLong)
  {
    if (paramz.b() < paramz.g() + 4) {
      paramz.Q(Arrays.copyOf(paramz.e(), paramz.g() + 4));
    } else {
      paramz.S(paramz.g() + 4);
    }
    byte[] arrayOfByte = paramz.e();
    arrayOfByte[(paramz.g() - 4)] = ((byte)(byte)(int)(paramLong & 0xFF));
    arrayOfByte[(paramz.g() - 3)] = ((byte)(byte)(int)(paramLong >>> 8 & 0xFF));
    arrayOfByte[(paramz.g() - 2)] = ((byte)(byte)(int)(paramLong >>> 16 & 0xFF));
    arrayOfByte[(paramz.g() - 1)] = ((byte)(byte)(int)(paramLong >>> 24 & 0xFF));
  }
  
  public static int o(byte paramByte, a parama)
  {
    int i = p(paramByte, e, 1);
    if (!d[i].a) {
      i = a.g;
    } else {
      i = a.h;
    }
    return i;
  }
  
  public static int p(byte paramByte, int paramInt1, int paramInt2)
  {
    return paramByte >> paramInt2 & 255 >>> 8 - paramInt1;
  }
  
  public static boolean r(z paramz)
  {
    try
    {
      boolean bool = W.o(1, paramz, true);
      return bool;
    }
    catch (A paramz) {}
    return false;
  }
  
  public void e(long paramLong)
  {
    super.e(paramLong);
    int i = 0;
    boolean bool;
    if (paramLong != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    p = bool;
    W.c localc = q;
    if (localc != null) {
      i = g;
    }
    o = i;
  }
  
  public long f(z paramz)
  {
    byte[] arrayOfByte = paramz.e();
    int i = 0;
    if ((arrayOfByte[0] & 0x1) == 1) {
      return -1L;
    }
    int j = o(paramz.e()[0], (a)a.h(n));
    if (p) {
      i = (o + j) / 4;
    }
    long l = i;
    n(paramz, l);
    p = true;
    o = j;
    return l;
  }
  
  public boolean i(z paramz, long paramLong, i.b paramb)
  {
    if (n != null)
    {
      a.e(a);
      return false;
    }
    Object localObject = q(paramz);
    n = ((a)localObject);
    if (localObject == null) {
      return true;
    }
    paramz = a;
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(j);
    localArrayList.add(c);
    localObject = W.d(v.V(b.b));
    a = new q.b().o0("audio/vorbis").M(e).j0(d).N(b).p0(c).b0(localArrayList).h0((x)localObject).K();
    return true;
  }
  
  public void l(boolean paramBoolean)
  {
    super.l(paramBoolean);
    if (paramBoolean)
    {
      n = null;
      q = null;
      r = null;
    }
    o = 0;
    p = false;
  }
  
  public a q(z paramz)
  {
    W.c localc = q;
    if (localc == null)
    {
      q = W.l(paramz);
      return null;
    }
    W.a locala = r;
    if (locala == null)
    {
      r = W.j(paramz);
      return null;
    }
    byte[] arrayOfByte = new byte[paramz.g()];
    System.arraycopy(paramz.e(), 0, arrayOfByte, 0, paramz.g());
    paramz = W.m(paramz, b);
    return new a(localc, locala, arrayOfByte, paramz, W.b(paramz.length - 1));
  }
  
  public static final class a
  {
    public final W.c a;
    public final W.a b;
    public final byte[] c;
    public final W.b[] d;
    public final int e;
    
    public a(W.c paramc, W.a parama, byte[] paramArrayOfByte, W.b[] paramArrayOfb, int paramInt)
    {
      a = paramc;
      b = parama;
      c = paramArrayOfByte;
      d = paramArrayOfb;
      e = paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     a1.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */