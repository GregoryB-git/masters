package e5;

import z4.d0;
import z4.d0.a;
import z4.i0;
import z4.j0;
import z4.r;
import z4.r.a;

public final class l$a
  implements n.a
{
  public l$a(l paraml) {}
  
  public final void a(d0 paramd0)
  {
    paramd0 = (n)paramd0;
    paramd0 = a;
    z.a(paramd0);
  }
  
  public final void c()
  {
    Object localObject = a;
    int i = A - 1;
    A = i;
    if (i > 0) {
      return;
    }
    n[] arrayOfn1 = C;
    int j = arrayOfn1.length;
    i = 0;
    int k = i;
    while (i < j)
    {
      localObject = arrayOfn1[i];
      ((n)localObject).b();
      k += Q.a;
      i++;
    }
    localObject = new i0[k];
    n[] arrayOfn2 = a.C;
    int m = arrayOfn2.length;
    i = 0;
    k = i;
    while (i < m)
    {
      arrayOfn1 = arrayOfn2[i];
      arrayOfn1.b();
      int n = Q.a;
      j = 0;
      while (j < n)
      {
        arrayOfn1.b();
        localObject[k] = Q.a(j);
        j++;
        k++;
      }
      i++;
    }
    a.B = new j0((i0[])localObject);
    localObject = a;
    z.b((r)localObject);
  }
}

/* Location:
 * Qualified Name:     e5.l.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */