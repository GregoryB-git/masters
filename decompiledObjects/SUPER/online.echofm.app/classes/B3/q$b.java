package B3;

import java.util.HashSet;
import java.util.Set;

public class q$b
{
  public final c a;
  public final Set b = new HashSet();
  public final Set c = new HashSet();
  
  public q$b(c paramc)
  {
    a = paramc;
  }
  
  public void a(b paramb)
  {
    b.add(paramb);
  }
  
  public void b(b paramb)
  {
    c.add(paramb);
  }
  
  public c c()
  {
    return a;
  }
  
  public Set d()
  {
    return b;
  }
  
  public boolean e()
  {
    return b.isEmpty();
  }
  
  public boolean f()
  {
    return c.isEmpty();
  }
  
  public void g(b paramb)
  {
    c.remove(paramb);
  }
}

/* Location:
 * Qualified Name:     B3.q.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */