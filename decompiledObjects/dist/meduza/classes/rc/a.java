package rc;

import java.util.concurrent.CancellationException;
import qc.f;

public final class a
  extends CancellationException
{
  public final transient f<?> a;
  
  public a(f<?> paramf)
  {
    super("Flow was aborted, no more elements needed");
    a = paramf;
  }
  
  public final Throwable fillInStackTrace()
  {
    setStackTrace(new StackTraceElement[0]);
    return this;
  }
}

/* Location:
 * Qualified Name:     rc.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */