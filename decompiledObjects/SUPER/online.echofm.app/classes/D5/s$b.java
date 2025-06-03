package D5;

import E5.j;
import E5.k.c;
import E5.k.d;

public class s$b
  implements k.c
{
  public s$b(s params) {}
  
  public void onMethodCall(j paramj, k.d paramd)
  {
    String str = a;
    paramj = b;
    str.hashCode();
    if (!str.equals("get"))
    {
      if (!str.equals("put")) {
        paramd.c();
      } else {
        s.b(a, (byte[])paramj);
      }
    }
    else {
      for (paramj = null;; paramj = s.e(paramj, s.a(paramj)))
      {
        paramd.a(paramj);
        break;
        s.c(a, true);
        if (!s.d(a))
        {
          paramj = a;
          if (a)
          {
            s.f(paramj, paramd);
            break;
          }
        }
        paramj = a;
      }
    }
  }
}

/* Location:
 * Qualified Name:     D5.s.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */