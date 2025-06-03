package l6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.a;
import g;
import java.util.Map;

public final class x0
  extends a1
{
  public final a b;
  
  public x0(int paramInt, a parama)
  {
    super(paramInt);
    if (parama != null)
    {
      b = parama;
      return;
    }
    throw new NullPointerException("Null methods are not runnable.");
  }
  
  public final void a(Status paramStatus)
  {
    try
    {
      b.setFailedResult(paramStatus);
      return;
    }
    catch (IllegalStateException paramStatus)
    {
      Log.w("ApiCallRunner", "Exception reporting failure", paramStatus);
    }
  }
  
  public final void b(RuntimeException paramRuntimeException)
  {
    paramRuntimeException = new Status(10, g.e(paramRuntimeException.getClass().getSimpleName(), ": ", paramRuntimeException.getLocalizedMessage()), null, null);
    try
    {
      b.setFailedResult(paramRuntimeException);
      return;
    }
    catch (IllegalStateException paramRuntimeException)
    {
      Log.w("ApiCallRunner", "Exception reporting failure", paramRuntimeException);
    }
  }
  
  public final void c(d0 paramd0)
  {
    try
    {
      b.run(b);
      return;
    }
    catch (RuntimeException paramd0)
    {
      b(paramd0);
    }
  }
  
  public final void d(u paramu, boolean paramBoolean)
  {
    a locala = b;
    a.put(locala, Boolean.valueOf(paramBoolean));
    locala.addStatusListener(new s(paramu, locala));
  }
}

/* Location:
 * Qualified Name:     l6.x0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */