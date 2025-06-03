package y2;

import f;
import java.util.HashMap;
import java.util.Set;
import o2.j;
import p2.q0;
import p2.r;
import p2.x;
import x2.l;

public final class t
  implements Runnable
{
  public final r a;
  public final x b;
  public final boolean c;
  public final int d;
  
  public t(r paramr, x paramx, boolean paramBoolean, int paramInt)
  {
    a = paramr;
    b = paramx;
    c = paramBoolean;
    d = paramInt;
  }
  
  public final void run()
  {
    boolean bool;
    if (c)
    {
      Object localObject1 = a;
      ??? = b;
      i = d;
      localObject1.getClass();
      localObject5 = a.a;
      synchronized (k)
      {
        localObject1 = ((r)localObject1).b((String)localObject5);
        bool = r.d((String)localObject5, (q0)localObject1, i);
      }
    }
    Object localObject6 = a;
    Object localObject5 = b;
    int i = d;
    localObject6.getClass();
    String str = a.a;
    synchronized (k)
    {
      Object localObject7;
      if (f.get(str) != null)
      {
        localObject6 = j.d();
        localObject5 = r.l;
        localObject7 = new java/lang/StringBuilder;
        ((StringBuilder)localObject7).<init>();
        ((StringBuilder)localObject7).append("Ignored stopWork. WorkerWrapper ");
        ((StringBuilder)localObject7).append(str);
        ((StringBuilder)localObject7).append(" is in foreground");
        ((j)localObject6).a((String)localObject5, ((StringBuilder)localObject7).toString());
      }
      else
      {
        localObject7 = (Set)h.get(str);
        if ((localObject7 != null) && (((Set)localObject7).contains(localObject5)))
        {
          localObject5 = ((r)localObject6).b(str);
          bool = r.d(str, (q0)localObject5, i);
          break label240;
        }
      }
      bool = false;
      label240:
      ??? = j.d();
      str = j.f("StopWorkRunnable");
      localObject5 = f.l("StopWorkRunnable for ");
      ((StringBuilder)localObject5).append(b.a.a);
      ((StringBuilder)localObject5).append("; Processor.stopWork = ");
      ((StringBuilder)localObject5).append(bool);
      ((j)???).a(str, ((StringBuilder)localObject5).toString());
      return;
    }
  }
}

/* Location:
 * Qualified Name:     y2.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */