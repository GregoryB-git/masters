package u5;

import io.flutter.embedding.engine.renderer.j;
import java.util.Iterator;
import java.util.Set;

public class D$c
  implements j
{
  public D$c(D paramD) {}
  
  public void b()
  {
    D.g(a, false);
    Iterator localIterator = D.h(a).iterator();
    while (localIterator.hasNext()) {
      ((j)localIterator.next()).b();
    }
  }
  
  public void e()
  {
    D.g(a, true);
    Iterator localIterator = D.h(a).iterator();
    while (localIterator.hasNext()) {
      ((j)localIterator.next()).e();
    }
  }
}

/* Location:
 * Qualified Name:     u5.D.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */