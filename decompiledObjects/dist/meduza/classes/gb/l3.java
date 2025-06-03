package gb;

import java.util.concurrent.atomic.AtomicBoolean;
import m.e;

public final class l3
{
  public final e[] a;
  public final AtomicBoolean b = new AtomicBoolean(false);
  
  static
  {
    new l3(new e[0]);
  }
  
  public l3(e[] paramArrayOfe)
  {
    a = paramArrayOfe;
  }
  
  public final void a(long paramLong)
  {
    e[] arrayOfe = a;
    int i = arrayOfe.length;
    for (int j = 0; j < i; j++) {
      arrayOfe[j].j(paramLong);
    }
  }
}

/* Location:
 * Qualified Name:     gb.l3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */