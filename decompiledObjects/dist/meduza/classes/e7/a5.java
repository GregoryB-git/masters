package e7;

import com.google.android.gms.measurement.internal.zzgd;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class a5
  extends zzgd
{
  public a5(AtomicReference paramAtomicReference) {}
  
  public final void zza(List<w5> paramList)
  {
    synchronized (a)
    {
      a.set(paramList);
      a.notifyAll();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     e7.a5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */