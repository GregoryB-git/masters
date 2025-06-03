package z2;

import V2.k;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import x2.d;

public final class Q
  extends F
{
  public final m b;
  public final k c;
  public final l d;
  
  public Q(int paramInt, m paramm, k paramk, l paraml)
  {
    super(paramInt);
    c = paramk;
    b = paramm;
    d = paraml;
    if ((paramInt == 2) && (paramm.c())) {
      throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
    }
  }
  
  public final void a(Status paramStatus)
  {
    c.d(d.a(paramStatus));
  }
  
  public final void b(Exception paramException)
  {
    c.d(paramException);
  }
  
  public final void c(x paramx)
  {
    try
    {
      b.b(paramx.t(), c);
      return;
    }
    catch (RuntimeException paramx) {}catch (RemoteException paramx)
    {
      break label38;
    }
    catch (DeadObjectException paramx) {}
    c.d(paramx);
    return;
    label38:
    a(T.e(paramx));
    return;
    throw paramx;
  }
  
  public final void d(o paramo, boolean paramBoolean)
  {
    paramo.b(c, paramBoolean);
  }
  
  public final boolean f(x paramx)
  {
    return b.c();
  }
  
  public final d[] g(x paramx)
  {
    return b.e();
  }
}

/* Location:
 * Qualified Name:     z2.Q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */