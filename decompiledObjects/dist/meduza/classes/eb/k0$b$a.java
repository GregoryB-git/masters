package eb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x6.b;

public final class k0$b$a
{
  public List<u> a;
  public a b = a.b;
  public Object[][] c = new Object[0][2];
  
  public final void a(k0.k paramk)
  {
    k0.b.b localb = k0.c;
    Object[][] arrayOfObject1;
    for (int i = 0;; i++)
    {
      arrayOfObject1 = c;
      if (i >= arrayOfObject1.length) {
        break;
      }
      if (localb.equals(arrayOfObject1[i][0])) {
        break label43;
      }
    }
    i = -1;
    label43:
    int j = i;
    if (i == -1)
    {
      arrayOfObject1 = new Object[c.length + 1][2];
      Object[][] arrayOfObject2 = c;
      System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, arrayOfObject2.length);
      c = arrayOfObject1;
      j = arrayOfObject1.length - 1;
    }
    c[j] = { localb, paramk };
  }
  
  public final void b(List paramList)
  {
    b.s("addrs is empty", paramList.isEmpty() ^ true);
    a = Collections.unmodifiableList(new ArrayList(paramList));
  }
}

/* Location:
 * Qualified Name:     eb.k0.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */