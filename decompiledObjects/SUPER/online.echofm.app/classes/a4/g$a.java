package a4;

import c4.c;
import java.util.ArrayList;
import java.util.Iterator;

public class g$a
  implements Runnable
{
  public g$a(g paramg, ArrayList paramArrayList) {}
  
  public void run()
  {
    Iterator localIterator = o.iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      if (g.a(p).f())
      {
        c localc = g.a(p);
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Raising ");
        localStringBuilder.append(locale.toString());
        localc.b(localStringBuilder.toString(), new Object[0]);
      }
      locale.a();
    }
  }
}

/* Location:
 * Qualified Name:     a4.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */