package gb;

import eb.n;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import x0.f;
import x6.b;

public final class u1
  implements Runnable
{
  public u1(r1 paramr1, f paramf, n paramn) {}
  
  public final void run()
  {
    Object localObject = c;
    y localy = s;
    Runnable localRunnable = a;
    Executor localExecutor = i;
    localObject = b;
    localy.getClass();
    b.y(localRunnable, "callback");
    b.y(localExecutor, "executor");
    b.y(localObject, "source");
    y.a locala = new y.a(localRunnable, localExecutor);
    if (b != localObject) {
      localExecutor.execute(localRunnable);
    } else {
      a.add(locala);
    }
  }
}

/* Location:
 * Qualified Name:     gb.u1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */