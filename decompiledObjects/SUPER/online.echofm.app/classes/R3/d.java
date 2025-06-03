package R3;

import V3.A;
import V3.A.a;
import V3.A.b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

public class d
  implements A
{
  public final r4.a a;
  public final AtomicReference b;
  
  public d(r4.a parama)
  {
    a = parama;
    b = new AtomicReference();
    parama.a(new a(this));
  }
  
  public void a(boolean paramBoolean, A.a parama)
  {
    android.support.v4.media.a.a(b.get());
    parama.a(null);
  }
  
  public void b(ExecutorService paramExecutorService, A.b paramb)
  {
    a.a(new b(paramExecutorService, paramb));
  }
}

/* Location:
 * Qualified Name:     R3.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */