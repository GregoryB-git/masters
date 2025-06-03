package A2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import x2.b;

public final class Y
  extends K
{
  public final IBinder g;
  
  public Y(c paramc, int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    super(paramc, paramInt, paramBundle);
    g = paramIBinder;
  }
  
  public final void f(b paramb)
  {
    if (c.V(h) != null) {
      c.V(h).o(paramb);
    }
    h.L(paramb);
  }
  
  public final boolean g()
  {
    try
    {
      localObject1 = g;
      n.i(localObject1);
      localObject1 = ((IBinder)localObject1).getInterfaceDescriptor();
      if (h.E().equals(localObject1)) {
        break label87;
      }
      localObject2 = h.E();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("service descriptor mismatch: ");
      localStringBuilder.append((String)localObject2);
      localStringBuilder.append(" vs. ");
      localStringBuilder.append((String)localObject1);
      localObject1 = localStringBuilder.toString();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2;
        label87:
        String str = "service probably died";
      }
    }
    Log.w("GmsClient", (String)localObject1);
    return false;
    localObject1 = h.s(g);
    if ((localObject1 != null) && ((c.g0(h, 2, 4, (IInterface)localObject1)) || (c.g0(h, 3, 4, (IInterface)localObject1))))
    {
      c.Z(h, null);
      localObject2 = h.x();
      localObject1 = h;
      if (c.U((c)localObject1) != null) {
        c.U((c)localObject1).v((Bundle)localObject2);
      }
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     A2.Y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */