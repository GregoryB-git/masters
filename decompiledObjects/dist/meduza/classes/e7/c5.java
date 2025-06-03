package e7;

import com.google.android.gms.measurement.internal.zzge;
import java.util.concurrent.atomic.AtomicReference;

public final class c5
  extends zzge
{
  public c5(AtomicReference paramAtomicReference) {}
  
  public final void E(f6 paramf6)
  {
    synchronized (a)
    {
      a.set(paramf6);
      a.notifyAll();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     e7.c5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */