package gb;

import eb.l;
import eb.s0;
import hb.h.a;
import java.io.IOException;
import java.io.InputStream;
import m.e;

public final class a$a
  implements t0
{
  public s0 a;
  public boolean b;
  public final l3 c;
  public byte[] d;
  
  public a$a(a parama, s0 params0, l3 paraml3)
  {
    x6.b.y(params0, "headers");
    a = params0;
    c = paraml3;
  }
  
  public final t0 a(l paraml)
  {
    return this;
  }
  
  public final void b(InputStream paramInputStream)
  {
    Object localObject = d;
    int i = 0;
    boolean bool;
    if (localObject == null) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.I(bool, "writePayload should not be called multiple times");
    try
    {
      d = p7.b.b(paramInputStream);
      paramInputStream = c.a;
      int j = paramInputStream.length;
      for (int k = 0; k < j; k++) {
        paramInputStream[k].k(0);
      }
      localObject = c;
      paramInputStream = d;
      long l1 = paramInputStream.length;
      long l2 = paramInputStream.length;
      paramInputStream = a;
      j = paramInputStream.length;
      for (k = 0; k < j; k++) {
        paramInputStream[k].l(0, l1, l2);
      }
      paramInputStream = c;
      l2 = d.length;
      paramInputStream = a;
      j = paramInputStream.length;
      for (k = 0; k < j; k++) {
        paramInputStream[k].m(l2);
      }
      paramInputStream = c;
      l2 = d.length;
      paramInputStream = a;
      j = paramInputStream.length;
      for (k = i; k < j; k++) {
        paramInputStream[k].n(l2);
      }
      return;
    }
    catch (IOException paramInputStream)
    {
      throw new RuntimeException(paramInputStream);
    }
  }
  
  public final void close()
  {
    boolean bool = true;
    b = true;
    if (d == null) {
      bool = false;
    }
    x6.b.I(bool, "Lack of request message. GET request is only supported for unary requests");
    e.r().a(a, d);
    d = null;
    a = null;
  }
  
  public final void flush() {}
  
  public final void h(int paramInt) {}
  
  public final boolean isClosed()
  {
    return b;
  }
}

/* Location:
 * Qualified Name:     gb.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */