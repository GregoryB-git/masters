package B4;

import N4.d;
import java.lang.ref.WeakReference;

public abstract class b
  implements a.b
{
  public final a o;
  public final WeakReference p;
  public boolean q = false;
  public d r = d.p;
  
  public b(a parama)
  {
    o = parama;
    p = new WeakReference(this);
  }
  
  public void b(d paramd)
  {
    d locald1 = r;
    d locald2 = d.p;
    if (locald1 == locald2) {}
    for (;;)
    {
      r = paramd;
      break;
      if ((locald1 == paramd) || (paramd == locald2)) {
        break;
      }
      paramd = d.s;
    }
  }
  
  public d c()
  {
    return r;
  }
  
  public void d(int paramInt)
  {
    o.e(paramInt);
  }
  
  public void e()
  {
    if (q) {
      return;
    }
    r = o.a();
    o.j(p);
    q = true;
  }
  
  public void f()
  {
    if (!q) {
      return;
    }
    o.o(p);
    q = false;
  }
}

/* Location:
 * Qualified Name:     B4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */