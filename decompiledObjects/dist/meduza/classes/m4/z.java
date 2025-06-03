package m4;

import c4.j;
import c4.v;
import java.util.List;
import v3.i0;
import v3.i0.a;
import x6.b;

public final class z
{
  public final List<i0> a;
  public final v[] b;
  
  public z(List<i0> paramList)
  {
    a = paramList;
    b = new v[paramList.size()];
  }
  
  public final void a(j paramj, d0.d paramd)
  {
    for (int i = 0; i < b.length; i++)
    {
      paramd.a();
      paramd.b();
      v localv = paramj.r(d, 3);
      i0 locali0 = (i0)a.get(i);
      String str = t;
      boolean bool;
      if ((!"application/cea-608".equals(str)) && (!"application/cea-708".equals(str))) {
        bool = false;
      } else {
        bool = true;
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Invalid closed caption mime type provided: ");
      ((StringBuilder)localObject).append(str);
      b.o(((StringBuilder)localObject).toString(), bool);
      localObject = a;
      if (localObject == null)
      {
        paramd.b();
        localObject = e;
      }
      i0.a locala = new i0.a();
      a = ((String)localObject);
      k = str;
      d = d;
      c = c;
      C = L;
      m = v;
      localv.d(new i0(locala));
      b[i] = localv;
    }
  }
}

/* Location:
 * Qualified Name:     m4.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */