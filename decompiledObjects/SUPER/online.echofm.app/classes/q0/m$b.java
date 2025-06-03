package q0;

import android.net.Uri;
import d0.J;
import r0.k;
import x0.S.a;
import x0.Z;
import x0.v.a;

public class m$b
  implements s.b
{
  public m$b(m paramm) {}
  
  public void a(s params)
  {
    m.r(o).e(o);
  }
  
  public void m(Uri paramUri)
  {
    m.t(o).i(paramUri);
  }
  
  public void o()
  {
    if (m.k(o) > 0) {
      return;
    }
    Object localObject = m.m(o);
    int i = localObject.length;
    int j = 0;
    int k = j;
    while (j < i)
    {
      k += na;
      j++;
    }
    localObject = new J[k];
    s[] arrayOfs = m.m(o);
    int m = arrayOfs.length;
    k = 0;
    j = k;
    while (k < m)
    {
      s locals = arrayOfs[k];
      int n = na;
      i = 0;
      while (i < n)
      {
        localObject[j] = locals.n().b(i);
        i++;
        j++;
      }
      k++;
    }
    m.o(o, new Z((J[])localObject));
    m.r(o).k(o);
  }
}

/* Location:
 * Qualified Name:     q0.m.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */