package sb;

import f;
import java.util.RandomAccess;

public final class d$d<E>
  extends d<E>
  implements RandomAccess
{
  public final d<E> a;
  public final int b;
  public int c;
  
  public d$d(d<? extends E> paramd, int paramInt1, int paramInt2)
  {
    a = paramd;
    b = paramInt1;
    d.a.a(paramInt1, paramInt2, paramd.a());
    c = (paramInt2 - paramInt1);
  }
  
  public final int a()
  {
    return c;
  }
  
  public final E get(int paramInt)
  {
    int i = c;
    if ((paramInt >= 0) && (paramInt < i)) {
      return (E)a.get(b + paramInt);
    }
    throw new IndexOutOfBoundsException(f.i("index: ", paramInt, ", size: ", i));
  }
}

/* Location:
 * Qualified Name:     sb.d.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */