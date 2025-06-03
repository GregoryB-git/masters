package l6;

import com.google.android.gms.tasks.TaskCompletionSource;
import j6.d;
import java.util.HashMap;

public final class z0
  extends u0
{
  public final h.a c;
  
  public z0(h.a parama, TaskCompletionSource paramTaskCompletionSource)
  {
    super(4, paramTaskCompletionSource);
    c = parama;
  }
  
  public final boolean f(d0 paramd0)
  {
    if ((n0)f.get(c) == null) {
      return false;
    }
    throw null;
  }
  
  public final d[] g(d0 paramd0)
  {
    if ((n0)f.get(c) == null) {
      return null;
    }
    throw null;
  }
  
  public final void h(d0 paramd0)
  {
    if ((n0)f.remove(c) == null)
    {
      b.trySetResult(Boolean.FALSE);
      return;
    }
    throw null;
  }
}

/* Location:
 * Qualified Name:     l6.z0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */