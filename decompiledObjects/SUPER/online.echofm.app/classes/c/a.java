package c;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class a
{
  public final Set a = new CopyOnWriteArraySet();
  public volatile Context b;
  
  public void a(b paramb)
  {
    if (b != null) {
      paramb.a(b);
    }
    a.add(paramb);
  }
  
  public void b()
  {
    b = null;
  }
  
  public void c(Context paramContext)
  {
    b = paramContext;
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((b)localIterator.next()).a(paramContext);
    }
  }
}

/* Location:
 * Qualified Name:     c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */