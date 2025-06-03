package A2;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class W
  extends L
{
  public c b;
  public final int c;
  
  public W(c paramc, int paramInt)
  {
    b = paramc;
    c = paramInt;
  }
  
  public final void F0(int paramInt, IBinder paramIBinder, a0 parama0)
  {
    c localc = b;
    n.j(localc, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
    n.i(parama0);
    c.c0(localc, parama0);
    W0(paramInt, paramIBinder, o);
  }
  
  public final void W0(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    n.j(b, "onPostInitComplete can be called only once per call to getRemoteService");
    b.N(paramInt, paramIBinder, paramBundle, c);
    b = null;
  }
  
  public final void q0(int paramInt, Bundle paramBundle)
  {
    Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
  }
}

/* Location:
 * Qualified Name:     A2.W
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */