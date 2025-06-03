package B0;

import android.os.Handler;
import g0.a;
import i0.y;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract interface e
{
  public abstract y a();
  
  public abstract long b();
  
  public abstract void c(a parama);
  
  public abstract long d();
  
  public abstract void i(Handler paramHandler, a parama);
  
  public static abstract interface a
  {
    public abstract void c0(int paramInt, long paramLong1, long paramLong2);
    
    public static final class a
    {
      public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
      
      public void b(Handler paramHandler, e.a parama)
      {
        a.e(paramHandler);
        a.e(parama);
        e(parama);
        a.add(new a(paramHandler, parama));
      }
      
      public void c(int paramInt, long paramLong1, long paramLong2)
      {
        Iterator localIterator = a.iterator();
        while (localIterator.hasNext())
        {
          a locala = (a)localIterator.next();
          if (!a.b(locala)) {
            a.c(locala).post(new d(locala, paramInt, paramLong1, paramLong2));
          }
        }
      }
      
      public void e(e.a parama)
      {
        Iterator localIterator = a.iterator();
        while (localIterator.hasNext())
        {
          a locala = (a)localIterator.next();
          if (a.a(locala) == parama)
          {
            locala.d();
            a.remove(locala);
          }
        }
      }
      
      public static final class a
      {
        public final Handler a;
        public final e.a b;
        public boolean c;
        
        public a(Handler paramHandler, e.a parama)
        {
          a = paramHandler;
          b = parama;
        }
        
        public void d()
        {
          c = true;
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     B0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */