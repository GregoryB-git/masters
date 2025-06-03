package t5;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import w3.a;

public abstract interface e
{
  public abstract void b(a parama);
  
  public abstract void c();
  
  public abstract void e(Handler paramHandler, a parama);
  
  public abstract q f();
  
  public abstract long g();
  
  public static abstract interface a
  {
    public abstract void Q(int paramInt, long paramLong1, long paramLong2);
    
    public static final class a
    {
      public final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList();
      
      public final void a(a parama)
      {
        Iterator localIterator = a.iterator();
        while (localIterator.hasNext())
        {
          a locala = (a)localIterator.next();
          if (b == parama)
          {
            c = true;
            a.remove(locala);
          }
        }
      }
      
      public static final class a
      {
        public final Handler a;
        public final e.a b;
        public boolean c;
        
        public a(Handler paramHandler, a parama)
        {
          a = paramHandler;
          b = parama;
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     t5.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */