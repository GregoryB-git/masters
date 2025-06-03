package androidx.fragment.app;

import androidx.activity.result.c;
import d.a;
import java.util.concurrent.atomic.AtomicReference;
import w.b;

public class Fragment$g
  extends c
{
  public Fragment$g(Fragment paramFragment, AtomicReference paramAtomicReference, a parama) {}
  
  public void b(Object paramObject, b paramb)
  {
    c localc = (c)a.get();
    if (localc != null)
    {
      localc.b(paramObject, paramb);
      return;
    }
    throw new IllegalStateException("Operation cannot be started before fragment is in created state");
  }
  
  public void c()
  {
    c localc = (c)a.getAndSet(null);
    if (localc != null) {
      localc.c();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.Fragment.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */