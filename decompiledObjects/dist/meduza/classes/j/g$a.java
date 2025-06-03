package j;

import e0.p0;
import e0.q0;
import java.util.ArrayList;

public final class g$a
  extends q0
{
  public boolean b = false;
  public int c = 0;
  
  public g$a(g paramg)
  {
    super(0);
  }
  
  public final void b()
  {
    if (b) {
      return;
    }
    b = true;
    p0 localp0 = d.d;
    if (localp0 != null) {
      localp0.b();
    }
  }
  
  public final void c()
  {
    int i = c + 1;
    c = i;
    if (i == d.a.size())
    {
      p0 localp0 = d.d;
      if (localp0 != null) {
        localp0.c();
      }
      c = 0;
      b = false;
      d.e = false;
    }
  }
}

/* Location:
 * Qualified Name:     j.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */