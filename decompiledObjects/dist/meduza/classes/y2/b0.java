package y2;

import java.util.HashMap;
import o2.j;
import o2.n;
import p2.c;
import x2.l;

public final class b0
{
  public static final String e = j.f("WorkTimer");
  public final n a;
  public final HashMap b = new HashMap();
  public final HashMap c = new HashMap();
  public final Object d = new Object();
  
  public b0(c paramc)
  {
    a = paramc;
  }
  
  public final void a(l paraml)
  {
    synchronized (d)
    {
      if ((b)b.remove(paraml) != null)
      {
        j localj = j.d();
        String str = e;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Stopping timer for ");
        localStringBuilder.append(paraml);
        localj.a(str, localStringBuilder.toString());
        c.remove(paraml);
      }
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(l paraml);
  }
  
  public static final class b
    implements Runnable
  {
    public final b0 a;
    public final l b;
    
    public b(b0 paramb0, l paraml)
    {
      a = paramb0;
      b = paraml;
    }
    
    public final void run()
    {
      synchronized (a.d)
      {
        if ((b)a.b.remove(b) != null)
        {
          b0.a locala = (b0.a)a.c.remove(b);
          if (locala != null) {
            locala.a(b);
          }
        }
        else
        {
          j.d().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[] { b }));
        }
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     y2.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */