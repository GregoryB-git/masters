package V3;

import d4.b;
import d4.n;
import java.util.ArrayList;

public abstract class E
{
  public abstract E a(b paramb);
  
  public abstract n b();
  
  public static class a
    extends E
  {
    public final x a;
    public final k b;
    
    public a(x paramx, k paramk)
    {
      a = paramx;
      b = paramk;
    }
    
    public E a(b paramb)
    {
      paramb = b.U(paramb);
      return new a(a, paramb);
    }
    
    public n b()
    {
      return a.J(b, new ArrayList());
    }
  }
  
  public static class b
    extends E
  {
    public final n a;
    
    public b(n paramn)
    {
      a = paramn;
    }
    
    public E a(b paramb)
    {
      return new b(a.v(paramb));
    }
    
    public n b()
    {
      return a;
    }
  }
}

/* Location:
 * Qualified Name:     V3.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */