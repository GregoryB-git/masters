package H0;

import d0.A;
import g0.z;

public class b$c
{
  public int a;
  public int b;
  public int c;
  
  public void a(z paramz)
  {
    a = paramz.t();
    b = paramz.t();
    c = 0;
  }
  
  public void b(z paramz)
  {
    a(paramz);
    if (a == 1414744396)
    {
      c = paramz.t();
      return;
    }
    paramz = new StringBuilder();
    paramz.append("LIST expected, found: ");
    paramz.append(a);
    throw A.a(paramz.toString(), null);
  }
}

/* Location:
 * Qualified Name:     H0.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */