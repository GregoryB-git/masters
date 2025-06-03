package p1;

import ec.i;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Set;

public final class e$e
  extends e.c
{
  public final e b;
  public final WeakReference<e.c> c;
  
  public e$e(e parame, m paramm)
  {
    super(a);
    b = parame;
    c = new WeakReference(paramm);
  }
  
  public final void a(Set<String> paramSet)
  {
    i.e(paramSet, "tables");
    e.c localc = (e.c)c.get();
    if (localc == null) {
      b.c(this);
    } else {
      localc.a(paramSet);
    }
  }
}

/* Location:
 * Qualified Name:     p1.e.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */