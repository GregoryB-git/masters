package gb;

import e9.a;
import eb.c;
import eb.e;
import eb.n;
import eb.n0;
import eb.t0;
import java.util.concurrent.TimeUnit;
import n7.g;
import n7.g.a;
import x0.f;

public abstract class r0
  extends n0
{
  public final n0 b;
  
  public r0(r1 paramr1)
  {
    b = paramr1;
  }
  
  public final boolean C(long paramLong, TimeUnit paramTimeUnit)
  {
    return b.C(paramLong, paramTimeUnit);
  }
  
  public final void D()
  {
    b.D();
  }
  
  public final n E()
  {
    return b.E();
  }
  
  public final void F(n paramn, f paramf)
  {
    b.F(paramn, paramf);
  }
  
  public final String b()
  {
    return b.b();
  }
  
  public final String toString()
  {
    g.a locala = g.b(this);
    locala.a(b, "delegate");
    return locala.toString();
  }
  
  public final <RequestT, ResponseT> e<RequestT, ResponseT> v(t0<RequestT, ResponseT> paramt0, c paramc)
  {
    return b.v(paramt0, paramc);
  }
}

/* Location:
 * Qualified Name:     gb.r0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */