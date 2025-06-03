package ma;

import f;
import java.util.ArrayDeque;
import java.util.Arrays;

public final class h1$b
{
  public final ArrayDeque<h> a = new ArrayDeque();
  
  public final void a(h paramh)
  {
    if (paramh.q())
    {
      int i = paramh.size();
      int j = Arrays.binarySearch(h1.q, i);
      i = j;
      if (j < 0) {
        i = -(j + 1) - 1;
      }
      j = h1.C(i + 1);
      if ((!a.isEmpty()) && (((h)a.peek()).size() < j))
      {
        i = h1.C(i);
        for (localObject = (h)a.pop(); (!a.isEmpty()) && (((h)a.peek()).size() < i); localObject = new h1((h)a.pop(), (h)localObject)) {}
        for (paramh = new h1((h)localObject, paramh); !a.isEmpty(); paramh = new h1((h)a.pop(), paramh))
        {
          i = d;
          j = Arrays.binarySearch(h1.q, i);
          i = j;
          if (j < 0) {
            i = -(j + 1) - 1;
          }
          i = h1.C(i + 1);
          if (((h)a.peek()).size() >= i) {
            break;
          }
        }
        a.push(paramh);
      }
      else
      {
        a.push(paramh);
      }
    }
    else
    {
      if (!(paramh instanceof h1)) {
        break label282;
      }
      paramh = (h1)paramh;
      a(e);
      a(f);
    }
    return;
    label282:
    Object localObject = f.l("Has a new type of ByteString been created? Found ");
    ((StringBuilder)localObject).append(paramh.getClass());
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
}

/* Location:
 * Qualified Name:     ma.h1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */