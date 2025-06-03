package gb;

import eb.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import x6.b;

public final class y
{
  public ArrayList<a> a = new ArrayList();
  public volatile n b = n.d;
  
  public final void a(n paramn)
  {
    b.y(paramn, "newState");
    if ((b != paramn) && (b != n.e))
    {
      b = paramn;
      if (a.isEmpty()) {
        return;
      }
      paramn = a;
      a = new ArrayList();
      Iterator localIterator = paramn.iterator();
      while (localIterator.hasNext())
      {
        paramn = (a)localIterator.next();
        b.execute(a);
      }
    }
  }
  
  public static final class a
  {
    public final Runnable a;
    public final Executor b;
    
    public a(Runnable paramRunnable, Executor paramExecutor)
    {
      a = paramRunnable;
      b = paramExecutor;
    }
  }
}

/* Location:
 * Qualified Name:     gb.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */