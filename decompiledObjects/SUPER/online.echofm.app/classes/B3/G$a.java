package B3;

import java.util.Set;
import n4.a;
import n4.c;

public class G$a
  implements c
{
  public final Set a;
  public final c b;
  
  public G$a(Set paramSet, c paramc)
  {
    a = paramSet;
    b = paramc;
  }
  
  public void a(a parama)
  {
    if (a.contains(parama.b()))
    {
      b.a(parama);
      return;
    }
    throw new t(String.format("Attempting to publish an undeclared event %s.", new Object[] { parama }));
  }
}

/* Location:
 * Qualified Name:     B3.G.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */