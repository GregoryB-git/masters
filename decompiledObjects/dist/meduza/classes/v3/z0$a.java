package v3;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import p2.v;
import v5.k;
import x0.d;
import x0.f;
import z4.n;
import z4.q;
import z4.t.b;
import z4.w;

public final class z0$a
  implements w, a4.g
{
  public final z0.c a;
  
  public z0$a(z0 paramz0, z0.c paramc)
  {
    a = paramc;
  }
  
  public final void E(int paramInt, t.b paramb)
  {
    paramb = b(paramInt, paramb);
    if (paramb != null) {
      b.i.e(new f(7, this, paramb));
    }
  }
  
  public final void H(int paramInt, t.b paramb)
  {
    paramb = b(paramInt, paramb);
    if (paramb != null) {
      b.i.e(new y0(this, paramb, 0));
    }
  }
  
  public final void M(int paramInt, t.b paramb, n paramn, q paramq)
  {
    paramb = b(paramInt, paramb);
    if (paramb != null) {
      b.i.e(new v(this, paramb, paramn, paramq, 1));
    }
  }
  
  public final void O(int paramInt, t.b paramb)
  {
    paramb = b(paramInt, paramb);
    if (paramb != null) {
      b.i.e(new w.g(7, this, paramb));
    }
  }
  
  public final void P(int paramInt, t.b paramb, Exception paramException)
  {
    paramb = b(paramInt, paramb);
    if (paramb != null) {
      b.i.e(new d(this, paramb, paramException, 2));
    }
  }
  
  public final void U(int paramInt1, t.b paramb, int paramInt2)
  {
    paramb = b(paramInt1, paramb);
    if (paramb != null) {
      b.i.e(new p.s(this, paramb, paramInt2, 2));
    }
  }
  
  public final void V(int paramInt, t.b paramb, q paramq)
  {
    paramb = b(paramInt, paramb);
    if (paramb != null) {
      b.i.e(new x0.g(this, paramb, paramq, 3));
    }
  }
  
  public final Pair<Integer, t.b> b(int paramInt, t.b paramb)
  {
    Object localObject1 = null;
    if (paramb != null)
    {
      Object localObject2 = a;
      for (int i = 0; i < c.size(); i++) {
        if (c.get(i)).d == d)
        {
          localObject1 = a;
          localObject2 = b;
          i = a.e;
          paramb = paramb.b(Pair.create(localObject2, localObject1));
          break label91;
        }
      }
      paramb = null;
      label91:
      if (paramb == null) {
        return null;
      }
      localObject1 = paramb;
    }
    return Pair.create(Integer.valueOf(paramInt + a.d), localObject1);
  }
  
  public final void f0(int paramInt, t.b paramb, n paramn, q paramq, IOException paramIOException, boolean paramBoolean)
  {
    paramb = b(paramInt, paramb);
    if (paramb != null) {
      b.i.e(new w0(this, paramb, paramn, paramq, paramIOException, paramBoolean));
    }
  }
  
  public final void h0(int paramInt, t.b paramb, n paramn, q paramq)
  {
    paramb = b(paramInt, paramb);
    if (paramb != null) {
      b.i.e(new v0(this, paramb, paramn, paramq, 0));
    }
  }
  
  public final void j0(int paramInt, t.b paramb)
  {
    paramb = b(paramInt, paramb);
    if (paramb != null) {
      b.i.e(new y0(this, paramb, 1));
    }
  }
  
  public final void n0(int paramInt, t.b paramb, n paramn, q paramq)
  {
    paramb = b(paramInt, paramb);
    if (paramb != null) {
      b.i.e(new v0(this, paramb, paramn, paramq, 1));
    }
  }
  
  public final void o0(int paramInt, t.b paramb, q paramq)
  {
    paramb = b(paramInt, paramb);
    if (paramb != null) {
      b.i.e(new x0(this, paramb, paramq, 0));
    }
  }
}

/* Location:
 * Qualified Name:     v3.z0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */