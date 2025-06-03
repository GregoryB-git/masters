package m4;

import c4.j;
import c4.v;
import java.util.List;
import v3.i0;
import v3.i0.a;
import v5.u;

public final class e0
{
  public final List<i0> a;
  public final v[] b;
  
  public e0(List<i0> paramList)
  {
    a = paramList;
    b = new v[paramList.size()];
  }
  
  public final void a(long paramLong, u paramu)
  {
    if (c - b < 9) {
      return;
    }
    int i = paramu.f();
    int j = paramu.f();
    int k = paramu.v();
    if ((i == 434) && (j == 1195456820) && (k == 3)) {
      c4.b.b(paramLong, paramu, b);
    }
  }
  
  public final void b(j paramj, d0.d paramd)
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
      x6.b.o(((StringBuilder)localObject).toString(), bool);
      localObject = new i0.a();
      paramd.b();
      a = e;
      k = str;
      d = d;
      c = c;
      C = L;
      m = v;
      localv.d(new i0((i0.a)localObject));
      b[i] = localv;
    }
  }
}

/* Location:
 * Qualified Name:     m4.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */