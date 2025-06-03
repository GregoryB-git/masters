package a4;

import V3.f;
import V3.j;
import c4.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class g
{
  public final j a;
  public final c b;
  
  public g(f paramf)
  {
    a = paramf.o();
    b = paramf.q("EventRaiser");
  }
  
  public void b(final List paramList)
  {
    if (b.f())
    {
      c localc = b;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Raising ");
      localStringBuilder.append(paramList.size());
      localStringBuilder.append(" event(s)");
      localc.b(localStringBuilder.toString(), new Object[0]);
    }
    paramList = new ArrayList(paramList);
    a.b(new a(paramList));
  }
  
  public class a
    implements Runnable
  {
    public a(ArrayList paramArrayList) {}
    
    public void run()
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        e locale = (e)localIterator.next();
        if (g.a(g.this).f())
        {
          c localc = g.a(g.this);
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Raising ");
          localStringBuilder.append(locale.toString());
          localc.b(localStringBuilder.toString(), new Object[0]);
        }
        locale.a();
      }
    }
  }
}

/* Location:
 * Qualified Name:     a4.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */