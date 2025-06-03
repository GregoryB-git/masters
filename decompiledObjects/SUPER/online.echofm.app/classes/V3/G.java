package V3;

import a4.a;
import d4.b;
import d4.h;
import d4.m;
import d4.n;
import java.util.Collections;
import java.util.List;

public class G
{
  public final k a;
  public final F b;
  
  public G(k paramk, F paramF)
  {
    a = paramk;
    b = paramF;
  }
  
  public n a(b paramb, a parama)
  {
    return b.c(a, paramb, parama);
  }
  
  public n b(n paramn)
  {
    return c(paramn, Collections.emptyList());
  }
  
  public n c(n paramn, List paramList)
  {
    return d(paramn, paramList, false);
  }
  
  public n d(n paramn, List paramList, boolean paramBoolean)
  {
    return b.d(a, paramn, paramList, paramBoolean);
  }
  
  public n e(n paramn)
  {
    return b.e(a, paramn);
  }
  
  public n f(k paramk, n paramn1, n paramn2)
  {
    return b.f(a, paramk, paramn1, paramn2);
  }
  
  public m g(n paramn, m paramm, boolean paramBoolean, h paramh)
  {
    return b.g(a, paramn, paramm, paramBoolean, paramh);
  }
  
  public G h(b paramb)
  {
    return new G(a.U(paramb), b);
  }
  
  public n i(k paramk)
  {
    return b.o(a.T(paramk));
  }
}

/* Location:
 * Qualified Name:     V3.G
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */