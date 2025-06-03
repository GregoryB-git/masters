package T3;

import c4.c;
import e4.e;
import java.io.EOFException;

public class q$e$d
  implements Runnable
{
  public q$e$d(q.e parame, e parame1) {}
  
  public void run()
  {
    if ((o.getCause() != null) && ((o.getCause() instanceof EOFException))) {
      q.c(p.b).b("WebSocket reached EOF.", new Object[0]);
    } else {
      q.c(p.b).a("WebSocket error.", o, new Object[0]);
    }
    q.g(p.b);
  }
}

/* Location:
 * Qualified Name:     T3.q.e.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */