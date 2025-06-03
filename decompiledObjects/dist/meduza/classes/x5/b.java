package x5;

import a0.j;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import l3.l;
import v3.f;
import v3.i0;
import v5.e0;
import v5.u;
import z3.g;

public final class b
  extends f
{
  public final g u = new g(1);
  public final u v = new u();
  public long w;
  public a x;
  public long y;
  
  public b()
  {
    super(6);
  }
  
  public final void B()
  {
    a locala = x;
    if (locala != null) {
      locala.f();
    }
  }
  
  public final void D(long paramLong, boolean paramBoolean)
  {
    y = Long.MIN_VALUE;
    a locala = x;
    if (locala != null) {
      locala.f();
    }
  }
  
  public final void H(i0[] paramArrayOfi0, long paramLong1, long paramLong2)
  {
    w = paramLong2;
  }
  
  public final int a(i0 parami0)
  {
    int i;
    if ("application/x-camera-motion".equals(t)) {
      i = j.b(4, 0, 0);
    } else {
      i = j.b(0, 0, 0);
    }
    return i;
  }
  
  public final boolean b()
  {
    return true;
  }
  
  public final boolean d()
  {
    return h();
  }
  
  public final String getName()
  {
    return "CameraMotionRenderer";
  }
  
  public final void p(long paramLong1, long paramLong2)
  {
    while ((!h()) && (y < 100000L + paramLong1))
    {
      u.o();
      l locall = b;
      Object localObject1 = null;
      a = null;
      b = null;
      Object localObject2 = u;
      int i = 0;
      if ((I(locall, (g)localObject2, 0) != -4) || (u.m(4))) {
        break;
      }
      localObject2 = u;
      y = e;
      if ((x != null) && (!((z3.a)localObject2).n()))
      {
        u.r();
        localObject2 = u.c;
        int j = e0.a;
        if (((Buffer)localObject2).remaining() == 16)
        {
          v.E(((ByteBuffer)localObject2).array(), ((Buffer)localObject2).limit());
          v.G(((ByteBuffer)localObject2).arrayOffset() + 4);
          localObject2 = new float[3];
          for (;;)
          {
            localObject1 = localObject2;
            if (i >= 3) {
              break;
            }
            localObject2[i] = Float.intBitsToFloat(v.i());
            i++;
          }
        }
        if (localObject1 != null) {
          x.a(y - w, (float[])localObject1);
        }
      }
    }
  }
  
  public final void q(int paramInt, Object paramObject)
  {
    if (paramInt == 8) {
      x = ((a)paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     x5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */