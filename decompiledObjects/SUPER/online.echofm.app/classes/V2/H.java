package V2;

import java.util.ArrayDeque;
import java.util.Queue;

public final class H
{
  public final Object a = new Object();
  public Queue b;
  public boolean c;
  
  public final void a(G paramG)
  {
    synchronized (a)
    {
      if (b == null)
      {
        ArrayDeque localArrayDeque = new java/util/ArrayDeque;
        localArrayDeque.<init>();
        b = localArrayDeque;
      }
    }
    b.add(paramG);
  }
  
  public final void b(j paramj)
  {
    synchronized (a)
    {
      if ((b != null) && (!c))
      {
        c = true;
        G localG;
        synchronized (a)
        {
          localG = (G)b.poll();
          if (localG == null)
          {
            c = false;
            return;
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     V2.H
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */