package R2;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.t0;

public final class l5
  extends f1
{
  public Handler c;
  public boolean d = true;
  public final t5 e = new t5(this);
  public final r5 f = new r5(this);
  public final q5 g = new q5(this);
  
  public l5(N2 paramN2)
  {
    super(paramN2);
  }
  
  private final void G()
  {
    n();
    if (c == null) {
      c = new t0(Looper.getMainLooper());
    }
  }
  
  public final boolean A()
  {
    return false;
  }
  
  public final void D(boolean paramBoolean)
  {
    n();
    d = paramBoolean;
  }
  
  public final boolean E(boolean paramBoolean1, boolean paramBoolean2, long paramLong)
  {
    return f.d(paramBoolean1, paramBoolean2, paramLong);
  }
  
  public final boolean F()
  {
    n();
    return d;
  }
}

/* Location:
 * Qualified Name:     R2.l5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */