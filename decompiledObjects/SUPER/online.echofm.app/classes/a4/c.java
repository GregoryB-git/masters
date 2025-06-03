package a4;

import d4.b;
import d4.i;
import d4.n;

public class c
{
  public final e.a a;
  public final i b;
  public final i c;
  public final b d;
  public final b e;
  
  public c(e.a parama, i parami1, b paramb1, b paramb2, i parami2)
  {
    a = parama;
    b = parami1;
    d = paramb1;
    e = paramb2;
    c = parami2;
  }
  
  public static c b(b paramb, i parami)
  {
    return new c(e.a.p, parami, paramb, null, null);
  }
  
  public static c c(b paramb, n paramn)
  {
    return b(paramb, i.d(paramn));
  }
  
  public static c d(b paramb, i parami1, i parami2)
  {
    return new c(e.a.r, parami1, paramb, null, parami2);
  }
  
  public static c e(b paramb, n paramn1, n paramn2)
  {
    return d(paramb, i.d(paramn1), i.d(paramn2));
  }
  
  public static c f(b paramb, i parami)
  {
    return new c(e.a.q, parami, paramb, null, null);
  }
  
  public static c g(b paramb, i parami)
  {
    return new c(e.a.o, parami, paramb, null, null);
  }
  
  public static c h(b paramb, n paramn)
  {
    return g(paramb, i.d(paramn));
  }
  
  public static c n(i parami)
  {
    return new c(e.a.s, parami, null, null, null);
  }
  
  public c a(b paramb)
  {
    return new c(a, b, d, paramb, c);
  }
  
  public b i()
  {
    return d;
  }
  
  public e.a j()
  {
    return a;
  }
  
  public i k()
  {
    return b;
  }
  
  public i l()
  {
    return c;
  }
  
  public b m()
  {
    return e;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Change: ");
    localStringBuilder.append(a);
    localStringBuilder.append(" ");
    localStringBuilder.append(d);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     a4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */