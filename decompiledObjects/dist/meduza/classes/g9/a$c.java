package g9;

import java.util.ArrayList;
import java.util.Iterator;
import x0.i;

public class a$c
  extends i
{
  public a.a a = new a.a();
  
  public final void onStop()
  {
    super.onStop();
    synchronized (a)
    {
      Object localObject2 = a;
      a.a locala = new g9/a$a;
      locala.<init>();
      a = locala;
      ??? = a.iterator();
      while (((Iterator)???).hasNext())
      {
        localObject2 = (Runnable)((Iterator)???).next();
        if (localObject2 != null) {
          ((Runnable)localObject2).run();
        }
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     g9.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */