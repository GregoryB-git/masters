package D0;

import android.view.Surface;
import t0.o;
import t0.p;

public class j
  extends o
{
  public final int r;
  public final boolean s;
  
  public j(Throwable paramThrowable, p paramp, Surface paramSurface)
  {
    super(paramThrowable, paramp);
    r = System.identityHashCode(paramSurface);
    boolean bool;
    if ((paramSurface != null) && (!paramSurface.isValid())) {
      bool = false;
    } else {
      bool = true;
    }
    s = bool;
  }
}

/* Location:
 * Qualified Name:     D0.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */