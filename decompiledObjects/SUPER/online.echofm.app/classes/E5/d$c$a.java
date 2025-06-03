package E5;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class d$c$a
  implements d.b
{
  public final AtomicBoolean a = new AtomicBoolean(false);
  
  public d$c$a(d.c paramc) {}
  
  public void a(Object paramObject)
  {
    if ((!a.get()) && (d.c.b(b).get() == this)) {
      d.c(b.c).d(d.b(b.c), d.a(b.c).a(paramObject));
    }
  }
  
  public void b(String paramString1, String paramString2, Object paramObject)
  {
    if ((!a.get()) && (d.c.b(b).get() == this)) {
      d.c(b.c).d(d.b(b.c), d.a(b.c).d(paramString1, paramString2, paramObject));
    }
  }
  
  public void c()
  {
    if ((!a.getAndSet(true)) && (d.c.b(b).get() == this)) {
      d.c(b.c).d(d.b(b.c), null);
    }
  }
}

/* Location:
 * Qualified Name:     E5.d.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */