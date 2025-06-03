package a0;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import nc.l;
import ub.e;

public final class g<R, E extends Throwable>
  extends AtomicBoolean
  implements OutcomeReceiver
{
  public final e<R> a;
  
  public g(l paraml)
  {
    super(false);
    a = paraml;
  }
  
  public final void onError(E paramE)
  {
    if (compareAndSet(false, true)) {
      a.resumeWith(rb.f.a(paramE));
    }
  }
  
  public final void onResult(R paramR)
  {
    if (compareAndSet(false, true)) {
      a.resumeWith(paramR);
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("ContinuationOutcomeReceiver(outcomeReceived = ");
    localStringBuilder.append(get());
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     a0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */