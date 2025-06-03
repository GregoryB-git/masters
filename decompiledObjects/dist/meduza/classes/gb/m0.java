package gb;

import eb.c;
import eb.e1;
import eb.f0;
import eb.h;
import eb.s0;
import eb.t0;
import x6.b;

public final class m0
  implements u
{
  public final e1 a;
  public final t.a b;
  
  public m0(e1 parame1, t.a parama)
  {
    b.s("error must not be OK", parame1.e() ^ true);
    a = parame1;
    b = parama;
  }
  
  public final s d(t0<?, ?> paramt0, s0 params0, c paramc, h[] paramArrayOfh)
  {
    return new l0(a, b, paramArrayOfh);
  }
  
  public final f0 f()
  {
    throw new UnsupportedOperationException("Not a real transport");
  }
}

/* Location:
 * Qualified Name:     gb.m0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */