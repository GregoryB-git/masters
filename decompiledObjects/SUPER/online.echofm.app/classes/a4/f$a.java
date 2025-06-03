package a4;

import d4.i;
import java.util.Comparator;

public class f$a
  implements Comparator
{
  public f$a(f paramf) {}
  
  public int a(c paramc1, c paramc2)
  {
    boolean bool;
    if ((paramc1.i() != null) && (paramc2.i() != null)) {
      bool = true;
    } else {
      bool = false;
    }
    Y3.m.f(bool);
    paramc1 = new d4.m(paramc1.i(), paramc1.k().k());
    paramc2 = new d4.m(paramc2.i(), paramc2.k().k());
    return f.a(o).compare(paramc1, paramc2);
  }
}

/* Location:
 * Qualified Name:     a4.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */