package h5;

import java.util.ArrayDeque;
import x6.b;

public final class d$a
  extends l
{
  public d$a(d paramd) {}
  
  public final void o()
  {
    d locald = e;
    boolean bool;
    if (c.size() < 2) {
      bool = true;
    } else {
      bool = false;
    }
    b.H(bool);
    b.q(c.contains(this) ^ true);
    a = 0;
    c = null;
    c.addFirst(this);
  }
}

/* Location:
 * Qualified Name:     h5.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */