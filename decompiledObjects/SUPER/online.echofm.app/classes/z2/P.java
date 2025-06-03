package z2;

import V2.k;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import y2.b;

public abstract class P
  extends F
{
  public final k b;
  
  public P(int paramInt, k paramk)
  {
    super(paramInt);
    b = paramk;
  }
  
  public final void a(Status paramStatus)
  {
    b.d(new b(paramStatus));
  }
  
  public final void b(Exception paramException)
  {
    b.d(paramException);
  }
  
  public final void c(x paramx)
  {
    try
    {
      h(paramx);
      return;
    }
    catch (RuntimeException paramx)
    {
      b.d(paramx);
      return;
    }
    catch (RemoteException paramx)
    {
      a(T.e(paramx));
      return;
    }
    catch (DeadObjectException paramx)
    {
      a(T.e(paramx));
      throw paramx;
    }
  }
  
  public abstract void h(x paramx);
}

/* Location:
 * Qualified Name:     z2.P
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */