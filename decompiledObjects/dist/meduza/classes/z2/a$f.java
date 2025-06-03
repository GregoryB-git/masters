package z2;

import s7.e;

public final class a$f<V>
  implements Runnable
{
  public final a<V> a;
  public final e<? extends V> b;
  
  public a$f(a<V> parama, e<? extends V> parame)
  {
    a = parama;
    b = parame;
  }
  
  public final void run()
  {
    if (a.a != this) {
      return;
    }
    Object localObject = a.e(b);
    if (a.f.b(a, this, localObject)) {
      a.b(a);
    }
  }
}

/* Location:
 * Qualified Name:     z2.a.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */