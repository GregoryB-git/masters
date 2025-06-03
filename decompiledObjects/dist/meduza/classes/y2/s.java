package y2;

import androidx.work.WorkerParameters.a;
import p2.r;
import p2.x;

public final class s
  implements Runnable
{
  public final r a;
  public final x b;
  public final WorkerParameters.a c;
  
  public s(r paramr, x paramx, WorkerParameters.a parama)
  {
    a = paramr;
    b = paramx;
    c = parama;
  }
  
  public final void run()
  {
    a.f(b, c);
  }
}

/* Location:
 * Qualified Name:     y2.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */