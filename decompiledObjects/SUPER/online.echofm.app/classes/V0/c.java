package V0;

import O0.b;
import d0.x;
import d0.x.b;
import g0.E;
import g0.y;
import g0.z;
import j0.i;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class c
  extends O0.c
{
  public final z a = new z();
  public final y b = new y();
  public E c;
  
  public x b(b paramb, ByteBuffer paramByteBuffer)
  {
    E localE = c;
    if ((localE == null) || (x != localE.f()))
    {
      localE = new E(t);
      c = localE;
      localE.a(t - x);
    }
    paramb = paramByteBuffer.array();
    int i = paramByteBuffer.limit();
    a.R(paramb, i);
    b.o(paramb, i);
    b.r(39);
    long l = b.h(1) << 32 | b.h(32);
    b.r(20);
    int j = b.h(12);
    i = b.h(8);
    a.U(14);
    if (i != 0)
    {
      if (i != 255)
      {
        if (i != 4)
        {
          if (i != 5)
          {
            if (i != 6) {
              paramb = null;
            } else {
              paramb = g.a(a, l, c);
            }
          }
          else {
            paramb = d.a(a, l, c);
          }
        }
        else {
          paramb = f.a(a);
        }
      }
      else {
        paramb = a.a(a, j, l);
      }
    }
    else {
      paramb = new e();
    }
    if (paramb == null) {
      paramb = new x(new x.b[0]);
    } else {
      paramb = new x(new x.b[] { paramb });
    }
    return paramb;
  }
}

/* Location:
 * Qualified Name:     V0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */