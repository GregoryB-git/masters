package E;

import V5.n;
import V5.n.a;
import V5.o;
import X5.d;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class e
  extends AtomicBoolean
  implements OutcomeReceiver
{
  public final d o;
  
  public e(d paramd)
  {
    super(false);
    o = paramd;
  }
  
  public void onError(Throwable paramThrowable)
  {
    Intrinsics.checkNotNullParameter(paramThrowable, "error");
    if (compareAndSet(false, true))
    {
      d locald = o;
      n.a locala = n.o;
      locald.resumeWith(n.a(o.a(paramThrowable)));
    }
  }
  
  public void onResult(Object paramObject)
  {
    Intrinsics.checkNotNullParameter(paramObject, "result");
    if (compareAndSet(false, true)) {
      o.resumeWith(n.a(paramObject));
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ContinuationOutcomeReceiver(outcomeReceived = ");
    localStringBuilder.append(get());
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     E.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */