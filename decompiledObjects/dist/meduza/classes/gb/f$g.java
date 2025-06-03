package gb;

import java.io.InputStream;
import java.util.ArrayDeque;

public class f$g
  implements n3.a
{
  public final Runnable a;
  public boolean b = false;
  
  public f$g(f paramf, Runnable paramRunnable)
  {
    a = paramRunnable;
  }
  
  public final InputStream next()
  {
    if (!b)
    {
      a.run();
      b = true;
    }
    return (InputStream)c.b.c.poll();
  }
}

/* Location:
 * Qualified Name:     gb.f.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */